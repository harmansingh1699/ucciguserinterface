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
import com.rav.insurance.insuranceformoperations.webservice.contracts.DownloadProposalBinderRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.DownloadProposalBinderResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.DownloadProposalBinderResponse2;
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
import com.ui.util.CommonValidations;
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
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
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
    //for mail
    private Stage stage = new Stage();
    //for loading
    private Stage stage1 = new Stage();
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
    private CheckBox mail3;
    
    @FXML
    private CheckBox mail4;
    
    @FXML
    private CheckBox mail5;
    
    @FXML
    private CheckBox mail6;
    
    @FXML
    private CheckBox mail7;
    
    @FXML
    private CheckBox mail8;
    
    @FXML
    private CheckBox mail9;
    
    @FXML
    private CheckBox mail10;
    
    @FXML
    private CheckBox mail11;
    
    @FXML
    private CheckBox mail12;
    
    @FXML
    private CheckBox mail13;
    
    @FXML
    private CheckBox mail14;
    
    @FXML
    private CheckBox mail15;
    
    @FXML
    private CheckBox mail16;
    @FXML
    private CheckBox mail17;
    @FXML
    private CheckBox mail18;
    @FXML
    private CheckBox mail19;
    @FXML
    private CheckBox mail20;
    @FXML
    private CheckBox mail21;
    @FXML
    private CheckBox mail22;
    @FXML
    private CheckBox mail23;
    @FXML
    private CheckBox mail24;
    @FXML
    private CheckBox mail25;
    @FXML
    private CheckBox mail26;
    @FXML
    private CheckBox mail27;
    @FXML
    private CheckBox mail28;
    @FXML
    private CheckBox mail29;
    
    @FXML
    private CheckBox dmail1;

    @FXML
    private CheckBox dmail2;
    
    @FXML
    private CheckBox dmail3;
    
    @FXML
    private CheckBox dmail4;
    
    @FXML
    private CheckBox dmail5;
    
    @FXML
    private CheckBox dmail6;
    
    @FXML
    private CheckBox dmail7;
    
    @FXML
    private CheckBox dmail8;
    
    @FXML
    private CheckBox dmail9;
    
    @FXML
    private CheckBox dmail10;
    
    @FXML
    private CheckBox dmail11;
    
    @FXML
    private CheckBox dmail12;
    
    @FXML
    private CheckBox dmail13;
    
    @FXML
    private CheckBox dmail14;
    
    @FXML
    private CheckBox dmail15;
    
    @FXML
    private CheckBox dmail16;
    @FXML
    private CheckBox dmail17;
    @FXML
    private CheckBox dmail18;
    @FXML
    private CheckBox dmail19;
    @FXML
    private CheckBox dmail20;
    @FXML
    private CheckBox dmail21;
    @FXML
    private CheckBox dmail22;
    @FXML
    private CheckBox dmail23;
    @FXML
    private CheckBox dmail24;
    @FXML
    private CheckBox dmail25;
    @FXML
    private CheckBox dmail26;
    @FXML
    private CheckBox dmail27;
    @FXML
    private CheckBox dmail28;
    @FXML
    private CheckBox dmail29;
    
    @FXML
    private RadioButton searchdate1;

    @FXML
    private RadioButton searchdate2;

    @FXML
    private RadioButton searchdate3;

    @FXML
    private RadioButton searchdate4;
    
    @FXML
    private Button closebutton;
    
    @FXML
    private RadioButton closeboundedno;
    @FXML
    private RadioButton closeboundedyes;
    
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
    private Hyperlink l4;
    @FXML
    private Hyperlink l8;
    @FXML
    private Hyperlink l12;
    @FXML
    private Hyperlink l16;
    @FXML
    private Hyperlink l20;
    @FXML
    private Hyperlink l24;
    @FXML
    private Hyperlink l28;
    @FXML
    private Hyperlink l32;
    @FXML
    private Hyperlink l36;
    @FXML
    private Hyperlink l40;
    @FXML
    private Hyperlink l44;
    @FXML
    private Hyperlink l48;
    @FXML
    private Hyperlink l52;
    @FXML
    private Hyperlink l56;
    @FXML
    private Hyperlink l60;
    @FXML
    private Hyperlink l64;
    @FXML
    private Hyperlink l68;
    @FXML
    private Hyperlink l72;
    @FXML
    private Hyperlink l76;
    @FXML
    private Hyperlink l80;
    
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
    private TextField sendmailsubject;
    @FXML
    private TextField senddelayedmailsubject;
    
    
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
    
    private byte [] proposal;
    private byte [] binder;
    private static String os1=null;
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
            Group root = new Group();
            ImageView imageView = new ImageView(new Image("http://www.justjeweller.com/images/animation.gif"));
            root.getChildren().add(imageView);
            root.autosize();
            Scene scene = new Scene(root);
            stage1.setScene(scene);
            stage1.setResizable(false);
            stage1.setTitle("Please Wait");
            stage1.initStyle(StageStyle.TRANSPARENT);
            stage1.centerOnScreen();
            stage1.setFocused(true);
        
        os1=System.getProperty("os.name");
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
        
        ToggleGroup tg2 = new ToggleGroup();
        closeboundedyes.setToggleGroup(tg2);
        closeboundedno.setToggleGroup(tg2);
        ChangeListener<Toggle> ls2 = new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t = (RadioButton) val.getToggleGroup().getSelectedToggle();
                binding1.setCloseBounded(t.getText());
            }
        };
        tg2.selectedToggleProperty().addListener(ls2);
        
        
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
        datePicker.setDateFormat(new SimpleDateFormat("YYYY-MM-dd"));
        
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
         Bindings.bindBidirectional(sendmailsubject.textProperty(), binding1.sendMailSubjectProperty());
         Bindings.bindBidirectional(senddelayedmailsubject.textProperty(), binding1.sendDelayedMailSubjectProperty());
         Bindings.bindBidirectional(email1.textProperty(), binding1.email1Property());
         Bindings.bindBidirectional(email2.textProperty(), binding1.email2Property());
         Bindings.bindBidirectional(email3.textProperty(), binding1.email3Property());
         Bindings.bindBidirectional(email4.textProperty(), binding1.email4Property());
         Bindings.bindBidirectional(delayedemail1.textProperty(), binding1.demail1Property());
         Bindings.bindBidirectional(delayedemail2.textProperty(), binding1.demail2Property());
         Bindings.bindBidirectional(delayedemail3.textProperty(), binding1.demail3Property());
         Bindings.bindBidirectional(delayedemail4.textProperty(), binding1.demail4Property());
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
        
        ChangeListener<Boolean> listener2 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail3.isSelected()) {
                    binding1.setmail3("toronto@april.ca");
                }
            }
        };
        mail3.selectedProperty().addListener(listener2);
        
        ChangeListener<Boolean> listener3 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail4.isSelected()) {
                    binding1.setmail4("avivaquotes_ottawa@avivacanada.com");
                }
            }
        };
        mail4.selectedProperty().addListener(listener3);
        
        ChangeListener<Boolean> listener4 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail5.isSelected()) {
                    binding1.setmail5("enquiries@cfcunderwriting.com");
                }
            }
        };
        mail5.selectedProperty().addListener(listener4);
        
        ChangeListener<Boolean> listener5 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail6.isSelected()) {
                    binding1.setmail6("tstanton@burns-wilcox.ca");
                }
            }
        };
        mail6.selectedProperty().addListener(listener5);
        
        
        ChangeListener<Boolean> listener6 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail7.isSelected()) {
                    binding1.setmail7("kevin@chutteruw.com");
                }
            }
        };
        mail7.selectedProperty().addListener(listener6);
        
         ChangeListener<Boolean> listener7 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail8.isSelected()) {
                    binding1.setmail8("lisa.wolfe@cna.com");
                }
            }
        };
        mail8.selectedProperty().addListener(listener7);
        
        ChangeListener<Boolean> listener8 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail9.isSelected()) {
                    binding1.setmail9("info@creechurch.com");
                }
            }
        };
        mail9.selectedProperty().addListener(listener8);
        
         ChangeListener<Boolean> listener9 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail10.isSelected()) {
                    binding1.setmail10("bisubmissions@travelers.com");
                }
            }
        };
        mail10.selectedProperty().addListener(listener9);
        
        ChangeListener<Boolean> listener10 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail11.isSelected()) {
                    binding1.setmail11("mpollock@eccles-ins.com");
                }
            }
        };
        mail11.selectedProperty().addListener(listener10);
        
        ChangeListener<Boolean> listener11 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail12.isSelected()) {
                    binding1.setmail12("enconapps@encon.ca");
                }
            }
        };
        mail12.selectedProperty().addListener(listener11);
        
        ChangeListener<Boolean> listener12 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail13.isSelected()) {
                    binding1.setmail13("insureit@grouponeu.com");
                }
            }
        };
        mail13.selectedProperty().addListener(listener12);
        
        ChangeListener<Boolean> listener13 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail14.isSelected()) {
                    binding1.setmail14("commercial@goremutual.ca");
                }
            }
        };
        mail14.selectedProperty().addListener(listener13);
        
         ChangeListener<Boolean> listener14 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail15.isSelected()) {
                    binding1.setmail15("eastclassic.ottawa@intact.net");
                }
            }
        };
        mail15.selectedProperty().addListener(listener14);

        ChangeListener<Boolean> listener15 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail16.isSelected()) {
                    binding1.setmail16("hmcadam@uccig.com");
                }
            }
        };
        mail16.selectedProperty().addListener(listener15);
        
         ChangeListener<Boolean> listener16 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail17.isSelected()) {
                    binding1.setmail17("mr.ontario@nbfc.com");
                }
            }
        };
        mail17.selectedProperty().addListener(listener16);

         ChangeListener<Boolean> listener17 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail18.isSelected()) {
                    binding1.setmail18("toronto@premiermarine.com");
                }
            }
        };
        mail18.selectedProperty().addListener(listener17);
        
         ChangeListener<Boolean> listener18 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail19.isSelected()) {
                    binding1.setmail19("ontario_commercial@rsagroup.ca");
                }
            }
        };
        mail19.selectedProperty().addListener(listener18);
        
        ChangeListener<Boolean> listener19 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail20.isSelected()) {
                    binding1.setmail20("quotes@swgins.com");
                }
            }
        };
        mail20.selectedProperty().addListener(listener19);
        
        
        ChangeListener<Boolean> listener20 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail21.isSelected()) {
                    binding1.setmail21("ontario@srim.ca");
                }
            }
        };
        mail21.selectedProperty().addListener(listener20);
        
        ChangeListener<Boolean> listener21 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail22.isSelected()) {
                    binding1.setmail22("jeff.somerville@suminsurance.ca");
                }
            }
        };
        mail22.selectedProperty().addListener(listener21);
        
        ChangeListener<Boolean> listener22 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail23.isSelected()) {
                    binding1.setmail23("jfontaine@tcim.ca");
                }
            }
        };
        mail23.selectedProperty().addListener(listener22);
        
        ChangeListener<Boolean> listener23 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail24.isSelected()) {
                    binding1.setmail24("property@tottengroup.com");
                }
            }
        };
        mail24.selectedProperty().addListener(listener23);
        
        ChangeListener<Boolean> listener24 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail25.isSelected()) {
                    binding1.setmail25("hospitality@tottengroup.com");
                }
            }
        };
        mail25.selectedProperty().addListener(listener24);
        
        
        ChangeListener<Boolean> listener25 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail26.isSelected()) {
                    binding1.setmail26("professionalliability@tottengroup.com");
                }
            }
        };
        mail26.selectedProperty().addListener(listener25);
        
        ChangeListener<Boolean> listener26 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail27.isSelected()) {
                    binding1.setmail27("casualty@tottengroup.com");
                }
            }
        };
        mail27.selectedProperty().addListener(listener26);
        
        ChangeListener<Boolean> listener27 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail28.isSelected()) {
                    binding1.setmail28("commercial@unicainsurance.com");
                }
            }
        };
        mail28.selectedProperty().addListener(listener27);
        
        ChangeListener<Boolean> listener28 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mail29.isSelected()) {
                    binding1.setmail29("zurich.commercial.toronto@zurich.com");
                }
            }
        };
        mail29.selectedProperty().addListener(listener28);
        ChangeListener<Boolean> listener50 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail1.isSelected()) {
                    binding1.setdmail1("quotes@abexinsurance.com");
                }
            }
        };
        dmail1.selectedProperty().addListener(listener50);
        
         ChangeListener<Boolean> listener51 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail2.isSelected()) {
                    binding1.setdmail2("quotes@amfredericks.com");
                }
            }
        };
        dmail2.selectedProperty().addListener(listener51);
        
        ChangeListener<Boolean> listener52 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail3.isSelected()) {
                    binding1.setdmail3("toronto@april.ca");
                }
            }
        };
        dmail3.selectedProperty().addListener(listener52);
        
        ChangeListener<Boolean> listener53 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail4.isSelected()) {
                    binding1.setdmail4("avivaquotes_ottawa@avivacanada.com");
                }
            }
        };
        dmail4.selectedProperty().addListener(listener53);
        
        ChangeListener<Boolean> listener54 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail5.isSelected()) {
                    binding1.setdmail5("enquiries@cfcunderwriting.com");
                }
            }
        };
        dmail5.selectedProperty().addListener(listener54);
        
        ChangeListener<Boolean> listener55 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail6.isSelected()) {
                    binding1.setdmail6("tstanton@burns-wilcox.ca");
                }
            }
        };
        dmail6.selectedProperty().addListener(listener55);
        
        
        ChangeListener<Boolean> listener56 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail7.isSelected()) {
                    binding1.setdmail7("kevin@chutteruw.com");
                }
            }
        };
        dmail7.selectedProperty().addListener(listener56);
        
         ChangeListener<Boolean> listener57 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail8.isSelected()) {
                    binding1.setdmail8("lisa.wolfe@cna.com");
                }
            }
        };
        dmail8.selectedProperty().addListener(listener57);
        
        ChangeListener<Boolean> listener58 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail9.isSelected()) {
                    binding1.setdmail9("info@creechurch.com");
                }
            }
        };
        dmail9.selectedProperty().addListener(listener58);
        
         ChangeListener<Boolean> listener59 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail10.isSelected()) {
                    binding1.setdmail10("bisubmissions@travelers.com");
                }
            }
        };
        dmail10.selectedProperty().addListener(listener59);
        
        ChangeListener<Boolean> listener60 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail11.isSelected()) {
                    binding1.setdmail11("mpollock@eccles-ins.com");
                }
            }
        };
        dmail11.selectedProperty().addListener(listener60);
        
        ChangeListener<Boolean> listener61 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail12.isSelected()) {
                    binding1.setdmail12("enconapps@encon.ca");
                }
            }
        };
        dmail12.selectedProperty().addListener(listener61);
        
        ChangeListener<Boolean> listener62 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail13.isSelected()) {
                    binding1.setdmail13("insureit@grouponeu.com");
                }
            }
        };
        dmail13.selectedProperty().addListener(listener62);
        
        ChangeListener<Boolean> listener63 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail14.isSelected()) {
                    binding1.setdmail14("commercial@goremutual.ca");
                }
            }
        };
        dmail14.selectedProperty().addListener(listener63);
        
         ChangeListener<Boolean> listener64 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail15.isSelected()) {
                    binding1.setdmail15("eastclassic.ottawa@intact.net");
                }
            }
        };
        dmail15.selectedProperty().addListener(listener64);

        ChangeListener<Boolean> listener65 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail16.isSelected()) {
                    binding1.setdmail16("hmcadam@uccig.com");
                }
            }
        };
        dmail16.selectedProperty().addListener(listener65);
        
         ChangeListener<Boolean> listener66 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail17.isSelected()) {
                    binding1.setdmail17("mr.ontario@nbfc.com");
                }
            }
        };
        dmail17.selectedProperty().addListener(listener66);

         ChangeListener<Boolean> listener67 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail18.isSelected()) {
                    binding1.setdmail18("toronto@premiermarine.com");
                }
            }
        };
        dmail18.selectedProperty().addListener(listener67);
        
         ChangeListener<Boolean> listener68 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail19.isSelected()) {
                    binding1.setdmail19("ontario_commercial@rsagroup.ca");
                }
            }
        };
        dmail19.selectedProperty().addListener(listener68);
        
        ChangeListener<Boolean> listener69 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail20.isSelected()) {
                    binding1.setdmail20("quotes@swgins.com");
                }
            }
        };
        dmail20.selectedProperty().addListener(listener69);
        
        
        ChangeListener<Boolean> listener70 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail21.isSelected()) {
                    binding1.setdmail21("ontario@srim.ca");
                }
            }
        };
        dmail21.selectedProperty().addListener(listener70);
        
        ChangeListener<Boolean> listener71 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail22.isSelected()) {
                    binding1.setdmail22("jeff.somerville@suminsurance.ca");
                }
            }
        };
        dmail22.selectedProperty().addListener(listener71);
        
        ChangeListener<Boolean> listener72 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail23.isSelected()) {
                    binding1.setdmail23("jfontaine@tcim.ca");
                }
            }
        };
        dmail23.selectedProperty().addListener(listener72);
        
        ChangeListener<Boolean> listener73 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail24.isSelected()) {
                    binding1.setdmail24("property@tottengroup.com");
                }
            }
        };
        dmail24.selectedProperty().addListener(listener73);
        
        ChangeListener<Boolean> listener74 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail25.isSelected()) {
                    binding1.setdmail25("hospitality@tottengroup.com");
                }
            }
        };
        dmail25.selectedProperty().addListener(listener74);
        
        
        ChangeListener<Boolean> listener75 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail26.isSelected()) {
                    binding1.setdmail26("professionalliability@tottengroup.com");
                }
            }
        };
        dmail26.selectedProperty().addListener(listener75);
        
        ChangeListener<Boolean> listener76 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail27.isSelected()) {
                    binding1.setdmail27("casualty@tottengroup.com");
                }
            }
        };
        dmail27.selectedProperty().addListener(listener76);
        
        ChangeListener<Boolean> listener77 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail28.isSelected()) {
                    binding1.setdmail28("commercial@unicainsurance.com");
                }
            }
        };
        dmail28.selectedProperty().addListener(listener77);
        
        ChangeListener<Boolean> listener78 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (dmail29.isSelected()) {
                    binding1.setdmail29("zurich.commercial.toronto@zurich.com");
                }
            }
        };
        dmail29.selectedProperty().addListener(listener78);
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
        stage1.show();
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
                        stopLoading1();
                        successSearch();
                    }
                    else 
                    { stopLoading1();
                        errors(response.getErrorMessage());
                    }
                } catch (Exception e) {
                    stopLoading1();
                    errors(e.getMessage());
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
       stage1.show();
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
                        stopLoading1();
                        abstractFormInfoList = response.getFormList();
                        System.out.println("Inside2");
                        successSearch2();
                    }
                    else if(response.getStatus()==null || response.getStatus().trim().isEmpty())
                    {   System.out.println("Response"+response.getStatus());
                        stopLoading1();
                        successMessage("There are currently no active applications");
                }
                } catch (Exception e) {
                    stopLoading1();
                    errors(e.getMessage());
                    e.printStackTrace();
                }
                return null;
            }

        };
        new Thread(task).start();
    }

    @FXML
    public void submitUnassigned() throws Exception {
        stage1.show();
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormListRequest req = new GetInsuranceFormListRequest();
                    
                    req.setStatus("NEW");
                    
                    GetInsuranceFormListResponse response = port.getInsuranceOperationsPort().getFormList(req);

                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        stopLoading1();
                        abstractFormInfoList = response.getFormList();
                        successSearch();
                    }
                else{ stopLoading1();
                        errors(response.getErrorMessage());}
                } catch (Exception e) {
                    stopLoading1();
                    errors(e.getMessage());
                    e.printStackTrace();
                }
                return null;
            }

        };
        new Thread(task).start();
    }

@FXML
    public void submitSendEmail() {
         BufferedWriter b = null;
        final File f = new File("C:\\bin\\Mailbody.txt");
        try {
            b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
           // b.write(binding2.getMailbody());
            b.write(emailbody.getText());
            System.out.println("b out"+ b);
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
        if(binding1.getemail1()== null)
        { errors("Please enter atleast 1 email address");}
        if(receivedemailaddress==null)
       {errors("Oops! Only marketer can send the email");}
        else
        {   stage1.show();
            Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
       FormMailToUnderWriterRequest req1 = new FormMailToUnderWriterRequest();
       req1.setFormId(formId);
       System.out.println("subject"+binding1.getSendMailSubject());
       req1.setSubject(binding1.getSendMailSubject());
       System.out.println("received emailaddress"+receivedemailaddress);
       req1.setFrom(receivedemailaddress);
      
        byte[] bytes = WriteByteArray.getByteFromFile(f);
           
       req1.setMessage(bytes);
       String mail ="";
       
       
       if(binding1.getmail1()!=null && !binding1.getmail1().trim().equals("")){
           mail+=binding1.getmail1()+",";
       }
       if(binding1.getmail2()!=null && !binding1.getmail2().trim().equals("")){
           mail+=binding1.getmail2()+",";
       }
       
       if(binding1.getmail3()!=null && !binding1.getmail3().trim().equals("")){
           mail+=binding1.getmail3()+",";
       }
       
       if(binding1.getmail4()!=null && !binding1.getmail4().trim().equals("")){
           mail+=binding1.getmail4()+",";
       }
       
       if(binding1.getmail5()!=null && !binding1.getmail5().trim().equals("")){
           mail+=binding1.getmail5()+",";
       }
       
       if(binding1.getmail6()!=null && !binding1.getmail6().trim().equals("")){
           mail+=binding1.getmail6()+",";
       }
       
       if(binding1.getmail7()!=null && !binding1.getmail7().trim().equals("")){
           mail+=binding1.getmail7()+",";
       }
       
       if(binding1.getmail8()!=null && !binding1.getmail8().trim().equals("")){
           mail+=binding1.getmail8()+",";
       }
       
       if(binding1.getmail9()!=null && !binding1.getmail9().trim().equals("")){
           mail+=binding1.getmail9()+",";
       }
       
       if(binding1.getmail10()!=null && !binding1.getmail10().trim().equals("")){
           mail+=binding1.getmail10()+",";
       }
       
       if(binding1.getmail11()!=null && !binding1.getmail11().trim().equals("")){
           mail+=binding1.getmail11()+",";
       }
       
       if(binding1.getmail12()!=null && !binding1.getmail12().trim().equals("")){
           mail+=binding1.getmail12()+",";
       }
       
       if(binding1.getmail13()!=null && !binding1.getmail13().trim().equals("")){
           mail+=binding1.getmail13()+",";
       }
       
       if(binding1.getmail14()!=null && !binding1.getmail14().trim().equals("")){
           mail+=binding1.getmail14()+",";
       }
       
       if(binding1.getmail15()!=null && !binding1.getmail15().trim().equals("")){
           mail+=binding1.getmail15()+",";
       }
       if(binding1.getmail16()!=null && !binding1.getmail16().trim().equals("")){
           mail+=binding1.getmail16()+",";
       }
       
       if(binding1.getmail17()!=null && !binding1.getmail17().trim().equals("")){
           mail+=binding1.getmail17()+",";
       }
       
       if(binding1.getmail18()!=null && !binding1.getmail18().trim().equals("")){
           mail+=binding1.getmail18()+",";
       }
       
       if(binding1.getmail19()!=null && !binding1.getmail19().trim().equals("")){
           mail+=binding1.getmail19()+",";
       }
       
       if(binding1.getmail20()!=null && !binding1.getmail20().trim().equals("")){
           mail+=binding1.getmail20()+",";
       }
       
       if(binding1.getmail21()!=null && !binding1.getmail21().trim().equals("")){
           mail+=binding1.getmail21()+",";
       }
       
       if(binding1.getmail22()!=null && !binding1.getmail22().trim().equals("")){
           mail+=binding1.getmail22()+",";
       }

       if(binding1.getmail23()!=null && !binding1.getmail23().trim().equals("")){
           mail+=binding1.getmail23()+",";
       }
       if(binding1.getmail24()!=null && !binding1.getmail24().trim().equals("")){
           mail+=binding1.getmail24()+",";
       }
       
       if(binding1.getmail25()!=null && !binding1.getmail25().trim().equals("")){
           mail+=binding1.getmail25()+",";
       }
       
       if(binding1.getmail26()!=null && !binding1.getmail26().trim().equals("")){
           mail+=binding1.getmail26()+",";
       }
       
       if(binding1.getmail27()!=null && !binding1.getmail27().trim().equals("")){
           mail+=binding1.getmail27()+",";
       }
       if(binding1.getmail28()!=null && !binding1.getmail28().trim().equals("")){
           mail+=binding1.getmail28()+",";
       }
       if(binding1.getmail29()!=null && !binding1.getmail29().trim().equals("")){
           mail+=binding1.getmail29()+",";
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
       System.out.println(mail);
       req1.setRecpients(mail.substring(0, mail.length()));
      CommonResponseAttributes response =  port.getInsuranceOperationsPort().sendMailToUnderWriter(req1); 
      if(response!=null && response.getStatus().equals("SUCCESS")){
          stopLoading1();
          successMessage("Mail successfully sent.");
      }
      else{ stopLoading1();
          errors(response.getErrorMessage());
          System.out.println(response.getErrorMessage());
      }
                } catch (Exception e) {
                    stopLoading1();
                    errors(e.getMessage());
                    e.printStackTrace();
                }
                return null;
            }
        };
        
        new Thread(task).start();
        }
    }
    
    @FXML
    public void submitSendDelayEmail() throws DatatypeConfigurationException, com.rav.insurance.insuranceformoperations.webservice.Exception {
       if(datePicker.getSelectedDate() ==null || datePicker.getSelectedDate().equals(""))
        {InvokeAnimation.attentionSeekerWobble(datePicker);
            datePicker.setPromptText("Enter the date");
        }
       else if(receivedemailaddress==null)
       {errors("Oops! Only marketer can send the email");}
       else{
           stage1.show();
        InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
        PostFormMailRequest req1 = new PostFormMailRequest() ;
        BufferedWriter b = null;
        File f = new File("C:\\bin\\Mailbodydelay.txt");
        try {
            b = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
            b.write(delayemailbody.getText());
        } catch (Exception e) {

        } finally {
            if (b != null) {
                try {
                    b.close();
                } catch (IOException e) {
                    stopLoading1();
    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        byte[] bytes = WriteByteArray.getByteFromFile(f);
           
       req1.setMessage(bytes);
       req1.setSubject(binding1.getSendDelayedMailSubject());
       String mail ="";
       delayedemail1.setText(receivedemailaddress);
       if(binding1.getdmail1()!=null && !binding1.getdmail1().trim().equals("")){
           mail+=binding1.getdmail1()+",";
       }
       if(binding1.getdmail2()!=null && !binding1.getdmail2().trim().equals("")){
           mail+=binding1.getdmail2()+",";
       }
       
       if(binding1.getdmail3()!=null && !binding1.getdmail3().trim().equals("")){
           mail+=binding1.getdmail3()+",";
       }
       
       if(binding1.getdmail4()!=null && !binding1.getdmail4().trim().equals("")){
           mail+=binding1.getdmail4()+",";
       }
       
       if(binding1.getdmail5()!=null && !binding1.getdmail5().trim().equals("")){
           mail+=binding1.getdmail5()+",";
       }
       
       if(binding1.getdmail6()!=null && !binding1.getdmail6().trim().equals("")){
           mail+=binding1.getdmail6()+",";
       }
       
       if(binding1.getdmail7()!=null && !binding1.getdmail7().trim().equals("")){
           mail+=binding1.getdmail7()+",";
       }
       
       if(binding1.getdmail8()!=null && !binding1.getdmail8().trim().equals("")){
           mail+=binding1.getdmail8()+",";
       }
       
       if(binding1.getdmail9()!=null && !binding1.getdmail9().trim().equals("")){
           mail+=binding1.getdmail9()+",";
       }
       
       if(binding1.getdmail10()!=null && !binding1.getdmail10().trim().equals("")){
           mail+=binding1.getdmail10()+",";
       }
       
       if(binding1.getdmail11()!=null && !binding1.getdmail11().trim().equals("")){
           mail+=binding1.getdmail11()+",";
       }
       
       if(binding1.getdmail12()!=null && !binding1.getdmail12().trim().equals("")){
           mail+=binding1.getdmail12()+",";
       }
       
       if(binding1.getdmail13()!=null && !binding1.getdmail13().trim().equals("")){
           mail+=binding1.getdmail13()+",";
       }
       
       if(binding1.getdmail14()!=null && !binding1.getdmail14().trim().equals("")){
           mail+=binding1.getdmail14()+",";
       }
       
       if(binding1.getdmail15()!=null && !binding1.getdmail15().trim().equals("")){
           mail+=binding1.getdmail15()+",";
       }
       if(binding1.getdmail16()!=null && !binding1.getdmail16().trim().equals("")){
           mail+=binding1.getdmail16()+",";
       }
       
       if(binding1.getdmail17()!=null && !binding1.getdmail17().trim().equals("")){
           mail+=binding1.getdmail17()+",";
       }
       
       if(binding1.getdmail18()!=null && !binding1.getdmail18().trim().equals("")){
           mail+=binding1.getdmail18()+",";
       }
       
       if(binding1.getdmail19()!=null && !binding1.getdmail19().trim().equals("")){
           mail+=binding1.getdmail19()+",";
       }
       
       if(binding1.getdmail20()!=null && !binding1.getdmail20().trim().equals("")){
           mail+=binding1.getdmail20()+",";
       }
       
       if(binding1.getdmail21()!=null && !binding1.getdmail21().trim().equals("")){
           mail+=binding1.getdmail21()+",";
       }
       
       if(binding1.getdmail22()!=null && !binding1.getdmail22().trim().equals("")){
           mail+=binding1.getdmail22()+",";
       }

       if(binding1.getdmail23()!=null && !binding1.getdmail23().trim().equals("")){
           mail+=binding1.getdmail23()+",";
       }
       if(binding1.getdmail24()!=null && !binding1.getdmail24().trim().equals("")){
           mail+=binding1.getdmail24()+",";
       }
       
       if(binding1.getdmail25()!=null && !binding1.getdmail25().trim().equals("")){
           mail+=binding1.getdmail25()+",";
       }
       
       if(binding1.getdmail26()!=null && !binding1.getdmail26().trim().equals("")){
           mail+=binding1.getdmail26()+",";
       }
       
       if(binding1.getdmail27()!=null && !binding1.getdmail27().trim().equals("")){
           mail+=binding1.getdmail27()+",";
       }
       if(binding1.getdmail28()!=null && !binding1.getdmail28().trim().equals("")){
           mail+=binding1.getdmail28()+",";
       }
       if(binding1.getdmail29()!=null && !binding1.getdmail29().trim().equals("")){
           mail+=binding1.getdmail29()+",";
       }
       if(binding1.getdemail1()!=null && !binding1.getdemail1().trim().equals("")){
           mail+=binding1.getdemail1();
       }
       if(binding1.getdemail2()!=null && !binding1.getdemail2().trim().equals("")){
           mail+=","+binding1.getdemail2();
       }
       if(binding1.getdemail3()!=null && !binding1.getdemail3().trim().equals("")){
           mail+=","+binding1.getdemail3();
       }
       if(binding1.getdemail4()!=null && !binding1.getdemail4().trim().equals("")){
           mail+=","+binding1.getdemail4();
       }
        req1.setRecpients(mail.substring(0, mail.length()));
        req1.setFormId(formId);
        req1.setFrom(receivedemailaddress);
        GregorianCalendar c1 = new GregorianCalendar();
           if (datePicker.getSelectedDate() != null) {
               c1.setTime(datePicker.getSelectedDate());
               XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c1);
               req1.setSendDate(date);
           }
           
           CommonResponseAttributes response =  port.getInsuranceOperationsPort().registerPostFormMail(req1); 
              if(response==null){
                stopLoading1();
                successMessage("Mail will be sent.");
      }
      else{ stopLoading1();
          errors(response.getErrorMessage());
      }      
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
        
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    String response = port.getInsuranceOperationsPort().getEmailAddress(formId.replaceAll("UCCIG", ""));                    
                    if (response != null) {
                }       
                }
                catch (Exception e) {
                    errors(e.getMessage());
                    
                }
                return null;
            }
        };
        new Thread(task).start();
        sendmailsubject.setText(formId+": Application for New Business");
        emailbody.setText("");
        mail1.setSelected(false);
        email1.setText(receivedemailaddress);
        animatedMovement(-2538, 0);
    }

    @FXML
    public void sendMailLater() {
        senddelayedmailsubject.setText(formId+": Application for New Business");
        delayemailbody.setText("");
        delayedemail1.setText(receivedemailaddress);
        animatedMovement(-2538, -715);
    }

    @FXML
    public void submitAssign() {
        stage1.show();
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    AssignMarketerRequest request = new AssignMarketerRequest();
                    System.out.println(getLoggedinMarketerId());
                    request.setMarketerUserId(getLoggedinMarketerId());
                    System.out.println("Form ID in assign"+formId);
                    request.setFormId(formId);
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().assignMarketer(request);
                    stopLoading1();
                    successMessage("Successfully assigned " + getFormId() + " application to " + getLoggedinMarketerId());
                    
                } catch (Exception e) {
                    stopLoading1();
                    errors(e.getMessage());
                    e.printStackTrace();
                }
                return null;
            }

        };
        new Thread(task).start();
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
        System.out.println(os1);
        System.out.println("OpenProposal");
        
        if(os1.contains("Windows"))
        { new Rav1(new File("bin\\proposal.docx").getAbsolutePath()).execute();}
        else if (os1.contains("Mac"))
        {    new Rav1(new File("bin/proposal.docx").getAbsolutePath()).execute();}
    }
    
    @FXML
    public void openBinder(){
        System.out.println(os1);
        System.out.println("Open Binder");
        
        if(os1.contains("Windows"))
        { new Rav1(new File("bin\\binder.doc").getAbsolutePath()).execute();}
        else if (os1.contains("Mac"))
        {    new Rav1(new File("bin/binder.doc").getAbsolutePath()).execute();}
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
        stage1.show();
         Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    SearchMailRequest request = new SearchMailRequest();
                    request.setFormId(getFormId());                    
                    SearchMailResponse2 response = port.getInsuranceOperationsPort().searchMail(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        stopLoading1();
                        animatedMovement(-2538, -1430);
                        setMailList(response.getMailList());
                        successSearch1();
                    }
                    else{
                        stopLoading1();
                        errors(response.getErrorMessage());
                    }      
                } catch (Exception e) {
                    stopLoading1();
                    errors(e.getMessage());
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
                    if(os1.contains("Windows"))
                    {request.setProposal(WriteByteArray.getByteFromFile(new File("C:\\bin\\proposal.docx")));}
                    else{
                        request.setProposal(WriteByteArray.getByteFromFile(new File("bin/proposal.docx")));}
                    System.out.println("formID "+formId);
                    request.setFormId(formId);
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().uploadProposalBinder(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        successMessage("Proposal succesfully uploaded.");
                    }
                    else
                    { errors(response.getErrorCode());
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
    public void uploadBinder() {
        //yaha
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {

                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    UploadProposalBinderRequest request = new UploadProposalBinderRequest();
                    if(os1.contains("Windows"))
                    {request.setBinder(WriteByteArray.getByteFromFile(new File("C:\\bin\\proposal.doc")));}
                    else{
                       
                        request.setBinder(WriteByteArray.getByteFromFile(new File("bin/bin.docx")));}
                    request.setProposal(WriteByteArray.getByteFromFile(new File("/Users/harsimransingh/Desktop/RevisedProposal.docx")));
                    request.setFormId(formId);
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().uploadProposalBinder(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        successMessage("Binder succesfully uploaded.");
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
    public void downloadProposal() {
        //yaha
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    DownloadProposalBinderRequest request = new DownloadProposalBinderRequest();
                    request.setProposal(true);
                    request.setBinder(false);
                    request.setFormId(formId);
                    DownloadProposalBinderResponse2 response = port.getInsuranceOperationsPort().downloadProposalBinder(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        System.out.println("Inside downloadproposal");
                        System.out.println("response  "+response.getProposal());
                        proposal=response.getProposal();
                        File f1 = new File(formId);
                        if (!f1.exists()) {
                        f1.mkdir();
                        }
                        String proposalname="Proposal.docx";
                        WriteByteArray.writeByteArray(formId + "\\" + proposalname,proposal);
                        successMessage("Proposal successfully downloaded in C: drive");
                    }
                    else{System.out.println(response.getErrorMessage()); 
                        errors("No Proposal exist. Create a new one.");
                    }
                } catch (Exception e) {
                    errors(e.getMessage());
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();
    }
    @FXML
    public void downloadBinder() {
        //yaha
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    DownloadProposalBinderRequest request = new DownloadProposalBinderRequest();
                    request.setBinder(true);
                    request.setFormId(formId);
                    DownloadProposalBinderResponse2 response = port.getInsuranceOperationsPort().downloadProposalBinder(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        binder=response.getBinder();
                        File f1 = new File(formId);
                        if (!f1.exists()) {
                        f1.mkdir();
                        }
                        String bindername="Binder.doc";
                        WriteByteArray.writeByteArray(formId + "\\" + bindername, binder);
                        successMessage("Binder successfully downloaded in C: drive");
                    }
                else{ errors("No Binder exist. Create a new one.");
                    }
                } catch (Exception e) {
                    errors(e.getMessage());
                    e.printStackTrace();
                }
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
        System.out.println("Inside Submit");
        NextScreenController controller = (NextScreenController) screenPage.getControlledScreen("NextScreen");
        System.out.println("Inside Submit1");
        System.out.println("Hel"+formId);
        controller.viewApplication(form,formId);
        System.out.println("Inside Submit2");
        screenPage.setScreen("NextScreen");
        System.out.println("Inside Submit3");
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
        System.out.println("savequotes");
        stage1.show();
         Task task = new Task<Void>() {
             
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    QuoteDetailsRequest request = new QuoteDetailsRequest();
                    if (!CommonValidations.isStringEmpty(binding1.getQuote1())) {
                    request.setQuote1(Double.parseDouble(binding1.getQuote1()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote2())) {
                    request.setQuote2(Double.parseDouble(binding1.getQuote2()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote3())) {
                    request.setQuote3(Double.parseDouble(binding1.getQuote3()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote4())) {
                    request.setQuote4(Double.parseDouble(binding1.getQuote4()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote5())) {
                    request.setQuote5(Double.parseDouble(binding1.getQuote5()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote6())) {
                    request.setQuote6(Double.parseDouble(binding1.getQuote6()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote7())) {
                    request.setQuote7(Double.parseDouble(binding1.getQuote7()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote8())) {
                    request.setQuote8(Double.parseDouble(binding1.getQuote8()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote9())) {
                    request.setQuote9(Double.parseDouble(binding1.getQuote9()));
                    }
                    if (!CommonValidations.isStringEmpty(binding1.getQuote10())) {
                    request.setQuote10(Double.parseDouble(binding1.getQuote10()));
                    }
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
                    System.out.println("savequotesformid"+formId);
                    request.setFormId(formId);
                    
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().quoteDetails(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        stopLoading1();
                        successMessage("Quotes successfully saved.");
                        animatedMovement(-1269,-715);
                    }
                    else
                 {  stopLoading1();
                     errors(response.getErrorMessage());
                 }
                } catch (Exception e) {
                    stopLoading1();
                    errors(e.getMessage());
                    e.printStackTrace();
                }
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
        stage1.show();
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    SearchMailRequest req = new SearchMailRequest() ;
                    req.setFormId(getFormId());
                    GetCloseFormNQuoteDetailsResponse2 response = port.getInsuranceOperationsPort().getCloseFormNQuoteDetails(req);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        stopLoading1();
                        setQuote(response);
                        animatedMovement(-1269, -1430);
                } 
                else{   stopLoading1();
                        errors(response.getErrorMessage());
                    }
                        
                }catch (Exception e) {
                    stopLoading1();
                    e.printStackTrace();
                    animatedMovement(-1269, -1430);
                }
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
        searchwithusyes.setSelected(false);
        searchwithusno.setSelected(false);
        searchdate1.setSelected(false);
        searchdate2.setSelected(false);
        searchdate3.setSelected(false);
        searchdate4.setSelected(false);
        searcharchive.setVisible(true);
        binding.setsearchwithusyes("");
        binding.setsearchdate1("");
    }
     @FXML
    public void searcharchiveback1() {
        if (marketerId == null || marketerId.trim().isEmpty()) {
            searchapplicationid.setText("");
            searchproducerid.setText("");
            searchbusinessname.setText("");
            searchmarketerid.setText("");
            searchwithusyes.setSelected(false);
            searchwithusno.setSelected(false);
            searchdate1.setSelected(false);
            searchdate2.setSelected(false);
            searchdate3.setSelected(false);
            searchdate4.setSelected(false);
            binding.setsearchapplicationid("");
            binding.setsearchbusinessname("");
            binding.setsearchmarketerid("");
            binding.setsearchproducerid("");
            screenPage.setScreen("NextScreen");
        } else {
            animatedMovement(0, 0);
             binding.setsearchapplicationid("");
            binding.setsearchbusinessname("");
            binding.setsearchmarketerid("");
            binding.setsearchproducerid("");
            searchapplicationid.setText("");
            searchproducerid.setText("");
            searchbusinessname.setText("");
            searchmarketerid.setText("");
            searchwithusyes.setSelected(false);
            searchwithusno.setSelected(false);
            searchdate1.setSelected(false);
            searchdate2.setSelected(false);
            searchdate3.setSelected(false);
            searchdate4.setSelected(false);
        }
    }
    
    @FXML
    public void opencloseApplication() {
        System.out.println("Inside  opencloseapplication");
        stage1.show();
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    SearchMailRequest req = new SearchMailRequest() ;
                    req.setFormId(getFormId());
                    GetCloseFormNQuoteDetailsResponse2 response = port.getInsuranceOperationsPort().getCloseFormNQuoteDetails(req);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        stopLoading1();
                        setclosedetails(response);
                        closeapplicationpane.setVisible(true);
                } 
                else{   
                    stopLoading1();
                    errors(response.getErrorMessage());
                }
                        
                }catch (Exception e) {
                    stopLoading1();
                    e.printStackTrace();
                    closeapplicationpane.setVisible(true);
                }
                return null;
            }
        };
        new Thread(task).start();
         
    }
    
    @FXML
    public void backSaveQuote() {
        closeapplicationpane.setVisible(false);
        sendmailPane.setVisible(false); 
        //clearing fields from quote page
        companyname1.setText("");
        quote1.setText("");
        comment1.setText("");
        companyname2.setText("");
        quote2.setText("");
        comment2.setText("");
        companyname3.setText("");
        quote3.setText("");
        comment3.setText("");
        companyname4.setText("");
        quote4.setText("");
        comment4.setText("");
        companyname5.setText("");
        quote5.setText("");
        comment5.setText("");
        companyname6.setText("");
        quote6.setText("");
        comment6.setText("");
        companyname7.setText("");
        quote7.setText("");
        comment7.setText("");
        companyname8.setText("");
        quote8.setText("");
        comment8.setText("");
        companyname9.setText("");
        quote9.setText("");
        comment9.setText("");
        companyname10.setText("");
        quote10.setText("");
        comment10.setText("");
        
        //hiding all labels from conversation window
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        l8.setVisible(false);
        l9.setVisible(false);
        l10.setVisible(false);
        l11.setVisible(false);
        l12.setVisible(false);
        l13.setVisible(false);
        l14.setVisible(false);
        l15.setVisible(false);
        l16.setVisible(false);
        l17.setVisible(false);
        l18.setVisible(false);
        l19.setVisible(false);
        l20.setVisible(false);
        l21.setVisible(false);
        l22.setVisible(false);
        l23.setVisible(false);
        l24.setVisible(false);
        l25.setVisible(false);
        l26.setVisible(false);
        l27.setVisible(false);
        l28.setVisible(false);
        l29.setVisible(false);
        l30.setVisible(false);
        l31.setVisible(false);
        l32.setVisible(false);
        l33.setVisible(false);
        l34.setVisible(false);
        l35.setVisible(false);
        l36.setVisible(false);
        l37.setVisible(false);
        l38.setVisible(false);
        l39.setVisible(false);
        l40.setVisible(false);
        l41.setVisible(false);
        l42.setVisible(false);
        l43.setVisible(false);
        l44.setVisible(false);
        l45.setVisible(false);
        l46.setVisible(false);
        l47.setVisible(false);
        l48.setVisible(false);
        l49.setVisible(false);
        l50.setVisible(false);
        l51.setVisible(false);
        l52.setVisible(false);
        l53.setVisible(false);
        l54.setVisible(false);
        l55.setVisible(false);
        l56.setVisible(false);
        l57.setVisible(false);
        l59.setVisible(false);
        l58.setVisible(false);
        l60.setVisible(false);
        l61.setVisible(false);
        l62.setVisible(false);
        l63.setVisible(false);
        l64.setVisible(false);
        l65.setVisible(false);
        l66.setVisible(false);
        l67.setVisible(false);
        l68.setVisible(false);
        l69.setVisible(false);
        l70.setVisible(false);
        l71.setVisible(false);
        l72.setVisible(false);
        l73.setVisible(false);
        l74.setVisible(false);
        l75.setVisible(false);
        l76.setVisible(false);
        l77.setVisible(false);
        l78.setVisible(false);
        l79.setVisible(false);
        l80.setVisible(false);
        animatedMovement(-1269, -715);
    }
    @FXML
    public void backCloseApplication() {
         closeapplicationpane.setVisible(false);
         // here 
         closecompany.setText("");
         closequote.setText("");
         closeboundedyes.setSelected(false);
         closeboundedno.setSelected(false);
    }

    @FXML
    public void submitCloseApplication() {
        System.out.println(binding1.getCloseBounded());
        stage1.show();
        Task task;
        task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    CloseFormRequest req = new CloseFormRequest();
                    req.setFormId(getFormId());
                    req.setCompany(binding1.getCloseCompany());
                    req.setBusinessWithUs(binding1.getCloseBounded());
                    if (!CommonValidations.isStringEmpty(binding1.getCloseQuote())) {
                        req.setQuote(Double.parseDouble(binding1.getCloseQuote()));}
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().closeForm(req);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        stopLoading1();
                        if(binding1.getCloseBounded().equalsIgnoreCase("yes"))
                        {successMessage("Good job! The status of the form has been updated as closed.");}
                        else if (binding1.getCloseBounded().equalsIgnoreCase("no"))
                        {successMessage("The status of the form has been updated as closed.");}
                        closeapplicationpane.setVisible(false);
                    }
                    else{
                    errors(response.getErrorMessage());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    errors(e.getMessage());
                }
                return null;
            }
        };
        new Thread(task).start();
    }
    int foo;
    @FXML
    public void searchSubmit() {
        stage.show();
        Task task;
        task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormListRequest req = new GetInsuranceFormListRequest();
                    System.out.println("producer"+binding.getsearchproducerid());
                    System.out.println("marketer"+binding.getsearchmarketerid());
                    System.out.println("business"+binding.getsearchbusinessname());
                    System.out.println("id"+binding.getsearchapplicationid());
                    
                    req.setProducerId(binding.getsearchproducerid());
                    req.setMarketerId(binding.getsearchmarketerid());
                    req.setBusinessName(binding.getsearchbusinessname());
                    String searchformid="";
                    
                    if(CommonValidations.isStringEmpty(binding.getsearchapplicationid()))
                    {}
                    else
                    {
                     if(binding.getsearchapplicationid().contains("UCCIG")||binding.getsearchapplicationid().contains("UCCIG "))
                    {searchformid=binding.getsearchapplicationid().replace("UCCIG", "").trim();}
                     
                    
                    else if(binding.getsearchapplicationid().contains("uccig")||binding.getsearchapplicationid().contains("uccig "))
                    {searchformid=binding.getsearchapplicationid().replace("uccig", "").trim();}
                    else 
                    {searchformid=binding.getsearchapplicationid().trim();}
                        System.out.println("form id"+searchformid);
                     foo=Integer.parseInt(searchformid.trim());
                        System.out.println(foo);
                    }
                    req.setFormId(foo);
                    System.out.println("date"+binding.getsearchdate1());
                    System.out.println("Bounded"+binding.getsearchwithusyes());
                    if(!CommonValidations.isStringEmpty(binding.getsearchdate1()))
                    {switch (binding.getsearchdate1()) {
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
                    }
                    if (!CommonValidations.isStringEmpty(binding.getsearchwithusyes()))
                    {switch (binding.getsearchwithusyes()) {
                        case "Yes":
                            req.setWithUs("Yes");
                            break;
                        case "No":
                            req.setWithUs("No");
                            break;
                        case "":
                            break;
                    }
                    }
                    GetInsuranceFormListResponse response = port.getInsuranceOperationsPort().getFormList(req);

                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        searchproducerid.setText("");
                        searchmarketerid.setText("");
                        searchapplicationid.setText("");
                        searchbusinessname.setText("");
                        searchwithusyes.setSelected(false);
                        searchwithusno.setSelected(false);
                        searchdate1.setSelected(false);
                        searchdate2.setSelected(false);
                        searchdate3.setSelected(false);
                        searchdate4.setSelected(false);
                        abstractFormInfoList = response.getFormList();
                        stopLoading();
                        successSearch();
                    }
                    else{
                        stopLoading();
                        System.out.println(response.getErrorMessage());
                        successMessage("Oops! No matching results found.");
                    }
                } catch (Exception e) {
                    stopLoading();
                    successMessage(e.getMessage());
                    e.printStackTrace();
                }
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
            dl.getController().setCreationDate(abstractFormInfoList.get(k).getCreationDate().toXMLFormat());
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
    
    public void setclosedetails(final GetCloseFormNQuoteDetailsResponse2 response) {
        if (response.getBusinessWithUs() != null)
        {  closebutton.setDisable(true);
            Platform.runLater(new Runnable() {

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone(); //To change body of generated methods, choose Tools | Templates.
            }

            public void run() {
                System.out.println("Inside SetClose");
                if ((!CommonValidations.isStringEmpty(response.getBusinessWithUs())) && (response.getBusinessWithUs().contains("Yes") || response.getBusinessWithUs().contains("No"))) {
                    closecompany.setText(response.getCompany());
                    closequote.setText("" + response.getQuote());
                    if (response.getBusinessWithUs() != null && response.getBusinessWithUs().contains("Yes")) {
                        closeboundedyes.setSelected(true);
                    } else if (response.getBusinessWithUs() != null && response.getBusinessWithUs().contains("No")) {
                        closeboundedno.setSelected(true);
                    }
                }
            }
        });
    }
    }
    public void setQuote(final GetCloseFormNQuoteDetailsResponse2 response){
         Platform.runLater(new Runnable() {
                
             @Override
             protected Object clone() throws CloneNotSupportedException {
                 return super.clone(); //To change body of generated methods, choose Tools | Templates.
             }

            public void run() {
                System.out.println("Inside SetQuote");
                 if(response.getQuote1()>0){
                           companyname1.setText(response.getCompanyname1());
                           quote1.setText(""+response.getQuote1());
                               comment1.setText(response.getComment1());
                  }
                 System.out.println("Inside SetQuote1");
                 if(response.getQuote2()>0){
                           companyname2.setText(response.getCompanyname2());
                           quote2.setText(""+response.getQuote2());
                               comment2.setText(response.getComment2());
                  }
                 if(response.getQuote3()>0){
                           companyname3.setText(response.getCompanyname3());
                           quote3.setText(""+response.getQuote3());
                               comment3.setText(response.getComment3());
                  }
                 if(response.getQuote4()>0){
                           companyname4.setText(response.getCompanyname4());
                           quote4.setText(""+response.getQuote4());
                               comment4.setText(response.getComment4());
                  }
                  if(response.getQuote5()>0){
                           companyname5.setText(response.getCompanyname5());
                           quote5.setText(""+response.getQuote5());
                               comment5.setText(response.getComment5());
                  }
                   if(response.getQuote6()>0){
                           companyname6.setText(response.getCompanyname6());
                           quote6.setText(""+response.getQuote6());
                               comment6.setText(response.getComment6());
                  }
                   if(response.getQuote7()>0){
                           companyname7.setText(response.getCompanyname7());
                           quote7.setText(""+response.getQuote7());
                               comment7.setText(response.getComment7());
                  }
                   if(response.getQuote8()>0){
                           companyname8.setText(response.getCompanyname8());
                           quote8.setText(""+response.getQuote8());
                               comment8.setText(response.getComment8());
                  }
                   if(response.getQuote9()>0){
                           companyname9.setText(response.getCompanyname9());
                           quote9.setText(""+response.getQuote9());
                               comment9.setText(response.getComment9());
                  }
                   if(response.getQuote10()>0){
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
                                   l1.setVisible(true);
                                   l2.setVisible(true);
                                   l3.setVisible(true);
                                   l4.setVisible(true);
                                   l1.setText(a.getSentdDate().toString());
                                   l2.setText(a.getFrom());
                                   l3.setText(a.getSubject());
                                   break;
                               case 1:
                                   l5.setVisible(true);
                                   l6.setVisible(true);
                                   l7.setVisible(true);
                                   l8.setVisible(true);
                                   l5.setText(a.getSentdDate().toString());
                                   l6.setText(a.getFrom());
                                   l7.setText(a.getSubject());
                                   break;
                               case 2:
                                   l9.setVisible(true);
                                   l10.setVisible(true);
                                   l11.setVisible(true);
                                   l12.setVisible(true);
                                   l9.setText(a.getSentdDate().toString());
                                   l10.setText(a.getFrom());
                                   l11.setText(a.getSubject());
                                   break;
                               case 3:
                                   l13.setVisible(true);
                                   l14.setVisible(true);
                                   l15.setVisible(true);
                                   l16.setVisible(true);
                                   l13.setText(a.getSentdDate().toString());
                                   l14.setText(a.getFrom());
                                   l15.setText(a.getSubject());
                                   break;
                               case 4:
                                   l17.setVisible(true);
                                   l18.setVisible(true);
                                   l19.setVisible(true);
                                   l20.setVisible(true);
                                   l17.setText(a.getSentdDate().toString());
                                   l18.setText(a.getFrom());
                                   l19.setText(a.getSubject());
                                   break;
                               case 5:
                                   l21.setVisible(true);
                                   l22.setVisible(true);
                                   l23.setVisible(true);
                                   l24.setVisible(true);
                                   l21.setText(a.getSentdDate().toString());
                                   l22.setText(a.getFrom());
                                   l23.setText(a.getSubject());
                                   break;
                               case 6:
                                   l25.setVisible(true);
                                   l26.setVisible(true);
                                   l27.setVisible(true);
                                   l28.setVisible(true);
                                   l25.setText(a.getSentdDate().toString());
                                   l26.setText(a.getFrom());
                                   l27.setText(a.getSubject());
                                   break;
                               case 7:
                                   l29.setVisible(true);
                                   l30.setVisible(true);
                                   l31.setVisible(true);
                                   l32.setVisible(true);
                                   l29.setText(a.getSentdDate().toString());
                                   l30.setText(a.getFrom());
                                   l31.setText(a.getSubject());
                                   break;
                               case 8:
                                   l33.setVisible(true);
                                   l34.setVisible(true);
                                   l35.setVisible(true);
                                   l36.setVisible(true);
                                   l33.setText(a.getSentdDate().toString());
                                   l34.setText(a.getFrom());
                                   l35.setText(a.getSubject());
                                   break;
                               case 9:
                                   l37.setVisible(true);
                                   l38.setVisible(true);
                                   l39.setVisible(true);
                                   l40.setVisible(true);
                                   l37.setText(a.getSentdDate().toString());
                                   l38.setText(a.getFrom());
                                   l39.setText(a.getSubject());
                                   break;   
                               case 10:
                                   l41.setVisible(true);
                                   l42.setVisible(true);
                                   l43.setVisible(true);
                                   l44.setVisible(true);
                                   l41.setText(a.getSentdDate().toString());
                                   l42.setText(a.getFrom());
                                   l43.setText(a.getSubject());
                                   break; 
                               case 11:
                                   l45.setVisible(true);
                                   l46.setVisible(true);
                                   l47.setVisible(true);
                                   l48.setVisible(true);
                                   l45.setText(a.getSentdDate().toString());
                                   l46.setText(a.getFrom());
                                   l47.setText(a.getSubject());
                                   break;      
                               case 12:
                                   l49.setVisible(true);
                                   l50.setVisible(true);
                                   l51.setVisible(true);
                                   l52.setVisible(true);
                                   l49.setText(a.getSentdDate().toString());
                                   l50.setText(a.getFrom());
                                   l51.setText(a.getSubject());
                                   break;   
                               case 13:
                                   l53.setVisible(true);
                                   l54.setVisible(true);
                                   l55.setVisible(true);
                                   l56.setVisible(true);
                                   l53.setText(a.getSentdDate().toString());
                                   l54.setText(a.getFrom());
                                   l55.setText(a.getSubject());
                                   break;       
                               case 14:
                                   l57.setVisible(true);
                                   l59.setVisible(true);
                                   l58.setVisible(true);
                                   l60.setVisible(true);
                                   l57.setText(a.getSentdDate().toString());
                                   l58.setText(a.getFrom());
                                   l59.setText(a.getSubject());
                                   break;
                               case 15:
                                   l61.setVisible(true);
                                   l62.setVisible(true);
                                   l63.setVisible(true);
                                   l64.setVisible(true);
                                   l61.setText(a.getSentdDate().toString());
                                   l62.setText(a.getFrom());
                                   l63.setText(a.getSubject());
                                   break;    
                               case 16:
                                   l65.setVisible(true);
                                   l66.setVisible(true);
                                   l67.setVisible(true);
                                   l68.setVisible(true);
                                   l65.setText(a.getSentdDate().toString());
                                   l66.setText(a.getFrom());
                                   l67.setText(a.getSubject());
                                   break;   
                               case 17:
                                   l69.setVisible(true);
                                   l70.setVisible(true);
                                   l71.setVisible(true);
                                   l72.setVisible(true);
                                   l69.setText(a.getSentdDate().toString());
                                   l70.setText(a.getFrom());
                                   l71.setText(a.getSubject());
                                   break;
                               case 18:
                                   l73.setVisible(true);
                                   l74.setVisible(true);
                                   l75.setVisible(true);
                                   l76.setVisible(true);
                                   l73.setText(a.getSentdDate().toString());
                                   l74.setText(a.getFrom());
                                   l75.setText(a.getSubject());
                                   break;
                               case 19:
                                   l77.setVisible(true);
                                   l78.setVisible(true);
                                   l79.setVisible(true);
                                   l80.setVisible(true);
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
     public void stopLoading() {
        Platform.runLater(new Runnable() {
            public void run() {
                if (stage != null) {
                    stage.hide();
                }
            }
        });
    }
     public void stopLoading1() {
        Platform.runLater(new Runnable() {
            public void run() {
                if (stage1 != null) {
                    stage1.hide();
                }
            }
        });
    }

}
