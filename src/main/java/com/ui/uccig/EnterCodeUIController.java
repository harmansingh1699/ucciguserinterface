/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import antlr.CommonAST;
import com.calendar.DatePicker;
import com.rav.insurance.insuranceformoperations.webservice.InsuranceOperationsService_Service;
import com.rav.insurance.insuranceformoperations.webservice.contracts.AbstractFormInfo;
import com.rav.insurance.insuranceformoperations.webservice.contracts.AssignMarketerRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CloseFormRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CloseFormResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CommonResponseAttributes;
import com.rav.insurance.insuranceformoperations.webservice.contracts.FormMailToUnderWriterRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetCloseFormNQuoteDetailsResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetCloseFormNQuoteDetailsResponse2;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormListRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormListResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.MailInfo;
import com.rav.insurance.insuranceformoperations.webservice.contracts.PostFormMailRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.QuoteDetailsRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchMailRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchMailResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchMailResponse2;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchQuotesRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchQuotesResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchQuotesResponse2;
import com.rav.insurance.insuranceformoperations.webservice.contracts.UploadProposalBinderRequest;
import com.ui.animation.InvokeAnimation;
import com.ui.binding.DelayMailSendingBinding;
import com.ui.util.WriteByteArray;
import com.ui.binding.FormEntry4Binding;
import com.ui.binding.MailSendingBinding;
import com.ui.binding.SearchArchivebinding;
import harrun.AlertDialog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import ravrun.Rav1;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class EnterCodeUIController implements Initializable, IScreenController {
    
    private Stage stage = new Stage();
    private ScreenNavigator screenPage;
    List<AbstractFormInfo> abstractFormInfoList = new ArrayList<AbstractFormInfo>();
    private GetInsuranceFormResponse form;

    @FXML
    private Pane searcharchive2;

    @FXML
    private Pane proposalbinder;

    @FXML
    private Pane searcharchive;

    @FXML
    private Pane fullScreenPane;

    @FXML
    private Pane sendmailPane;
    
     @FXML
    private Pane marketinglogpane;

    @FXML
    private Pane closeapplicationpane;

    @FXML
    private GridPane gridpane;

    @FXML
    private TextField searchproducerid;

    @FXML
    private TextField searchmarketerid;

    @FXML
    private TextField searchapplicationid;

    @FXML
    private TextField searchbusinessname;

    @FXML
    private RadioButton searchwithusyes;

    @FXML
    private RadioButton searchwithusno;
    
    @FXML
    private CheckBox mail1;

    @FXML
    private CheckBox mail2;
    
    @FXML
    private RadioButton searchdate1;

    @FXML
    private RadioButton searchdate2;

    @FXML
    private RadioButton searchdate3;

    @FXML
    private RadioButton searchdate4;
    
    @FXML
    private TextField companyname1;
    @FXML
    private TextField companyname2;
    @FXML
    private TextField companyname3;
    @FXML
    private TextField companyname4;
    @FXML
    private TextField companyname5;
    @FXML
    private TextField companyname6;
    @FXML
    private TextField companyname7;
    @FXML
    private TextField companyname8;
    @FXML
    private TextField companyname9;
    @FXML
    private TextField companyname10;
    
    @FXML
    private TextField quote1;
    @FXML
    private TextField quote2;
    @FXML
    private TextField quote3;
    @FXML
    private TextField quote4;
    @FXML
    private TextField quote5;
    @FXML
    private TextField quote6;
    @FXML
    private TextField quote7;
    @FXML
    private TextField quote8;
    @FXML
    private TextField quote9;
    @FXML
    private TextField quote10;
    @FXML
    private TextField comment1;
    @FXML
    private TextField comment2;
    @FXML
    private TextField comment3;
    @FXML
    private TextField comment4;
    @FXML
    private TextField comment5;
    @FXML
    private TextField comment6;
    @FXML
    private TextField comment7;
    @FXML
    private TextField comment8;
    @FXML
    private TextField comment9;
    @FXML
    private TextField comment10;
    
    @FXML
    private TextField logsdate;
    
    @FXML
    private TextField logscompanyname;
    
    @FXML
    private TextField logsmarketerid;

    
    @FXML
    private Label welcomeName;
    
    
    
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label l3;
    @FXML
    private Label l5;
    @FXML
    private Label l6;
    @FXML
    private Label l7;
    @FXML
    private Label l9;
    @FXML
    private Label l10;
    @FXML
    private Label l11;
    @FXML
    private Label l13;
    @FXML
    private Label l14;
    @FXML
    private Label l15;
    @FXML
    private Label l17;
    @FXML
    private Label l18;
    @FXML
    private Label l19;
    @FXML
    private Label l21;
    @FXML
    private Label l22;
    @FXML
    private Label l23;
    @FXML
    private Label l25;
    @FXML
    private Label l26;
    @FXML
    private Label l27;
    @FXML
    private Label l29;
    @FXML
    private Label l30;
    @FXML
    private Label l31;
    @FXML
    private Label l33;
    @FXML
    private Label l34;
    @FXML
    private Label l35;
    @FXML
    private Label l37;
    @FXML
    private Label l38;
    @FXML
    private Label l39;
    @FXML
    private Label l41;
    @FXML
    private Label l42;
    @FXML
    private Label l43;
    @FXML
    private Label l45;
    @FXML
    private Label l46;
    @FXML
    private Label l47;
    @FXML
    private Label l49;
    @FXML
    private Label l50;
    @FXML
    private Label l51;
    @FXML
    private Label l53;
    @FXML
    private Label l54;
    @FXML
    private Label l55; 
    @FXML
    private Label l57;
    @FXML
    private Label l58;
    @FXML
    private Label l59;
    @FXML
    private Label l61;
    @FXML
    private Label l62;
    @FXML
    private Label l63;
    @FXML
    private Label l65;
    @FXML
    private Label l66;
    @FXML
    private Label l67;
    @FXML
    private Label l69;
    @FXML
    private Label l70;
    @FXML
    private Label l71;
    @FXML
    private Label l73;
    @FXML
    private Label l74;
    @FXML
    private Label l75;
    @FXML
    private Label l77;
    @FXML
    private Label l79;
    @FXML
    private Label l78;
    
    
    private List<MailInfo> mailList;

    @FXML
    private Label title;
    @FXML
    private Label pname;
    @FXML
    private Label mname;
    @FXML
    private Label type;
    @FXML
    private Label category;
    @FXML
    private Label submissiondate;
    @FXML
    private Label severity;
    @FXML
    private Label branch;
    @FXML
    private Label withus;
    
    
    
    @FXML
    private TextField closecompany;
    @FXML
    private TextField closequote;
    
    @FXML
    private TextField email1;
    @FXML
    private TextField email2;
    @FXML
    private TextField email3;
    @FXML
    private TextField email4;
    @FXML
    private TextArea emailbody;
    @FXML
    private TextArea delayemailbody;
    
    @FXML
    private TextField delayedemail1;
    @FXML
    private TextField delayedemail2;
    @FXML
    private TextField delayedemail3;
    @FXML
    private TextField delayedemail4;
    @FXML 
    private GridPane gridpane1;
    
    

    private SearchArchivebinding binding;
    private FormEntry4Binding binding1;
    private MailSendingBinding binding2;
    private DelayMailSendingBinding binding3;
    private int offset;
    DatePicker datePicker = new DatePicker();

    private String marketerId;
    private String receivedname;

    public String getReceivedemailaddress() {
        return receivedemailaddress;
    }

    public void setReceivedemailaddress(String receivedemailaddress) {
        this.receivedemailaddress = receivedemailaddress;
    }
    private String receivedemailaddress;
    public String getReceivedname() {
        return receivedname;
    }

    public void setReceivedname(String receivedname) {
        welcomeName.setText(receivedname);
       // welcomeName.setText(receivedname);
    }
    

    private String formId;

    public void setApplicationId(String applicationId, String BusinessName) {
        title.setText(applicationId+", "+BusinessName);
    }
    
    public void setSeverity(String severity) {
        this.severity.setText(severity);
    }
    
    public void setProducerid(String producerid) {
        pname.setText(producerid);
    }
    
    public void setMarketeridfromform(String marketerid) {
        mname.setText(marketerid);
    }
    public void setInsuranceType(String insuranceType) {
        type.setText(insuranceType);
    }
    public void setCategory(String insurancecategory) {
           category.setText(insurancecategory);
    }
    public void setCreationDate(String date) {
           submissiondate.setText(date);
    }
    public void setBranch(String insurancebranch) {
           branch.setText(insurancebranch);
    }
    public void setWithUs(String withUs) {
           withus.setText(withUs);
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }
    
    @FXML
    public void hyderlinkAction1() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(0).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(0).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction2() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(1).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(1).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction3() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(2).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(2).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction4() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(3).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(3).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction5() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(4).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(4).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction6() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(5).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(5).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction7() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(6).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(6).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction8() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(4).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(7).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction9() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(8).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(8).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction10() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(9).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(9).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction11() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(10).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(10).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void hyderlinkAction12() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(11).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(11).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction13() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(12).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(12).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction14() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(13).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(13).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction15() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(14).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(14).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction16() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(15).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(15).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction17() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(16).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(16).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction18() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(17).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(17).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction19() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(18).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(18).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction20() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(19).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(19).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void hyderlinkAction21() {
        try {
            stage = new Stage();
            FlowPane root = new FlowPane();
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailscene.fxml"));
            Parent loadScreen = (Parent) myLoader.load();
            System.out.println("Body is " + mailList.get(20).getMailBody());
            ((mailSceneController) myLoader.getController()).getWebView().getEngine().loadContent(mailList.get(20).getMailBody());
            root.getChildren().addAll(loadScreen);
            root.autosize();
            Scene scene = new Scene(root);
            //stage.initStyle(StageStyle.UNDECORATED);
            stage.sizeToScene();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.setTitle("UCCIG");
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EnterCodeUIController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Initializes the controller class.
     *
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ToggleGroup tg = new ToggleGroup();
         searchdate1.setToggleGroup(tg);
         searchdate2.setToggleGroup(tg);
         searchdate3.setToggleGroup(tg);
         searchdate4.setToggleGroup(tg);
        ChangeListener<Toggle> ls = new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t = (RadioButton) val.getToggleGroup().getSelectedToggle();
                binding.setsearchdate1(t.getText());
            }
        };
        tg.selectedToggleProperty().addListener(ls);
        
        
        ToggleGroup tg1 = new ToggleGroup();
         searchwithusyes.setToggleGroup(tg1);
         searchwithusno.setToggleGroup(tg1);
        
        ChangeListener<Toggle> ls1 = new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t = (RadioButton) val.getToggleGroup().getSelectedToggle();
                binding.setsearchwithusyes(t.getText());
            }
        };
        tg1.selectedToggleProperty().addListener(ls1);
        
        datePicker.localeProperty().set(Locale.ENGLISH);
        datePicker.setLayoutX(0.0);
        datePicker.setLayoutY(81.0);
        datePicker.setPrefWidth(200.0);
        datePicker.setPrefHeight(26.0);
          datePicker.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        datePicker.setPromptText("yyyy-mm-dd");
        datePicker.setLocale(Locale.ENGLISH);
        datePicker.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker.getCalendarView().setShowWeeks(false);
        datePicker.setDateFormat(new SimpleDateFormat("YYYY-MM-DD"));
        
        gridpane1.add(datePicker, 5,0);
        binding = new SearchArchivebinding();
        binding1=new FormEntry4Binding();
        Bindings.bindBidirectional(searchproducerid.textProperty(), binding.searchproduceridProperty());
        Bindings.bindBidirectional(searchmarketerid.textProperty(), binding.searchmarketeridProperty());
        Bindings.bindBidirectional(searchbusinessname.textProperty(), binding.searchbusinessnameProperty());
        Bindings.bindBidirectional(searchapplicationid.textProperty(), binding.searchapplicationidProperty());
         Bindings.bindBidirectional(companyname1.textProperty(), binding1.companyName1Property());
         Bindings.bindBidirectional(companyname2.textProperty(), binding1.companyName2Property());
         Bindings.bindBidirectional(companyname3.textProperty(), binding1.companyName3Property());
         Bindings.bindBidirectional(companyname4.textProperty(), binding1.companyName4Property());
         Bindings.bindBidirectional(companyname5.textProperty(), binding1.companyName5Property());
         Bindings.bindBidirectional(companyname6.textProperty(), binding1.companyName6Property());
         Bindings.bindBidirectional(companyname7.textProperty(), binding1.companyName7Property());
         Bindings.bindBidirectional(companyname8.textProperty(), binding1.companyName8Property());
         Bindings.bindBidirectional(companyname9.textProperty(), binding1.companyName9Property());
         Bindings.bindBidirectional(companyname10.textProperty(), binding1.companyName10Property());
         Bindings.bindBidirectional(quote1.textProperty(), binding1.quote1Property());
         Bindings.bindBidirectional(quote2.textProperty(), binding1.quote2Property());
         Bindings.bindBidirectional(quote3.textProperty(), binding1.quote3Property());
         Bindings.bindBidirectional(quote4.textProperty(), binding1.quote4Property());
         Bindings.bindBidirectional(quote5.textProperty(), binding1.quote5Property());
         Bindings.bindBidirectional(quote6.textProperty(), binding1.quote6Property());
         Bindings.bindBidirectional(quote7.textProperty(), binding1.quote7Property());
         Bindings.bindBidirectional(quote8.textProperty(), binding1.quote8Property());
         Bindings.bindBidirectional(quote9.textProperty(), binding1.quote9Property());
         Bindings.bindBidirectional(quote10.textProperty(), binding1.quote10Property());
         Bindings.bindBidirectional(comment1.textProperty(), binding1.comment1Property());
         Bindings.bindBidirectional(comment2.textProperty(), binding1.comment2Property());
         Bindings.bindBidirectional(comment3.textProperty(), binding1.comment3Property());
         Bindings.bindBidirectional(comment4.textProperty(), binding1.comment4Property());
         Bindings.bindBidirectional(comment5.textProperty(), binding1.comment5Property());
         Bindings.bindBidirectional(comment6.textProperty(), binding1.comment6Property());
         Bindings.bindBidirectional(comment7.textProperty(), binding1.comment7Property());
         Bindings.bindBidirectional(comment8.textProperty(), binding1.comment8Property());
         Bindings.bindBidirectional(comment9.textProperty(), binding1.comment9Property());
         Bindings.bindBidirectional(comment10.textProperty(), binding1.comment10Property());
         Bindings.bindBidirectional(logsmarketerid.textProperty(), binding1.logsMarketerIdProperty());
         Bindings.bindBidirectional(logscompanyname.textProperty(), binding1.logsCompanyNameProperty());
         Bindings.bindBidirectional(logsdate.textProperty(), binding1.logsDateProperty());
         Bindings.bindBidirectional(closecompany.textProperty(), binding1.closeCompanyProperty());
         Bindings.bindBidirectional(closequote.textProperty(), binding1.closeQuoteProperty());
         Bindings.bindBidirectional(email1.textProperty(), binding1.email1Property());
         Bindings.bindBidirectional(email2.textProperty(), binding1.email2Property());
         Bindings.bindBidirectional(email3.textProperty(), binding1.email3Property());
         Bindings.bindBidirectional(email4.textProperty(), binding1.email4Property());
         //Bindings.bindBidirectional(emailbody.textProperty(), binding2.mailbodyProperty());
         //Bindings.bindBidirectional(delayemailbody.textProperty(), binding3.mailbodyProperty());
         welcomeName.setText(receivedname);
   
         
         ChangeListener<Boolean> listener = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail1.isSelected()) {
                    binding1.setmail1("quotes@abexinsurance.com");
                }
            }
        };
        mail1.selectedProperty().addListener(listener);
        
         ChangeListener<Boolean> listener1 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail2.isSelected()) {
                    binding1.setmail2("quotes@amfredericks.com");
                }
            }
        };
        mail2.selectedProperty().addListener(listener1);
    }
    
   

    public EnterCodeUIController() {
    }
    
   ChangeListener<Boolean> listener1 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail1.isSelected()) {
                    binding1.setmail1("Selected");
                }
            }
        };

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    public void setLoggedinMarketerId(String marketerId) {
        System.out.println("Marketer iD"+marketerId);
        this.marketerId = marketerId;
        
    }

    public String getLoggedinMarketerId() {
        return marketerId;
    }

    @FXML
    public void submitWorklist() throws Exception {
        
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormListRequest req = new GetInsuranceFormListRequest();
                    
                    req.setMarketerId(marketerId);
                    String s="ASSIGNED";
                    req.setStatus(s);
                    
                    //req.setFormId(Integer.parseInt(binding.getsearchapplicationid()));
                    GetInsuranceFormListResponse response = port.getInsuranceOperationsPort().getFormList(req);

                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        abstractFormInfoList = response.getFormList();
                        successSearch();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
    }
    
    public void submitWorklist(final String producerid) throws Exception {
       System.out.println("Inside worklist1");
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormListRequest req = new GetInsuranceFormListRequest();
                    String s="NEW,ASSIGNED";
                    req.setProducerId(producerid);
                    req.setStatus(s);
                    
                    //req.setFormId(Integer.parseInt(binding.getsearchapplicationid()));
                    GetInsuranceFormListResponse response = port.getInsuranceOperationsPort().getFormList(req);

                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        abstractFormInfoList = response.getFormList();
                        System.out.println("Inside2");
                        successSearch2();
                    }
                    else if(response.getStatus()==null || response.getStatus().trim().isEmpty())
                {successMessage("There are currently no active applications");
                }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
    }

    @FXML
    public void submitUnassigned() throws Exception {
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormListRequest req = new GetInsuranceFormListRequest();
                    
                    req.setStatus("NEW");
                    
                    GetInsuranceFormListResponse response = port.getInsuranceOperationsPort().getFormList(req);

                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        abstractFormInfoList = response.getFormList();
                        successSearch();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
    }

@FXML
    public void submitSendEmail() {
         BufferedWriter b = null;
        final File f = new File("Mailbody.txt");
        try {
            b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
           // b.write(binding2.getMailbody());
            b.write(emailbody.getText());
        } catch (Exception e) {

        } finally {
            if (b != null) {
                try {
                    b.close();
                } catch (IOException e) {
    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        if(binding1.getemail1().trim().equals(null)||binding1.getemail1().trim().equals(""))
        { successMessage("Please enter email address");}
        else
        {Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
       FormMailToUnderWriterRequest req1 = new FormMailToUnderWriterRequest();
       req1.setFormId(formId);
       req1.setFrom(receivedemailaddress);
      
        byte[] bytes = WriteByteArray.getByteFromFile(f);
           
       req1.setMessage(bytes);
       String mail ="";
       if(binding1.getmail1()!=null && !binding1.getmail1().trim().equals("")){
           mail+=binding1.getmail1()+",";
       }
       if(binding1.getemail1()!=null && !binding1.getemail1().trim().equals("")){
           mail+=binding1.getemail1()+",";
       }
       if(binding1.getemail2()!=null && !binding1.getemail2().trim().equals("")){
           mail+=binding1.getemail2()+",";
       }
       if(binding1.getemail3()!=null && !binding1.getemail3().trim().equals("")){
           mail+=binding1.getemail3()+",";
       }
       if(binding1.getemail4()!=null && !binding1.getemail4().trim().equals("")){
           mail+=binding1.getemail4()+",";
       }
       req1.setRecpients(mail.substring(0, mail.length()));
      CommonResponseAttributes response =  port.getInsuranceOperationsPort().sendMailToUnderWriter(req1);
      
      if(response!=null && response.getStatus().equals("SUCCESS")){
          successMessage("Mail Sent");
      }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        
        new Thread(task).start();
        }
    }
    
    @FXML
    public void submitSendDelayEmail() throws DatatypeConfigurationException {
       if(datePicker.getSelectedDate() ==null || datePicker.getSelectedDate().equals(""))
        {InvokeAnimation.attentionSeekerWobble(datePicker);
            datePicker.setPromptText("Enter the date");
        }
       else{
        InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
        PostFormMailRequest req1 = new PostFormMailRequest() ;
        req1.setFormId(formId);
        req1.setFrom(receivedemailaddress);
        GregorianCalendar c1 = new GregorianCalendar();
           if (datePicker.getSelectedDate() != null) {
               c1.setTime(datePicker.getSelectedDate());
               XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c1);
               req1.setSendDate(date);
           }

        BufferedWriter b = null;
        File f = new File("Mailbodydelay.txt");
        try {
            b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
            b.write(binding3.getmailbody());
        } catch (Exception e) {

        } finally {
            if (b != null) {
                try {
                    b.close();
                } catch (IOException e) {
    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        byte[] bytes = WriteByteArray.getByteFromFile(f);
           
       req1.setMessage(bytes);
       String mail ="";
       if(binding1.getmail1()!=null && !binding1.getmail1().trim().equals("")){
           mail+=binding1.getmail1()+",";
       }
       if(binding1.getemail1()!=null && !binding1.getmail1().trim().equals("")){
           mail+=binding1.getemail1()+",";
       }
       if(binding1.getemail2()!=null && !binding1.getemail2().trim().equals("")){
           mail+=binding1.getemail2()+",";
       }
       if(binding1.getemail3()!=null && !binding1.getemail3().trim().equals("")){
           mail+=binding1.getemail3()+",";
       }
       if(binding1.getemail4()!=null && !binding1.getemail4().trim().equals("")){
           mail+=binding1.getemail4()+",";
       }
       req1.setRecpients(mail.substring(0, mail.length()));
    }
    }
    
    @FXML
    public void searchArchive() {
        
        animatedMovement(0, -715);
        searcharchive.setVisible(true);
        searcharchive2.setVisible(false);
    }

    @FXML
    public void nextArchive() {
        searcharchive.setVisible(false);
        searcharchive2.setVisible(true);
    }

    @FXML
    public void submitViewApplication() {
        ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).setFormId(formId);
        ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).setIsEdit(true);
        System.out.println("Form ID is"+formId); 
        NextScreenController controller = (NextScreenController) screenPage.getControlledScreen("NextScreen");
        controller.viewApplication(form,formId);
        

    }

    @FXML
    public void sendMailNow() {
        animatedMovement(-2538, 0);
    }

    @FXML
    public void sendMailLater() {
        animatedMovement(-2538, -715);
    }

    @FXML
    public void submitAssign() {

        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();

                    AssignMarketerRequest request = new AssignMarketerRequest();
                    System.out.println(getLoggedinMarketerId());
                    request.setMarketerUserId(getLoggedinMarketerId());
                    request.setFormId(title.getText());
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().assignMarketer(request);
                  
                   successMessage("Assigned " + getFormId() + " to " + getLoggedinMarketerId());
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
        /*   Task task = new Task<Void>() {
         @Override
         public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception {
         InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
         AssignMarketerRequest req1 = new AssignMarketerRequest();
         req1.set(binding.getsearchproducerid());
         req.setMarketerId(binding.getsearchmarketerid());
         req.setBusinessName(binding.getsearchbusinessname());
         req.setFormId(Integer.parseInt(binding.getsearchapplicationid()));
         GetInsuranceFormListResponse response = port.getInsuranceOperationsPort().getFormList(req);
         if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
         abstractFormInfoList = response.getFormList();
         offset=0;
         }

         //   successMessage("You are successfully logged in");
         return null;
         }

         };
         new Thread(task).start();*/

    }

    public void successMessage(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                new AlertDialog((Stage) searchproducerid.getParent().getScene().getWindow(), message, AlertDialog.ICON_INFO).showAndWait();
                //Dialogs.showInformationDialog(null, message, "Success", "Success");
            }
        });
    }
    
     @FXML
    public void closeProposal(){
        proposalbinder.setVisible(false);
    }
    @FXML
    public void sendmailPaneBack(){
        sendmailPane.setVisible(false);
    }
    
    @FXML
    public void openProposal(){
        new Rav1(new File("bin\\proposal.docx").getAbsolutePath()).execute();
    }
    
    @FXML
    public void openBinder(){
        new Rav1(new File("bin\\binder.docx").getAbsolutePath()).execute();
    }

    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
               new AlertDialog((Stage) searchproducerid.getParent().getScene().getWindow(), message, AlertDialog.ICON_INFO).showAndWait();
                //Dialogs.showErrorDialog(null, message, "Oops!!", "Error");
            }
        });
    }

    @FXML
    public void submitConversation() {
        System.out.println("Conver1");
         Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    System.out.println("Conver3");
                    SearchMailRequest request = new SearchMailRequest();
                    System.out.println(getFormId());
                    request.setFormId(getFormId());                    
                    SearchMailResponse2 response = port.getInsuranceOperationsPort().searchMail(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        animatedMovement(-2538, -1430);
                        System.out.println("response "+response.getMailList().size());
                        System.out.println(response.getMailList().get(0).getMailBody());
                        System.out.println(response.getStatus());
                        setMailList(response.getMailList());
                       
                        successSearch1();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
        new Thread(task).start();
    }

    @FXML
    public void submitProposalBinder() {
        //yaha
        proposalbinder.setVisible(true);
    }
    
    @FXML
    public void submitGenerateLogs()
    { marketinglogpane.setVisible(false);
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    SearchQuotesRequest request = new SearchQuotesRequest();
                    request.setCompanyName(binding1.getLogsCompanyName());
                    //request.setCreationDate(binding1.getLogsDate());
                    request.setMarketerId(binding1.getLogsMarketerId());
                    SearchQuotesResponse2 response = port.getInsuranceOperationsPort().searchQuotes(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        List<QuoteDetailsRequest> list = response.getList();
                        int i =0;
                        for(QuoteDetailsRequest a:list){
                           switch(i){
                               case 0: //l10.setText(a.formId);
                               
                                   break;
                               case 1:
                                   break;
                               case 2:
                                   break;
                               case 3:
                                   break;
                           }
                           
                        }
                        successSearch1();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
        new Thread(task).start();
        
            }
     @FXML
    public void clickMarketingLogs()
            {animatedMovement(0, -1430);}

    @FXML
    public void uploadProposal() {
        //yaha
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    UploadProposalBinderRequest request = new UploadProposalBinderRequest();
                    request.setProposal(WriteByteArray.getByteFromFile(new File("/Users/harsimransingh/Desktop/RevisedProposal.docx")));
                    request.setFormId(formId);
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().uploadProposalBinder(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        successSearch1();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
    }

    @FXML
    public void searchPrevious() {
        if (offset > 0) {
            offset -= 24;
            gridpane.getChildren().removeAll(gridpane.getChildren());
            try {
                gridpane.getChildren().removeAll(gridpane.getChildren());
                showAbstractInfo();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @FXML
    public void searchNext() {
        offset += 24;
        gridpane.getChildren().removeAll(gridpane.getChildren());
        try {
            gridpane.getChildren().removeAll(gridpane.getChildren());
            showAbstractInfo();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    public void uploadBinder() {
        //yaha
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {

                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    UploadProposalBinderRequest request = new UploadProposalBinderRequest();
                    request.setProposal(WriteByteArray.getByteFromFile(new File("/Users/harsimransingh/Desktop/RevisedProposal.docx")));
                    request.setFormId(formId);
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().uploadProposalBinder(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        successSearch1();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
    }

    @FXML
    public void submitSendtoUnderwriter() {
        sendmailPane.setVisible(true);
    }
    @FXML
    public void searchHome() {
       try{ if(marketerId==null || marketerId.trim().isEmpty())
        {
                    screenPage.setScreen("NextScreen");
                    animatedMovement(0, 0);
        }
        else if( marketerId.trim() != null && !marketerId.trim().isEmpty())
        {
            System.out.println("Inside searchHomefunction"+marketerId);
            animatedMovement(0, 0);
        }
       }catch(Exception e){
           e.printStackTrace();
       }
    }

    @FXML
    public void goToSearchResults() {
        animatedMovement(-1269, 0);
    }
    @FXML
    public void backMail() {
        animatedMovement(-1269, -715);
        sendmailPane.setVisible(false);
    }
    @FXML
    public void backDelayMail() {
        animatedMovement(-1269, -715);
        sendmailPane.setVisible(false);
    }

    @FXML
    public void submitRenewBusiness() {
        NextScreenController controller = (NextScreenController) screenPage.getControlledScreen("NextScreen");
        controller.viewApplication(form,form.getFormId());
        screenPage.setScreen("NextScreen");
        switch (form.getType()) {
            case "Auto":
                controller.submitActionAuto();
                break;
            case "Both":
                controller.submitActionBoth();
                break;
            case "Commercial":
                controller.submitActionCommercial();
                break;
        }
    }

    @FXML
    public void submitSaveQuotes() {
         Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {

                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    QuoteDetailsRequest request = new QuoteDetailsRequest();
                    request.setQuote(Double.parseDouble(binding1.getQuote1()));
                    request.setQuote1(Double.parseDouble(binding1.getQuote2()));
                    request.setQuote2(Double.parseDouble(binding1.getQuote3()));
                    request.setQuote3(Double.parseDouble(binding1.getQuote4()));
                    request.setQuote4(Double.parseDouble(binding1.getQuote5()));
                    request.setQuote5(Double.parseDouble(binding1.getQuote6()));
                    request.setQuote6(Double.parseDouble(binding1.getQuote7()));
                    request.setQuote7(Double.parseDouble(binding1.getQuote8()));
                    request.setQuote8(Double.parseDouble(binding1.getQuote9()));
                    request.setQuote9(Double.parseDouble(binding1.getQuote10()));
                    request.setComment1(binding1.getComment1());
                    request.setComment2(binding1.getComment2());
                    request.setComment3(binding1.getComment3());
                    request.setComment4(binding1.getComment4());
                    request.setComment5(binding1.getComment5());
                    request.setComment6(binding1.getComment6());
                    request.setComment7(binding1.getComment7());
                    request.setComment8(binding1.getComment8());
                    request.setComment9(binding1.getComment9());
                    request.setComment10(binding1.getComment10());
                    request.setCompanyname1(binding1.getCompanyName1());
                    request.setCompanyname2(binding1.getCompanyName2());
                    request.setCompanyname3(binding1.getCompanyName3());
                    request.setCompanyname4(binding1.getCompanyName4());
                    request.setCompanyname5(binding1.getCompanyName5());
                    request.setCompanyname6(binding1.getCompanyName6());
                    request.setCompanyname7(binding1.getCompanyName7());
                    request.setCompanyname8(binding1.getCompanyName8());
                    request.setCompanyname9(binding1.getCompanyName9());
                    request.setCompanyname10(binding1.getCompanyName10());
                    request.setFormId(formId);
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().quoteDetails(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        successMessage("Quotes successfully saved");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
    }

    @FXML
    public void homebutton() {
        try{ 
            if(marketerId==null || marketerId.trim().isEmpty())
        {
                    screenPage.setScreen("NextScreen");
                    animatedMovement(0, 0);
        }
        else if( marketerId.trim() != null && !(marketerId.trim().isEmpty()))
        {
            animatedMovement(0, 0);
        }
       }catch(Exception e)
       {    e.printStackTrace();}
    }

    @FXML
    public void saveQuotes() {
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    SearchMailRequest req = new SearchMailRequest() ;
                    req.setFormId(getFormId());
                    GetCloseFormNQuoteDetailsResponse2 response = port.getInsuranceOperationsPort().getCloseFormNQuoteDetails(req);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        setQuote(response);
                } 
                }catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }
          

        };
        new Thread(task).start();
       
    }
    
    @FXML
    public void clickCloseApplication() {
        closeapplicationpane.setVisible(true);
    }
     @FXML
    public void searcharchiveback2() {
        searcharchive2.setVisible(false);
        searcharchive.setVisible(true);
        
    }
     @FXML
    public void searcharchiveback1() {
        if(marketerId == null || marketerId.trim().isEmpty())
        {
            screenPage.setScreen("NextScreen");
        }
        else {animatedMovement(0, 0);}
    }
    
    @FXML
    public void opencloseApplication() {
         closeapplicationpane.setVisible(true);
    }
    
    @FXML
    public void backSaveQuote() {
         closeapplicationpane.setVisible(false);
         sendmailPane.setVisible(false);
         animatedMovement(-1269, -715);
    }

    @FXML
    public void submitCloseApplication() {
      closeapplicationpane.setVisible(false);
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    CloseFormRequest req = new CloseFormRequest();
                    req.setFormId(getFormId());
                    req.setCompany(binding1.getCloseCompany());
                    req.setQuote(Double.parseDouble(binding1.getCloseQuote()));
                    //req.setFormId(Integer.parseInt(binding.getsearchapplicationid()));
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().closeForm(req);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        closeapplicationpane.setVisible(false);
                        successMessage("Status of the form has been updated as Closed");

                  }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();

    }
    int foo;
    @FXML
    public void searchSubmit() {
        Task task;
        task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormListRequest req = new GetInsuranceFormListRequest();
                    
                    req.setProducerId(binding.getsearchproducerid());
                    
                    req.setMarketerId(binding.getsearchmarketerid());
                    
                    req.setBusinessName(binding.getsearchbusinessname());
                    String searchformid="";
                    
                    if(binding.getsearchapplicationid().trim().equals(""))
                    {}
                    else
                    {
                     if(binding.getsearchapplicationid().contains("UCCIG"))
                    {searchformid=binding.getsearchapplicationid().replace("UCCIG", "").trim();}
                    else 
                    {searchformid=binding.getsearchapplicationid().trim();}
                        System.out.println(searchformid);
                     foo=Integer.parseInt(searchformid.trim());
                        System.out.println(foo);
                    }
                    req.setFormId(foo);
                    System.out.println(binding.getsearchdate1());
                    System.out.println(binding.getsearchwithusyes());
                    switch (binding.getsearchdate1()) {
                        case "0-3 months":
                            req.setMonth(3);
                            break;
                        case "0-6 months":
                            req.setMonth(6);
                            break;
                        case "0-12 months":
                            req.setMonth(9);
                            break;
                        case ">12 months":
                            break;
                        case "":
                            break;
                    }
                     switch (binding.getsearchwithusyes()) {
                        case "Yes":
                            req.setWithUs("Yes");
                            break;
                        case "No":
                            req.setWithUs("No");
                            break;
                        case "":
                            break;
                    }
                    
                    
                    //req.setFormId(Integer.parseInt(binding.getsearchapplicationid()));
                    GetInsuranceFormListResponse response = port.getInsuranceOperationsPort().getFormList(req);

                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        abstractFormInfoList = response.getFormList();
                        successSearch();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
    }

    public void showAbstractInfo() throws Exception {
        int j = 0;
        System.out.println("Size is "+abstractFormInfoList.size());
        //for (int i = 0; i < abstractFormInfoList.size() % 15; i++) {
            System.out.println("Value of offset "+offset);
            for(int k=offset;k<offset+24;k++){
                System.out.println("Value of k "+k);
                // gridpane.getChildren().add(new dynamicloading());
            dynamicloading dl = new dynamicloading(screenPage);
            dl.getController().setProducer(abstractFormInfoList.get(k).getProducerId());
            dl.getController().setApplicationId(abstractFormInfoList.get(k).getFormId());
            dl.getController().setmarketer(abstractFormInfoList.get(k).getMarketerId());
            dl.getController().setSeverity(abstractFormInfoList.get(k).getSeverity()); 
            dl.getController().setBusinessName(abstractFormInfoList.get(k).getBusinessName());
            dl.getController().setWithUs(abstractFormInfoList.get(k).getWithUs());
            dl.getController().setInsurancecategory(abstractFormInfoList.get(k).getStatus());
            dl.getController().setInsurancetype(abstractFormInfoList.get(k).getInsuranceType());
           // dl.getController().setCreationDate(abstractFormInfoList.get(i + offset).getCreationDate().toString());
            dl.getController().setBranch(abstractFormInfoList.get(k).getBranch());
            //yahape
            if (k % 4 == 0 && k > 0) {
                j++;
            }
            System.out.println("Value of j "+j);
            gridpane.add(dl, k % 4, j);
            }
            
        //}
    }
    
    public void setQuote(final GetCloseFormNQuoteDetailsResponse2 response){
         Platform.runLater(new Runnable() {

            public void run() {
                 if(response.getQuote()>0){
                           companyname1.setText(response.getCompanyname1());
                           quote1.setText(""+response.getQuote());
                               comment1.setText(response.getComment1());
                  }
                 if(response.getQuote1()>0){
                           companyname2.setText(response.getCompanyname2());
                           quote2.setText(""+response.getQuote2());
                               comment2.setText(response.getComment2());
                  }
                 if(response.getQuote2()>0){
                           companyname3.setText(response.getCompanyname3());
                           quote3.setText(""+response.getQuote3());
                               comment3.setText(response.getComment3());
                  }
                 if(response.getQuote3()>0){
                           companyname4.setText(response.getCompanyname4());
                           quote4.setText(""+response.getQuote4());
                               comment4.setText(response.getComment4());
                  }
                  if(response.getQuote4()>0){
                           companyname5.setText(response.getCompanyname5());
                           quote5.setText(""+response.getQuote5());
                               comment5.setText(response.getComment5());
                  }
                   if(response.getQuote5()>0){
                           companyname6.setText(response.getCompanyname6());
                           quote6.setText(""+response.getQuote6());
                               comment6.setText(response.getComment6());
                  }
                   if(response.getQuote6()>0){
                           companyname7.setText(response.getCompanyname7());
                           quote7.setText(""+response.getQuote7());
                               comment7.setText(response.getComment7());
                  }
                   if(response.getQuote7()>0){
                           companyname8.setText(response.getCompanyname8());
                           quote8.setText(""+response.getQuote8());
                               comment8.setText(response.getComment8());
                  }
                   if(response.getQuote8()>0){
                           companyname9.setText(response.getCompanyname9());
                           quote9.setText(""+response.getQuote9());
                               comment9.setText(response.getComment9());
                  }
                   if(response.getQuote9()>0){
                           companyname10.setText(response.getCompanyname10());
                           quote10.setText(""+response.getQuote10());
                               comment10.setText(response.getComment10());
                  }
                  animatedMovement(-1269, -1430);
            }
         });
    }    
    
    public void setMailList(final List mail){
         Platform.runLater(new Runnable() {

            public void run() {
                 mailList = mail;
                        int i =0;
                        for(MailInfo a:mailList){
                           switch(i){
                               case 0: 
                                   l1.setText(a.getSentdDate().toString());
                                   l2.setText(a.getFrom());
                                   l3.setText(a.getSubject());
                                   break;
                               case 1:
                                   l5.setText(a.getSentdDate().toString());
                                   l6.setText(a.getFrom());
                                   l7.setText(a.getSubject());
                                   break;
                               case 2:
                                   l9.setText(a.getSentdDate().toString());
                                   l10.setText(a.getFrom());
                                   l11.setText(a.getSubject());
                                   break;
                               case 3:
                                   l13.setText(a.getSentdDate().toString());
                                   l14.setText(a.getFrom());
                                   l15.setText(a.getSubject());
                                   break;
                               case 4:
                                   l17.setText(a.getSentdDate().toString());
                                   l18.setText(a.getFrom());
                                   l19.setText(a.getSubject());
                                   break;
                               case 5:
                                   l21.setText(a.getSentdDate().toString());
                                   l22.setText(a.getFrom());
                                   l23.setText(a.getSubject());
                                   break;
                               case 6:
                                   l25.setText(a.getSentdDate().toString());
                                   l26.setText(a.getFrom());
                                   l27.setText(a.getSubject());
                                   break;
                               case 7:
                                   l29.setText(a.getSentdDate().toString());
                                   l30.setText(a.getFrom());
                                   l31.setText(a.getSubject());
                                   break;
                               case 8:
                                   l33.setText(a.getSentdDate().toString());
                                   l34.setText(a.getFrom());
                                   l35.setText(a.getSubject());
                                   break;
                               case 9:
                                   l37.setText(a.getSentdDate().toString());
                                   l38.setText(a.getFrom());
                                   l39.setText(a.getSubject());
                                   break;   
                               case 10:
                                   l41.setText(a.getSentdDate().toString());
                                   l42.setText(a.getFrom());
                                   l43.setText(a.getSubject());
                                   break; 
                               case 11:
                                   l45.setText(a.getSentdDate().toString());
                                   l46.setText(a.getFrom());
                                   l47.setText(a.getSubject());
                                   break;      
                               case 12:
                                   l49.setText(a.getSentdDate().toString());
                                   l50.setText(a.getFrom());
                                   l51.setText(a.getSubject());
                                   break;   
                               case 13:
                                   l53.setText(a.getSentdDate().toString());
                                   l54.setText(a.getFrom());
                                   l55.setText(a.getSubject());
                                   break;       
                               case 14:
                                   l57.setText(a.getSentdDate().toString());
                                   l58.setText(a.getFrom());
                                   l59.setText(a.getSubject());
                                   break;
                               case 15:
                                   l61.setText(a.getSentdDate().toString());
                                   l62.setText(a.getFrom());
                                   l63.setText(a.getSubject());
                                   break;    
                               case 16:
                                   l65.setText(a.getSentdDate().toString());
                                   l66.setText(a.getFrom());
                                   l67.setText(a.getSubject());
                                   break;   
                               case 17:
                                   l69.setText(a.getSentdDate().toString());
                                   l70.setText(a.getFrom());
                                   l71.setText(a.getSubject());
                                   break;
                               case 18:
                                   l73.setText(a.getSentdDate().toString());
                                   l74.setText(a.getFrom());
                                   l75.setText(a.getSubject());
                                   break;
                               case 19:
                                   l77.setText(a.getSentdDate().toString());
                                   l78.setText(a.getFrom());
                                   l79.setText(a.getSubject());
                                   break;   
                           }
                           i++;
                           
                        }
            
             }
        });
    }

    public void successSearch() {
        Platform.runLater(new Runnable() {

            public void run() {
                offset = 0;
                try {
                    gridpane.getChildren().removeAll(gridpane.getChildren());
                    showAbstractInfo();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                
                animatedMovement(-1269, 0);
            }
        });
    }
     public void successSearch1() {
        Platform.runLater(new Runnable() {

            public void run() {
                offset = 0;
                try {
                    gridpane.getChildren().removeAll(gridpane.getChildren());
                    showAbstractInfo();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("Inside3");
                screenPage.setScreen("OtherScreen");
                
            }
        });
    }
     public void successSearch2() {
        Platform.runLater(new Runnable() {

            public void run() {
                offset = 0;
                try {
                    gridpane.getChildren().removeAll(gridpane.getChildren());
                    showAbstractInfo();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.out.println("SuccessSearch2");
                screenPage.setScreen("OtherScreen");
                animatedMovement(-1269, 0);
                
                
            }
        });
    }

    @FXML
    public void searchAgain() {
        animatedMovement(0, -715);
        searcharchive2.setVisible(false);
        searcharchive.setVisible(true);
        //NextScreenController controller = (NextScreenController) screenPage.getControlledScreen("NextScreen");
        //controller.viewApplication(form,form.getFormId());
    }

    public void animatedMovement(int x, int y) {
        TranslateTransition animatedMove = TranslateTransitionBuilder.
                create().
                toX(x).
                toY(y).
                duration(Duration.seconds(0.5)).
                node(fullScreenPane).
                build();
        animatedMove.play();
    }

}
