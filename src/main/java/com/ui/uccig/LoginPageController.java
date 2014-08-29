/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.rav.insurance.useroperations.webservice.Exception;
import com.rav.insurance.useroperations.webservice.UserOperationsService_Service;
import com.rav.insurance.useroperations.webservice.contracts.InsuranceLoginRequest;
import com.rav.insurance.useroperations.webservice.contracts.InsuranceLoginResponse;
import com.ui.animation.InvokeAnimation;
import com.ui.binding.LoginSceneBinding;
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
import javafx.scene.control.Dialogs;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class LoginPageController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;

    @FXML
    TextField username;

    @FXML
    TextField password;
    @FXML
    ImageView bg; //why this
    
    private final Stage stage = new Stage();

    private LoginSceneBinding binding;

     /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binding = new LoginSceneBinding();
        Bindings.bindBidirectional(username.textProperty(), binding.usernameProperty());
        Bindings.bindBidirectional(password.textProperty(), binding.passwordProperty());
        Platform.runLater(new Runnable() {
            public void run() {
                bg.requestFocus();
            }
        });
    }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    @FXML
    public void submitAction() {
        if (!CommonValidations.isValidEmailAddress(binding.getUsername())) {
            InvokeAnimation.attentionSeekerWobble(username);
            username.setPromptText("Username does not exist");
        } else if (CommonValidations.isValidEmailAddress(binding.getPassword())) {
            InvokeAnimation.attentionSeekerWobble(password);
            password.setPromptText("Password is incorrect");
        } else {
            Group root = new Group();
           // root.getChildren().addAll(new ImageView("http://www.codeproject.com/images/animated.gif"));
            root.autosize();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
            Task task = new Task<Void>() {
                @Override
                public Void call() {
                    UserOperationsService_Service port=new UserOperationsService_Service();
                    InsuranceLoginRequest req=new InsuranceLoginRequest(); 
                    req.setUserId(binding.getUsername());
                    req.setPassword(binding.getPassword());
                    try {
                        InsuranceLoginResponse response= port.getUserOperationsPort().loginUser(req);
                       
                        if(response.getStatus().equals("SUCCESS"))
                        {
                            System.out.println(response.getUserFullName());
                        }                        
                    } catch (Exception ex) {
                        Logger.getLogger(LoginPageController.class.getName()).log(Level.SEVERE, null, ex);
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

    @FXML
    public void moveToREgistration() {
        this.screenPage.setScreen("registration");
    }
    public void moveToForgotPassword() {
        this.screenPage.setScreen("ForgotPassword");
    }

}
