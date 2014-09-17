/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.calendar.DatePicker;
import com.rav.insurance.insuranceformoperations.webservice.InsuranceOperationsService_Service;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CommonResponseAttributes;
import com.rav.insurance.insuranceformoperations.webservice.contracts.EditFormSubmissionRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitResponse;
import com.rav.insurance.util.WriteByteArray;
import com.ui.animation.InvokeAnimation;
import com.ui.binding.FormEntry1Binding;
import com.ui.binding.FormEntry2Binding;
import com.ui.binding.FormEntry3Binding;
import com.ui.binding.FormEntry4Binding;
import com.ui.util.AddAnotherInfo;
import com.ui.util.CommonValidations;
import com.ui.util.HTMLToPDF;
import com.ui.util.SavingFile;
import com.ui.util.savinglocally;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.util.Duration;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import ravrun.Rav;

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
    private GridPane gridpane1;
    
    @FXML
    private GridPane gridpane2;
    @FXML
    private GridPane gridpane3;
    @FXML
    private GridPane gridpane4;
    @FXML
    private GridPane gridpane5;
    @FXML
    private GridPane gridpane6;
    
    private XMLGregorianCalendar date11;
    private XMLGregorianCalendar date12;
    private XMLGregorianCalendar date13;
    private XMLGregorianCalendar date14;
    private XMLGregorianCalendar date15;
    private XMLGregorianCalendar date16;
    private XMLGregorianCalendar date17;
    
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
    private TextField roofupdated;
    @FXML
    private TextField heatingupdated;
    @FXML
    private TextField electricalupdated;
    @FXML
    private TextField plumbingupdated;
    @FXML
    private TextField fireprotectiondistance;
    
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
    DatePicker datePicker4 = new DatePicker();
    DatePicker datePicker5 = new DatePicker();
    DatePicker datePicker6 = new DatePicker();
    
    
    int insurancetypeflag = 0;
    
    private int offset;
    private List<AddAnotherInfo> listAddInfo;
    
    private FormEntry1Binding binding;
    private FormEntry2Binding binding2;
    private FormEntry3Binding binding3;
    private FormEntry4Binding binding4;
    
    private String receivedemailaddress;
    private String receivedname;
    private String branch;
    private Date date;
    private String producerid;
    private String formId;
    private String produceridfromform;
    private String branchfromform;

    public String getBranchfromform() {
        return branchfromform;
    }

    public void setBranchfromform(String branchfromform) {
        this.branchfromform = branchfromform;
    }

    public String getProduceridfromform() {
        return produceridfromform;
    }

    public void setProduceridfromform(String produceridfromform) {
        this.produceridfromform = produceridfromform;
    }
    
    public String getFormId() {
        return formId;
    }
    
    public void setFormId(String formId) {
        this.formId = formId;
    }
    
    public boolean isIsEdit() {
        return isEdit;
    }
    
    public void setIsEdit(boolean isEdit) {
        this.isEdit = isEdit;
    }
    private boolean isEdit;
    
    public String getProducerid() {
        return producerid;
    }
    
    public void setProducerid(String producerid) {
        this.producerid = producerid;
    }
    
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
        listAddInfo = new ArrayList();
        binding = new FormEntry1Binding();
        binding2 = new FormEntry2Binding();
        binding3 = new FormEntry3Binding();
        binding4 = new FormEntry4Binding();
        fullScreenPane.setVisible(true);
        openingPane.setVisible(true);
        newBusinessPane.setVisible(false);
        severity.getSelectionModel().selectFirst();
        finYearEnd.getSelectionModel().selectFirst();
        entitytype.getSelectionModel().selectFirst();
        currency1.getSelectionModel().selectFirst();
        currency2.getSelectionModel().selectFirst();
        currency3.getSelectionModel().selectFirst();
        currency4.getSelectionModel().selectFirst();
        groupbenefits.getSelectionModel().selectFirst();
        pensionplan.getSelectionModel().selectFirst();
        basement.getSelectionModel().selectFirst();
        
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
        Bindings.bindBidirectional(yearsinbusiness.textProperty(), binding.yearsProperty());
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
        Bindings.bindBidirectional(roofupdated.textProperty(), binding4.roofupdatedProperty());
        Bindings.bindBidirectional(heatingupdated.textProperty(), binding4.heatingupdatedProperty());
        Bindings.bindBidirectional(electricalupdated.textProperty(), binding4.electricalupdatedProperty());
        Bindings.bindBidirectional(plumbingupdated.textProperty(), binding4.plumbingupdatedProperty());
        Bindings.bindBidirectional(fireprotectiondistance.textProperty(), binding4.distanceProperty());

        //choicebox
        severity.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                binding.setSeverity(newSelection);
            }
            
        });
        
        entitytype.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                
                binding.setEntityType(newSelection);
                
            }
        });
        finYearEnd.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                
                binding2.setfinYearEnd(newSelection);
                
            }
        });
        groupbenefits.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                
                binding2.setgroupBenefits(newSelection);
                
            }
        });
        pensionplan.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                
                binding2.setpensionPlan(newSelection);
                
            }
        });
        currency1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                
                binding2.setcurrency1(newSelection);
                
            }
        });
        currency2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                
                binding2.setcurrency2(newSelection);
                
            }
        });
        currency3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                
                binding2.setcurrency3(newSelection);
                
            }
        });
        currency4.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                
                binding2.setCurrency4(newSelection);
                
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
                    binding2.seteCommerce("selected");
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
        
        ChangeListener<Boolean> listener20 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mtcowner.isSelected()) {
                    binding4.setmotortruckcargoowner("selected");
                }
            }
        };
        mtcowner.selectedProperty().addListener(listener20);
        
        ChangeListener<Boolean> listener21 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (mtctruckman.isSelected()) {
                    binding4.setmotortruckcargotruckman("selected");
                }
            }
        };
        mtctruckman.selectedProperty().addListener(listener21);
        
        ChangeListener<Boolean> listener22 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (ge80.isSelected()) {
                    binding4.setgecheckbox("selected80");
                }
            }
        };
        ge80.selectedProperty().addListener(listener22);
        
        ChangeListener<Boolean> listener23 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (ge50.isSelected()) {
                    binding4.setgecheckbox("selected50");
                }
            }
        };
        ge50.selectedProperty().addListener(listener23);
        
        ChangeListener<Boolean> listener24 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (wallsframe.isSelected()) {
                    binding4.setwallsframe("selected");
                }
            }
        };
        wallsframe.selectedProperty().addListener(listener24);
        
        ChangeListener<Boolean> listener25 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (wallsbrick.isSelected()) {
                    binding4.setwallsbrick("selected");
                }
            }
        };
        wallsbrick.selectedProperty().addListener(listener25);
        
        ChangeListener<Boolean> listener26 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (wallshcb.isSelected()) {
                    binding4.setwallshcb("selected");
                }
            }
        };
        wallshcb.selectedProperty().addListener(listener26);
        
        ChangeListener<Boolean> listener27 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (wallssteel.isSelected()) {
                    binding4.setwallssteel("selected");
                }
            }
        };
        wallssteel.selectedProperty().addListener(listener27);
        
        ChangeListener<Boolean> listener28 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (woodjoist.isSelected()) {
                    binding4.setwoodjoist("selected");
                }
            }
        };
        woodjoist.selectedProperty().addListener(listener28);
        
        ChangeListener<Boolean> listener29 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (steeldeck.isSelected()) {
                    binding4.setsteeldeck("selected");
                }
            }
        };
        steeldeck.selectedProperty().addListener(listener29);
        
        ChangeListener<Boolean> listener30 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (roofconcrete.isSelected()) {
                    binding4.setroofconcrete("selected");
                }
            }
        };
        roofconcrete.selectedProperty().addListener(listener30);
        
        ChangeListener<Boolean> listener31 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (floorsconcrete.isSelected()) {
                    binding4.setfloorsconcrete("selected");
                }
            }
        };
        floorsconcrete.selectedProperty().addListener(listener31);
        
        ChangeListener<Boolean> listener32 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (floorswood.isSelected()) {
                    binding4.setfloorswood("selected");
                }
            }
        };
        floorswood.selectedProperty().addListener(listener32);
        
        ChangeListener<Boolean> listener33 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (fagas.isSelected()) {
                    binding4.setfagas("selected");
                }
            }
        };
        fagas.selectedProperty().addListener(listener33);
        
        ChangeListener<Boolean> listener34 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (faoil.isSelected()) {
                    binding4.setfaoil("selected");
                }
            }
        };
        faoil.selectedProperty().addListener(listener34);
        
        ChangeListener<Boolean> listener35 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (heatingelectric.isSelected()) {
                    binding4.setheatingelectric("selected");
                }
            }
        };
        heatingelectric.selectedProperty().addListener(listener35);
        
        ChangeListener<Boolean> listener36 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (heatingother.isSelected()) {
                    binding4.setheatingother("selected");
                }
            }
        };
        heatingother.selectedProperty().addListener(listener36);
        
        ChangeListener<Boolean> listener37 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (electricalbreakers.isSelected()) {
                    binding4.setelectricalbreakers("selected");
                }
            }
        };
        electricalbreakers.selectedProperty().addListener(listener37);
        
        ChangeListener<Boolean> listener38 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (electricalfuses.isSelected()) {
                    binding4.setelectricalfuses("selected");
                }
            }
        };
        electricalfuses.selectedProperty().addListener(listener38);
        
        ChangeListener<Boolean> listener39 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (noofamps.isSelected()) {
                    binding4.setnoofamps("selected");
                }
            }
        };
        noofamps.selectedProperty().addListener(listener39);
        
        ChangeListener<Boolean> listener40 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (copper.isSelected()) {
                    binding4.setcopper("selected");
                }
            }
        };
        copper.selectedProperty().addListener(listener40);
        
        ChangeListener<Boolean> listener41 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (pvc.isSelected()) {
                    binding4.setpvc("selected");
                }
            }
        };
        pvc.selectedProperty().addListener(listener41);
        
        ChangeListener<Boolean> listener42 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (plumbingother.isSelected()) {
                    binding4.setplumbingother("selected");
                }
            }
        };
        plumbingother.selectedProperty().addListener(listener42);
        
        ChangeListener<Boolean> listener43 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (sprinklers.isSelected()) {
                    binding4.setFireProtection("Sprinklers");
                }
            }
        };
        sprinklers.selectedProperty().addListener(listener43);
        
        ChangeListener<Boolean> listener44 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (svccontract.isSelected()) {
                    binding4.setFireProtection("SVC");
                }
            }
        };
        svccontract.selectedProperty().addListener(listener44);
        
        ChangeListener<Boolean> listener45 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (hydrant.isSelected()) {
                    binding4.setFireProtection("Hydrant");
                }
            }
        };
        hydrant.selectedProperty().addListener(listener45);
        
        ChangeListener<Boolean> listener46 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (firehall.isSelected()) {
                    binding4.setFireProtection("Firehall");
                }
            }
        };
        firehall.selectedProperty().addListener(listener46);
        
        ChangeListener<Boolean> listener47 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (unprotected.isSelected()) {
                    binding4.setFireProtection("Unprotected");
                }
            }
        };
        unprotected.selectedProperty().addListener(listener47);
        
        ChangeListener<Boolean> listener48 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (alarmsystem.isSelected()) {
                    binding4.setSecurity("Alarm System");
                }
            }
        };
        alarmsystem.selectedProperty().addListener(listener48);
        
        ChangeListener<Boolean> listener49 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (centralmonitored.isSelected()) {
                    binding4.setSecurity("Central Monitored");
                }
            }
        };
        centralmonitored.selectedProperty().addListener(listener49);
        
        ChangeListener<Boolean> listener50 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (windowbars.isSelected()) {
                    binding4.setSecurity("Window Bars");
                }
            }
        };
        windowbars.selectedProperty().addListener(listener50);
        
        ChangeListener<Boolean> listener51 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if (deadbolts.isSelected()) {
                    binding4.setSecurity("Dead Bolts");
                }
            }
        };
        deadbolts.selectedProperty().addListener(listener51);
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                bg.requestFocus();
            }
        });
        
        datePicker.localeProperty().set(Locale.ENGLISH);
        datePicker1.localeProperty().set(Locale.ENGLISH);
        datePicker2.localeProperty().set(Locale.ENGLISH);
        datePicker3.localeProperty().set(Locale.ENGLISH);
        datePicker4.localeProperty().set(Locale.ENGLISH);
        datePicker5.localeProperty().set(Locale.ENGLISH);
       
        
        datePicker.setLayoutX(0.0);
        datePicker.setLayoutY(81.0);
        datePicker.setPrefWidth(200.0);
        
        datePicker1.setLayoutX(0.0);
        datePicker1.setLayoutY(81.0);
        datePicker1.setPrefWidth(200.0);
        
        datePicker2.setLayoutX(0.0);
        datePicker2.setLayoutY(81.0);
        datePicker2.setPrefWidth(200.0);
        
        datePicker3.setLayoutX(0.0);
        datePicker3.setLayoutY(81.0);
        datePicker3.setPrefWidth(200.0);
        
        datePicker4.setLayoutX(0.0);
        datePicker4.setLayoutY(81.0);
        datePicker4.setPrefWidth(200.0);
        
        datePicker5.setLayoutX(0.0);
        datePicker5.setLayoutY(81.0);
        datePicker5.setPrefWidth(200.0);
        
        
        datePicker.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker1.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker2.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker3.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker4.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker5.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        
        datePicker.setPromptText("Date of Claim");
        datePicker.setLocale(Locale.ENGLISH);
        datePicker.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker.getCalendarView().setShowWeeks(false);
        datePicker.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker1.setPromptText("Date of Claim");
        datePicker1.setLocale(Locale.ENGLISH);
        datePicker1.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker1.getCalendarView().setShowWeeks(false);
        datePicker1.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker2.setPromptText("Date of Claim");
        datePicker2.setLocale(Locale.ENGLISH);
        datePicker2.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker2.getCalendarView().setShowWeeks(false);
        datePicker2.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker3.setPromptText("Expiry");
        datePicker3.setLocale(Locale.ENGLISH);
        datePicker3.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker3.getCalendarView().setShowWeeks(false);
        datePicker3.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker4.setPromptText("Expiry");
        datePicker4.setLocale(Locale.ENGLISH);
        datePicker4.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker4.getCalendarView().setShowWeeks(false);
        datePicker4.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker5.setPromptText("Expiry");
        datePicker5.setLocale(Locale.ENGLISH);
        datePicker5.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker5.getCalendarView().setShowWeeks(false);
        datePicker5.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        
        //fullScreenPane.getChildren().add(datePicker,138,495);
        gridpane1.add(datePicker, 0,0);
        gridpane2.add(datePicker1, 0,0);
        gridpane3.add(datePicker2, 0,0);
        gridpane4.add(datePicker3, 0,0);
        gridpane5.add(datePicker4, 0,0);
        gridpane6.add(datePicker5, 0,0);
    }
    
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }
    
    @FXML
    public void submitWorkList() throws Exception {
        System.out.println("Inside worklist");
        System.out.println(producerid);
        ((EnterCodeUIController)screenPage.getControlledScreen("OtherScreen")).submitWorklist(producerid);
        
    }
    
    @FXML
    public void searchArchive() throws Exception {
        System.out.println("Inside SearchArchive");
        ((EnterCodeUIController)screenPage.getControlledScreen("OtherScreen")).searchArchive();
        System.out.println("Inside SearchArchive1");
        screenPage.setScreen("OtherScreen");
        
    }
    
    @FXML
    public void submitNewBusiness() {
        
        openingPane.setVisible(false);
        newBusinessPane.setVisible(true);
    }
    
    @FXML
    public void submitActionCommercial() {
        insurancetypeflag = 1;
        animatedMovement(-1269, 0);
        returnedname.setText(getReceivedname());
        returnedbranch.setText(getBranch());
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        returneddate.setText(dateFormat.format(date));
    }
    
    @FXML
    public void submitActionAuto() {
        insurancetypeflag = 2;
        animatedMovement(-1269, 0);
        returnedname.setText(getReceivedname());
        returnedbranch.setText(getBranch());
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        returneddate.setText(dateFormat.format(date));
    }
    
    @FXML
    public void submitActionBoth() {
        insurancetypeflag = 3;
        animatedMovement(-1269, 0);
        returnedname.setText(getReceivedname());
        returnedbranch.setText(getBranch());
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        returneddate.setText(dateFormat.format(date));
    }
    
    @FXML
    public void openProposal() {
        new Rav("/Users/harsimransingh/Desktop/Contractors Equipment.docx").execute();
    }
    
    @FXML
    public void continue1() {
        if (CommonValidations.isStringEmpty(binding.getBusinessName())) {
            System.out.println("1");
            InvokeAnimation.attentionSeekerWobble(businessname);
            businessname.setPromptText("Business Name can not be empty");
            
        } else if (CommonValidations.isStringEmpty(binding.getKeyContact())) {
            System.out.println("2");
            InvokeAnimation.attentionSeekerWobble(keycontact);
            keycontact.setPromptText("Key Contact cannot be empty");
        } else if (CommonValidations.isStringEmpty(binding.getKeyPhone())) {
            System.out.println("3");
            InvokeAnimation.attentionSeekerWobble(keyphone);
            keyphone.setPromptText("Key phone cannot be empty");
        } else if (CommonValidations.isStringEmpty(binding.getMailingAddress())) {
            System.out.println("4");
            InvokeAnimation.attentionSeekerWobble(mailingaddress);
            mailingaddress.setPromptText("Please enter Mailing address");
        }else if (CommonValidations.isStringEmpty(binding.getSeverity())||binding.getSeverity().equalsIgnoreCase("select")) {
            System.out.println("Severity");
            successMessage1("Select Severity level");
            
        }
        else {
            animatedMovement(-2538, 0);
        }
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
    public void continue5() {
        System.out.println(insurancetypeflag);
        if (insurancetypeflag == 1) {
            animatedMovement(-7614, 0);
            autoinsurancebutton.setVisible(false);
        } else if (insurancetypeflag == 2) {
            screenPage.setScreen("AutoSubmission");
        } else if (insurancetypeflag == 3) {
            animatedMovement(-7614, 0);
            CommercialSubmit.setVisible(false);
            autoinsurancebutton.setVisible(true);
        }
        
    }
   
    @FXML
    public void addAdditionNext() {
        if (offset < 10) {
            try {
                if (listAddInfo.get(offset).getAddress1() != null) {
                    listAddInfo.get(offset).setAddress1(binding4.getlocationaddress());
                }
                offset += 1;
                if (listAddInfo.get(offset).getAddress1() != null) {
                    binding4.setlocationaddress(listAddInfo.get(offset).getAddress1());
                }
            } catch (Exception e) {
            }
        }
    }

    @FXML
    public void addAdditionPrev() {
        if (offset > 0) {
            try {
                offset -= 1;
                if (listAddInfo.get(offset).getAddress1() != null) {
                    binding4.setlocationaddress(listAddInfo.get(offset).getAddress1());
                }
            } catch (Exception e) {
            }
        }
    }
    
    @FXML
    public void clientprofile2previous() {
        animatedMovement(-1269, 0);
    }
    
    @FXML
    public void clientprofile3previous() {
        animatedMovement(-2538, 0);
    }
    
    @FXML
    public void clientprofile4previous() {
        animatedMovement(-3807, 0);
    }
    
    @FXML
    public void clientprofile5previous() {
        animatedMovement(-5076, 0);
    }
    
    @FXML
    public void commercialprevious() {
        animatedMovement(-6345, 0);
    }
    
    @FXML
    public void autobutton() {
        screenPage.setScreen("AutoSubmission");
    }
    
    @FXML
    public void submitSave() {
        SavingFile sf = new SavingFile();
        savinglocally.toFile(sf, "Harman");
    }
    
    public void viewApplication(final GetInsuranceFormResponse form, final String formId) {
        isEdit = true;
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormRequest req = new GetInsuranceFormRequest();
                    req.setFormId(formId);
                    // req.setProducerId(binding.getsearchproducerid());
                    //req.setStatus("NEW");
                    //req.setFormId(Integer.parseInt(binding.getsearchapplicationid()));

                    GetInsuranceFormResponse response = port.getInsuranceOperationsPort().getForm(req);
                    
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        System.out.println("formid is " + formId);
                        setFormId(formId);
                        assign(response);
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
    
    public void assign(final GetInsuranceFormResponse form) {
        Platform.runLater(new Runnable() {
            public void run() {
                
                if (form != null) {
                    System.out.println("Form is not null");
                } else {
                    System.out.println("Form is null");
                }
                if (keycontact != null) {
                    System.out.println("keycontact is not null");
                } else {
                    System.out.println("keycontact is null");
                }
                if ("High".equals(form.getSeverity())) {
                    severity.getSelectionModel().select("High");
                } 
                else if ("Medium".equals(form.getSeverity())) {
                    severity.getSelectionModel().select("Medium");
                } else if ("Low".equals(form.getSeverity())){
                    severity.getSelectionModel().select("Low");
                }
                
                if ("Corporation".equals(form.getEntityType())) {
                    entitytype.getSelectionModel().select("Corporation");
                }else if ("Select".equals(form.getEntityType())){
                entitytype.getSelectionModel().select("Select");
                }
                else if ("Sole Proprietor".equals(form.getEntityType())) {
                    entitytype.getSelectionModel().select("Sole Proprietor");
                } else {
                    entitytype.getSelectionModel().select("Other");
                }
                
                if ("January".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("January");
                } else if ("February".equals(form.getFinancialYearEnd())) 
               {    finYearEnd.getSelectionModel().select("February");
                } else if ("Select".equals(form.getFinancialYearEnd())) 
               {    finYearEnd.getSelectionModel().select("Select");
                }
                else if ("March".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("March");
                } else if ("April".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("April");
                } else if ("May".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("May");
                } else if ("June".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("June");
                } else if ("July".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("July");
                } else if ("August".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("August");
                } else if ("September".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("September");
                } else if ("October".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("October");
                } else if ("November".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("November");
                } else if ("December".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("December");
                }
                else{}
                System.out.println("There");
                
                if ("Select".equals(form.getGroupBenefits())) {
                    groupbenefits.getSelectionModel().select("Select");
                } else if ("Yes".equals(form.getGroupBenefits())) {
                    groupbenefits.getSelectionModel().select("Yes");
                } else {
                    groupbenefits.getSelectionModel().select("No");
                }
                
                if ("Select".equals(form.getPensionPlan())) {
                    pensionplan.getSelectionModel().select("Select");
                } else if ("Yes".equals(form.getPensionPlan())) {
                    pensionplan.getSelectionModel().select("Yes");
                } else {
                    pensionplan.getSelectionModel().select("No");
                }
                if ("US$".equals(form.getCurrency1())) {
                    currency1.getSelectionModel().select("US$");
                } else if ("CAN$".equals(form.getCurrency1())) {
                    currency1.getSelectionModel().select("CAN$");
                }
                if ("US$".equals(form.getCurrency2())){
                    currency2.getSelectionModel().select("US$");
                } else if ("CAN$".equals(form.getCurrency2())) {
                    currency2.getSelectionModel().select("CAN$");
                }
                
                if ("US$".equals(form.getCurrency3())){
                    currency3.getSelectionModel().select("US$");
                } else if ("CAN$".equals(form.getCurrency3())) {
                    currency3.getSelectionModel().select("CAN$");
                }
                
               if ("US$".equals(form.getCurrency4())){
                    currency4.getSelectionModel().select("US$");
                } else if ("CAN$".equals(form.getCurrency4())) {
                    currency4.getSelectionModel().select("CAN$");
                }
                if ("selected".equals(form.getEcommerce())) {
                    ecommerce.setSelected(true);
                }
                
                if ("selected".equals(form.getProfessionalLiability())) {
                    profliability.setSelected(true);
                }
                if ("selected".equals(form.getCyberLiability())) {
                    cyberliability.setSelected(true);
                }
                if ("selected".equals(form.getPollutionexposure())) {
                    pollexposure.setSelected(true);
                }
                if ("selected".equals(form.getAccidentalBenefits())) {
                    accbenefits.setSelected(true);
                }
                if ("selected".equals(form.getMalpracticeExposure())) {
                    malexposure.setSelected(true);
                }
                if ("selected".equals(form.getAbuseExposure())) {
                    abuseexposure.setSelected(true);
                }
                if ("selected".equals(form.getBondingOpportunities())) {
                    bondopportunity.setSelected(true);
                }
                if ("selected".equals(form.getBusinessInterruptionSheet())) {
                    biw.setSelected(true);
                }
                if ("selected".equals(form.getTruckMan())) {
                    mtctruckman.setSelected(true);
                }
                if ("selected".equals(form.getOwner())) {
                    mtcowner.setSelected(true);
                }
                if ("selected80".equals(form.getGrossEarningCheckbox())) {
                    ge80.setSelected(true);
                }
                if ("selected50".equals(form.getGrossEarningCheckbox())) {
                    ge50.setSelected(true);
                }
                
                
                if ("selected".equals(form.getWallsframe())) {
                    wallsframe.setSelected(true);
                }
                if ("selected".equals(form.getWallshcb())) {
                    wallshcb.setSelected(true);
                }
                if ("selected".equals(form.getWallssteel())) {
                    wallssteel.setSelected(true);
                }
                if ("selected".equals(form.getWallsbrick())) {
                    wallsbrick.setSelected(true);
                }
                
                if ("selected".equals(form.getRoofwood())) {
                    woodjoist.setSelected(true);
                }
                if ("selected".equals(form.getRoofsteel())) {
                    steeldeck.setSelected(true);
                }
                if ("selected".equals(form.getRoofconcrete())) {
                    roofconcrete.setSelected(true);
                }
                if ("selected".equals(form.getFloorsconcrete())) {
                    floorsconcrete.setSelected(true);
                }
                if ("selected".equals(form.getFloorswood())) {
                    floorswood.setSelected(true);
                }
                if ("selected".equals(form.getHeatinggas())) {
                    fagas.setSelected(true);
                }
                if ("selected".equals(form.getHeatingoil())) {
                    faoil.setSelected(true);
                }
                if ("selected".equals(form.getHeatingelectric())) {
                    heatingelectric.setSelected(true);
                }
                if ("selected".equals(form.getHeatingother())) {
                    heatingother.setSelected(true);
                }
                if ("selected".equals(form.getElectricalbreakers())) {
                    electricalbreakers.setSelected(true);
                }
                if ("selected".equals(form.getElectricalfuses())) {
                    electricalfuses.setSelected(true);
                }
                if ("selected".equals(form.getElectricalamps())) {
                    noofamps.setSelected(true);
                }
                if ("selected".equals(form.getPlumbingcopper())) {
                    copper.setSelected(true);
                }
                if ("selected".equals(form.getPlumbingpvc())) {
                    pvc.setSelected(true);
                }
                if ("selected".equals(form.getPlumbingother())) {
                    plumbingother.setSelected(true);
                }
                if ("Sprinklers".equals(form.getFireProtection())) {
                    sprinklers.setSelected(true);
                }
                if ("SVC".equals(form.getFireProtection())) {
                    svccontract.setSelected(true);
                }
                if ("Hydrant".equals(form.getFireProtection())) {
                    hydrant.setSelected(true);
                }
                if ("Firehall".equals(form.getFireProtection())) {
                    firehall.setSelected(true);
                }
                if ("Unprotected".equals(form.getFireProtection())) {
                    unprotected.setSelected(true);
                }
                if ("Alarm System".equals(form.getSecurity())) {
                    alarmsystem.setSelected(true);
                }
                if ("Central Monitored".equals(form.getSecurity())) {
                    centralmonitored.setSelected(true);
                }
                if ("Window Bars".equals(form.getSecurity())) {
                    windowbars.setSelected(true);
                }
                if ("Dead Bolts".equals(form.getSecurity())) {
                    deadbolts.setSelected(true);
                }
                if("Select".equals(form.getBasement()))
                { basement.getSelectionModel().select("Select");}
                else if("Yes".equals(form.getBasement()))
                {basement.getSelectionModel().select("Yes");}
                else if("No".equals(form.getBasement()))
                {basement.getSelectionModel().select("No");}
                
                if ("Profit".equals(form.getProfit())) {
                    profit.setSelected(true);
                } else if ("Non Profit".equals(form.getProfit())) {
                    nonprofit.setSelected(true);
                }
                if ("Yes".equals(form.getAddressOfLocationOwnedyes1())){
                    aolownedy1.setSelected(true);
                }else if ("NO".equals(form.getAddressOfLocationOwnedyes1()))
                {aolownedn1.setSelected(true);
                }
                if ("Yes".equals(form.getAddressOfLocationOwnedyes2())){
                    aolownedy2.setSelected(true);
                }else if ("NO".equals(form.getAddressOfLocationOwnedyes2()))
                {aolownedn2.setSelected(true);
                }
                if ("Yes".equals(form.getAddressOfLocationOwnedyes3())){
                    aolownedy3.setSelected(true);
                }else if ("NO".equals(form.getAddressOfLocationOwnedyes3()))
                {aolownedn3.setSelected(true);
                }
                if ("Yes".equals(form.getAddressOfLocationOwnedno1())){
                    aolownedy4.setSelected(true);
                }else if ("NO".equals(form.getAddressOfLocationOwnedno1()))
                {aolownedn4.setSelected(true);
                }
                
                  /*
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
                 req1.setOwner(binding4.getmotortruckcargoowner());
                 req1.setTruckMan(binding4.getmotortruckcargotruckman());
                 req1.setGrossEarningCheckBox(binding4.getgecheckbox());
                 req1.setWallsframe(binding4.getwallsframe());
                 req1.setWallshcb(binding4.getwallshcb());
                 req1.setWallssteel(binding4.getwallssteel());
                 req1.setWallsbrick(binding4.getwallsbrick());
                 req1.setRoofwood(binding4.getwoodjoist());
                 req1.setRoofsteel(binding4.getsteeldeck());
                 req1.setRoofconcrete(binding4.getroofconcrete());
                 req1.setFloorsconcrete(binding4.getfloorsconcrete());
                 req1.setFloorswood(binding4.getfloorswood());
                 req1.setHeatinggas(binding4.getfagas());
                 req1.setHeatingoil(binding4.getfaoil());
                 req1.setHeatingelectric(binding4.getheatingelectric());
                 req1.setHeatingother(binding4.getheatingother());
                 req1.setElectricalbreakers(binding4.getelectricalbreakers());
                 req1.setElectricalfuses(binding4.getelectricalfuses());
                 req1.setElectricalamps(binding4.getnoofamps());
                 req1.setPlumbingcopper(binding4.getcopper());
                 req1.setPlumbingpvc(binding4.getpvc());
                 req1.setPlumbingother(binding4.getplumbingother());
                 req1.setFireProtection(binding4.getFireProtection());
                 req1.setSecurity(binding4.getSecurity());
                */
                produceridfromform=form.getProducer();
                branchfromform=form.getBranch();
                System.out.println("producer id from form"+produceridfromform);
                keycontact.setText(form.getKeyContact());
                keyphone.setText(form.getKeyContactPhone());
                keyemail.setText(form.getKeyContactEmailAddress());
                secondarycontact.setText(form.getSecondayContact());
                secondaryphone.setText(form.getSecondayContactPhone());
                secondaryemail.setText(form.getSecondayContactEmailAddress());
                businessname.setText(form.getBusinessName());
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
                /*buildinglimit.setText(Double.toString(form.getBuildingLimit()));
                 buildingdeductible.setText(Double.toString(form.getBuildingDeductible()));
                 contentslimit.setText(Double.toString(form.getContentsLimit()));
                 contentsdeductible.setText(Double.toString(form.getContentsDeductible()));
                 stocklimit.setText(Double.toString(form.getStockLimit()));
                 stockdeductible.setText(Double.toString(form.getStockDeductible()));
                 officelimit.setText(Double.toString(form.getOfficeContentLimit()));
                 officedeductible.setText(Double.toString(form.getOfficeContentDeductible()));
                 edplimit.setText(Double.toString(form.getEdpLimit()));
                 edpdeductible.setText(Double.toString(form.getEdpDeductible()));
                 equipmentdeductible.setText(Double.toString(form.getEquipmentDeductible()));
                 equipmentlimit.setText(Double.toString(form.getEquipmentLimit()));
                 offpremisesdeductible.setText(Double.toString(form.getOffPremisesDeductible()));
                 offpremiseslimit.setText(Double.toString(form.getOffPremisesLimit()));
                 transitlimit.setText(Double.toString(form.getTransitLimit()));
                 transitdeductible.setText(Double.toString(form.getTransitDeductible()));
                 miscpropertylimit.setText(Double.toString(form.getMiscPropertyLimit()));
                 miscpropertydeductible.setText(Double.toString(form.getMiscPropertyDeductible()));
                 contractorsequipmentlimit.setText(Double.toString(form.getContractorEquipmentLimit()));
                 contractorsequipmentdeductible.setText(Double.toString(form.getContractorEquipmentDeductible()));
                 installationfloatorlimit.setText(Double.toString(form.getInstallationFloaterLimit()));
                 installationfloatordeductible.setText(Double.toString(form.getInstallationFloaterDeductible()));
                 toolfloatorlimit.setText(Double.toString(form.getToolFloaterLimit()));
                 toolfloatordeductible.setText(Double.toString(form.getToolFloaterDeductible()));
                 signfloatorlimit.setText(Double.toString(form.getSignFloaterLimit()));
                 signfloatordeductible.setText(Double.toString(form.getSignFloaterDeductible()));
                 motortruckcargolimit.setText(Double.toString(form.getMotorTruckLimit()));
                 motortruckcargodeductible.setText(Double.toString(form.getMotorTruckDeductible()));
                 glasslimit.setText(Double.toString(form.getGlassLimit()));
                 glassdeductible.setText(Double.toString(form.getGlassDeductible()));
                 sewerbackupdeductible.setText(Double.toString(form.getSewerBackupDeductible()));
                 flooddeductible.setText(Double.toString(form.getFloodDeductible()));
                 earthquakedeductible.setText(Double.toString(form.getEarthquakeDeductible()));
                 profitslimit.setText(Double.toString(form.getProfitLimit()));
                 profitsdeductible.setText(Double.toString(form.getProfitDeductible()));
                 grossearningslimit.setText(Double.toString(form.getGrossEarningLimit()));
                 grossearningsdeductible.setText(Double.toString(form.getGrossEarningDeductible()));
                 rentalincomelimit.setText(Double.toString(form.getRentalIncomeLimit()));
                 rentalincomedeductible.setText(Double.toString(form.getRentalIncomeDeductible()));
                 extraexpenselimit.setText(Double.toString(form.getExtraExpenseLimit()));
                 extraexpensedeductible.setText(Double.toString(form.getExtraExpenseDeductible()));
                 offpremisesdeductible.setText(Double.toString(form.getOffPremisesDeductible()));
                 offpremiseslimit.setText(Double.toString(form.getOffPremisesLimit()));
                 insideoutsidelimit.setText(Double.toString(form.getInsideOutsideLimit()));
                 insideoutsidedeductible.setText(Double.toString(form.getInsideOutsideDeductible()));
                 bfmoneylimit.setText(Double.toString(form.getBfMoneyLimit()));
                 bfmoneydeductible.setText(Double.toString(form.getBfMoneyDeductible()));
                 forgerylimit.setText(Double.toString(form.getDeopistorForgeryLimit()));
                 forgerydeductible.setText(Double.toString(form.getDeopistorForgeryDeductible()));
                 moneyorderslimit.setText(Double.toString(form.getMoneyOrdersLimit()));
                 moneyordersdeductible.setText(Double.toString(form.getMoneyOrdersDeductible()));
                 dishonestylimit.setText(Double.toString(form.getEmployDishonestyLimit()));
                 dishonestydeductible.setText(Double.toString(form.getEmployDishonestyDeductible()));
                 cgllimit.setText(Double.toString(form.getCglLimit()));
                 cgldeductible.setText(Double.toString(form.getCglDeductible()));
                 tenantslimit.setText(Double.toString(form.getTenantsLegalLimit()));
                 tenantsdeductible.setText(Double.toString(form.getTenantsLegalDeductible()));
                 nonownedlimit.setText(Double.toString(form.getNonOwnedAutoLimit()));
                 nonowneddeductible.setText(Double.toString(form.getNonOwnedAutoDeductible()));
                 sef94limit.setText(Double.toString(form.getSef94Limit()));
                 sef94deductible.setText(Double.toString(form.getSef94Deductible()));
                 sef96limit.setText(Double.toString(form.getSef96Limit()));
                 sef96deductible.setText(Double.toString(form.getSef96Deductible()));
                 dandlimit.setText(Double.toString(form.getDoLimit()));
                 danddeductible.setText(Double.toString(form.getDoDeductible()));
                 eanddeductible.setText(Double.toString(form.getEoDeductible()));
                 eandlimit.setText(Double.toString(form.getEoLimit()));
                 employerslimit.setText(Double.toString(form.getEmployerLimit()));
                 employersdeductible.setText(Double.toString(form.getEmployerDeductible()));
                 umbrellalimit.setText(Double.toString(form.getUmbrellaLimit()));
                 umbrelladeductible.setText(Double.toString(form.getUmbrellaDeductible()));
                 wrapuplimit.setText(Double.toString(form.getWrapUpLimit()));
                 wrapupdeductible.setText(Double.toString(form.getWrapUpDeductible()));
                 stdlimit.setText(Double.toString(form.getStdComprehensiveLimit()));
                 stddeductible.setText(Double.toString(form.getStdComprehensiveDeductible()));
                 aclimit.setText(Double.toString(form.getAirConditioningLimit()));
                 acdeductible.setText(Double.toString(form.getAirConditioningDeductible()));
                 productionmachinerylimit.setText(Double.toString(form.getProductionMachineryLimit()));
                 productionmachinerydeductible.setText(Double.toString(form.getProductionMachineryDeductible()));
                 othercoverage1.setText(form.getOthercoverage1());
                 othercoverage2.setText(form.getOthercoverage2());
                 othercoverage1limit.setText(Double.toString(form.getOtherCoverageLimit1()));
                 othercoverage2limit.setText(Double.toString(form.getOtherCoverageLimit2()));
                 othercoverage1deductible.setText(Double.toString(form.getOtherCoverageDeductible1()));
                 othercoverage2deductible.setText(Double.toString(form.getOtherCoverageDeductible2()));
                 locationaddress.setText(form.getAddress());
                 locationage.setText(Integer.toString(form.getAge()));
                 totsqfootage.setText(Double.toString(form.getTotalSqFootage()));
                 insidesqfootage.setText(Double.toString(form.getInsdSqFootage()));
                 noofstories.setText(Integer.toString(form.getNoOfStories()));*/
                screenPage.setScreen("NextScreen");
                
                switch (form.getType()) {
                    case "Auto":
                        submitActionAuto();
                        break;
                    case "Both":
                        submitActionBoth();
                        break;
                    case "Commercial":
                        submitActionCommercial();
                        break;
                }
            }
        });
    }
    
    @FXML
    public void submitFormAction() {
            System.out.println("InsideSubmitFormAction");
            Task task;
            task = new Task<Void>() {
                @Override
                public Void call() throws Exception {
                    System.out.println("Call");
                    try {
                        System.out.println("edit " + isEdit);
                        if (isEdit) {
                            
                            System.out.println("View Application");
                            InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                            EditFormSubmissionRequest req1 = new EditFormSubmissionRequest();
                            
                            req1.setProducer(produceridfromform);
                            System.out.println(insurancetypeflag);
                            req1.setBranch(branchfromform);
                            
                            if (insurancetypeflag == 1) {
                                req1.setType("Commercial");
                            } else if (insurancetypeflag == 2) {
                                req1.setType("Auto");
                            } else if (insurancetypeflag == 3) {
                                req1.setType("Both");
                            }
                            //choicebox
                            System.out.println("Form Id of the " + getFormId());
                            req1.setFormId(getFormId());
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
                            req1.setOwner(binding4.getmotortruckcargoowner());
                            req1.setTruckMan(binding4.getmotortruckcargotruckman());
                            req1.setGrossEarningCheckbox(binding4.getgecheckbox());
                            req1.setWallsframe(binding4.getwallsframe());
                            req1.setWallshcb(binding4.getwallshcb());
                            req1.setWallssteel(binding4.getwallssteel());
                            req1.setWallsbrick(binding4.getwallsbrick());
                            req1.setRoofwood(binding4.getwoodjoist());
                            req1.setRoofsteel(binding4.getsteeldeck());
                            req1.setRoofconcrete(binding4.getroofconcrete());
                            req1.setFloorsconcrete(binding4.getfloorsconcrete());
                            req1.setFloorswood(binding4.getfloorswood());
                            req1.setHeatinggas(binding4.getfagas());
                            req1.setHeatingoil(binding4.getfaoil());
                            req1.setHeatingelectric(binding4.getheatingelectric());
                            req1.setHeatingother(binding4.getheatingother());
                            req1.setElectricalbreakers(binding4.getelectricalbreakers());
                            req1.setElectricalfuses(binding4.getelectricalfuses());
                            req1.setElectricalamps(binding4.getnoofamps());
                            req1.setPlumbingcopper(binding4.getcopper());
                            req1.setPlumbingpvc(binding4.getpvc());
                            req1.setPlumbingother(binding4.getplumbingother());
                            req1.setFireProtection(binding4.getFireProtection());
                            req1.setSecurity(binding4.getSecurity());
                            GregorianCalendar c = new GregorianCalendar();
                            c.setTime(Calendar.getInstance().getTime());
                            req1.setCreationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
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
                            
                            if (!CommonValidations.isStringEmpty(binding2.getNoofStaff())) {
                                req1.setNoOfStaff(Integer.parseInt(binding2.getNoofStaff()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getpayroll())) {
                                req1.setPayRoll(Double.parseDouble(binding2.getpayroll()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getamount1())) {
                                req1.setAmount1(Double.parseDouble(binding2.getamount1()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getamount2())) {
                                req1.setAmount2(Double.parseDouble(binding2.getamount2()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getamount3())) {
                                req1.setAmount3(Double.parseDouble(binding2.getamount3()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getamount4())) {
                                req1.setAmount4(Double.parseDouble(binding2.getamount4()));
                            }
                            req1.setDescriptionOfOperationsAndRevenue1(binding2.getdescriptionOfOpAndRev1());
                            req1.setDescriptionOfOperationsAndRevenue2(binding2.getdescriptionOfOpAndRev2());
                            req1.setDescriptionOfOperationsAndRevenue3(binding2.getdescriptionOfOpAndRev3());
                            req1.setDescriptionOfOperationsAndRevenue4(binding2.getdescriptionOfOpAndRev4());
                            if (!CommonValidations.isStringEmpty(binding2.gettotalSale())) {
                                req1.setTotalSale(Double.parseDouble(binding2.gettotalSale()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfUsSales())) {
                                req1.setTotalSale(Double.parseDouble(binding2.getperOfUsSales()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfOnPremises())) {
                                req1.setTotalSale(Double.parseDouble(binding2.getperOfOnPremises()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding2.getperOfOffPremises())) {
                                req1.setOffpremises(Integer.parseInt(binding2.getperOfOffPremises()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfResidential())) {
                                req1.setResidential(Integer.parseInt(binding2.getperOfResidential()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfCommercial())) {
                                req1.setCommercial(Integer.parseInt(binding2.getperOfCommercial()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfSubContracted())) {
                                req1.setSubcontracted(Integer.parseInt(binding2.getperOfSubContracted()));
                            }
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
                            
                            GregorianCalendar c1 = new GregorianCalendar();
                            c1.setTime(datePicker.getSelectedDate());
                            XMLGregorianCalendar date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c1);
                            req1.setPastClaimDate1(date1);
                            
                            GregorianCalendar c2 = new GregorianCalendar();
                            c2.setTime(datePicker1.getSelectedDate());
                            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c2);
                            req1.setPastClaimDate2(date2);
                            
                            GregorianCalendar c3 = new GregorianCalendar();
                            c3.setTime(datePicker2.getSelectedDate());
                            XMLGregorianCalendar date3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c3);
                            req1.setPastClaimDate3(date3);
                            
                            req1.setPastClaimCause1(binding3.getclaimcause1());
                            req1.setPastClaimCause2(binding3.getclaimcause2());
                            req1.setPastClaimCause3(binding3.getclaimcause3());
                            
                            if (!CommonValidations.isStringEmpty(binding3.getclaimamount1())) {
                                req1.setPastClaimAmount1(Double.parseDouble(binding3.getclaimamount1()));
                            }
                            if (!CommonValidations.isStringEmpty(binding3.getclaimamount2())) {
                                req1.setPastClaimAmount2(Double.parseDouble(binding3.getclaimamount2()));
                            }
                            if (!CommonValidations.isStringEmpty(binding3.getclaimamount3())) {
                                req1.setPastClaimAmount3(Double.parseDouble(binding3.getclaimamount3()));
                            }
                            
                            req1.setCurrentInsuranceType1(binding3.getciptype1());
                            req1.setCurrentInsuranceType2(binding3.getciptype2());
                            req1.setCurrentInsuranceType3(binding3.getciptype3());
                            req1.setCurrentInsuranceCarrier1(binding3.getcipcarrier1());
                            req1.setCurrentInsuranceCarrier2(binding3.getcipcarrier2());
                            req1.setCurrentInsuranceCarrier3(binding3.getcipcarrier3());
                            
                            GregorianCalendar c4 = new GregorianCalendar();
                            c4.setTime(datePicker3.getSelectedDate());
                            XMLGregorianCalendar date4 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c4);
                            req1.setCurrentInsuranceExpiry1(date4);
                            
                            GregorianCalendar c5 = new GregorianCalendar();
                            c5.setTime(datePicker4.getSelectedDate());
                            XMLGregorianCalendar date5 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c5);
                            req1.setCurrentInsuranceExpiry2(date5);
                            
                            GregorianCalendar c6 = new GregorianCalendar();
                            c6.setTime(datePicker5.getSelectedDate());
                            XMLGregorianCalendar date6 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c6);
                            req1.setCurrentInsuranceExpiry3(date6);
                            
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
                            
                            if (!CommonValidations.isStringEmpty(binding4.getbuildinglimit())) {
                                req1.setBuildingLimit(Double.parseDouble(binding4.getbuildinglimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getbuildingdeductible())) {
                                req1.setBuildingLimit(Double.parseDouble(binding4.getbuildingdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getcontentslimit())) {
                                req1.setContentsLimit(Double.parseDouble(binding4.getcontentslimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getcontentsdeductible())) {
                                req1.setContentsDeductible(Double.parseDouble(binding4.getcontentsdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getstocklimit())) {
                                req1.setStockLimit(Double.parseDouble(binding4.getstocklimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getstockdeductible())) {
                                req1.setStockDeductible(Double.parseDouble(binding4.getstockdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getofficelimit())) {
                                req1.setOfficeContentLimit(Double.parseDouble(binding4.getofficelimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getofficedeductible())) {
                                req1.setOfficeContentDeductible(Double.parseDouble(binding4.getofficedeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getedplimit())) {
                                req1.setEdpLimit(Double.parseDouble(binding4.getedplimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getedpdeductible())) {
                                req1.setEdpDeductible(Double.parseDouble(binding4.getedpdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getequipmentlimit())) {
                                req1.setEquipmentLimit(Double.parseDouble(binding4.getequipmentlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getequipmentdeductible())) {
                                req1.setEquipmentDeductible(Double.parseDouble(binding4.getequipmentdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                                req1.setOffPremisesLimit(Double.parseDouble(binding4.getoffpremiseslimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                                req1.setOffPremisesDeductible(Double.parseDouble(binding4.getoffpremisesdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.gettransitlimit())) {
                                req1.setTransitLimit(Double.parseDouble(binding4.gettransitlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.gettransitdeductible())) {
                                req1.setTransitDeductible(Double.parseDouble(binding4.gettransitdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmiscpropertylimit())) {
                                req1.setMiscPropertyLimit(Double.parseDouble(binding4.getmiscpropertylimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmiscpropertydeductible())) {
                                req1.setMiscPropertyDeductible(Double.parseDouble(binding4.getmiscpropertydeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentlimit())) {
                                req1.setContractorEquipmentLimit(Double.parseDouble(binding4.getcontractorsequipmentlimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentdeductible())) {
                                req1.setContractorEquipmentDeductible(Double.parseDouble(binding4.getcontractorsequipmentdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatorlimit())) {
                                req1.setInstallationFloaterLimit(Double.parseDouble(binding4.getinstallationfloatorlimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatordeductible())) {
                                req1.setInstallationFloaterDeductible(Double.parseDouble(binding4.getinstallationfloatordeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.gettoolfloatorlimit())) {
                                req1.setToolFloaterLimit(Double.parseDouble(binding4.gettoolfloatorlimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.gettoolfloatordeductible())) {
                                req1.setToolFloaterDeductible(Double.parseDouble(binding4.gettoolfloatordeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getsignfloatorlimit())) {
                                req1.setSignFloaterLimit(Double.parseDouble(binding4.getsignfloatorlimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getsignfloatordeductible())) {
                                req1.setSignFloaterDeductible(Double.parseDouble(binding4.getsignfloatordeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargolimit())) {
                                req1.setMotorTruckLimit(Double.parseDouble(binding4.getmotortruckcargolimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargodeductible())) {
                                req1.setMotorTruckDeductible(Double.parseDouble(binding4.getmotortruckcargodeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getglasslimit())) {
                                req1.setGlassLimit(Double.parseDouble(binding4.getglasslimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getglassdeductible())) {
                                req1.setGlassDeductible(Double.parseDouble(binding4.getglassdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsewerblackupdeductible())) {
                                req1.setSewerBackupDeductible(Double.parseDouble(binding4.getsewerblackupdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getflooddeductible())) {
                                req1.setFloodDeductible(Double.parseDouble(binding4.getflooddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getearthquakedeductible())) {
                                req1.setEarthquakeDeductible(Double.parseDouble(binding4.getearthquakedeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getprofitslimit())) {
                                req1.setProfitLimit(Double.parseDouble(binding4.getprofitslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getprofitsdeductible())) {
                                req1.setProfitDeductible(Double.parseDouble(binding4.getprofitsdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getgrossearningslimit())) {
                                req1.setGrossEarningLimit(Double.parseDouble(binding4.getgrossearningslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getgrossearningsdeductible())) {
                                req1.setGrossEarningDeductible(Double.parseDouble(binding4.getgrossearningsdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getrentalincomelimit())) {
                                req1.setRentalIncomeLimit(Double.parseDouble(binding4.getrentalincomelimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getrentalincomedeductible())) {
                                req1.setRentalIncomeDeductible(Double.parseDouble(binding4.getrentalincomedeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getextraexpenselimit())) {
                                req1.setExtraExpenseLimit(Double.parseDouble(binding4.getextraexpenselimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getextraexpensedeductible())) {
                                req1.setExtraExpenseDeductible(Double.parseDouble(binding4.getextraexpensedeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                                req1.setOffPremisesPowerLimit(Double.parseDouble(binding4.getoffpremiseslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                                req1.setOffPremisesPowerDeductible(Double.parseDouble(binding4.getoffpremisesdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidelimit())) {
                                req1.setInsideOutsideLimit(Double.parseDouble(binding4.getinsideoutsidelimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidedeductible())) {
                                req1.setInsideOutsideDeductible(Double.parseDouble(binding4.getinsideoutsidedeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getbfmoneylimit())) {
                                req1.setBfMoneyLimit(Double.parseDouble(binding4.getbfmoneylimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getbfmoneydeductible())) {
                                req1.setBfMoneyDeductible(Double.parseDouble(binding4.getbfmoneydeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getforgerylimit())) {
                                req1.setDeopistorForgeryLimit(Double.parseDouble(binding4.getforgerylimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getforgerydeductible())) {
                                req1.setDeopistorForgeryDeductible(Double.parseDouble(binding4.getforgerydeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmoneyorderslimit())) {
                                req1.setMoneyOrdersLimit(Double.parseDouble(binding4.getmoneyorderslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmoneyordersdeductible())) {
                                req1.setMoneyOrdersDeductible(Double.parseDouble(binding4.getmoneyordersdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getdishonestylimit())) {
                                req1.setEmployDishonestyLimit(Double.parseDouble(binding4.getdishonestylimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getdishonestydeductible())) {
                                req1.setEmployDishonestyDeductible(Double.parseDouble(binding4.getdishonestydeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getcgllimit())) {
                                req1.setCglLimit(Double.parseDouble(binding4.getcgllimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getcgldeductible())) {
                                req1.setCglDeductible(Double.parseDouble(binding4.getcgldeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.gettenantslimit())) {
                                req1.setTenantsLegalLimit(Double.parseDouble(binding4.gettenantslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.gettenantsdeductible())) {
                                req1.setTenantsLegalDeductible(Double.parseDouble(binding4.gettenantsdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getnonownedlimit())) {
                                req1.setNonOwnedAutoLimit(Double.parseDouble(binding4.getnonownedlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getnonowneddeductible())) {
                                req1.setNonOwnedAutoDeductible(Double.parseDouble(binding4.getnonowneddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsef96limit())) {
                                req1.setSef96Limit(Double.parseDouble(binding4.getsef96limit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                                req1.setSef96Deductible(Double.parseDouble(binding4.getsef96deductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsef94limit())) {
                                req1.setSef94Limit(Double.parseDouble(binding4.getsef94limit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                                req1.setSef94Deductible(Double.parseDouble(binding4.getsef94deductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getdandlimit())) {
                                req1.setDoLimit(Double.parseDouble(binding4.getdandlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getdanddeductible())) {
                                req1.setDoDeductible(Double.parseDouble(binding4.getdanddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.geteandlimit())) {
                                req1.setEoLimit(Double.parseDouble(binding4.geteandlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.geteanddeductible())) {
                                req1.setEoDeductible(Double.parseDouble(binding4.geteanddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getemployerslimit())) {
                                req1.setEmployerLimit(Double.parseDouble(binding4.getemployerslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getemployersdeductible())) {
                                req1.setEmployerDeductible(Double.parseDouble(binding4.getemployersdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getumbrellalimit())) {
                                req1.setUmbrellaLimit(Double.parseDouble(binding4.getumbrellalimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getumbrelladeductible())) {
                                req1.setUmbrellaDeductible(Double.parseDouble(binding4.getumbrelladeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getwrapuplimit())) {
                                req1.setWrapUpLimit(Double.parseDouble(binding4.getwrapuplimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getwrapupdeductible())) {
                                req1.setWrapUpDeductible(Double.parseDouble(binding4.getwrapupdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getstdlimit())) {
                                req1.setStdComprehensiveLimit(Double.parseDouble(binding4.getstdlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getstddeductible())) {
                                req1.setStdComprehensiveDeductible(Double.parseDouble(binding4.getstddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getaclimit())) {
                                req1.setAirConditioningLimit(Double.parseDouble(binding4.getaclimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getacdeductible())) {
                                req1.setAirConditioningDeductible(Double.parseDouble(binding4.getacdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerylimit())) {
                                req1.setProductionMachineryLimit(Double.parseDouble(binding4.getproductionmachinerylimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerydeductible())) {
                                req1.setProductionMachineryDeductible(Double.parseDouble(binding4.getproductionmachinerydeductible()));
                            }

                            //req1.setOtherCoverageLimit(Double.parseDouble(binding4.getothercoverage1()));
                            //req1.setOtherCoverage1(Double.parseDouble(binding4.getothercoverage1()));
                            //req1.setOtherCoverage2(Double.parseDouble(binding4.getothercoverage2()));
                            //req1.setOtherCoverageLimit(Double.parseDouble(binding4.getothercoverage1limit()));
                            // req1.setOtherCoverageDeductible(Double.parseDouble(binding4.getothercoverage1deductible()));*/
                            req1.setAdditionalcoverage(binding4.getadditionalcoverage());
                            req1.setRoofupdated(binding4.getroofupdated());
                            req1.setHeatingupdated(binding4.getheatingupdated());
                            req1.setElectricalupdated(binding4.getelectricalupdated());
                            req1.setFireProtectiondistance(binding4.getdistance());
                            req1.setAddress(binding4.getlocationaddress());
                            
                            if (!CommonValidations.isStringEmpty(binding4.getlocationage())) {
                                req1.setAge(Integer.parseInt(binding4.getlocationage()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.gettotsqfootage())) {
                                req1.setTotalSqFootage(Double.parseDouble(binding4.gettotsqfootage()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getinsidesqfootage())) {
                                req1.setInsdSqFootage(Double.parseDouble(binding4.getinsidesqfootage()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getnoofstories())) {
                                req1.setNoOfStories(Integer.parseInt(binding4.getnoofstories()));
                            }
                            req1.setCurrentInsurer(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautocurrentinsurer());
                            
                            if (!CommonValidations.isStringEmpty(binding4.getautopremiumtarget())) {
                                req1.setPremiumTarget(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautopremiumtarget()));
                            }
                            req1.setLienHolders1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder1());
                            req1.setLienHolders2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder2());
                            req1.setLienHolders3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder3());
                            req1.setLienHoldersVehicle1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle1());
                            req1.setLienHoldersVehicle2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle2());
                            req1.setLienHoldersVehicle3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle3());
                            
                            
                            req1.setClaimDate1((getDate12()));
                            req1.setClaimDate2((getDate13()));
                            req1.setClaimDate3((getDate14()));
                            req1.setClaimDate4((getDate15()));
                            req1.setClaimDate5((getDate16()));
                            req1.setClaimDate6((getDate17()));
                            req1.setClaimDesc1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim1());
                            req1.setClaimDesc2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim2());
                            req1.setClaimDesc3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim3());
                            req1.setClaimDesc4(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim4());
                            req1.setClaimDesc5(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim5());
                            req1.setClaimDesc6(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim6());
                            req1.setCommoditiesTransportedBy(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getcommoditiestransported());
                            req1.setFilingState1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate1());
                            req1.setFilingState2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate2());
                            req1.setFilingState3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate3());
                            
                            req1.setFilingUSDot1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot1());
                            req1.setFilingUSDot2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot2());
                            req1.setFilingUSDot3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot3());
                            
                            req1.setDilingDocket1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket1());
                            req1.setDilingDocket2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket2());
                            req1.setDilingDocket3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket3());
                            
                            req1.setFilingType1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling1());
                            req1.setFilingType2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling2());
                            req1.setFilingType3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling3());
                            
                            req1.setFilingName1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired1());
                            req1.setFilingName2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired2());
                            req1.setFilingName3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired3());

                            //req1.setVehicleNonOwned(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedliability());
                            //req1.setContract((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedcontract);
                            req1.setTypeOfNonOwned(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeofnonowned());
                            
                            if (!CommonValidations.isStringEmpty(binding4.getanytime())) {
                                req1.setAvgNoOfVehicles(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getanytime()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getavgvalue())) {
                                req1.setAvgValue(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getavgvalue()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmaxannually())) {
                                req1.setMaxVehicleValue(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getmaxannually()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmostexpensive())) {
                                req1.setMaxCostValue(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getmostexpensive()));
                            }
                            req1.setInstructionNotes(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautosubmissioncomments());
                            req1.setHaulingForOthers(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gethauling());
                            req1.setVehicleNonOwned(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedliability());
                            req1.setContract(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedcontract());
                            req1.setLoggedInUserEmailAddress(getReceivedemailaddress());
                            System.out.println(getReceivedemailaddress());
                            
                            int i = 0;
                            if (fileList != null) {
                                for (File file : fileList) {
                                    if (file != null) {
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
                                }
                            }
                            System.out.println("123");
                            StringTemplateGroup emailTemplateGroup = new StringTemplateGroup(
                                    "welcomeloginemail group", new File("bin").getAbsolutePath());
                            StringTemplate submitFormMail = emailTemplateGroup
                                    .getInstanceOf("pdfTemplate");
                            submitFormMail.setAttribute("date", new SimpleDateFormat("yyyy/mm/dd").format(Calendar.getInstance().getTime()));
                            String message = submitFormMail.toString();
                            BufferedWriter b = null;
                            try {
                                b = new BufferedWriter(new FileWriter(new File("pdf.html")));
                                b.append(message);
                                
                            } catch (Exception e) {
                                e.printStackTrace();
                            } finally {
                                if (b != null) {
                                    b.close();
                                }
                            }
                            
                            HTMLToPDF.convertHtmlToPdf(new File("pdf.html").getAbsolutePath());
                            CommonResponseAttributes response = port.getInsuranceOperationsPort().editFormSubmission(req1);
                            if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                                successMessage("Form has been updated");
                                
                            } else {
                                errors(response.getErrorMessage());
                            }
                        } else {
                            InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                            InsuranceFormSubmitRequest req1 = new InsuranceFormSubmitRequest();
                            req1.setProducer(producerid);
                            req1.setBranch(branch);
                            if (insurancetypeflag == 1) {
                                req1.setType("Commercial");
                            } else if (insurancetypeflag == 2) {
                                req1.setType("Auto");
                            } else if (insurancetypeflag == 3) {
                                req1.setType("Both");
                            }
                            //choicebox
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
                            req1.setOwner(binding4.getmotortruckcargoowner());
                            req1.setTruckMan(binding4.getmotortruckcargotruckman());
                            req1.setGrossEarningCheckBox(binding4.getgecheckbox());
                            req1.setWallsframe(binding4.getwallsframe());
                            req1.setWallshcb(binding4.getwallshcb());
                            req1.setWallssteel(binding4.getwallssteel());
                            req1.setWallsbrick(binding4.getwallsbrick());
                            req1.setRoofwood(binding4.getwoodjoist());
                            req1.setRoofsteel(binding4.getsteeldeck());
                            req1.setRoofconcrete(binding4.getroofconcrete());
                            req1.setFloorsconcrete(binding4.getfloorsconcrete());
                            req1.setFloorswood(binding4.getfloorswood());
                            req1.setHeatinggas(binding4.getfagas());
                            req1.setHeatingoil(binding4.getfaoil());
                            req1.setHeatingelectric(binding4.getheatingelectric());
                            req1.setHeatingother(binding4.getheatingother());
                            req1.setElectricalbreakers(binding4.getelectricalbreakers());
                            req1.setElectricalfuses(binding4.getelectricalfuses());
                            req1.setElectricalamps(binding4.getnoofamps());
                            req1.setPlumbingcopper(binding4.getcopper());
                            req1.setPlumbingpvc(binding4.getpvc());
                            req1.setPlumbingother(binding4.getplumbingother());
                            req1.setFireProtection(binding4.getFireProtection());
                            req1.setSecurity(binding4.getSecurity());
                            GregorianCalendar c = new GregorianCalendar();
                            c.setTime(Calendar.getInstance().getTime());
                            req1.setCreationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
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
                            
                            if (!CommonValidations.isStringEmpty(binding2.getNoofStaff())) {
                                req1.setNoOfStaff(Integer.parseInt(binding2.getNoofStaff()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getpayroll())) {
                                req1.setPayRoll(Double.parseDouble(binding2.getpayroll()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getamount1())) {
                                req1.setAmount1(Double.parseDouble(binding2.getamount1()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getamount2())) {
                                req1.setAmount2(Double.parseDouble(binding2.getamount2()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getamount3())) {
                                req1.setAmount3(Double.parseDouble(binding2.getamount3()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getamount4())) {
                                req1.setAmount4(Double.parseDouble(binding2.getamount4()));
                            }
                            req1.setDescriptionOfOperationsAndRevenue1(binding2.getdescriptionOfOpAndRev1());
                            req1.setDescriptionOfOperationsAndRevenue2(binding2.getdescriptionOfOpAndRev2());
                            req1.setDescriptionOfOperationsAndRevenue3(binding2.getdescriptionOfOpAndRev3());
                            req1.setDescriptionOfOperationsAndRevenue4(binding2.getdescriptionOfOpAndRev4());
                            if (!CommonValidations.isStringEmpty(binding2.gettotalSale())) {
                                req1.setTotalSale(Double.parseDouble(binding2.gettotalSale()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfUsSales())) {
                                req1.setTotalSale(Double.parseDouble(binding2.getperOfUsSales()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfOnPremises())) {
                                req1.setTotalSale(Double.parseDouble(binding2.getperOfOnPremises()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding2.getperOfOffPremises())) {
                                req1.setOffpremises(Integer.parseInt(binding2.getperOfOffPremises()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfResidential())) {
                                req1.setResidential(Integer.parseInt(binding2.getperOfResidential()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfCommercial())) {
                                req1.setCommercial(Integer.parseInt(binding2.getperOfCommercial()));
                            }
                            if (!CommonValidations.isStringEmpty(binding2.getperOfSubContracted())) {
                                req1.setSubcontracted(Integer.parseInt(binding2.getperOfSubContracted()));
                            }
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
                            
                            if (!CommonValidations.isStringEmpty(binding3.getclaimamount1())) {
                                req1.setPastClaimAmount1(Double.parseDouble(binding3.getclaimamount1()));
                            }
                            if (!CommonValidations.isStringEmpty(binding3.getclaimamount2())) {
                                req1.setPastClaimAmount2(Double.parseDouble(binding3.getclaimamount2()));
                            }
                            if (!CommonValidations.isStringEmpty(binding3.getclaimamount3())) {
                                req1.setPastClaimAmount3(Double.parseDouble(binding3.getclaimamount3()));
                            }
                            req1.setCurrentInsuranceType1(binding3.getciptype1());
                            req1.setCurrentInsuranceType2(binding3.getciptype2());
                            req1.setCurrentInsuranceType3(binding3.getciptype3());
                            req1.setCurrentInsuranceCarrier1(binding3.getcipcarrier1());
                            req1.setCurrentInsuranceCarrier2(binding3.getcipcarrier2());
                            req1.setCurrentInsuranceCarrier3(binding3.getcipcarrier3());
                            
                            req1.setPastClaimCause1(binding3.getclaimcause1());
                            req1.setPastClaimCause2(binding3.getclaimcause2());
                            req1.setPastClaimCause3(binding3.getclaimcause3());
                            
                            GregorianCalendar c1 = new GregorianCalendar();
                            c1.setTime(datePicker.getSelectedDate());
                            XMLGregorianCalendar date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c1);
                            req1.setPastClaimDate1(date1);
                            
                            GregorianCalendar c2 = new GregorianCalendar();
                            c2.setTime(datePicker1.getSelectedDate());
                            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c2);
                            req1.setPastClaimDate2(date2);
                            
                            GregorianCalendar c3 = new GregorianCalendar();
                            c3.setTime(datePicker2.getSelectedDate());
                            XMLGregorianCalendar date3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c3);
                            req1.setPastClaimDate3(date3);
                            
                            GregorianCalendar c4 = new GregorianCalendar();
                            c4.setTime(datePicker3.getSelectedDate());
                            XMLGregorianCalendar date4 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c4);
                            req1.setCurrentInsuranceExpiry1(date4);
                            
                            GregorianCalendar c5 = new GregorianCalendar();
                            c5.setTime(datePicker4.getSelectedDate());
                            XMLGregorianCalendar date5 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c5);
                            req1.setCurrentInsuranceExpiry2(date5);
                            
                            GregorianCalendar c6 = new GregorianCalendar();
                            c6.setTime(datePicker5.getSelectedDate());
                            XMLGregorianCalendar date6 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c6);
                            req1.setCurrentInsuranceExpiry3(date6);
                            
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
                            
                            if (!CommonValidations.isStringEmpty(binding4.getbuildinglimit())) {
                                req1.setBuildingLimit(Double.parseDouble(binding4.getbuildinglimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getbuildingdeductible())) {
                                req1.setBuildingLimit(Double.parseDouble(binding4.getbuildingdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getcontentslimit())) {
                                req1.setContentsLimit(Double.parseDouble(binding4.getcontentslimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getcontentsdeductible())) {
                                req1.setContentsDeductible(Double.parseDouble(binding4.getcontentsdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getstocklimit())) {
                                req1.setStockLimit(Double.parseDouble(binding4.getstocklimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getstockdeductible())) {
                                req1.setStockDeductible(Double.parseDouble(binding4.getstockdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getofficelimit())) {
                                req1.setOfficeContentLimit(Double.parseDouble(binding4.getofficelimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getofficedeductible())) {
                                req1.setOfficeContentDeductible(Double.parseDouble(binding4.getofficedeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getedplimit())) {
                                req1.setEdpLimit(Double.parseDouble(binding4.getedplimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getedpdeductible())) {
                                req1.setEdpDeductible(Double.parseDouble(binding4.getedpdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getequipmentlimit())) {
                                req1.setEquipmentLimit(Double.parseDouble(binding4.getequipmentlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getequipmentdeductible())) {
                                req1.setEquipmentDeductible(Double.parseDouble(binding4.getequipmentdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                                req1.setOffPremisesLimit(Double.parseDouble(binding4.getoffpremiseslimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                                req1.setOffPremisesDeductible(Double.parseDouble(binding4.getoffpremisesdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.gettransitlimit())) {
                                req1.setTransitLimit(Double.parseDouble(binding4.gettransitlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.gettransitdeductible())) {
                                req1.setTransitDeductible(Double.parseDouble(binding4.gettransitdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmiscpropertylimit())) {
                                req1.setMiscPropertyLimit(Double.parseDouble(binding4.getmiscpropertylimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmiscpropertydeductible())) {
                                req1.setMiscPropertyDeductible(Double.parseDouble(binding4.getmiscpropertydeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentlimit())) {
                                req1.setContractorEquipmentLimit(Double.parseDouble(binding4.getcontractorsequipmentlimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentdeductible())) {
                                req1.setContractorEquipmentDeductible(Double.parseDouble(binding4.getcontractorsequipmentdeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatorlimit())) {
                                req1.setInstallationFloaterLimit(Double.parseDouble(binding4.getinstallationfloatorlimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatordeductible())) {
                                req1.setInstallationFloaterDeductible(Double.parseDouble(binding4.getinstallationfloatordeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.gettoolfloatorlimit())) {
                                req1.setToolFloaterLimit(Double.parseDouble(binding4.gettoolfloatorlimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.gettoolfloatordeductible())) {
                                req1.setToolFloaterDeductible(Double.parseDouble(binding4.gettoolfloatordeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getsignfloatorlimit())) {
                                req1.setSignFloaterLimit(Double.parseDouble(binding4.getsignfloatorlimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getsignfloatordeductible())) {
                                req1.setSignFloaterDeductible(Double.parseDouble(binding4.getsignfloatordeductible()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargolimit())) {
                                req1.setMotorTruckLimit(Double.parseDouble(binding4.getmotortruckcargolimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargodeductible())) {
                                req1.setMotorTruckDeductible(Double.parseDouble(binding4.getmotortruckcargodeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getglasslimit())) {
                                req1.setGlassLimit(Double.parseDouble(binding4.getglasslimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getglassdeductible())) {
                                req1.setGlassDeductible(Double.parseDouble(binding4.getglassdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsewerblackupdeductible())) {
                                req1.setSewerBackupDeductible(Double.parseDouble(binding4.getsewerblackupdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getflooddeductible())) {
                                req1.setFloodDeductible(Double.parseDouble(binding4.getflooddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getearthquakedeductible())) {
                                req1.setEarthquakeDeductible(Double.parseDouble(binding4.getearthquakedeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getprofitslimit())) {
                                req1.setProfitLimit(Double.parseDouble(binding4.getprofitslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getprofitsdeductible())) {
                                req1.setProfitDeductible(Double.parseDouble(binding4.getprofitsdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getgrossearningslimit())) {
                                req1.setGrossEarningLimit(Double.parseDouble(binding4.getgrossearningslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getgrossearningsdeductible())) {
                                req1.setGrossEarningDeductible(Double.parseDouble(binding4.getgrossearningsdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getrentalincomelimit())) {
                                req1.setRentalIncomeLimit(Double.parseDouble(binding4.getrentalincomelimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getrentalincomedeductible())) {
                                req1.setRentalIncomeDeductible(Double.parseDouble(binding4.getrentalincomedeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getextraexpenselimit())) {
                                req1.setExtraExpenseLimit(Double.parseDouble(binding4.getextraexpenselimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getextraexpensedeductible())) {
                                req1.setExtraExpenseDeductible(Double.parseDouble(binding4.getextraexpensedeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                                req1.setOffPremisesPowerLimit(Double.parseDouble(binding4.getoffpremiseslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                                req1.setOffPremisesPowerDeductible(Double.parseDouble(binding4.getoffpremisesdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidelimit())) {
                                req1.setInsideOutsideLimit(Double.parseDouble(binding4.getinsideoutsidelimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidedeductible())) {
                                req1.setInsideOutsideDeductible(Double.parseDouble(binding4.getinsideoutsidedeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getbfmoneylimit())) {
                                req1.setBfMoneyLimit(Double.parseDouble(binding4.getbfmoneylimit()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getbfmoneydeductible())) {
                                req1.setBfMoneyDeductible(Double.parseDouble(binding4.getbfmoneydeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getforgerylimit())) {
                                req1.setDeopistorForgeryLimit(Double.parseDouble(binding4.getforgerylimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getforgerydeductible())) {
                                req1.setDeopistorForgeryDeductible(Double.parseDouble(binding4.getforgerydeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmoneyorderslimit())) {
                                req1.setMoneyOrdersLimit(Double.parseDouble(binding4.getmoneyorderslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmoneyordersdeductible())) {
                                req1.setMoneyOrdersDeductible(Double.parseDouble(binding4.getmoneyordersdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getdishonestylimit())) {
                                req1.setEmployDishonestyLimit(Double.parseDouble(binding4.getdishonestylimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getdishonestydeductible())) {
                                req1.setEmployDishonestyDeductible(Double.parseDouble(binding4.getdishonestydeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getcgllimit())) {
                                req1.setCglLimit(Double.parseDouble(binding4.getcgllimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getcgldeductible())) {
                                req1.setCglDeductible(Double.parseDouble(binding4.getcgldeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.gettenantslimit())) {
                                req1.setTenantsLegalLimit(Double.parseDouble(binding4.gettenantslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.gettenantsdeductible())) {
                                req1.setTenantsLegalDeductible(Double.parseDouble(binding4.gettenantsdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getnonownedlimit())) {
                                req1.setNonOwnedAutoLimit(Double.parseDouble(binding4.getnonownedlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getnonowneddeductible())) {
                                req1.setNonOwnedAutoDeductible(Double.parseDouble(binding4.getnonowneddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsef96limit())) {
                                req1.setSef96Limit(Double.parseDouble(binding4.getsef96limit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                                req1.setSef96Deductible(Double.parseDouble(binding4.getsef96deductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsef94limit())) {
                                req1.setSef94Limit(Double.parseDouble(binding4.getsef94limit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                                req1.setSef94Deductible(Double.parseDouble(binding4.getsef94deductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getdandlimit())) {
                                req1.setDoLimit(Double.parseDouble(binding4.getdandlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getdanddeductible())) {
                                req1.setDoDeductible(Double.parseDouble(binding4.getdanddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.geteandlimit())) {
                                req1.setEoLimit(Double.parseDouble(binding4.geteandlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.geteanddeductible())) {
                                req1.setEoDeductible(Double.parseDouble(binding4.geteanddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getemployerslimit())) {
                                req1.setEmployerLimit(Double.parseDouble(binding4.getemployerslimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getemployersdeductible())) {
                                req1.setEmployerDeductible(Double.parseDouble(binding4.getemployersdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getumbrellalimit())) {
                                req1.setUmbrellaLimit(Double.parseDouble(binding4.getumbrellalimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getumbrelladeductible())) {
                                req1.setUmbrellaDeductible(Double.parseDouble(binding4.getumbrelladeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getwrapuplimit())) {
                                req1.setWrapUpLimit(Double.parseDouble(binding4.getwrapuplimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getwrapupdeductible())) {
                                req1.setWrapUpDeductible(Double.parseDouble(binding4.getwrapupdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getstdlimit())) {
                                req1.setStdComprehensiveLimit(Double.parseDouble(binding4.getstdlimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getstddeductible())) {
                                req1.setStdComprehensiveDeductible(Double.parseDouble(binding4.getstddeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getaclimit())) {
                                req1.setAirConditioningLimit(Double.parseDouble(binding4.getaclimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getacdeductible())) {
                                req1.setAirConditioningDeductible(Double.parseDouble(binding4.getacdeductible()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerylimit())) {
                                req1.setProductionMachineryLimit(Double.parseDouble(binding4.getproductionmachinerylimit()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerydeductible())) {
                                req1.setProductionMachineryDeductible(Double.parseDouble(binding4.getproductionmachinerydeductible()));
                            }

                            //req1.setOtherCoverageLimit(Double.parseDouble(binding4.getothercoverage1()));
                            //req1.setOtherCoverage1(Double.parseDouble(binding4.getothercoverage1()));
                            //req1.setOtherCoverage2(Double.parseDouble(binding4.getothercoverage2()));
                            //req1.setOtherCoverageLimit(Double.parseDouble(binding4.getothercoverage1limit()));
                            // req1.setOtherCoverageDeductible(Double.parseDouble(binding4.getothercoverage1deductible()));*/
                            req1.setAdditionalcoverage(binding4.getadditionalcoverage());
                            req1.setRoofupdated(binding4.getroofupdated());
                            req1.setHeatingupdated(binding4.getheatingupdated());
                            req1.setElectricalupdated(binding4.getelectricalupdated());
                            req1.setFireProtectiondistance(binding4.getdistance());
                            req1.setAddress(binding4.getlocationaddress());
                            
                            if (!CommonValidations.isStringEmpty(binding4.getlocationage())) {
                                req1.setAge(Integer.parseInt(binding4.getlocationage()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.gettotsqfootage())) {
                                req1.setTotalSqFootage(Double.parseDouble(binding4.gettotsqfootage()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getinsidesqfootage())) {
                                req1.setInsdSqFootage(Double.parseDouble(binding4.getinsidesqfootage()));
                            }
                            if (!CommonValidations.isStringEmpty(binding4.getnoofstories())) {
                                req1.setNoOfStories(Integer.parseInt(binding4.getnoofstories()));
                            }
                            req1.setCurrentInsurer(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautocurrentinsurer());
                            req1.setCurrentExpDate((getDate11()));
                            //req1.setCurrentExpDate(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getautocurrentexpirydate()); 
                            if (!CommonValidations.isStringEmpty(binding4.getautopremiumtarget())) {
                                req1.setPremiumTarget(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautopremiumtarget()));
                            }
                            req1.setLienHolders1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder1());
                            req1.setLienHolders2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder2());
                            req1.setLienHolders3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getlessholder3());
                            req1.setLienHoldersVehicle1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle1());
                            req1.setLienHoldersVehicle2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle2());
                            req1.setLienHoldersVehicle3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautovehicle3());
                            req1.setClaimDate1((getDate12()));
                            req1.setClaimDate2((getDate13()));
                            req1.setClaimDate3((getDate14()));
                            req1.setClaimDate4((getDate15()));
                            req1.setClaimDate5((getDate16()));
                            req1.setClaimDate6((getDate17()));
                            req1.setClaimDesc1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim1());
                            req1.setClaimDesc2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim2());
                            req1.setClaimDesc3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim3());
                            req1.setClaimDesc4(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim4());
                            req1.setClaimDesc5(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim5());
                            req1.setClaimDesc6(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautodescriptionofclaim6());
                            req1.setCommoditiesTransportedBy(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getcommoditiestransported());
                            req1.setFilingState1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate1());
                            req1.setFilingState2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate2());
                            req1.setFilingState3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getliststate3());
                            
                            req1.setFilingUSDot1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot1());
                            req1.setFilingUSDot2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot2());
                            req1.setFilingUSDot3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getusdot3());
                            
                            req1.setDilingDocket1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket1());
                            req1.setDilingDocket2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket2());
                            req1.setDilingDocket3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getdocket3());
                            
                            req1.setFilingType1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling1());
                            req1.setFilingType2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling2());
                            req1.setFilingType3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeoffiling3());
                            
                            req1.setFilingName1(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired1());
                            req1.setFilingName2(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired2());
                            req1.setFilingName3(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnamerequired3());

                            //req1.setVehicleNonOwned(((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedliability());
                            //req1.setContract((AutoSubmissionController)screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedcontract);
                            req1.setTypeOfNonOwned(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gettypeofnonowned());
                            
                            if (!CommonValidations.isStringEmpty(binding4.getanytime())) {
                                req1.setAvgNoOfVehicles(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getanytime()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getavgvalue())) {
                                req1.setAvgValue(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getavgvalue()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmaxannually())) {
                                req1.setMaxVehicleValue(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getmaxannually()));
                            }
                            
                            if (!CommonValidations.isStringEmpty(binding4.getmostexpensive())) {
                                req1.setMaxCostValue(Double.parseDouble(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getmostexpensive()));
                            }
                            req1.setInstructionNotes(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getautosubmissioncomments());
                            req1.setHaulingForOthers(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.gethauling());
                            req1.setVehicleNonOwned(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedliability());
                            req1.setContract(((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.getnonownedcontract());
                            req1.setLoggedInUserEmailAddress(getReceivedemailaddress());
                            System.out.println(getReceivedemailaddress());
                            
                            int i = 0;
                            if (fileList != null) {
                                for (File file : fileList) {
                                    if (file != null) {
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
                                }
                            }
                            System.out.println("123");
                            StringTemplateGroup emailTemplateGroup = new StringTemplateGroup(
                                    "welcomeloginemail group", new File("bin").getAbsolutePath());
                            StringTemplate submitFormMail = emailTemplateGroup
                                    .getInstanceOf("pdfTemplate");
                            submitFormMail.setAttribute("date", new SimpleDateFormat("yyyy/mm/dd").format(Calendar.getInstance().getTime()));
                            String message = submitFormMail.toString();
                            BufferedWriter b = null;
                            try {
                                b = new BufferedWriter(new FileWriter(new File("pdf.html")));
                                b.append(message);
                                
                            } catch (Exception e) {
                                e.printStackTrace();
                            } finally {
                                if (b != null) {
                                    b.close();
                                }
                            }
                            
                            HTMLToPDF.convertHtmlToPdf(new File("pdf.html").getAbsolutePath());
                            System.out.println("12345");
                            InsuranceFormSubmitResponse response = port.getInsuranceOperationsPort().formSubmission(req1);
                            if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                                successMessage("Form has been submitted. Form id is:" + response.getFormId());
                                
                            } else {
                                errors(response.getErrorMessage());
                            }
                        }
                    } catch (Exception ex) {
                        
                        ex.printStackTrace();
                    }
                    return null;
                }
                
            };
            
            new Thread(task).start();
            
        
        
    }
    
    public void successMessage(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
                Dialogs.showInformationDialog(null, message, "Success", "Success");
                screenPage.setScreen("NextScreen");
                animatedMovement(0, 0);
                openingPane.setVisible(true);
                newBusinessPane.setVisible(false);
            }
        });
    }
        public void successMessage1(final String message) {
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
        System.out.println("Inside");
        FileChooser fileChooser = new FileChooser();

        //FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("name", "filter");
        //fileChooser.getExtensionFilters().add(extFilter);
        List<File> list
                = fileChooser.showOpenMultipleDialog(null);
        if (list != null) {
            System.out.println("Inside1");
            String files = "";
            for (File file : list) {
                System.out.println(file.getPath());
                files = files + file.getName() + ",";
            }
            this.fileList = list;
            uploadlabel.setText(files.substring(0, files.length() - 1));
            
        }
        
    }

    public XMLGregorianCalendar getDate12() {
        return date12;
    }

    public void setDate12(XMLGregorianCalendar date12) {
        this.date12 = date12;
    }

    public XMLGregorianCalendar getDate13() {
        return date13;
    }

    public void setDate13(XMLGregorianCalendar date13) {
        this.date13 = date13;
    }

    public XMLGregorianCalendar getDate14() {
        return date14;
    }

    public void setDate14(XMLGregorianCalendar date14) {
        this.date14 = date14;
    }

    public XMLGregorianCalendar getDate15() {
        return date15;
    }

    public void setDate15(XMLGregorianCalendar date15) {
        this.date15 = date15;
    }

    public XMLGregorianCalendar getDate16() {
        return date16;
    }

    public void setDate16(XMLGregorianCalendar date16) {
        this.date16 = date16;
    }

    public XMLGregorianCalendar getDate17() {
        return date17;
    }

    public void setDate17(XMLGregorianCalendar date17) {
        this.date17 = date17;
    }

    public XMLGregorianCalendar getDate11() {
        return date11;
    }

    public void setDate11(XMLGregorianCalendar date11) {
        this.date11 = date11;
    }
    
    
}
