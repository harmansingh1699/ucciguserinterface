    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.calendar.DatePicker;
import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import com.ui.binding.FormEntry4Binding;
import com.ui.util.SavingFile;
import com.ui.util.savinglocally;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
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
public class AutoSubmissionController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;
    
    @FXML
    private TextField autocurrentinsurer;

    

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
    private TextField autodescriptionofclaim1;
    @FXML
    private TextField autodescriptionofclaim2;
    @FXML
    private TextField autodescriptionofclaim3;
    @FXML
    private TextField autodescriptionofclaim4;
    @FXML
    private TextField autodescriptionofclaim5;
    @FXML
    private TextField autodescriptionofclaim6;

    @FXML
    private TextArea commoditiestransported;
    
    @FXML
    private TextField liststate1;
    @FXML
    private TextField liststate2;
    @FXML
    private TextField liststate3;
    
    
    @FXML
    private TextField usdot1;
    @FXML
    private TextField usdot2;
    @FXML
    private TextField usdot3;
    
    
    @FXML
    private TextField docket1;
    @FXML
    private TextField docket2;
    @FXML
    private TextField docket3;
    
    
    @FXML
    private TextField typeoffiling1;
    @FXML
    private TextField typeoffiling2;
    @FXML
    private TextField typeoffiling3;
    
    
    @FXML
    private TextField namerequired1;
    @FXML
    private TextField namerequired2;
    @FXML
    private TextField namerequired3;
   
    @FXML
    private ChoiceBox<String> nonownedliability;
    @FXML
    private ChoiceBox<String> nonownedcontract;
    @FXML
    private ChoiceBox<String> hauling;
    
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
    private Hyperlink vehicledetails;
            
    @FXML
    private GridPane gridpane11;
    @FXML
    private GridPane gridpane12;
    @FXML
    private GridPane gridpane13;
    @FXML
    private GridPane gridpane14;
    @FXML
    private GridPane gridpane15;
    @FXML
    private GridPane gridpane16;
    @FXML
    private GridPane gridpane17;
    
    
    @FXML
    private Pane fullScreenPane;

    public FormEntry4Binding binding4;
    DatePicker datePicker11 = new DatePicker();
    DatePicker datePicker12 = new DatePicker();
    DatePicker datePicker13 = new DatePicker();
    DatePicker datePicker14 = new DatePicker();
    DatePicker datePicker15 = new DatePicker();
    DatePicker datePicker16 = new DatePicker();
    DatePicker datePicker17 = new DatePicker();

     /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        hauling.getSelectionModel().selectFirst();
        nonownedliability.getSelectionModel().selectFirst();
        nonownedcontract.getSelectionModel().selectFirst();
        binding4=new FormEntry4Binding();
        Bindings.bindBidirectional(autocurrentinsurer.textProperty(), binding4.autocurrentinsurerProperty());
        Bindings.bindBidirectional(autopremiumtarget.textProperty(), binding4.autopremiumtargetProperty());
        Bindings.bindBidirectional(lessholder1.textProperty(), binding4.lessholder1Property());
        Bindings.bindBidirectional(lessholder2.textProperty(), binding4.lessholder2Property());
        Bindings.bindBidirectional(lessholder3.textProperty(), binding4.lessholder3Property());
        Bindings.bindBidirectional(autovehicle1.textProperty(), binding4.autovehicle1Property());
        Bindings.bindBidirectional(autovehicle2.textProperty(), binding4.autovehicle2Property());
        Bindings.bindBidirectional(autovehicle3.textProperty(), binding4.autovehicle3Property());
        
        Bindings.bindBidirectional(autodescriptionofclaim1.textProperty(), binding4.autodescriptionofclaim1Property());
        Bindings.bindBidirectional(autodescriptionofclaim2.textProperty(), binding4.autodescriptionofclaim2Property());
        Bindings.bindBidirectional(autodescriptionofclaim3.textProperty(), binding4.autodescriptionofclaim3Property());
        Bindings.bindBidirectional(autodescriptionofclaim4.textProperty(), binding4.autodescriptionofclaim4Property());
        Bindings.bindBidirectional(autodescriptionofclaim5.textProperty(), binding4.autodescriptionofclaim5Property());
        Bindings.bindBidirectional(autodescriptionofclaim6.textProperty(), binding4.autodescriptionofclaim6Property());
        Bindings.bindBidirectional(commoditiestransported.textProperty(), binding4.commoditiestransportedProperty());
        Bindings.bindBidirectional(liststate1.textProperty(), binding4.liststate1Property());
        Bindings.bindBidirectional(liststate2.textProperty(), binding4.liststate2Property());
        Bindings.bindBidirectional(liststate3.textProperty(), binding4.liststate3Property());
        
        Bindings.bindBidirectional(usdot1.textProperty(), binding4.usdot1Property());
        Bindings.bindBidirectional(usdot2.textProperty(), binding4.usdot2Property());
        Bindings.bindBidirectional(usdot3.textProperty(), binding4.usdot3Property());
        
        Bindings.bindBidirectional(docket1.textProperty(), binding4.docket1Property());
        Bindings.bindBidirectional(docket2.textProperty(), binding4.docket2Property());
        Bindings.bindBidirectional(docket3.textProperty(), binding4.docket3Property());
        
        Bindings.bindBidirectional(typeoffiling1.textProperty(), binding4.typeoffiling1Property());
        Bindings.bindBidirectional(typeoffiling2.textProperty(), binding4.typeoffiling2Property());
        Bindings.bindBidirectional(typeoffiling3.textProperty(), binding4.typeoffiling3Property());
        
        Bindings.bindBidirectional(namerequired1.textProperty(), binding4.namerequired1Property());
        Bindings.bindBidirectional(namerequired2.textProperty(), binding4.namerequired2Property());
        Bindings.bindBidirectional(namerequired3.textProperty(), binding4.namerequired3Property());
        
        Bindings.bindBidirectional(typeofnonowned.textProperty(), binding4.typeofnonownedProperty());
        Bindings.bindBidirectional(anytime.textProperty(), binding4.anytimeProperty());
        Bindings.bindBidirectional(avgvalue.textProperty(), binding4.avgvalueProperty());
        Bindings.bindBidirectional(maxannually.textProperty(), binding4.maxannuallyProperty());
        Bindings.bindBidirectional(mostexpensive.textProperty(), binding4.mostexpensiveProperty());
        Bindings.bindBidirectional(autosubmissioncomments.textProperty(), binding4.autosubmissioncommentsProperty());
        
         hauling.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                    binding4.sethauling(newSelection);
                }
            
        });
         nonownedliability.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                    binding4.setnonownedliability(newSelection);
                } 
        });
         nonownedcontract.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) {
                    binding4.setnonownedcontract(newSelection);
                }
        });
         
    
    datePicker11.localeProperty().set(Locale.ENGLISH);
    datePicker12.localeProperty().set(Locale.ENGLISH);
    datePicker13.localeProperty().set(Locale.ENGLISH);
    datePicker14.localeProperty().set(Locale.ENGLISH);
    datePicker15.localeProperty().set(Locale.ENGLISH);
    datePicker16.localeProperty().set(Locale.ENGLISH);
    datePicker17.localeProperty().set(Locale.ENGLISH);
    
        datePicker11.setLayoutX(0.0);
        datePicker11.setLayoutY(81.0);
        datePicker11.setPrefWidth(200.0);
        
        datePicker12.setLayoutX(0.0);
        datePicker12.setLayoutY(81.0);
        datePicker12.setPrefWidth(200.0);
        
        datePicker13.setLayoutX(0.0);
        datePicker13.setLayoutY(81.0);
        datePicker13.setPrefWidth(200.0);
    
        datePicker14.setLayoutX(0.0);
        datePicker14.setLayoutY(81.0);
        datePicker14.setPrefWidth(200.0);
        
        datePicker15.setLayoutX(0.0);
        datePicker15.setLayoutY(81.0);
        datePicker15.setPrefWidth(200.0);
        
        datePicker16.setLayoutX(0.0);
        datePicker16.setLayoutY(81.0);
        datePicker16.setPrefWidth(200.0);
        
        datePicker17.setLayoutX(0.0);
        datePicker17.setLayoutY(81.0);
        datePicker17.setPrefWidth(200.0);
        
        datePicker11.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker12.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker13.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker14.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker15.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker16.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
        
        datePicker17.selectedDateProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
            }
        });
    
        datePicker11.setPromptText("Date of Claim");
        datePicker11.setLocale(Locale.ENGLISH);
        datePicker11.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker11.getCalendarView().setShowWeeks(false);
        datePicker11.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker12.setPromptText("Date of Claim");
        datePicker12.setLocale(Locale.ENGLISH);
        datePicker12.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker12.getCalendarView().setShowWeeks(false);
        datePicker12.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker13.setPromptText("Date of Claim");
        datePicker13.setLocale(Locale.ENGLISH);
        datePicker13.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker13.getCalendarView().setShowWeeks(false);
        datePicker13.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker14.setPromptText("Date of Claim");
        datePicker14.setLocale(Locale.ENGLISH);
        datePicker14.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker14.getCalendarView().setShowWeeks(false);
        datePicker14.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker15.setPromptText("Date of Claim");
        datePicker15.setLocale(Locale.ENGLISH);
        datePicker15.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker15.getCalendarView().setShowWeeks(false);
        datePicker15.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker16.setPromptText("Date of Claim");
        datePicker16.setLocale(Locale.ENGLISH);
        datePicker16.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker16.getCalendarView().setShowWeeks(false);
        datePicker16.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        datePicker17.setPromptText("Date of Claim");
        datePicker17.setLocale(Locale.ENGLISH);
        datePicker17.getCalendarView().todayButtonTextProperty().set("TODAY");
        datePicker17.getCalendarView().setShowWeeks(false);
        datePicker17.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        
        gridpane11.add(datePicker11, 0,0);
        gridpane12.add(datePicker12, 0,0);
        gridpane13.add(datePicker13, 0,0);
        gridpane14.add(datePicker14, 0,0);
        gridpane15.add(datePicker15, 0,0);
        gridpane16.add(datePicker16, 0,0);
        gridpane17.add(datePicker17, 0,0);
            }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }
    @FXML
    public void backAuto() {
        screenPage.setScreen("NextScreen");
        animatedMovement(-6345, 0);
    }
    @FXML
    public void back1() {
        screenPage.setScreen("AutoSubmission");
        animatedMovement(0, 0);
    }
    @FXML
    public void submitFormAction() throws DatatypeConfigurationException{
                            GregorianCalendar c1 = new GregorianCalendar();
                            if(datePicker11.getSelectedDate()!=null)
                            {c1.setTime(datePicker11.getSelectedDate());
                            XMLGregorianCalendar date1 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c1);
                            ((NextScreenController)screenPage.getControlledScreen("NextScreen")).setDate11(date1);}
                            
                            GregorianCalendar c2 = new GregorianCalendar();
                            if(datePicker12.getSelectedDate()!=null)
                            { c2.setTime(datePicker12.getSelectedDate());
                            XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c2);
                            ((NextScreenController)screenPage.getControlledScreen("NextScreen")).setDate12(date2);}
                            
                            GregorianCalendar c3 = new GregorianCalendar();
                            if(datePicker13.getSelectedDate()!=null)
                            {c3.setTime(datePicker13.getSelectedDate());
                            XMLGregorianCalendar date3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c3);
                            ((NextScreenController)screenPage.getControlledScreen("NextScreen")).setDate13(date3);}
                            
                            GregorianCalendar c4 = new GregorianCalendar();
                            if(datePicker14.getSelectedDate()!=null)
                            {c4.setTime(datePicker14.getSelectedDate());
                            XMLGregorianCalendar date4 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c4);
                            ((NextScreenController)screenPage.getControlledScreen("NextScreen")).setDate14(date4);}
                            
                            GregorianCalendar c5 = new GregorianCalendar();
                            if(datePicker15.getSelectedDate()!=null)
                            {c5.setTime(datePicker15.getSelectedDate());
                            XMLGregorianCalendar date5 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c5);
                            ((NextScreenController)screenPage.getControlledScreen("NextScreen")).setDate15(date5);}
                            
                            GregorianCalendar c6 = new GregorianCalendar();
                            if(datePicker16.getSelectedDate()!=null)
                            {c6.setTime(datePicker16.getSelectedDate());
                            XMLGregorianCalendar date6 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c6);
                            ((NextScreenController)screenPage.getControlledScreen("NextScreen")).setDate16(date6);}
                            
                            GregorianCalendar c7 = new GregorianCalendar();
                            if(datePicker17.getSelectedDate()!=null)
                            {c7.setTime(datePicker17.getSelectedDate());
                            XMLGregorianCalendar date7 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c7);
                            ((NextScreenController)screenPage.getControlledScreen("NextScreen")).setDate17(date7);}
                            
                            ((NextScreenController)screenPage.getControlledScreen("NextScreen")).submitFormAction();
    }
    public void autoviewmethod(String a, String b, String c)
    {
                if("Select".equals(a))
                { hauling.getSelectionModel().select("Select");}
                else if("Yes".equals(a))
                {hauling.getSelectionModel().select("Yes");}
                else if("No".equals(a))
                {hauling.getSelectionModel().select("No");}     
                
                if("Select".equals(b))
                { nonownedliability.getSelectionModel().select("Select");}
                else if("Yes".equals(b))
                {nonownedliability.getSelectionModel().select("Yes");}
                else if("No".equals(b))
                {nonownedliability.getSelectionModel().select("No");}   
                
                if("Select".equals(c))
                { nonownedcontract.getSelectionModel().select("Select");}
                else if("Yes".equals(c))
                {nonownedcontract.getSelectionModel().select("Yes");}
                else if("No".equals(c))
                {nonownedcontract.getSelectionModel().select("No");}   
    }
    
    @FXML
    public void submitSave() {
        SavingFile sf = new SavingFile();
        savinglocally.toFile(sf, "Harman");
    }
    
    @FXML
    public void continueAuto() {
        animatedMovement(-1269, 0);
    }
    
    @FXML
    public void openVehicleDetails(){
        new Rav1("/Users/harsimransingh/Desktop/RevisedProposal.docx").execute();
        
                
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
