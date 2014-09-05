/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.rav.insurance.insuranceformoperations.webservice.InsuranceOperationsService_Service;
import com.rav.insurance.insuranceformoperations.webservice.contracts.AbstractFormInfo;
import com.rav.insurance.insuranceformoperations.webservice.contracts.AssignMarketerRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CommonRequestAttributes;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CommonResponseAttributes;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormListRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormListResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import com.ui.binding.SearchArchivebinding;
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
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Dialogs;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class EnterCodeUIController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;
    List<AbstractFormInfo> abstractFormInfoList = new ArrayList<AbstractFormInfo>();
    private GetInsuranceFormResponse form;

    @FXML
    private Pane searcharchive2;

    @FXML
    private Pane searcharchive;

    @FXML
    private Pane fullScreenPane;

    @FXML
    private Pane sendmailPane;

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
    private CheckBox searchdate1;

    @FXML
    private CheckBox searchdate2;

    @FXML
    private CheckBox searchdate3;

    @FXML
    private CheckBox searchdate4;

    @FXML
    private Label title;

    private SearchArchivebinding binding;

    private int offset;

    private String marketerId;

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

    /**
     * Initializes the controller class.
     *
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binding = new SearchArchivebinding();
        Bindings.bindBidirectional(searchproducerid.textProperty(), binding.searchproduceridProperty());
        Bindings.bindBidirectional(searchmarketerid.textProperty(), binding.searchmarketeridProperty());
        Bindings.bindBidirectional(searchbusinessname.textProperty(), binding.searchbusinessnameProperty());
        Bindings.bindBidirectional(searchapplicationid.textProperty(), binding.searchapplicationidProperty());

    }

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

    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                Dialogs.showErrorDialog(null, message, "Oops!!", "Error");
            }
        });
    }

    @FXML
    public void submitConversation() {
    }

    @FXML
    public void submitProposalBinder() {
        //yaha
        new Rav("a.docx").execute();
    }

    @FXML
    public void submitSendtoUnderwriter() {
        sendmailPane.setVisible(true);
    }

    @FXML
    public void submitRenewBusiness() {
    }

    @FXML
    public void submitSaveQuotes() {
        animatedMovement(-1269, -1430);
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
    public void submitCloseApplication() {
        closeapplicationpane.setVisible(true);

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
        controller.viewApplication(form);
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
