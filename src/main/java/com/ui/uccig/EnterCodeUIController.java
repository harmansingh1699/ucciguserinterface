/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import antlr.CommonAST;
import com.rav.insurance.insuranceformoperations.webservice.InsuranceOperationsService_Service;
import com.rav.insurance.insuranceformoperations.webservice.contracts.AbstractFormInfo;
import com.rav.insurance.insuranceformoperations.webservice.contracts.AssignMarketerRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CloseFormRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CloseFormResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CommonResponseAttributes;
import com.rav.insurance.insuranceformoperations.webservice.contracts.FormMailToUnderWriterRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetCloseFormNQuoteDetailsResponse2;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormListRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormListResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.MailInfo;
import com.rav.insurance.insuranceformoperations.webservice.contracts.QuoteDetailsRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchMailRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchMailResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchMailResponse2;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchQuotesRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchQuotesResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.SearchQuotesResponse2;
import com.rav.insurance.insuranceformoperations.webservice.contracts.UploadProposalBinderRequest;
import com.rav.insurance.util.WriteByteArray;
import com.ui.binding.FormEntry4Binding;
import com.ui.binding.SearchArchivebinding;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.application.Platform;
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
import javafx.scene.control.Dialogs;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import ravrun.Rav;

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
    private CheckBox searchdate1;

    @FXML
    private CheckBox searchdate2;

    @FXML
    private CheckBox searchdate3;

    @FXML
    private CheckBox searchdate4;
    
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
    private Label l10;
    @FXML
    private Label l11;
    @FXML
    private Label l12;
    @FXML
    private Label l13;
    @FXML
    private Label l14;
    @FXML
    private Label l15;
    @FXML
    private Label l16;
    @FXML
    private Label l17;
    
    private List<MailInfo> mailList;
    
    @FXML
    private Hyperlink l131;
    

    @FXML
    private Label title;
    
    @FXML
    private TextField closecompany;
    @FXML
    private TextField closequote;
    

    private SearchArchivebinding binding;
    private FormEntry4Binding binding1;

    private int offset;

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
        this.receivedname = receivedname;
    }
    

    private String formId;

    public void setApplicationId(String applicationId) {
        title.setText(applicationId);
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }
    
    @FXML
    public void hyderlinkAction1(){
        try { 
            stage = new Stage();
            FlowPane root = new FlowPane();
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/mailScene.fxml"));
            Parent loadScreen;
      ((mailSceneController) myLoader.getController()).getWebView().getEngine().load(mailList.get(0).getMailBody());
            loadScreen = (Parent) myLoader.load();
        
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

    public void setMarketerId(String marketerId) {
        this.marketerId = marketerId;
    }

    public String getMarketerId() {
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
    
        
        /*  int j = 0;
         for (int i = 0; i < str.size(); i++) {
         System.out.println(str.size());

         // gridpane.getChildren().add(new dynamicloading());
         dynamicloading dl = new dynamicloading();
         dl.getController().setProducer(str.get(i));
         if (i % 4 == 0 && i > 0) {
         j++;
         }
         gridpane.add(dl, i % 4, j);
         }
         animatedMovement(-1269, 0);*/
    }

    @FXML
    public void submitUnassigned() throws Exception {
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormListRequest req = new GetInsuranceFormListRequest();
                    req.setProducerId(binding.getsearchproducerid());
                    req.setStatus("NEW");
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
    
        /* int j = 0;
         for (int i = 0; i < str.size(); i++) {
         System.out.println(str.size());

         // gridpane.getChildren().add(new dynamicloading());
         dynamicloading dl = new dynamicloading();
         dl.getController().setProducer(str.get(i));
         if (i % 4 == 0 && i > 0) {
         j++;
         }
         gridpane.add(dl, i % 4, j);
         }
         animatedMovement(-1269, 0);*/
    }

@FXML
    public void submitSendEmail() {
       InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
       FormMailToUnderWriterRequest req1 = new FormMailToUnderWriterRequest();
       req1.setFormId(formId);
       req1.setFrom(receivedemailaddress);
       String mail ="";
       if(binding1.getmail1()!=null && !binding1.getmail1().trim().equals("")){
           mail+=binding1.getmail1()+",";
       }
       req1.setRecpients(mail.substring(0, mail.length()));
       req1.setRecpients(formId);
    }
    
    @FXML
    public void submitSendDelayEmail() {
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

                    request.setMarketerUserId(getMarketerId());
                    request.setFormId(title.getText());
                    CommonResponseAttributes response = port.getInsuranceOperationsPort().assignMarketer(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        successMessage("Assigned " + getFormId() + " to " + getMarketerId());
                    }
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
                Dialogs.showInformationDialog(null, message, "Success", "Success");

            }
        });
    }
    
     @FXML
    public void closeProposal(){
        proposalbinder.setVisible(false);
    }
    @FXML
    public void openProposal(){
        new Rav("/Users/harsimransingh/Desktop/RevisedProposal.docx").execute();
    }
    
    @FXML
    public void openBinder(){
        new Rav("/Users/harsimransingh/Desktop/RevisedProposal.docx").execute();
    }

    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                Dialogs.showErrorDialog(null, message, "Oops!!", "Error");
            }
        });
    }

    @FXML
    public void submitConversation() {
         Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    SearchMailRequest request = new SearchMailRequest();
                    request.setFormId(getFormId());
                    
                    
                    
                    SearchMailResponse2 response = port.getInsuranceOperationsPort().searchMail(request);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        mailList = response.getMailList();
                        int i =0;
                        for(MailInfo a:mailList){
                           switch(i){
                               case 0: l10.setText(a.getMailBody());
                               
                                   break;
                               case 1:
                                   break;
                               case 2:
                                   break;
                               case 3:
                                   break;
                           }
                           
                        }
                        successSearch();
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
                        successSearch();
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
    public void searchPrevious() {
        if (offset > 0) {
            offset -= 1;
            gridpane.getChildren().removeAll(gridpane.getChildren());
            try {
                showAbstractInfo();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    @FXML
    public void searchNext() {
        offset += 1;
        gridpane.getChildren().removeAll(gridpane.getChildren());
        try {
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
    public void submitSendtoUnderwriter() {
        sendmailPane.setVisible(true);
    }

    @FXML
    public void goToSearchResults() {
        animatedMovement(-1269, -715);
    }
    @FXML
    public void backMail() {
        animatedMovement(-1269, -715);
    }
    @FXML
    public void backDelayMail() {
        animatedMovement(-1269, -715);
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
        
    }

    @FXML
    public void homebutton() {
        animatedMovement(0, 0);
    }

    @FXML
    public void saveQuotes() {
        animatedMovement(-1269, -715);
    }
    
    @FXML
    public void clickCloseApplication() {
        closeapplicationpane.setVisible(true);
    }

    @FXML
    public void submitCloseApplication() {
      
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

    @FXML
    public void searchSubmit() {
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormListRequest req = new GetInsuranceFormListRequest();
                    req.setProducerId(binding.getsearchproducerid());
                    req.setMarketerId(binding.getsearchmarketerid());
                    req.setBusinessName(binding.getsearchbusinessname());
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
        for (int i = 0; i < abstractFormInfoList.size() % 24 + offset; i++) {

            // gridpane.getChildren().add(new dynamicloading());
            dynamicloading dl = new dynamicloading(screenPage);
            dl.getController().setProducer(abstractFormInfoList.get(i + offset).getProducerId());
            dl.getController().setApplicationId(abstractFormInfoList.get(i + offset).getFormId());
            //dl.getController().setBusinessName(abstractFormInfoList.get(i + offset).get);
            //dl.getController().setDate(abstractFormInfoList.get(i + offset).get);
            //dl.getController().setSeverity(abstractFormInfoList.get(i + offset).get);

            if (i % 4 == 0 && i > 0) {
                j++;
            }
            gridpane.add(dl, i % 4, j);
        }
    }

    public void successSearch() {
        Platform.runLater(new Runnable() {

            public void run() {
                offset = 0;
                try {
                    showAbstractInfo();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                animatedMovement(-1269, 0);
            }
        });
    }

    @FXML
    public void searchAgain() {
        NextScreenController controller = (NextScreenController) screenPage.getControlledScreen("NextScreen");
        
        controller.viewApplication(form,form.getFormId());
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
