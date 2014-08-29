/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.uccig;

import com.calendar.DatePicker;
import com.rav.insurance.insuranceformoperations.webservice.Exception;
import com.rav.insurance.insuranceformoperations.webservice.InsuranceOperationsService_Service;
import com.rav.insurance.insuranceformoperations.webservice.contracts.CommonResponseAttributes;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceFormSubmitResponse;
import com.ui.binding.FormEntry1Binding;
import com.ui.binding.FormEntry2Binding;
import com.ui.binding.FormEntry3Binding;
import java.net.URL;
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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Dialogs;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author harsimransingh
 */
public class NextScreenController implements Initializable , IScreenController {

    private ScreenNavigator screenPage;
    
    @FXML
    private ChoiceBox<String> severity;
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
    private TextField pincode;
    @FXML
    private TextField country;
    @FXML
    private TextField fax;
    @FXML
    private TextField website;
    @FXML
    private TextField otherspecify;
    @FXML
    private ChoiceBox<String> years;
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
    private Pane openingPane;
    @FXML
    private Pane fullScreenPane;
    @FXML
    private Pane newBusinessPane;
    @FXML
    ImageView bg;
   
    DatePicker datePicker = new DatePicker();
    
    private FormEntry1Binding binding;
    private FormEntry2Binding binding2;
    private FormEntry3Binding binding3;
    
     private String receivedemailaddress;
     private String receivedname;

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
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        binding = new FormEntry1Binding();
        binding2=new FormEntry2Binding();
        binding3=new FormEntry3Binding();
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
        Bindings.bindBidirectional(pincode.textProperty(), binding.pincodeProperty());
        Bindings.bindBidirectional(country.textProperty(), binding.countryProperty());
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
        Bindings.bindBidirectional(advertising.textProperty(),binding3.advertisingProperty());
        Bindings.bindBidirectional(recover.textProperty(),binding3.recoverProperty());
        Bindings.bindBidirectional(claimcause1.textProperty(),binding3.claimcause1Property());
        Bindings.bindBidirectional(claimcause2.textProperty(),binding3.claimcause2Property());
        Bindings.bindBidirectional(claimcause3.textProperty(),binding3.claimcause3Property());
        Bindings.bindBidirectional(claimamount1.textProperty(),binding3.claimamount1Property());
        Bindings.bindBidirectional(claimamount2.textProperty(),binding3.claimamount2Property());
        Bindings.bindBidirectional(claimamount3.textProperty(),binding3.claimamount3Property());
        Bindings.bindBidirectional(ciptype1.textProperty(),binding3.ciptype1Property());
        Bindings.bindBidirectional(ciptype2.textProperty(),binding3.ciptype2Property());
        Bindings.bindBidirectional(ciptype3.textProperty(),binding3.ciptype3Property());
        Bindings.bindBidirectional(cipcarrier1.textProperty(),binding3.cipcarrier1Property());
        Bindings.bindBidirectional(cipcarrier2.textProperty(),binding3.cipcarrier2Property());
        Bindings.bindBidirectional(cipcarrier3.textProperty(),binding3.cipcarrier3Property());
        Bindings.bindBidirectional(lienholder1.textProperty(),binding3.lienholder1Property());
        Bindings.bindBidirectional(lienholder2.textProperty(),binding3.lienholder2Property());
        Bindings.bindBidirectional(lienholder3.textProperty(),binding3.lienholder3Property());
        Bindings.bindBidirectional(loc1.textProperty(),binding3.loc1Property());
        Bindings.bindBidirectional(loc2.textProperty(),binding3.loc2Property());
        Bindings.bindBidirectional(loc3.textProperty(),binding3.loc3Property());
        Bindings.bindBidirectional(aoladdress1.textProperty(),binding3.aoladdress1Property());
        Bindings.bindBidirectional(aoladdress2.textProperty(),binding3.aoladdress2Property());
        Bindings.bindBidirectional(aoladdress3.textProperty(),binding3.aoladdress3Property());
        Bindings.bindBidirectional(aoladdress4.textProperty(),binding3.aoladdress4Property());
        Bindings.bindBidirectional(aoluse1.textProperty(),binding3.aoluse1Property());
        Bindings.bindBidirectional(aoluse2.textProperty(),binding3.aoluse2Property());
        Bindings.bindBidirectional(aoluse3.textProperty(),binding3.aoluse3Property());
        Bindings.bindBidirectional(aoluse4.textProperty(),binding3.aoluse4Property());
        Bindings.bindBidirectional(lrtooccupancy1.textProperty(),binding3.lrtooccupancy1Property());
        Bindings.bindBidirectional(lrtooccupancy2.textProperty(),binding3.lrtooccupancy2Property());
        Bindings.bindBidirectional(lrtooccupancy3.textProperty(),binding3.lrtooccupancy3Property());
        Bindings.bindBidirectional(lrtooccupancy4.textProperty(),binding3.lrtooccupancy4Property());
        Bindings.bindBidirectional(producercomments.textProperty(),binding3.producercommentsProperty());
        Bindings.bindBidirectional(marketercomments.textProperty(),binding3.marketercommentsProperty());
      
      
        
        //choicebox
        severity.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
              {binding.setSeverity(newSelection);}       
        }
        });
        
        entitytype.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
                {binding.setEntityType(newSelection); }
        }
        });
        finYearEnd.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
                {binding2.setfinYearEnd(newSelection); }
        }
        });
        groupbenefits.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
                {binding2.setgroupBenefits(newSelection); }
        }
        });
        pensionplan.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
                {binding2.setpensionPlan(newSelection); }
        }
        });
        currency1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
                {binding2.setcurrency1(newSelection); }
        }
        });
        currency2.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
                {binding2.setcurrency2(newSelection); }
        }
        });
        currency3.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
                {binding2.setcurrency3(newSelection); }
        }
        });
        currency4.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue<? extends String> selected, String oldSelection, String newSelection) { 
        if(oldSelection!=null)
                {binding2.setCurrency4(newSelection); }
        }
        });
        
        //radio button   
        ToggleGroup tg= new ToggleGroup();
        profit.setToggleGroup(tg);
        nonprofit.setToggleGroup(tg);
        ChangeListener<Toggle> listener1 = new ChangeListener<Toggle>()
                {        
         @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t= (RadioButton)val.getToggleGroup().getSelectedToggle();
                binding.setProfit(t.getText());
                }
                };
        tg.selectedToggleProperty().addListener(listener1);
        
        ToggleGroup tg1= new ToggleGroup();
        aolownedy1.setToggleGroup(tg1);
        aolownedn1.setToggleGroup(tg1);
        ChangeListener<Toggle> listener10 = new ChangeListener<Toggle>()
                {        
         @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t= (RadioButton)val.getToggleGroup().getSelectedToggle();
                binding3.setaolownedy1(t.getText());
                }
                };
        tg1.selectedToggleProperty().addListener(listener10);
        
        ToggleGroup tg2= new ToggleGroup();
        aolownedy2.setToggleGroup(tg2);
        aolownedn2.setToggleGroup(tg2);
        ChangeListener<Toggle> listener11 = new ChangeListener<Toggle>()
                {        
         @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t= (RadioButton)val.getToggleGroup().getSelectedToggle();
                binding3.setaolownedy2(t.getText());
                }
                };
        tg2.selectedToggleProperty().addListener(listener11);
        
        ToggleGroup tg3= new ToggleGroup();
        aolownedy3.setToggleGroup(tg3);
        aolownedn3.setToggleGroup(tg3);
        ChangeListener<Toggle> listener12 = new ChangeListener<Toggle>()
                {        
         @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t= (RadioButton)val.getToggleGroup().getSelectedToggle();
                binding3.setaolownedy3(t.getText());
                }
                };
        tg3.selectedToggleProperty().addListener(listener12);
        
        ToggleGroup tg4= new ToggleGroup();
        aolownedy3.setToggleGroup(tg4);
        aolownedn3.setToggleGroup(tg4);
        ChangeListener<Toggle> listener13 = new ChangeListener<Toggle>()
                {        
         @Override
            public void changed(ObservableValue<? extends Toggle> prop, Toggle old, Toggle val) {
                RadioButton t= (RadioButton)val.getToggleGroup().getSelectedToggle();
                binding3.setaolownedy4(t.getText());
                }
                };
        tg4.selectedToggleProperty().addListener(listener13);
        
        
        //checkbox
        ChangeListener<Boolean> listener = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(ecommerce.isSelected())
                {System.out.println("Selected");
                binding2.seteCommerce("ecommerce selected");
                }
            }
        };
        ecommerce.selectedProperty().addListener(listener);
        // ecommerce.setSelected(true);
        ChangeListener<Boolean> listener2 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(profliability.isSelected())
                {
                binding2.setprofLiability("selected");
                }
            }
        };
        profliability.selectedProperty().addListener(listener2);
        
        ChangeListener<Boolean> listener3 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(cyberliability.isSelected())
                {
                binding2.setcyberLiability("selected");
                }
            }
        };
        cyberliability.selectedProperty().addListener(listener3);
        
        ChangeListener<Boolean> listener4 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(pollexposure.isSelected())
                {
                binding2.setpollExposure("selected");
                }
            }
        };
        pollexposure.selectedProperty().addListener(listener4);
        
        ChangeListener<Boolean> listener5 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(accbenefits.isSelected())
                {
                binding2.setaccBenefits("selected");
                }
            }
        };
        accbenefits.selectedProperty().addListener(listener5);
        
        ChangeListener<Boolean> listener6 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(malexposure.isSelected())
                {
                binding2.setmalExposure("selected");
                }
            }
        };
        malexposure.selectedProperty().addListener(listener6);
        
        ChangeListener<Boolean> listener7 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(abuseexposure.isSelected())
                {
                binding2.setabuseExposure("selected");
                }
            }
        };
        abuseexposure.selectedProperty().addListener(listener7);
        
        ChangeListener<Boolean> listener8 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(bondopportunity.isSelected())
                {
                binding2.setbondOpportunity("selected");
                }
            }
        };
        bondopportunity.selectedProperty().addListener(listener8);
        
        ChangeListener<Boolean> listener9 = new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> prop, Boolean old, Boolean val) {
                if(biw.isSelected())
                {
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
     
        /*datePicker.localeProperty().set(Locale.ENGLISH);
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
    public void submitAction1() {
        
            openingPane.setVisible(false);
            newBusinessPane.setVisible(true);
        }
    @FXML
    public void submitAction2() {
        animatedMovement(-1269, 0);
        }
    @FXML
    public void submitAction3() {
        animatedMovement(-2538, 0);
        }
    @FXML
    public void submitAction4() {
        animatedMovement(-3807, 0);
        }
    @FXML
    public void submitAction5() {
        animatedMovement(-5076, 0);
        }
    @FXML
    public void submitAction6() {
       animatedMovement(-6345, 0);
//marketercomments.setText(getReceivedemailaddress());
          
        }
    
    @FXML
    public void submitFormAction() {
       
            
            Task task = new Task<Void>() {
                @Override
                public Void call() throws Exception {
                    
                    InsuranceOperationsService_Service port=new InsuranceOperationsService_Service();
                    InsuranceFormSubmitRequest req1=new InsuranceFormSubmitRequest(); 
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
                  /*  req1.setNoOfStaff(Integer.parseInt(binding2.getNoofStaff()));
                    req1.setPayRoll(Integer.parseInt(binding2.getpayroll()));*/
                    req1.setDescriptionOfOperationsAndRevenue1(binding2.getdescriptionOfOpAndRev1());
                    req1.setDescriptionOfOperationsAndRevenue2(binding2.getdescriptionOfOpAndRev2());
                    req1.setDescriptionOfOperationsAndRevenue3(binding2.getdescriptionOfOpAndRev3());
                    req1.setDescriptionOfOperationsAndRevenue4(binding2.getdescriptionOfOpAndRev4());
               /*     req1.setAmount1(Double.parseDouble(binding2.getamount1()));
                    req1.setAmount2(Double.parseDouble(binding2.getamount2()));
                    req1.setAmount3(Double.parseDouble(binding2.getamount3()));
                    req1.setAmount4(Double.parseDouble(binding2.getamount4()));*/
                   req1.setLoggedInUserEmailAddress(getReceivedemailaddress());
                    
                    
                    try {
                        InsuranceFormSubmitResponse response= port.getInsuranceOperationsPort().formSubmission(req1);
                        if (response.getStatus() != null && response.getStatus().equals("SUCCESS")) {
                            successMessage("Form has been submitted. Your Form id is:"+response.getFormId());
                           
                        } 
                        else {
                            errors(response.getErrorMessage());
                    } 
                    }
                    catch (com.rav.insurance.insuranceformoperations.webservice.Exception ex) {
                        
                       
                        Logger.getLogger(RegistrationPageController.class.getName()).log(Level.SEVERE, null, ex);
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
}
