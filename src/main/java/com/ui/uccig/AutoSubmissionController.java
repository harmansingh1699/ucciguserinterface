/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import com.ui.binding.FormEntry4Binding;
import com.ui.util.SavingFile;
import com.ui.util.savinglocally;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class AutoSubmissionController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;
    
    @FXML
    TextField autocurrentinsurer;

    @FXML
    private TextField autocurrentexpirydate;

    @FXML
    private TextField autopremiumtarget;

    @FXML
    private TextField lessholder1;
    
    @FXML
    private TextField lessholder2;
    
    @FXML
    private TextField lessholder3;
    

    @FXML
    private TextField autovehicle1;
    @FXML
    private TextField autovehicle2;
    @FXML
    private TextField autovehicle3;

    @FXML
    private TextField autodateofclaim1;
    @FXML
    private TextField autodateofclaim2;
    @FXML
    private TextField autodateofclaim3;

    @FXML
    private TextField autodescriptionofclaim1;
    @FXML
    private TextField autodescriptionofclaim2;
    @FXML
    private TextField autodescriptionofclaim3;

    @FXML
    private TextArea commoditiestransported;
    
    @FXML
    private TextField liststate1;
    @FXML
    private TextField liststate2;
    @FXML
    private TextField liststate3;
    @FXML
    private TextField liststate4;
    
    @FXML
    private TextField usdot1;
    @FXML
    private TextField usdot2;
    @FXML
    private TextField usdot3;
    @FXML
    private TextField usdot4;
    
    @FXML
    private TextField docket1;
    @FXML
    private TextField docket2;
    @FXML
    private TextField docket3;
    @FXML
    private TextField docket4;
    
    @FXML
    private TextField typeoffiling1;
    @FXML
    private TextField typeoffiling2;
    @FXML
    private TextField typeoffiling3;
    @FXML
    private TextField typeoffiling4;
    
    @FXML
    private TextField namerequired1;
    @FXML
    private TextField namerequired2;
    @FXML
    private TextField namerequired3;
    @FXML
    private TextField namerequired4;
    @FXML
    private ChoiceBox<String> nonownedliability;
    @FXML
    private ChoiceBox<String> nonownedcontract;
    
    @FXML
    private TextField typeofnonowned;
    
    @FXML
    private TextField anytime;
    
    @FXML
    private TextField avgvalue;
    
    @FXML
    private TextField maxannually;
    
    @FXML
    private TextField mostexpensive;
    
    @FXML
    private TextArea autosubmissioncomments;
   
    @FXML
    private Pane fullScreenPane;

    public FormEntry4Binding binding4;

     /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binding4=new FormEntry4Binding();
        Bindings.bindBidirectional(autocurrentinsurer.textProperty(), binding4.autocurrentinsurerProperty());
        Bindings.bindBidirectional(autocurrentexpirydate.textProperty(), binding4.autocurrentexpirydateProperty());
        Bindings.bindBidirectional(autopremiumtarget.textProperty(), binding4.autopremiumtargetProperty());
        Bindings.bindBidirectional(lessholder1.textProperty(), binding4.lessholder1Property());
        Bindings.bindBidirectional(lessholder2.textProperty(), binding4.lessholder2Property());
        Bindings.bindBidirectional(lessholder3.textProperty(), binding4.lessholder3Property());
        Bindings.bindBidirectional(autovehicle1.textProperty(), binding4.autovehicle1Property());
        Bindings.bindBidirectional(autovehicle2.textProperty(), binding4.autovehicle2Property());
        Bindings.bindBidirectional(autovehicle3.textProperty(), binding4.autovehicle3Property());
        Bindings.bindBidirectional(autodateofclaim1.textProperty(), binding4.autodateofclaim1Property());
        Bindings.bindBidirectional(autodateofclaim2.textProperty(), binding4.autodateofclaim2Property());
        Bindings.bindBidirectional(autodateofclaim3.textProperty(), binding4.autodateofclaim3Property());
        Bindings.bindBidirectional(commoditiestransported.textProperty(), binding4.commoditiestransportedProperty());
        Bindings.bindBidirectional(liststate1.textProperty(), binding4.liststate1Property());
        Bindings.bindBidirectional(liststate2.textProperty(), binding4.liststate2Property());
        Bindings.bindBidirectional(liststate3.textProperty(), binding4.liststate3Property());
        Bindings.bindBidirectional(liststate4.textProperty(), binding4.liststate4Property());
        Bindings.bindBidirectional(usdot1.textProperty(), binding4.usdot1Property());
        Bindings.bindBidirectional(usdot2.textProperty(), binding4.usdot2Property());
        Bindings.bindBidirectional(usdot3.textProperty(), binding4.usdot3Property());
        Bindings.bindBidirectional(usdot4.textProperty(), binding4.usdot4Property());
        Bindings.bindBidirectional(docket1.textProperty(), binding4.docket1Property());
        Bindings.bindBidirectional(docket2.textProperty(), binding4.docket2Property());
        Bindings.bindBidirectional(docket3.textProperty(), binding4.docket3Property());
        Bindings.bindBidirectional(docket4.textProperty(), binding4.docket4Property());
        Bindings.bindBidirectional(typeoffiling1.textProperty(), binding4.typeoffiling1Property());
        Bindings.bindBidirectional(typeoffiling2.textProperty(), binding4.typeoffiling2Property());
        Bindings.bindBidirectional(typeoffiling3.textProperty(), binding4.typeoffiling3Property());
        Bindings.bindBidirectional(typeoffiling4.textProperty(), binding4.typeoffiling4Property());
        Bindings.bindBidirectional(namerequired1.textProperty(), binding4.namerequired1Property());
        Bindings.bindBidirectional(namerequired2.textProperty(), binding4.namerequired2Property());
        Bindings.bindBidirectional(namerequired3.textProperty(), binding4.namerequired3Property());
        Bindings.bindBidirectional(namerequired4.textProperty(), binding4.namerequired4Property());
        Bindings.bindBidirectional(typeofnonowned.textProperty(), binding4.typeofnonownedProperty());
        Bindings.bindBidirectional(anytime.textProperty(), binding4.anytimeProperty());
        Bindings.bindBidirectional(avgvalue.textProperty(), binding4.avgvalueProperty());
        Bindings.bindBidirectional(namerequired1.textProperty(), binding4.namerequired1Property());
        Bindings.bindBidirectional(maxannually.textProperty(), binding4.maxannuallyProperty());
        Bindings.bindBidirectional(mostexpensive.textProperty(), binding4.mostexpensiveProperty());
        Bindings.bindBidirectional(autosubmissioncomments.textProperty(), binding4.autosubmissioncommentsProperty());
            }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }
    @FXML
    public void backAuto() {
        screenPage.setScreen("AutoSubmission");
        animatedMovement(-6345, 0);
    }
    @FXML
    public void back1() {
        animatedMovement(0, 0);
    }
    @FXML
    public void submitform(){
        ((NextScreenController)screenPage.getControlledScreen("NextScreen")).submitFormAction();
    }
    
    @FXML
    public void submitSave() {
        SavingFile sf = new SavingFile();
        savinglocally.toFile(sf, "Harman");
    }
    
    
    public void animatedMovement(int x, int y) {
        TranslateTransition animatedMove = TranslateTransitionBuilder.
                create().
                toX(x).
                toY(y).
                duration(Duration.seconds(0.5)).
                node(fullScreenPane).build();
                animatedMove.play();
    }

    
}
