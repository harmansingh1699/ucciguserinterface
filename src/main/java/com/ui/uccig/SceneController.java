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
    private Label date;
    @FXML
    private Label severity;
    @FXML
    private Label producer;
    @FXML
    private Hyperlink applicationid;
    @FXML
    private Label businessname;
    
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
    
    public void setDate(String producer) {
        this.date.setText(producer);
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
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setApplicationId(applicationid.getText());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).animatedMovement(-1269, -715);
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setFormId(applicationid.getText());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setFormId(applicationid.getText());
        //((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).viewApplication(null,applicationid.getText());
        
        
    }
    
    public void setAttributes( final GetInsuranceFormResponse response){
         Platform.runLater(new Runnable() {
            public void run() {
        //Setting values for dynamic fxml values
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setApplicationId(applicationid.getText());
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).animatedMovement(-1269, -715);
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setFormId(applicationid.getText());
        ((NextScreenController) (screenPage.getControlledScreen("NextScreen"))).viewApplication(response,applicationid.getText());
            }
        });
    }
    
}
