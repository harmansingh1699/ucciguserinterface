/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.rav.insurance.insuranceformoperations.webservice.InsuranceOperationsService_Service;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormListRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialogs;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

/**
 *
 * @author harsimransingh
 */
public class SceneController implements Initializable {
    
    @FXML
    private Label marketer;
    @FXML
    private Label severity;
    @FXML
    private Label producer;
    @FXML
    private Hyperlink applicationid;
    @FXML
    private Label businessname;
    private String withUs;
    private String status;
    private String creationDate;
    private String branch;
    private String insurancetype;
    private String insurancecategory;

    public String getInsurancetype() {
        return insurancetype;
    }

    public void setInsurancetype(String insurancetype) {
        this.insurancetype = insurancetype;
    }

    public String getInsurancecategory() {
        return insurancecategory;
    }

    public void setInsurancecategory(String insurancecategory) {
        this.insurancecategory = insurancecategory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getWithUs() {
        return withUs;
    }

    public void setWithUs(String withUs) {
        this.withUs = withUs;
    }
    
    
    
    private ScreenNavigator screenPage;
    
    public void setScreenNavigator(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void setProducer(String producer) {
        this.producer.setText(producer);
    }
    
    public void setBusinessName(String producer) {
        this.businessname.setText(producer);
    }
    
    public void setmarketer(String producer) {
        this.marketer.setText(producer);
    }
    
    public void setSeverity(String producer) {
        this.severity.setText(producer);
    }
    
    public void setApplicationId(String producer) {
        this.applicationid.setText(producer);
    }
    
    @FXML
    public void openForm() {
        /*Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormRequest req = new GetInsuranceFormRequest();
                    req.setFormId(applicationid.getText());
                   // req.setProducerId(binding.getsearchproducerid());
                    //req.setStatus("NEW");
                    //req.setFormId(Integer.parseInt(binding.getsearchapplicationid()));
                    
                    GetInsuranceFormResponse response = port.getInsuranceOperationsPort().getForm(req);

                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        setAttributes(  response);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                //   successMessage("You are successfully logged in");
                return null;
            }

        };
        new Thread(task).start();*/
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setApplicationId(applicationid.getText(), businessname.getText());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setFormId(applicationid.getText());
        
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setProducerid(this.producer.getText());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setMarketerId(marketer.getText());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setInsuranceType(getInsurancetype());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setSeverity(severity.getText());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setCategory(getInsurancecategory());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setCreationDate(getCreationDate());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setBranch(getBranch());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setWithUs(getWithUs());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).animatedMovement(-1269, -715);
        
        //((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).viewApplication(null,applicationid.getText());
        
        
    }
    
    /*public void setAttributes( final GetInsuranceFormResponse response){
         Platform.runLater(new Runnable() {
            public void run() {
        //Setting values for dynamic fxml values
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setApplicationId(applicationid.getText());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).animatedMovement(-1269, -715);
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setFormId(applicationid.getText());
        ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).viewApplication(response,applicationid.getText());
            }
        });
    }*/
    
}
