/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.uccig;


import com.rav.insurance.useroperations.webservice.Exception;
import com.rav.insurance.useroperations.webservice.UserOperationsService_Service;
import com.rav.insurance.useroperations.webservice.contracts.CommonResponseAttributes;
import com.rav.insurance.useroperations.webservice.contracts.InsuranceRegistrationRequest;
import com.ui.animation.InvokeAnimation;
import com.ui.binding.RegistrationPageBinding;
import com.ui.util.CommonValidations;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.Dialogs;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author harsimransingh
 */
public class RegistrationPageController implements Initializable, IScreenController {
    private ScreenNavigator screenPage;
    @FXML
    private TextField pusername;
    @FXML
    private PasswordField password;
    @FXML
    private PasswordField rpassword;
    @FXML
    private TextField email;
    @FXML
    private TextField firstname;
    @FXML
    private TextField lastname;
    @FXML
    private ChoiceBox<String> role;
    @FXML
    private ChoiceBox<String> branch;
    @FXML
    ImageView bg;
    
    
    private final Stage stage = new Stage();
    
    private RegistrationPageBinding binding;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binding = new RegistrationPageBinding();
        Bindings.bindBidirectional(pusername.textProperty(), binding.usernameProperty());
        Bindings.bindBidirectional(password.textProperty(), binding.passwordProperty());
        Bindings.bindBidirectional(rpassword.textProperty(), binding.rpasswordProperty());
        Bindings.bindBidirectional(email.textProperty(), binding.emailProperty());
        Bindings.bindBidirectional(firstname.textProperty(), binding.nameProperty());
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                bg.requestFocus();
            }
        });
        // TODO
    }    

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }
    @FXML
    public void submitAction() {
        if (!CommonValidations.isValidEmailAddress(binding.getUsername())) {
            InvokeAnimation.attentionSeekerWobble(pusername);
            pusername.setPromptText("Sorry! This username is already taken");
        } else if (CommonValidations.isValidEmailAddress(binding.getPassword())) {
            InvokeAnimation.attentionSeekerWobble(password);
            password.setPromptText("Password is incorrect");
        } else {
            Group root = new Group();
          //  root.getChildren().addAll(new ImageView("http://www.codeproject.com/images/animated.gif"));
            root.autosize();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
            Task task = new Task<Void>() {
                @Override
                public Void call() throws Exception {
                    UserOperationsService_Service port=new UserOperationsService_Service();
                    InsuranceRegistrationRequest req=new InsuranceRegistrationRequest(); 
                    
                    req.setUserId(binding.getUsername());
                    req.setPassword(binding.getPassword());
                    req.setEmailAddress(binding.getEmailAddress());
                  
                    req.setFullName(binding.getname());
                    try {
                        CommonResponseAttributes response= port.getUserOperationsPort().registerUser(req);  
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            successMessage("You are successfully registered, Kindly login");
                            screenPage.setScreen("login");
                        } 
                        else {
                            errors(response.getErrorMessage());
                    } 
                    }
                    catch (com.rav.insurance.useroperations.webservice.Exception ex) {
                        Logger.getLogger(RegistrationPageController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   return null;
                }

            };
            new Thread(task).start();
        }
    }

    public void successMessage(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                stage.hide();
                Dialogs.showInformationDialog(null, message, "Success", "Success");
            }
        });
    }
    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                stage.hide();
                Dialogs.showErrorDialog(null, message, "Oops!!", "Error");
            }
        });
    }
}
    

