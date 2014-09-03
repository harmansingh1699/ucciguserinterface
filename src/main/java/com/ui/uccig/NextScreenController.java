/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.calendar.DatePicker;
import com.rav.insurance.insuranceformoperations.webservice.Exception;
import com.rav.insurance.insuranceformoperations.webservice.InsuranceOperationsService_Service;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitResponse;
import com.rav.insurance.util.WriteByteArray;
import com.ui.animation.InvokeAnimation;
import com.ui.binding.FormEntry1Binding;
import com.ui.binding.FormEntry2Binding;
import com.ui.binding.FormEntry3Binding;
import com.ui.binding.FormEntry4Binding;
import com.ui.util.CommonValidations;
import com.ui.util.SavingFile;
import com.ui.util.savinglocally;
import java.io.File;
import java.net.URL;
import java.util.Date;
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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Dialogs;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author harsimransingh
 */
public class NextScreenController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;

    @FXML
    private Label uploadlabel;

    @FXML
    private Button upload;

    private List<File> fileList;

    @FXML
    private ChoiceBox<String> severity;
    @FXML
    private Label returnedname;
    @FXML
    private Label returnedbranch;
    @FXML
    private Label returneddate;
    @FXML
    private TextField keycontact;
    @FXML
    private TextField keyphone;
    @FXML
    private TextField keyemail;
    @FXML
    private TextField secondarycontact;
    @FXML
    private TextField secondaryphone;
    @FXML
    private TextField secondaryemail;
    @FXML
    private TextField businessname;
    @FXML
    private TextField mailingaddress;
    @FXML
    private TextField fax;
    @FXML
    private TextField website;
    @FXML
    private TextField otherspecify;
    @FXML
    private TextField yearsinbusiness;
    @FXML
    private TextField relatedexperience;
    @FXML
    private TextField owner1;
    @FXML
    private TextField owner2;
    @FXML
    private TextField owner3;
    @FXML
    private TextField owner4;
    @FXML
    private TextField bod1;
    @FXML
    private TextField bod2;
    @FXML
    private TextField bod3;
    @FXML
    private TextField bod4;
    @FXML
    private TextField nooflocations;
    @FXML
    private TextField noofownderautos;
    @FXML
    private ChoiceBox<String> entitytype;
    @FXML
    private RadioButton profit;
    @FXML
    private RadioButton nonprofit;
    //next page
    @FXML
    private ChoiceBox<String> finYearEnd;
    @FXML
    private TextField noofstaff;
    @FXML
    private TextField payroll;
    @FXML
    private ChoiceBox<String> groupbenefits;
    @FXML
    private ChoiceBox<String> pensionplan;
    @FXML
    private TextField descriptionOfOpAndRev1;
    @FXML
    private TextField descriptionOfOpAndRev2;
    @FXML
    private TextField descriptionOfOpAndRev3;
    @FXML
    private TextField descriptionOfOpAndRev4;
    @FXML
    private TextField amount1;
    @FXML
    private TextField amount2;
    @FXML
    private TextField amount3;
    @FXML
    private TextField amount4;
    @FXML
    private ChoiceBox<String> currency1;
    @FXML
    private ChoiceBox<String> currency2;
    @FXML
    private ChoiceBox<String> currency3;
    @FXML
    private ChoiceBox<String> currency4;
    @FXML
    private TextField totalsale;
    @FXML
    private TextField totalsaleus;
    @FXML
    private TextField perofonpremises;
    @FXML
    private TextField perofoffpremises;
    @FXML
    private TextField perofresidential;
    @FXML
    private TextField perofcommercial;
    @FXML
    private TextField perofsubcontracted;
    @FXML
    private CheckBox ecommerce;
    @FXML
    private CheckBox profliability;
    @FXML
    private CheckBox cyberliability;
    @FXML
    private CheckBox pollexposure;
    @FXML
    private CheckBox accbenefits;
    @FXML
    private CheckBox malexposure;
    @FXML
    private CheckBox abuseexposure;
    @FXML
    private CheckBox bondopportunity;
    @FXML
    private TextField largestcustomerorproject1;
    @FXML
    private TextField largestcustomerorproject2;
    @FXML
    private TextField largestcustomerorproject3;
    @FXML
    private TextField largestcustomerorproject4;
    @FXML
    private TextField largestSuppliers1;
    @FXML
    private TextField largestSuppliers2;
    @FXML
    private TextField largestSuppliers3;
    @FXML
    private TextField largestSuppliers4;
    @FXML
    private TextArea futureopportunity;
    @FXML
    private TextArea describecompetition;
    @FXML
    private TextArea businessapart;
    @FXML
    private TextArea advertising;
    @FXML
    private TextArea recover;
    @FXML
    private CheckBox biw;
    @FXML
    private TextField claimcause1;
    @FXML
    private TextField claimcause2;
    @FXML
    private TextField claimcause3;
    @FXML
    private TextField claimamount1;
    @FXML
    private TextField claimamount2;
    @FXML
    private TextField claimamount3;
    @FXML
    private TextField ciptype1;
    @FXML
    private TextField ciptype2;
    @FXML
    private TextField ciptype3;
    @FXML
    private TextField cipcarrier1;
    @FXML
    private TextField cipcarrier2;
    @FXML
    private TextField cipcarrier3;
    @FXML
    private TextField cipexpiry1;
    @FXML
    private TextField cipexpiry2;
    @FXML
    private TextField cipexpiry3;
    @FXML
    private TextField lienholder1;
    @FXML
    private TextField lienholder2;
    @FXML
    private TextField lienholder3;
    @FXML
    private TextField loc1;
    @FXML
    private TextField loc2;
    @FXML
    private TextField loc3;
    @FXML
    private TextField aoladdress1;
    @FXML
    private TextField aoladdress2;
    @FXML
    private TextField aoladdress3;
    @FXML
    private TextField aoladdress4;
    @FXML
    private TextField aoluse1;
    @FXML
    private TextField aoluse2;
    @FXML
    private TextField aoluse3;
    @FXML
    private TextField aoluse4;
    @FXML
    private RadioButton aolownedy1;
    @FXML
    private RadioButton aolownedn1;
    @FXML
    private RadioButton aolownedy2;
    @FXML
    private RadioButton aolownedn2;
    @FXML
    private RadioButton aolownedy3;
    @FXML
    private RadioButton aolownedn3;
    @FXML
    private RadioButton aolownedy4;
    @FXML
    private RadioButton aolownedn4;
    @FXML
    private TextField lrtooccupancy1;
    @FXML
    private TextField lrtooccupancy2;
    @FXML
    private TextField lrtooccupancy3;
    @FXML
    private TextField lrtooccupancy4;
    @FXML
    private TextArea producercomments;
    @FXML
    private TextArea marketercomments;
    @FXML
    private TextField buildinglimit;
    @FXML
    private TextField buildingdeductible;
    @FXML
    private TextField contentslimit;
    @FXML
    private TextField contentsdeductible;
    @FXML
    private TextField stocklimit;
    @FXML
    private TextField stockdeductible;
    @FXML
    private TextField officelimit;
    @FXML
    private TextField officedeductible;
    @FXML
    private TextField edplimit;
    @FXML
    private TextField edpdeductible;
    @FXML
    private TextField equipmentlimit;
    @FXML
    private TextField equipmentdeductible;
    @FXML
    private TextField offpremiseslimit;
    @FXML
    private TextField offpremisesdeductible;
    @FXML
    private TextField transitlimit;
    @FXML
    private TextField transitdeductible;
    @FXML
    private TextField miscpropertylimit;
    @FXML
    private TextField miscpropertydeductible;
    @FXML
    private TextField contractorsequipmentlimit;
    @FXML
    private TextField contractorsequipmentdeductible;
    @FXML
    private TextField installationfloatorlimit;
    @FXML
    private TextField installationfloatordeductible;
    @FXML
    private TextField toolfloatorlimit;
    @FXML
    private TextField toolfloatordeductible;
    @FXML
    private TextField signfloatorlimit;
    @FXML
    private TextField signfloatordeductible;
    @FXML
    private TextField motortruckcargolimit;
    @FXML
    private TextField motortruckcargodeductible;
    @FXML
    private CheckBox mtcowner;
    @FXML
    private CheckBox mtctruckman;
    @FXML
    private TextField glasslimit;
    @FXML
    private TextField glassdeductible;
    @FXML
    private TextField sewerbackupdeductible;
    @FXML
    private TextField flooddeductible;
    @FXML
    private TextField earthquakedeductible;
    @FXML
    private TextField profitslimit;
    @FXML
    private TextField profitsdeductible;
    @FXML
    private TextField grossearningslimit;
    @FXML
    private TextField grossearningsdeductible;
    @FXML
    private CheckBox ge80;
    @FXML
    private CheckBox ge50;
    @FXML
    private TextField rentalincomelimit;
    @FXML
    private TextField rentalincomedeductible;
    @FXML
    private TextField extraexpenselimit;
    @FXML
    private TextField extraexpensedeductible;
    @FXML
    private TextField offpremisespowerlimit;
    @FXML
    private TextField offpremisespowerdeductible;
    @FXML
    private TextField insideoutsidelimit;
    @FXML
    private TextField insideoutsidedeductible;
    @FXML
    private TextField bfmoneylimit;
    @FXML
    private TextField bfmoneydeductible;
    @FXML
    private TextField forgerylimit;
    @FXML
    private TextField forgerydeductible;
    @FXML
    private TextField moneyorderslimit;
    @FXML
    private TextField moneyordersdeductible;
    @FXML
    private TextField dishonestylimit;
    @FXML
    private TextField dishonestydeductible;
    @FXML
    private TextField cgllimit;
    @FXML
    private TextField cgldeductible;
    @FXML
    private TextField tenantslimit;
    @FXML
    private TextField tenantsdeductible;
    @FXML
    private TextField nonownedlimit;
    @FXML
    private TextField nonowneddeductible;
    @FXML
    private TextField sef96limit;
    @FXML
    private TextField sef96deductible;
    @FXML
    private TextField sef94limit;
    @FXML
    private TextField sef94deductible;
    @FXML
    private TextField dandlimit;
    @FXML
    private TextField danddeductible;
    @FXML
    private TextField eanddeductible;
    @FXML
    private TextField eandlimit;
    @FXML
    private TextField employerslimit;
    @FXML
    private TextField employersdeductible;
    @FXML
    private TextField umbrellalimit;
    @FXML
    private TextField umbrelladeductible;
    @FXML
    private TextField wrapuplimit;
    @FXML
    private TextField wrapupdeductible;
    @FXML
    private TextField stdlimit;
    @FXML
    private TextField stddeductible;
    @FXML
    private TextField aclimit;
    @FXML
    private TextField acdeductible;
    @FXML
    private TextField productionmachinerylimit;
    @FXML
    private TextField productionmachinerydeductible;
    @FXML
    private TextField othercoverage1;
    @FXML
    private TextField othercoverage2;
    @FXML
    private TextField othercoverage1limit;
    @FXML
    private TextField othercoverage1deductible;
    @FXML
    private TextField othercoverage2limit;
    @FXML
    private TextField othercoverage2deductible;
    @FXML
    private TextArea additionalcoverage;
    @FXML
    private TextArea locationaddress;
    @FXML
    private TextField locationage;
    @FXML
    private TextField totsqfootage;
    @FXML
    private TextField insidesqfootage;
    @FXML
    private TextField noofstories;
    @FXML
    private ChoiceBox<String> basement;
    @FXML
    private CheckBox wallsframe;
    @FXML
    private CheckBox wallshcb;
    @FXML
    private CheckBox wallssteel;
    @FXML
    private CheckBox wallsbrick;
    @FXML
    private CheckBox woodjoist;
    @FXML
    private CheckBox steeldeck;
    @FXML
    private CheckBox roofconcrete;
    @FXML
    private CheckBox floorsconcrete;
    @FXML
    private CheckBox floorswood;
    @FXML
    private CheckBox fagas;
    @FXML
    private CheckBox faoil;
    @FXML
    private CheckBox heatingelectric;
    @FXML
    private CheckBox heatingother;
    @FXML
    private CheckBox electricalbreakers;
    @FXML
    private CheckBox electricalfuses;
    @FXML
    private CheckBox noofamps;
    @FXML
    private CheckBox copper;
    @FXML
    private CheckBox pvc;
    @FXML
    private CheckBox plumbingother;
    @FXML
    private CheckBox sprinklers;
    @FXML
    private CheckBox svccontract;
    @FXML
    private CheckBox hydrant;
    @FXML
    private CheckBox firehall;
    @FXML
    private CheckBox unprotected;
    @FXML
    private CheckBox alarmsystem;
    @FXML
    private CheckBox centralmonitored;
    @FXML
    private CheckBox windowbars;
    @FXML
    private CheckBox deadbolts;
    @FXML
    private Button autoinsurancebutton;
    @FXML
    private Button CommercialSubmit;
     
    
    @FXML
    private Pane openingPane;
    @FXML
    private Pane fullScreenPane;
    @FXML
    private Pane newBusinessPane;
    @FXML
    ImageView bg;

    DatePicker datePicker = new DatePicker();
    DatePicker datePicker1 = new DatePicker();
    DatePicker datePicker2 = new DatePicker();
    DatePicker datePicker3 = new DatePicker();
    
    int insurancetypeflag = 0;
    private FormEntry1Binding binding;
    private FormEntry2Binding binding2;
    private FormEntry3Binding binding3;
    private FormEntry4Binding binding4;

    private String receivedemailaddress;
    private String receivedname;
    private String branch;
    private Date date;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReceivedname() {
        return receivedname;
    }

    public void setReceivedname(String receivedname) {
        this.receivedname = receivedname;
    }

    public String getReceivedemailaddress() {
        return receivedemailaddress;
    }

    public void setReceivedemailaddress(String receivedemailaddress) {
        this.receivedemailaddress = receivedemailaddress;
    }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        binding = new FormEntry1Binding();
        binding2 = new FormEntry2Binding();
        binding3 = new FormEntry3Binding();
        binding4=new FormEntry4Binding();
        fullScreenPane.setVisible(true);
        openingPane.setVisible(true);
        newBusinessPane.setVisible(false);

        Bindings.bindBidirectional(keycontact.textProperty(), binding.keyContactProperty());
        Bindings.bindBidirectional(keyphone.textProperty(), binding.keyPhoneProperty());
        Bindings.bindBidirectional(keyemail.textProperty(), binding.keyEmailProperty());
        Bindings.bindBidirectional(secondarycontact.textProperty(), binding.secondaryContactProperty());
        Bindings.bindBidirectional(secondaryphone.textProperty(), binding.secondaryPhoneProperty());
        Bindings.bindBidirectional(secondaryemail.textProperty(), binding.secondaryEmailProperty());
        Bindings.bindBidirectional(businessname.textProperty(), binding.businessNameProperty());
        Bindings.bindBidirectional(mailingaddress.textProperty(), binding.mailingAddressProperty());
        Bindings.bindBidirectional(fax.textProperty(), binding.faxProperty());
        Bindings.bindBidirectional(website.textProperty(), binding.websiteProperty());
        Bindings.bindBidirectional(otherspecify.textProperty(), binding.otherSpecifyProperty());
        //Bindings.bindBidirectional(years.textProperty(), binding.yearsProperty());
        Bindings.bindBidirectional(relatedexperience.textProperty(), binding.relatedExperienceProperty());
        Bindings.bindBidirectional(owner1.textProperty(), binding.owner1Property());
        Bindings.bindBidirectional(owner2.textProperty(), binding.owner2Property());
        Bindings.bindBidirectional(owner3.textProperty(), binding.owner3Property());
        Bindings.bindBidirectional(owner4.textProperty(), binding.owner4Property());
        Bindings.bindBidirectional(bod1.textProperty(), binding.bod1Property());
        Bindings.bindBidirectional(bod2.textProperty(), binding.bod2Property());
        Bindings.bindBidirectional(bod3.textProperty(), binding.bod3Property());
        Bindings.bindBidirectional(bod4.textProperty(), binding.bod4Property());
        Bindings.bindBidirectional(nooflocations.textProperty(), binding.noOfLocationsProperty());
        Bindings.bindBidirectional(noofownderautos.textProperty(), binding.noOfOwnedAutosProperty());
        Bindings.bindBidirectional(noofstaff.textProperty(), binding2.NoofStaffProperty());
        Bindings.bindBidirectional(payroll.textProperty(), binding2.payrollProperty());
        Bindings.bindBidirectional(descriptionOfOpAndRev1.textProperty(), binding2.descriptionOfOpAndRev1Property());
        Bindings.bindBidirectional(descriptionOfOpAndRev2.textProperty(), binding2.descriptionOfOpAndRev2Property());
        Bindings.bindBidirectional(descriptionOfOpAndRev3.textProperty(), binding2.descriptionOfOpAndRev3Property());
        Bindings.bindBidirectional(descriptionOfOpAndRev4.textProperty(), binding2.descriptionOfOpAndRev4Property());
        Bindings.bindBidirectional(amount1.textProperty(), binding2.amount1Property());
        Bindings.bindBidirectional(amount2.textProperty(), binding2.amount2Property());
        Bindings.bindBidirectional(amount3.textProperty(), binding2.amount3Property());
        Bindings.bindBidirectional(amount4.textProperty(), binding2.amount4Property());
        Bindings.bindBidirectional(totalsale.textProperty(), binding2.totalSaleProperty());
        Bindings.bindBidirectional(totalsaleus.textProperty(), binding2.perOfUsSalesProperty());
        Bindings.bindBidirectional(perofonpremises.textProperty(), binding2.perOfOnPremisesProperty());
        Bindings.bindBidirectional(perofoffpremises.textProperty(), binding2.perOfOffPremisesProperty());
        Bindings.bindBidirectional(perofresidential.textProperty(), binding2.perOfResidentialProperty());
        Bindings.bindBidirectional(perofcommercial.textProperty(), binding2.perOfCommercialProperty());
        Bindings.bindBidirectional(perofsubcontracted.textProperty(), binding2.perOfSubContractedProperty());
        Bindings.bindBidirectional(largestcustomerorproject1.textProperty(), binding2.largestCustomerOrProject1Property());
        Bindings.bindBidirectional(largestcustomerorproject2.textProperty(), binding2.largestCustomerOrProject2Property());
        Bindings.bindBidirectional(largestcustomerorproject3.textProperty(), binding2.largestCustomerOrProject3Property());
        Bindings.bindBidirectional(largestcustomerorproject4.textProperty(), binding2.largestCustomerOrProject4Property());
        Bindings.bindBidirectional(largestSuppliers1.textProperty(), binding2.largestSuppliers1Property());
        Bindings.bindBidirectional(largestSuppliers2.textProperty(), binding2.largestSuppliers2Property());
        Bindings.bindBidirectional(largestSuppliers3.textProperty(), binding2.largestSuppliers3Property());
        Bindings.bindBidirectional(largestSuppliers4.textProperty(), binding2.largestSuppliers4Property());
        Bindings.bindBidirectional(futureopportunity.textProperty(), binding3.futureopportunityProperty());
        Bindings.bindBidirectional(describecompetition.textProperty(), binding3.describecompetitionProperty());
        Bindings.bindBidirectional(businessapart.textProperty(), binding3.businessapartProperty());
        Bindings.bindBidirectional(advertising.textProperty(), binding3.advertisingProperty());
        Bindings.bindBidirectional(recover.textProperty(), binding3.recoverProperty());
        Bindings.bindBidirectional(claimcause1.textProperty(), binding3.claimcause1Property());
        Bindings.bindBidirectional(claimcause2.textProperty(), binding3.claimcause2Property());
        Bindings.bindBidirectional(claimcause3.textProperty(), binding3.claimcause3Property());
        Bindings.bindBidirectional(claimamount1.textProperty(), binding3.claimamount1Property());
        Bindings.bindBidirectional(claimamount2.textProperty(), binding3.claimamount2Property());
        Bindings.bindBidirectional(claimamount3.textProperty(), binding3.claimamount3Property());
        Bindings.bindBidirectional(ciptype1.textProperty(), binding3.ciptype1Property());
        Bindings.bindBidirectional(ciptype2.textProperty(), binding3.ciptype2Property());
        Bindings.bindBidirectional(ciptype3.textProperty(), binding3.ciptype3Property());
        Bindings.bindBidirectional(cipcarrier1.textProperty(), binding3.cipcarrier1Property());
        Bindings.bindBidirectional(cipcarrier2.textProperty(), binding3.cipcarrier2Property());
        Bindings.bindBidirectional(cipcarrier3.textProperty(), binding3.cipcarrier3Property());
        Bindings.bindBidirectional(lienholder1.textProperty(), binding3.lienholder1Property());
        Bindings.bindBidirectional(lienholder2.textProperty(), binding3.lienholder2Property());
        Bindings.bindBidirectional(lienholder3.textProperty(), binding3.lienholder3Property());
        Bindings.bindBidirectional(loc1.textProperty(), binding3.loc1Property());
        Bindings.bindBidirectional(loc2.textProperty(), binding3.loc2Property());
        Bindings.bindBidirectional(loc3.textProperty(), binding3.loc3Property());
        Bindings.bindBidirectional(aoladdress1.textProperty(), binding3.aoladdress1Property());
        Bindings.bindBidirectional(aoladdress2.textProperty(), binding3.aoladdress2Property());
        Bindings.bindBidirectional(aoladdress3.textProperty(), binding3.aoladdress3Property());
        Bindings.bindBidirectional(aoladdress4.textProperty(), binding3.aoladdress4Property());
        Bindings.bindBidirectional(aoluse1.textProperty(), binding3.aoluse1Property());
        Bindings.bindBidirectional(aoluse2.textProperty(), binding3.aoluse2Property());
        Bindings.bindBidirectional(aoluse3.textProperty(), binding3.aoluse3Property());
        Bindings.bindBidirectional(aoluse4.textProperty(), binding3.aoluse4Property());
        Bindings.bindBidirectional(lrtooccupancy1.textProperty(), binding3.lrtooccupancy1Property());
        Bindings.bindBidirectional(lrtooccupancy2.textProperty(), binding3.lrtooccupancy2Property());
        Bindings.bindBidirectional(lrtooccupancy3.textProperty(), binding3.lrtooccupancy3Property());
        Bindings.bindBidirectional(lrtooccupancy4.textProperty(), binding3.lrtooccupancy4Property());
        Bindings.bindBidirectional(producercomments.textProperty(), binding3.producercommentsProperty());
        Bindings.bindBidirectional(marketercomments.textProperty(), binding3.marketercommentsProperty());
        Bindings.bindBidirectional(buildinglimit.textProperty(), binding4.buildinglimitProperty());
        Bindings.bindBidirectional(buildingdeductible.textProperty(), binding4.buildingdeductibleProperty());
        Bindings.bindBidirectional(contentslimit.textProperty(), binding4.contentslimitProperty());
        Bindings.bindBidirectional(contentsdeductible.textProperty(), binding4.contentsdeductibleProperty());
        Bindings.bindBidirectional(stocklimit.textProperty(), binding4.stocklimitProperty());
        Bindings.bindBidirectional(stockdeductible.textProperty(), binding4.stockdeductibleProperty());
        Bindings.bindBidirectional(officelimit.textProperty(), binding4.officelimitProperty());
        Bindings.bindBidirectional(officedeductible.textProperty(), binding4.officedeductibleProperty());
        Bindings.bindBidirectional(edplimit.textProperty(), binding4.edplimitProperty());
        Bindings.bindBidirectional(edpdeductible.textProperty(), binding4.edpdeductibleProperty());
        Bindings.bindBidirectional(equipmentlimit.textProperty(), binding4.equipmentlimitProperty());
        Bindings.bindBidirectional(equipmentdeductible.textProperty(), binding4.equipmentdeductibleProperty());
        Bindings.bindBidirectional(offpremiseslimit.textProperty(), binding4.offpremiseslimitProperty());
        Bindings.bindBidirectional(offpremisesdeductible.textProperty(), binding4.offpremisesdeductibleProperty());
        Bindings.bindBidirectional(transitlimit.textProperty(), binding4.transitlimitProperty());
        Bindings.bindBidirectional(transitdeductible.textProperty(), binding4.transitdeductibleProperty());
        Bindings.bindBidirectional(miscpropertylimit.textProperty(), binding4.miscpropertylimitProperty());
        Bindings.bindBidirectional(miscpropertydeductible.textProperty(), binding4.miscpropertydeductibleProperty());
        Bindings.bindBidirectional(contractorsequipmentlimit.textProperty(), binding4.contractorsequipmentlimitProperty());
        Bindings.bindBidirectional(contractorsequipmentdeductible.textProperty(), binding4.contractorsequipmentdeductibleProperty());
        Bindings.bindBidirectional(installationfloatorlimit.textProperty(), binding4.installationfloatorlimitProperty());
        Bindings.bindBidirectional(installationfloatordeductible.textProperty(), binding4.installationfloatordeductibleProperty());
        Bindings.bindBidirectional(toolfloatorlimit.textProperty(), binding4.toolfloatorlimitProperty());
        Bindings.bindBidirectional(toolfloatordeductible.textProperty(), binding4.toolfloatordeductibleProperty());
        Bindings.bindBidirectional(signfloatorlimit.textProperty(), binding4.signfloatorlimitProperty());
        Bindings.bindBidirectional(signfloatordeductible.textProperty(), binding4.signfloatordeductibleProperty());
        Bindings.bindBidirectional(motortruckcargolimit.textProperty(), binding4.motortruckcargolimitProperty());
        Bindings.bindBidirectional(motortruckcargodeductible.textProperty(), binding4.motortruckcargodeductibleProperty());
        Bindings.bindBidirectional(glasslimit.textProperty(), binding4.glasslimitProperty());
        Bindings.bindBidirectional(glassdeductible.textProperty(), binding4.glassdeductibleProperty());
        Bindings.bindBidirectional(sewerbackupdeductible.textProperty(), binding4.sewerblackupdeductibleProperty());
        Bindings.bindBidirectional(flooddeductible.textProperty(), binding4.flooddeductibleProperty());
        Bindings.bindBidirectional(earthquakedeductible.textProperty(), binding4.earthquakedeductibleProperty());
        Bindings.bindBidirectional(profitslimit.textProperty(), binding4.profitslimitProperty());
        Bindings.bindBidirectional(profitsdeductible.textProperty(), binding4.profitsdeductibleProperty());
        Bindings.bindBidirectional(grossearningslimit.textProperty(), binding4.grossearningslimitProperty());
        Bindings.bindBidirectional(grossearningsdeductible.textProperty(), binding4.grossearningsdeductibleProperty());
        Bindings.bindBidirectional(rentalincomelimit.textProperty(), binding4.rentalincomelimitProperty());
        Bindings.bindBidirectional(rentalincomedeductible.textProperty(), binding4.rentalincomedeductibleProperty());
        Bindings.bindBidirectional(extraexpenselimit.textProperty(), binding4.extraexpenselimitProperty());
        Bindings.bindBidirectional(extraexpensedeductible.textProperty(), binding4.extraexpensedeductibleProperty());
        Bindings.bindBidirectional(offpremiseslimit.textProperty(), binding4.offpremiseslimitProperty());
        Bindings.bindBidirectional(offpremisesdeductible.textProperty(), binding4.offpremisesdeductibleProperty());
        Bindings.bindBidirectional(insideoutsidelimit.textProperty(), binding4.insideoutsidelimitProperty());
        Bindings.bindBidirectional(insideoutsidedeductible.textProperty(), binding4.insideoutsidedeductibleProperty());
        Bindings.bindBidirectional(bfmoneylimit.textProperty(), binding4.bfmoneylimitProperty());
        Bindings.bindBidirectional(bfmoneydeductible.textProperty(), binding4.bfmoneydeductibleProperty());
        Bindings.bindBidirectional(forgerylimit.textProperty(), binding4.forgerylimitProperty());
        Bindings.bindBidirectional(forgerydeductible.textProperty(), binding4.forgerydeductibleProperty());
        Bindings.bindBidirectional(moneyorderslimit.textProperty(), binding4.moneyorderslimitProperty());
        Bindings.bindBidirectional(moneyordersdeductible.textProperty(), binding4.moneyordersdeductibleProperty());
        Bindings.bindBidirectional(dishonestylimit.textProperty(), binding4.dishonestylimitProperty());
        Bindings.bindBidirectional(dishonestydeductible.textProperty(), binding4.dishonestydeductibleProperty());
        Bindings.bindBidirectional(cgllimit.textProperty(), binding4.cgllimitProperty());
        Bindings.bindBidirectional(cgldeductible.textProperty(), binding4.cgldeductibleProperty());
        Bindings.bindBidirectional(tenantslimit.textProperty(), binding4.tenantslimitProperty());
        Bindings.bindBidirectional(tenantsdeductible.textProperty(), binding4.tenantsdeductibleProperty());
        Bindings.bindBidirectional(nonownedlimit.textProperty(), binding4.nonownedlimitProperty());
        Bindings.bindBidirectional(nonowneddeductible.textProperty(), binding4.nonowneddeductibleProperty());
        Bindings.bindBidirectional(sef96limit.textProperty(), binding4.sef96limitProperty());
        Bindings.bindBidirectional(sef96deductible.textProperty(), binding4.sef96deductibleProperty());
        Bindings.bindBidirectional(sef94deductible.textProperty(), binding4.sef94deductibleProperty());
        Bindings.bindBidirectional(dandlimit.textProperty(), binding4.dandlimitProperty());
        Bindings.bindBidirectional(danddeductible.textProperty(), binding4.danddeductibleProperty());
        Bindings.bindBidirectional(eandlimit.textProperty(), binding4.eandlimitProperty());
        Bindings.bindBidirectional(eanddeductible.textProperty(), binding4.eanddeductibleProperty());
        Bindings.bindBidirectional(employerslimit.textProperty(), binding4.employerslimitProperty());
        Bindings.bindBidirectional(employersdeductible.textProperty(), binding4.employersdeductibleProperty());
        Bindings.bindBidirectional(umbrellalimit.textProperty(), binding4.umbrellalimitProperty());
        Bindings.bindBidirectional(umbrelladeductible.textProperty(), binding4.umbrelladeductibleProperty());
        Bindings.bindBidirectional(wrapuplimit.textProperty(), binding4.wrapuplimitProperty());
        Bindings.bindBidirectional(wrapupdeductible.textProperty(), binding4.wrapupdeductibleProperty());
        Bindings.bindBidirectional(stdlimit.textProperty(), binding4.stdlimitProperty());
        Bindings.bindBidirectional(stddeductible.textProperty(), binding4.stddeductibleProperty());
        Bindings.bindBidirectional(aclimit.textProperty(), binding4.aclimitProperty());
        Bindings.bindBidirectional(acdeductible.textProperty(), binding4.acdeductibleProperty());
        Bindings.bindBidirectional(productionmachinerylimit.textProperty(), binding4.productionmachinerylimitProperty());
        Bindings.bindBidirectional(productionmachinerydeductible.textProperty(), binding4.productionmachinerydeductibleProperty());
        Bindings.bindBidirectional(othercoverage1.textProperty(), binding4.othercoverage1Property());
        Bindings.bindBidirectional(othercoverage2.textProperty(), binding4.othercoverage2Property());
        Bindings.bindBidirectional(othercoverage1limit.textProperty(), binding4.othercoverage1limitProperty());
        Bindings.bindBidirectional(othercoverage2limit.textProperty(), binding4.othercoverage2limitProperty());
        Bindings.bindBidirectional(othercoverage1deductible.textProperty(), binding4.othercoverage1deductibleProperty());
        Bindings.bindBidirectional(othercoverage2deductible.textProperty(), binding4.othercoverage2deductibleProperty());
        Bindings.bindBidirectional(additionalcoverage.textProperty(), binding4.additionalcoverageProperty());
        Bindings.bindBidirectional(locationaddress.textProperty(), binding4.locationaddressProperty());
        Bindings.bindBidirectional(locationage.textProperty(), binding4.locationageProperty());
        Bindings.bindBidirectional(totsqfootage.textProperty(), binding4.totsqfootageProperty());
        Bindings.bindBidirectional(insidesqfootage.textProperty(), binding4.insidesqfootageProperty());
        Bindings.bindBidirectional(noofstories.textProperty(), binding4.noofstoriesProperty());
        
        //choicebox
        severity.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding.setSeverity(newSelection);
                }
            }
        });

        entitytype.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding.setEntityType(newSelection);
                }
            }
        });
        finYearEnd.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding2.setfinYearEnd(newSelection);
                }
            }
        });
        groupbenefits.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding2.setgroupBenefits(newSelection);
                }
            }
        });
        pensionplan.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding2.setpensionPlan(newSelection);
                }
            }
        });
        currency1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding2.setcurrency1(newSelection);
                }
            }
        });
        currency2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding2.setcurrency2(newSelection);
                }
            }
        });
        currency3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding2.setcurrency3(newSelection);
                }
            }
        });
        currency4.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                if (oldSelection != null) {
                    binding2.setCurrency4(newSelection);
                }
            }
        });

        //radio button   
        ToggleGroup tg = new ToggleGroup();
        profit.setToggleGroup(tg);
        nonprofit.setToggleGroup(tg);
        ChangeListener<Toggle> listener1 = new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t = (RadioButton) val.getToggleGroup().getSelectedToggle();
                binding.setProfit(t.getText());
            }
        };
        tg.selectedToggleProperty().addListener(listener1);

        ToggleGroup tg1 = new ToggleGroup();
        aolownedy1.setToggleGroup(tg1);
        aolownedn1.setToggleGroup(tg1);
        ChangeListener<Toggle> listener10 = new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t = (RadioButton) val.getToggleGroup().getSelectedToggle();
                binding3.setaolownedy1(t.getText());
            }
        };
        tg1.selectedToggleProperty().addListener(listener10);

        ToggleGroup tg2 = new ToggleGroup();
        aolownedy2.setToggleGroup(tg2);
        aolownedn2.setToggleGroup(tg2);
        ChangeListener<Toggle> listener11 = new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t = (RadioButton) val.getToggleGroup().getSelectedToggle();
                binding3.setaolownedy2(t.getText());
            }
        };
        tg2.selectedToggleProperty().addListener(listener11);

        ToggleGroup tg3 = new ToggleGroup();
        aolownedy3.setToggleGroup(tg3);
        aolownedn3.setToggleGroup(tg3);
        ChangeListener<Toggle> listener12 = new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t = (RadioButton) val.getToggleGroup().getSelectedToggle();
                binding3.setaolownedy3(t.getText());
            }
        };
        tg3.selectedToggleProperty().addListener(listener12);

        ToggleGroup tg4 = new ToggleGroup();
        aolownedy3.setToggleGroup(tg4);
        aolownedn3.setToggleGroup(tg4);
        ChangeListener<Toggle> listener13 = new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t = (RadioButton) val.getToggleGroup().getSelectedToggle();
                binding3.setaolownedy4(t.getText());
            }
        };
        tg4.selectedToggleProperty().addListener(listener13);

        //checkbox
        ChangeListener<Boolean> listener = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (ecommerce.isSelected()) {
                    System.out.println("Selected");
                    binding2.seteCommerce("ecommerce selected");
                }
            }
        };
        ecommerce.selectedProperty().addListener(listener);
        // ecommerce.setSelected(true);
        ChangeListener<Boolean> listener2 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (profliability.isSelected()) {
                    binding2.setprofLiability("selected");
                }
            }
        };
        profliability.selectedProperty().addListener(listener2);

        ChangeListener<Boolean> listener3 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (cyberliability.isSelected()) {
                    binding2.setcyberLiability("selected");
                }
            }
        };
        cyberliability.selectedProperty().addListener(listener3);

        ChangeListener<Boolean> listener4 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (pollexposure.isSelected()) {
                    binding2.setpollExposure("selected");
                }
            }
        };
        pollexposure.selectedProperty().addListener(listener4);

        ChangeListener<Boolean> listener5 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (accbenefits.isSelected()) {
                    binding2.setaccBenefits("selected");
                }
            }
        };
        accbenefits.selectedProperty().addListener(listener5);

        ChangeListener<Boolean> listener6 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (malexposure.isSelected()) {
                    binding2.setmalExposure("selected");
                }
            }
        };
        malexposure.selectedProperty().addListener(listener6);

        ChangeListener<Boolean> listener7 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (abuseexposure.isSelected()) {
                    binding2.setabuseExposure("selected");
                }
            }
        };
        abuseexposure.selectedProperty().addListener(listener7);

        ChangeListener<Boolean> listener8 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (bondopportunity.isSelected()) {
                    binding2.setbondOpportunity("selected");
                }
            }
        };
        bondopportunity.selectedProperty().addListener(listener8);

        ChangeListener<Boolean> listener9 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (biw.isSelected()) {
                    binding3.setbiw("selected");
                }
            }
        };
        biw.selectedProperty().addListener(listener9);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                bg.requestFocus();
            }
        });

       /*  datePicker.localeProperty().set(Locale.ENGLISH);
         datePicker1.localeProperty().set(Locale.ENGLISH);
         datePicker2.localeProperty().set(Locale.ENGLISH);
         datePicker3.localeProperty().set(Locale.ENGLISH);
         datePicker.setLayoutX(0.0);
         datePicker.setLayoutY(81.0);
         datePicker.setPrefWidth(200.0);
         datePicker.selectedDateProperty().addListener(new InvalidationListener() {
         @Override
         public void invalidated(Observable observable) {
         }
         });
         datePicker.setPromptText("DOB");
         datePicker.setLocale(Locale.ENGLISH);
         datePicker.getCalendarView().todayButtonTextProperty().set("AAJ KA DIN");
         datePicker.getCalendarView().setShowWeeks(false);
         fullScreenPane.getChildren().add(datePicker);*/
    }

    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    @FXML
    public void submitNewBusiness() {

        openingPane.setVisible(false);
        newBusinessPane.setVisible(true);
    }

    @FXML
    public void submitActionCommercial() {
        insurancetypeflag=1;
        animatedMovement(-1269, 0);
        returnedname.setText(getReceivedname());
        returnedbranch.setText(getBranch());
        returneddate.setText(getDate().getDate() + "/" + getDate().getMonth() + "/" + getDate().getYear());
    }

    @FXML
    public void submitActionAuto() {
        insurancetypeflag=2;
        animatedMovement(-1269, 0);
        returnedname.setText(getReceivedname());
        returnedbranch.setText(getBranch());
        returneddate.setText(getDate().getDate() + "/" + getDate().getMonth() + "/" + getDate().getYear());
    }

    @FXML
    public void submitActionBoth() {
        insurancetypeflag=3;
        animatedMovement(-1269, 0);
        returnedname.setText(getReceivedname());
        returnedbranch.setText(getBranch());
        returneddate.setText(getDate().getDate() + "/" + getDate().getMonth() + "/" + getDate().getYear());
    }

    @FXML
    public void continue1() {
        animatedMovement(-2538, 0);
    }

    @FXML
    public void continue2() {
        animatedMovement(-3807, 0);
    }

    @FXML
    public void continue3() {
        animatedMovement(-5076, 0);
    }

    @FXML
    public void continue4() {
        animatedMovement(-6345, 0);
    }
    @FXML
    public void continueAuto() {
        animatedMovement(-1269, 0);
    }
    
    @FXML
    public void continue5() {
        System.out.println(insurancetypeflag);
        if(insurancetypeflag==1)
        {animatedMovement(-7614, 0);
        autoinsurancebutton.setVisible(false);}
        else if(insurancetypeflag==2)
        {screenPage.setScreen("AutoSubmission");
        }
        else if(insurancetypeflag==2)
        { animatedMovement(-7614, 0);
          CommercialSubmit.setVisible(false);
          autoinsurancebutton.setVisible(true);
        }
        
    }
    @FXML
    public void autobutton(){
        screenPage.setScreen("AutoSubmission");
    }

    @FXML
    public void submitSave() {
        SavingFile sf = new SavingFile();
        savinglocally.toFile(sf, "Harman");
    }

    public void viewApplication(GetInsuranceFormResponse form) {
        keycontact.setText(form.getKeyContact());
        keyphone.setText(form.getKeyContactPhone());
        keyemail.setText(form.getKeyContactEmailAddress());
        secondarycontact.setText(form.getSecondayContact());
        secondaryphone.setText(form.getSecondayContactPhone());
        secondaryemail.setText(form.getSecondayContactEmailAddress());
        mailingaddress.setText(form.getMailingAddress());
        fax.setText(form.getFax());
        website.setText(form.getWebSiteURL());
        // otherspecify.setText(form.getotherSpecify);
        relatedexperience.setText(form.getRelatedExperience());
        owner1.setText(form.getOwner1());
        owner2.setText(form.getOwner2());
        owner3.setText(form.getOwner3());
        owner4.setText(form.getOwner4());
        bod1.setText(form.getBoardOfDirector1());
        bod2.setText(form.getBoardOfDirector2());
        bod3.setText(form.getBoardOfDirector3());
        bod4.setText(form.getBoardOfDirector4());
        nooflocations.setText(Integer.toString(form.getNumberOfLocations()));
        noofownderautos.setText(Integer.toString(form.getNumberOfOwnedAutos()));
        noofstaff.setText(Integer.toString(form.getNoOfStaff()));
        payroll.setText(Double.toString(form.getPayRoll()));
        descriptionOfOpAndRev1.setText(form.getDescriptionOfOperationsAndRevenue1());
        descriptionOfOpAndRev2.setText(form.getDescriptionOfOperationsAndRevenue2());
        descriptionOfOpAndRev3.setText(form.getDescriptionOfOperationsAndRevenue3());
        descriptionOfOpAndRev4.setText(form.getDescriptionOfOperationsAndRevenue4());
        amount1.setText(Double.toString(form.getAmount1()));
        amount2.setText(Double.toString(form.getAmount2()));
        amount3.setText(Double.toString(form.getAmount3()));
        amount4.setText(Double.toString(form.getAmount4()));
        totalsale.setText(Double.toString(form.getTotalSale()));
        totalsaleus.setText(Double.toString(form.getPercentageOfUSSales()));
        perofonpremises.setText(Integer.toString(form.getOnpremises()));
        perofoffpremises.setText(Integer.toString(form.getOffpremises()));
        perofresidential.setText(Integer.toString(form.getResidential()));
        perofcommercial.setText(Integer.toString(form.getCommercial()));
        perofsubcontracted.setText(Integer.toString(form.getSubcontracted()));
        largestcustomerorproject1.setText(form.getLargestCustomerOrProject1());
        largestcustomerorproject2.setText(form.getLargestCustomerOrProject2());
        largestcustomerorproject3.setText(form.getLargestCustomerOrProject3());
        largestcustomerorproject4.setText(form.getLargestCustomerOrProject4());
        largestSuppliers1.setText(form.getLargestSuppliers1());
        largestSuppliers2.setText(form.getLargestSuppliers2());
        largestSuppliers3.setText(form.getLargestSuppliers3());
        largestSuppliers4.setText(form.getLargestSuppliers4());
        futureopportunity.setText(form.getFutureOpportunitiesOrPlanOfGrowth());
        describecompetition.setText(form.getDescribeCompetition());
        businessapart.setText(form.getBusinessAsset());
        advertising.setText(form.getAdvertising());
        recover.setText(form.getDurationIncaseOfSeriousClaims());
        claimcause1.setText(form.getPastClaimCause1());
        claimcause2.setText(form.getPastClaimCause2());
        claimcause3.setText(form.getPastClaimCause3());
        claimamount1.setText(Double.toString(form.getPastClaimAmount1()));
        claimamount2.setText(Double.toString(form.getPastClaimAmount2()));
        claimamount3.setText(Double.toString(form.getPastClaimAmount3()));
        ciptype1.setText(form.getCurrentInsuranceType1());
        ciptype2.setText(form.getCurrentInsuranceType2());
        ciptype3.setText(form.getCurrentInsuranceType3());
        cipcarrier1.setText(form.getCurrentInsuranceCarrier1());
        cipcarrier2.setText(form.getCurrentInsuranceCarrier2());
        cipcarrier3.setText(form.getCurrentInsuranceCarrier3());
        lienholder1.setText(form.getLienHolders1());
        lienholder2.setText(form.getLienHolders2());
        lienholder3.setText(form.getLienHolders3());
        loc1.setText(form.getLineHoldersLoc1());
        loc2.setText(form.getLineHoldersLoc2());
        loc3.setText(form.getLineHoldersLoc3());
        aoladdress1.setText(form.getAddressOfLocation1());
        aoladdress2.setText(form.getAddressOfLocation2());
        aoladdress3.setText(form.getAddressOfLocation3());
        aoladdress4.setText(form.getAddressOfLocation4());
        aoluse1.setText(form.getAddressOfLocationUse1());
        aoluse2.setText(form.getAddressOfLocationUse2());
        aoluse3.setText(form.getAddressOfLocationUse3());
        aoluse4.setText(form.getAddressOfLocationUse4());
        lrtooccupancy1.setText(form.getLocationRentedToOthers1());
        lrtooccupancy2.setText(form.getLocationRentedToOthers2());
        lrtooccupancy3.setText(form.getLocationRentedToOthers3());
        lrtooccupancy4.setText(form.getLocationRentedToOthers4());
        producercomments.setText(form.getProducercomments());
        marketercomments.setText(form.getMarketercomments());
    }

    @FXML
    public void submitFormAction() {
        if (CommonValidations.isStringEmpty(binding.getBusinessName())) {
            InvokeAnimation.attentionSeekerWobble(businessname);
            businessname.setPromptText("Business Name can not be empty");
        } else if (CommonValidations.isStringEmpty(binding.getKeyContact())) {
            InvokeAnimation.attentionSeekerWobble(keycontact);
            keycontact.setPromptText("Key Contact cannot be empty");
        } else if (CommonValidations.isStringEmpty(binding.getKeyPhone())) {
            InvokeAnimation.attentionSeekerWobble(keyphone);
            keyphone.setPromptText("Key phone cannot be empty");
        } else if (CommonValidations.isStringEmpty(binding.getMailingAddress())) {
            InvokeAnimation.attentionSeekerWobble(mailingaddress);
            mailingaddress.setPromptText("Please enter Mailing address");
        } else if (CommonValidations.isStringEmpty(binding.getMailingAddress())) {
            InvokeAnimation.attentionSeekerWobble(mailingaddress);
            mailingaddress.setPromptText("Please enter Mailing address");
        } else if (CommonValidations.isStringEmpty(binding.getSeverity())) {
            InvokeAnimation.attentionSeekerWobble(severity);
        } else {
            Task task;
            task = new Task<Void>() {
                @Override
                public Void call() throws Exception {

                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    InsuranceFormSubmitRequest req1 = new InsuranceFormSubmitRequest();
                    req1.setSeverity(binding.getSeverity());
                    req1.setEntityType(binding.getEntityType());
                    req1.setFinancialYearEnd(binding2.getfinYearEnd());
                    req1.setGroupBenefits(binding2.getgroupBenefits());
                    req1.setPensionPlan(binding2.getpensionPlan());
                    req1.setCurrency1(binding2.getcurrency1());
                    req1.setCurrency2(binding2.getcurrency2());
                    req1.setCurrency3(binding2.getcurrency3());
                    req1.setCurrency4(binding2.getCurrency4());
                    req1.setEcommerce(binding2.geteCommerce());
                    req1.setProfessionalLiability(binding2.getprofLiability());
                    req1.setCyberLiability(binding2.getcyberLiability());
                    req1.setPollutionexposure(binding2.getpollExposure());
                    req1.setAccidentalBenefits(binding2.getaccBenefits());
                    req1.setMalpracticeExposure(binding2.getmalExposure());
                    req1.setAbuseExposure(binding2.getabuseExposure());
                    req1.setBondingOpportunities(binding2.getbondOpportunity());
                    req1.setBusinessInterruptionSheet(binding3.getbiw());
                    req1.setProfit(binding.getProfit());
                    req1.setAddressOfLocationOwnedyes1(binding3.getaolownedy1());
                    req1.setAddressOfLocationOwnedyes2(binding3.getaolownedy2());
                    req1.setAddressOfLocationOwnedyes3(binding3.getaolownedy3());
                    req1.setAddressOfLocationOwnedno1(binding3.getaolownedy4());
                    req1.setKeyContact(binding.getKeyContact());
                    req1.setKeyContactEmailAddress(binding.getKeyEmail());
                    req1.setKeyContactPhone(binding.getKeyPhone());
                    req1.setSecondayContact(binding.getSecondaryContact());
                    req1.setSecondayContactEmailAddress(binding.getSecondaryEmail());
                    req1.setSecondayContactPhone(binding.getSecondaryPhone());
                    req1.setBusinessName(binding.getBusinessName());
                    req1.setMailingAddress(binding.getMailingAddress());
                    req1.setFax(binding.getFax());
                    req1.setWebSiteURL(binding.getWebsite());
                    req1.setRelatedExperience(binding.getRelatedExperience());
                    req1.setOwner1(binding.getOwner1());
                    req1.setOwner2(binding.getOwner2());
                    req1.setOwner3(binding.getOwner3());
                    req1.setOwner4(binding.getOwner4());
                    req1.setBoardOfDirector1(binding.getBod1());
                    req1.setBoardOfDirector2(binding.getBod2());
                    req1.setBoardOfDirector3(binding.getBod3());
                    req1.setBoardOfDirector4(binding.getBod4());
                    if (!binding2.getNoofStaff().equals(null)) {
                        req1.setNoOfStaff(Integer.parseInt(binding2.getNoofStaff()));
                    }
                    if (!binding2.getpayroll().equals(null)) {
                        req1.setPayRoll(Integer.parseInt(binding2.getpayroll()));
                    }
                    if (!binding2.getamount1().equals(null)) {
                        req1.setAmount1(Double.parseDouble(binding2.getamount1()));
                    }
                    if (!binding2.getamount2().equals(null)) {
                        req1.setAmount2(Double.parseDouble(binding2.getamount2()));
                    }
                    if (!binding2.getamount3().equals(null)) {
                        req1.setAmount3(Double.parseDouble(binding2.getamount3()));
                    }
                    if (!binding2.getamount4().equals(null)) {
                        req1.setAmount4(Double.parseDouble(binding2.getamount4()));
                    }
                    req1.setDescriptionOfOperationsAndRevenue1(binding2.getdescriptionOfOpAndRev1());
                    req1.setDescriptionOfOperationsAndRevenue2(binding2.getdescriptionOfOpAndRev2());
                    req1.setDescriptionOfOperationsAndRevenue3(binding2.getdescriptionOfOpAndRev3());
                    req1.setDescriptionOfOperationsAndRevenue4(binding2.getdescriptionOfOpAndRev4());
                    req1.setTotalSale(Double.parseDouble(binding2.gettotalSale()));
                    req1.setPercentageOfUSSales(Double.parseDouble(binding2.getperOfUsSales()));
                    req1.setOnpremises(Integer.parseInt(binding2.getperOfOnPremises()));
                    req1.setOffpremises(Integer.parseInt(binding2.getperOfOffPremises()));
                    req1.setResidential(Integer.parseInt(binding2.getperOfResidential()));
                    req1.setCommercial(Integer.parseInt(binding2.getperOfCommercial()));
                    req1.setSubcontracted(Integer.parseInt(binding2.getperOfSubContracted()));
                    req1.setLargestCustomerOrProject1(binding2.getlargestCustomerOrProject1());
                    req1.setLargestCustomerOrProject2(binding2.getlargestCustomerOrProject2());
                    req1.setLargestCustomerOrProject3(binding2.getlargestCustomerOrProject3());
                    req1.setLargestCustomerOrProject4(binding2.getlargestCustomerOrProject4());
                    req1.setLargestSuppliers1(binding2.getlargestSuppliers1());
                    req1.setLargestSuppliers2(binding2.getlargestSuppliers2());
                    req1.setLargestSuppliers3(binding2.getlargestSuppliers3());
                    req1.setLargestSuppliers4(binding2.getlargestSuppliers4());
                    req1.setFutureOpportunitiesOrPlanOfGrowth(binding3.getfutureopportunity());
                    req1.setDescribeCompetition(binding3.getdescribecompetition());
                    req1.setBusinessAsset(binding3.getbusinessapart());
                    req1.setAdvertising(binding3.getadvertising());
                    req1.setDurationIncaseOfSeriousClaims(binding3.getrecover());
                    req1.setPastClaimAmount1(Double.parseDouble(binding3.getclaimamount1()));
                    req1.setPastClaimAmount2(Double.parseDouble(binding3.getclaimamount2()));
                    req1.setPastClaimAmount3(Double.parseDouble(binding3.getclaimamount3()));
                    req1.setCurrentInsuranceType1(binding3.getciptype1());
                    req1.setCurrentInsuranceType2(binding3.getciptype2());
                    req1.setCurrentInsuranceType3(binding3.getciptype3());
                    req1.setCurrentInsuranceCarrier1(binding3.getcipcarrier1());
                    req1.setCurrentInsuranceCarrier2(binding3.getcipcarrier2());
                    req1.setCurrentInsuranceCarrier3(binding3.getcipcarrier3());
                    req1.setLineHolders1(binding3.getlienholder1());
                    req1.setLineHolders2(binding3.getlienholder2());
                    req1.setLienHolders3(binding3.getlienholder3());
                    req1.setLineHoldersLoc1(binding3.getloc1());
                    req1.setLineHoldersLoc2(binding3.getloc2());
                    req1.setLineHoldersLoc3(binding3.getloc3());
                    req1.setAddressOfLocation1(binding3.getaoladdress1());
                    req1.setAddressOfLocation2(binding3.getaoladdress2());
                    req1.setAddressOfLocation3(binding3.getaoladdress3());
                    req1.setAddressOfLocation4(binding3.getaoladdress4());
                    req1.setAddressOfLocationUse1(binding3.getaoluse1());
                    req1.setAddressOfLocationUse2(binding3.getaoluse2());
                    req1.setAddressOfLocationUse3(binding3.getaoluse3());
                    req1.setAddressOfLocationUse4(binding3.getaoluse4());
                    req1.setLocationRentedToOthers1(binding3.getlrtooccupancy1());
                    req1.setLocationRentedToOthers3(binding3.getlrtooccupancy3());
                    req1.setLocationRentedToOthers2(binding3.getlrtooccupancy2());
                    req1.setLocationRentedToOthers4(binding3.getlrtooccupancy4());

                    req1.setProducercomments(binding3.getproducercomments());
                    req1.setMarketercomments(binding3.getmarketercomments());
                    req1.setBuildingLimit(Double.parseDouble(binding4.getbuildinglimit()));
                    req1.setBuildingDeductible(Double.parseDouble(binding4.getbuildingdeductible()));
                    req1.setContentsLimit(Double.parseDouble(binding4.getcontentslimit()));
                    req1.setContentsDeductible(Double.parseDouble(binding4.getcontentsdeductible()));
                    req1.setStockLimit(Double.parseDouble(binding4.getstocklimit()));
                    req1.setStockDeductible(Double.parseDouble(binding4.getstockdeductible()));
                    req1.setOfficeContentLimit(Double.parseDouble(binding4.getofficelimit()));
                    req1.setOfficeContentDeductible(Double.parseDouble(binding4.getofficedeductible()));
                    req1.setEdpLimit(Double.parseDouble(binding4.getedplimit()));
                    req1.setEdpDeductible(Double.parseDouble(binding4.getedpdeductible()));
                    req1.setEquipmentLimit(Double.parseDouble(binding4.getequipmentlimit()));
                    req1.setEquipmentDeductible(Double.parseDouble(binding4.getequipmentdeductible()));
                    req1.setOffPremisesLimit(Double.parseDouble(binding4.getoffpremiseslimit()));
                    req1.setOffPremisesDeductible(Double.parseDouble(binding4.getoffpremisesdeductible()));
                    req1.setTransitLimit(Double.parseDouble(binding4.gettransitlimit()));
                    req1.setTransitDeductible(Double.parseDouble(binding4.gettransitdeductible()));
                    req1.setMiscPropertyLimit(Double.parseDouble(binding4.getmiscpropertylimit()));
                    req1.setMiscPropertyDeductible(Double.parseDouble(binding4.getmiscpropertydeductible()));
                    req1.setContractorEquipmentLimit(Double.parseDouble(binding4.getcontractorsequipmentlimit()));
                    req1.setContractorEquipmentDeductible(Double.parseDouble(binding4.getcontractorsequipmentdeductible()));
                    req1.setInstallationFloaterLimit(Double.parseDouble(binding4.getinstallationfloatorlimit()));
                    req1.setInstallationFloaterDeductible(Double.parseDouble(binding4.getinstallationfloatordeductible()));
                    req1.setToolFloaterLimit(Double.parseDouble(binding4.gettoolfloatorlimit()));
                    req1.setToolFloaterDeductible(Double.parseDouble(binding4.gettoolfloatordeductible()));
                    req1.setSignFloaterLimit(Double.parseDouble(binding4.getsignfloatorlimit()));
                    req1.setSignFloaterDeductible(Double.parseDouble(binding4.getsignfloatordeductible()));
                    req1.setMotorTruckLimit(Double.parseDouble(binding4.getmotortruckcargolimit()));
                    req1.setMotorTruckDeductible(Double.parseDouble(binding4.getmotortruckcargodeductible()));
                    req1.setGlassLimit(Double.parseDouble(binding4.getglasslimit()));
                    req1.setGlassDeductible(Double.parseDouble(binding4.getglassdeductible()));
                    req1.setSewerBackupDeductible(Double.parseDouble(binding4.getsewerblackupdeductible()));
                    req1.setFloodDeductible(Double.parseDouble(binding4.getflooddeductible()));
                    req1.setEarthquakeDeductible(Double.parseDouble(binding4.getearthquakedeductible()));
                    req1.setProfitLimit(Double.parseDouble(binding4.getprofitslimit()));
                    req1.setProfitDeductible(Double.parseDouble(binding4.getprofitsdeductible()));
                    req1.setGrossEarningLimit(Double.parseDouble(binding4.getgrossearningslimit()));
                    req1.setGrossEarningDeductible(Double.parseDouble(binding4.getgrossearningsdeductible()));
                    req1.setRentalIncomeLimit(Double.parseDouble(binding4.getrentalincomelimit()));
                    req1.setRentalIncomeDeductible(Double.parseDouble(binding4.getrentalincomedeductible()));
                    req1.setExtraExpenseLimit(Double.parseDouble(binding4.getextraexpenselimit()));
                    req1.setExtraExpenseDeductible(Double.parseDouble(binding4.getextraexpensedeductible()));
                    req1.setOffPremisesPowerLimit(Double.parseDouble(binding4.getoffpremiseslimit()));
                    req1.setOffPremisesPowerDeductible(Double.parseDouble(binding4.getoffpremisesdeductible()));
                    req1.setInsideOutsideLimit(Double.parseDouble(binding4.getinsideoutsidelimit()));
                    req1.setInsideOutsideDeductible(Double.parseDouble(binding4.getinsideoutsidedeductible()));
                    req1.setBfMoneyLimit(Double.parseDouble(binding4.getbfmoneylimit()));
                    req1.setBfMoneyDeductible(Double.parseDouble(binding4.getbfmoneydeductible()));
                    req1.setDeopistorForgeryDeductible(Double.parseDouble(binding4.getforgerylimit()));
                    req1.setMoneyOrdersLimit(Double.parseDouble(binding4.getmoneyorderslimit()));
                    req1.setMoneyOrdersDeductible(Double.parseDouble(binding4.getmoneyordersdeductible()));
                    req1.setEmployDishonestyLimit(Double.parseDouble(binding4.getdishonestylimit()));
                    req1.setEmployDishonestyDeductible(Double.parseDouble(binding4.getdishonestydeductible()));
                    req1.setCglLimit(Double.parseDouble(binding4.getcgllimit()));
                    req1.setCglDeductible(Double.parseDouble(binding4.getcgldeductible()));
                    req1.setTenantsLegalLimit(Double.parseDouble(binding4.gettenantslimit()));
                    req1.setTenantsLegalDeductible(Double.parseDouble(binding4.gettenantsdeductible()));
                    req1.setNonOwnedAutoLimit(Double.parseDouble(binding4.getnonownedlimit()));
                    req1.setNonOwnedAutoDeductible(Double.parseDouble(binding4.getnonowneddeductible()));
                    req1.setSef96Limit(Double.parseDouble(binding4.getsef96limit()));
                    req1.setSef96Deductible(Double.parseDouble(binding4.getsef96deductible()));
                    req1.setSef94Limit(Double.parseDouble(binding4.getsef94limit()));
                    req1.setSef94Deductible(Double.parseDouble(binding4.getsef94deductible()));
                    req1.setDoLimit(Double.parseDouble(binding4.getdandlimit()));
                    req1.setDoDeductible(Double.parseDouble(binding4.getdanddeductible()));
                    req1.setEoLimit(Double.parseDouble(binding4.geteandlimit()));
                    req1.setEoDeductible(Double.parseDouble(binding4.geteanddeductible()));
                    req1.setEmployerLimit(Double.parseDouble(binding4.getemployerslimit()));
                    req1.setEmployerDeductible(Double.parseDouble(binding4.getemployersdeductible()));
                    req1.setUmbrellaLimit(Double.parseDouble(binding4.getumbrellalimit()));
                    req1.setUmbrellaDeductible(Double.parseDouble(binding4.getumbrelladeductible()));
                    req1.setWrapUpLimit(Double.parseDouble(binding4.getwrapuplimit()));
                    req1.setWrapUpDeductible(Double.parseDouble(binding4.getwrapupdeductible()));
                    req1.setStdComprehensiveLimit(Double.parseDouble(binding4.getstdlimit()));
                    req1.setStdComprehensiveDeductible(Double.parseDouble(binding4.getstddeductible()));
                    req1.setAirConditioningLimit(Double.parseDouble(binding4.getaclimit()));
                    req1.setAirConditioningDeductible(Double.parseDouble(binding4.getacdeductible()));
                    req1.setProductionMachineryLimit(Double.parseDouble(binding4.getproductionmachinerylimit()));
                    req1.setProductionMachineryDeductible(Double.parseDouble(binding4.getproductionmachinerydeductible()));
                   // req1.setOtherCoverageLimit(Double.parseDouble(binding4.getothercoverage1()));
                    //req1.setOtherCoverage1(Double.parseDouble(binding4.getothercoverage1()));
                    //req1.setOtherCoverage2(Double.parseDouble(binding4.getothercoverage2()));
                    //req1.setOtherCoverageLimit(Double.parseDouble(binding4.getothercoverage1limit()));
                   // req1.setOtherCoverageDeductible(Double.parseDouble(binding4.getothercoverage1deductible()));
                    //ADDITIONAL COVERAGE
                    req1.setAddress(binding4.getlocationaddress());
                    req1.setAge(Integer.parseInt(binding4.getlocationage()));
                    req1.setTotalSqFootage(Double.parseDouble(binding4.gettotsqfootage()));
                    req1.setInsdSqFootage(Double.parseDouble(binding4.getinsidesqfootage()));
                    req1.setNoOfStories(Integer.parseInt(binding4.getnoofstories()));
                    req1.setCurrentInsurer(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautocurrentinsurer());
                   // req1.setCurrentExpDate(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautocurrentexpirydate()); 
                    req1.setPremiumTarget(Double.parseDouble(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautopremiumtarget()));
                    req1.setLienHolders1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder1());
                    req1.setLienHolders2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder2());
                    req1.setLienHolders3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder3());
                    req1.setLienHoldersVehicle1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle1());
                    req1.setLienHoldersVehicle2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle2());
                    req1.setLienHoldersVehicle3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle3());
                    //req1.setClaimDate1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautodateofclaim1());
                    //req1.setClaimDate2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautodateofclaim2());
                    //req1.setClaimDate3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautodateofclaim3());
                    req1.setClaimDesc1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim1());
                    req1.setClaimDesc2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim2());
                    req1.setClaimDesc3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim3());
                   // req1.setCommoditiesTransportedBy(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getcommoditiestransported());
                     req1.setFilingState1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate1());
                     req1.setFilingState2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate2());
                     req1.setFilingState3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate3());
                     req1.setFilingState4(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate4());
                     req1.setFilingUSDot1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot1());
                     req1.setFilingUSDot2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot2());
                     req1.setFilingUSDot3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot3());
                     req1.setFilingUSDot4(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot4());
                     req1.setDilingDocket1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket1());
                     req1.setDilingDocket2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket2());
                     req1.setDilingDocket3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket3());
                     req1.setDilingDocket4(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket4());
                     req1.setFilingType1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling1());
                     req1.setFilingType2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling2());
                     req1.setFilingType3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling3());
                     req1.setFilingType4(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling4());
                     req1.setFilingName1(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired1());
                     req1.setFilingName2(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired2());
                     req1.setFilingName3(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired3());
                     req1.setFilingName4(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired4());
                     //req1.setVehicleNonOwned(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedliability());
                     //req1.setContract((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedcontract);
                     req1.setTypeOfNonOwned(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeofnonowned());
                     req1.setAvgNoOfVehicles(Double.parseDouble(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getanytime()));
                     req1.setAvgValue(Double.parseDouble(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getavgvalue()));
                     req1.setMaxVehicleValue(Double.parseDouble(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getmaxannually()));
                     req1.setMaxCostValue(Double.parseDouble(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getmostexpensive()));
                     req1.setInstructionNotes(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautosubmissioncomments());
                     
                     
                    int i = 0;
                    for (File file : fileList) {
                        byte[] bytes = WriteByteArray.getByteFromFile(file);
                        switch (i) {
                            case 0:
                                req1.setFile1(bytes);
                                req1.setFile1Name(file.getName());
                                break;
                            case 1:
                                req1.setFile2(bytes);
                                req1.setFile2Name(file.getName());
                                break;
                            case 2:
                                req1.setFile3(bytes);
                                req1.setFile3Name(file.getName());
                                break;
                            case 3:
                                req1.setFile4(bytes);
                                req1.setFile4Name(file.getName());
                                break;
                            case 4:
                                req1.setFile5(bytes);
                                req1.setFile5Name(file.getName());
                                break;
                            case 5:
                                req1.setFile6(bytes);
                                req1.setFile6Name(file.getName());
                                break;
                            case 6:
                                req1.setFile7(bytes);
                                req1.setFile7Name(file.getName());
                                break;
                            case 7:
                                req1.setFile8(bytes);
                                req1.setFile8Name(file.getName());
                                break;
                            case 8:
                                req1.setFile9(bytes);
                                req1.setFile9Name(file.getName());
                                break;
                            case 9:
                                req1.setFile10(bytes);
                                req1.setFile10Name(file.getName());
                                break;
                        }
                    }


                    try {
                        InsuranceFormSubmitResponse response = port.getInsuranceOperationsPort().formSubmission(req1);
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            successMessage("Form has been submitted. Your Form id is:" + response.getFormId());

                        } else {
                            errors(response.getErrorMessage());
                        }
                    } catch (com.rav.insurance.insuranceformoperations.webservice.Exception ex) {

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

                Dialogs.showInformationDialog(null, message, "Success", "Success");
                animatedMovement(0, 0);
                openingPane.setVisible(true);
                newBusinessPane.setVisible(false);
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

    @FXML
    public void uploadfiles() {

        FileChooser fileChooser = new FileChooser();

        //FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("name", "filter");
        //fileChooser.getExtensionFilters().add(extFilter);
        Scene scene = upload.getScene();
        if (scene != null) {

            Window window = scene.getWindow();
            if (window != null) {
                List<File> list
                        = fileChooser.showOpenMultipleDialog(window);
                if (list != null) {
                    String files = "";
                    for (File file : list) {
                        System.out.println(file.getPath());
                        files = files + file.getName() + ",";
                    }
                    this.fileList = list;
                    uploadlabel.setText(files.substring(0, files.length() - 1));
                }
            }
        }

    }
}
