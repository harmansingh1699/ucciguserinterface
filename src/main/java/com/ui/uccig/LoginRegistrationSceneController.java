/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.rav.insurance.useroperations.webservice.Exception;
import com.rav.insurance.useroperations.webservice.UserOperationsService_Service;
import com.rav.insurance.useroperations.webservice.contracts.CommonResponseAttributes;
import com.rav.insurance.useroperations.webservice.contracts.InsuranceForgotCredentialRequest;
import com.rav.insurance.useroperations.webservice.contracts.InsuranceLoginRequest;
import com.rav.insurance.useroperations.webservice.contracts.InsuranceLoginResponse;
import com.rav.insurance.useroperations.webservice.contracts.InsuranceRegistrationRequest;
import com.rav.insurance.useroperations.webservice.contracts.InsuranceUpdateCredentialRequest;
import com.ui.animation.InvokeAnimation;
import com.ui.binding.ForgotPasswordBinding;
import com.ui.binding.LoginSceneBinding;
import com.ui.binding.RegistrationPageBinding;
import com.ui.util.CommonValidations;
import harrun.AlertDialog;
import java.net.URL;
import java.util.Calendar;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class LoginRegistrationSceneController implements Initializable, IScreenController {

    private Stage stage = new Stage();
    private ScreenNavigator screenPage;

    @FXML
    TextField loginusername;

    @FXML
    private PasswordField loginpassword;

    @FXML
    ImageView bg;

    @FXML
    private TextField name;

    @FXML
    private TextField pusername;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField rpassword;

    @FXML
    private TextField email;

    @FXML
    private TextField forgotPasswordEmailAddressField;

    @FXML
    private TextField forgotPasswordPassCodeField;

    @FXML
    private TextField forgotPasswordPasswordField;

    @FXML
    private TextField forgotPasswordRePasswordField;

    @FXML
    private Pane registrationPane;

    @FXML
    private Pane resetPasswordPane;

    @FXML
    private Pane forgotPasswordPane;

    private LoginSceneBinding binding;
    private RegistrationPageBinding binding1;
    private ForgotPasswordBinding binding2;

    /**
     * Initializes the controller class.
     *
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            Group root = new Group();
            ImageView imageView = new ImageView(new Image("http://www.justjeweller.com/images/animation.gif"));
            root.getChildren().add(imageView);
            root.autosize();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Please Wait");
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.centerOnScreen();
            stage.setFocused(true);
        binding = new LoginSceneBinding();
        binding1 = new RegistrationPageBinding();
        binding2 = new ForgotPasswordBinding();
        resetPasswordPane.setVisible(false);
        forgotPasswordPane.setVisible(false);
        registrationPane.setVisible(true);
        Bindings.bindBidirectional(loginusername.textProperty(), binding.usernameProperty());
        Bindings.bindBidirectional(loginpassword.textProperty(), binding.passwordProperty());
        Bindings.bindBidirectional(pusername.textProperty(), binding1.usernameProperty());
        Bindings.bindBidirectional(password.textProperty(), binding1.passwordProperty());
        Bindings.bindBidirectional(rpassword.textProperty(), binding1.rpasswordProperty());
        Bindings.bindBidirectional(email.textProperty(), binding1.emailProperty());
        Bindings.bindBidirectional(name.textProperty(), binding1.nameProperty());
        Bindings.bindBidirectional(forgotPasswordEmailAddressField.textProperty(), binding2.forgotPasswordEmailAddressFieldProperty());
        Bindings.bindBidirectional(forgotPasswordPassCodeField.textProperty(), binding2.forgotPasswordPassCodeFieldProperty());
        Bindings.bindBidirectional(forgotPasswordPasswordField.textProperty(), binding2.forgotPasswordPasswordFieldProperty());
        Bindings.bindBidirectional(forgotPasswordRePasswordField.textProperty(), binding2.forgotPasswordRePasswordFieldProperty());
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
        if (CommonValidations.isStringEmpty(binding.getUsername().trim())) {
            InvokeAnimation.attentionSeekerWobble(loginusername);
            loginusername.setPromptText("Enter username");
        } else if (CommonValidations.isStringEmpty(binding.getPassword().trim())) {
            InvokeAnimation.attentionSeekerWobble(loginpassword);
            loginpassword.setPromptText("Enter password");
        } else {
            stage.show();
            Task task = new Task<Void>() {
                @Override
                public Void call() {
                    UserOperationsService_Service port = new UserOperationsService_Service();
                    InsuranceLoginRequest req = new InsuranceLoginRequest();
                    req.setUserId(binding.getUsername().trim());
                    req.setPassword(binding.getPassword().trim());
                    try {
                        InsuranceLoginResponse response = port.getUserOperationsPort().loginUser(req);
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            System.out.println(response.getRole());
                            stopLoading();
                            System.out.println("1");
                            if (response.getRole().equals("MARKETER") || response.getRole().equals("MANAGER")) {
                                  System.out.println(binding.getUsername());
                                ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setLoggedinMarketerId(binding.getUsername());
                                ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setReceivedname(response.getUserFullName());
                                ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setReceivedemailaddress(response.getUserEmailAddress());
                                   System.out.println("Hello");
                                Calendar c = Calendar.getInstance();
                                c.setTimeInMillis(response.getCurrentDate().getMillisecond());
                                ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).setDate(c.getTime());
                                System.out.println("Hello1");
                                screenPage.setScreen("OtherScreen");
                                System.out.println("Hello2");
                            } else {
                                System.out.println("2");
                                ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).setProducerid(binding.getUsername());
                                ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).setReceivedemailaddress(response.getUserEmailAddress());
                                ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).setReceivedname(response.getUserFullName());
                                ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).setBranch(response.getBranch());
                                Calendar c = Calendar.getInstance();
                                c.setTimeInMillis(response.getCurrentDate().getMillisecond());
                                ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).setDate(c.getTime());
                                screenPage.setScreen("NextScreen");
                            }
                            System.out.println(response.getUserFullName());
                        } else {
                            stopLoading();
                            errors(response.getErrorMessage());
                        }
                    } catch (Exception ex) {
                        stopLoading();
                            errors(ex.getMessage());
                        Logger.getLogger(LoginRegistrationSceneController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return null;
                }

            };
            new Thread(task).start();
        }
    }

    @FXML
    public void submitAction1() {
        String username=binding1.getUsername();
        boolean hasUppercase = !username.equals(username.toLowerCase());
        if(hasUppercase){
            InvokeAnimation.attentionSeekerWobble(pusername);
            pusername.setText("");
            pusername.setPromptText("Only lowercase letters");
        }else if (CommonValidations.isStringEmpty(binding1.getUsername())) {
            InvokeAnimation.attentionSeekerWobble(pusername);
            pusername.setPromptText("Prefered username field cannot be empty");
        } else if (CommonValidations.isStringEmpty(binding1.getPassword())) {
            InvokeAnimation.attentionSeekerWobble(password);
            password.setPromptText("Password field cannot be empty");
        } else if (CommonValidations.isStringEmpty(binding1.getRPassword())) {
            InvokeAnimation.attentionSeekerWobble(rpassword);
            rpassword.setPromptText("Re-Password field cannot be empty");
        } else if (!binding1.getRPassword().equals(binding1.getPassword())) {
            InvokeAnimation.attentionSeekerWobble(rpassword);
            password.setText("");
            rpassword.setText("");
            password.setPromptText("Password does not match");
            rpassword.setPromptText("Password does not match");  
        } else if (!CommonValidations.isValidEmailAddress(binding1.getEmailAddress())) {
            InvokeAnimation.attentionSeekerWobble(email);
            email.setPromptText("Please enter valid email address");
        } else {
            stage.show();
            Task task = new Task<Void>() {
                @Override
                public Void call() {
                    UserOperationsService_Service port = new UserOperationsService_Service();
                    InsuranceRegistrationRequest req1 = new InsuranceRegistrationRequest();
                    req1.setUserId(binding1.getUsername().trim());
                    req1.setPassword(binding1.getPassword().trim());
                    req1.setEmailAddress(binding1.getEmailAddress().trim());
                    req1.setFullName(binding1.getname().trim());
                    try {
                        CommonResponseAttributes response = port.getUserOperationsPort().registerUser(req1);
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            stopLoading();
                            successMessage("You are successfully registered. Kindly login");
                            name.setText("");
                            password.setText("");
                            pusername.setText("");
                            rpassword.setText("");
                            email.setText("");
                            loginusername.setText("");
                            loginpassword.setText("");
                            InvokeAnimation.attentionSeekerWobble(loginusername);
                            InvokeAnimation.attentionSeekerWobble(loginpassword);
                            
                        } else {
                            stopLoading();
                            errors(response.getErrorMessage());
                        }
                    } catch (com.rav.insurance.useroperations.webservice.Exception ex) {
                        stopLoading();
                        errors(ex.getMessage());
                        Logger.getLogger(LoginRegistrationSceneController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return null;
                }

            };
            new Thread(task).start();
        }
    }

    public void submitAction2() {
        resetPasswordPane.setVisible(false);
        forgotPasswordPane.setVisible(true);
        registrationPane.setVisible(false);
    }

    public void submitAction3() {
        if (!CommonValidations.isValidEmailAddress(binding2.getForgotPasswordEmailAddressField())) {
            InvokeAnimation.attentionSeekerWobble(forgotPasswordEmailAddressField);
            forgotPasswordEmailAddressField.setPromptText("Please enter Email Address");
        } else {
            
            Task task = new Task<Void>() {
                @Override
                public Void call() {

                    UserOperationsService_Service port = new UserOperationsService_Service();

                    InsuranceForgotCredentialRequest req = new InsuranceForgotCredentialRequest();

                    req.setEmailAddress(binding2.getForgotPasswordEmailAddressField());

                    try {
                        CommonResponseAttributes response = port.getUserOperationsPort().forgotPassword(req);

                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            resetPasswordPane.setVisible(true);
                            forgotPasswordPane.setVisible(false);
                            registrationPane.setVisible(false);
                        }
                        else{ errors(response.getErrorMessage());
                        }
                    } catch (Exception ex) {
                        errors(ex.getMessage());
                        Logger.getLogger(LoginRegistrationSceneController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    return null;
                }

            };
            new Thread(task).start();
        }
    }

    public void submitAction4() {
        if (CommonValidations.isStringEmpty(binding2.getforgotPasswordPassCodeField())) {
            InvokeAnimation.attentionSeekerWobble(forgotPasswordPassCodeField);
            forgotPasswordPassCodeField.setPromptText("Please enter secret code received in email");
        } else if (CommonValidations.isStringEmpty(binding2.getforgotPasswordPasswordField())) {
            InvokeAnimation.attentionSeekerWobble(forgotPasswordPasswordField);
            forgotPasswordPasswordField.setPromptText("You can't leave password field empty");
        } else if (CommonValidations.isStringEmpty(binding2.getforgotPasswordRePasswordField())) {
            InvokeAnimation.attentionSeekerWobble(forgotPasswordRePasswordField);
            forgotPasswordRePasswordField.setPromptText("You can't leave Re-enter password field empty");
        } else if (!binding2.getforgotPasswordPasswordField().equals(binding2.getforgotPasswordRePasswordField())) {
            InvokeAnimation.attentionSeekerWobble(forgotPasswordRePasswordField);
            forgotPasswordRePasswordField.setPromptText("Password does not match");
        } else {
            stage.show();
            Task task = new Task<Void>() {
                @Override
                public Void call() {
                    UserOperationsService_Service port = new UserOperationsService_Service();

                    InsuranceUpdateCredentialRequest req = new InsuranceUpdateCredentialRequest();

                    req.setNewPassword(binding2.getforgotPasswordPasswordField());

                    req.setPassword(binding2.getforgotPasswordRePasswordField());

                    req.setCode(binding2.getforgotPasswordPassCodeField());

                    try {

                        CommonResponseAttributes response = port.getUserOperationsPort().updatePassword(req);

                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            stopLoading();
                            successMessage("Password has been updated. Please login with the new password");
                            InvokeAnimation.attentionSeekerWobble(loginusername);
                            resetPasswordPane.setVisible(false);
                            forgotPasswordPane.setVisible(false);
                            registrationPane.setVisible(true);
                        } else {
                            stopLoading();
                            errors(response.getErrorMessage());
                        }

                    } catch (Exception ex) {
                        stopLoading();
                        errors(ex.getMessage());
                        Logger.getLogger(LoginRegistrationSceneController.class.getName()).log(Level.SEVERE, null, ex);
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
               // Dialogs.showInformationDialog(null, message, "Success", "Success");
new AlertDialog((Stage) loginusername.getParent().getScene().getWindow(), message, AlertDialog.ICON_INFO).showAndWait();
            }
        });
    }

    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
new AlertDialog((Stage) loginusername.getParent().getScene().getWindow(), message, AlertDialog.ICON_ERROR).showAndWait();               
// Dialogs.showErrorDialog(null, message, "Oops!!", "Error");
                stopLoading();
            }
        });
    }

    public void stopLoading() {
        Platform.runLater(new Runnable() {
            public void run() {
                if (stage != null) {
                    stage.hide();
                }
            }
        });
    }

}
