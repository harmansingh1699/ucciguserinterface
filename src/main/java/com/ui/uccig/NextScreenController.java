/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import static antlr.build.ANTLR.root;
import com.calendar.DatePicker;
import com.rav.insurance.insuranceformoperations.webservice.InsuranceOperationsService_Service;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CommonResponseAttributes;
import com.rav.insurance.insuranceformoperations.webservice.contracts.EditFormSubmissionRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitResponse;
import com.sun.javafx.geom.AreaOp;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import com.ui.util.WriteByteArray;
import com.ui.animation.InvokeAnimation;
import com.ui.binding.FormEntry1Binding;
import com.ui.binding.FormEntry2Binding;
import com.ui.binding.FormEntry3Binding;
import com.ui.binding.FormEntry4Binding;
import com.ui.util.AddAnotherInfo;
import com.ui.util.CommonValidations;
import com.ui.util.HTMLToPDF;
import com.ui.util.LocalFormResponse;
import com.ui.util.SavingFile;
import com.ui.util.savinglocally;
import harrun.AlertDialog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
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
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.dozer.DozerBeanMapper;

import ravrun.Rav1;

/**
 * FXML Controller class
 *
 * @author harsimransingh
 */
public class NextScreenController implements Initializable, IScreenController {

    private Stage stage = new Stage();
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

    private XMLGregorianCalendar datefromform;
    private XMLGregorianCalendar date11;
    private XMLGregorianCalendar date12;
    private XMLGregorianCalendar date13;
    private XMLGregorianCalendar date14;
    private XMLGregorianCalendar date15;
    private XMLGregorianCalendar date16;
    private XMLGregorianCalendar date17;

    private String applicationid;
    private String fileName1;
    private byte[] file1;

    private String fileName2;
    private byte[] file2;

    private String fileName3;
    private byte[] file3;

    private String fileName4;
    private byte[] file4;

    private String fileName5;
    private byte[] file5;

    private String fileName6;
    private byte[] file6;

    private String fileName7;
    private byte[] file7;

    private String fileName8;
    private byte[] file8;

    private String fileName9;
    private byte[] file9;

    private String fileName10;
    private byte[] file10;

    @FXML
    private Button upload;
    @FXML
    private Button worklist;

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
    private TextField amps;
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
    private Label labelproducername;

    @FXML
    private Pane openingPane;
    @FXML
    private Pane fullScreenPane;
    @FXML
    private Pane client1;
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

    private static String os = null;
    private static int offset = 0;
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
        labelproducername.setText(receivedname);
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
        //worklist.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        os = System.getProperty("os.name");
        listAddInfo = new ArrayList();
        binding = new FormEntry1Binding();
        binding2 = new FormEntry2Binding();
        binding3 = new FormEntry3Binding();
        binding4 = new FormEntry4Binding();
        fullScreenPane.setVisible(true);
        openingPane.setVisible(true);
        newBusinessPane.setVisible(false);
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

        System.out.println(os);
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
        Bindings.bindBidirectional(amps.textProperty(), binding4.noofampsProperty());
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

        basement.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {

                binding4.setbasement(newSelection);

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
        aolownedy4.setToggleGroup(tg4);
        aolownedn4.setToggleGroup(tg4);
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
        datePicker.setPrefHeight(36.0);

        datePicker1.setLayoutX(0.0);
        datePicker1.setLayoutY(81.0);
        datePicker1.setPrefWidth(200.0);
        datePicker1.setPrefHeight(36.0);

        datePicker2.setLayoutX(0.0);
        datePicker2.setLayoutY(81.0);
        datePicker2.setPrefWidth(200.0);
        datePicker2.setPrefHeight(36.0);

        datePicker3.setLayoutX(0.0);
        datePicker3.setLayoutY(81.0);
        datePicker3.setPrefWidth(200.0);
        datePicker3.setPrefHeight(36.0);

        datePicker4.setLayoutX(0.0);
        datePicker4.setLayoutY(81.0);
        datePicker4.setPrefWidth(200.0);
        datePicker4.setPrefHeight(36.0);

        datePicker5.setLayoutX(0.0);
        datePicker5.setLayoutY(81.0);
        datePicker5.setPrefWidth(200.0);
        datePicker5.setPrefHeight(36.0);

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

        datePicker.setPromptText("yyyy-mm-dd");
        datePicker.setLocale(Locale.ENGLISH);
        datePicker.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker.getCalendarView().setShowWeeks(false);
        datePicker.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));

        datePicker.setPromptText("yyyy-mm-dd");
        datePicker1.setLocale(Locale.ENGLISH);
        datePicker1.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker1.getCalendarView().setShowWeeks(false);
        datePicker1.setDateFormat(new SimpleDateFormat("YYYY-MM-dd"));

        datePicker.setPromptText("yyyy-mm-dd");
        datePicker2.setLocale(Locale.ENGLISH);
        datePicker2.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker2.getCalendarView().setShowWeeks(false);
        datePicker2.setDateFormat(new SimpleDateFormat("YYYY-MM-dd"));

        datePicker.setPromptText("yyyy-mm-dd");
        datePicker3.setLocale(Locale.ENGLISH);
        datePicker3.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker3.getCalendarView().setShowWeeks(false);
        datePicker3.setDateFormat(new SimpleDateFormat("YYYY-MM-dd"));

        datePicker.setPromptText("yyyy-mm-dd");
        datePicker4.setLocale(Locale.ENGLISH);
        datePicker4.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker4.getCalendarView().setShowWeeks(false);
        datePicker4.setDateFormat(new SimpleDateFormat("YYYY-MM-dd"));

        datePicker.setPromptText("yyyy-mm-dd");
        datePicker5.setLocale(Locale.ENGLISH);
        datePicker5.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker5.getCalendarView().setShowWeeks(false);
        datePicker5.setDateFormat(new SimpleDateFormat("YYYY-MM-dd"));

        //fullScreenPane.getChildren().add(datePicker,138,495);
        gridpane1.add(datePicker, 5, 0);
        gridpane2.add(datePicker1, 5, 0);
        gridpane3.add(datePicker2, 5, 0);
        gridpane4.add(datePicker3, 5, 0);
        gridpane5.add(datePicker4, 5, 0);
        gridpane6.add(datePicker5, 5, 0);
    }

    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }

    @FXML
    public void submitWorkList() throws Exception {
        System.out.println("Inside worklist");
        System.out.println(producerid);
        ((EnterCodeUIController) screenPage.getControlledScreen("OtherScreen")).submitWorklist(producerid);

    }

    @FXML
    public void exit() {
        System.out.println("Exit Called");
        /* for (Node node : client1.getChildren()) {
         System.out.println("Id: " + node.getId());
         if (node instanceof TextField) {
         // clear
         ((TextField)node).setText("");
         }
         }*/
        try {
            if (producerid == null || producerid.trim().isEmpty()) {
                screenPage.setScreen("OtherScreen");
                animatedMovement(-1269, -1269);
            } else {
                screenPage.setScreen("NextScreen");
                animatedMovement(0, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void searchArchive() throws Exception {
        System.out.println("Inside SearchArchive");
        ((EnterCodeUIController) screenPage.getControlledScreen("OtherScreen")).searchArchive();
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
        if (isEdit) {
        } else {
            System.out.println(getReceivedname());
            returnedname.setText(getReceivedname());
            returnedbranch.setText(getBranch());
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            returneddate.setText(dateFormat.format(date));
        }
    }

    @FXML
    public void submitActionAuto() {
        insurancetypeflag = 2;
        animatedMovement(-1269, 0);
        if (isEdit) {
        } else {
            System.out.println(getReceivedname());
            returnedname.setText(getReceivedname());
            returnedbranch.setText(getBranch());
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            returneddate.setText(dateFormat.format(date));
        }

    }

    @FXML
    public void submitActionBoth() {
        insurancetypeflag = 3;
        animatedMovement(-1269, 0);
        if (isEdit) {
        } else {
            System.out.println(getReceivedname());
            returnedname.setText(getReceivedname());
            returnedbranch.setText(getBranch());
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            returneddate.setText(dateFormat.format(date));
        }

    }

    @FXML
    public void backnewbusiness() {
        newBusinessPane.setVisible(false);
        openingPane.setVisible(true);
    }

    @FXML
    public void continue1() {
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
        } else if (CommonValidations.isStringEmpty(binding.getSeverity()) || binding.getSeverity().equalsIgnoreCase("select")) {
            successMessage1("Select Severity level");
        } else {
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
            animatedMovement(0, 0);
        } else if (insurancetypeflag == 3) {
            animatedMovement(-7614, 0);
            CommercialSubmit.setVisible(false);
            autoinsurancebutton.setVisible(true);
        }

    }
    boolean contractorflag = true;

    @FXML
    public void openContractor() {

        System.out.println(os);
        System.out.println("OpenContractor");
        contractorflag = true;
        if (os.contains("Windows")) {
            new Rav1(new File("bin\\Contractors.doc").getAbsolutePath()).execute();
        } else if (os.contains("Mac")) {
            new Rav1(new File("bin/Contractors.doc").getAbsolutePath()).execute();
        }
    }

    @FXML
    public void addAdditionNext() {
        System.out.println("Next clicked");
        if (offset < 10 && offset >= 0) {
            try {
                System.out.println("Offset1 " + offset);
                if (listAddInfo.get(offset) != null) {
                    System.out.println("Offset2 " + offset);

                    listAddInfo.get(offset).setAddress1(binding4.getlocationaddress());

                    if (!CommonValidations.isStringEmpty(binding4.getbuildinglimit())) {
                        listAddInfo.get(offset).setBuildingLimit1(Double.parseDouble(binding4.getbuildinglimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getbuildingdeductible())) {
                        listAddInfo.get(offset).setBuildingDeductible1(Double.parseDouble(binding4.getbuildingdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontentslimit())) {
                        listAddInfo.get(offset).setContentsLimit1(Double.parseDouble(binding4.getcontentslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontentsdeductible())) {
                        listAddInfo.get(offset).setContentsDeductible1(Double.parseDouble(binding4.getcontentsdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getstocklimit())) {
                        listAddInfo.get(offset).setStockLimit1(Double.parseDouble(binding4.getstocklimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getstockdeductible())) {
                        listAddInfo.get(offset).setStockDeductible1(Double.parseDouble(binding4.getstockdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getofficelimit())) {
                        listAddInfo.get(offset).setOfficeContentLimit1(Double.parseDouble(binding4.getofficelimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getofficedeductible())) {
                        listAddInfo.get(offset).setOfficeContentDeductible1(Double.parseDouble(binding4.getofficedeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getedplimit())) {
                        listAddInfo.get(offset).setEdpLimit1(Double.parseDouble(binding4.getedplimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getedpdeductible())) {
                        listAddInfo.get(offset).setEdpDeductible1(Double.parseDouble(binding4.getedpdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getequipmentlimit())) {
                        listAddInfo.get(offset).setEquipmentLimit1(Double.parseDouble(binding4.getequipmentlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getequipmentdeductible())) {
                        listAddInfo.get(offset).setEquipmentDeductible1(Double.parseDouble(binding4.getequipmentdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                        listAddInfo.get(offset).setOffPremisesLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                        listAddInfo.get(offset).setOffPremisesDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettransitlimit())) {
                        listAddInfo.get(offset).setTransitLimit1(Double.parseDouble(binding4.gettransitlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettransitdeductible())) {
                        listAddInfo.get(offset).setTransitDeductible1(Double.parseDouble(binding4.gettransitdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmiscpropertylimit())) {
                        listAddInfo.get(offset).setMiscPropertyLimit1(Double.parseDouble(binding4.getmiscpropertylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmiscpropertydeductible())) {
                        listAddInfo.get(offset).setMiscPropertyDeductible1(Double.parseDouble(binding4.getmiscpropertydeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentlimit())) {
                        listAddInfo.get(offset).setContractorEquipmentLimit1(Double.parseDouble(binding4.getcontractorsequipmentlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentdeductible())) {
                        listAddInfo.get(offset).setContractorEquipmentDeductible1(Double.parseDouble(binding4.getcontractorsequipmentdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatorlimit())) {
                        listAddInfo.get(offset).setInstallationFloaterLimit1(Double.parseDouble(binding4.getinstallationfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatordeductible())) {
                        listAddInfo.get(offset).setInstallationFloaterDeductible1(Double.parseDouble(binding4.getinstallationfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettoolfloatorlimit())) {
                        listAddInfo.get(offset).setToolFloaterLimit1(Double.parseDouble(binding4.gettoolfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettoolfloatordeductible())) {
                        listAddInfo.get(offset).setToolFloaterDeductible1(Double.parseDouble(binding4.gettoolfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getsignfloatorlimit())) {
                        listAddInfo.get(offset).setSignFloaterLimit1(Double.parseDouble(binding4.getsignfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getsignfloatordeductible())) {
                        listAddInfo.get(offset).setSignFloaterDeductible1(Double.parseDouble(binding4.getsignfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargolimit())) {
                        listAddInfo.get(offset).setMotorTruckLimit1(Double.parseDouble(binding4.getmotortruckcargolimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargodeductible())) {
                        listAddInfo.get(offset).setMotorTruckDeductible1(Double.parseDouble(binding4.getmotortruckcargodeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getglasslimit())) {
                        listAddInfo.get(offset).setGlassLimit1(Double.parseDouble(binding4.getglasslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getglassdeductible())) {
                        listAddInfo.get(offset).setGlassDeductible1(Double.parseDouble(binding4.getglassdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsewerblackupdeductible())) {
                        listAddInfo.get(offset).setSewerBackupDeductible1(Double.parseDouble(binding4.getsewerblackupdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getflooddeductible())) {
                        listAddInfo.get(offset).setFloodDeductible1(Double.parseDouble(binding4.getflooddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getearthquakedeductible())) {
                        listAddInfo.get(offset).setEarthquakeDeductible1(Double.parseDouble(binding4.getearthquakedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getprofitslimit())) {
                        listAddInfo.get(offset).setProfitLimit1(Double.parseDouble(binding4.getprofitslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getprofitsdeductible())) {
                        listAddInfo.get(offset).setProfitDeductible1(Double.parseDouble(binding4.getprofitsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getgrossearningslimit())) {
                        listAddInfo.get(offset).setGrossEarningLimit1(Double.parseDouble(binding4.getgrossearningslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getgrossearningsdeductible())) {
                        listAddInfo.get(offset).setGrossEarningDeductible1(Double.parseDouble(binding4.getgrossearningsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getrentalincomelimit())) {
                        listAddInfo.get(offset).setRentalIncomeLimit1(Double.parseDouble(binding4.getrentalincomelimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getrentalincomedeductible())) {
                        listAddInfo.get(offset).setRentalIncomeDeductible1(Double.parseDouble(binding4.getrentalincomedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getextraexpenselimit())) {
                        listAddInfo.get(offset).setExtraExpenseLimit1(Double.parseDouble(binding4.getextraexpenselimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getextraexpensedeductible())) {
                        listAddInfo.get(offset).setExtraExpenseDeductible1(Double.parseDouble(binding4.getextraexpensedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                        listAddInfo.get(offset).setOffPremisesPowerLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                        listAddInfo.get(offset).setOffPremisesPowerDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidelimit())) {
                        listAddInfo.get(offset).setInsideOutsideLimit1(Double.parseDouble(binding4.getinsideoutsidelimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidedeductible())) {
                        listAddInfo.get(offset).setInsideOutsideDeductible1(Double.parseDouble(binding4.getinsideoutsidedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getbfmoneylimit())) {
                        listAddInfo.get(offset).setBfMoneyLimit1(Double.parseDouble(binding4.getbfmoneylimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getbfmoneydeductible())) {
                        listAddInfo.get(offset).setBfMoneyDeductible1(Double.parseDouble(binding4.getbfmoneydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getforgerylimit())) {
                        listAddInfo.get(offset).setDeopistorForgeryLimit1(Double.parseDouble(binding4.getforgerylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getforgerydeductible())) {
                        listAddInfo.get(offset).setDeopistorForgeryDeductible1(Double.parseDouble(binding4.getforgerydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmoneyorderslimit())) {
                        listAddInfo.get(offset).setMoneyOrdersLimit1(Double.parseDouble(binding4.getmoneyorderslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmoneyordersdeductible())) {
                        listAddInfo.get(offset).setMoneyOrdersDeductible1(Double.parseDouble(binding4.getmoneyordersdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdishonestylimit())) {
                        listAddInfo.get(offset).setEmployDishonestyLimit1(Double.parseDouble(binding4.getdishonestylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdishonestydeductible())) {
                        listAddInfo.get(offset).setEmployDishonestyDeductible1(Double.parseDouble(binding4.getdishonestydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getcgllimit())) {
                        listAddInfo.get(offset).setCglLimit1(Double.parseDouble(binding4.getcgllimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getcgldeductible())) {
                        listAddInfo.get(offset).setCglDeductible1(Double.parseDouble(binding4.getcgldeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettenantslimit())) {
                        listAddInfo.get(offset).setTenantsLegalLimit1(Double.parseDouble(binding4.gettenantslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettenantsdeductible())) {
                        listAddInfo.get(offset).setTenantsLegalDeductible1(Double.parseDouble(binding4.gettenantsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getnonownedlimit())) {
                        listAddInfo.get(offset).setNonOwnedAutoLimit1(Double.parseDouble(binding4.getnonownedlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getnonowneddeductible())) {
                        listAddInfo.get(offset).setNonOwnedAutoDeductible1(Double.parseDouble(binding4.getnonowneddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef96limit())) {
                        listAddInfo.get(offset).setSef96Limit1(Double.parseDouble(binding4.getsef96limit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                        listAddInfo.get(offset).setSef96Deductible1(Double.parseDouble(binding4.getsef96deductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94limit())) {
                        listAddInfo.get(offset).setSef94Limit1(Double.parseDouble(binding4.getsef94limit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                        listAddInfo.get(offset).setSef94Deductible1(Double.parseDouble(binding4.getsef94deductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdandlimit())) {
                        listAddInfo.get(offset).setDoLimit1(Double.parseDouble(binding4.getdandlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdanddeductible())) {
                        listAddInfo.get(offset).setDoDeductible1(Double.parseDouble(binding4.getdanddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.geteandlimit())) {
                        listAddInfo.get(offset).setEoLimit1(Double.parseDouble(binding4.geteandlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.geteanddeductible())) {
                        listAddInfo.get(offset).setEoDeductible1(Double.parseDouble(binding4.geteanddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getemployerslimit())) {
                        listAddInfo.get(offset).setEmployerLimit1(Double.parseDouble(binding4.getemployerslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getemployersdeductible())) {
                        listAddInfo.get(offset).setEmployerDeductible1(Double.parseDouble(binding4.getemployersdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getumbrellalimit())) {
                        listAddInfo.get(offset).setUmbrellaLimit1(Double.parseDouble(binding4.getumbrellalimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getumbrelladeductible())) {
                        listAddInfo.get(offset).setUmbrellaDeductible1(Double.parseDouble(binding4.getumbrelladeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getwrapuplimit())) {
                        listAddInfo.get(offset).setWrapUpLimit1(Double.parseDouble(binding4.getwrapuplimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getwrapupdeductible())) {
                        listAddInfo.get(offset).setWrapUpDeductible1(Double.parseDouble(binding4.getwrapupdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getstdlimit())) {
                        listAddInfo.get(offset).setStdComprehensiveLimit1(Double.parseDouble(binding4.getstdlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getstddeductible())) {
                        listAddInfo.get(offset).setStdComprehensiveDeductible1(Double.parseDouble(binding4.getstddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getaclimit())) {
                        listAddInfo.get(offset).setAirConditioningLimit1(Double.parseDouble(binding4.getaclimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getacdeductible())) {
                        listAddInfo.get(offset).setAirConditioningDeductible1(Double.parseDouble(binding4.getacdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerylimit())) {
                        listAddInfo.get(offset).setProductionMachineryLimit1(Double.parseDouble(binding4.getproductionmachinerylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerydeductible())) {
                        listAddInfo.get(offset).setProductionMachineryDeductible1(Double.parseDouble(binding4.getproductionmachinerydeductible()));
                    }

                    listAddInfo.get(offset).setOthercoverage11(binding4.getothercoverage1());
                    listAddInfo.get(offset).setOthercoverage21(binding4.getothercoverage2());

                    if (binding4.getothercoverage1limit() != null && !(binding4.getothercoverage1limit().trim().equals(""))) {
                        listAddInfo.get(offset).setOtherCoverageLimit11(Double.parseDouble(binding4.getothercoverage1limit()));
                    }
                    if (binding4.getothercoverage1deductible() != null && !(binding4.getothercoverage1deductible().trim().equals(""))) {
                        listAddInfo.get(offset).setOtherCoverageDeductible11(Double.parseDouble(binding4.getothercoverage1deductible()));
                    }
                    if (binding4.getothercoverage2limit() != null && !(binding4.getothercoverage2limit().trim().equals(""))) {
                        listAddInfo.get(offset).setOtherCoverageLimit21(Double.parseDouble(binding4.getothercoverage2limit()));
                    }
                    if (binding4.getothercoverage2deductible() != null && !(binding4.getothercoverage2deductible().trim().equals(""))) {
                        listAddInfo.get(offset).setOtherCoverageDeductible21(Double.parseDouble(binding4.getothercoverage2deductible()));
                    }
                    listAddInfo.get(offset).setAdditionalCoverage1(binding4.getadditionalcoverage());
                    listAddInfo.get(offset).setRoofupdated1(binding4.getroofupdated());
                    listAddInfo.get(offset).setHeatingupdated1(binding4.getheatingupdated());
                    listAddInfo.get(offset).setElectricalupdated1(binding4.getelectricalupdated());
                    listAddInfo.get(offset).setElectricalamps1(binding4.getnoofamps());
                    listAddInfo.get(offset).setFireProtectiondistance1(binding4.getdistance());
                    listAddInfo.get(offset).setAddress1(binding4.getlocationaddress());
                    listAddInfo.get(offset).setBasement1(binding4.getbasement());
                    listAddInfo.get(offset).setOwner11(binding4.getmotortruckcargoowner());
                    listAddInfo.get(offset).setTruckMan1(binding4.getmotortruckcargotruckman());
                    listAddInfo.get(offset).setGrossEarning801(binding4.getgecheckbox());
                    listAddInfo.get(offset).setWallsframe1(binding4.getwallsframe());
                    listAddInfo.get(offset).setWallshcb1(binding4.getwallshcb());
                    listAddInfo.get(offset).setWallssteel1(binding4.getwallssteel());
                    listAddInfo.get(offset).setWallsbrick1(binding4.getwallsbrick());
                    listAddInfo.get(offset).setRoofwood1(binding4.getwoodjoist());
                    listAddInfo.get(offset).setRoofsteel1(binding4.getsteeldeck());
                    listAddInfo.get(offset).setRoofconcrete1(binding4.getroofconcrete());
                    listAddInfo.get(offset).setFloorsconcrete1(binding4.getfloorsconcrete());
                    listAddInfo.get(offset).setFloorswood1(binding4.getfloorswood());
                    listAddInfo.get(offset).setHeatinggas1(binding4.getfagas());
                    listAddInfo.get(offset).setHeatingoil1(binding4.getfaoil());
                    listAddInfo.get(offset).setHeatingelectric1(binding4.getheatingelectric());
                    listAddInfo.get(offset).setHeatingother1(binding4.getheatingother());
                    listAddInfo.get(offset).setElectricalbreakers1(binding4.getelectricalbreakers());
                    listAddInfo.get(offset).setElectricalfuses1(binding4.getelectricalfuses());
                    listAddInfo.get(offset).setElectricalamps1(binding4.getnoofamps());
                    listAddInfo.get(offset).setPlumbingcopper1(binding4.getcopper());
                    listAddInfo.get(offset).setPlumbingpvc1(binding4.getpvc());
                    listAddInfo.get(offset).setPlumbingother1(binding4.getplumbingother());
                    listAddInfo.get(offset).setFireProtection1(binding4.getFireProtection());
                    listAddInfo.get(offset).setSecurity1(binding4.getSecurity());

                    if (!CommonValidations.isStringEmpty(binding4.getlocationage())) {
                        listAddInfo.get(offset).setAge1(Integer.parseInt(binding4.getlocationage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettotsqfootage())) {
                        listAddInfo.get(offset).setTotalSqFootage1(Double.parseDouble(binding4.gettotsqfootage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinsidesqfootage())) {
                        listAddInfo.get(offset).setInsdSqFootage1(Double.parseDouble(binding4.getinsidesqfootage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getnoofstories())) {
                        listAddInfo.get(offset).setNoOfStories1(Integer.parseInt(binding4.getnoofstories()));
                    }
                } else {
                    System.out.println("Offset3 " + offset);
                    AddAnotherInfo obj = new AddAnotherInfo();
                    obj.setAddress1(binding4.getlocationaddress());

                    System.out.println("3" + obj.getAddress1());
                    listAddInfo.set(offset, obj);
                }
            } catch (Exception e) {
                System.out.println("Offset4 " + offset);
                AddAnotherInfo obj = new AddAnotherInfo();
                obj.setAddress1(binding4.getlocationaddress());
                if (!CommonValidations.isStringEmpty(binding4.getbuildinglimit())) {
                    obj.setBuildingLimit1(Double.parseDouble(binding4.getbuildinglimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getbuildingdeductible())) {
                    obj.setBuildingDeductible1(Double.parseDouble(binding4.getbuildingdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getcontentslimit())) {
                    obj.setContentsLimit1(Double.parseDouble(binding4.getcontentslimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getcontentsdeductible())) {
                    obj.setContentsDeductible1(Double.parseDouble(binding4.getcontentsdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getstocklimit())) {
                    obj.setStockLimit1(Double.parseDouble(binding4.getstocklimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getstockdeductible())) {
                    obj.setStockDeductible1(Double.parseDouble(binding4.getstockdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getofficelimit())) {
                    obj.setOfficeContentLimit1(Double.parseDouble(binding4.getofficelimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getofficedeductible())) {
                    obj.setOfficeContentDeductible1(Double.parseDouble(binding4.getofficedeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getedplimit())) {
                    obj.setEdpLimit1(Double.parseDouble(binding4.getedplimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getedpdeductible())) {
                    obj.setEdpDeductible1(Double.parseDouble(binding4.getedpdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getequipmentlimit())) {
                    obj.setEquipmentLimit1(Double.parseDouble(binding4.getequipmentlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getequipmentdeductible())) {
                    obj.setEquipmentDeductible1(Double.parseDouble(binding4.getequipmentdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                    obj.setOffPremisesLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                    obj.setOffPremisesDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.gettransitlimit())) {
                    obj.setTransitLimit1(Double.parseDouble(binding4.gettransitlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.gettransitdeductible())) {
                    obj.setTransitDeductible1(Double.parseDouble(binding4.gettransitdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmiscpropertylimit())) {
                    obj.setMiscPropertyLimit1(Double.parseDouble(binding4.getmiscpropertylimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmiscpropertydeductible())) {
                    obj.setMiscPropertyDeductible1(Double.parseDouble(binding4.getmiscpropertydeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentlimit())) {
                    obj.setContractorEquipmentLimit1(Double.parseDouble(binding4.getcontractorsequipmentlimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentdeductible())) {
                    obj.setContractorEquipmentDeductible1(Double.parseDouble(binding4.getcontractorsequipmentdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatorlimit())) {
                    obj.setInstallationFloaterLimit1(Double.parseDouble(binding4.getinstallationfloatorlimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatordeductible())) {
                    obj.setInstallationFloaterDeductible1(Double.parseDouble(binding4.getinstallationfloatordeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.gettoolfloatorlimit())) {
                    obj.setToolFloaterLimit1(Double.parseDouble(binding4.gettoolfloatorlimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.gettoolfloatordeductible())) {
                    obj.setToolFloaterDeductible1(Double.parseDouble(binding4.gettoolfloatordeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getsignfloatorlimit())) {
                    obj.setSignFloaterLimit1(Double.parseDouble(binding4.getsignfloatorlimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getsignfloatordeductible())) {
                    obj.setSignFloaterDeductible1(Double.parseDouble(binding4.getsignfloatordeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargolimit())) {
                    obj.setMotorTruckLimit1(Double.parseDouble(binding4.getmotortruckcargolimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargodeductible())) {
                    obj.setMotorTruckDeductible1(Double.parseDouble(binding4.getmotortruckcargodeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getglasslimit())) {
                    obj.setGlassLimit1(Double.parseDouble(binding4.getglasslimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getglassdeductible())) {
                    obj.setGlassDeductible1(Double.parseDouble(binding4.getglassdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsewerblackupdeductible())) {
                    obj.setSewerBackupDeductible1(Double.parseDouble(binding4.getsewerblackupdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getflooddeductible())) {
                    obj.setFloodDeductible1(Double.parseDouble(binding4.getflooddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getearthquakedeductible())) {
                    obj.setEarthquakeDeductible1(Double.parseDouble(binding4.getearthquakedeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getprofitslimit())) {
                    obj.setProfitLimit1(Double.parseDouble(binding4.getprofitslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getprofitsdeductible())) {
                    obj.setProfitDeductible1(Double.parseDouble(binding4.getprofitsdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getgrossearningslimit())) {
                    obj.setGrossEarningLimit1(Double.parseDouble(binding4.getgrossearningslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getgrossearningsdeductible())) {
                    obj.setGrossEarningDeductible1(Double.parseDouble(binding4.getgrossearningsdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getrentalincomelimit())) {
                    obj.setRentalIncomeLimit1(Double.parseDouble(binding4.getrentalincomelimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getrentalincomedeductible())) {
                    obj.setRentalIncomeDeductible1(Double.parseDouble(binding4.getrentalincomedeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getextraexpenselimit())) {
                    obj.setExtraExpenseLimit1(Double.parseDouble(binding4.getextraexpenselimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getextraexpensedeductible())) {
                    obj.setExtraExpenseDeductible1(Double.parseDouble(binding4.getextraexpensedeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                    obj.setOffPremisesPowerLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                    obj.setOffPremisesPowerDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidelimit())) {
                    obj.setInsideOutsideLimit1(Double.parseDouble(binding4.getinsideoutsidelimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidedeductible())) {
                    obj.setInsideOutsideDeductible1(Double.parseDouble(binding4.getinsideoutsidedeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getbfmoneylimit())) {
                    obj.setBfMoneyLimit1(Double.parseDouble(binding4.getbfmoneylimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getbfmoneydeductible())) {
                    obj.setBfMoneyDeductible1(Double.parseDouble(binding4.getbfmoneydeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getforgerylimit())) {
                    obj.setDeopistorForgeryLimit1(Double.parseDouble(binding4.getforgerylimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getforgerydeductible())) {
                    obj.setDeopistorForgeryDeductible1(Double.parseDouble(binding4.getforgerydeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmoneyorderslimit())) {
                    obj.setMoneyOrdersLimit1(Double.parseDouble(binding4.getmoneyorderslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmoneyordersdeductible())) {
                    obj.setMoneyOrdersDeductible1(Double.parseDouble(binding4.getmoneyordersdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getdishonestylimit())) {
                    obj.setEmployDishonestyLimit1(Double.parseDouble(binding4.getdishonestylimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getdishonestydeductible())) {
                    obj.setEmployDishonestyDeductible1(Double.parseDouble(binding4.getdishonestydeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getcgllimit())) {
                    obj.setCglLimit1(Double.parseDouble(binding4.getcgllimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getcgldeductible())) {
                    obj.setCglDeductible1(Double.parseDouble(binding4.getcgldeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.gettenantslimit())) {
                    obj.setTenantsLegalLimit1(Double.parseDouble(binding4.gettenantslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.gettenantsdeductible())) {
                    obj.setTenantsLegalDeductible1(Double.parseDouble(binding4.gettenantsdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getnonownedlimit())) {
                    obj.setNonOwnedAutoLimit1(Double.parseDouble(binding4.getnonownedlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getnonowneddeductible())) {
                    obj.setNonOwnedAutoDeductible1(Double.parseDouble(binding4.getnonowneddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsef96limit())) {
                    obj.setSef96Limit1(Double.parseDouble(binding4.getsef96limit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                    obj.setSef96Deductible1(Double.parseDouble(binding4.getsef96deductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsef94limit())) {
                    obj.setSef94Limit1(Double.parseDouble(binding4.getsef94limit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                    obj.setSef94Deductible1(Double.parseDouble(binding4.getsef94deductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getdandlimit())) {
                    obj.setDoLimit1(Double.parseDouble(binding4.getdandlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getdanddeductible())) {
                    obj.setDoDeductible1(Double.parseDouble(binding4.getdanddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.geteandlimit())) {
                    obj.setEoLimit1(Double.parseDouble(binding4.geteandlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.geteanddeductible())) {
                    obj.setEoDeductible1(Double.parseDouble(binding4.geteanddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getemployerslimit())) {
                    obj.setEmployerLimit1(Double.parseDouble(binding4.getemployerslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getemployersdeductible())) {
                    obj.setEmployerDeductible1(Double.parseDouble(binding4.getemployersdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getumbrellalimit())) {
                    obj.setUmbrellaLimit1(Double.parseDouble(binding4.getumbrellalimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getumbrelladeductible())) {
                    obj.setUmbrellaDeductible1(Double.parseDouble(binding4.getumbrelladeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getwrapuplimit())) {
                    obj.setWrapUpLimit1(Double.parseDouble(binding4.getwrapuplimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getwrapupdeductible())) {
                    obj.setWrapUpDeductible1(Double.parseDouble(binding4.getwrapupdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getstdlimit())) {
                    obj.setStdComprehensiveLimit1(Double.parseDouble(binding4.getstdlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getstddeductible())) {
                    obj.setStdComprehensiveDeductible1(Double.parseDouble(binding4.getstddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getaclimit())) {
                    obj.setAirConditioningLimit1(Double.parseDouble(binding4.getaclimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getacdeductible())) {
                    obj.setAirConditioningDeductible1(Double.parseDouble(binding4.getacdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerylimit())) {
                    obj.setProductionMachineryLimit1(Double.parseDouble(binding4.getproductionmachinerylimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerydeductible())) {
                    obj.setProductionMachineryDeductible1(Double.parseDouble(binding4.getproductionmachinerydeductible()));
                }

                obj.setOthercoverage11(binding4.getothercoverage1());
                obj.setOthercoverage21(binding4.getothercoverage2());
                if (binding4.getothercoverage1limit() != null && !(binding4.getothercoverage1limit().trim().equals(""))) {
                    obj.setOtherCoverageLimit11(Double.parseDouble(binding4.getothercoverage1limit()));
                }
                if (binding4.getothercoverage1deductible() != null && !(binding4.getothercoverage1deductible().trim().equals(""))) {
                    obj.setOtherCoverageDeductible11(Double.parseDouble(binding4.getothercoverage1deductible()));
                }
                if (binding4.getothercoverage2limit() != null && !(binding4.getothercoverage2limit().trim().equals(""))) {
                    obj.setOtherCoverageLimit21(Double.parseDouble(binding4.getothercoverage2limit()));
                }
                if (binding4.getothercoverage2deductible() != null && !(binding4.getothercoverage2deductible().trim().equals(""))) {
                    obj.setOtherCoverageDeductible21(Double.parseDouble(binding4.getothercoverage2deductible()));
                }
                obj.setAdditionalCoverage1(binding4.getadditionalcoverage());
                obj.setRoofupdated1(binding4.getroofupdated());
                obj.setHeatingupdated1(binding4.getheatingupdated());
                obj.setElectricalupdated1(binding4.getelectricalupdated());
                obj.setElectricalamps1(binding4.getnoofamps());
                obj.setFireProtectiondistance1(binding4.getdistance());
                obj.setAddress1(binding4.getlocationaddress());
                obj.setBasement1(binding4.getbasement());
                obj.setOwner11(binding4.getmotortruckcargoowner());
                obj.setTruckMan1(binding4.getmotortruckcargotruckman());
                obj.setGrossEarning801(binding4.getgecheckbox());
                obj.setWallsframe1(binding4.getwallsframe());
                obj.setWallshcb1(binding4.getwallshcb());
                obj.setWallssteel1(binding4.getwallssteel());
                obj.setWallsbrick1(binding4.getwallsbrick());
                obj.setRoofwood1(binding4.getwoodjoist());
                obj.setRoofsteel1(binding4.getsteeldeck());
                obj.setRoofconcrete1(binding4.getroofconcrete());
                obj.setFloorsconcrete1(binding4.getfloorsconcrete());
                obj.setFloorswood1(binding4.getfloorswood());
                obj.setHeatinggas1(binding4.getfagas());
                obj.setHeatingoil1(binding4.getfaoil());
                obj.setHeatingelectric1(binding4.getheatingelectric());
                obj.setHeatingother1(binding4.getheatingother());
                obj.setElectricalbreakers1(binding4.getelectricalbreakers());
                obj.setElectricalfuses1(binding4.getelectricalfuses());
                obj.setElectricalamps1(binding4.getnoofamps());
                obj.setPlumbingcopper1(binding4.getcopper());
                obj.setPlumbingpvc1(binding4.getpvc());
                obj.setPlumbingother1(binding4.getplumbingother());
                obj.setFireProtection1(binding4.getFireProtection());
                obj.setSecurity1(binding4.getSecurity());

                if (!CommonValidations.isStringEmpty(binding4.getlocationage())) {
                    obj.setAge1(Integer.parseInt(binding4.getlocationage()));
                }
                if (!CommonValidations.isStringEmpty(binding4.gettotsqfootage())) {
                    obj.setTotalSqFootage1(Double.parseDouble(binding4.gettotsqfootage()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getinsidesqfootage())) {
                    obj.setInsdSqFootage1(Double.parseDouble(binding4.getinsidesqfootage()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getnoofstories())) {
                    obj.setNoOfStories1(Integer.parseInt(binding4.getnoofstories()));
                }
                System.out.println("4" + binding4.getlocationaddress());
                //System.out.println("5"+listAddInfo.get(offset).getAddress1());
                System.out.println("Next Address" + binding4.getlocationaddress());
                listAddInfo.add(obj);
            }

            offset++;

            if (offset > 9) {
                offset = 9;
            }
            System.out.println("Offset5 " + offset);
            try {
                if (listAddInfo.get(offset) != null) {
                    System.out.println("Offset6 " + offset);
                    binding4.setlocationaddress(listAddInfo.get(offset).getAddress1());

                    if (listAddInfo.get(offset).getAge1() > 0) {
                        binding4.setlocationage(Integer.toString(listAddInfo.get(offset).getAge1()));
                    }
                    if (listAddInfo.get(offset).getTotalSqFootage1() > 0) {
                        binding4.settotsqfootage(String.valueOf(listAddInfo.get(offset).getTotalSqFootage1()));
                    }
                    if (listAddInfo.get(offset).getInsdSqFootage1() > 0) {
                        binding4.setinsidesqfootage(String.valueOf(listAddInfo.get(offset).getInsdSqFootage1()));
                    }
                    if (listAddInfo.get(offset).getNoOfStories1() > 0) {
                        binding4.setnoofstories(String.valueOf(listAddInfo.get(offset).getNoOfStories1()));
                    }
                    if ("selected".equals(listAddInfo.get(offset).getTruckMan1())) {
                        mtctruckman.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getOwner11())) {
                        mtcowner.setSelected(true);
                    }
                    if ("selected80".equals(listAddInfo.get(offset).getGrossEarning801())) {
                        ge80.setSelected(true);
                    }
                    if ("selected50".equals(listAddInfo.get(offset).getGrossEarning801())) {
                        ge50.setSelected(true);
                    }

                    if ("selected".equals(listAddInfo.get(offset).getWallsframe1())) {
                        wallsframe.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getWallshcb1())) {
                        wallshcb.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getWallssteel1())) {
                        wallssteel.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getWallsbrick1())) {
                        wallsbrick.setSelected(true);
                    }

                    if ("selected".equals(listAddInfo.get(offset).getRoofwood1())) {
                        woodjoist.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getRoofsteel1())) {
                        steeldeck.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getRoofconcrete1())) {
                        roofconcrete.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getFloorsconcrete1())) {
                        floorsconcrete.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getFloorswood1())) {
                        floorswood.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getHeatinggas1())) {
                        fagas.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getHeatingoil1())) {
                        faoil.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getHeatingelectric1())) {
                        heatingelectric.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getHeatingother1())) {
                        heatingother.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getElectricalbreakers1())) {
                        electricalbreakers.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getElectricalfuses1())) {
                        electricalfuses.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getPlumbingcopper1())) {
                        copper.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getPlumbingpvc1())) {
                        pvc.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getPlumbingother1())) {
                        plumbingother.setSelected(true);
                    }
                    if ("Sprinklers".equals(listAddInfo.get(offset).getFireProtection1())) {
                        sprinklers.setSelected(true);
                    }
                    if ("SVC".equals(listAddInfo.get(offset).getFireProtection1())) {
                        svccontract.setSelected(true);
                    }
                    if ("Hydrant".equals(listAddInfo.get(offset).getFireProtection1())) {
                        hydrant.setSelected(true);
                    }
                    if ("Firehall".equals(listAddInfo.get(offset).getFireProtection1())) {
                        firehall.setSelected(true);
                    }
                    if ("Unprotected".equals(listAddInfo.get(offset).getFireProtection1())) {
                        unprotected.setSelected(true);
                    }
                    if ("Alarm System".equals(listAddInfo.get(offset).getSecurity1())) {
                        alarmsystem.setSelected(true);
                    }
                    if ("Central Monitored".equals(listAddInfo.get(offset).getSecurity1())) {
                        centralmonitored.setSelected(true);
                    }
                    if ("Window Bars".equals(listAddInfo.get(offset).getSecurity1())) {
                        windowbars.setSelected(true);
                    }
                    if ("Dead Bolts".equals(listAddInfo.get(offset).getSecurity1())) {
                        deadbolts.setSelected(true);
                    }
                    if ("Select".equals(listAddInfo.get(offset).getBasement1())) {
                        basement.getSelectionModel().select("Select");
                    } else if ("Yes".equals(listAddInfo.get(offset).getBasement1())) {
                        basement.getSelectionModel().select("Yes");
                    } else if ("No".equals(listAddInfo.get(offset).getBasement1())) {
                        basement.getSelectionModel().select("No");
                    }
                    if (listAddInfo.get(offset).getBuildingLimit1() > 0) {
                        binding4.setbuildinglimit(String.valueOf(listAddInfo.get(offset).getBuildingLimit1()));
                    }
                    if (listAddInfo.get(offset).getBuildingDeductible1() > 0) {
                        binding4.setbuildingdeductible(String.valueOf(listAddInfo.get(offset).getBuildingDeductible1()));
                    }
                    if (listAddInfo.get(offset).getContentsLimit1() > 0) {
                        binding4.setcontentslimit(String.valueOf(listAddInfo.get(offset).getContentsLimit1()));
                    }
                    if (listAddInfo.get(offset).getContentsDeductible1() > 0) {
                        binding4.setcontentsdeductible(String.valueOf(listAddInfo.get(offset).getContentsDeductible1()));
                    }
                    if (listAddInfo.get(offset).getContentsLimit1() > 0) {
                        binding4.setstocklimit(String.valueOf(listAddInfo.get(offset).getStockLimit1()));
                    }
                    if (listAddInfo.get(offset).getStockDeductible1() > 0) {
                        binding4.setstockdeductible(String.valueOf(listAddInfo.get(offset).getStockDeductible1()));
                    }
                    if (listAddInfo.get(offset).getOfficeContentLimit1() > 0) {
                        binding4.setofficelimit(String.valueOf(listAddInfo.get(offset).getOfficeContentLimit1()));
                    }
                    if (listAddInfo.get(offset).getOfficeContentDeductible1() > 0) {
                        binding4.setofficedeductible(String.valueOf(listAddInfo.get(offset).getOfficeContentDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEdpLimit1() > 0) {
                        binding4.setedplimit(String.valueOf(listAddInfo.get(offset).getEdpLimit1()));
                    }
                    if (listAddInfo.get(offset).getEdpDeductible1() > 0) {
                        binding4.setedpdeductible(String.valueOf(listAddInfo.get(offset).getEdpDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEquipmentLimit1() > 0) {
                        binding4.setequipmentlimit(String.valueOf(listAddInfo.get(offset).getEquipmentLimit1()));
                    }
                    if (listAddInfo.get(offset).getEquipmentDeductible1() > 0) {
                        binding4.setequipmentdeductible(String.valueOf(listAddInfo.get(offset).getEquipmentDeductible1()));
                    }
                    if (listAddInfo.get(offset).getOffPremisesLimit1() > 0) {
                        binding4.setoffpremiseslimit(String.valueOf(listAddInfo.get(offset).getOffPremisesLimit1()));
                    }
                    if (listAddInfo.get(offset).getOffPremisesDeductible1() > 0) {
                        binding4.setoffpremisesdeductible(String.valueOf(listAddInfo.get(offset).getOffPremisesDeductible1()));
                    }
                    if (listAddInfo.get(offset).getTransitLimit1() > 0) {
                        binding4.settransitlimit(String.valueOf(listAddInfo.get(offset).getTransitLimit1()));
                    }
                    if (listAddInfo.get(offset).getTransitDeductible1() > 0) {
                        binding4.settransitdeductible(String.valueOf(listAddInfo.get(offset).getTransitDeductible1()));
                    }
                    if (listAddInfo.get(offset).getMiscPropertyLimit1() > 0) {
                        binding4.setmiscpropertylimit(String.valueOf(listAddInfo.get(offset).getMiscPropertyLimit1()));
                    }
                    if (listAddInfo.get(offset).getMiscPropertyDeductible1() > 0) {
                        binding4.setmiscpropertydeductible(String.valueOf(listAddInfo.get(offset).getMiscPropertyDeductible1()));
                    }
                    if (listAddInfo.get(offset).getContractorEquipmentLimit1() > 0) {
                        binding4.setcontractorsequipmentlimit(String.valueOf(listAddInfo.get(offset).getContractorEquipmentLimit1()));
                    }
                    if (listAddInfo.get(offset).getContractorEquipmentDeductible1() > 0) {
                        binding4.setcontractorsequipmentdeductible(String.valueOf(listAddInfo.get(offset).getContractorEquipmentDeductible1()));
                    }
                    if (listAddInfo.get(offset).getInstallationFloaterLimit1() > 0) {
                        binding4.setcontentslimit(String.valueOf(listAddInfo.get(offset).getInstallationFloaterLimit1()));
                    }
                    if (listAddInfo.get(offset).getInstallationFloaterDeductible1() > 0) {
                        binding4.setinstallationfloatordeductible(String.valueOf(listAddInfo.get(offset).getInstallationFloaterDeductible1()));
                    }
                    if (listAddInfo.get(offset).getToolFloaterLimit1() > 0) {
                        binding4.settoolfloatorlimit(String.valueOf(listAddInfo.get(offset).getToolFloaterLimit1()));
                    }
                    if (listAddInfo.get(offset).getToolFloaterDeductible1() > 0) {
                        binding4.settoolfloatordeductible(String.valueOf(listAddInfo.get(offset).getToolFloaterDeductible1()));
                    }
                    if (listAddInfo.get(offset).getSignFloaterLimit1() > 0) {
                        binding4.setsignfloatorlimit(String.valueOf(listAddInfo.get(offset).getSignFloaterLimit1()));
                    }
                    if (listAddInfo.get(offset).getSignFloaterDeductible1() > 0) {
                        binding4.setsignfloatordeductible(String.valueOf(listAddInfo.get(offset).getSignFloaterDeductible1()));
                    }
                    if (listAddInfo.get(offset).getMotorTruckLimit1() > 0) {
                        binding4.setmotortruckcargolimit(String.valueOf(listAddInfo.get(offset).getMotorTruckLimit1()));
                    }
                    if (listAddInfo.get(offset).getMotorTruckDeductible1() > 0) {
                        binding4.setmotortruckcargodeductible(String.valueOf(listAddInfo.get(offset).getMotorTruckDeductible1()));
                    }
                    if (listAddInfo.get(offset).getGlassLimit1() > 0) {
                        binding4.setglasslimit(String.valueOf(listAddInfo.get(offset).getGlassLimit1()));
                    }
                    if (listAddInfo.get(offset).getGlassDeductible1() > 0) {
                        binding4.setglassdeductible(String.valueOf(listAddInfo.get(offset).getGlassDeductible1()));
                    }
                    if (listAddInfo.get(offset).getSewerBackupDeductible1() > 0) {
                        binding4.setsewerblackupdeductible(String.valueOf(listAddInfo.get(offset).getSewerBackupDeductible1()));
                    }
                    if (listAddInfo.get(offset).getFloodDeductible1() > 0) {
                        binding4.setflooddeductible(String.valueOf(listAddInfo.get(offset).getFloodDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEarthquakeDeductible1() > 0) {
                        binding4.setearthquakedeductible(String.valueOf(listAddInfo.get(offset).getEarthquakeDeductible1()));
                    }
                    if (listAddInfo.get(offset).getProfitLimit1() > 0) {
                        binding4.setprofitslimit(String.valueOf(listAddInfo.get(offset).getProfitLimit1()));
                    }
                    if (listAddInfo.get(offset).getProfitDeductible1() > 0) {
                        binding4.setprofitsdeductible(String.valueOf(listAddInfo.get(offset).getProfitDeductible1()));
                    }
                    if (listAddInfo.get(offset).getGrossEarningLimit1() > 0) {
                        binding4.setgrossearningslimit(String.valueOf(listAddInfo.get(offset).getGrossEarningLimit1()));
                    }
                    if (listAddInfo.get(offset).getToolFloaterDeductible1() > 0) {
                        binding4.setgrossearningsdeductible(String.valueOf(listAddInfo.get(offset).getGrossEarningDeductible1()));
                    }
                    if (listAddInfo.get(offset).getRentalIncomeLimit1() > 0) {
                        binding4.setrentalincomelimit(String.valueOf(listAddInfo.get(offset).getRentalIncomeLimit1()));
                    }
                    if (listAddInfo.get(offset).getRentalIncomeDeductible1() > 0) {
                        binding4.setrentalincomedeductible(String.valueOf(listAddInfo.get(offset).getRentalIncomeDeductible1()));
                    }
                    if (listAddInfo.get(offset).getExtraExpenseLimit1() > 0) {
                        binding4.setextraexpenselimit(String.valueOf(listAddInfo.get(offset).getExtraExpenseLimit1()));
                    }
                    if (listAddInfo.get(offset).getExtraExpenseDeductible1() > 0) {
                        binding4.setextraexpensedeductible(String.valueOf(listAddInfo.get(offset).getExtraExpenseDeductible1()));
                    }
                    if (listAddInfo.get(offset).getOffPremisesLimit1() > 0) {
                        binding4.setoffpremiseslimit(String.valueOf(listAddInfo.get(offset).getOffPremisesLimit1()));
                    }
                    if (listAddInfo.get(offset).getOffPremisesDeductible1() > 0) {
                        binding4.setoffpremisesdeductible(String.valueOf(listAddInfo.get(offset).getOffPremisesDeductible1()));
                    }
                    if (listAddInfo.get(offset).getInsideOutsideLimit1() > 0) {
                        binding4.setinsideoutsidelimit(String.valueOf(listAddInfo.get(offset).getInsideOutsideLimit1()));
                    }
                    if (listAddInfo.get(offset).getInsideOutsideDeductible1() > 0) {
                        binding4.setinsideoutsidedeductible(String.valueOf(listAddInfo.get(offset).getInsideOutsideDeductible1()));
                    }
                    if (listAddInfo.get(offset).getBfMoneyLimit1() > 0) {
                        binding4.setbfmoneylimit(String.valueOf(listAddInfo.get(offset).getBfMoneyLimit1()));
                    }
                    if (listAddInfo.get(offset).getBfMoneyDeductible1() > 0) {
                        binding4.setbfmoneydeductible(String.valueOf(listAddInfo.get(offset).getBfMoneyDeductible1()));
                    }
                    if (listAddInfo.get(offset).getDeopistorForgeryLimit1() > 0) {
                        binding4.setforgerylimit(String.valueOf(listAddInfo.get(offset).getDeopistorForgeryLimit1()));
                    }
                    if (listAddInfo.get(offset).getDeopistorForgeryDeductible1() > 0) {
                        binding4.setforgerydeductible(String.valueOf(listAddInfo.get(offset).getDeopistorForgeryDeductible1()));
                    }
                    if (listAddInfo.get(offset).getMoneyOrdersLimit1() > 0) {
                        binding4.setmoneyorderslimit(String.valueOf(listAddInfo.get(offset).getMoneyOrdersLimit1()));
                    }
                    if (listAddInfo.get(offset).getMoneyOrdersDeductible1() > 0) {
                        binding4.setmoneyordersdeductible(String.valueOf(listAddInfo.get(offset).getMoneyOrdersDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEmployDishonestyLimit1() > 0) {
                        binding4.setdishonestylimit(String.valueOf(listAddInfo.get(offset).getEmployDishonestyLimit1()));
                    }
                    if (listAddInfo.get(offset).getEmployDishonestyDeductible1() > 0) {
                        binding4.setdishonestydeductible(String.valueOf(listAddInfo.get(offset).getEmployDishonestyDeductible1()));
                    }
                    if (listAddInfo.get(offset).getCglLimit1() > 0) {
                        binding4.setcgllimit(String.valueOf(listAddInfo.get(offset).getCglLimit1()));
                    }
                    if (listAddInfo.get(offset).getCglDeductible1() > 0) {
                        binding4.setcgldeductible(String.valueOf(listAddInfo.get(offset).getCglDeductible1()));
                    }
                    if (listAddInfo.get(offset).getTenantsLegalLimit1() > 0) {
                        binding4.settenantslimit(String.valueOf(listAddInfo.get(offset).getTenantsLegalLimit1()));
                    }
                    if (listAddInfo.get(offset).getTenantsLegalDeductible1() > 0) {
                        binding4.settenantsdeductible(String.valueOf(listAddInfo.get(offset).getTenantsLegalDeductible1()));
                    }
                    if (listAddInfo.get(offset).getNonOwnedAutoLimit1() > 0) {
                        binding4.setnonownedlimit(String.valueOf(listAddInfo.get(offset).getNonOwnedAutoLimit1()));
                    }
                    if (listAddInfo.get(offset).getNonOwnedAutoDeductible1() > 0) {
                        binding4.setnonowneddeductible(String.valueOf(listAddInfo.get(offset).getNonOwnedAutoDeductible1()));
                    }
                    if (listAddInfo.get(offset).getSef94Limit1() > 0) {
                        binding4.setsef94limit(String.valueOf(listAddInfo.get(offset).getSef94Limit1()));
                    }
                    if (listAddInfo.get(offset).getSef96Limit1() > 0) {
                        binding4.setsef96limit(String.valueOf(listAddInfo.get(offset).getSef96Limit1()));
                    }
                    if (listAddInfo.get(offset).getSef94Deductible1() > 0) {
                        binding4.setsef94deductible(String.valueOf(listAddInfo.get(offset).getSef94Deductible1()));
                    }
                    if (listAddInfo.get(offset).getSef96Deductible1() > 0) {
                        binding4.setsef96deductible(String.valueOf(listAddInfo.get(offset).getSef96Deductible1()));
                    }
                    if (listAddInfo.get(offset).getDoLimit1() > 0) {
                        binding4.setdandlimit(String.valueOf(listAddInfo.get(offset).getDoLimit1()));
                    }
                    if (listAddInfo.get(offset).getDoDeductible1() > 0) {
                        binding4.setdanddeductible(String.valueOf(listAddInfo.get(offset).getDoDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEoLimit1() > 0) {
                        binding4.seteandlimit(String.valueOf(listAddInfo.get(offset).getEoLimit1()));
                    }
                    if (listAddInfo.get(offset).getEoDeductible1() > 0) {
                        binding4.seteanddeductible(String.valueOf(listAddInfo.get(offset).getEoDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEmployerLimit1() > 0) {
                        binding4.setemployerslimit(String.valueOf(listAddInfo.get(offset).getEmployerLimit1()));
                    }
                    if (listAddInfo.get(offset).getEmployerDeductible1() > 0) {
                        binding4.setemployersdeductible(String.valueOf(listAddInfo.get(offset).getEmployerDeductible1()));
                    }
                    if (listAddInfo.get(offset).getUmbrellaLimit1() > 0) {
                        binding4.setumbrellalimit(String.valueOf(listAddInfo.get(offset).getUmbrellaLimit1()));
                    }
                    if (listAddInfo.get(offset).getUmbrellaDeductible1() > 0) {
                        binding4.setumbrelladeductible(String.valueOf(listAddInfo.get(offset).getUmbrellaDeductible1()));
                    }
                    if (listAddInfo.get(offset).getWrapUpLimit1() > 0) {
                        binding4.setwrapuplimit(String.valueOf(listAddInfo.get(offset).getWrapUpLimit1()));
                    }
                    if (listAddInfo.get(offset).getWrapUpDeductible1() > 0) {
                        binding4.setwrapupdeductible(String.valueOf(listAddInfo.get(offset).getWrapUpDeductible1()));
                    }
                    if (listAddInfo.get(offset).getStdComprehensiveLimit1() > 0) {
                        binding4.setstdlimit(String.valueOf(listAddInfo.get(offset).getStdComprehensiveLimit1()));
                    }
                    if (listAddInfo.get(offset).getStdComprehensiveDeductible1() > 0) {
                        binding4.setstddeductible(String.valueOf(listAddInfo.get(offset).getStdComprehensiveDeductible1()));
                    }
                    if (listAddInfo.get(offset).getAirConditioningLimit1() > 0) {
                        binding4.setaclimit(String.valueOf(listAddInfo.get(offset).getAirConditioningLimit1()));
                    }
                    if (listAddInfo.get(offset).getAirConditioningDeductible1() > 0) {
                        binding4.setacdeductible(String.valueOf(listAddInfo.get(offset).getAirConditioningDeductible1()));
                    }
                    if (listAddInfo.get(offset).getProductionMachineryLimit1() > 0) {
                        binding4.setproductionmachinerylimit(String.valueOf(listAddInfo.get(offset).getProductionMachineryLimit1()));
                    }
                    if (listAddInfo.get(offset).getProductionMachineryDeductible1() > 0) {
                        binding4.setproductionmachinerydeductible(String.valueOf(listAddInfo.get(offset).getProductionMachineryDeductible1()));
                    }
                    binding4.setothercoverage1(listAddInfo.get(offset).getOthercoverage11());
                    binding4.setothercoverage2(listAddInfo.get(offset).getOthercoverage21());
                    if (listAddInfo.get(offset).getOtherCoverageLimit11() > 0) {
                        binding4.setothercoverage1limit(String.valueOf(listAddInfo.get(offset).getOtherCoverageLimit11()));
                    }
                    if (listAddInfo.get(offset).getOtherCoverageDeductible11() > 0) {
                        binding4.setothercoverage1deductible(String.valueOf(listAddInfo.get(offset).getOtherCoverageDeductible11()));
                    }
                    if (listAddInfo.get(offset).getOtherCoverageLimit21() > 0) {
                        binding4.setothercoverage2limit(String.valueOf(listAddInfo.get(offset).getOtherCoverageLimit21()));
                    }
                    if (listAddInfo.get(offset).getOtherCoverageDeductible21() > 0) {
                        binding4.setothercoverage2deductible(String.valueOf(listAddInfo.get(offset).getOtherCoverageDeductible21()));
                    }
                    binding4.setadditionalcoverage(listAddInfo.get(offset).getAdditionalCoverage1());

                } else {
                    System.out.println("Offset7 " + offset);
                    binding4.setlocationaddress("");
                    binding4.setlocationage("");
                    binding4.settotsqfootage("");
                    binding4.setinsidesqfootage("");
                    binding4.setnoofstories("");
                    basement.getSelectionModel().selectFirst();
                    wallsframe.setSelected(false);
                    wallsbrick.setSelected(false);
                    wallshcb.setSelected(false);
                    wallssteel.setSelected(false);
                    woodjoist.setSelected(false);
                    steeldeck.setSelected(false);
                    roofconcrete.setSelected(false);
                    binding4.setroofupdated("");
                    floorsconcrete.setSelected(false);
                    floorswood.setSelected(false);
                    fagas.setSelected(false);
                    faoil.setSelected(false);
                    heatingelectric.setSelected(false);
                    heatingother.setSelected(false);
                    binding4.setheatingupdated("");
                    electricalbreakers.setSelected(false);
                    electricalfuses.setSelected(false);
                    binding4.setelectricalupdated("");
                    binding4.setnoofamps("");
                    copper.setSelected(false);
                    copper.setSelected(false);
                    pvc.setSelected(false);
                    plumbingother.setSelected(false);
                    binding4.setplumbingupdated("");
                    sprinklers.setSelected(false);
                    svccontract.setSelected(false);
                    hydrant.setSelected(false);
                    firehall.setSelected(false);
                    unprotected.setSelected(false);
                    binding4.setFireProtection("");
                    alarmsystem.setSelected(false);
                    centralmonitored.setSelected(false);
                    windowbars.setSelected(false);
                    deadbolts.setSelected(false);
                    System.out.println(binding4.getlocationaddress());
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Offset8 " + offset);
                binding4.setlocationaddress("");
                binding4.setlocationaddress("");
                binding4.setlocationage("");
                binding4.settotsqfootage("");
                binding4.setinsidesqfootage("");
                binding4.setnoofstories("");
                basement.getSelectionModel().selectFirst();
                wallsframe.setSelected(false);
                wallsbrick.setSelected(false);
                wallshcb.setSelected(false);
                wallssteel.setSelected(false);
                woodjoist.setSelected(false);
                steeldeck.setSelected(false);
                roofconcrete.setSelected(false);
                binding4.setroofupdated("");
                floorsconcrete.setSelected(false);
                floorswood.setSelected(false);
                fagas.setSelected(false);
                faoil.setSelected(false);
                heatingelectric.setSelected(false);
                heatingother.setSelected(false);
                binding4.setheatingupdated("");
                electricalbreakers.setSelected(false);
                electricalfuses.setSelected(false);
                binding4.setelectricalupdated("");
                binding4.setnoofamps("");
                copper.setSelected(false);
                copper.setSelected(false);
                pvc.setSelected(false);
                plumbingother.setSelected(false);
                binding4.setplumbingupdated("");
                sprinklers.setSelected(false);
                svccontract.setSelected(false);
                hydrant.setSelected(false);
                firehall.setSelected(false);
                unprotected.setSelected(false);
                binding4.setFireProtection("");
                alarmsystem.setSelected(false);
                centralmonitored.setSelected(false);
                windowbars.setSelected(false);
                deadbolts.setSelected(false);
                System.out.println(binding4.getlocationaddress());
            }
        }
        for (AddAnotherInfo e : listAddInfo) {
            System.out.println("next list " + e.getAddress1());
        }

    }

    @FXML
    public void addAdditionPrev() {
        System.out.println("Previous Clicked");
        System.out.println(binding4.getlocationaddress());
        //System.out.println("10" + listAddInfo.get(offset).getAddress1());
        if (offset >= 1 && offset < 10) {
            try {
                System.out.println("Offset9 " + offset);
                if (listAddInfo.get(offset) != null) {
                    System.out.println("Offset10 " + offset);
                    listAddInfo.get(offset).setAddress1(binding4.getlocationaddress());
                    if (!CommonValidations.isStringEmpty(binding4.getbuildinglimit())) {
                        listAddInfo.get(offset).setBuildingLimit1(Double.parseDouble(binding4.getbuildinglimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getbuildingdeductible())) {
                        listAddInfo.get(offset).setBuildingDeductible1(Double.parseDouble(binding4.getbuildingdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontentslimit())) {
                        listAddInfo.get(offset).setContentsLimit1(Double.parseDouble(binding4.getcontentslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontentsdeductible())) {
                        listAddInfo.get(offset).setContentsDeductible1(Double.parseDouble(binding4.getcontentsdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getstocklimit())) {
                        listAddInfo.get(offset).setStockLimit1(Double.parseDouble(binding4.getstocklimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getstockdeductible())) {
                        listAddInfo.get(offset).setStockDeductible1(Double.parseDouble(binding4.getstockdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getofficelimit())) {
                        listAddInfo.get(offset).setOfficeContentLimit1(Double.parseDouble(binding4.getofficelimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getofficedeductible())) {
                        listAddInfo.get(offset).setOfficeContentDeductible1(Double.parseDouble(binding4.getofficedeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getedplimit())) {
                        listAddInfo.get(offset).setEdpLimit1(Double.parseDouble(binding4.getedplimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getedpdeductible())) {
                        listAddInfo.get(offset).setEdpDeductible1(Double.parseDouble(binding4.getedpdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getequipmentlimit())) {
                        listAddInfo.get(offset).setEquipmentLimit1(Double.parseDouble(binding4.getequipmentlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getequipmentdeductible())) {
                        listAddInfo.get(offset).setEquipmentDeductible1(Double.parseDouble(binding4.getequipmentdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                        listAddInfo.get(offset).setOffPremisesLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                        listAddInfo.get(offset).setOffPremisesDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettransitlimit())) {
                        listAddInfo.get(offset).setTransitLimit1(Double.parseDouble(binding4.gettransitlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettransitdeductible())) {
                        listAddInfo.get(offset).setTransitDeductible1(Double.parseDouble(binding4.gettransitdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmiscpropertylimit())) {
                        listAddInfo.get(offset).setMiscPropertyLimit1(Double.parseDouble(binding4.getmiscpropertylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmiscpropertydeductible())) {
                        listAddInfo.get(offset).setMiscPropertyDeductible1(Double.parseDouble(binding4.getmiscpropertydeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentlimit())) {
                        listAddInfo.get(offset).setContractorEquipmentLimit1(Double.parseDouble(binding4.getcontractorsequipmentlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentdeductible())) {
                        listAddInfo.get(offset).setContractorEquipmentDeductible1(Double.parseDouble(binding4.getcontractorsequipmentdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatorlimit())) {
                        listAddInfo.get(offset).setInstallationFloaterLimit1(Double.parseDouble(binding4.getinstallationfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatordeductible())) {
                        listAddInfo.get(offset).setInstallationFloaterDeductible1(Double.parseDouble(binding4.getinstallationfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettoolfloatorlimit())) {
                        listAddInfo.get(offset).setToolFloaterLimit1(Double.parseDouble(binding4.gettoolfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettoolfloatordeductible())) {
                        listAddInfo.get(offset).setToolFloaterDeductible1(Double.parseDouble(binding4.gettoolfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getsignfloatorlimit())) {
                        listAddInfo.get(offset).setSignFloaterLimit1(Double.parseDouble(binding4.getsignfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getsignfloatordeductible())) {
                        listAddInfo.get(offset).setSignFloaterDeductible1(Double.parseDouble(binding4.getsignfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargolimit())) {
                        listAddInfo.get(offset).setMotorTruckLimit1(Double.parseDouble(binding4.getmotortruckcargolimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargodeductible())) {
                        listAddInfo.get(offset).setMotorTruckDeductible1(Double.parseDouble(binding4.getmotortruckcargodeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getglasslimit())) {
                        listAddInfo.get(offset).setGlassLimit1(Double.parseDouble(binding4.getglasslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getglassdeductible())) {
                        listAddInfo.get(offset).setGlassDeductible1(Double.parseDouble(binding4.getglassdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsewerblackupdeductible())) {
                        listAddInfo.get(offset).setSewerBackupDeductible1(Double.parseDouble(binding4.getsewerblackupdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getflooddeductible())) {
                        listAddInfo.get(offset).setFloodDeductible1(Double.parseDouble(binding4.getflooddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getearthquakedeductible())) {
                        listAddInfo.get(offset).setEarthquakeDeductible1(Double.parseDouble(binding4.getearthquakedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getprofitslimit())) {
                        listAddInfo.get(offset).setProfitLimit1(Double.parseDouble(binding4.getprofitslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getprofitsdeductible())) {
                        listAddInfo.get(offset).setProfitDeductible1(Double.parseDouble(binding4.getprofitsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getgrossearningslimit())) {
                        listAddInfo.get(offset).setGrossEarningLimit1(Double.parseDouble(binding4.getgrossearningslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getgrossearningsdeductible())) {
                        listAddInfo.get(offset).setGrossEarningDeductible1(Double.parseDouble(binding4.getgrossearningsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getrentalincomelimit())) {
                        listAddInfo.get(offset).setRentalIncomeLimit1(Double.parseDouble(binding4.getrentalincomelimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getrentalincomedeductible())) {
                        listAddInfo.get(offset).setRentalIncomeDeductible1(Double.parseDouble(binding4.getrentalincomedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getextraexpenselimit())) {
                        listAddInfo.get(offset).setExtraExpenseLimit1(Double.parseDouble(binding4.getextraexpenselimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getextraexpensedeductible())) {
                        listAddInfo.get(offset).setExtraExpenseDeductible1(Double.parseDouble(binding4.getextraexpensedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                        listAddInfo.get(offset).setOffPremisesPowerLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                        listAddInfo.get(offset).setOffPremisesPowerDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidelimit())) {
                        listAddInfo.get(offset).setInsideOutsideLimit1(Double.parseDouble(binding4.getinsideoutsidelimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidedeductible())) {
                        listAddInfo.get(offset).setInsideOutsideDeductible1(Double.parseDouble(binding4.getinsideoutsidedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getbfmoneylimit())) {
                        listAddInfo.get(offset).setBfMoneyLimit1(Double.parseDouble(binding4.getbfmoneylimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getbfmoneydeductible())) {
                        listAddInfo.get(offset).setBfMoneyDeductible1(Double.parseDouble(binding4.getbfmoneydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getforgerylimit())) {
                        listAddInfo.get(offset).setDeopistorForgeryLimit1(Double.parseDouble(binding4.getforgerylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getforgerydeductible())) {
                        listAddInfo.get(offset).setDeopistorForgeryDeductible1(Double.parseDouble(binding4.getforgerydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmoneyorderslimit())) {
                        listAddInfo.get(offset).setMoneyOrdersLimit1(Double.parseDouble(binding4.getmoneyorderslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmoneyordersdeductible())) {
                        listAddInfo.get(offset).setMoneyOrdersDeductible1(Double.parseDouble(binding4.getmoneyordersdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdishonestylimit())) {
                        listAddInfo.get(offset).setEmployDishonestyLimit1(Double.parseDouble(binding4.getdishonestylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdishonestydeductible())) {
                        listAddInfo.get(offset).setEmployDishonestyDeductible1(Double.parseDouble(binding4.getdishonestydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getcgllimit())) {
                        listAddInfo.get(offset).setCglLimit1(Double.parseDouble(binding4.getcgllimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getcgldeductible())) {
                        listAddInfo.get(offset).setCglDeductible1(Double.parseDouble(binding4.getcgldeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettenantslimit())) {
                        listAddInfo.get(offset).setTenantsLegalLimit1(Double.parseDouble(binding4.gettenantslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettenantsdeductible())) {
                        listAddInfo.get(offset).setTenantsLegalDeductible1(Double.parseDouble(binding4.gettenantsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getnonownedlimit())) {
                        listAddInfo.get(offset).setNonOwnedAutoLimit1(Double.parseDouble(binding4.getnonownedlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getnonowneddeductible())) {
                        listAddInfo.get(offset).setNonOwnedAutoDeductible1(Double.parseDouble(binding4.getnonowneddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef96limit())) {
                        listAddInfo.get(offset).setSef96Limit1(Double.parseDouble(binding4.getsef96limit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                        listAddInfo.get(offset).setSef96Deductible1(Double.parseDouble(binding4.getsef96deductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94limit())) {
                        listAddInfo.get(offset).setSef94Limit1(Double.parseDouble(binding4.getsef94limit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                        listAddInfo.get(offset).setSef94Deductible1(Double.parseDouble(binding4.getsef94deductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdandlimit())) {
                        listAddInfo.get(offset).setDoLimit1(Double.parseDouble(binding4.getdandlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdanddeductible())) {
                        listAddInfo.get(offset).setDoDeductible1(Double.parseDouble(binding4.getdanddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.geteandlimit())) {
                        listAddInfo.get(offset).setEoLimit1(Double.parseDouble(binding4.geteandlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.geteanddeductible())) {
                        listAddInfo.get(offset).setEoDeductible1(Double.parseDouble(binding4.geteanddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getemployerslimit())) {
                        listAddInfo.get(offset).setEmployerLimit1(Double.parseDouble(binding4.getemployerslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getemployersdeductible())) {
                        listAddInfo.get(offset).setEmployerDeductible1(Double.parseDouble(binding4.getemployersdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getumbrellalimit())) {
                        listAddInfo.get(offset).setUmbrellaLimit1(Double.parseDouble(binding4.getumbrellalimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getumbrelladeductible())) {
                        listAddInfo.get(offset).setUmbrellaDeductible1(Double.parseDouble(binding4.getumbrelladeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getwrapuplimit())) {
                        listAddInfo.get(offset).setWrapUpLimit1(Double.parseDouble(binding4.getwrapuplimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getwrapupdeductible())) {
                        listAddInfo.get(offset).setWrapUpDeductible1(Double.parseDouble(binding4.getwrapupdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getstdlimit())) {
                        listAddInfo.get(offset).setStdComprehensiveLimit1(Double.parseDouble(binding4.getstdlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getstddeductible())) {
                        listAddInfo.get(offset).setStdComprehensiveDeductible1(Double.parseDouble(binding4.getstddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getaclimit())) {
                        listAddInfo.get(offset).setAirConditioningLimit1(Double.parseDouble(binding4.getaclimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getacdeductible())) {
                        listAddInfo.get(offset).setAirConditioningDeductible1(Double.parseDouble(binding4.getacdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerylimit())) {
                        listAddInfo.get(offset).setProductionMachineryLimit1(Double.parseDouble(binding4.getproductionmachinerylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerydeductible())) {
                        listAddInfo.get(offset).setProductionMachineryDeductible1(Double.parseDouble(binding4.getproductionmachinerydeductible()));
                    }

                    listAddInfo.get(offset).setOthercoverage11(binding4.getothercoverage1());
                    listAddInfo.get(offset).setOthercoverage21(binding4.getothercoverage2());
                    if (binding4.getothercoverage1limit() != null && !(binding4.getothercoverage1limit().trim().equals(""))) {
                        listAddInfo.get(offset).setOtherCoverageLimit11(Double.parseDouble(binding4.getothercoverage1limit()));
                    }
                    if (binding4.getothercoverage1deductible() != null && !(binding4.getothercoverage1deductible().trim().equals(""))) {
                        listAddInfo.get(offset).setOtherCoverageDeductible11(Double.parseDouble(binding4.getothercoverage1deductible()));
                    }
                    if (binding4.getothercoverage2limit() != null && !(binding4.getothercoverage2limit().trim().equals(""))) {
                        listAddInfo.get(offset).setOtherCoverageLimit21(Double.parseDouble(binding4.getothercoverage2limit()));
                    }
                    if (binding4.getothercoverage2deductible() != null && !(binding4.getothercoverage2deductible().trim().equals(""))) {
                        listAddInfo.get(offset).setOtherCoverageDeductible21(Double.parseDouble(binding4.getothercoverage2deductible()));
                    }
                    listAddInfo.get(offset).setAdditionalCoverage1(binding4.getadditionalcoverage());
                    listAddInfo.get(offset).setRoofupdated1(binding4.getroofupdated());
                    listAddInfo.get(offset).setHeatingupdated1(binding4.getheatingupdated());
                    listAddInfo.get(offset).setElectricalupdated1(binding4.getelectricalupdated());
                    listAddInfo.get(offset).setElectricalamps1(binding4.getnoofamps());
                    listAddInfo.get(offset).setFireProtectiondistance1(binding4.getdistance());
                    listAddInfo.get(offset).setAddress1(binding4.getlocationaddress());
                    listAddInfo.get(offset).setBasement1(binding4.getbasement());
                    listAddInfo.get(offset).setOwner11(binding4.getmotortruckcargoowner());
                    listAddInfo.get(offset).setTruckMan1(binding4.getmotortruckcargotruckman());
                    listAddInfo.get(offset).setGrossEarning801(binding4.getgecheckbox());
                    listAddInfo.get(offset).setWallsframe1(binding4.getwallsframe());
                    listAddInfo.get(offset).setWallshcb1(binding4.getwallshcb());
                    listAddInfo.get(offset).setWallssteel1(binding4.getwallssteel());
                    listAddInfo.get(offset).setWallsbrick1(binding4.getwallsbrick());
                    listAddInfo.get(offset).setRoofwood1(binding4.getwoodjoist());
                    listAddInfo.get(offset).setRoofsteel1(binding4.getsteeldeck());
                    listAddInfo.get(offset).setRoofconcrete1(binding4.getroofconcrete());
                    listAddInfo.get(offset).setFloorsconcrete1(binding4.getfloorsconcrete());
                    listAddInfo.get(offset).setFloorswood1(binding4.getfloorswood());
                    listAddInfo.get(offset).setHeatinggas1(binding4.getfagas());
                    listAddInfo.get(offset).setHeatingoil1(binding4.getfaoil());
                    listAddInfo.get(offset).setHeatingelectric1(binding4.getheatingelectric());
                    listAddInfo.get(offset).setHeatingother1(binding4.getheatingother());
                    listAddInfo.get(offset).setElectricalbreakers1(binding4.getelectricalbreakers());
                    listAddInfo.get(offset).setElectricalfuses1(binding4.getelectricalfuses());
                    listAddInfo.get(offset).setElectricalamps1(binding4.getnoofamps());
                    listAddInfo.get(offset).setPlumbingcopper1(binding4.getcopper());
                    listAddInfo.get(offset).setPlumbingpvc1(binding4.getpvc());
                    listAddInfo.get(offset).setPlumbingother1(binding4.getplumbingother());
                    listAddInfo.get(offset).setFireProtection1(binding4.getFireProtection());
                    listAddInfo.get(offset).setSecurity1(binding4.getSecurity());

                    if (!CommonValidations.isStringEmpty(binding4.getlocationage())) {
                        listAddInfo.get(offset).setAge1(Integer.parseInt(binding4.getlocationage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettotsqfootage())) {
                        listAddInfo.get(offset).setTotalSqFootage1(Double.parseDouble(binding4.gettotsqfootage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinsidesqfootage())) {
                        listAddInfo.get(offset).setInsdSqFootage1(Double.parseDouble(binding4.getinsidesqfootage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getnoofstories())) {
                        listAddInfo.get(offset).setNoOfStories1(Integer.parseInt(binding4.getnoofstories()));
                    }

                } else {
                    System.out.println("Offset11 " + offset);
                    AddAnotherInfo obj = new AddAnotherInfo();
                    obj.setAddress1(binding4.getlocationaddress());
                    obj.setAddress1(binding4.getlocationaddress());
                    if (!CommonValidations.isStringEmpty(binding4.getbuildinglimit())) {
                        obj.setBuildingLimit1(Double.parseDouble(binding4.getbuildinglimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getbuildingdeductible())) {
                        obj.setBuildingDeductible1(Double.parseDouble(binding4.getbuildingdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontentslimit())) {
                        obj.setContentsLimit1(Double.parseDouble(binding4.getcontentslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontentsdeductible())) {
                        obj.setContentsDeductible1(Double.parseDouble(binding4.getcontentsdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getstocklimit())) {
                        obj.setStockLimit1(Double.parseDouble(binding4.getstocklimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getstockdeductible())) {
                        obj.setStockDeductible1(Double.parseDouble(binding4.getstockdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getofficelimit())) {
                        obj.setOfficeContentLimit1(Double.parseDouble(binding4.getofficelimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getofficedeductible())) {
                        obj.setOfficeContentDeductible1(Double.parseDouble(binding4.getofficedeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getedplimit())) {
                        obj.setEdpLimit1(Double.parseDouble(binding4.getedplimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getedpdeductible())) {
                        obj.setEdpDeductible1(Double.parseDouble(binding4.getedpdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getequipmentlimit())) {
                        obj.setEquipmentLimit1(Double.parseDouble(binding4.getequipmentlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getequipmentdeductible())) {
                        obj.setEquipmentDeductible1(Double.parseDouble(binding4.getequipmentdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                        obj.setOffPremisesLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                        obj.setOffPremisesDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettransitlimit())) {
                        obj.setTransitLimit1(Double.parseDouble(binding4.gettransitlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettransitdeductible())) {
                        obj.setTransitDeductible1(Double.parseDouble(binding4.gettransitdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmiscpropertylimit())) {
                        obj.setMiscPropertyLimit1(Double.parseDouble(binding4.getmiscpropertylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmiscpropertydeductible())) {
                        obj.setMiscPropertyDeductible1(Double.parseDouble(binding4.getmiscpropertydeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentlimit())) {
                        obj.setContractorEquipmentLimit1(Double.parseDouble(binding4.getcontractorsequipmentlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentdeductible())) {
                        obj.setContractorEquipmentDeductible1(Double.parseDouble(binding4.getcontractorsequipmentdeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatorlimit())) {
                        obj.setInstallationFloaterLimit1(Double.parseDouble(binding4.getinstallationfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatordeductible())) {
                        obj.setInstallationFloaterDeductible1(Double.parseDouble(binding4.getinstallationfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettoolfloatorlimit())) {
                        obj.setToolFloaterLimit1(Double.parseDouble(binding4.gettoolfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettoolfloatordeductible())) {
                        obj.setToolFloaterDeductible1(Double.parseDouble(binding4.gettoolfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getsignfloatorlimit())) {
                        obj.setSignFloaterLimit1(Double.parseDouble(binding4.getsignfloatorlimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getsignfloatordeductible())) {
                        obj.setSignFloaterDeductible1(Double.parseDouble(binding4.getsignfloatordeductible()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargolimit())) {
                        obj.setMotorTruckLimit1(Double.parseDouble(binding4.getmotortruckcargolimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargodeductible())) {
                        obj.setMotorTruckDeductible1(Double.parseDouble(binding4.getmotortruckcargodeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getglasslimit())) {
                        obj.setGlassLimit1(Double.parseDouble(binding4.getglasslimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getglassdeductible())) {
                        obj.setGlassDeductible1(Double.parseDouble(binding4.getglassdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsewerblackupdeductible())) {
                        obj.setSewerBackupDeductible1(Double.parseDouble(binding4.getsewerblackupdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getflooddeductible())) {
                        obj.setFloodDeductible1(Double.parseDouble(binding4.getflooddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getearthquakedeductible())) {
                        obj.setEarthquakeDeductible1(Double.parseDouble(binding4.getearthquakedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getprofitslimit())) {
                        obj.setProfitLimit1(Double.parseDouble(binding4.getprofitslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getprofitsdeductible())) {
                        obj.setProfitDeductible1(Double.parseDouble(binding4.getprofitsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getgrossearningslimit())) {
                        obj.setGrossEarningLimit1(Double.parseDouble(binding4.getgrossearningslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getgrossearningsdeductible())) {
                        obj.setGrossEarningDeductible1(Double.parseDouble(binding4.getgrossearningsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getrentalincomelimit())) {
                        obj.setRentalIncomeLimit1(Double.parseDouble(binding4.getrentalincomelimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getrentalincomedeductible())) {
                        obj.setRentalIncomeDeductible1(Double.parseDouble(binding4.getrentalincomedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getextraexpenselimit())) {
                        obj.setExtraExpenseLimit1(Double.parseDouble(binding4.getextraexpenselimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getextraexpensedeductible())) {
                        obj.setExtraExpenseDeductible1(Double.parseDouble(binding4.getextraexpensedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                        obj.setOffPremisesPowerLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                        obj.setOffPremisesPowerDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidelimit())) {
                        obj.setInsideOutsideLimit1(Double.parseDouble(binding4.getinsideoutsidelimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidedeductible())) {
                        obj.setInsideOutsideDeductible1(Double.parseDouble(binding4.getinsideoutsidedeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getbfmoneylimit())) {
                        obj.setBfMoneyLimit1(Double.parseDouble(binding4.getbfmoneylimit()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getbfmoneydeductible())) {
                        obj.setBfMoneyDeductible1(Double.parseDouble(binding4.getbfmoneydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getforgerylimit())) {
                        obj.setDeopistorForgeryLimit1(Double.parseDouble(binding4.getforgerylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getforgerydeductible())) {
                        obj.setDeopistorForgeryDeductible1(Double.parseDouble(binding4.getforgerydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmoneyorderslimit())) {
                        obj.setMoneyOrdersLimit1(Double.parseDouble(binding4.getmoneyorderslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getmoneyordersdeductible())) {
                        obj.setMoneyOrdersDeductible1(Double.parseDouble(binding4.getmoneyordersdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdishonestylimit())) {
                        obj.setEmployDishonestyLimit1(Double.parseDouble(binding4.getdishonestylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdishonestydeductible())) {
                        obj.setEmployDishonestyDeductible1(Double.parseDouble(binding4.getdishonestydeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getcgllimit())) {
                        obj.setCglLimit1(Double.parseDouble(binding4.getcgllimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getcgldeductible())) {
                        obj.setCglDeductible1(Double.parseDouble(binding4.getcgldeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettenantslimit())) {
                        obj.setTenantsLegalLimit1(Double.parseDouble(binding4.gettenantslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.gettenantsdeductible())) {
                        obj.setTenantsLegalDeductible1(Double.parseDouble(binding4.gettenantsdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getnonownedlimit())) {
                        obj.setNonOwnedAutoLimit1(Double.parseDouble(binding4.getnonownedlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getnonowneddeductible())) {
                        obj.setNonOwnedAutoDeductible1(Double.parseDouble(binding4.getnonowneddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef96limit())) {
                        obj.setSef96Limit1(Double.parseDouble(binding4.getsef96limit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                        obj.setSef96Deductible1(Double.parseDouble(binding4.getsef96deductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94limit())) {
                        obj.setSef94Limit1(Double.parseDouble(binding4.getsef94limit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                        obj.setSef94Deductible1(Double.parseDouble(binding4.getsef94deductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdandlimit())) {
                        obj.setDoLimit1(Double.parseDouble(binding4.getdandlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getdanddeductible())) {
                        obj.setDoDeductible1(Double.parseDouble(binding4.getdanddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.geteandlimit())) {
                        obj.setEoLimit1(Double.parseDouble(binding4.geteandlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.geteanddeductible())) {
                        obj.setEoDeductible1(Double.parseDouble(binding4.geteanddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getemployerslimit())) {
                        obj.setEmployerLimit1(Double.parseDouble(binding4.getemployerslimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getemployersdeductible())) {
                        obj.setEmployerDeductible1(Double.parseDouble(binding4.getemployersdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getumbrellalimit())) {
                        obj.setUmbrellaLimit1(Double.parseDouble(binding4.getumbrellalimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getumbrelladeductible())) {
                        obj.setUmbrellaDeductible1(Double.parseDouble(binding4.getumbrelladeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getwrapuplimit())) {
                        obj.setWrapUpLimit1(Double.parseDouble(binding4.getwrapuplimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getwrapupdeductible())) {
                        obj.setWrapUpDeductible1(Double.parseDouble(binding4.getwrapupdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getstdlimit())) {
                        obj.setStdComprehensiveLimit1(Double.parseDouble(binding4.getstdlimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getstddeductible())) {
                        obj.setStdComprehensiveDeductible1(Double.parseDouble(binding4.getstddeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getaclimit())) {
                        obj.setAirConditioningLimit1(Double.parseDouble(binding4.getaclimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getacdeductible())) {
                        obj.setAirConditioningDeductible1(Double.parseDouble(binding4.getacdeductible()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerylimit())) {
                        obj.setProductionMachineryLimit1(Double.parseDouble(binding4.getproductionmachinerylimit()));
                    }

                    if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerydeductible())) {
                        obj.setProductionMachineryDeductible1(Double.parseDouble(binding4.getproductionmachinerydeductible()));
                    }

                    obj.setOthercoverage11(binding4.getothercoverage1());
                    obj.setOthercoverage21(binding4.getothercoverage2());
                    if (binding4.getothercoverage1limit() != null && !(binding4.getothercoverage1limit().trim().equals(""))) {
                        obj.setOtherCoverageLimit11(Double.parseDouble(binding4.getothercoverage1limit()));
                    }
                    if (binding4.getothercoverage1deductible() != null && !(binding4.getothercoverage1deductible().trim().equals(""))) {
                        obj.setOtherCoverageDeductible11(Double.parseDouble(binding4.getothercoverage1deductible()));
                    }
                    if (binding4.getothercoverage2limit() != null && !(binding4.getothercoverage2limit().trim().equals(""))) {
                        obj.setOtherCoverageLimit21(Double.parseDouble(binding4.getothercoverage2limit()));
                    }
                    if (binding4.getothercoverage2deductible() != null && !(binding4.getothercoverage2deductible().trim().equals(""))) {
                        obj.setOtherCoverageDeductible21(Double.parseDouble(binding4.getothercoverage2deductible()));
                    }
                    obj.setAdditionalCoverage1(binding4.getadditionalcoverage());
                    obj.setRoofupdated1(binding4.getroofupdated());
                    obj.setHeatingupdated1(binding4.getheatingupdated());
                    obj.setElectricalupdated1(binding4.getelectricalupdated());
                    obj.setElectricalamps1(binding4.getnoofamps());
                    obj.setFireProtectiondistance1(binding4.getdistance());
                    obj.setAddress1(binding4.getlocationaddress());
                    obj.setBasement1(binding4.getbasement());
                    obj.setOwner11(binding4.getmotortruckcargoowner());
                    obj.setTruckMan1(binding4.getmotortruckcargotruckman());
                    obj.setGrossEarning801(binding4.getgecheckbox());
                    obj.setWallsframe1(binding4.getwallsframe());
                    obj.setWallshcb1(binding4.getwallshcb());
                    obj.setWallssteel1(binding4.getwallssteel());
                    obj.setWallsbrick1(binding4.getwallsbrick());
                    obj.setRoofwood1(binding4.getwoodjoist());
                    obj.setRoofsteel1(binding4.getsteeldeck());
                    obj.setRoofconcrete1(binding4.getroofconcrete());
                    obj.setFloorsconcrete1(binding4.getfloorsconcrete());
                    obj.setFloorswood1(binding4.getfloorswood());
                    obj.setHeatinggas1(binding4.getfagas());
                    obj.setHeatingoil1(binding4.getfaoil());
                    obj.setHeatingelectric1(binding4.getheatingelectric());
                    obj.setHeatingother1(binding4.getheatingother());
                    obj.setElectricalbreakers1(binding4.getelectricalbreakers());
                    obj.setElectricalfuses1(binding4.getelectricalfuses());
                    obj.setElectricalamps1(binding4.getnoofamps());
                    obj.setPlumbingcopper1(binding4.getcopper());
                    obj.setPlumbingpvc1(binding4.getpvc());
                    obj.setPlumbingother1(binding4.getplumbingother());
                    obj.setFireProtection1(binding4.getFireProtection());
                    obj.setSecurity1(binding4.getSecurity());

                    if (!CommonValidations.isStringEmpty(binding4.getlocationage())) {
                        obj.setAge1(Integer.parseInt(binding4.getlocationage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.gettotsqfootage())) {
                        obj.setTotalSqFootage1(Double.parseDouble(binding4.gettotsqfootage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getinsidesqfootage())) {
                        obj.setInsdSqFootage1(Double.parseDouble(binding4.getinsidesqfootage()));
                    }
                    if (!CommonValidations.isStringEmpty(binding4.getnoofstories())) {
                        obj.setNoOfStories1(Integer.parseInt(binding4.getnoofstories()));
                    }
                    listAddInfo.add(obj);
                }
            } catch (Exception e) {
                System.out.println("Offset12 " + offset);
                AddAnotherInfo obj = new AddAnotherInfo();

                obj.setAddress1(binding4.getlocationaddress());

                if (!CommonValidations.isStringEmpty(binding4.getbuildinglimit())) {
                    obj.setBuildingLimit1(Double.parseDouble(binding4.getbuildinglimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getbuildingdeductible())) {
                    obj.setBuildingDeductible1(Double.parseDouble(binding4.getbuildingdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getcontentslimit())) {
                    obj.setContentsLimit1(Double.parseDouble(binding4.getcontentslimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getcontentsdeductible())) {
                    obj.setContentsDeductible1(Double.parseDouble(binding4.getcontentsdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getstocklimit())) {
                    obj.setStockLimit1(Double.parseDouble(binding4.getstocklimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getstockdeductible())) {
                    obj.setStockDeductible1(Double.parseDouble(binding4.getstockdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getofficelimit())) {
                    obj.setOfficeContentLimit1(Double.parseDouble(binding4.getofficelimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getofficedeductible())) {
                    obj.setOfficeContentDeductible1(Double.parseDouble(binding4.getofficedeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getedplimit())) {
                    obj.setEdpLimit1(Double.parseDouble(binding4.getedplimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getedpdeductible())) {
                    obj.setEdpDeductible1(Double.parseDouble(binding4.getedpdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getequipmentlimit())) {
                    obj.setEquipmentLimit1(Double.parseDouble(binding4.getequipmentlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getequipmentdeductible())) {
                    obj.setEquipmentDeductible1(Double.parseDouble(binding4.getequipmentdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                    obj.setOffPremisesLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                    obj.setOffPremisesDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.gettransitlimit())) {
                    obj.setTransitLimit1(Double.parseDouble(binding4.gettransitlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.gettransitdeductible())) {
                    obj.setTransitDeductible1(Double.parseDouble(binding4.gettransitdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmiscpropertylimit())) {
                    obj.setMiscPropertyLimit1(Double.parseDouble(binding4.getmiscpropertylimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmiscpropertydeductible())) {
                    obj.setMiscPropertyDeductible1(Double.parseDouble(binding4.getmiscpropertydeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentlimit())) {
                    obj.setContractorEquipmentLimit1(Double.parseDouble(binding4.getcontractorsequipmentlimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getcontractorsequipmentdeductible())) {
                    obj.setContractorEquipmentDeductible1(Double.parseDouble(binding4.getcontractorsequipmentdeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatorlimit())) {
                    obj.setInstallationFloaterLimit1(Double.parseDouble(binding4.getinstallationfloatorlimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getinstallationfloatordeductible())) {
                    obj.setInstallationFloaterDeductible1(Double.parseDouble(binding4.getinstallationfloatordeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.gettoolfloatorlimit())) {
                    obj.setToolFloaterLimit1(Double.parseDouble(binding4.gettoolfloatorlimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.gettoolfloatordeductible())) {
                    obj.setToolFloaterDeductible1(Double.parseDouble(binding4.gettoolfloatordeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getsignfloatorlimit())) {
                    obj.setSignFloaterLimit1(Double.parseDouble(binding4.getsignfloatorlimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getsignfloatordeductible())) {
                    obj.setSignFloaterDeductible1(Double.parseDouble(binding4.getsignfloatordeductible()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargolimit())) {
                    obj.setMotorTruckLimit1(Double.parseDouble(binding4.getmotortruckcargolimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmotortruckcargodeductible())) {
                    obj.setMotorTruckDeductible1(Double.parseDouble(binding4.getmotortruckcargodeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getglasslimit())) {
                    obj.setGlassLimit1(Double.parseDouble(binding4.getglasslimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getglassdeductible())) {
                    obj.setGlassDeductible1(Double.parseDouble(binding4.getglassdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsewerblackupdeductible())) {
                    obj.setSewerBackupDeductible1(Double.parseDouble(binding4.getsewerblackupdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getflooddeductible())) {
                    obj.setFloodDeductible1(Double.parseDouble(binding4.getflooddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getearthquakedeductible())) {
                    obj.setEarthquakeDeductible1(Double.parseDouble(binding4.getearthquakedeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getprofitslimit())) {
                    obj.setProfitLimit1(Double.parseDouble(binding4.getprofitslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getprofitsdeductible())) {
                    obj.setProfitDeductible1(Double.parseDouble(binding4.getprofitsdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getgrossearningslimit())) {
                    obj.setGrossEarningLimit1(Double.parseDouble(binding4.getgrossearningslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getgrossearningsdeductible())) {
                    obj.setGrossEarningDeductible1(Double.parseDouble(binding4.getgrossearningsdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getrentalincomelimit())) {
                    obj.setRentalIncomeLimit1(Double.parseDouble(binding4.getrentalincomelimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getrentalincomedeductible())) {
                    obj.setRentalIncomeDeductible1(Double.parseDouble(binding4.getrentalincomedeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getextraexpenselimit())) {
                    obj.setExtraExpenseLimit1(Double.parseDouble(binding4.getextraexpenselimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getextraexpensedeductible())) {
                    obj.setExtraExpenseDeductible1(Double.parseDouble(binding4.getextraexpensedeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getoffpremiseslimit())) {
                    obj.setOffPremisesPowerLimit1(Double.parseDouble(binding4.getoffpremiseslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getoffpremisesdeductible())) {
                    obj.setOffPremisesPowerDeductible1(Double.parseDouble(binding4.getoffpremisesdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidelimit())) {
                    obj.setInsideOutsideLimit1(Double.parseDouble(binding4.getinsideoutsidelimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getinsideoutsidedeductible())) {
                    obj.setInsideOutsideDeductible1(Double.parseDouble(binding4.getinsideoutsidedeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getbfmoneylimit())) {
                    obj.setBfMoneyLimit1(Double.parseDouble(binding4.getbfmoneylimit()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getbfmoneydeductible())) {
                    obj.setBfMoneyDeductible1(Double.parseDouble(binding4.getbfmoneydeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getforgerylimit())) {
                    obj.setDeopistorForgeryLimit1(Double.parseDouble(binding4.getforgerylimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getforgerydeductible())) {
                    obj.setDeopistorForgeryDeductible1(Double.parseDouble(binding4.getforgerydeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmoneyorderslimit())) {
                    obj.setMoneyOrdersLimit1(Double.parseDouble(binding4.getmoneyorderslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getmoneyordersdeductible())) {
                    obj.setMoneyOrdersDeductible1(Double.parseDouble(binding4.getmoneyordersdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getdishonestylimit())) {
                    obj.setEmployDishonestyLimit1(Double.parseDouble(binding4.getdishonestylimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getdishonestydeductible())) {
                    obj.setEmployDishonestyDeductible1(Double.parseDouble(binding4.getdishonestydeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getcgllimit())) {
                    obj.setCglLimit1(Double.parseDouble(binding4.getcgllimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getcgldeductible())) {
                    obj.setCglDeductible1(Double.parseDouble(binding4.getcgldeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.gettenantslimit())) {
                    obj.setTenantsLegalLimit1(Double.parseDouble(binding4.gettenantslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.gettenantsdeductible())) {
                    obj.setTenantsLegalDeductible1(Double.parseDouble(binding4.gettenantsdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getnonownedlimit())) {
                    obj.setNonOwnedAutoLimit1(Double.parseDouble(binding4.getnonownedlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getnonowneddeductible())) {
                    obj.setNonOwnedAutoDeductible1(Double.parseDouble(binding4.getnonowneddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsef96limit())) {
                    obj.setSef96Limit1(Double.parseDouble(binding4.getsef96limit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                    obj.setSef96Deductible1(Double.parseDouble(binding4.getsef96deductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsef94limit())) {
                    obj.setSef94Limit1(Double.parseDouble(binding4.getsef94limit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getsef94deductible())) {
                    obj.setSef94Deductible1(Double.parseDouble(binding4.getsef94deductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getdandlimit())) {
                    obj.setDoLimit1(Double.parseDouble(binding4.getdandlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getdanddeductible())) {
                    obj.setDoDeductible1(Double.parseDouble(binding4.getdanddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.geteandlimit())) {
                    obj.setEoLimit1(Double.parseDouble(binding4.geteandlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.geteanddeductible())) {
                    obj.setEoDeductible1(Double.parseDouble(binding4.geteanddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getemployerslimit())) {
                    obj.setEmployerLimit1(Double.parseDouble(binding4.getemployerslimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getemployersdeductible())) {
                    obj.setEmployerDeductible1(Double.parseDouble(binding4.getemployersdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getumbrellalimit())) {
                    obj.setUmbrellaLimit1(Double.parseDouble(binding4.getumbrellalimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getumbrelladeductible())) {
                    obj.setUmbrellaDeductible1(Double.parseDouble(binding4.getumbrelladeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getwrapuplimit())) {
                    obj.setWrapUpLimit1(Double.parseDouble(binding4.getwrapuplimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getwrapupdeductible())) {
                    obj.setWrapUpDeductible1(Double.parseDouble(binding4.getwrapupdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getstdlimit())) {
                    obj.setStdComprehensiveLimit1(Double.parseDouble(binding4.getstdlimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getstddeductible())) {
                    obj.setStdComprehensiveDeductible1(Double.parseDouble(binding4.getstddeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getaclimit())) {
                    obj.setAirConditioningLimit1(Double.parseDouble(binding4.getaclimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getacdeductible())) {
                    obj.setAirConditioningDeductible1(Double.parseDouble(binding4.getacdeductible()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerylimit())) {
                    obj.setProductionMachineryLimit1(Double.parseDouble(binding4.getproductionmachinerylimit()));
                }

                if (!CommonValidations.isStringEmpty(binding4.getproductionmachinerydeductible())) {
                    obj.setProductionMachineryDeductible1(Double.parseDouble(binding4.getproductionmachinerydeductible()));
                }

                obj.setOthercoverage11(binding4.getothercoverage1());
                obj.setOthercoverage21(binding4.getothercoverage2());
                if (binding4.getothercoverage1limit() != null && !(binding4.getothercoverage1limit().trim().equals(""))) {
                    obj.setOtherCoverageLimit11(Double.parseDouble(binding4.getothercoverage1limit()));
                }
                if (binding4.getothercoverage1deductible() != null && !(binding4.getothercoverage1deductible().trim().equals(""))) {
                    obj.setOtherCoverageDeductible11(Double.parseDouble(binding4.getothercoverage1deductible()));
                }
                if (binding4.getothercoverage2limit() != null && !(binding4.getothercoverage2limit().trim().equals(""))) {
                    obj.setOtherCoverageLimit21(Double.parseDouble(binding4.getothercoverage2limit()));
                }
                if (binding4.getothercoverage2deductible() != null && !(binding4.getothercoverage2deductible().trim().equals(""))) {
                    obj.setOtherCoverageDeductible21(Double.parseDouble(binding4.getothercoverage2deductible()));
                }
                obj.setAdditionalCoverage1(binding4.getadditionalcoverage());
                obj.setRoofupdated1(binding4.getroofupdated());
                obj.setHeatingupdated1(binding4.getheatingupdated());
                obj.setElectricalupdated1(binding4.getelectricalupdated());
                obj.setElectricalamps1(binding4.getnoofamps());
                obj.setFireProtectiondistance1(binding4.getdistance());
                obj.setAddress1(binding4.getlocationaddress());
                obj.setBasement1(binding4.getbasement());
                obj.setOwner11(binding4.getmotortruckcargoowner());
                obj.setTruckMan1(binding4.getmotortruckcargotruckman());
                obj.setGrossEarning801(binding4.getgecheckbox());
                obj.setWallsframe1(binding4.getwallsframe());
                obj.setWallshcb1(binding4.getwallshcb());
                obj.setWallssteel1(binding4.getwallssteel());
                obj.setWallsbrick1(binding4.getwallsbrick());
                obj.setRoofwood1(binding4.getwoodjoist());
                obj.setRoofsteel1(binding4.getsteeldeck());
                obj.setRoofconcrete1(binding4.getroofconcrete());
                obj.setFloorsconcrete1(binding4.getfloorsconcrete());
                obj.setFloorswood1(binding4.getfloorswood());
                obj.setHeatinggas1(binding4.getfagas());
                obj.setHeatingoil1(binding4.getfaoil());
                obj.setHeatingelectric1(binding4.getheatingelectric());
                obj.setHeatingother1(binding4.getheatingother());
                obj.setElectricalbreakers1(binding4.getelectricalbreakers());
                obj.setElectricalfuses1(binding4.getelectricalfuses());
                obj.setElectricalamps1(binding4.getnoofamps());
                obj.setPlumbingcopper1(binding4.getcopper());
                obj.setPlumbingpvc1(binding4.getpvc());
                obj.setPlumbingother1(binding4.getplumbingother());
                obj.setFireProtection1(binding4.getFireProtection());
                obj.setSecurity1(binding4.getSecurity());

                if (!CommonValidations.isStringEmpty(binding4.getlocationage())) {
                    obj.setAge1(Integer.parseInt(binding4.getlocationage()));
                }
                if (!CommonValidations.isStringEmpty(binding4.gettotsqfootage())) {
                    obj.setTotalSqFootage1(Double.parseDouble(binding4.gettotsqfootage()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getinsidesqfootage())) {
                    obj.setInsdSqFootage1(Double.parseDouble(binding4.getinsidesqfootage()));
                }
                if (!CommonValidations.isStringEmpty(binding4.getnoofstories())) {
                    obj.setNoOfStories1(Integer.parseInt(binding4.getnoofstories()));
                }
                listAddInfo.add(obj);
            }
            offset--;
            if (offset <= 0) {
                offset = 0;
            }
            System.out.println("Offset13 " + offset);
            try {

                System.out.println(listAddInfo.get(offset).getAddress1());
                if (listAddInfo.get(offset) != null) {
                    System.out.println("Offset14 " + offset);
                    // Previous
                    binding4.setlocationaddress(listAddInfo.get(offset).getAddress1());

                    if (listAddInfo.get(offset).getAge1() > 0) {
                        binding4.setlocationage(Integer.toString(listAddInfo.get(offset).getAge1()));
                    }
                    if (listAddInfo.get(offset).getTotalSqFootage1() > 0) {
                        binding4.settotsqfootage(String.valueOf(listAddInfo.get(offset).getTotalSqFootage1()));
                    }
                    if (listAddInfo.get(offset).getInsdSqFootage1() > 0) {
                        binding4.setinsidesqfootage(String.valueOf(listAddInfo.get(offset).getInsdSqFootage1()));
                    }
                    if (listAddInfo.get(offset).getNoOfStories1() > 0) {
                        binding4.setnoofstories(String.valueOf(listAddInfo.get(offset).getNoOfStories1()));
                    }
                    if ("selected".equals(listAddInfo.get(offset).getTruckMan1())) {
                        mtctruckman.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getOwner11())) {
                        mtcowner.setSelected(true);
                    }
                    if ("selected80".equals(listAddInfo.get(offset).getGrossEarning801())) {
                        ge80.setSelected(true);
                    }
                    if ("selected50".equals(listAddInfo.get(offset).getGrossEarning801())) {
                        ge50.setSelected(true);
                    }

                    if ("selected".equals(listAddInfo.get(offset).getWallsframe1())) {
                        wallsframe.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getWallshcb1())) {
                        wallshcb.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getWallssteel1())) {
                        wallssteel.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getWallsbrick1())) {
                        wallsbrick.setSelected(true);
                    }

                    if ("selected".equals(listAddInfo.get(offset).getRoofwood1())) {
                        woodjoist.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getRoofsteel1())) {
                        steeldeck.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getRoofconcrete1())) {
                        roofconcrete.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getFloorsconcrete1())) {
                        floorsconcrete.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getFloorswood1())) {
                        floorswood.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getHeatinggas1())) {
                        fagas.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getHeatingoil1())) {
                        faoil.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getHeatingelectric1())) {
                        heatingelectric.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getHeatingother1())) {
                        heatingother.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getElectricalbreakers1())) {
                        electricalbreakers.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getElectricalfuses1())) {
                        electricalfuses.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getPlumbingcopper1())) {
                        copper.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getPlumbingpvc1())) {
                        pvc.setSelected(true);
                    }
                    if ("selected".equals(listAddInfo.get(offset).getPlumbingother1())) {
                        plumbingother.setSelected(true);
                    }
                    if ("Sprinklers".equals(listAddInfo.get(offset).getFireProtection1())) {
                        sprinklers.setSelected(true);
                    }
                    if ("SVC".equals(listAddInfo.get(offset).getFireProtection1())) {
                        svccontract.setSelected(true);
                    }
                    if ("Hydrant".equals(listAddInfo.get(offset).getFireProtection1())) {
                        hydrant.setSelected(true);
                    }
                    if ("Firehall".equals(listAddInfo.get(offset).getFireProtection1())) {
                        firehall.setSelected(true);
                    }
                    if ("Unprotected".equals(listAddInfo.get(offset).getFireProtection1())) {
                        unprotected.setSelected(true);
                    }
                    if ("Alarm System".equals(listAddInfo.get(offset).getSecurity1())) {
                        alarmsystem.setSelected(true);
                    }
                    if ("Central Monitored".equals(listAddInfo.get(offset).getSecurity1())) {
                        centralmonitored.setSelected(true);
                    }
                    if ("Window Bars".equals(listAddInfo.get(offset).getSecurity1())) {
                        windowbars.setSelected(true);
                    }
                    if ("Dead Bolts".equals(listAddInfo.get(offset).getSecurity1())) {
                        deadbolts.setSelected(true);
                    }
                    if ("Select".equals(listAddInfo.get(offset).getBasement1())) {
                        basement.getSelectionModel().select("Select");
                    } else if ("Yes".equals(listAddInfo.get(offset).getBasement1())) {
                        basement.getSelectionModel().select("Yes");
                    } else if ("No".equals(listAddInfo.get(offset).getBasement1())) {
                        basement.getSelectionModel().select("No");
                    }
                    if (listAddInfo.get(offset).getBuildingLimit1() > 0) {
                        binding4.setbuildinglimit(String.valueOf(listAddInfo.get(offset).getBuildingLimit1()));
                    }
                    if (listAddInfo.get(offset).getBuildingDeductible1() > 0) {
                        binding4.setbuildingdeductible(String.valueOf(listAddInfo.get(offset).getBuildingDeductible1()));
                    }
                    if (listAddInfo.get(offset).getContentsLimit1() > 0) {
                        binding4.setcontentslimit(String.valueOf(listAddInfo.get(offset).getContentsLimit1()));
                    }
                    if (listAddInfo.get(offset).getContentsDeductible1() > 0) {
                        binding4.setcontentsdeductible(String.valueOf(listAddInfo.get(offset).getContentsDeductible1()));
                    }
                    if (listAddInfo.get(offset).getContentsLimit1() > 0) {
                        binding4.setstocklimit(String.valueOf(listAddInfo.get(offset).getStockLimit1()));
                    }
                    if (listAddInfo.get(offset).getStockDeductible1() > 0) {
                        binding4.setstockdeductible(String.valueOf(listAddInfo.get(offset).getStockDeductible1()));
                    }
                    if (listAddInfo.get(offset).getOfficeContentLimit1() > 0) {
                        binding4.setofficelimit(String.valueOf(listAddInfo.get(offset).getOfficeContentLimit1()));
                    }
                    if (listAddInfo.get(offset).getOfficeContentDeductible1() > 0) {
                        binding4.setofficedeductible(String.valueOf(listAddInfo.get(offset).getOfficeContentDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEdpLimit1() > 0) {
                        binding4.setedplimit(String.valueOf(listAddInfo.get(offset).getEdpLimit1()));
                    }
                    if (listAddInfo.get(offset).getEdpDeductible1() > 0) {
                        binding4.setedpdeductible(String.valueOf(listAddInfo.get(offset).getEdpDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEquipmentLimit1() > 0) {
                        binding4.setequipmentlimit(String.valueOf(listAddInfo.get(offset).getEquipmentLimit1()));
                    }
                    if (listAddInfo.get(offset).getEquipmentDeductible1() > 0) {
                        binding4.setequipmentdeductible(String.valueOf(listAddInfo.get(offset).getEquipmentDeductible1()));
                    }
                    if (listAddInfo.get(offset).getOffPremisesLimit1() > 0) {
                        binding4.setoffpremiseslimit(String.valueOf(listAddInfo.get(offset).getOffPremisesLimit1()));
                    }
                    if (listAddInfo.get(offset).getOffPremisesDeductible1() > 0) {
                        binding4.setoffpremisesdeductible(String.valueOf(listAddInfo.get(offset).getOffPremisesDeductible1()));
                    }
                    if (listAddInfo.get(offset).getTransitLimit1() > 0) {
                        binding4.settransitlimit(String.valueOf(listAddInfo.get(offset).getTransitLimit1()));
                    }
                    if (listAddInfo.get(offset).getTransitDeductible1() > 0) {
                        binding4.settransitdeductible(String.valueOf(listAddInfo.get(offset).getTransitDeductible1()));
                    }
                    if (listAddInfo.get(offset).getMiscPropertyLimit1() > 0) {
                        binding4.setmiscpropertylimit(String.valueOf(listAddInfo.get(offset).getMiscPropertyLimit1()));
                    }
                    if (listAddInfo.get(offset).getMiscPropertyDeductible1() > 0) {
                        binding4.setmiscpropertydeductible(String.valueOf(listAddInfo.get(offset).getMiscPropertyDeductible1()));
                    }
                    if (listAddInfo.get(offset).getContractorEquipmentLimit1() > 0) {
                        binding4.setcontractorsequipmentlimit(String.valueOf(listAddInfo.get(offset).getContractorEquipmentLimit1()));
                    }
                    if (listAddInfo.get(offset).getContractorEquipmentDeductible1() > 0) {
                        binding4.setcontractorsequipmentdeductible(String.valueOf(listAddInfo.get(offset).getContractorEquipmentDeductible1()));
                    }
                    if (listAddInfo.get(offset).getInstallationFloaterLimit1() > 0) {
                        binding4.setcontentslimit(String.valueOf(listAddInfo.get(offset).getInstallationFloaterLimit1()));
                    }
                    if (listAddInfo.get(offset).getInstallationFloaterDeductible1() > 0) {
                        binding4.setinstallationfloatordeductible(String.valueOf(listAddInfo.get(offset).getInstallationFloaterDeductible1()));
                    }
                    if (listAddInfo.get(offset).getToolFloaterLimit1() > 0) {
                        binding4.settoolfloatorlimit(String.valueOf(listAddInfo.get(offset).getToolFloaterLimit1()));
                    }
                    if (listAddInfo.get(offset).getToolFloaterDeductible1() > 0) {
                        binding4.settoolfloatordeductible(String.valueOf(listAddInfo.get(offset).getToolFloaterDeductible1()));
                    }
                    if (listAddInfo.get(offset).getSignFloaterLimit1() > 0) {
                        binding4.setsignfloatorlimit(String.valueOf(listAddInfo.get(offset).getSignFloaterLimit1()));
                    }
                    if (listAddInfo.get(offset).getSignFloaterDeductible1() > 0) {
                        binding4.setsignfloatordeductible(String.valueOf(listAddInfo.get(offset).getSignFloaterDeductible1()));
                    }
                    if (listAddInfo.get(offset).getMotorTruckLimit1() > 0) {
                        binding4.setmotortruckcargolimit(String.valueOf(listAddInfo.get(offset).getMotorTruckLimit1()));
                    }
                    if (listAddInfo.get(offset).getMotorTruckDeductible1() > 0) {
                        binding4.setmotortruckcargodeductible(String.valueOf(listAddInfo.get(offset).getMotorTruckDeductible1()));
                    }
                    if (listAddInfo.get(offset).getGlassLimit1() > 0) {
                        binding4.setglasslimit(String.valueOf(listAddInfo.get(offset).getGlassLimit1()));
                    }
                    if (listAddInfo.get(offset).getGlassDeductible1() > 0) {
                        binding4.setglassdeductible(String.valueOf(listAddInfo.get(offset).getGlassDeductible1()));
                    }
                    if (listAddInfo.get(offset).getSewerBackupDeductible1() > 0) {
                        binding4.setsewerblackupdeductible(String.valueOf(listAddInfo.get(offset).getSewerBackupDeductible1()));
                    }
                    if (listAddInfo.get(offset).getFloodDeductible1() > 0) {
                        binding4.setflooddeductible(String.valueOf(listAddInfo.get(offset).getFloodDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEarthquakeDeductible1() > 0) {
                        binding4.setearthquakedeductible(String.valueOf(listAddInfo.get(offset).getEarthquakeDeductible1()));
                    }
                    if (listAddInfo.get(offset).getProfitLimit1() > 0) {
                        binding4.setprofitslimit(String.valueOf(listAddInfo.get(offset).getProfitLimit1()));
                    }
                    if (listAddInfo.get(offset).getProfitDeductible1() > 0) {
                        binding4.setprofitsdeductible(String.valueOf(listAddInfo.get(offset).getProfitDeductible1()));
                    }
                    if (listAddInfo.get(offset).getGrossEarningLimit1() > 0) {
                        binding4.setgrossearningslimit(String.valueOf(listAddInfo.get(offset).getGrossEarningLimit1()));
                    }
                    if (listAddInfo.get(offset).getToolFloaterDeductible1() > 0) {
                        binding4.setgrossearningsdeductible(String.valueOf(listAddInfo.get(offset).getGrossEarningDeductible1()));
                    }
                    if (listAddInfo.get(offset).getRentalIncomeLimit1() > 0) {
                        binding4.setrentalincomelimit(String.valueOf(listAddInfo.get(offset).getRentalIncomeLimit1()));
                    }
                    if (listAddInfo.get(offset).getRentalIncomeDeductible1() > 0) {
                        binding4.setrentalincomedeductible(String.valueOf(listAddInfo.get(offset).getRentalIncomeDeductible1()));
                    }
                    if (listAddInfo.get(offset).getExtraExpenseLimit1() > 0) {
                        binding4.setextraexpenselimit(String.valueOf(listAddInfo.get(offset).getExtraExpenseLimit1()));
                    }
                    if (listAddInfo.get(offset).getExtraExpenseDeductible1() > 0) {
                        binding4.setextraexpensedeductible(String.valueOf(listAddInfo.get(offset).getExtraExpenseDeductible1()));
                    }
                    if (listAddInfo.get(offset).getOffPremisesLimit1() > 0) {
                        binding4.setoffpremiseslimit(String.valueOf(listAddInfo.get(offset).getOffPremisesLimit1()));
                    }
                    if (listAddInfo.get(offset).getOffPremisesDeductible1() > 0) {
                        binding4.setoffpremisesdeductible(String.valueOf(listAddInfo.get(offset).getOffPremisesDeductible1()));
                    }
                    if (listAddInfo.get(offset).getInsideOutsideLimit1() > 0) {
                        binding4.setinsideoutsidelimit(String.valueOf(listAddInfo.get(offset).getInsideOutsideLimit1()));
                    }
                    if (listAddInfo.get(offset).getInsideOutsideDeductible1() > 0) {
                        binding4.setinsideoutsidedeductible(String.valueOf(listAddInfo.get(offset).getInsideOutsideDeductible1()));
                    }
                    if (listAddInfo.get(offset).getBfMoneyLimit1() > 0) {
                        binding4.setbfmoneylimit(String.valueOf(listAddInfo.get(offset).getBfMoneyLimit1()));
                    }
                    if (listAddInfo.get(offset).getBfMoneyDeductible1() > 0) {
                        binding4.setbfmoneydeductible(String.valueOf(listAddInfo.get(offset).getBfMoneyDeductible1()));
                    }
                    if (listAddInfo.get(offset).getDeopistorForgeryLimit1() > 0) {
                        binding4.setforgerylimit(String.valueOf(listAddInfo.get(offset).getDeopistorForgeryLimit1()));
                    }
                    if (listAddInfo.get(offset).getDeopistorForgeryDeductible1() > 0) {
                        binding4.setforgerydeductible(String.valueOf(listAddInfo.get(offset).getDeopistorForgeryDeductible1()));
                    }
                    if (listAddInfo.get(offset).getMoneyOrdersLimit1() > 0) {
                        binding4.setmoneyorderslimit(String.valueOf(listAddInfo.get(offset).getMoneyOrdersLimit1()));
                    }
                    if (listAddInfo.get(offset).getMoneyOrdersDeductible1() > 0) {
                        binding4.setmoneyordersdeductible(String.valueOf(listAddInfo.get(offset).getMoneyOrdersDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEmployDishonestyLimit1() > 0) {
                        binding4.setdishonestylimit(String.valueOf(listAddInfo.get(offset).getEmployDishonestyLimit1()));
                    }
                    if (listAddInfo.get(offset).getEmployDishonestyDeductible1() > 0) {
                        binding4.setdishonestydeductible(String.valueOf(listAddInfo.get(offset).getEmployDishonestyDeductible1()));
                    }
                    if (listAddInfo.get(offset).getCglLimit1() > 0) {
                        binding4.setcgllimit(String.valueOf(listAddInfo.get(offset).getCglLimit1()));
                    }
                    if (listAddInfo.get(offset).getCglDeductible1() > 0) {
                        binding4.setcgldeductible(String.valueOf(listAddInfo.get(offset).getCglDeductible1()));
                    }
                    if (listAddInfo.get(offset).getTenantsLegalLimit1() > 0) {
                        binding4.settenantslimit(String.valueOf(listAddInfo.get(offset).getTenantsLegalLimit1()));
                    }
                    if (listAddInfo.get(offset).getTenantsLegalDeductible1() > 0) {
                        binding4.settenantsdeductible(String.valueOf(listAddInfo.get(offset).getTenantsLegalDeductible1()));
                    }
                    if (listAddInfo.get(offset).getNonOwnedAutoLimit1() > 0) {
                        binding4.setnonownedlimit(String.valueOf(listAddInfo.get(offset).getNonOwnedAutoLimit1()));
                    }
                    if (listAddInfo.get(offset).getNonOwnedAutoDeductible1() > 0) {
                        binding4.setnonowneddeductible(String.valueOf(listAddInfo.get(offset).getNonOwnedAutoDeductible1()));
                    }
                    if (listAddInfo.get(offset).getSef94Limit1() > 0) {
                        binding4.setsef94limit(String.valueOf(listAddInfo.get(offset).getSef94Limit1()));
                    }
                    if (listAddInfo.get(offset).getSef96Limit1() > 0) {
                        binding4.setsef96limit(String.valueOf(listAddInfo.get(offset).getSef96Limit1()));
                    }
                    if (listAddInfo.get(offset).getSef94Deductible1() > 0) {
                        binding4.setsef94deductible(String.valueOf(listAddInfo.get(offset).getSef94Deductible1()));
                    }
                    if (listAddInfo.get(offset).getSef96Deductible1() > 0) {
                        binding4.setsef96deductible(String.valueOf(listAddInfo.get(offset).getSef96Deductible1()));
                    }
                    if (listAddInfo.get(offset).getDoLimit1() > 0) {
                        binding4.setdandlimit(String.valueOf(listAddInfo.get(offset).getDoLimit1()));
                    }
                    if (listAddInfo.get(offset).getDoDeductible1() > 0) {
                        binding4.setdanddeductible(String.valueOf(listAddInfo.get(offset).getDoDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEoLimit1() > 0) {
                        binding4.seteandlimit(String.valueOf(listAddInfo.get(offset).getEoLimit1()));
                    }
                    if (listAddInfo.get(offset).getEoDeductible1() > 0) {
                        binding4.seteanddeductible(String.valueOf(listAddInfo.get(offset).getEoDeductible1()));
                    }
                    if (listAddInfo.get(offset).getEmployerLimit1() > 0) {
                        binding4.setemployerslimit(String.valueOf(listAddInfo.get(offset).getEmployerLimit1()));
                    }
                    if (listAddInfo.get(offset).getEmployerDeductible1() > 0) {
                        binding4.setemployersdeductible(String.valueOf(listAddInfo.get(offset).getEmployerDeductible1()));
                    }
                    if (listAddInfo.get(offset).getUmbrellaLimit1() > 0) {
                        binding4.setumbrellalimit(String.valueOf(listAddInfo.get(offset).getUmbrellaLimit1()));
                    }
                    if (listAddInfo.get(offset).getUmbrellaDeductible1() > 0) {
                        binding4.setumbrelladeductible(String.valueOf(listAddInfo.get(offset).getUmbrellaDeductible1()));
                    }
                    if (listAddInfo.get(offset).getWrapUpLimit1() > 0) {
                        binding4.setwrapuplimit(String.valueOf(listAddInfo.get(offset).getWrapUpLimit1()));
                    }
                    if (listAddInfo.get(offset).getWrapUpDeductible1() > 0) {
                        binding4.setwrapupdeductible(String.valueOf(listAddInfo.get(offset).getWrapUpDeductible1()));
                    }
                    if (listAddInfo.get(offset).getStdComprehensiveLimit1() > 0) {
                        binding4.setstdlimit(String.valueOf(listAddInfo.get(offset).getStdComprehensiveLimit1()));
                    }
                    if (listAddInfo.get(offset).getStdComprehensiveDeductible1() > 0) {
                        binding4.setstddeductible(String.valueOf(listAddInfo.get(offset).getStdComprehensiveDeductible1()));
                    }
                    if (listAddInfo.get(offset).getAirConditioningLimit1() > 0) {
                        binding4.setaclimit(String.valueOf(listAddInfo.get(offset).getAirConditioningLimit1()));
                    }
                    if (listAddInfo.get(offset).getAirConditioningDeductible1() > 0) {
                        binding4.setacdeductible(String.valueOf(listAddInfo.get(offset).getAirConditioningDeductible1()));
                    }
                    if (listAddInfo.get(offset).getProductionMachineryLimit1() > 0) {
                        binding4.setproductionmachinerylimit(String.valueOf(listAddInfo.get(offset).getProductionMachineryLimit1()));
                    }
                    if (listAddInfo.get(offset).getProductionMachineryDeductible1() > 0) {
                        binding4.setproductionmachinerydeductible(String.valueOf(listAddInfo.get(offset).getProductionMachineryDeductible1()));
                    }
                    binding4.setothercoverage1(listAddInfo.get(offset).getOthercoverage11());
                    binding4.setothercoverage2(listAddInfo.get(offset).getOthercoverage21());
                    if (listAddInfo.get(offset).getOtherCoverageLimit11() > 0) {
                        binding4.setothercoverage1limit(String.valueOf(listAddInfo.get(offset).getOtherCoverageLimit11()));
                    }
                    if (listAddInfo.get(offset).getOtherCoverageDeductible11() > 0) {
                        binding4.setothercoverage1deductible(String.valueOf(listAddInfo.get(offset).getOtherCoverageDeductible11()));
                    }
                    if (listAddInfo.get(offset).getOtherCoverageLimit21() > 0) {
                        binding4.setothercoverage2limit(String.valueOf(listAddInfo.get(offset).getOtherCoverageLimit21()));
                    }
                    if (listAddInfo.get(offset).getOtherCoverageDeductible21() > 0) {
                        binding4.setothercoverage2deductible(String.valueOf(listAddInfo.get(offset).getOtherCoverageDeductible21()));
                    }
                    binding4.setadditionalcoverage(listAddInfo.get(offset).getAdditionalCoverage1());

                } else {
                    System.out.println("Offset15 " + offset);
                    binding4.setlocationaddress("");
                    binding4.setlocationage("");
                    binding4.settotsqfootage("");
                    binding4.setinsidesqfootage("");
                    binding4.setnoofstories("");
                    basement.getSelectionModel().selectFirst();
                    wallsframe.setSelected(false);
                    wallsbrick.setSelected(false);
                    wallshcb.setSelected(false);
                    wallssteel.setSelected(false);
                    woodjoist.setSelected(false);
                    steeldeck.setSelected(false);
                    roofconcrete.setSelected(false);
                    binding4.setroofupdated("");
                    floorsconcrete.setSelected(false);
                    floorswood.setSelected(false);
                    fagas.setSelected(false);
                    faoil.setSelected(false);
                    heatingelectric.setSelected(false);
                    heatingother.setSelected(false);
                    binding4.setheatingupdated("");
                    electricalbreakers.setSelected(false);
                    electricalfuses.setSelected(false);
                    binding4.setelectricalupdated("");
                    binding4.setnoofamps("");
                    copper.setSelected(false);
                    copper.setSelected(false);
                    pvc.setSelected(false);
                    plumbingother.setSelected(false);
                    binding4.setplumbingupdated("");
                    sprinklers.setSelected(false);
                    svccontract.setSelected(false);
                    hydrant.setSelected(false);
                    firehall.setSelected(false);
                    unprotected.setSelected(false);
                    binding4.setFireProtection("");
                    alarmsystem.setSelected(false);
                    centralmonitored.setSelected(false);
                    windowbars.setSelected(false);
                    deadbolts.setSelected(false);

                }
            } catch (Exception e) {
                System.out.println("Offset16 " + offset);
                binding4.setlocationaddress("");
                binding4.setlocationage("");
                binding4.settotsqfootage("");
                binding4.setinsidesqfootage("");
                binding4.setnoofstories("");
                basement.getSelectionModel().selectFirst();
                wallsframe.setSelected(false);
                wallsbrick.setSelected(false);
                wallshcb.setSelected(false);
                wallssteel.setSelected(false);
                woodjoist.setSelected(false);
                steeldeck.setSelected(false);
                roofconcrete.setSelected(false);
                binding4.setroofupdated("");
                floorsconcrete.setSelected(false);
                floorswood.setSelected(false);
                fagas.setSelected(false);
                faoil.setSelected(false);
                heatingelectric.setSelected(false);
                heatingother.setSelected(false);
                binding4.setheatingupdated("");
                electricalbreakers.setSelected(false);
                electricalfuses.setSelected(false);
                binding4.setelectricalupdated("");
                binding4.setnoofamps("");
                copper.setSelected(false);
                copper.setSelected(false);
                pvc.setSelected(false);
                plumbingother.setSelected(false);
                binding4.setplumbingupdated("");
                sprinklers.setSelected(false);
                svccontract.setSelected(false);
                hydrant.setSelected(false);
                firehall.setSelected(false);
                unprotected.setSelected(false);
                binding4.setFireProtection("");
                alarmsystem.setSelected(false);
                centralmonitored.setSelected(false);
                windowbars.setSelected(false);
                deadbolts.setSelected(false);
            }
        }
        for (AddAnotherInfo e : listAddInfo) {
            System.out.println("prev list" + e.getAddress1());

        }
    }

    @FXML
    public void cadsales() {
        int cad = 0;
        int us = 0;
        if ("US$".equals(currency1.getSelectionModel().getSelectedItem())) {
            if (!CommonValidations.isStringEmpty(binding2.getamount1())) {
                us += Integer.parseInt(binding2.getamount1());
            }
        }
        if ("US$".equals(currency2.getSelectionModel().getSelectedItem())) {
            if (!CommonValidations.isStringEmpty(binding2.getamount2())) {
                us += Integer.parseInt(binding2.getamount2());
            }
        }
        if ("US$".equals(currency3.getSelectionModel().getSelectedItem())) {
            if (!CommonValidations.isStringEmpty(binding2.getamount3())) {
                us += Integer.parseInt(binding2.getamount3());
            }
        }
        if ("US$".equals(currency4.getSelectionModel().getSelectedItem())) {
            if (!CommonValidations.isStringEmpty(binding2.getamount4())) {
                us += Integer.parseInt(binding2.getamount4());
            }
        }
        if ("CAN$".equals(currency1.getSelectionModel().getSelectedItem())) {
            if (!CommonValidations.isStringEmpty(binding2.getamount1())) {
                cad += Integer.parseInt(binding2.getamount1());
            }
        }
        if ("CAN$".equals(currency2.getSelectionModel().getSelectedItem())) {
            if (!CommonValidations.isStringEmpty(binding2.getamount2())) {
                cad += Integer.parseInt(binding2.getamount2());
            }
        }
        if ("CAN$".equals(currency3.getSelectionModel().getSelectedItem())) {
            if (!CommonValidations.isStringEmpty(binding2.getamount3())) {
                cad += Integer.parseInt(binding2.getamount3());
            }
        }
        if ("CAN$".equals(currency4.getSelectionModel().getSelectedItem())) {
            if (!CommonValidations.isStringEmpty(binding2.getamount4())) {
                cad += Integer.parseInt(binding2.getamount4());
            }
        }
        totalsale.setText(Integer.toString(cad));
        totalsaleus.setText(Integer.toString(us));
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
    public void submitSave() throws DatatypeConfigurationException {
        if (producerid != null) {
            LocalFormResponse r = new LocalFormResponse();
            r.setProducer(producerid);
            r.setBranch(branch);
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(Calendar.getInstance().getTime());
            r.setCreationDate(date);
            r.setKeyContact(binding.getKeyContact());
            r.setKeyContactEmailAddress(binding.getKeyEmail());
            r.setKeyContactPhone(binding.getKeyPhone());
            r.setSecondayContact(binding.getSecondaryContact());
            r.setSecondayContactEmailAddress(binding.getSecondaryEmail());
            r.setSecondayContactPhone(binding.getSecondaryPhone());
            r.setBusinessName(binding.getBusinessName());
            r.setMailingAddress(binding.getMailingAddress());
            r.setFax(binding.getFax());
            r.setWebSiteURL(binding.getWebsite());
            r.setOtherSpecify(binding.getOtherSpecify());
            r.setRelatedExperience(binding.getRelatedExperience());
            r.setOwner1(binding.getOwner1());
            r.setOwner2(binding.getOwner2());
            r.setOwner3(binding.getOwner3());
            r.setOwner4(binding.getOwner4());
            r.setBoardOfDirector1(binding.getBod1());
            r.setBoardOfDirector2(binding.getBod2());
            r.setBoardOfDirector3(binding.getBod3());
            r.setBoardOfDirector4(binding.getBod4());

            if (!CommonValidations.isStringEmpty(binding.getNoOfLocations())) {
                r.setNumberOfLocations(Integer.parseInt(binding.getNoOfLocations()));
            }
            if (!CommonValidations.isStringEmpty(binding.getNoOfOwnedAutos())) {
                r.setNumberOfOwnedAutos(Integer.parseInt(binding.getNoOfOwnedAutos()));
            }
            if (!CommonValidations.isStringEmpty(binding.getYears())) {
                r.setYearInBusiness(Integer.parseInt(binding.getYears()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getNoofStaff())) {
                r.setNoOfStaff(Integer.parseInt(binding2.getNoofStaff()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getpayroll())) {
                r.setPayRoll(Double.parseDouble(binding2.getpayroll()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getamount1())) {
                r.setAmount1(Double.parseDouble(binding2.getamount1()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getamount2())) {
                r.setAmount2(Double.parseDouble(binding2.getamount2()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getamount3())) {
                r.setAmount3(Double.parseDouble(binding2.getamount3()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getamount4())) {
                r.setAmount4(Double.parseDouble(binding2.getamount4()));
            }
            r.setDescriptionOfOperationsAndRevenue1(binding2.getdescriptionOfOpAndRev1());
            r.setDescriptionOfOperationsAndRevenue2(binding2.getdescriptionOfOpAndRev2());
            r.setDescriptionOfOperationsAndRevenue3(binding2.getdescriptionOfOpAndRev3());
            r.setDescriptionOfOperationsAndRevenue4(binding2.getdescriptionOfOpAndRev4());
            if (!CommonValidations.isStringEmpty(binding2.gettotalSale())) {
                r.setTotalSale(Double.parseDouble(binding2.gettotalSale()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getperOfUsSales())) {
                r.setPercentageOfUSSales(Double.parseDouble(binding2.getperOfUsSales()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getperOfOnPremises())) {
                r.setOnpremises(Integer.parseInt(binding2.getperOfOnPremises()));
            }

            if (!CommonValidations.isStringEmpty(binding2.getperOfOffPremises())) {
                r.setOffpremises(Integer.parseInt(binding2.getperOfOffPremises()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getperOfResidential())) {
                r.setResidential(Integer.parseInt(binding2.getperOfResidential()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getperOfCommercial())) {
                r.setCommercial(Integer.parseInt(binding2.getperOfCommercial()));
            }
            if (!CommonValidations.isStringEmpty(binding2.getperOfSubContracted())) {
                r.setSubcontracted(Integer.parseInt(binding2.getperOfSubContracted()));
            }
            r.setLargestCustomerOrProject1(binding2.getlargestCustomerOrProject1());
            r.setLargestCustomerOrProject2(binding2.getlargestCustomerOrProject2());
            r.setLargestCustomerOrProject3(binding2.getlargestCustomerOrProject3());
            r.setLargestCustomerOrProject4(binding2.getlargestCustomerOrProject4());
            r.setLargestSuppliers1(binding2.getlargestSuppliers1());
            r.setLargestSuppliers2(binding2.getlargestSuppliers2());
            r.setLargestSuppliers3(binding2.getlargestSuppliers3());
            r.setLargestSuppliers4(binding2.getlargestSuppliers4());
            r.setFutureOpportunitiesOrPlanOfGrowth(binding3.getfutureopportunity());
            r.setDescribeCompetition(binding3.getdescribecompetition());
            r.setBusinessAsset(binding3.getbusinessapart());
            r.setAdvertising(binding3.getadvertising());
            r.setDurationIncaseOfSeriousClaims(binding3.getrecover());

            r.setPastClaimCause1(binding3.getclaimcause1());
            r.setPastClaimCause2(binding3.getclaimcause2());
            r.setPastClaimCause3(binding3.getclaimcause3());

            if (!CommonValidations.isStringEmpty(binding3.getclaimamount1())) {
                r.setPastClaimAmount1(Double.parseDouble(binding3.getclaimamount1()));
            }
            if (!CommonValidations.isStringEmpty(binding3.getclaimamount2())) {
                r.setPastClaimAmount2(Double.parseDouble(binding3.getclaimamount2()));
            }
            if (!CommonValidations.isStringEmpty(binding3.getclaimamount3())) {
                r.setPastClaimAmount3(Double.parseDouble(binding3.getclaimamount3()));
            }

            r.setCurrentInsuranceType1(binding3.getciptype1());
            r.setCurrentInsuranceType2(binding3.getciptype2());
            r.setCurrentInsuranceType3(binding3.getciptype3());
            r.setCurrentInsuranceCarrier1(binding3.getcipcarrier1());
            r.setCurrentInsuranceCarrier2(binding3.getcipcarrier2());
            r.setCurrentInsuranceCarrier3(binding3.getcipcarrier3());

            r.setLineHolders1(binding3.getlienholder1());
            r.setLineHolders2(binding3.getlienholder2());
            r.setLineHolders3(binding3.getlienholder3());
            r.setLineHoldersLoc1(binding3.getloc1());
            r.setLineHoldersLoc2(binding3.getloc2());
            r.setLineHoldersLoc3(binding3.getloc3());
            r.setAddressOfLocation1(binding3.getaoladdress1());
            r.setAddressOfLocation2(binding3.getaoladdress2());
            r.setAddressOfLocation3(binding3.getaoladdress3());
            r.setAddressOfLocation4(binding3.getaoladdress4());
            r.setAddressOfLocationUse1(binding3.getaoluse1());
            r.setAddressOfLocationUse2(binding3.getaoluse2());
            r.setAddressOfLocationUse3(binding3.getaoluse3());
            r.setAddressOfLocationUse4(binding3.getaoluse4());
            r.setLocationRentedToOthers1(binding3.getlrtooccupancy1());
            r.setLocationRentedToOthers3(binding3.getlrtooccupancy3());
            r.setLocationRentedToOthers2(binding3.getlrtooccupancy2());
            r.setLocationRentedToOthers4(binding3.getlrtooccupancy4());
            r.setProducercomments(binding3.getproducercomments());
            r.setMarketercomments(binding3.getmarketercomments());
            System.out.println("submitsave:" + r.getKeyContact());
            submitSavenon(r);
        } else {
            errors("Application can only be saved if it has not been submitted");
        }
    }

    public void submitSavenon(LocalFormResponse response) {
        System.out.println("Inside submitSave");
        System.err.println("keyContact" + response.getKeyContact());
        savinglocally.toFile(response, "Harman");
        animatedMovement(0, 0);
        successMessage1("Form is successfully saved.");

    }

    @FXML
    public void openSave() {

        LocalFormResponse response = (LocalFormResponse) savinglocally.toObject("Harman");
        GetInsuranceFormResponse r = new GetInsuranceFormResponse();
        DozerBeanMapper mapper = new DozerBeanMapper();
        mapper.map(response, r);
        System.out.println(r.getKeyContact());
        assign(r);
        animatedMovement(-1269, 0);
        //addmovement
    }

    public void viewApplication(final GetInsuranceFormResponse form, final String formId) {
        stage.show();
        isEdit = true;
        Task task = new Task<Void>() {
            @Override
            public Void call() throws com.rav.insurance.insuranceformoperations.webservice.Exception, Exception {
                try {
                    InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                    GetInsuranceFormRequest req = new GetInsuranceFormRequest();
                    req.setFormId(formId);
                    GetInsuranceFormResponse response = port.getInsuranceOperationsPort().getForm(req);
                    if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                        stopLoading();
                        System.out.println("formid is " + formId);
                        setFormId(formId);
                        assign(response);
                    } else {
                        stopLoading();
                        errors(response.getErrorMessage());
                    }
                } catch (Exception e) {
                    stopLoading();
                    errors(e.getMessage());
                    e.printStackTrace();
                }
                return null;
            }

        };
        new Thread(task).start();

    }

    @FXML
    public void downloadFiles() {

        stage.show();
        if (file1 != null) {
            File f1 = new File(applicationid);
            if (!f1.exists()) {
                f1.mkdir();
            }
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName1, file1);
        }
        if (file2 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName2, file2);
        }
        if (file3 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName3, file3);
        }
        if (file4 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName4, file4);
        }
        if (file5 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName5, file5);
        }
        if (file6 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName6, file6);
        }
        if (file7 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName7, file7);
        }
        if (file8 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName8, file8);
        }
        if (file9 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName9, file9);
        }
        if (file10 != null) {
            WriteByteArray.writeByteArray(applicationid + "\\" + fileName10, file10);
        }
        stopLoading();
        successMessage1("Files successfully downloaded in C: drive.");
    }

    public void assign(final GetInsuranceFormResponse form) {
        Platform.runLater(new Runnable() {
            public void run() {
                applicationid = form.getFormId();
                file1 = form.getFile1();
                fileName1 = form.getFile1Name();
                file2 = form.getFile2();
                fileName2 = form.getFile2Name();
                file3 = form.getFile3();
                fileName3 = form.getFile3Name();
                file4 = form.getFile4();
                fileName4 = form.getFile4Name();
                file5 = form.getFile5();
                fileName5 = form.getFile5Name();
                file6 = form.getFile6();
                fileName6 = form.getFile6Name();
                file7 = form.getFile7();
                fileName7 = form.getFile7Name();
                file8 = form.getFile8();
                fileName8 = form.getFile8Name();
                file9 = form.getFile9();
                fileName9 = form.getFile9Name();
                file10 = form.getFile10();
                fileName10 = form.getFile10Name();
                System.out.println("Filenames" + fileName1 + fileName2 + fileName3 + fileName4);

                if (form != null) {
                    System.out.println("Form is not null");
                } else {
                    System.out.println("Form is null");
                }
                if ("High".equals(form.getSeverity())) {
                    severity.getSelectionModel().select("High");
                } else if ("Medium".equals(form.getSeverity())) {
                    severity.getSelectionModel().select("Medium");
                } else if ("Low".equals(form.getSeverity())) {
                    severity.getSelectionModel().select("Low");
                }

                if ("Corporation".equals(form.getEntityType())) {
                    entitytype.getSelectionModel().select("Corporation");
                } else if ("Select".equals(form.getEntityType())) {
                    entitytype.getSelectionModel().select("Select");
                } else if ("Sole Proprietor".equals(form.getEntityType())) {
                    entitytype.getSelectionModel().select("Sole Proprietor");
                } else {
                    entitytype.getSelectionModel().select("Other");
                }

                if ("January".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("January");
                } else if ("February".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("February");
                } else if ("Select".equals(form.getFinancialYearEnd())) {
                    finYearEnd.getSelectionModel().select("Select");
                } else if ("March".equals(form.getFinancialYearEnd())) {
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
                } else {
                }
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

                if ("US$".equals(form.getCurrency2())) {
                    currency2.getSelectionModel().select("US$");
                } else if ("CAN$".equals(form.getCurrency2())) {
                    currency2.getSelectionModel().select("CAN$");
                }

                if ("US$".equals(form.getCurrency3())) {
                    currency3.getSelectionModel().select("US$");
                } else if ("CAN$".equals(form.getCurrency3())) {
                    currency3.getSelectionModel().select("CAN$");
                }

                if ("US$".equals(form.getCurrency4())) {
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
                if ("selected".equals(form.getOwnercb())) {
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
                if ("Select".equals(form.getBasement())) {
                    basement.getSelectionModel().select("Select");
                } else if ("Yes".equals(form.getBasement())) {
                    basement.getSelectionModel().select("Yes");
                } else if ("No".equals(form.getBasement())) {
                    basement.getSelectionModel().select("No");
                }

                if ("Profit".equals(form.getProfit())) {
                    profit.setSelected(true);
                } else if ("Non Profit".equals(form.getProfit())) {
                    nonprofit.setSelected(true);
                }
                if ("Yes".equals(form.getAddressOfLocationOwnedyes1())) {
                    aolownedy1.setSelected(true);
                } else if ("No".equals(form.getAddressOfLocationOwnedyes1())) {
                    aolownedn1.setSelected(true);
                }
                if ("Yes".equals(form.getAddressOfLocationOwnedyes2())) {
                    aolownedy2.setSelected(true);
                } else if ("No".equals(form.getAddressOfLocationOwnedyes2())) {
                    aolownedn2.setSelected(true);
                }
                if ("Yes".equals(form.getAddressOfLocationOwnedyes3())) {
                    aolownedy3.setSelected(true);
                } else if ("No".equals(form.getAddressOfLocationOwnedyes3())) {
                    aolownedn3.setSelected(true);
                }
                if ("Yes".equals(form.getAddressOfLocationOwnedno3())) {
                    aolownedy4.setSelected(true);
                } else if ("No".equals(form.getAddressOfLocationOwnedno3())) {
                    aolownedn4.setSelected(true);
                }

                produceridfromform = form.getProducer();
                branchfromform = form.getBranch();
                returnedname.setText(form.getProducer());
                returnedbranch.setText(form.getBranch());
                datefromform = form.getCreationDate();
                
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                GregorianCalendar gc = datefromform.toGregorianCalendar();
                String formatted_date = sdf.format(gc.getTime());
                
                returneddate.setText(formatted_date);
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
                otherspecify.setText(form.getOtherSpecify());
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
                yearsinbusiness.setText(Integer.toString(form.getYearInBusiness()));
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
                if (form.getPastClaimDate1() != null) {
                    datePicker.setSelectedDate((form.getPastClaimDate1().toGregorianCalendar().getTime()));
                }
                if (form.getPastClaimDate2() != null) {
                    datePicker1.setSelectedDate((form.getPastClaimDate2().toGregorianCalendar().getTime()));
                }
                if (form.getPastClaimDate3() != null) {
                    datePicker2.setSelectedDate((form.getPastClaimDate3().toGregorianCalendar().getTime()));
                }
                if (form.getCurrentInsuranceExpiry1() != null) {
                    datePicker3.setSelectedDate((form.getCurrentInsuranceExpiry1().toGregorianCalendar().getTime()));
                }
                if (form.getCurrentInsuranceExpiry2() != null) {
                    datePicker4.setSelectedDate((form.getCurrentInsuranceExpiry2().toGregorianCalendar().getTime()));
                }
                if (form.getCurrentInsuranceExpiry3() != null) {
                    datePicker5.setSelectedDate((form.getCurrentInsuranceExpiry3().toGregorianCalendar().getTime()));
                }
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
                lienholder1.setText(form.getLineHolders1());
                lienholder2.setText(form.getLineHolders2());
                lienholder3.setText(form.getLineHolders3());
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
                //commercial property
                listAddInfo = new ArrayList<AddAnotherInfo>();
                offset=0;
                for(int i=0; i<10;i++)
                {AddAnotherInfo a = new AddAnotherInfo();
                     switch (i)
                        {case 0:
                                System.out.println("case 0");
                        if (!CommonValidations.isStringEmpty(form.getAddress())) {
                            System.out.println("case 0 inside");
                        a.setBuildingLimit1(form.getBuildingLimit());
                        a.setBuildingDeductible1(form.getBuildingDeductible());
                        a.setContentsLimit1(form.getContentsLimit());
                        a.setContentsDeductible1(form.getContentsDeductible());
                        a.setStockLimit1(form.getStockLimit());
                        a.setStockDeductible1(form.getStockDeductible());
                        a.setOfficeContentLimit1(form.getOfficeContentLimit());
                        a.setOfficeContentDeductible1(form.getOfficeContentDeductible());
                        a.setEdpLimit1(form.getEdpLimit());
                        a.setEdpDeductible1(form.getEdpDeductible());
                        a.setEquipmentLimit1(form.getEquipmentLimit());
                        a.setEquipmentDeductible1(form.getEquipmentDeductible());
                        a.setOffPremisesLimit1(form.getOffPremisesLimit());
                        a.setOffPremisesDeductible1(form.getOffPremisesDeductible());
                        a.setTransitLimit1(form.getTransitLimit());
                        a.setTransitDeductible1(form.getTransitDeductible());
                        a.setMiscPropertyLimit1(form.getMiscPropertyLimit());
                        a.setMiscPropertyDeductible1(form.getMiscPropertyDeductible());
                        a.setContractorEquipmentLimit1(form.getContractorEquipmentLimit());
                        a.setContractorEquipmentDeductible1(form.getContractorEquipmentDeductible());
                        a.setInstallationFloaterLimit1(form.getInstallationFloaterLimit());
                        a.setInstallationFloaterDeductible1(form.getInstallationFloaterDeductible());
                        a.setToolFloaterLimit1(form.getToolFloaterLimit());                    
                        a.setToolFloaterDeductible1(form.getToolFloaterDeductible());
                        a.setSignFloaterLimit1(form.getSignFloaterLimit());
                        a.setSignFloaterDeductible1(form.getSignFloaterDeductible());
                        a.setMotorTruckLimit1(form.getMotorTruckLimit());
                        a.setMotorTruckDeductible1(form.getMotorTruckDeductible());
                        a.setGlassLimit1(form.getGlassLimit());
                        a.setGlassDeductible1(form.getGlassDeductible());
                        a.setSewerBackupDeductible1(form.getSewerBackupDeductible());
                        a.setFloodDeductible1(form.getFloodDeductible());
                        a.setEarthquakeDeductible1(form.getEarthquakeDeductible());
                        a.setProfitLimit1(form.getProfitLimit());
                        a.setProfitDeductible1(form.getProfitDeductible());
                        a.setGrossEarningLimit1(form.getGrossEarningLimit());
                        a.setGrossEarningDeductible1(form.getGrossEarningDeductible());
                        a.setRentalIncomeLimit1(form.getRentalIncomeLimit());
                        a.setRentalIncomeDeductible1(form.getRentalIncomeDeductible());
                        a.setExtraExpenseLimit1(form.getExtraExpenseLimit());
                        a.setExtraExpenseDeductible1(form.getExtraExpenseDeductible());
                        a.setOffPremisesPowerLimit1(form.getOffPremisesLimit());
                        a.setOffPremisesPowerDeductible1(form.getOffPremisesDeductible());
                        a.setInsideOutsideLimit1(form.getInsideOutsideLimit()); 
                        a.setInsideOutsideDeductible1(form.getInsideOutsideDeductible());
                        a.setBfMoneyLimit1(form.getBfMoneyLimit());
                        a.setBfMoneyDeductible1(form.getBfMoneyDeductible());
                        a.setDeopistorForgeryLimit1(form.getDeopistorForgeryLimit());
                        a.setDeopistorForgeryDeductible1(form.getDeopistorForgeryDeductible());
                        a.setMoneyOrdersLimit1(form.getMoneyOrdersLimit());
                        a.setMoneyOrdersDeductible1(form.getMoneyOrdersDeductible());
                        a.setEmployDishonestyLimit1(form.getEmployDishonestyLimit());                    
                        a.setEmployDishonestyDeductible1(form.getEmployDishonestyDeductible());
                        a.setCglLimit1(form.getCglLimit());
                        a.setCglDeductible1(form.getCglDeductible());
                        a.setTenantsLegalLimit1(form.getTenantsLegalLimit());
                        a.setTenantsLegalDeductible1(form.getTenantsLegalDeductible());
                        a.setNonOwnedAutoLimit1(form.getNonOwnedAutoLimit());
                        a.setNonOwnedAutoDeductible1(form.getNonOwnedAutoDeductible());
                        a.setSef96Limit1(form.getSef96Limit());
                        a.setSef96Deductible1(form.getSef96Deductible());
                        a.setSef94Limit1(form.getSef94Limit());
                        a.setSef94Deductible1(form.getSef94Deductible());
                        a.setDoLimit1(form.getDoLimit());
                        a.setDoDeductible1(form.getDoDeductible());
                        a.setEoLimit1(form.getEoLimit());
                        a.setEoDeductible1(form.getEoDeductible());
                        a.setEmployerLimit1(form.getEmployerLimit());
                        a.setEmployerDeductible1(form.getEmployerDeductible()); 
                        a.setUmbrellaLimit1(form.getUmbrellaLimit());
                        a.setUmbrellaDeductible1(form.getUmbrellaDeductible());
                        a.setWrapUpLimit1(form.getWrapUpLimit());
                        a.setWrapUpDeductible1(form.getWrapUpDeductible());
                        a.setStdComprehensiveLimit1(form.getStdComprehensiveLimit());
                        a.setStdComprehensiveDeductible1(form.getStdComprehensiveDeductible());
                        a.setAirConditioningLimit1(form.getAirConditioningLimit());
                        a.setAirConditioningDeductible1(form.getAirConditioningDeductible());
                        a.setProductionMachineryLimit1(form.getProductionMachineryLimit());
                        a.setProductionMachineryDeductible1(form.getProductionMachineryDeductible());
                    	a.setOthercoverage11(form.getOthercoverage1());
	                a.setOthercoverage21(form.getOthercoverage2());
                        a.setOtherCoverageLimit11(form.getOtherCoverageLimit1());
                        a.setOtherCoverageDeductible11(form.getOtherCoverageDeductible1());
                        a.setOtherCoverageLimit21(form.getOtherCoverageLimit2());
                        a.setOtherCoverageDeductible21(form.getOtherCoverageDeductible2());
    	                a.setAdditionalCoverage1(form.getAdditionalcoverage());
        	        a.setRoofupdated1(form.getRoofupdated());
            	        a.setHeatingupdated1(form.getHeatingupdated());
                	a.setElectricalupdated1(form.getElectricalupdated());
                    	a.setElectricalamps1(form.getElectricalamps());
	                a.setFireProtectiondistance1(form.getFireProtectiondistance());
    	                a.setAddress1(form.getAddress());
        	        a.setBasement1(form.getBasement());
            	        a.setOwner11(form.getOwnercb());
                	a.setTruckMan1(form.getTruckMan());
                    	a.setGrossEarning801(form.getGrossEarningCheckbox());
	                a.setWallsframe1(form.getWallsframe());
    	                a.setWallshcb1(form.getWallshcb());
	                a.setWallssteel1(form.getWallssteel());
    	                a.setWallsbrick1(form.getWallsbrick());
        	        a.setRoofwood1(form.getRoofwood());
            	        a.setRoofsteel1(form.getRoofsteel());
                	a.setRoofconcrete1(form.getRoofconcrete());
                    	a.setFloorsconcrete1(form.getFloorsconcrete());
	                a.setFloorswood1(form.getFloorswood());
    	                a.setHeatinggas1(form.getHeatinggas());
        	        a.setHeatingoil1(form.getHeatingoil());
            	        a.setHeatingelectric1(form.getHeatingelectric());
                	a.setHeatingother1(form.getHeatingother());
                    	a.setElectricalbreakers1(form.getElectricalbreakers());
	                a.setElectricalfuses1(form.getElectricalfuses());
        	        a.setPlumbingcopper1(form.getPlumbingcopper());
            	        a.setPlumbingpvc1(form.getPlumbingpvc());
                	a.setPlumbingother1(form.getPlumbingother());
                    	a.setFireProtection1(form.getFireProtection());
	                a.setSecurity1(form.getSecurity());
                        a.setAge1(form.getAge());
                        a.setTotalSqFootage1(form.getTotalSqFootage());
                        a.setInsdSqFootage1(form.getInsdSqFootage());
                        a.setNoOfStories1(form.getNoOfStories());
                        }
                        break;
                        case 1:
                            System.out.println("case 1");
                        if(!CommonValidations.isStringEmpty(form.getAddress1()))
                        {
                            System.out.println("case 1 Inside");
                        a.setBuildingLimit1(form.getBuildingLimit1());
                        a.setBuildingDeductible1(form.getBuildingDeductible1());
                        a.setContentsLimit1(form.getContentsLimit1());
                        a.setContentsDeductible1(form.getContentsDeductible1());
                        a.setStockLimit1(form.getStockLimit1());
                        a.setStockDeductible1(form.getStockDeductible1());
                        a.setOfficeContentLimit1(form.getOfficeContentLimit1());
                        a.setOfficeContentDeductible1(form.getOfficeContentDeductible1());
                        a.setEdpLimit1(form.getEdpLimit1());
                        a.setEdpDeductible1(form.getEdpDeductible1());
                        a.setEquipmentLimit1(form.getEquipmentLimit1());
                        a.setEquipmentDeductible1(form.getEquipmentDeductible1());
                        a.setOffPremisesLimit1(form.getOffPremisesLimit1());
                        a.setOffPremisesDeductible1(form.getOffPremisesDeductible1());
                        a.setTransitLimit1(form.getTransitLimit1());
                        a.setTransitDeductible1(form.getTransitDeductible1());
                        a.setMiscPropertyLimit1(form.getMiscPropertyLimit1());
                        a.setMiscPropertyDeductible1(form.getMiscPropertyDeductible1());
                        a.setContractorEquipmentLimit1(form.getContractorEquipmentLimit1());
                        a.setContractorEquipmentDeductible1(form.getContractorEquipmentDeductible1());
                        a.setInstallationFloaterLimit1(form.getInstallationFloaterLimit1());
                        a.setInstallationFloaterDeductible1(form.getInstallationFloaterDeductible1());
                        a.setToolFloaterLimit1(form.getToolFloaterLimit1());                    
                        a.setToolFloaterDeductible1(form.getToolFloaterDeductible1());
                        a.setSignFloaterLimit1(form.getSignFloaterLimit1());
                        a.setSignFloaterDeductible1(form.getSignFloaterDeductible1());
                        a.setMotorTruckLimit1(form.getMotorTruckLimit1());
                        a.setMotorTruckDeductible1(form.getMotorTruckDeductible1());
                        a.setGlassLimit1(form.getGlassLimit1());
                        a.setGlassDeductible1(form.getGlassDeductible1());
                        a.setSewerBackupDeductible1(form.getSewerBackupDeductible1());
                        a.setFloodDeductible1(form.getFloodDeductible1());
                        a.setEarthquakeDeductible1(form.getEarthquakeDeductible1());
                        a.setProfitLimit1(form.getProfitLimit1());
                        a.setProfitDeductible1(form.getProfitDeductible1());
                        a.setGrossEarningLimit1(form.getGrossEarningLimit1());
                        a.setGrossEarningDeductible1(form.getGrossEarningDeductible1());
                        a.setRentalIncomeLimit1(form.getRentalIncomeLimit1());
                        a.setRentalIncomeDeductible1(form.getRentalIncomeDeductible1());
                        a.setExtraExpenseLimit1(form.getExtraExpenseLimit1());
                        a.setExtraExpenseDeductible1(form.getExtraExpenseDeductible1());
                        a.setOffPremisesPowerLimit1(form.getOffPremisesLimit1());
                        a.setOffPremisesPowerDeductible1(form.getOffPremisesDeductible1());
                        a.setInsideOutsideLimit1(form.getInsideOutsideLimit1()); 
                        a.setInsideOutsideDeductible1(form.getInsideOutsideDeductible1());
                        a.setBfMoneyLimit1(form.getBfMoneyLimit1());
                        a.setBfMoneyDeductible1(form.getBfMoneyDeductible1());
                        a.setDeopistorForgeryLimit1(form.getDeopistorForgeryLimit1());
                        a.setDeopistorForgeryDeductible1(form.getDeopistorForgeryDeductible1());
                        a.setMoneyOrdersLimit1(form.getMoneyOrdersLimit1());
                        a.setMoneyOrdersDeductible1(form.getMoneyOrdersDeductible1());
                        a.setEmployDishonestyLimit1(form.getEmployDishonestyLimit1());                    
                        a.setEmployDishonestyDeductible1(form.getEmployDishonestyDeductible1());
                        a.setCglLimit1(form.getCglLimit1());
                        a.setCglDeductible1(form.getCglDeductible1());
                        a.setTenantsLegalLimit1(form.getTenantsLegalLimit1());
                        a.setTenantsLegalDeductible1(form.getTenantsLegalDeductible1());
                        a.setNonOwnedAutoLimit1(form.getNonOwnedAutoLimit1());
                        a.setNonOwnedAutoDeductible1(form.getNonOwnedAutoDeductible1());
                        a.setSef96Limit1(form.getSef96Limit1());
                        a.setSef96Deductible1(form.getSef96Deductible1());
                        a.setSef94Limit1(form.getSef94Limit1());
                        a.setSef94Deductible1(form.getSef94Deductible1());
                        a.setDoLimit1(form.getDoLimit1());
                        a.setDoDeductible1(form.getDoDeductible1());
                        a.setEoLimit1(form.getEoLimit1());
                        a.setEoDeductible1(form.getEoDeductible1());
                        a.setEmployerLimit1(form.getEmployerLimit1());
                        a.setEmployerDeductible1(form.getEmployerDeductible1()); 
                        a.setUmbrellaLimit1(form.getUmbrellaLimit1());
                        a.setUmbrellaDeductible1(form.getUmbrellaDeductible1());
                        a.setWrapUpLimit1(form.getWrapUpLimit1());
                        a.setWrapUpDeductible1(form.getWrapUpDeductible1());
                        a.setStdComprehensiveLimit1(form.getStdComprehensiveLimit1());
                        a.setStdComprehensiveDeductible1(form.getStdComprehensiveDeductible1());
                        a.setAirConditioningLimit1(form.getAirConditioningLimit1());
                        a.setAirConditioningDeductible1(form.getAirConditioningDeductible1());
                        a.setProductionMachineryLimit1(form.getProductionMachineryLimit1());
                        a.setProductionMachineryDeductible1(form.getProductionMachineryDeductible1());
                    	a.setOthercoverage11(form.getOthercoverage11());
	                a.setOthercoverage21(form.getOthercoverage21());
                        a.setOtherCoverageLimit11(form.getOtherCoverageLimit11());
                        a.setOtherCoverageDeductible11(form.getOtherCoverageDeductible11());
                        a.setOtherCoverageLimit21(form.getOtherCoverageLimit21());
                        a.setOtherCoverageDeductible21(form.getOtherCoverageDeductible21());
    	                a.setAdditionalCoverage1(form.getAdditionalcoverage1());
        	        a.setRoofupdated1(form.getRoofupdated1());
            	        a.setHeatingupdated1(form.getHeatingupdated1());
                	a.setElectricalupdated1(form.getElectricalupdated1());
                    	a.setElectricalamps1(form.getElectricalamps1());
	                a.setFireProtectiondistance1(form.getFireProtectiondistance1());
    	                a.setAddress1(form.getAddress1());
        	        a.setBasement1(form.getBasement1());
            	        a.setOwner11(form.getOwnercb1());
                	a.setTruckMan1(form.getTruckMan1());
                    	a.setGrossEarning801(form.getGrossEarningCheckbox1());
	                a.setWallsframe1(form.getWallsframe1());
    	                a.setWallshcb1(form.getWallshcb1());
	                a.setWallssteel1(form.getWallssteel1());
    	                a.setWallsbrick1(form.getWallsbrick1());
        	        a.setRoofwood1(form.getRoofwood1());
            	        a.setRoofsteel1(form.getRoofsteel1());
                	a.setRoofconcrete1(form.getRoofconcrete1());
                    	a.setFloorsconcrete1(form.getFloorsconcrete1());
	                a.setFloorswood1(form.getFloorswood1());
    	                a.setHeatinggas1(form.getHeatinggas1());
        	        a.setHeatingoil1(form.getHeatingoil1());
            	        a.setHeatingelectric1(form.getHeatingelectric1());
                	a.setHeatingother1(form.getHeatingother1());
                    	a.setElectricalbreakers1(form.getElectricalbreakers1());
	                a.setElectricalfuses1(form.getElectricalfuses1());
        	        a.setPlumbingcopper1(form.getPlumbingcopper1());
            	        a.setPlumbingpvc1(form.getPlumbingpvc1());
                	a.setPlumbingother1(form.getPlumbingother1());
                    	a.setFireProtection1(form.getFireProtection1());
	                a.setSecurity1(form.getSecurity1());
                        a.setAge1(form.getAge1());
                        a.setTotalSqFootage1(form.getTotalSqFootage1());
                        a.setInsdSqFootage1(form.getInsdSqFootage1());
                        a.setNoOfStories1(form.getNoOfStories1());
                }
                        break;
                case 2:
                if (!CommonValidations.isStringEmpty(form.getAddress2()))
                {
                        a.setBuildingLimit1(form.getBuildingLimit2());
                        a.setBuildingDeductible1(form.getBuildingDeductible2());
                        a.setContentsLimit1(form.getContentsLimit2());
                        a.setContentsDeductible1(form.getContentsDeductible2());
                        a.setStockLimit1(form.getStockLimit2());
                        a.setStockDeductible1(form.getStockDeductible2());
                        a.setOfficeContentLimit1(form.getOfficeContentLimit2());
                        a.setOfficeContentDeductible1(form.getOfficeContentDeductible2());
                        a.setEdpLimit1(form.getEdpLimit2());
                        a.setEdpDeductible1(form.getEdpDeductible2());
                        a.setEquipmentLimit1(form.getEquipmentLimit2());
                        a.setEquipmentDeductible1(form.getEquipmentDeductible2());
                        a.setOffPremisesLimit1(form.getOffPremisesLimit2());
                        a.setOffPremisesDeductible1(form.getOffPremisesDeductible2());
                        a.setTransitLimit1(form.getTransitLimit2());
                        a.setTransitDeductible1(form.getTransitDeductible2());
                        a.setMiscPropertyLimit1(form.getMiscPropertyLimit2());
                        a.setMiscPropertyDeductible1(form.getMiscPropertyDeductible2());
                        a.setContractorEquipmentLimit1(form.getContractorEquipmentLimit2());
                        a.setContractorEquipmentDeductible1(form.getContractorEquipmentDeductible2());
                        a.setInstallationFloaterLimit1(form.getInstallationFloaterLimit2());
                        a.setInstallationFloaterDeductible1(form.getInstallationFloaterDeductible2());
                        a.setToolFloaterLimit1(form.getToolFloaterLimit2());                    
                        a.setToolFloaterDeductible1(form.getToolFloaterDeductible2());
                        a.setSignFloaterLimit1(form.getSignFloaterLimit2());
                        a.setSignFloaterDeductible1(form.getSignFloaterDeductible2());
                        a.setMotorTruckLimit1(form.getMotorTruckLimit2());
                        a.setMotorTruckDeductible1(form.getMotorTruckDeductible2());
                        a.setGlassLimit1(form.getGlassLimit2());
                        a.setGlassDeductible1(form.getGlassDeductible2());
                        a.setSewerBackupDeductible1(form.getSewerBackupDeductible2());
                        a.setFloodDeductible1(form.getFloodDeductible2());
                        a.setEarthquakeDeductible1(form.getEarthquakeDeductible2());
                        a.setProfitLimit1(form.getProfitLimit2());
                        a.setProfitDeductible1(form.getProfitDeductible2());
                        a.setGrossEarningLimit1(form.getGrossEarningLimit2());
                        a.setGrossEarningDeductible1(form.getGrossEarningDeductible2());
                        a.setRentalIncomeLimit1(form.getRentalIncomeLimit2());
                        a.setRentalIncomeDeductible1(form.getRentalIncomeDeductible2());
                        a.setExtraExpenseLimit1(form.getExtraExpenseLimit2());
                        a.setExtraExpenseDeductible1(form.getExtraExpenseDeductible2());
                        a.setOffPremisesPowerLimit1(form.getOffPremisesLimit2());
                        a.setOffPremisesPowerDeductible1(form.getOffPremisesDeductible2());
                        a.setInsideOutsideLimit1(form.getInsideOutsideLimit2()); 
                        a.setInsideOutsideDeductible1(form.getInsideOutsideDeductible2());
                        a.setBfMoneyLimit1(form.getBfMoneyLimit2());
                        a.setBfMoneyDeductible1(form.getBfMoneyDeductible2());
                        a.setDeopistorForgeryLimit1(form.getDeopistorForgeryLimit2());
                        a.setDeopistorForgeryDeductible1(form.getDeopistorForgeryDeductible2());
                        a.setMoneyOrdersLimit1(form.getMoneyOrdersLimit2());
                        a.setMoneyOrdersDeductible1(form.getMoneyOrdersDeductible2());
                        a.setEmployDishonestyLimit1(form.getEmployDishonestyLimit2());                    
                        a.setEmployDishonestyDeductible1(form.getEmployDishonestyDeductible2());
                        a.setCglLimit1(form.getCglLimit2());
                        a.setCglDeductible1(form.getCglDeductible2());
                        a.setTenantsLegalLimit1(form.getTenantsLegalLimit2());
                        a.setTenantsLegalDeductible1(form.getTenantsLegalDeductible2());
                        a.setNonOwnedAutoLimit1(form.getNonOwnedAutoLimit2());
                        a.setNonOwnedAutoDeductible1(form.getNonOwnedAutoDeductible2());
                        a.setSef96Limit1(form.getSef96Limit2());
                        a.setSef96Deductible1(form.getSef96Deductible2());
                        a.setSef94Limit1(form.getSef94Limit2());
                        a.setSef94Deductible1(form.getSef94Deductible2());
                        a.setDoLimit1(form.getDoLimit2());
                        a.setDoDeductible1(form.getDoDeductible2());
                        a.setEoLimit1(form.getEoLimit2());
                        a.setEoDeductible1(form.getEoDeductible2());
                        a.setEmployerLimit1(form.getEmployerLimit2());
                        a.setEmployerDeductible1(form.getEmployerDeductible2()); 
                        a.setUmbrellaLimit1(form.getUmbrellaLimit2());
                        a.setUmbrellaDeductible1(form.getUmbrellaDeductible2());
                        a.setWrapUpLimit1(form.getWrapUpLimit2());
                        a.setWrapUpDeductible1(form.getWrapUpDeductible2());
                        a.setStdComprehensiveLimit1(form.getStdComprehensiveLimit2());
                        a.setStdComprehensiveDeductible1(form.getStdComprehensiveDeductible2());
                        a.setAirConditioningLimit1(form.getAirConditioningLimit2());
                        a.setAirConditioningDeductible1(form.getAirConditioningDeductible2());
                        a.setProductionMachineryLimit1(form.getProductionMachineryLimit2());
                        a.setProductionMachineryDeductible1(form.getProductionMachineryDeductible2());
                    	a.setOthercoverage11(form.getOthercoverage12());
	                a.setOthercoverage21(form.getOthercoverage22());
                        a.setOtherCoverageLimit11(form.getOtherCoverageLimit12());
                        a.setOtherCoverageDeductible11(form.getOtherCoverageDeductible12());
                        a.setOtherCoverageLimit21(form.getOtherCoverageLimit22());
                        a.setOtherCoverageDeductible21(form.getOtherCoverageDeductible22());
    	                a.setAdditionalCoverage1(form.getAdditionalcoverage2());
        	        a.setRoofupdated1(form.getRoofupdated2());
            	        a.setHeatingupdated1(form.getHeatingupdated2());
                	a.setElectricalupdated1(form.getElectricalupdated2());
                    	a.setElectricalamps1(form.getElectricalamps2());
	                a.setFireProtectiondistance1(form.getFireProtectiondistance2());
    	                a.setAddress1(form.getAddress2());
        	        a.setBasement1(form.getBasement2());
            	        a.setOwner11(form.getOwnercb2());
                	a.setTruckMan1(form.getTruckMan2());
                    	a.setGrossEarning801(form.getGrossEarningCheckbox2());
	                a.setWallsframe1(form.getWallsframe2());
    	                a.setWallshcb1(form.getWallshcb2());
	                a.setWallssteel1(form.getWallssteel2());
    	                a.setWallsbrick1(form.getWallsbrick2());
        	        a.setRoofwood1(form.getRoofwood2());
            	        a.setRoofsteel1(form.getRoofsteel2());
                	a.setRoofconcrete1(form.getRoofconcrete2());
                    	a.setFloorsconcrete1(form.getFloorsconcrete2());
	                a.setFloorswood1(form.getFloorswood2());
    	                a.setHeatinggas1(form.getHeatinggas2());
        	        a.setHeatingoil1(form.getHeatingoil2());
            	        a.setHeatingelectric1(form.getHeatingelectric2());
                	a.setHeatingother1(form.getHeatingother2());
                    	a.setElectricalbreakers1(form.getElectricalbreakers2());
	                a.setElectricalfuses1(form.getElectricalfuses2());
        	        a.setPlumbingcopper1(form.getPlumbingcopper2());
            	        a.setPlumbingpvc1(form.getPlumbingpvc2());
                	a.setPlumbingother1(form.getPlumbingother2());
                    	a.setFireProtection1(form.getFireProtection2());
	                a.setSecurity1(form.getSecurity2());
                        a.setAge1(form.getAge2());
                        a.setTotalSqFootage1(form.getTotalSqFootage2());
                        a.setInsdSqFootage1(form.getInsdSqFootage2());
                        a.setNoOfStories1(form.getNoOfStories2());
                }
                break;
                case 3:
                if (!CommonValidations.isStringEmpty(form.getAddress3()))
                {
                        a.setBuildingLimit1(form.getBuildingLimit3());
                        a.setBuildingDeductible1(form.getBuildingDeductible3());
                        a.setContentsLimit1(form.getContentsLimit3());
                        a.setContentsDeductible1(form.getContentsDeductible3());
                        a.setStockLimit1(form.getStockLimit3());
                        a.setStockDeductible1(form.getStockDeductible3());
                        a.setOfficeContentLimit1(form.getOfficeContentLimit3());
                        a.setOfficeContentDeductible1(form.getOfficeContentDeductible3());
                        a.setEdpLimit1(form.getEdpLimit3());
                        a.setEdpDeductible1(form.getEdpDeductible3());
                        a.setEquipmentLimit1(form.getEquipmentLimit3());
                        a.setEquipmentDeductible1(form.getEquipmentDeductible3());
                        a.setOffPremisesLimit1(form.getOffPremisesLimit3());
                        a.setOffPremisesDeductible1(form.getOffPremisesDeductible3());
                        a.setTransitLimit1(form.getTransitLimit3());
                        a.setTransitDeductible1(form.getTransitDeductible3());
                        a.setMiscPropertyLimit1(form.getMiscPropertyLimit3());
                        a.setMiscPropertyDeductible1(form.getMiscPropertyDeductible3());
                        a.setContractorEquipmentLimit1(form.getContractorEquipmentLimit3());
                        a.setContractorEquipmentDeductible1(form.getContractorEquipmentDeductible3());
                        a.setInstallationFloaterLimit1(form.getInstallationFloaterLimit3());
                        a.setInstallationFloaterDeductible1(form.getInstallationFloaterDeductible3());
                        a.setToolFloaterLimit1(form.getToolFloaterLimit3());                    
                        a.setToolFloaterDeductible1(form.getToolFloaterDeductible3());
                        a.setSignFloaterLimit1(form.getSignFloaterLimit3());
                        a.setSignFloaterDeductible1(form.getSignFloaterDeductible3());
                        a.setMotorTruckLimit1(form.getMotorTruckLimit3());
                        a.setMotorTruckDeductible1(form.getMotorTruckDeductible3());
                        a.setGlassLimit1(form.getGlassLimit3());
                        a.setGlassDeductible1(form.getGlassDeductible3());
                        a.setSewerBackupDeductible1(form.getSewerBackupDeductible3());
                        a.setFloodDeductible1(form.getFloodDeductible3());
                        a.setEarthquakeDeductible1(form.getEarthquakeDeductible3());
                        a.setProfitLimit1(form.getProfitLimit3());
                        a.setProfitDeductible1(form.getProfitDeductible3());
                        a.setGrossEarningLimit1(form.getGrossEarningLimit3());
                        a.setGrossEarningDeductible1(form.getGrossEarningDeductible3());
                        a.setRentalIncomeLimit1(form.getRentalIncomeLimit3());
                        a.setRentalIncomeDeductible1(form.getRentalIncomeDeductible3());
                        a.setExtraExpenseLimit1(form.getExtraExpenseLimit3());
                        a.setExtraExpenseDeductible1(form.getExtraExpenseDeductible3());
                        a.setOffPremisesPowerLimit1(form.getOffPremisesLimit3());
                        a.setOffPremisesPowerDeductible1(form.getOffPremisesDeductible3());
                        a.setInsideOutsideLimit1(form.getInsideOutsideLimit3()); 
                        a.setInsideOutsideDeductible1(form.getInsideOutsideDeductible3());
                        a.setBfMoneyLimit1(form.getBfMoneyLimit3());
                        a.setBfMoneyDeductible1(form.getBfMoneyDeductible3());
                        a.setDeopistorForgeryLimit1(form.getDeopistorForgeryLimit3());
                        a.setDeopistorForgeryDeductible1(form.getDeopistorForgeryDeductible3());
                        a.setMoneyOrdersLimit1(form.getMoneyOrdersLimit3());
                        a.setMoneyOrdersDeductible1(form.getMoneyOrdersDeductible3());
                        a.setEmployDishonestyLimit1(form.getEmployDishonestyLimit3());                    
                        a.setEmployDishonestyDeductible1(form.getEmployDishonestyDeductible3());
                        a.setCglLimit1(form.getCglLimit3());
                        a.setCglDeductible1(form.getCglDeductible3());
                        a.setTenantsLegalLimit1(form.getTenantsLegalLimit3());
                        a.setTenantsLegalDeductible1(form.getTenantsLegalDeductible3());
                        a.setNonOwnedAutoLimit1(form.getNonOwnedAutoLimit3());
                        a.setNonOwnedAutoDeductible1(form.getNonOwnedAutoDeductible3());
                        a.setSef96Limit1(form.getSef96Limit3());
                        a.setSef96Deductible1(form.getSef96Deductible3());
                        a.setSef94Limit1(form.getSef94Limit3());
                        a.setSef94Deductible1(form.getSef94Deductible3());
                        a.setDoLimit1(form.getDoLimit3());
                        a.setDoDeductible1(form.getDoDeductible3());
                        a.setEoLimit1(form.getEoLimit3());
                        a.setEoDeductible1(form.getEoDeductible3());
                        a.setEmployerLimit1(form.getEmployerLimit3());
                        a.setEmployerDeductible1(form.getEmployerDeductible3()); 
                        a.setUmbrellaLimit1(form.getUmbrellaLimit3());
                        a.setUmbrellaDeductible1(form.getUmbrellaDeductible3());
                        a.setWrapUpLimit1(form.getWrapUpLimit3());
                        a.setWrapUpDeductible1(form.getWrapUpDeductible3());
                        a.setStdComprehensiveLimit1(form.getStdComprehensiveLimit3());
                        a.setStdComprehensiveDeductible1(form.getStdComprehensiveDeductible3());
                        a.setAirConditioningLimit1(form.getAirConditioningLimit3());
                        a.setAirConditioningDeductible1(form.getAirConditioningDeductible3());
                        a.setProductionMachineryLimit1(form.getProductionMachineryLimit3());
                        a.setProductionMachineryDeductible1(form.getProductionMachineryDeductible3());
                    	a.setOthercoverage11(form.getOthercoverage13());
	                a.setOthercoverage21(form.getOthercoverage23());
                        a.setOtherCoverageLimit11(form.getOtherCoverageLimit13());
                        a.setOtherCoverageDeductible11(form.getOtherCoverageDeductible13());
                        a.setOtherCoverageLimit21(form.getOtherCoverageLimit23());
                        a.setOtherCoverageDeductible21(form.getOtherCoverageDeductible23());
    	                a.setAdditionalCoverage1(form.getAdditionalcoverage3());
        	        a.setRoofupdated1(form.getRoofupdated3());
            	        a.setHeatingupdated1(form.getHeatingupdated3());
                	a.setElectricalupdated1(form.getElectricalupdated3());
                    	a.setElectricalamps1(form.getElectricalamps3());
	                a.setFireProtectiondistance1(form.getFireProtectiondistance3());
    	                a.setAddress1(form.getAddress3());
        	        a.setBasement1(form.getBasement3());
            	        a.setOwner11(form.getOwnercb3());
                	a.setTruckMan1(form.getTruckMan3());
                    	a.setGrossEarning801(form.getGrossEarningCheckbox3());
	                a.setWallsframe1(form.getWallsframe3());
    	                a.setWallshcb1(form.getWallshcb3());
	                a.setWallssteel1(form.getWallssteel3());
    	                a.setWallsbrick1(form.getWallsbrick3());
        	        a.setRoofwood1(form.getRoofwood3());
            	        a.setRoofsteel1(form.getRoofsteel3());
                	a.setRoofconcrete1(form.getRoofconcrete3());
                    	a.setFloorsconcrete1(form.getFloorsconcrete3());
	                a.setFloorswood1(form.getFloorswood3());
    	                a.setHeatinggas1(form.getHeatinggas3());
        	        a.setHeatingoil1(form.getHeatingoil3());
            	        a.setHeatingelectric1(form.getHeatingelectric3());
                	a.setHeatingother1(form.getHeatingother3());
                    	a.setElectricalbreakers1(form.getElectricalbreakers3());
	                a.setElectricalfuses1(form.getElectricalfuses3());
        	        a.setPlumbingcopper1(form.getPlumbingcopper3());
            	        a.setPlumbingpvc1(form.getPlumbingpvc3());
                	a.setPlumbingother1(form.getPlumbingother3());
                    	a.setFireProtection1(form.getFireProtection3());
	                a.setSecurity1(form.getSecurity3());
                        a.setAge1(form.getAge3());
                        a.setTotalSqFootage1(form.getTotalSqFootage3());
                        a.setInsdSqFootage1(form.getInsdSqFootage3());
                        a.setNoOfStories1(form.getNoOfStories3());
                }
                break;
                case 4:
                if (!CommonValidations.isStringEmpty(form.getAddress4()))
                {
                       a.setBuildingLimit1(form.getBuildingLimit4());
                        a.setBuildingDeductible1(form.getBuildingDeductible4());
                        a.setContentsLimit1(form.getContentsLimit4());
                        a.setContentsDeductible1(form.getContentsDeductible4());
                        a.setStockLimit1(form.getStockLimit4());
                        a.setStockDeductible1(form.getStockDeductible4());
                        a.setOfficeContentLimit1(form.getOfficeContentLimit4());
                        a.setOfficeContentDeductible1(form.getOfficeContentDeductible4());
                        a.setEdpLimit1(form.getEdpLimit4());
                        a.setEdpDeductible1(form.getEdpDeductible4());
                        a.setEquipmentLimit1(form.getEquipmentLimit4());
                        a.setEquipmentDeductible1(form.getEquipmentDeductible4());
                        a.setOffPremisesLimit1(form.getOffPremisesLimit4());
                        a.setOffPremisesDeductible1(form.getOffPremisesDeductible4());
                        a.setTransitLimit1(form.getTransitLimit4());
                        a.setTransitDeductible1(form.getTransitDeductible4());
                        a.setMiscPropertyLimit1(form.getMiscPropertyLimit4());
                        a.setMiscPropertyDeductible1(form.getMiscPropertyDeductible4());
                        a.setContractorEquipmentLimit1(form.getContractorEquipmentLimit4());
                        a.setContractorEquipmentDeductible1(form.getContractorEquipmentDeductible4());
                        a.setInstallationFloaterLimit1(form.getInstallationFloaterLimit4());
                        a.setInstallationFloaterDeductible1(form.getInstallationFloaterDeductible4());
                        a.setToolFloaterLimit1(form.getToolFloaterLimit4());                    
                        a.setToolFloaterDeductible1(form.getToolFloaterDeductible4());
                        a.setSignFloaterLimit1(form.getSignFloaterLimit4());
                        a.setSignFloaterDeductible1(form.getSignFloaterDeductible4());
                        a.setMotorTruckLimit1(form.getMotorTruckLimit4());
                        a.setMotorTruckDeductible1(form.getMotorTruckDeductible4());
                        a.setGlassLimit1(form.getGlassLimit4());
                        a.setGlassDeductible1(form.getGlassDeductible4());
                        a.setSewerBackupDeductible1(form.getSewerBackupDeductible4());
                        a.setFloodDeductible1(form.getFloodDeductible4());
                        a.setEarthquakeDeductible1(form.getEarthquakeDeductible4());
                        a.setProfitLimit1(form.getProfitLimit4());
                        a.setProfitDeductible1(form.getProfitDeductible4());
                        a.setGrossEarningLimit1(form.getGrossEarningLimit4());
                        a.setGrossEarningDeductible1(form.getGrossEarningDeductible4());
                        a.setRentalIncomeLimit1(form.getRentalIncomeLimit4());
                        a.setRentalIncomeDeductible1(form.getRentalIncomeDeductible4());
                        a.setExtraExpenseLimit1(form.getExtraExpenseLimit4());
                        a.setExtraExpenseDeductible1(form.getExtraExpenseDeductible4());
                        a.setOffPremisesPowerLimit1(form.getOffPremisesLimit4());
                        a.setOffPremisesPowerDeductible1(form.getOffPremisesDeductible4());
                        a.setInsideOutsideLimit1(form.getInsideOutsideLimit4()); 
                        a.setInsideOutsideDeductible1(form.getInsideOutsideDeductible4());
                        a.setBfMoneyLimit1(form.getBfMoneyLimit4());
                        a.setBfMoneyDeductible1(form.getBfMoneyDeductible4());
                        a.setDeopistorForgeryLimit1(form.getDeopistorForgeryLimit4());
                        a.setDeopistorForgeryDeductible1(form.getDeopistorForgeryDeductible4());
                        a.setMoneyOrdersLimit1(form.getMoneyOrdersLimit4());
                        a.setMoneyOrdersDeductible1(form.getMoneyOrdersDeductible4());
                        a.setEmployDishonestyLimit1(form.getEmployDishonestyLimit4());                    
                        a.setEmployDishonestyDeductible1(form.getEmployDishonestyDeductible4());
                        a.setCglLimit1(form.getCglLimit4());
                        a.setCglDeductible1(form.getCglDeductible4());
                        a.setTenantsLegalLimit1(form.getTenantsLegalLimit4());
                        a.setTenantsLegalDeductible1(form.getTenantsLegalDeductible4());
                        a.setNonOwnedAutoLimit1(form.getNonOwnedAutoLimit4());
                        a.setNonOwnedAutoDeductible1(form.getNonOwnedAutoDeductible4());
                        a.setSef96Limit1(form.getSef96Limit4());
                        a.setSef96Deductible1(form.getSef96Deductible4());
                        a.setSef94Limit1(form.getSef94Limit4());
                        a.setSef94Deductible1(form.getSef94Deductible4());
                        a.setDoLimit1(form.getDoLimit4());
                        a.setDoDeductible1(form.getDoDeductible4());
                        a.setEoLimit1(form.getEoLimit4());
                        a.setEoDeductible1(form.getEoDeductible4());
                        a.setEmployerLimit1(form.getEmployerLimit4());
                        a.setEmployerDeductible1(form.getEmployerDeductible4()); 
                        a.setUmbrellaLimit1(form.getUmbrellaLimit4());
                        a.setUmbrellaDeductible1(form.getUmbrellaDeductible4());
                        a.setWrapUpLimit1(form.getWrapUpLimit4());
                        a.setWrapUpDeductible1(form.getWrapUpDeductible4());
                        a.setStdComprehensiveLimit1(form.getStdComprehensiveLimit4());
                        a.setStdComprehensiveDeductible1(form.getStdComprehensiveDeductible4());
                        a.setAirConditioningLimit1(form.getAirConditioningLimit4());
                        a.setAirConditioningDeductible1(form.getAirConditioningDeductible4());
                        a.setProductionMachineryLimit1(form.getProductionMachineryLimit4());
                        a.setProductionMachineryDeductible1(form.getProductionMachineryDeductible4());
                    	a.setOthercoverage11(form.getOthercoverage14());
	                a.setOthercoverage21(form.getOthercoverage24());
                        a.setOtherCoverageLimit11(form.getOtherCoverageLimit14());
                        a.setOtherCoverageDeductible11(form.getOtherCoverageDeductible14());
                        a.setOtherCoverageLimit21(form.getOtherCoverageLimit24());
                        a.setOtherCoverageDeductible21(form.getOtherCoverageDeductible24());
    	                a.setAdditionalCoverage1(form.getAdditionalcoverage4());
        	        a.setRoofupdated1(form.getRoofupdated4());
            	        a.setHeatingupdated1(form.getHeatingupdated4());
                	a.setElectricalupdated1(form.getElectricalupdated4());
                    	a.setElectricalamps1(form.getElectricalamps4());
	                a.setFireProtectiondistance1(form.getFireProtectiondistance4());
    	                a.setAddress1(form.getAddress4());
        	        a.setBasement1(form.getBasement4());
            	        a.setOwner11(form.getOwnercb4());
                	a.setTruckMan1(form.getTruckMan4());
                    	a.setGrossEarning801(form.getGrossEarningCheckbox4());
	                a.setWallsframe1(form.getWallsframe4());
    	                a.setWallshcb1(form.getWallshcb4());
	                a.setWallssteel1(form.getWallssteel4());
    	                a.setWallsbrick1(form.getWallsbrick4());
        	        a.setRoofwood1(form.getRoofwood4());
            	        a.setRoofsteel1(form.getRoofsteel4());
                	a.setRoofconcrete1(form.getRoofconcrete4());
                    	a.setFloorsconcrete1(form.getFloorsconcrete4());
	                a.setFloorswood1(form.getFloorswood4());
    	                a.setHeatinggas1(form.getHeatinggas4());
        	        a.setHeatingoil1(form.getHeatingoil4());
            	        a.setHeatingelectric1(form.getHeatingelectric4());
                	a.setHeatingother1(form.getHeatingother4());
                    	a.setElectricalbreakers1(form.getElectricalbreakers4());
	                a.setElectricalfuses1(form.getElectricalfuses4());
        	        a.setPlumbingcopper1(form.getPlumbingcopper4());
            	        a.setPlumbingpvc1(form.getPlumbingpvc4());
                	a.setPlumbingother1(form.getPlumbingother4());
                    	a.setFireProtection1(form.getFireProtection4());
	                a.setSecurity1(form.getSecurity4());
                        a.setAge1(form.getAge4());
                        a.setTotalSqFootage1(form.getTotalSqFootage4());
                        a.setInsdSqFootage1(form.getInsdSqFootage4());
                        a.setNoOfStories1(form.getNoOfStories4());  
                }
                break;
                case 5:
                if (!CommonValidations.isStringEmpty(form.getAddress5()))
                {
                        a.setBuildingLimit1(form.getBuildingLimit5());
                        a.setBuildingDeductible1(form.getBuildingDeductible5());
                        a.setContentsLimit1(form.getContentsLimit5());
                        a.setContentsDeductible1(form.getContentsDeductible5());
                        a.setStockLimit1(form.getStockLimit5());
                        a.setStockDeductible1(form.getStockDeductible5());
                        a.setOfficeContentLimit1(form.getOfficeContentLimit5());
                        a.setOfficeContentDeductible1(form.getOfficeContentDeductible5());
                        a.setEdpLimit1(form.getEdpLimit5());
                        a.setEdpDeductible1(form.getEdpDeductible5());
                        a.setEquipmentLimit1(form.getEquipmentLimit5());
                        a.setEquipmentDeductible1(form.getEquipmentDeductible5());
                        a.setOffPremisesLimit1(form.getOffPremisesLimit5());
                        a.setOffPremisesDeductible1(form.getOffPremisesDeductible5());
                        a.setTransitLimit1(form.getTransitLimit5());
                        a.setTransitDeductible1(form.getTransitDeductible5());
                        a.setMiscPropertyLimit1(form.getMiscPropertyLimit5());
                        a.setMiscPropertyDeductible1(form.getMiscPropertyDeductible5());
                        a.setContractorEquipmentLimit1(form.getContractorEquipmentLimit5());
                        a.setContractorEquipmentDeductible1(form.getContractorEquipmentDeductible5());
                        a.setInstallationFloaterLimit1(form.getInstallationFloaterLimit5());
                        a.setInstallationFloaterDeductible1(form.getInstallationFloaterDeductible5());
                        a.setToolFloaterLimit1(form.getToolFloaterLimit5());                    
                        a.setToolFloaterDeductible1(form.getToolFloaterDeductible5());
                        a.setSignFloaterLimit1(form.getSignFloaterLimit5());
                        a.setSignFloaterDeductible1(form.getSignFloaterDeductible5());
                        a.setMotorTruckLimit1(form.getMotorTruckLimit5());
                        a.setMotorTruckDeductible1(form.getMotorTruckDeductible5());
                        a.setGlassLimit1(form.getGlassLimit5());
                        a.setGlassDeductible1(form.getGlassDeductible5());
                        a.setSewerBackupDeductible1(form.getSewerBackupDeductible5());
                        a.setFloodDeductible1(form.getFloodDeductible5());
                        a.setEarthquakeDeductible1(form.getEarthquakeDeductible5());
                        a.setProfitLimit1(form.getProfitLimit5());
                        a.setProfitDeductible1(form.getProfitDeductible5());
                        a.setGrossEarningLimit1(form.getGrossEarningLimit5());
                        a.setGrossEarningDeductible1(form.getGrossEarningDeductible5());
                        a.setRentalIncomeLimit1(form.getRentalIncomeLimit5());
                        a.setRentalIncomeDeductible1(form.getRentalIncomeDeductible5());
                        a.setExtraExpenseLimit1(form.getExtraExpenseLimit5());
                        a.setExtraExpenseDeductible1(form.getExtraExpenseDeductible5());
                        a.setOffPremisesPowerLimit1(form.getOffPremisesLimit5());
                        a.setOffPremisesPowerDeductible1(form.getOffPremisesDeductible5());
                        a.setInsideOutsideLimit1(form.getInsideOutsideLimit5()); 
                        a.setInsideOutsideDeductible1(form.getInsideOutsideDeductible5());
                        a.setBfMoneyLimit1(form.getBfMoneyLimit5());
                        a.setBfMoneyDeductible1(form.getBfMoneyDeductible5());
                        a.setDeopistorForgeryLimit1(form.getDeopistorForgeryLimit5());
                        a.setDeopistorForgeryDeductible1(form.getDeopistorForgeryDeductible5());
                        a.setMoneyOrdersLimit1(form.getMoneyOrdersLimit5());
                        a.setMoneyOrdersDeductible1(form.getMoneyOrdersDeductible5());
                        a.setEmployDishonestyLimit1(form.getEmployDishonestyLimit5());                    
                        a.setEmployDishonestyDeductible1(form.getEmployDishonestyDeductible5());
                        a.setCglLimit1(form.getCglLimit5());
                        a.setCglDeductible1(form.getCglDeductible5());
                        a.setTenantsLegalLimit1(form.getTenantsLegalLimit5());
                        a.setTenantsLegalDeductible1(form.getTenantsLegalDeductible5());
                        a.setNonOwnedAutoLimit1(form.getNonOwnedAutoLimit5());
                        a.setNonOwnedAutoDeductible1(form.getNonOwnedAutoDeductible5());
                        a.setSef96Limit1(form.getSef96Limit5());
                        a.setSef96Deductible1(form.getSef96Deductible5());
                        a.setSef94Limit1(form.getSef94Limit5());
                        a.setSef94Deductible1(form.getSef94Deductible5());
                        a.setDoLimit1(form.getDoLimit5());
                        a.setDoDeductible1(form.getDoDeductible5());
                        a.setEoLimit1(form.getEoLimit5());
                        a.setEoDeductible1(form.getEoDeductible5());
                        a.setEmployerLimit1(form.getEmployerLimit5());
                        a.setEmployerDeductible1(form.getEmployerDeductible5()); 
                        a.setUmbrellaLimit1(form.getUmbrellaLimit5());
                        a.setUmbrellaDeductible1(form.getUmbrellaDeductible5());
                        a.setWrapUpLimit1(form.getWrapUpLimit5());
                        a.setWrapUpDeductible1(form.getWrapUpDeductible5());
                        a.setStdComprehensiveLimit1(form.getStdComprehensiveLimit5());
                        a.setStdComprehensiveDeductible1(form.getStdComprehensiveDeductible5());
                        a.setAirConditioningLimit1(form.getAirConditioningLimit5());
                        a.setAirConditioningDeductible1(form.getAirConditioningDeductible5());
                        a.setProductionMachineryLimit1(form.getProductionMachineryLimit5());
                        a.setProductionMachineryDeductible1(form.getProductionMachineryDeductible5());
                    	a.setOthercoverage11(form.getOthercoverage15());
	                a.setOthercoverage21(form.getOthercoverage25());
                        a.setOtherCoverageLimit11(form.getOtherCoverageLimit15());
                        a.setOtherCoverageDeductible11(form.getOtherCoverageDeductible15());
                        a.setOtherCoverageLimit21(form.getOtherCoverageLimit25());
                        a.setOtherCoverageDeductible21(form.getOtherCoverageDeductible25());
    	                a.setAdditionalCoverage1(form.getAdditionalcoverage5());
        	        a.setRoofupdated1(form.getRoofupdated5());
            	        a.setHeatingupdated1(form.getHeatingupdated5());
                	a.setElectricalupdated1(form.getElectricalupdated5());
                    	a.setElectricalamps1(form.getElectricalamps5());
	                a.setFireProtectiondistance1(form.getFireProtectiondistance5());
    	                a.setAddress1(form.getAddress5());
        	        a.setBasement1(form.getBasement5());
            	        a.setOwner11(form.getOwnercb5());
                	a.setTruckMan1(form.getTruckMan5());
                    	a.setGrossEarning801(form.getGrossEarningCheckbox5());
	                a.setWallsframe1(form.getWallsframe5());
    	                a.setWallshcb1(form.getWallshcb5());
	                a.setWallssteel1(form.getWallssteel5());
    	                a.setWallsbrick1(form.getWallsbrick5());
        	        a.setRoofwood1(form.getRoofwood5());
            	        a.setRoofsteel1(form.getRoofsteel5());
                	a.setRoofconcrete1(form.getRoofconcrete5());
                    	a.setFloorsconcrete1(form.getFloorsconcrete5());
	                a.setFloorswood1(form.getFloorswood5());
    	                a.setHeatinggas1(form.getHeatinggas5());
        	        a.setHeatingoil1(form.getHeatingoil5());
            	        a.setHeatingelectric1(form.getHeatingelectric5());
                	a.setHeatingother1(form.getHeatingother5());
                    	a.setElectricalbreakers1(form.getElectricalbreakers5());
	                a.setElectricalfuses1(form.getElectricalfuses5());
        	        a.setPlumbingcopper1(form.getPlumbingcopper5());
            	        a.setPlumbingpvc1(form.getPlumbingpvc5());
                	a.setPlumbingother1(form.getPlumbingother5());
                    	a.setFireProtection1(form.getFireProtection5());
	                a.setSecurity1(form.getSecurity5());
                        a.setAge1(form.getAge5());
                        a.setTotalSqFootage1(form.getTotalSqFootage5());
                        a.setInsdSqFootage1(form.getInsdSqFootage5());
                        a.setNoOfStories1(form.getNoOfStories5());   
                }
                break;
                case 6:
                if (!CommonValidations.isStringEmpty(form.getAddress6()))
                {
                       a.setBuildingLimit1(form.getBuildingLimit6());
                        a.setBuildingDeductible1(form.getBuildingDeductible6());
                        a.setContentsLimit1(form.getContentsLimit6());
                        a.setContentsDeductible1(form.getContentsDeductible6());
                        a.setStockLimit1(form.getStockLimit6());
                        a.setStockDeductible1(form.getStockDeductible6());
                        a.setOfficeContentLimit1(form.getOfficeContentLimit6());
                        a.setOfficeContentDeductible1(form.getOfficeContentDeductible6());
                        a.setEdpLimit1(form.getEdpLimit6());
                        a.setEdpDeductible1(form.getEdpDeductible6());
                        a.setEquipmentLimit1(form.getEquipmentLimit6());
                        a.setEquipmentDeductible1(form.getEquipmentDeductible6());
                        a.setOffPremisesLimit1(form.getOffPremisesLimit6());
                        a.setOffPremisesDeductible1(form.getOffPremisesDeductible6());
                        a.setTransitLimit1(form.getTransitLimit6());
                        a.setTransitDeductible1(form.getTransitDeductible6());
                        a.setMiscPropertyLimit1(form.getMiscPropertyLimit6());
                        a.setMiscPropertyDeductible1(form.getMiscPropertyDeductible6());
                        a.setContractorEquipmentLimit1(form.getContractorEquipmentLimit6());
                        a.setContractorEquipmentDeductible1(form.getContractorEquipmentDeductible6());
                        a.setInstallationFloaterLimit1(form.getInstallationFloaterLimit6());
                        a.setInstallationFloaterDeductible1(form.getInstallationFloaterDeductible6());
                        a.setToolFloaterLimit1(form.getToolFloaterLimit6());                    
                        a.setToolFloaterDeductible1(form.getToolFloaterDeductible6());
                        a.setSignFloaterLimit1(form.getSignFloaterLimit6());
                        a.setSignFloaterDeductible1(form.getSignFloaterDeductible6());
                        a.setMotorTruckLimit1(form.getMotorTruckLimit6());
                        a.setMotorTruckDeductible1(form.getMotorTruckDeductible6());
                        a.setGlassLimit1(form.getGlassLimit6());
                        a.setGlassDeductible1(form.getGlassDeductible6());
                        a.setSewerBackupDeductible1(form.getSewerBackupDeductible6());
                        a.setFloodDeductible1(form.getFloodDeductible6());
                        a.setEarthquakeDeductible1(form.getEarthquakeDeductible6());
                        a.setProfitLimit1(form.getProfitLimit6());
                        a.setProfitDeductible1(form.getProfitDeductible6());
                        a.setGrossEarningLimit1(form.getGrossEarningLimit6());
                        a.setGrossEarningDeductible1(form.getGrossEarningDeductible6());
                        a.setRentalIncomeLimit1(form.getRentalIncomeLimit6());
                        a.setRentalIncomeDeductible1(form.getRentalIncomeDeductible6());
                        a.setExtraExpenseLimit1(form.getExtraExpenseLimit6());
                        a.setExtraExpenseDeductible1(form.getExtraExpenseDeductible6());
                        a.setOffPremisesPowerLimit1(form.getOffPremisesLimit6());
                        a.setOffPremisesPowerDeductible1(form.getOffPremisesDeductible6());
                        a.setInsideOutsideLimit1(form.getInsideOutsideLimit6()); 
                        a.setInsideOutsideDeductible1(form.getInsideOutsideDeductible6());
                        a.setBfMoneyLimit1(form.getBfMoneyLimit6());
                        a.setBfMoneyDeductible1(form.getBfMoneyDeductible6());
                        a.setDeopistorForgeryLimit1(form.getDeopistorForgeryLimit6());
                        a.setDeopistorForgeryDeductible1(form.getDeopistorForgeryDeductible6());
                        a.setMoneyOrdersLimit1(form.getMoneyOrdersLimit6());
                        a.setMoneyOrdersDeductible1(form.getMoneyOrdersDeductible6());
                        a.setEmployDishonestyLimit1(form.getEmployDishonestyLimit6());                    
                        a.setEmployDishonestyDeductible1(form.getEmployDishonestyDeductible6());
                        a.setCglLimit1(form.getCglLimit6());
                        a.setCglDeductible1(form.getCglDeductible6());
                        a.setTenantsLegalLimit1(form.getTenantsLegalLimit6());
                        a.setTenantsLegalDeductible1(form.getTenantsLegalDeductible6());
                        a.setNonOwnedAutoLimit1(form.getNonOwnedAutoLimit6());
                        a.setNonOwnedAutoDeductible1(form.getNonOwnedAutoDeductible6());
                        a.setSef96Limit1(form.getSef96Limit6());
                        a.setSef96Deductible1(form.getSef96Deductible6());
                        a.setSef94Limit1(form.getSef94Limit6());
                        a.setSef94Deductible1(form.getSef94Deductible6());
                        a.setDoLimit1(form.getDoLimit6());
                        a.setDoDeductible1(form.getDoDeductible6());
                        a.setEoLimit1(form.getEoLimit6());
                        a.setEoDeductible1(form.getEoDeductible6());
                        a.setEmployerLimit1(form.getEmployerLimit6());
                        a.setEmployerDeductible1(form.getEmployerDeductible6()); 
                        a.setUmbrellaLimit1(form.getUmbrellaLimit6());
                        a.setUmbrellaDeductible1(form.getUmbrellaDeductible6());
                        a.setWrapUpLimit1(form.getWrapUpLimit6());
                        a.setWrapUpDeductible1(form.getWrapUpDeductible6());
                        a.setStdComprehensiveLimit1(form.getStdComprehensiveLimit6());
                        a.setStdComprehensiveDeductible1(form.getStdComprehensiveDeductible6());
                        a.setAirConditioningLimit1(form.getAirConditioningLimit6());
                        a.setAirConditioningDeductible1(form.getAirConditioningDeductible6());
                        a.setProductionMachineryLimit1(form.getProductionMachineryLimit6());
                        a.setProductionMachineryDeductible1(form.getProductionMachineryDeductible6());
                    	a.setOthercoverage11(form.getOthercoverage16());
	                a.setOthercoverage21(form.getOthercoverage26());
                        a.setOtherCoverageLimit11(form.getOtherCoverageLimit16());
                        a.setOtherCoverageDeductible11(form.getOtherCoverageDeductible16());
                        a.setOtherCoverageLimit21(form.getOtherCoverageLimit26());
                        a.setOtherCoverageDeductible21(form.getOtherCoverageDeductible26());
    	                a.setAdditionalCoverage1(form.getAdditionalcoverage6());
        	        a.setRoofupdated1(form.getRoofupdated6());
            	        a.setHeatingupdated1(form.getHeatingupdated6());
                	a.setElectricalupdated1(form.getElectricalupdated6());
                    	a.setElectricalamps1(form.getElectricalamps6());
	                a.setFireProtectiondistance1(form.getFireProtectiondistance6());
    	                a.setAddress1(form.getAddress6());
        	        a.setBasement1(form.getBasement6());
            	        a.setOwner11(form.getOwnercb6());
                	a.setTruckMan1(form.getTruckMan6());
                    	a.setGrossEarning801(form.getGrossEarningCheckbox6());
	                a.setWallsframe1(form.getWallsframe6());
    	                a.setWallshcb1(form.getWallshcb6());
	                a.setWallssteel1(form.getWallssteel6());
    	                a.setWallsbrick1(form.getWallsbrick6());
        	        a.setRoofwood1(form.getRoofwood6());
            	        a.setRoofsteel1(form.getRoofsteel6());
                	a.setRoofconcrete1(form.getRoofconcrete6());
                    	a.setFloorsconcrete1(form.getFloorsconcrete6());
	                a.setFloorswood1(form.getFloorswood6());
    	                a.setHeatinggas1(form.getHeatinggas6());
        	        a.setHeatingoil1(form.getHeatingoil6());
            	        a.setHeatingelectric1(form.getHeatingelectric6());
                	a.setHeatingother1(form.getHeatingother6());
                    	a.setElectricalbreakers1(form.getElectricalbreakers6());
	                a.setElectricalfuses1(form.getElectricalfuses6());
        	        a.setPlumbingcopper1(form.getPlumbingcopper6());
            	        a.setPlumbingpvc1(form.getPlumbingpvc6());
                	a.setPlumbingother1(form.getPlumbingother6());
                    	a.setFireProtection1(form.getFireProtection6());
	                a.setSecurity1(form.getSecurity6());
                        a.setAge1(form.getAge6());
                        a.setTotalSqFootage1(form.getTotalSqFootage6());
                        a.setInsdSqFootage1(form.getInsdSqFootage6());
                        a.setNoOfStories1(form.getNoOfStories6());   
                }
                break;
                case 7:
                if (!CommonValidations.isStringEmpty(form.getAddress7()))
                {
                        a.setBuildingLimit1(form.getBuildingLimit7());
                        a.setBuildingDeductible1(form.getBuildingDeductible7());
                        a.setContentsLimit1(form.getContentsLimit7());
                        a.setContentsDeductible1(form.getContentsDeductible7());
                        a.setStockLimit1(form.getStockLimit7());
                        a.setStockDeductible1(form.getStockDeductible7());
                        a.setOfficeContentLimit1(form.getOfficeContentLimit7());
                        a.setOfficeContentDeductible1(form.getOfficeContentDeductible7());
                        a.setEdpLimit1(form.getEdpLimit7());
                        a.setEdpDeductible1(form.getEdpDeductible7());
                        a.setEquipmentLimit1(form.getEquipmentLimit7());
                        a.setEquipmentDeductible1(form.getEquipmentDeductible7());
                        a.setOffPremisesLimit1(form.getOffPremisesLimit7());
                        a.setOffPremisesDeductible1(form.getOffPremisesDeductible7());
                        a.setTransitLimit1(form.getTransitLimit7());
                        a.setTransitDeductible1(form.getTransitDeductible7());
                        a.setMiscPropertyLimit1(form.getMiscPropertyLimit7());
                        a.setMiscPropertyDeductible1(form.getMiscPropertyDeductible7());
                        a.setContractorEquipmentLimit1(form.getContractorEquipmentLimit7());
                        a.setContractorEquipmentDeductible1(form.getContractorEquipmentDeductible7());
                        a.setInstallationFloaterLimit1(form.getInstallationFloaterLimit7());
                        a.setInstallationFloaterDeductible1(form.getInstallationFloaterDeductible7());
                        a.setToolFloaterLimit1(form.getToolFloaterLimit7());                    
                        a.setToolFloaterDeductible1(form.getToolFloaterDeductible7());
                        a.setSignFloaterLimit1(form.getSignFloaterLimit7());
                        a.setSignFloaterDeductible1(form.getSignFloaterDeductible7());
                        a.setMotorTruckLimit1(form.getMotorTruckLimit7());
                        a.setMotorTruckDeductible1(form.getMotorTruckDeductible7());
                        a.setGlassLimit1(form.getGlassLimit7());
                        a.setGlassDeductible1(form.getGlassDeductible7());
                        a.setSewerBackupDeductible1(form.getSewerBackupDeductible7());
                        a.setFloodDeductible1(form.getFloodDeductible7());
                        a.setEarthquakeDeductible1(form.getEarthquakeDeductible7());
                        a.setProfitLimit1(form.getProfitLimit7());
                        a.setProfitDeductible1(form.getProfitDeductible7());
                        a.setGrossEarningLimit1(form.getGrossEarningLimit7());
                        a.setGrossEarningDeductible1(form.getGrossEarningDeductible7());
                        a.setRentalIncomeLimit1(form.getRentalIncomeLimit7());
                        a.setRentalIncomeDeductible1(form.getRentalIncomeDeductible7());
                        a.setExtraExpenseLimit1(form.getExtraExpenseLimit7());
                        a.setExtraExpenseDeductible1(form.getExtraExpenseDeductible7());
                        a.setOffPremisesPowerLimit1(form.getOffPremisesLimit7());
                        a.setOffPremisesPowerDeductible1(form.getOffPremisesDeductible7());
                        a.setInsideOutsideLimit1(form.getInsideOutsideLimit7()); 
                        a.setInsideOutsideDeductible1(form.getInsideOutsideDeductible7());
                        a.setBfMoneyLimit1(form.getBfMoneyLimit7());
                        a.setBfMoneyDeductible1(form.getBfMoneyDeductible7());
                        a.setDeopistorForgeryLimit1(form.getDeopistorForgeryLimit7());
                        a.setDeopistorForgeryDeductible1(form.getDeopistorForgeryDeductible7());
                        a.setMoneyOrdersLimit1(form.getMoneyOrdersLimit7());
                        a.setMoneyOrdersDeductible1(form.getMoneyOrdersDeductible7());
                        a.setEmployDishonestyLimit1(form.getEmployDishonestyLimit7());                    
                        a.setEmployDishonestyDeductible1(form.getEmployDishonestyDeductible7());
                        a.setCglLimit1(form.getCglLimit7());
                        a.setCglDeductible1(form.getCglDeductible7());
                        a.setTenantsLegalLimit1(form.getTenantsLegalLimit7());
                        a.setTenantsLegalDeductible1(form.getTenantsLegalDeductible7());
                        a.setNonOwnedAutoLimit1(form.getNonOwnedAutoLimit7());
                        a.setNonOwnedAutoDeductible1(form.getNonOwnedAutoDeductible7());
                        a.setSef96Limit1(form.getSef96Limit7());
                        a.setSef96Deductible1(form.getSef96Deductible7());
                        a.setSef94Limit1(form.getSef94Limit7());
                        a.setSef94Deductible1(form.getSef94Deductible7());
                        a.setDoLimit1(form.getDoLimit7());
                        a.setDoDeductible1(form.getDoDeductible7());
                        a.setEoLimit1(form.getEoLimit7());
                        a.setEoDeductible1(form.getEoDeductible7());
                        a.setEmployerLimit1(form.getEmployerLimit7());
                        a.setEmployerDeductible1(form.getEmployerDeductible7()); 
                        a.setUmbrellaLimit1(form.getUmbrellaLimit7());
                        a.setUmbrellaDeductible1(form.getUmbrellaDeductible7());
                        a.setWrapUpLimit1(form.getWrapUpLimit7());
                        a.setWrapUpDeductible1(form.getWrapUpDeductible7());
                        a.setStdComprehensiveLimit1(form.getStdComprehensiveLimit7());
                        a.setStdComprehensiveDeductible1(form.getStdComprehensiveDeductible7());
                        a.setAirConditioningLimit1(form.getAirConditioningLimit7());
                        a.setAirConditioningDeductible1(form.getAirConditioningDeductible7());
                        a.setProductionMachineryLimit1(form.getProductionMachineryLimit7());
                        a.setProductionMachineryDeductible1(form.getProductionMachineryDeductible7());
                    	a.setOthercoverage11(form.getOthercoverage17());
	                a.setOthercoverage21(form.getOthercoverage27());
                        a.setOtherCoverageLimit11(form.getOtherCoverageLimit17());
                        a.setOtherCoverageDeductible11(form.getOtherCoverageDeductible17());
                        a.setOtherCoverageLimit21(form.getOtherCoverageLimit27());
                        a.setOtherCoverageDeductible21(form.getOtherCoverageDeductible27());
    	                a.setAdditionalCoverage1(form.getAdditionalcoverage7());
        	        a.setRoofupdated1(form.getRoofupdated7());
            	        a.setHeatingupdated1(form.getHeatingupdated7());
                	a.setElectricalupdated1(form.getElectricalupdated7());
                    	a.setElectricalamps1(form.getElectricalamps7());
	                a.setFireProtectiondistance1(form.getFireProtectiondistance7());
    	                a.setAddress1(form.getAddress7());
        	        a.setBasement1(form.getBasement7());
            	        a.setOwner11(form.getOwnercb7());
                	a.setTruckMan1(form.getTruckMan7());
                    	a.setGrossEarning801(form.getGrossEarningCheckbox7());
	                a.setWallsframe1(form.getWallsframe7());
    	                a.setWallshcb1(form.getWallshcb7());
	                a.setWallssteel1(form.getWallssteel7());
    	                a.setWallsbrick1(form.getWallsbrick7());
        	        a.setRoofwood1(form.getRoofwood7());
            	        a.setRoofsteel1(form.getRoofsteel7());
                	a.setRoofconcrete1(form.getRoofconcrete7());
                    	a.setFloorsconcrete1(form.getFloorsconcrete7());
	                a.setFloorswood1(form.getFloorswood7());
    	                a.setHeatinggas1(form.getHeatinggas7());
        	        a.setHeatingoil1(form.getHeatingoil7());
            	        a.setHeatingelectric1(form.getHeatingelectric7());
                	a.setHeatingother1(form.getHeatingother7());
                    	a.setElectricalbreakers1(form.getElectricalbreakers7());
	                a.setElectricalfuses1(form.getElectricalfuses7());
        	        a.setPlumbingcopper1(form.getPlumbingcopper7());
            	        a.setPlumbingpvc1(form.getPlumbingpvc7());
                	a.setPlumbingother1(form.getPlumbingother7());
                    	a.setFireProtection1(form.getFireProtection7());
	                a.setSecurity1(form.getSecurity7());
                        a.setAge1(form.getAge7());
                        a.setTotalSqFootage1(form.getTotalSqFootage7());
                        a.setInsdSqFootage1(form.getInsdSqFootage7());
                        a.setNoOfStories1(form.getNoOfStories7());
                }
                        break; 
                }
                    System.out.println(i);
                        System.out.println("above");
                listAddInfo.add(a);
                }
                
                buildinglimit.setText(Double.toString(form.getBuildingLimit()));
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
                offpremisespowerdeductible.setText(Double.toString(form.getOffPremisesDeductible()));
                offpremisespowerlimit.setText(Double.toString(form.getOffPremisesLimit()));
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
                additionalcoverage.setText(form.getAdditionalcoverage());
                locationaddress.setText(form.getAddress());
                locationage.setText(Integer.toString(form.getAge()));
                totsqfootage.setText(Double.toString(form.getTotalSqFootage()));
                insidesqfootage.setText(Double.toString(form.getInsdSqFootage()));
                noofstories.setText(Integer.toString(form.getNoOfStories()));
                roofupdated.setText(form.getRoofupdated());
                heatingupdated.setText(form.getHeatingupdated());
                electricalupdated.setText(form.getElectricalupdated());
                amps.setText(form.getElectricalamps());
                fireprotectiondistance.setText(form.getFireProtectiondistance());
                if ((form.getType().equals("Both")) || (form.getType().equals("Auto"))) {
                    if (form.getPremiumTarget() > 0) {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setautopremiumtarget(Double.toString(form.getPremiumTarget()));
                    }
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setautocurrentinsurer(form.getCurrentInsurer());
                    if (form.getCurrentExpDate() == null) {
                    } else {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).datePicker11.setSelectedDate(form.getCurrentExpDate().toGregorianCalendar().getTime());
                    }
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setlessholder1(form.getLienHolders1());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setlessholder2(form.getLienHolders2());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setlessholder3(form.getLienHolders3());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setautovehicle1(form.getLienHoldersVehicle1());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setautovehicle2(form.getLienHoldersVehicle2());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setautovehicle3(form.getLienHoldersVehicle3());
                    if (form.getClaimDate1() == null) {
                    } else {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).datePicker12.setSelectedDate(form.getClaimDate1().toGregorianCalendar().getTime());
                    }
                    if (form.getClaimDate2() == null) {
                    } else {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).datePicker13.setSelectedDate(form.getClaimDate2().toGregorianCalendar().getTime());
                    }
                    if (form.getClaimDate3() == null) {
                    } else {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).datePicker14.setSelectedDate(form.getClaimDate3().toGregorianCalendar().getTime());
                    }
                    if (form.getClaimDate4() == null) {
                    } else {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).datePicker15.setSelectedDate(form.getClaimDate4().toGregorianCalendar().getTime());
                    }
                    if (form.getClaimDate5() == null) {
                    } else {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).datePicker16.setSelectedDate(form.getClaimDate5().toGregorianCalendar().getTime());
                    }
                    if (form.getClaimDate6() == null) {
                    } else {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).datePicker17.setSelectedDate(form.getClaimDate6().toGregorianCalendar().getTime());
                    }
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setcommoditiestransported(form.getCommoditiesTransportedBy());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setliststate1(form.getFilingState1());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setliststate2(form.getFilingState2());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setliststate3(form.getFilingState3());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setusdot1(form.getFilingUSDot1());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setusdot2(form.getFilingUSDot2());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setusdot3(form.getFilingUSDot3());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setdocket1(form.getDilingDocket1());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setdocket2(form.getDilingDocket2());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setdocket3(form.getDilingDocket3());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.settypeoffiling1(form.getFilingType1());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.settypeoffiling2(form.getFilingType2());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.settypeoffiling3(form.getFilingType3());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setnamerequired1(form.getFilingName1());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setnamerequired2(form.getFilingName2());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setnamerequired3(form.getFilingName3());
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.settypeofnonowned(form.getTypeOfNonOwned());
                    if (form.getAvgNoOfVehicles() > 0) {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setanytime(String.valueOf(form.getAvgNoOfVehicles()));
                    }
                    if (form.getAvgValue() > 0) {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setavgvalue(String.valueOf(form.getAvgValue()));
                    }
                    if (form.getMaxVehicleValue() > 0) {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setmaxannually(String.valueOf(form.getMaxVehicleValue()));
                    }
                    if (form.getMaxCostValue() > 0) {
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setmostexpensive(String.valueOf(form.getMaxCostValue()));
                    }
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).binding4.setautosubmissioncomments(form.getInstructionNotes());
                    //method to send value in Autocontroller
                    ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).autoviewmethod(form.getHaulingForOthers(), form.getVehicleNonOwned(), form.getContract());
                }
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
        stage.show();
        Task task;
        task = new Task<Void>() {
            @Override
            public Void call() throws Exception {

                try {
                    System.out.println("edit " + isEdit);
                    if (isEdit) {
                        System.out.println("View Application");
                        InsuranceOperationsService_Service port = new InsuranceOperationsService_Service();
                        EditFormSubmissionRequest req1 = new EditFormSubmissionRequest();

                        req1.setProducer(produceridfromform);
                        System.out.println(insurancetypeflag);
                        req1.setBranch(branchfromform);

                        req1.setCreationDate(datefromform);
                        if (insurancetypeflag == 1) {
                            req1.setType("Commercial");
                        } else if (insurancetypeflag == 2) {
                            req1.setType("Auto");
                        } else if (insurancetypeflag == 3) {
                            req1.setType("Both");
                        }
                        //choicebox
                        req1.setFormId(getFormId());
                        req1.setSeverity(binding.getSeverity());
                        req1.setEntityType(binding.getEntityType());
                        req1.setFinancialYearEnd(binding2.getfinYearEnd());
                        req1.setGroupBenefits(binding2.getgroupBenefits());
                        req1.setPensionPlan(binding2.getpensionPlan());
                        req1.setBasement(binding4.getbasement());
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
                        req1.setAddressOfLocationOwnedno3(binding3.getaolownedy4());
                        req1.setOwnercb(binding4.getmotortruckcargoowner());
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
                        req1.setOtherSpecify(binding.getOtherSpecify());
                        req1.setRelatedExperience(binding.getRelatedExperience());
                        req1.setOwner1(binding.getOwner1());
                        req1.setOwner2(binding.getOwner2());
                        req1.setOwner3(binding.getOwner3());
                        req1.setOwner4(binding.getOwner4());
                        req1.setBoardOfDirector1(binding.getBod1());
                        req1.setBoardOfDirector2(binding.getBod2());
                        req1.setBoardOfDirector3(binding.getBod3());
                        req1.setBoardOfDirector4(binding.getBod4());

                        if (!CommonValidations.isStringEmpty(binding.getNoOfLocations())) {
                            req1.setNumberOfLocations(Integer.parseInt(binding.getNoOfLocations()));
                        }
                        if (!CommonValidations.isStringEmpty(binding.getNoOfOwnedAutos())) {
                            req1.setNumberOfOwnedAutos(Integer.parseInt(binding.getNoOfOwnedAutos()));
                        }
                        if (!CommonValidations.isStringEmpty(binding.getYears())) {
                            req1.setYearInBusiness(Integer.parseInt(binding.getYears()));
                        }
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
                            req1.setPercentageOfUSSales(Double.parseDouble(binding2.getperOfUsSales()));
                        }
                        if (!CommonValidations.isStringEmpty(binding2.getperOfOnPremises())) {
                            req1.setOnpremises(Integer.parseInt(binding2.getperOfOnPremises()));
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
                        if (datePicker.getSelectedDate() != null) {
                            c1.setTime(datePicker.getSelectedDate());
                            XMLGregorianCalendar date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c1);
                            req1.setPastClaimDate1(date1);
                        }

                        GregorianCalendar c2 = new GregorianCalendar();
                        if (datePicker1.getSelectedDate() != null) {
                            c2.setTime(datePicker1.getSelectedDate());
                            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c2);
                            req1.setPastClaimDate2(date2);
                        }

                        GregorianCalendar c3 = new GregorianCalendar();
                        if (datePicker2.getSelectedDate() != null) {
                            c3.setTime(datePicker2.getSelectedDate());
                            XMLGregorianCalendar date3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c3);
                            req1.setPastClaimDate3(date3);
                        }

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
                        if (datePicker3.getSelectedDate() != null) {
                            c4.setTime(datePicker3.getSelectedDate());
                            XMLGregorianCalendar date4 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c4);
                            req1.setCurrentInsuranceExpiry1(date4);
                        }

                        GregorianCalendar c5 = new GregorianCalendar();
                        if (datePicker4.getSelectedDate() != null) {
                            c5.setTime(datePicker4.getSelectedDate());
                            XMLGregorianCalendar date5 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c5);
                            req1.setCurrentInsuranceExpiry2(date5);
                        }

                        GregorianCalendar c6 = new GregorianCalendar();
                        if (datePicker5.getSelectedDate() != null) {
                            c6.setTime(datePicker5.getSelectedDate());
                            XMLGregorianCalendar date6 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c6);
                            req1.setCurrentInsuranceExpiry3(date6);
                        }

                        req1.setLineHolders1(binding3.getlienholder1());
                        req1.setLineHolders2(binding3.getlienholder2());
                        req1.setLineHolders3(binding3.getlienholder3());
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

                        // View Application Commercial Property
                        if (!CommonValidations.isStringEmpty(binding4.getbuildinglimit())) {
                            req1.setBuildingLimit(Double.parseDouble(binding4.getbuildinglimit()));
                        }
                        if (!CommonValidations.isStringEmpty(binding4.getbuildingdeductible())) {
                            req1.setBuildingDeductible(Double.parseDouble(binding4.getbuildingdeductible()));
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

                        if (!CommonValidations.isStringEmpty(binding4.getsef96deductible())) {
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

                        req1.setOthercoverage1(binding4.getothercoverage1());
                        req1.setOthercoverage2(binding4.getothercoverage2());
                        req1.setOtherCoverageLimit1(Double.parseDouble(binding4.getothercoverage1limit()));
                        req1.setOtherCoverageDeductible1(Double.parseDouble(binding4.getothercoverage1deductible()));
                        req1.setOtherCoverageLimit2(Double.parseDouble(binding4.getothercoverage2limit()));
                        req1.setOtherCoverageDeductible2(Double.parseDouble(binding4.getothercoverage2deductible()));
                        req1.setAdditionalcoverage(binding4.getadditionalcoverage());
                        req1.setRoofupdated(binding4.getroofupdated());
                        req1.setHeatingupdated(binding4.getheatingupdated());
                        req1.setElectricalupdated(binding4.getelectricalupdated());
                        req1.setElectricalamps(binding4.getnoofamps());
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
                            System.out.println("View file" + fileList.size());
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
                                i++;
                            }
                        }
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
                            stopLoading();
                            e.printStackTrace();
                            errors(e.getMessage());
                        } finally {
                            if (b != null) {
                                b.close();
                            }
                        }

                        //HTMLToPDF.convertHtmlToPdf(new File("pdf.html").getAbsolutePath());
                        CommonResponseAttributes response = port.getInsuranceOperationsPort().editFormSubmission(req1);
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            stopLoading();
                            System.out.println("Insurance type flag"+insurancetypeflag);
                            if (insurancetypeflag == 2 || insurancetypeflag == 3) {
                                String str = "Application has been successfully updated.";
                                isEdit=false;
                                ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).autosuccessMessage(str);
                            } else {
                                isEdit=false;
                                successMessage("Application has been successfully updated.");
                            }
                        } else {
                            stopLoading();
                            if (insurancetypeflag == 2 || insurancetypeflag == 3) {
                                String str = response.getErrorMessage();
                                ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).autoerrorMessage(str);
                            }
                            else{
                            errors(response.getErrorMessage());}
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
                        req1.setAddressOfLocationOwnedno3(binding3.getaolownedy4());

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

                        if (!CommonValidations.isStringEmpty(binding.getNoOfLocations())) {
                            req1.setNumberOfLocations(Integer.parseInt(binding.getNoOfLocations()));
                        }
                        if (!CommonValidations.isStringEmpty(binding.getNoOfOwnedAutos())) {
                            req1.setNumberOfOwnedAutos(Integer.parseInt(binding.getNoOfOwnedAutos()));
                        }
                        if (!CommonValidations.isStringEmpty(binding.getYears())) {
                            req1.setYearInBusiness(Integer.parseInt(binding.getYears()));
                        }

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
                            req1.setPercentageOfUSSales(Double.parseDouble(binding2.getperOfUsSales()));
                        }
                        if (!CommonValidations.isStringEmpty(binding2.getperOfOnPremises())) {
                            req1.setOnpremises(Integer.parseInt(binding2.getperOfOnPremises()));
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
                        if (datePicker.getSelectedDate() != null) {
                            c1.setTime(datePicker.getSelectedDate());
                            XMLGregorianCalendar date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c1);
                            req1.setPastClaimDate1(date1);
                        }

                        GregorianCalendar c2 = new GregorianCalendar();
                        if (datePicker1.getSelectedDate() != null) {
                            c2.setTime(datePicker1.getSelectedDate());
                            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c2);
                            req1.setPastClaimDate2(date2);
                        }

                        GregorianCalendar c3 = new GregorianCalendar();
                        if (datePicker2.getSelectedDate() != null) {
                            c3.setTime(datePicker2.getSelectedDate());
                            XMLGregorianCalendar date3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c3);
                            req1.setPastClaimDate3(date3);
                        }

                        GregorianCalendar c4 = new GregorianCalendar();
                        if (datePicker3.getSelectedDate() != null) {
                            c4.setTime(datePicker3.getSelectedDate());
                            XMLGregorianCalendar date4 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c4);
                            req1.setCurrentInsuranceExpiry1(date4);
                        }

                        GregorianCalendar c5 = new GregorianCalendar();
                        if (datePicker4.getSelectedDate() != null) {
                            c5.setTime(datePicker4.getSelectedDate());
                            XMLGregorianCalendar date5 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c5);
                            req1.setCurrentInsuranceExpiry2(date5);
                        }

                        GregorianCalendar c6 = new GregorianCalendar();
                        if (datePicker5.getSelectedDate() != null) {
                            c6.setTime(datePicker5.getSelectedDate());
                            XMLGregorianCalendar date6 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c6);
                            req1.setCurrentInsuranceExpiry3(date6);
                        }

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

                        // Vehicle Details
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

                        int i = 0;
                        //yahape
                        for (AddAnotherInfo a : listAddInfo) {
                            switch (i) {
                                case 0:
                                    req1.setAddress(a.getAddress1());
                                    req1.setBasement(a.getBasement1());
                                    req1.setOwnercb(a.getOwner11());
                                    req1.setTruckMan(a.getTruckMan1());
                                    req1.setGrossEarningCheckBox(a.getGrossEarning801());
                                    req1.setWallsframe(a.getWallsframe1());
                                    req1.setWallshcb(a.getWallshcb1());
                                    req1.setWallssteel(a.getWallssteel1());
                                    req1.setWallsbrick(a.getWallsbrick1());
                                    req1.setRoofwood(a.getRoofwood1());
                                    req1.setRoofsteel(a.getRoofsteel1());
                                    req1.setRoofconcrete(a.getRoofconcrete1());
                                    req1.setFloorsconcrete(a.getFloorsconcrete1());
                                    req1.setFloorswood(a.getFloorswood1());
                                    req1.setHeatinggas(a.getHeatinggas1());
                                    req1.setHeatingoil(a.getHeatingoil1());
                                    req1.setHeatingelectric(a.getHeatingelectric1());
                                    req1.setHeatingother(a.getHeatingother1());
                                    req1.setElectricalbreakers(a.getElectricalbreakers1());
                                    req1.setElectricalfuses(a.getElectricalfuses1());
                                    req1.setElectricalamps(a.getElectricalamps1());
                                    req1.setPlumbingcopper(a.getPlumbingcopper1());
                                    req1.setPlumbingpvc(a.getPlumbingpvc1());
                                    req1.setPlumbingother(a.getPlumbingother1());
                                    req1.setFireProtection(a.getFireProtection1());
                                    req1.setSecurity(a.getSecurity1());
                                    req1.setBuildingLimit(a.getBuildingLimit1());
                                    if (a.getBuildingDeductible1() > 0) {
                                        req1.setBuildingDeductible(a.getBuildingDeductible1());
                                    }
                                    if (a.getContentsLimit1() > 0) {
                                        req1.setContentsLimit(a.getContentsLimit1());
                                    }
                                    if (a.getContentsDeductible1() > 0) {
                                        req1.setContentsDeductible(a.getContentsDeductible1());
                                    }
                                    if (a.getStockLimit1() > 0) {
                                        req1.setStockLimit(a.getStockLimit1());
                                    }
                                    if (a.getStockDeductible1() > 0) {
                                        req1.setStockDeductible(a.getStockDeductible1());
                                    }
                                    if (a.getOfficeContentLimit1() > 0) {
                                        req1.setOfficeContentLimit(a.getOfficeContentLimit1());
                                    }
                                    if (a.getOfficeContentDeductible1() > 0) {
                                        req1.setOfficeContentDeductible(a.getOfficeContentDeductible1());
                                    }
                                    if (a.getEdpLimit1() > 0) {
                                        req1.setEdpLimit(a.getEdpLimit1());
                                    }
                                    if (a.getEdpDeductible1() > 0) {
                                        req1.setEdpDeductible(a.getEdpDeductible1());
                                    }
                                    if (a.getEquipmentLimit1() > 0) {
                                        req1.setEquipmentLimit(a.getEquipmentLimit1());
                                    }

                                    if (a.getEquipmentDeductible1() > 0) {
                                        req1.setEquipmentDeductible(a.getEquipmentDeductible1());
                                    }

                                    if (a.getOffPremisesLimit1() > 0) {
                                        req1.setOffPremisesLimit(a.getOffPremisesLimit1());
                                    }
                                    if (a.getOffPremisesDeductible1() > 0) {
                                        req1.setOffPremisesDeductible(a.getOffPremisesDeductible1());
                                    }
                                    if (a.getTransitLimit1() > 0) {
                                        req1.setTransitLimit(a.getTransitLimit1());
                                    }

                                    if (a.getTransitDeductible1() > 0) {
                                        req1.setTransitDeductible(a.getTransitDeductible1());
                                    }

                                    req1.setMiscPropertyLimit(a.getMiscPropertyLimit1());
                                    req1.setMiscPropertyDeductible(a.getMiscPropertyDeductible1());
                                    req1.setContractorEquipmentLimit(a.getContractorEquipmentLimit1());
                                    req1.setContractorEquipmentDeductible(a.getContractorEquipmentDeductible1());
                                    req1.setInstallationFloaterLimit(a.getInstallationFloaterLimit1());
                                    req1.setInstallationFloaterDeductible(a.getInstallationFloaterDeductible1());
                                    req1.setToolFloaterLimit(a.getToolFloaterLimit1());
                                    req1.setToolFloaterDeductible(a.getToolFloaterDeductible1());
                                    req1.setSignFloaterLimit(a.getSignFloaterLimit1());
                                    req1.setSignFloaterDeductible(a.getSignFloaterDeductible1());
                                    req1.setMotorTruckLimit(a.getMotorTruckLimit1());
                                    req1.setMotorTruckDeductible(a.getMotorTruckDeductible1());
                                    req1.setGlassLimit(a.getGlassLimit1());
                                    req1.setGlassDeductible(a.getGlassDeductible1());
                                    req1.setSewerBackupDeductible(a.getSewerBackupDeductible1());
                                    req1.setFloodDeductible(a.getFloodDeductible1());
                                    req1.setEarthquakeDeductible(a.getEarthquakeDeductible1());
                                    req1.setProfitLimit(a.getProfitLimit1());
                                    req1.setProfitDeductible(a.getProfitDeductible1());
                                    req1.setGrossEarningLimit(a.getGrossEarningLimit1());
                                    req1.setGrossEarningDeductible(a.getGrossEarningDeductible1());
                                    req1.setRentalIncomeLimit(a.getRentalIncomeLimit1());
                                    req1.setRentalIncomeDeductible(a.getRentalIncomeDeductible1());
                                    req1.setExtraExpenseLimit(a.getExtraExpenseLimit1());
                                    req1.setExtraExpenseDeductible(a.getExtraExpenseDeductible1());
                                    req1.setOffPremisesPowerLimit(a.getOffPremisesLimit1());
                                    req1.setOffPremisesPowerDeductible(a.getOffPremisesDeductible1());
                                    req1.setInsideOutsideLimit(a.getInsideOutsideLimit1());
                                    req1.setInsideOutsideDeductible(a.getInsideOutsideDeductible1());
                                    req1.setBfMoneyLimit(a.getBfMoneyLimit1());
                                    req1.setBfMoneyDeductible(a.getBfMoneyDeductible1());
                                    req1.setDeopistorForgeryLimit(a.getDeopistorForgeryLimit1());
                                    req1.setDeopistorForgeryDeductible(a.getDeopistorForgeryDeductible1());
                                    req1.setMoneyOrdersLimit(a.getMoneyOrdersLimit1());
                                    req1.setMoneyOrdersDeductible(a.getMoneyOrdersDeductible1());
                                    req1.setEmployDishonestyLimit(a.getEmployDishonestyLimit1());
                                    req1.setEmployDishonestyDeductible(a.getEmployDishonestyDeductible1());
                                    req1.setCglLimit(a.getCglLimit1());
                                    req1.setCglDeductible(a.getCglDeductible1());
                                    req1.setTenantsLegalLimit(a.getTenantsLegalLimit1());
                                    req1.setTenantsLegalDeductible(a.getTenantsLegalDeductible1());
                                    req1.setNonOwnedAutoLimit(a.getNonOwnedAutoLimit1());
                                    req1.setNonOwnedAutoDeductible(a.getNonOwnedAutoDeductible1());
                                    req1.setSef96Limit(a.getSef96Limit1());
                                    req1.setSef96Deductible(a.getSef96Deductible1());
                                    req1.setSef94Limit(a.getSef94Limit1());
                                    req1.setSef94Deductible(a.getSef94Deductible1());
                                    req1.setDoLimit(a.getDoLimit1());
                                    req1.setDoDeductible(a.getDoDeductible1());
                                    req1.setEoLimit(a.getEoLimit1());
                                    req1.setEoDeductible(a.getEoDeductible1());
                                    req1.setEmployerLimit(a.getEmployerLimit1());
                                    req1.setEmployerDeductible(a.getEmployerDeductible1());
                                    req1.setUmbrellaLimit(a.getUmbrellaLimit1());
                                    req1.setUmbrellaDeductible(a.getUmbrellaDeductible1());
                                    req1.setWrapUpLimit(a.getWrapUpLimit1());
                                    req1.setWrapUpDeductible(a.getWrapUpDeductible1());
                                    req1.setStdComprehensiveLimit(a.getStdComprehensiveLimit1());
                                    req1.setStdComprehensiveDeductible(a.getStockDeductible1());
                                    req1.setAirConditioningLimit(a.getAirConditioningLimit1());
                                    req1.setAirConditioningDeductible(a.getAirConditioningDeductible1());
                                    req1.setProductionMachineryLimit(a.getProductionMachineryLimit1());
                                    req1.setProductionMachineryDeductible(a.getProductionMachineryDeductible1());
                                    req1.setOthercoverage1(a.getOthercoverage11());
                                    req1.setOthercoverage2(a.getOthercoverage21());
                                    req1.setOtherCoverageLimit1(a.getOtherCoverageLimit11());
                                    req1.setOtherCoverageDeductible1(a.getOtherCoverageDeductible11());
                                    req1.setOtherCoverageLimit2(a.getOtherCoverageLimit21());
                                    req1.setOtherCoverageDeductible2(a.getOtherCoverageDeductible21());
                                    req1.setAdditionalcoverage(a.getAdditionalCoverage1());
                                    req1.setRoofupdated(a.getRoofupdated1());
                                    req1.setHeatingupdated(a.getHeatingupdated1());
                                    req1.setElectricalupdated(a.getElectricalupdated1());
                                    req1.setElectricalamps(a.getElectricalamps1());
                                    req1.setFireProtectiondistance(a.getFireProtectiondistance1());
                                    req1.setAge(a.getAge1());
                                    req1.setTotalSqFootage(a.getTotalSqFootage1());
                                    req1.setInsdSqFootage(a.getInsdSqFootage1());
                                    req1.setNoOfStories(a.getNoOfStories1());
                                    break;
                                case 1:
                                    req1.setAddress1(a.getAddress1());
                                    req1.setBasement1(a.getBasement1());
                                    req1.setOwner1(a.getOwner11());
                                    req1.setTruckMan1(a.getTruckMan1());
                                    req1.setGrossEarningCheckbox1(a.getGrossEarning801());
                                    req1.setWallsframe1(a.getWallsframe1());
                                    req1.setWallshcb1(a.getWallshcb1());
                                    req1.setWallssteel1(a.getWallssteel1());
                                    req1.setWallsbrick1(a.getWallsbrick1());
                                    req1.setRoofwood1(a.getRoofwood1());
                                    req1.setRoofsteel1(a.getRoofsteel1());
                                    req1.setRoofconcrete1(a.getRoofconcrete1());
                                    req1.setFloorsconcrete1(a.getFloorsconcrete1());
                                    req1.setFloorswood1(a.getFloorswood1());
                                    req1.setHeatinggas1(a.getHeatinggas1());
                                    req1.setHeatingoil1(a.getHeatingoil1());
                                    req1.setHeatingelectric1(a.getHeatingelectric1());
                                    req1.setHeatingother1(a.getHeatingother1());
                                    req1.setElectricalbreakers1(a.getElectricalbreakers1());
                                    req1.setElectricalfuses1(a.getElectricalfuses1());
                                    req1.setElectricalamps1(a.getElectricalamps1());
                                    req1.setPlumbingcopper1(a.getPlumbingcopper1());
                                    req1.setPlumbingpvc1(a.getPlumbingpvc1());
                                    req1.setPlumbingother1(a.getPlumbingother1());
                                    req1.setFireProtection1(a.getFireProtection1());
                                    req1.setSecurity1(a.getSecurity1());
                                    req1.setBuildingLimit1(a.getBuildingLimit1());
                                    req1.setBuildingDeductible1(a.getBuildingDeductible1());
                                    req1.setContentsLimit1(a.getContentsLimit1());

                                    req1.setContentsDeductible1(a.getContentsDeductible1());

                                    req1.setStockLimit1(a.getStockLimit1());

                                    req1.setStockDeductible1(a.getStockDeductible1());

                                    req1.setOfficeContentLimit1(a.getOfficeContentLimit1());

                                    req1.setOfficeContentDeductible1(a.getOfficeContentDeductible1());

                                    req1.setEdpLimit1(a.getEdpLimit1());

                                    req1.setEdpDeductible1(a.getEdpDeductible1());

                                    req1.setEquipmentLimit1(a.getEquipmentLimit1());

                                    req1.setEquipmentDeductible1(a.getEquipmentDeductible1());

                                    req1.setOffPremisesLimit1(a.getOffPremisesLimit1());

                                    req1.setOffPremisesDeductible1(a.getOffPremisesDeductible1());

                                    req1.setTransitLimit1(a.getTransitLimit1());

                                    req1.setTransitDeductible1(a.getTransitDeductible1());

                                    req1.setMiscPropertyLimit1(a.getMiscPropertyLimit1());
                                    req1.setMiscPropertyDeductible1(a.getMiscPropertyDeductible1());
                                    req1.setContractorEquipmentLimit1(a.getContractorEquipmentLimit1());
                                    req1.setContractorEquipmentDeductible1(a.getContractorEquipmentDeductible1());
                                    req1.setInstallationFloaterLimit1(a.getInstallationFloaterLimit1());
                                    req1.setInstallationFloaterDeductible1(a.getInstallationFloaterDeductible1());
                                    req1.setToolFloaterLimit1(a.getToolFloaterLimit1());
                                    req1.setToolFloaterDeductible1(a.getToolFloaterDeductible1());
                                    req1.setSignFloaterLimit1(a.getSignFloaterLimit1());
                                    req1.setSignFloaterDeductible1(a.getSignFloaterDeductible1());
                                    req1.setMotorTruckLimit1(a.getMotorTruckLimit1());
                                    req1.setMotorTruckDeductible1(a.getMotorTruckDeductible1());
                                    req1.setGlassLimit1(a.getGlassLimit1());
                                    req1.setGlassDeductible1(a.getGlassDeductible1());
                                    req1.setSewerBackupDeductible1(a.getSewerBackupDeductible1());
                                    req1.setFloodDeductible1(a.getFloodDeductible1());
                                    req1.setEarthquakeDeductible1(a.getEarthquakeDeductible1());
                                    req1.setProfitLimit1(a.getProfitLimit1());
                                    req1.setProfitDeductible1(a.getProfitDeductible1());
                                    req1.setGrossEarningLimit1(a.getGrossEarningLimit1());
                                    req1.setGrossEarningDeductible1(a.getGrossEarningDeductible1());
                                    req1.setRentalIncomeLimit1(a.getRentalIncomeLimit1());
                                    req1.setRentalIncomeDeductible1(a.getRentalIncomeDeductible1());
                                    req1.setExtraExpenseLimit1(a.getExtraExpenseLimit1());
                                    req1.setExtraExpenseDeductible1(a.getExtraExpenseDeductible1());
                                    req1.setOffPremisesPowerLimit1(a.getOffPremisesLimit1());
                                    req1.setOffPremisesPowerDeductible1(a.getOffPremisesDeductible1());
                                    req1.setInsideOutsideLimit1(a.getInsideOutsideLimit1());
                                    req1.setInsideOutsideDeductible1(a.getInsideOutsideDeductible1());
                                    req1.setBfMoneyLimit1(a.getBfMoneyLimit1());
                                    req1.setBfMoneyDeductible1(a.getBfMoneyDeductible1());
                                    req1.setDeopistorForgeryLimit1(a.getDeopistorForgeryLimit1());
                                    req1.setDeopistorForgeryDeductible1(a.getDeopistorForgeryDeductible1());
                                    req1.setMoneyOrdersLimit1(a.getMoneyOrdersLimit1());
                                    req1.setMoneyOrdersDeductible1(a.getMoneyOrdersDeductible1());
                                    req1.setEmployDishonestyLimit1(a.getEmployDishonestyLimit1());
                                    req1.setEmployDishonestyDeductible1(a.getEmployDishonestyDeductible1());
                                    req1.setCglLimit1(a.getCglLimit1());
                                    req1.setCglDeductible1(a.getCglDeductible1());
                                    req1.setTenantsLegalLimit1(a.getTenantsLegalLimit1());
                                    req1.setTenantsLegalDeductible1(a.getTenantsLegalDeductible1());
                                    req1.setNonOwnedAutoLimit1(a.getNonOwnedAutoLimit1());
                                    req1.setNonOwnedAutoDeductible1(a.getNonOwnedAutoDeductible1());
                                    req1.setSef96Limit1(a.getSef96Limit1());
                                    req1.setSef96Deductible1(a.getSef96Deductible1());
                                    req1.setSef94Limit1(a.getSef94Limit1());
                                    req1.setSef94Deductible1(a.getSef94Deductible1());
                                    req1.setDoLimit1(a.getDoLimit1());
                                    req1.setDoDeductible1(a.getDoDeductible1());
                                    req1.setEoLimit1(a.getEoLimit1());
                                    req1.setEoDeductible1(a.getEoDeductible1());
                                    req1.setEmployerLimit1(a.getEmployerLimit1());
                                    req1.setEmployerDeductible1(a.getEmployerDeductible1());
                                    req1.setUmbrellaLimit1(a.getUmbrellaLimit1());
                                    req1.setUmbrellaDeductible1(a.getUmbrellaDeductible1());
                                    req1.setWrapUpLimit1(a.getWrapUpLimit1());
                                    req1.setWrapUpDeductible1(a.getWrapUpDeductible1());
                                    req1.setStdComprehensiveLimit1(a.getStdComprehensiveLimit1());
                                    req1.setStdComprehensiveDeductible1(a.getStockDeductible1());
                                    req1.setAirConditioningLimit1(a.getAirConditioningLimit1());
                                    req1.setAirConditioningDeductible1(a.getAirConditioningDeductible1());
                                    req1.setProductionMachineryLimit1(a.getProductionMachineryLimit1());
                                    req1.setProductionMachineryDeductible1(a.getProductionMachineryDeductible1());
                                    req1.setOthercoverage11(a.getOthercoverage11());
                                    req1.setOthercoverage21(a.getOthercoverage21());
                                    req1.setOtherCoverageLimit11(a.getOtherCoverageLimit11());
                                    req1.setOtherCoverageDeductible11(a.getOtherCoverageDeductible11());
                                    req1.setOtherCoverageLimit21(a.getOtherCoverageLimit21());
                                    req1.setOtherCoverageDeductible21(a.getOtherCoverageDeductible21());
                                    req1.setAdditionalcoverage1(a.getAdditionalCoverage1());
                                    req1.setRoofupdated1(a.getRoofupdated1());
                                    req1.setHeatingupdated1(a.getHeatingupdated1());
                                    req1.setElectricalupdated1(a.getElectricalupdated1());
                                    req1.setElectricalamps1(a.getElectricalamps1());
                                    req1.setFireProtectiondistance1(a.getFireProtectiondistance1());
                                    req1.setAge1(a.getAge1());
                                    req1.setTotalSqFootage1(a.getTotalSqFootage1());
                                    req1.setInsdSqFootage1(a.getInsdSqFootage1());
                                    req1.setNoOfStories1(a.getNoOfStories1());
                                    break;
                                case 2:
                                    req1.setAddress2(a.getAddress1());
                                    req1.setBasement2(a.getBasement1());
                                    req1.setOwner2(a.getOwner11());
                                    req1.setTruckMan2(a.getTruckMan1());
                                    req1.setGrossEarningCheckbox2(a.getGrossEarning801());
                                    req1.setWallsframe2(a.getWallsframe1());
                                    req1.setWallshcb2(a.getWallshcb1());
                                    req1.setWallssteel2(a.getWallssteel1());
                                    req1.setWallsbrick2(a.getWallsbrick1());
                                    req1.setRoofwood2(a.getRoofwood1());
                                    req1.setRoofsteel2(a.getRoofsteel1());
                                    req1.setRoofconcrete2(a.getRoofconcrete1());
                                    req1.setFloorsconcrete2(a.getFloorsconcrete1());
                                    req1.setFloorswood2(a.getFloorswood1());
                                    req1.setHeatinggas2(a.getHeatinggas1());
                                    req1.setHeatingoil2(a.getHeatingoil1());
                                    req1.setHeatingelectric2(a.getHeatingelectric1());
                                    req1.setHeatingother2(a.getHeatingother1());
                                    req1.setElectricalbreakers2(a.getElectricalbreakers1());
                                    req1.setElectricalfuses2(a.getElectricalfuses1());
                                    req1.setElectricalamps2(a.getElectricalamps1());
                                    req1.setPlumbingcopper2(a.getPlumbingcopper1());
                                    req1.setPlumbingpvc2(a.getPlumbingpvc1());
                                    req1.setPlumbingother2(a.getPlumbingother1());
                                    req1.setFireProtection2(a.getFireProtection1());
                                    req1.setSecurity2(a.getSecurity1());
                                    req1.setBuildingLimit2(a.getBuildingLimit1());
                                    req1.setBuildingDeductible2(a.getBuildingDeductible1());
                                    req1.setContentsLimit2(a.getContentsLimit1());

                                    req1.setContentsDeductible2(a.getContentsDeductible1());

                                    req1.setStockLimit2(a.getStockLimit1());

                                    req1.setStockDeductible2(a.getStockDeductible1());

                                    req1.setOfficeContentLimit2(a.getOfficeContentLimit1());

                                    req1.setOfficeContentDeductible2(a.getOfficeContentDeductible1());

                                    req1.setEdpLimit2(a.getEdpLimit1());

                                    req1.setEdpDeductible2(a.getEdpDeductible1());

                                    req1.setEquipmentLimit2(a.getEquipmentLimit1());

                                    req1.setEquipmentDeductible2(a.getEquipmentDeductible1());

                                    req1.setOffPremisesLimit2(a.getOffPremisesLimit1());

                                    req1.setOffPremisesDeductible2(a.getOffPremisesDeductible1());

                                    req1.setTransitLimit2(a.getTransitLimit1());

                                    req1.setTransitDeductible2(a.getTransitDeductible1());

                                    req1.setMiscPropertyLimit2(a.getMiscPropertyLimit1());
                                    req1.setMiscPropertyDeductible2(a.getMiscPropertyDeductible1());
                                    req1.setContractorEquipmentLimit2(a.getContractorEquipmentLimit1());
                                    req1.setContractorEquipmentDeductible2(a.getContractorEquipmentDeductible1());
                                    req1.setInstallationFloaterLimit2(a.getInstallationFloaterLimit1());
                                    req1.setInstallationFloaterDeductible2(a.getInstallationFloaterDeductible1());
                                    req1.setToolFloaterLimit2(a.getToolFloaterLimit1());
                                    req1.setToolFloaterDeductible2(a.getToolFloaterDeductible1());
                                    req1.setSignFloaterLimit2(a.getSignFloaterLimit1());
                                    req1.setSignFloaterDeductible2(a.getSignFloaterDeductible1());
                                    req1.setMotorTruckLimit2(a.getMotorTruckLimit1());
                                    req1.setMotorTruckDeductible2(a.getMotorTruckDeductible1());
                                    req1.setGlassLimit2(a.getGlassLimit1());
                                    req1.setGlassDeductible2(a.getGlassDeductible1());
                                    req1.setSewerBackupDeductible2(a.getSewerBackupDeductible1());
                                    req1.setFloodDeductible2(a.getFloodDeductible1());
                                    req1.setEarthquakeDeductible2(a.getEarthquakeDeductible1());
                                    req1.setProfitLimit2(a.getProfitLimit1());
                                    req1.setProfitDeductible2(a.getProfitDeductible1());
                                    req1.setGrossEarningLimit2(a.getGrossEarningLimit1());
                                    req1.setGrossEarningDeductible2(a.getGrossEarningDeductible1());
                                    req1.setRentalIncomeLimit2(a.getRentalIncomeLimit1());
                                    req1.setRentalIncomeDeductible2(a.getRentalIncomeDeductible1());
                                    req1.setExtraExpenseLimit2(a.getExtraExpenseLimit1());
                                    req1.setExtraExpenseDeductible2(a.getExtraExpenseDeductible1());
                                    req1.setOffPremisesPowerLimit2(a.getOffPremisesLimit1());
                                    req1.setOffPremisesPowerDeductible2(a.getOffPremisesDeductible1());
                                    req1.setInsideOutsideLimit2(a.getInsideOutsideLimit1());
                                    req1.setInsideOutsideDeductible2(a.getInsideOutsideDeductible1());
                                    req1.setBfMoneyLimit2(a.getBfMoneyLimit1());
                                    req1.setBfMoneyDeductible2(a.getBfMoneyDeductible1());
                                    req1.setDeopistorForgeryLimit2(a.getDeopistorForgeryLimit1());
                                    req1.setDeopistorForgeryDeductible2(a.getDeopistorForgeryDeductible1());
                                    req1.setMoneyOrdersLimit2(a.getMoneyOrdersLimit1());
                                    req1.setMoneyOrdersDeductible2(a.getMoneyOrdersDeductible1());
                                    req1.setEmployDishonestyLimit2(a.getEmployDishonestyLimit1());
                                    req1.setEmployDishonestyDeductible2(a.getEmployDishonestyDeductible1());
                                    req1.setCglLimit2(a.getCglLimit1());
                                    req1.setCglDeductible2(a.getCglDeductible1());
                                    req1.setTenantsLegalLimit2(a.getTenantsLegalLimit1());
                                    req1.setTenantsLegalDeductible2(a.getTenantsLegalDeductible1());
                                    req1.setNonOwnedAutoLimit2(a.getNonOwnedAutoLimit1());
                                    req1.setNonOwnedAutoDeductible2(a.getNonOwnedAutoDeductible1());
                                    req1.setSef96Limit2(a.getSef96Limit1());
                                    req1.setSef96Deductible2(a.getSef96Deductible1());
                                    req1.setSef94Limit2(a.getSef94Limit1());
                                    req1.setSef94Deductible2(a.getSef94Deductible1());
                                    req1.setDoLimit2(a.getDoLimit1());
                                    req1.setDoDeductible2(a.getDoDeductible1());
                                    req1.setEoLimit2(a.getEoLimit1());
                                    req1.setEoDeductible2(a.getEoDeductible1());
                                    req1.setEmployerLimit2(a.getEmployerLimit1());
                                    req1.setEmployerDeductible2(a.getEmployerDeductible1());
                                    req1.setUmbrellaLimit2(a.getUmbrellaLimit1());
                                    req1.setUmbrellaDeductible2(a.getUmbrellaDeductible1());
                                    req1.setWrapUpLimit2(a.getWrapUpLimit1());
                                    req1.setWrapUpDeductible2(a.getWrapUpDeductible1());
                                    req1.setStdComprehensiveLimit2(a.getStdComprehensiveLimit1());
                                    req1.setStdComprehensiveDeductible2(a.getStockDeductible1());
                                    req1.setAirConditioningLimit2(a.getAirConditioningLimit1());
                                    req1.setAirConditioningDeductible2(a.getAirConditioningDeductible1());
                                    req1.setProductionMachineryLimit2(a.getProductionMachineryLimit1());
                                    req1.setProductionMachineryDeductible2(a.getProductionMachineryDeductible1());
                                    req1.setOthercoverage12(a.getOthercoverage11());
                                    req1.setOthercoverage22(a.getOthercoverage21());
                                    req1.setOtherCoverageLimit12(a.getOtherCoverageLimit11());
                                    req1.setOtherCoverageDeductible12(a.getOtherCoverageDeductible11());
                                    req1.setOtherCoverageLimit22(a.getOtherCoverageLimit21());
                                    req1.setOtherCoverageDeductible22(a.getOtherCoverageDeductible21());
                                    req1.setAdditionalcoverage2(a.getAdditionalCoverage1());
                                    req1.setRoofupdated2(a.getRoofupdated1());
                                    req1.setHeatingupdated2(a.getHeatingupdated1());
                                    req1.setElectricalupdated2(a.getElectricalupdated1());
                                    req1.setElectricalamps2(a.getElectricalamps1());
                                    req1.setFireProtectiondistance2(a.getFireProtectiondistance1());
                                    req1.setAge2(a.getAge1());
                                    req1.setTotalSqFootage2(a.getTotalSqFootage1());
                                    req1.setInsdSqFootage2(a.getInsdSqFootage1());
                                    req1.setNoOfStories2(a.getNoOfStories1());
                                    break;
                                case 3:
                                    req1.setAddress3(a.getAddress1());
                                    req1.setBasement3(a.getBasement1());
                                    req1.setOwner3(a.getOwner11());
                                    req1.setTruckMan3(a.getTruckMan1());
                                    req1.setGrossEarningCheckbox3(a.getGrossEarning801());
                                    req1.setWallsframe3(a.getWallsframe1());
                                    req1.setWallshcb3(a.getWallshcb1());
                                    req1.setWallssteel3(a.getWallssteel1());
                                    req1.setWallsbrick3(a.getWallsbrick1());
                                    req1.setRoofwood3(a.getRoofwood1());
                                    req1.setRoofsteel3(a.getRoofsteel1());
                                    req1.setRoofconcrete3(a.getRoofconcrete1());
                                    req1.setFloorsconcrete3(a.getFloorsconcrete1());
                                    req1.setFloorswood3(a.getFloorswood1());
                                    req1.setHeatinggas3(a.getHeatinggas1());
                                    req1.setHeatingoil3(a.getHeatingoil1());
                                    req1.setHeatingelectric3(a.getHeatingelectric1());
                                    req1.setHeatingother3(a.getHeatingother1());
                                    req1.setElectricalbreakers3(a.getElectricalbreakers1());
                                    req1.setElectricalfuses3(a.getElectricalfuses1());
                                    req1.setElectricalamps3(a.getElectricalamps1());
                                    req1.setPlumbingcopper3(a.getPlumbingcopper1());
                                    req1.setPlumbingpvc3(a.getPlumbingpvc1());
                                    req1.setPlumbingother3(a.getPlumbingother1());
                                    req1.setFireProtection3(a.getFireProtection1());
                                    req1.setSecurity3(a.getSecurity1());
                                    req1.setBuildingLimit3(a.getBuildingLimit1());
                                    req1.setBuildingDeductible3(a.getBuildingDeductible1());
                                    req1.setContentsLimit3(a.getContentsLimit1());
                                    req1.setContentsDeductible3(a.getContentsDeductible1());
                                    req1.setStockLimit3(a.getStockLimit1());
                                    req1.setStockDeductible3(a.getStockDeductible1());
                                    req1.setOfficeContentLimit3(a.getOfficeContentLimit1());
                                    req1.setOfficeContentDeductible3(a.getOfficeContentDeductible1());
                                    req1.setEdpLimit3(a.getEdpLimit1());
                                    req1.setEdpDeductible3(a.getEdpDeductible1());
                                    req1.setEquipmentLimit3(a.getEquipmentLimit1());
                                    req1.setEquipmentDeductible3(a.getEquipmentDeductible1());
                                    req1.setOffPremisesLimit3(a.getOffPremisesLimit1());

                                    req1.setOffPremisesDeductible3(a.getOffPremisesDeductible1());

                                    req1.setTransitLimit3(a.getTransitLimit1());

                                    req1.setTransitDeductible3(a.getTransitDeductible1());

                                    req1.setMiscPropertyLimit3(a.getMiscPropertyLimit1());
                                    req1.setMiscPropertyDeductible3(a.getMiscPropertyDeductible1());
                                    req1.setContractorEquipmentLimit3(a.getContractorEquipmentLimit1());
                                    req1.setContractorEquipmentDeductible3(a.getContractorEquipmentDeductible1());
                                    req1.setInstallationFloaterLimit3(a.getInstallationFloaterLimit1());
                                    req1.setInstallationFloaterDeductible3(a.getInstallationFloaterDeductible1());
                                    req1.setToolFloaterLimit3(a.getToolFloaterLimit1());
                                    req1.setToolFloaterDeductible3(a.getToolFloaterDeductible1());
                                    req1.setSignFloaterLimit3(a.getSignFloaterLimit1());
                                    req1.setSignFloaterDeductible3(a.getSignFloaterDeductible1());
                                    req1.setMotorTruckLimit3(a.getMotorTruckLimit1());
                                    req1.setMotorTruckDeductible3(a.getMotorTruckDeductible1());
                                    req1.setGlassLimit3(a.getGlassLimit1());
                                    req1.setGlassDeductible3(a.getGlassDeductible1());
                                    req1.setSewerBackupDeductible3(a.getSewerBackupDeductible1());
                                    req1.setFloodDeductible3(a.getFloodDeductible1());
                                    req1.setEarthquakeDeductible3(a.getEarthquakeDeductible1());
                                    req1.setProfitLimit3(a.getProfitLimit1());
                                    req1.setProfitDeductible3(a.getProfitDeductible1());
                                    req1.setGrossEarningLimit3(a.getGrossEarningLimit1());
                                    req1.setGrossEarningDeductible3(a.getGrossEarningDeductible1());
                                    req1.setRentalIncomeLimit3(a.getRentalIncomeLimit1());
                                    req1.setRentalIncomeDeductible3(a.getRentalIncomeDeductible1());
                                    req1.setExtraExpenseLimit3(a.getExtraExpenseLimit1());
                                    req1.setExtraExpenseDeductible3(a.getExtraExpenseDeductible1());
                                    req1.setOffPremisesPowerLimit3(a.getOffPremisesLimit1());
                                    req1.setOffPremisesPowerDeductible3(a.getOffPremisesDeductible1());
                                    req1.setInsideOutsideLimit3(a.getInsideOutsideLimit1());
                                    req1.setInsideOutsideDeductible3(a.getInsideOutsideDeductible1());
                                    req1.setBfMoneyLimit3(a.getBfMoneyLimit1());
                                    req1.setBfMoneyDeductible3(a.getBfMoneyDeductible1());
                                    req1.setDeopistorForgeryLimit3(a.getDeopistorForgeryLimit1());
                                    req1.setDeopistorForgeryDeductible3(a.getDeopistorForgeryDeductible1());
                                    req1.setMoneyOrdersLimit3(a.getMoneyOrdersLimit1());
                                    req1.setMoneyOrdersDeductible3(a.getMoneyOrdersDeductible1());
                                    req1.setEmployDishonestyLimit3(a.getEmployDishonestyLimit1());
                                    req1.setEmployDishonestyDeductible3(a.getEmployDishonestyDeductible1());
                                    req1.setCglLimit3(a.getCglLimit1());
                                    req1.setCglDeductible3(a.getCglDeductible1());
                                    req1.setTenantsLegalLimit3(a.getTenantsLegalLimit1());
                                    req1.setTenantsLegalDeductible3(a.getTenantsLegalDeductible1());
                                    req1.setNonOwnedAutoLimit3(a.getNonOwnedAutoLimit1());
                                    req1.setNonOwnedAutoDeductible3(a.getNonOwnedAutoDeductible1());
                                    req1.setSef96Limit3(a.getSef96Limit1());
                                    req1.setSef96Deductible3(a.getSef96Deductible1());
                                    req1.setSef94Limit3(a.getSef94Limit1());
                                    req1.setSef94Deductible3(a.getSef94Deductible1());
                                    req1.setDoLimit3(a.getDoLimit1());
                                    req1.setDoDeductible3(a.getDoDeductible1());
                                    req1.setEoLimit3(a.getEoLimit1());
                                    req1.setEoDeductible3(a.getEoDeductible1());
                                    req1.setEmployerLimit3(a.getEmployerLimit1());
                                    req1.setEmployerDeductible3(a.getEmployerDeductible1());
                                    req1.setUmbrellaLimit3(a.getUmbrellaLimit1());
                                    req1.setUmbrellaDeductible3(a.getUmbrellaDeductible1());
                                    req1.setWrapUpLimit3(a.getWrapUpLimit1());
                                    req1.setWrapUpDeductible3(a.getWrapUpDeductible1());
                                    req1.setStdComprehensiveLimit3(a.getStdComprehensiveLimit1());
                                    req1.setStdComprehensiveDeductible3(a.getStockDeductible1());
                                    req1.setAirConditioningLimit3(a.getAirConditioningLimit1());
                                    req1.setAirConditioningDeductible3(a.getAirConditioningDeductible1());
                                    req1.setProductionMachineryLimit3(a.getProductionMachineryLimit1());
                                    req1.setProductionMachineryDeductible3(a.getProductionMachineryDeductible1());
                                    req1.setOthercoverage13(a.getOthercoverage11());
                                    req1.setOthercoverage23(a.getOthercoverage21());
                                    req1.setOtherCoverageLimit13(a.getOtherCoverageLimit11());
                                    req1.setOtherCoverageDeductible13(a.getOtherCoverageDeductible11());
                                    req1.setOtherCoverageLimit23(a.getOtherCoverageLimit21());
                                    req1.setOtherCoverageDeductible23(a.getOtherCoverageDeductible21());
                                    req1.setAdditionalcoverage3(a.getAdditionalCoverage1());
                                    req1.setRoofupdated3(a.getRoofupdated1());
                                    req1.setHeatingupdated3(a.getHeatingupdated1());
                                    req1.setElectricalupdated3(a.getElectricalupdated1());
                                    req1.setElectricalamps3(a.getElectricalamps1());
                                    req1.setFireProtectiondistance3(a.getFireProtectiondistance1());
                                    req1.setAge3(a.getAge1());
                                    req1.setTotalSqFootage3(a.getTotalSqFootage1());
                                    req1.setInsdSqFootage3(a.getInsdSqFootage1());
                                    req1.setNoOfStories3(a.getNoOfStories1());
                                    break;
                            }
                            i++;
                        }

                        i = 0;
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
                                i++;
                            }
                        }
                        System.out.println("123");
                        StringTemplateGroup emailTemplateGroup = new StringTemplateGroup(
                                "welcomeloginemail group", new File("bin").getAbsolutePath());
                        StringTemplate submitFormMail = emailTemplateGroup
                                .getInstanceOf("pdfTemplate");
                       // submitFormMail.setAttribute("date", new SimpleDateFormat("yyyy/mm/dd").format(datefromform));
                        System.out.println("producer"+returnedname);
                        System.out.println("branch"+returnedbranch);
                        System.out.println("keycontact"+binding.getKeyContact());
                        submitFormMail.setAttribute("producer", returnedname);
                        submitFormMail.setAttribute("branch", returnedbranch);
                        submitFormMail.setAttribute("keycontact", binding.getKeyContact());
                        submitFormMail.setAttribute("keyphone", binding.getKeyPhone());
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
                        InsuranceFormSubmitResponse response = port.getInsuranceOperationsPort().formSubmission(req1);
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            stopLoading();
                            if (insurancetypeflag == 2 || insurancetypeflag == 3) {
                                String str = "Your new application has been submitted. Form ID is: " + response.getFormId();
                                ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).autosuccessMessage(str, producerid);

                            } else {
                                successMessage("Your new application has been submitted. Form ID is: " + response.getFormId());
                            }

                        } else {
                            stopLoading();
                            if (insurancetypeflag == 2 || insurancetypeflag == 3) {
                                String str = response.getErrorMessage();
                                ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).autoerrorMessage(str);
                            } else {
                                errors(response.getErrorMessage());
                            }
                        }
                    }
                } catch (Exception ex) {
                    stopLoading();
                    if (insurancetypeflag == 2 || insurancetypeflag == 3) {
                        String str = ex.getMessage();
                        ((AutoSubmissionController) screenPage.getControlledScreen("AutoSubmission")).autoerrorMessage(str);
                    } else {
                        errors(ex.getMessage());
                    }
                }
                return null;
            }

        };

        new Thread(task).start();

    }

    public boolean isAlphaNumeric(String s) {
        String pattern = "^([0-9\\(\\)\\/\\+ \\-]*)$";
        System.out.println(s);
        if (s.matches(pattern)) {
            System.out.println("True");
            return true;
        } else {
            return false;
        }
    }

    public void successMessage(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
//                Dialogs.showInformationDialog(null, message, "Success", "Success");
                new AlertDialog((Stage) keycontact.getParent().getScene().getWindow(), message, AlertDialog.ICON_INFO).showAndWait();
                if (producerid.trim() == null && producerid.trim().isEmpty()) {
                    screenPage.setScreen("OtherScreen");
                    animatedMovement(-1269, -715);
                } else {
                    screenPage.setScreen("NextScreen");
                    animatedMovement(0, 0);
                }
                openingPane.setVisible(true);
                newBusinessPane.setVisible(false);
            }
        });
    }

    public boolean isValidphonenumber(String s) {

        //String phoneNumber = "1-(80..2)-321-0361";
        System.out.println(s);
        String regex = "^\\+?[0-9. ()-]{10,25}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        System.out.println(matcher);
        System.out.println(regex);
        if (matcher.matches()) {
            System.out.println("Yes it matches");
            return true;
        } else {
            return false;
        }
    }

    public void successMessage1(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
//                Dialogs.showInformationDialog(null, message, "Success", "Success");
                new AlertDialog((Stage) keycontact.getParent().getScene().getWindow(), message, AlertDialog.ICON_INFO).showAndWait();
            }
        });
    }

    public void successMessage2(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
//                Dialogs.showInformationDialog(null, message, "Success", "Success");
                new AlertDialog((Stage) keycontact.getParent().getScene().getWindow(), message, AlertDialog.ICON_INFO).showAndWait();
            }
        });
    }

    public static XMLGregorianCalendar toXMLGregorianCalendar(Date date) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        gCalendar.setTime(date);
        XMLGregorianCalendar xmlCalendar = null;
        try {
            xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gCalendar);
        } catch (DatatypeConfigurationException ex) {
        }
        return xmlCalendar;
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
    
    public void autoback() {
        System.out.println("I am here");
       if(insurancetypeflag==2)
       {screenPage.setScreen("NextScreen");
        animatedMovement(-6345, 0);
       }
      else if(insurancetypeflag==3)
       {screenPage.setScreen("NextScreen");
        animatedMovement(-7614, 0);
       }
    }

    @FXML
    public void uploadfiles() {
        System.out.println("InsideUpload");
        FileChooser fileChooser = new FileChooser();

        //FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("name", "filter");
        //fileChooser.getExtensionFilters().add(extFilter);
        List<File> list1
                = fileChooser.showOpenMultipleDialog(null);

        List<File> list = new ArrayList<File>();
        if (list1 != null) {
            System.out.println("Inside1");
            String files = "";
            for (File file : list1) {
                list.add(file);
                System.out.println(file.getPath());
                files = files + file.getName() + ",";
            }
            this.fileList = list;

            if (!isEdit) {
                System.out.println("upload new");
                if (contractorflag == true) {
                    if (os.contains("Windows")) {
                        System.out.println("contractor flag");
                        if (insurancetypeflag == 1 || insurancetypeflag == 2) {
                            list.add(new File("C:\\bin\\Contractors.doc"));
                        }
                        if (insurancetypeflag == 2 || insurancetypeflag == 3) {
                            list.add(new File("C:\\bin\\VehicleSchedule.xls"));
                            list.add(new File("DriverSchedule.xls"));
                        }
                        for (File file : list) {
                            System.out.println(file.getPath());
                        }
                    } else if (os.contains("Mac")) {
                        list.add(new File("/bin/Contactors.doc"));
                    }
                }
                //list.add(new File("PassportCopy.jpg"));
            }
            //list.add(new File(applicationid+"\\"+"").getAbsoluteFile());
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

    public XMLGregorianCalendar getDateFromForm() {
        return datefromform;
    }

    public void setDateFromForm(XMLGregorianCalendar datefromform) {
        this.datefromform = datefromform;
    }

    public XMLGregorianCalendar getDate11() {
        return date11;
    }

    public void setDate11(XMLGregorianCalendar date11) {
        this.date11 = date11;
    }

    public void errors(final String message) {
        Platform.runLater(new Runnable() {
            public void run() {
//                Dialogs.showErrorDialog(null, message, "Oops!!", "Error");
                new AlertDialog((Stage) keycontact.getParent().getScene().getWindow(), message, AlertDialog.ICON_ERROR).showAndWait();
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
