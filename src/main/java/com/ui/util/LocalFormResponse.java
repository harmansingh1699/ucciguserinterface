/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.util;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author harsimransingh
 */
public class LocalFormResponse implements Serializable{
    
	private String formId;
	private Date creationDate;
	private String producer;
	private String branch;

	private String keyContact;
	private String keyContactPhone;
	private String keyContactEmailAddress;
	private String secondayContact;
	private String secondayContactPhone;
	private String secondayContactEmailAddress;
	private String otherSpecify;

	private String withUs;
	private String type;
	private String profit;
	private String nonProfit;
	private String owner1;
	private String owner2;
	private String owner3;
	private String owner4;
	private String severity;
	private String boardOfDirector1;
	private String boardOfDirector2;
	private String boardOfDirector4;
	private String boardOfDirector3;
	private String currency1;
	private String currency2;
	private String currency3;
	private String currency4;
	private int onpremises;
	private int offpremises;
	private int residential;
	private int commercial;
	private int subcontracted;
	private String ecommerce;
	private String professionalLiability;
	private String cyberLiability;
	private String pollutionexposure;
	private String accidentalBenefits;
	private String malpracticeExposure;
	private String abuseExposure;
	private String bondingOpportunities;
	private String groupBenefits;
	private String pensionPlan;
	private String businessInterruptionSheet;
	private Date currentInsuranceExpiry1;
	private Date currentInsuranceExpiry2;
	private Date currentInsuranceExpiry3;
	private String addressOfLocationOwnedyes1;
	private String addressOfLocationOwnedyes2;
	private String addressOfLocationOwnedyes3;
	private String addressOfLocationOwnedno1;
	private String addressOfLocationOwnedno2;
	private String addressOfLocationOwnedno3;
	private String producercomments;
	private String marketercomments;

	private String businessCategory;
	private String businessName;
	private String mailingAddress;
	private String fax;
	private String webSiteURL;
	private int numberOfLocations;
	private int numberOfOwnedAutos;

	private String entityType;
	private int yearInBusiness;

	public int getYearInBusiness() {
		return yearInBusiness;
	}

	public void setYearInBusiness(int yearInBusiness) {
		this.yearInBusiness = yearInBusiness;
	}

	private String relatedExperience;

	private String owners;
	private String boardOfDirectors;
	private String financialYearEnd;
	private int noOfStaff;
	private double payRoll;
	private String descriptionOfOperationsAndRevenue1;
	private double amount1;
	private String descriptionOfOperationsAndRevenue2;
	private double amount2;
	private String descriptionOfOperationsAndRevenue3;
	private double amount3;
	private String descriptionOfOperationsAndRevenue4;
	private double amount4;
	private String descriptionOfOperationsAndRevenue5;
	private double amount5;
	private String descriptionOfOperationsAndRevenue6;
	private double amount6;
	private double totalSale;
	private double percentageOfUSSales;

	private String largestCustomerOrProject1;
	private String largestCustomerOrProject2;
	private String largestCustomerOrProject3;
	private String largestCustomerOrProject4;
	private String largestCustomerOrProject5;
	private String largestCustomerOrProject6;
	private String largestSuppliers1;
	private String largestSuppliers2;
	private String largestSuppliers3;
	private String largestSuppliers4;

	private String futureOpportunitiesOrPlanOfGrowth;
	private String describeCompetition;
	private String businessAsset;
	private String advertising;
	private String durationIncaseOfSeriousClaims;
	private String pastClaimCause1;
	private Date pastClaimDate1;
	private double pastClaimAmount1;
	private String pastClaimCause2;
	private Date pastClaimDate2;
	private double pastClaimAmount2;
	private String pastClaimCause3;
	private Date pastClaimDate3;
	private double pastClaimAmount3;
	private String pastClaimCause4;
	private Date pastClaimDate4;
	private double pastClaimAmount4;
	private String pastClaimCause5;
	private Date pastClaimDate5;
	private double pastClaimAmount5;
	private String pastClaimCause6;
	private Date pastClaimDate6;
	private double pastClaimAmount6;

	private String currentInsuranceType1;
	private String currentInsuranceCarrier1;

	private String currentInsuranceType2;
	private String currentInsuranceCarrier2;

	private String currentInsuranceType3;
	private String currentInsuranceCarrier3;

	private String currentInsuranceType4;
	private String currentInsuranceCarrier4;
	private String currentInsuranceExpiry4;

	private String lineHolders1;
	private String lineHoldersLoc1;
	private String lineHolders2;
	private String lineHoldersLoc2;
	private String lineHolders3;
	private String lineHoldersLoc3;
	private String lineHolders4;
	private String lineHoldersLoc4;

	private String addressOfLocation1;
	private String addressOfLocationUse1;
	private String addressOfLocation2;
	private String addressOfLocationUse2;
	private String addressOfLocation3;
	private String addressOfLocationUse3;

	private String addressOfLocation4;
	private String addressOfLocationUse4;

	private String addressOfLocation5;
	private String addressOfLocationUse5;

	private String locationRentedToOthers1;
	private String locationRentedToOthers2;
	private String locationRentedToOthers3;
	private String locationRentedToOthers4;
	private String locationRentedToOthers5;

	private double buildingLimit;
	private double buildingDeductible;
	private double contentsLimit;
	private double contentsDeductible;
	private double stockLimit;
	private double stockDeductible;
	private double officeContentLimit;
	private double officeContentDeductible;
	private double edpLimit;
	private double edpDeductible;
	private double equipmentLimit;
	private double equipmentDeductible;
	private double offPremisesLimit;
	private double offPremisesDeductible;
	private double transitLimit;
	private double transitDeductible;
	private double miscPropertyLimit;
	private double miscPropertyDeductible;
	private double contractorEquipmentLimit;
	private double contractorEquipmentDeductible;
	private double installationFloaterLimit;
	private double installationFloaterDeductible;
	private double toolFloaterLimit;
	private double toolFloaterDeductible;
	private double signFloaterLimit;
	private double signFloaterDeductible;
	private String truckMan;
	private String owner;
	private double motorTruckLimit;
	private double motorTruckDeductible;
	private double glassLimit;
	private double glassDeductible;

	private double sewerBackupDeductible;

	private double floodDeductible;

	private double earthquakeDeductible;
	private double profitLimit;
	private double profitDeductible;
	private String grossEarningCheckbox;
	private double grossEarningLimit;
	private double grossEarningDeductible;
	private double rentalIncomeLimit;
	private double rentalIncomeDeductible;
	private double extraExpenseLimit;
	private double extraExpenseDeductible;
	private double offPremisesPowerLimit;
	private double offPremisesPowerDeductible;
	private double insideOutsideLimit;
	private double insideOutsideDeductible;
	private double bfMoneyLimit;
	private double bfMoneyDeductible;
	private double deopistorForgeryLimit;
	private double deopistorForgeryDeductible;
	private double moneyOrdersLimit;
	private double moneyOrdersDeductible;
	private double employDishonestyLimit;
	private double employDishonestyDeductible;
	private double cglLimit;
	private double cglDeductible;
	private double tenantsLegalLimit;
	private double tenantsLegalDeductible;
	private double nonOwnedAutoLimit;
	private double nonOwnedAutoDeductible;
	private double sef96Limit;
	private double sef96Deductible;
	private double sef94Limit;
	private double sef94Deductible;
	private double doLimit;
	private double doDeductible;
	private double eoLimit;
	private double eoDeductible;
	private double employerLimit;
	private double employerDeductible;
	private double umbrellaLimit;
	private double umbrellaDeductible;
	private double wrapUpLimit;
	private double wrapUpDeductible;
	private double stdComprehensiveLimit;
	private double stdComprehensiveDeductible;
	private double airConditioningLimit;
	private double airConditioningDeductible;
	private double productionMachineryLimit;
	private double productionMachineryDeductible;
	private String othercoverage1;
	private String othercoverage2;
	private double otherCoverageLimit1;
	private double otherCoverageDeductible1;
	private double otherCoverageLimit2;
	private double otherCoverageDeductible2;

	private String address;
	private int age;
	private double totalSqFootage;
	private double insdSqFootage;
	private int noOfStories;
	private String basement;
	private String wallsframe;
	private String wallshcb;
	private String wallssteel;
	private String wallsbrick;
	private String roofwood;
	private String roofsteel;
	private String roofconcrete;
	private String roofupdated;
	private String floorsconcrete;
	private String floorswood;
	private String heatinggas;
	private String heatingoil;
	private String heatingelectric;
	private String heatingother;
	private String heatingupdated;	
	private String electricalbreakers;
	private String electricalfuses;
	private String electricalamps;
	private String electricalupdated;
	private String plumbingcopper;
	private String plumbingpvc;
	private String plumbingother;
	private String plumbingupdated;
	private String fireProtection;
	private String fireProtectiondistance;
	private String security;
	private String additionalcoverage;

	private double buildingLimit1;
	private double buildingDeductible1;
	private double contentsLimit1;
	private double contentsDeductible1;
	private double stockLimit1;
	private double stockDeductible1;
	private double officeContentLimit1;
	private double officeContentDeductible1;
	private double edpLimit1;
	private double edpDeductible1;
	private double equipmentLimit1;
	private double equipmentDeductible1;
	private double offPremisesLimit1;
	private double offPremisesDeductible1;
	private double transitLimit1;
	private double transitDeductible1;
	private double miscPropertyLimit1;
	private double miscPropertyDeductible1;
	private double contractorEquipmentLimit1;
	private double contractorEquipmentDeductible1;
	private double installationFloaterLimit1;
	private double installationFloaterDeductible1;
	private double toolFloaterLimit1;
	private double toolFloaterDeductible1;
	private double signFloaterLimit1;
	private double signFloaterDeductible1;
	private String truckMan1;
	private String owner11;
	private double motorTruckLimit1;
	private double motorTruckDeductible1;
	private double glassLimit1;
	private double glassDeductible1;
	private double sewerBackupLimit1;
	private double sewerBackupDeductible1;
	private double floodLimit1;
	private double floodDeductible1;
	private double earthquakeLimit1;
	private double earthquakeDeductible1;
	private double profitLimit1;
	private double profitDeductible1;
	private String grossEarning801;
	private String grossEarning501;
	private double grossEarningLimit1;
	private double grossEarningDeductible1;
	private double rentalIncomeLimit1;
	private double rentalIncomeDeductible1;
	private double extraExpenseLimit1;
	private double extraExpenseDeductible1;
	private double offPremisesPowerLimit1;
	private double offPremisesPowerDeductible1;
	private double insideOutsideLimit1;
	private double insideOutsideDeductible1;
	private double bfMoneyLimit1;
	private double bfMoneyDeductible1;
	private double deopistorForgeryLimit1;
	private double deopistorForgeryDeductible1;
	private double moneyOrdersLimit1;
	private double moneyOrdersDeductible1;
	private double employDishonestyLimit1;
	private double employDishonestyDeductible1;
	private double cglLimit1;
	private double cglDeductible1;
	private double tenantsLegalLimit1;
	private double tenantsLegalDeductible1;
	private double nonOwnedAutoLimit1;
	private double nonOwnedAutoDeductible1;
	private double sef96Limit1;
	private double sef96Deductible1;
	private double sef94Limit1;
	private double sef94Deductible1;
	private double doLimit1;
	private double doDeductible1;
	private double eoLimit1;
	private double eoDeductible1;
	private double employerLimit1;
	private double employerDeductible1;
	private double umbrellaLimit1;
	private double umbrellaDeductible1;
	private double wrapUpLimit1;
	private double wrapUpDeductible1;
	private double stdComprehensiveLimit1;
	private double stdComprehensiveDeductible1;
	private double airConditioningLimit1;
	private double airConditioningDeductible1;
	private double productionMachineryLimit1;
	private double productionMachineryDeductible1;
	private String othercoverage11;
	private String othercoverage21;
	private double otherCoverageLimit11;
	private double otherCoverageDeductible11;
	private double otherCoverageLimit21;
	private double otherCoverageDeductible21;

	private String address1;
	private int age1;
	private double totalSqFootage1;
	private double insdSqFootage1;
	private int noOfStories1;
	private String basement1;
	private String walls1;
	private String roof1;
	private String roofupdated1;
	private String floors1;
	private String heating1;
	private String heatingupdated1;
	private String electrical1;
	private String electricalupdated1;
	private String plumbing1;
	private String plumbingupdated1;
	private String fireProtection1;
	private String fireProtectiondistance1;
	private String security1;
	private String notes1;

	private double buildingLimit2;
	private double buildingDeductible2;
	private double contentsLimit2;
	private double contentsDeductible2;
	private double stockLimit2;
	private double stockDeductible2;
	private double officeContentLimit2;
	private double officeContentDeductible2;
	private double edpLimit2;
	private double edpDeductible2;
	private double equipmentLimit2;
	private double equipmentDeductible2;
	private double offPremisesLimit2;
	private double offPremisesDeductible2;
	private double transitLimit2;
	private double transitDeductible2;
	private double miscPropertyLimit2;
	private double miscPropertyDeductible2;
	private double contractorEquipmentLimit2;
	private double contractorEquipmentDeductible2;
	private double installationFloaterLimit2;
	private double installationFloaterDeductible2;
	private double toolFloaterLimit2;
	private double toolFloaterDeductible2;
	private double signFloaterLimit2;
	private double signFloaterDeductible2;
	private String truckMan2;
	private String owner12;
	private double motorTruckLimit2;
	private double motorTruckDeductible2;
	private double glassLimit2;
	private double glassDeductible2;
	private double sewerBackupLimit2;
	private double sewerBackupDeductible2;
	private double floodLimit2;
	private double floodDeductible2;
	private double earthquakeLimit2;
	private double earthquakeDeductible2;
	private double profitLimit2;
	private double profitDeductible2;
	private String grossEarning802;
	private String grossEarning502;
	private double grossEarningLimit2;
	private double grossEarningDeductible2;
	private double rentalIncomeLimit2;
	private double rentalIncomeDeductible2;
	private double extraExpenseLimit2;
	private double extraExpenseDeductible2;
	private double offPremisesPowerLimit2;
	private double offPremisesPowerDeductible2;
	private double insideOutsideLimit2;
	private double insideOutsideDeductible2;
	private double bfMoneyLimit2;
	private double bfMoneyDeductible2;
	private double deopistorForgeryLimit2;
	private double deopistorForgeryDeductible2;
	private double moneyOrdersLimit2;
	private double moneyOrdersDeductible2;
	private double employDishonestyLimit2;
	private double employDishonestyDeductible2;
	private double cglLimit2;
	private double cglDeductible2;
	private double tenantsLegalLimit2;
	private double tenantsLegalDeductible2;
	private double nonOwnedAutoLimit2;
	private double nonOwnedAutoDeductible2;
	private double sef96Limit2;
	private double sef96Deductible2;
	private double sef94Limit2;
	private double sef94Deductible2;
	private double doLimit2;
	private double doDeductible2;
	private double eoLimit2;
	private double eoDeductible2;
	private double employerLimit2;
	private double employerDeductible2;
	private double umbrellaLimit2;
	private double umbrellaDeductible2;
	private double wrapUpLimit2;
	private double wrapUpDeductible2;
	private double stdComprehensiveLimit2;
	private double stdComprehensiveDeductible2;
	private double airConditioningLimit2;
	private double airConditioningDeductible2;
	private double productionMachineryLimit2;
	private double productionMachineryDeductible2;
	private String othercoverage12;
	private String othercoverage22;
	private double otherCoverageLimit12;
	private double otherCoverageDeductible12;
	private double otherCoverageLimit22;
	private double otherCoverageDeductible22;

	private String address2;
	private int age2;
	private double totalSqFootage2;
	private double insdSqFootage2;
	private int noOfStories2;
	private String basement2;
	private String walls2;
	private String roof2;
	private String roofupdated2;
	private String floors2;
	private String heating2;
	private String heatingupdated2;
	private String electrical2;
	private String electricalupdated2;
	private String plumbing2;
	private String plumbingupdated2;
	private String fireProtection2;
	private String fireProtectiondistance2;
	private String security2;
	private String notes2;

	private double buildingLimit3;
	private double buildingDeductible3;
	private double contentsLimit3;
	private double contentsDeductible3;
	private double stockLimit3;
	private double stockDeductible3;
	private double officeContentLimit3;
	private double officeContentDeductible3;
	private double edpLimit3;
	private double edpDeductible3;
	private double equipmentLimit3;
	private double equipmentDeductible3;
	private double offPremisesLimit3;
	private double offPremisesDeductible3;
	private double transitLimit3;
	private double transitDeductible3;
	private double miscPropertyLimit3;
	private double miscPropertyDeductible3;
	private double contractorEquipmentLimit3;
	private double contractorEquipmentDeductible3;
	private double installationFloaterLimit3;
	private double installationFloaterDeductible3;
	private double toolFloaterLimit3;
	private double toolFloaterDeductible3;
	private double signFloaterLimit3;
	private double signFloaterDeductible3;
	private String truckMan3;
	private String owner13;
	private double motorTruckLimit3;
	private double motorTruckDeductible3;
	private double glassLimit3;
	private double glassDeductible3;
	private double sewerBackupLimit3;
	private double sewerBackupDeductible3;
	private double floodLimit3;
	private double floodDeductible3;
	private double earthquakeLimit3;
	private double earthquakeDeductible3;
	private double profitLimit3;
	private double profitDeductible3;
	private String grossEarning803;
	private String grossEarning503;
	private double grossEarningLimit3;
	private double grossEarningDeductible3;
	private double rentalIncomeLimit3;
	private double rentalIncomeDeductible3;
	private double extraExpenseLimit3;
	private double extraExpenseDeductible3;
	private double offPremisesPowerLimit3;
	private double offPremisesPowerDeductible3;
	private double insideOutsideLimit3;
	private double insideOutsideDeductible3;
	private double bfMoneyLimit3;
	private double bfMoneyDeductible3;
	private double deopistorForgeryLimit3;
	private double deopistorForgeryDeductible3;
	private double moneyOrdersLimit3;
	private double moneyOrdersDeductible3;
	private double employDishonestyLimit3;
	private double employDishonestyDeductible3;
	private double cglLimit3;
	private double cglDeductible3;
	private double tenantsLegalLimit3;
	private double tenantsLegalDeductible3;
	private double nonOwnedAutoLimit3;
	private double nonOwnedAutoDeductible3;
	private double sef96Limit3;
	private double sef96Deductible3;
	private double sef94Limit3;
	private double sef94Deductible3;
	private double doLimit3;
	private double doDeductible3;
	private double eoLimit3;
	private double eoDeductible3;
	private double employerLimit3;
	private double employerDeductible3;
	private double umbrellaLimit3;
	private double umbrellaDeductible3;
	private double wrapUpLimit3;
	private double wrapUpDeductible3;
	private double stdComprehensiveLimit3;
	private double stdComprehensiveDeductible3;
	private double airConditioningLimit3;
	private double airConditioningDeductible3;
	private double productionMachineryLimit3;
	private double productionMachineryDeductible3;
	private String othercoverage13;
	private String othercoverage23;
	private double otherCoverageLimit13;
	private double otherCoverageDeductible13;
	private double otherCoverageLimit23;
	private double otherCoverageDeductible23;

	private String address3;
	private int age3;
	private double totalSqFootage3;
	private double insdSqFootage3;
	private int noOfStories3;
	private String basement3;
	private String walls3;
	private String roof3;
	private String roofupdated3;
	private String floors3;
	private String heating3;
	private String heatingupdated3;
	private String electrical3;
	private String electricalupdated3;
	private String plumbing3;
	private String plumbingupdated3;
	private String fireProtection3;
	private String fireProtectiondistance3;
	private String security3;
	private String notes3;

	private double buildingLimit4;
	private double buildingDeductible4;
	private double contentsLimit4;
	private double contentsDeductible4;
	private double stockLimit4;
	private double stockDeductible4;
	private double officeContentLimit4;
	private double officeContentDeductible4;
	private double edpLimit4;
	private double edpDeductible4;
	private double equipmentLimit4;
	private double equipmentDeductible4;
	private double offPremisesLimit4;
	private double offPremisesDeductible4;
	private double transitLimit4;
	private double transitDeductible4;
	private double miscPropertyLimit4;
	private double miscPropertyDeductible4;
	private double contractorEquipmentLimit4;
	private double contractorEquipmentDeductible4;
	private double installationFloaterLimit4;
	private double installationFloaterDeductible4;
	private double toolFloaterLimit4;
	private double toolFloaterDeductible4;
	private double signFloaterLimit4;
	private double signFloaterDeductible4;
	private String truckMan4;
	private String owner14;
	private double motorTruckLimit4;
	private double motorTruckDeductible4;
	private double glassLimit4;
	private double glassDeductible4;
	private double sewerBackupLimit4;
	private double sewerBackupDeductible4;
	private double floodLimit4;
	private double floodDeductible4;
	private double earthquakeLimit4;
	private double earthquakeDeductible4;
	private double profitLimit4;
	private double profitDeductible4;
	private String grossEarning804;
	private String grossEarning504;
	private double grossEarningLimit4;
	private double grossEarningDeductible4;
	private double rentalIncomeLimit4;
	private double rentalIncomeDeductible4;
	private double extraExpenseLimit4;
	private double extraExpenseDeductible4;
	private double offPremisesPowerLimit4;
	private double offPremisesPowerDeductible4;
	private double insideOutsideLimit4;
	private double insideOutsideDeductible4;
	private double bfMoneyLimit4;
	private double bfMoneyDeductible4;
	private double deopistorForgeryLimit4;
	private double deopistorForgeryDeductible4;
	private double moneyOrdersLimit4;
	private double moneyOrdersDeductible4;
	private double employDishonestyLimit4;
	private double employDishonestyDeductible4;
	private double cglLimit4;
	private double cglDeductible4;
	private double tenantsLegalLimit4;
	private double tenantsLegalDeductible4;
	private double nonOwnedAutoLimit4;
	private double nonOwnedAutoDeductible4;
	private double sef96Limit4;
	private double sef96Deductible4;
	private double sef94Limit4;
	private double sef94Deductible4;
	private double doLimit4;
	private double doDeductible4;
	private double eoLimit4;
	private double eoDeductible4;
	private double employerLimit4;
	private double employerDeductible4;
	private double umbrellaLimit4;
	private double umbrellaDeductible4;
	private double wrapUpLimit4;
	private double wrapUpDeductible4;
	private double stdComprehensiveLimit4;
	private double stdComprehensiveDeductible4;
	private double airConditioningLimit4;
	private double airConditioningDeductible4;
	private double productionMachineryLimit4;
	private double productionMachineryDeductible4;
	private String othercoverage14;
	private String othercoverage24;
	private double otherCoverageLimit14;
	private double otherCoverageDeductible14;
	private double otherCoverageLimit24;
	private double otherCoverageDeductible24;

	private String address4;
	private int age4;
	private double totalSqFootage4;
	private double insdSqFootage4;
	private int noOfStories4;
	private String basement4;
	private String walls4;
	private String roof4;
	private String roofupdated4;
	private String floors4;
	private String heating4;
	private String heatingupdated4;
	private String electrical4;
	private String electricalupdated4;
	private String plumbing4;
	private String plumbingupdated4;
	private String fireProtection4;
	private String fireProtectiondistance4;
	private String security4;
	private String notes4;

	private String currentInsurer;
	private Date currentExpDate;
	private double premiumTarget;

	private String lienHolders1;
	private String lienHoldersVehicle1;
	private String lienHolders2;
	private String lienHoldersVehicle2;
	private String lienHolders3;
	private String lienHoldersVehicle3;
	private Date claimDate1;
	private String claimDesc1;
	private Date claimDate2;
	private String claimDesc2;
	private Date claimDate3;
	private String claimDesc3;
	private Date claimDate4;
	private String claimDesc4;
	private Date claimDate5;
	private String claimDesc5;
	private Date claimDate6;
	private String claimDesc6;
	private String commoditiesTransportedBy;
	private String haulingForOthers;

	private String filingState1;
	private String filingUSDot1;
	private String dilingDocket1;
	private String filingType1;
	private String filingName1;
	private String filingState2;
	private String filingUSDot2;
	private String dilingDocket2;
	private String filingType2;
	private String filingName2;
	private String filingState3;
	private String filingUSDot3;
	private String dilingDocket3;
	private String filingType3;
	private String filingName3;
	
	private String vehicleNonOwned;
	private String contract;
	private String typeOfNonOwned;
	private double avgNoOfVehicles;
	private double avgValue;
	private double maxVehicleValue;
	private double maxCostValue;
	private String instructionNotes;

	private String marketerUserName;
	private String status;
	private String producerUserName;

	private byte[] file1;
	private String file1Name;
	private byte[] file2;
	private String file2Name;
	private byte[] file3;
	private String file3Name;
	private byte[] file4;
	private String file4Name;
	private byte[] file5;
	private String file5Name;
	private byte[] file6;
	private String file6Name;
	private byte[] file7;
	private String file7Name;
	private byte[] file8;
	private String file8Name;
	private byte[] file9;
	private String file9Name;
	private byte[] file10;
	private String file10Name;

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getKeyContact() {
		return keyContact;
	}

	public void setKeyContact(String keyContact) {
		this.keyContact = keyContact;
	}

	public String getKeyContactPhone() {
		return keyContactPhone;
	}

	public void setKeyContactPhone(String keyContactPhone) {
		this.keyContactPhone = keyContactPhone;
	}

	public String getKeyContactEmailAddress() {
		return keyContactEmailAddress;
	}

	public void setKeyContactEmailAddress(String keyContactEmailAddress) {
		this.keyContactEmailAddress = keyContactEmailAddress;
	}

	public String getSecondayContact() {
		return secondayContact;
	}

	public void setSecondayContact(String secondayContact) {
		this.secondayContact = secondayContact;
	}

	public String getSecondayContactPhone() {
		return secondayContactPhone;
	}

	public void setSecondayContactPhone(String secondayContactPhone) {
		this.secondayContactPhone = secondayContactPhone;
	}

	public String getSecondayContactEmailAddress() {
		return secondayContactEmailAddress;
	}

	public void setSecondayContactEmailAddress(
			String secondayContactEmailAddress) {
		this.secondayContactEmailAddress = secondayContactEmailAddress;
	}

	public String getBusinessCategory() {
		return businessCategory;
	}

	public void setBusinessCategory(String businessCategory) {
		this.businessCategory = businessCategory;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebSiteURL() {
		return webSiteURL;
	}

	public void setWebSiteURL(String webSiteURL) {
		this.webSiteURL = webSiteURL;
	}

	public int getNumberOfLocations() {
		return numberOfLocations;
	}

	public void setNumberOfLocations(int numberOfLocations) {
		this.numberOfLocations = numberOfLocations;
	}

	public int getNumberOfOwnedAutos() {
		return numberOfOwnedAutos;
	}

	public void setNumberOfOwnedAutos(int numberOfOwnedAutos) {
		this.numberOfOwnedAutos = numberOfOwnedAutos;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getRelatedExperience() {
		return relatedExperience;
	}

	public void setRelatedExperience(String relatedExperience) {
		this.relatedExperience = relatedExperience;
	}

	public String getOwners() {
		return owners;
	}

	public void setOwners(String owners) {
		this.owners = owners;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getFinancialYearEnd() {
		return financialYearEnd;
	}

	public void setFinancialYearEnd(String financialYearEnd) {
		this.financialYearEnd = financialYearEnd;
	}

	public int getNoOfStaff() {
		return noOfStaff;
	}

	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}

	public double getPayRoll() {
		return payRoll;
	}

	public void setPayRoll(double payRoll) {
		this.payRoll = payRoll;
	}

	public String getDescriptionOfOperationsAndRevenue1() {
		return descriptionOfOperationsAndRevenue1;
	}

	public void setDescriptionOfOperationsAndRevenue1(
			String descriptionOfOperationsAndRevenue1) {
		this.descriptionOfOperationsAndRevenue1 = descriptionOfOperationsAndRevenue1;
	}

	public double getAmount1() {
		return amount1;
	}

	public void setAmount1(double amount1) {
		this.amount1 = amount1;
	}

	public String getDescriptionOfOperationsAndRevenue2() {
		return descriptionOfOperationsAndRevenue2;
	}

	public void setDescriptionOfOperationsAndRevenue2(
			String descriptionOfOperationsAndRevenue2) {
		this.descriptionOfOperationsAndRevenue2 = descriptionOfOperationsAndRevenue2;
	}

	public double getAmount2() {
		return amount2;
	}

	public void setAmount2(double amount2) {
		this.amount2 = amount2;
	}

	public String getDescriptionOfOperationsAndRevenue3() {
		return descriptionOfOperationsAndRevenue3;
	}

	public void setDescriptionOfOperationsAndRevenue3(
			String descriptionOfOperationsAndRevenue3) {
		this.descriptionOfOperationsAndRevenue3 = descriptionOfOperationsAndRevenue3;
	}

	public double getAmount3() {
		return amount3;
	}

	public void setAmount3(double amount3) {
		this.amount3 = amount3;
	}

	public String getDescriptionOfOperationsAndRevenue4() {
		return descriptionOfOperationsAndRevenue4;
	}

	public void setDescriptionOfOperationsAndRevenue4(
			String descriptionOfOperationsAndRevenue4) {
		this.descriptionOfOperationsAndRevenue4 = descriptionOfOperationsAndRevenue4;
	}

	public double getAmount4() {
		return amount4;
	}

	public void setAmount4(double amount4) {
		this.amount4 = amount4;
	}

	public String getDescriptionOfOperationsAndRevenue5() {
		return descriptionOfOperationsAndRevenue5;
	}

	public void setDescriptionOfOperationsAndRevenue5(
			String descriptionOfOperationsAndRevenue5) {
		this.descriptionOfOperationsAndRevenue5 = descriptionOfOperationsAndRevenue5;
	}

	public double getAmount5() {
		return amount5;
	}

	public void setAmount5(double amount5) {
		this.amount5 = amount5;
	}

	public String getDescriptionOfOperationsAndRevenue6() {
		return descriptionOfOperationsAndRevenue6;
	}

	public void setDescriptionOfOperationsAndRevenue6(
			String descriptionOfOperationsAndRevenue6) {
		this.descriptionOfOperationsAndRevenue6 = descriptionOfOperationsAndRevenue6;
	}

	public double getAmount6() {
		return amount6;
	}

	public void setAmount6(double amount6) {
		this.amount6 = amount6;
	}

	public double getTotalSale() {
		return totalSale;
	}

	public void setTotalSale(double totalSale) {
		this.totalSale = totalSale;
	}

	public double getPercentageOfUSSales() {
		return percentageOfUSSales;
	}

	public void setPercentageOfUSSales(double percentageOfUSSales) {
		this.percentageOfUSSales = percentageOfUSSales;
	}

	public String getLargestCustomerOrProject1() {
		return largestCustomerOrProject1;
	}

	public void setLargestCustomerOrProject1(String largestCustomerOrProject1) {
		this.largestCustomerOrProject1 = largestCustomerOrProject1;
	}

	public String getLargestCustomerOrProject2() {
		return largestCustomerOrProject2;
	}

	public void setLargestCustomerOrProject2(String largestCustomerOrProject2) {
		this.largestCustomerOrProject2 = largestCustomerOrProject2;
	}

	public String getLargestCustomerOrProject3() {
		return largestCustomerOrProject3;
	}

	public void setLargestCustomerOrProject3(String largestCustomerOrProject3) {
		this.largestCustomerOrProject3 = largestCustomerOrProject3;
	}

	public String getLargestCustomerOrProject4() {
		return largestCustomerOrProject4;
	}

	public void setLargestCustomerOrProject4(String largestCustomerOrProject4) {
		this.largestCustomerOrProject4 = largestCustomerOrProject4;
	}

	public String getLargestCustomerOrProject5() {
		return largestCustomerOrProject5;
	}

	public void setLargestCustomerOrProject5(String largestCustomerOrProject5) {
		this.largestCustomerOrProject5 = largestCustomerOrProject5;
	}

	public String getLargestCustomerOrProject6() {
		return largestCustomerOrProject6;
	}

	public void setLargestCustomerOrProject6(String largestCustomerOrProject6) {
		this.largestCustomerOrProject6 = largestCustomerOrProject6;
	}

	public String getLargestSuppliers1() {
		return largestSuppliers1;
	}

	public void setLargestSuppliers1(String largestSuppliers1) {
		this.largestSuppliers1 = largestSuppliers1;
	}

	public String getLargestSuppliers2() {
		return largestSuppliers2;
	}

	public void setLargestSuppliers2(String largestSuppliers2) {
		this.largestSuppliers2 = largestSuppliers2;
	}

	public String getLargestSuppliers3() {
		return largestSuppliers3;
	}

	public void setLargestSuppliers3(String largestSuppliers3) {
		this.largestSuppliers3 = largestSuppliers3;
	}

	public String getLargestSuppliers4() {
		return largestSuppliers4;
	}

	public void setLargestSuppliers4(String largestSuppliers4) {
		this.largestSuppliers4 = largestSuppliers4;
	}

	public String getFutureOpportunitiesOrPlanOfGrowth() {
		return futureOpportunitiesOrPlanOfGrowth;
	}

	public void setFutureOpportunitiesOrPlanOfGrowth(
			String futureOpportunitiesOrPlanOfGrowth) {
		this.futureOpportunitiesOrPlanOfGrowth = futureOpportunitiesOrPlanOfGrowth;
	}

	public String getDescribeCompetition() {
		return describeCompetition;
	}

	public void setDescribeCompetition(String describeCompetition) {
		this.describeCompetition = describeCompetition;
	}

	public String getBusinessAsset() {
		return businessAsset;
	}

	public void setBusinessAsset(String businessAsset) {
		this.businessAsset = businessAsset;
	}

	public String getAdvertising() {
		return advertising;
	}

	public void setAdvertising(String advertising) {
		this.advertising = advertising;
	}

	public String getDurationIncaseOfSeriousClaims() {
		return durationIncaseOfSeriousClaims;
	}

	public void setDurationIncaseOfSeriousClaims(
			String durationIncaseOfSeriousClaims) {
		this.durationIncaseOfSeriousClaims = durationIncaseOfSeriousClaims;
	}

	public String getPastClaimCause1() {
		return pastClaimCause1;
	}

	public void setPastClaimCause1(String pastClaimCause1) {
		this.pastClaimCause1 = pastClaimCause1;
	}

	public Date getPastClaimDate1() {
		return pastClaimDate1;
	}

	public void setPastClaimDate1(Date pastClaimDate1) {
		this.pastClaimDate1 = pastClaimDate1;
	}

	public double getPastClaimAmount1() {
		return pastClaimAmount1;
	}

	public void setPastClaimAmount1(double pastClaimAmount1) {
		this.pastClaimAmount1 = pastClaimAmount1;
	}

	public String getPastClaimCause2() {
		return pastClaimCause2;
	}

	public void setPastClaimCause2(String pastClaimCause2) {
		this.pastClaimCause2 = pastClaimCause2;
	}

	public Date getPastClaimDate2() {
		return pastClaimDate2;
	}

	public void setPastClaimDate2(Date pastClaimDate2) {
		this.pastClaimDate2 = pastClaimDate2;
	}

	public double getPastClaimAmount2() {
		return pastClaimAmount2;
	}

	public void setPastClaimAmount2(double pastClaimAmount2) {
		this.pastClaimAmount2 = pastClaimAmount2;
	}

	public String getPastClaimCause3() {
		return pastClaimCause3;
	}

	public void setPastClaimCause3(String pastClaimCause3) {
		this.pastClaimCause3 = pastClaimCause3;
	}

	public Date getPastClaimDate3() {
		return pastClaimDate3;
	}

	public void setPastClaimDate3(Date pastClaimDate3) {
		this.pastClaimDate3 = pastClaimDate3;
	}

	public double getPastClaimAmount3() {
		return pastClaimAmount3;
	}

	public void setPastClaimAmount3(double pastClaimAmount3) {
		this.pastClaimAmount3 = pastClaimAmount3;
	}

	public String getPastClaimCause4() {
		return pastClaimCause4;
	}

	public void setPastClaimCause4(String pastClaimCause4) {
		this.pastClaimCause4 = pastClaimCause4;
	}

	public Date getPastClaimDate4() {
		return pastClaimDate4;
	}

	public void setPastClaimDate4(Date pastClaimDate4) {
		this.pastClaimDate4 = pastClaimDate4;
	}

	public double getPastClaimAmount4() {
		return pastClaimAmount4;
	}

	public void setPastClaimAmount4(double pastClaimAmount4) {
		this.pastClaimAmount4 = pastClaimAmount4;
	}

	public String getPastClaimCause5() {
		return pastClaimCause5;
	}

	public void setPastClaimCause5(String pastClaimCause5) {
		this.pastClaimCause5 = pastClaimCause5;
	}

	public Date getPastClaimDate5() {
		return pastClaimDate5;
	}

	public void setPastClaimDate5(Date pastClaimDate5) {
		this.pastClaimDate5 = pastClaimDate5;
	}

	public double getPastClaimAmount5() {
		return pastClaimAmount5;
	}

	public void setPastClaimAmount5(double pastClaimAmount5) {
		this.pastClaimAmount5 = pastClaimAmount5;
	}

	public String getPastClaimCause6() {
		return pastClaimCause6;
	}

	public void setPastClaimCause6(String pastClaimCause6) {
		this.pastClaimCause6 = pastClaimCause6;
	}

	public Date getPastClaimDate6() {
		return pastClaimDate6;
	}

	public void setPastClaimDate6(Date pastClaimDate6) {
		this.pastClaimDate6 = pastClaimDate6;
	}

	public double getPastClaimAmount6() {
		return pastClaimAmount6;
	}

	public void setPastClaimAmount6(double pastClaimAmount6) {
		this.pastClaimAmount6 = pastClaimAmount6;
	}

	public String getCurrentInsuranceType1() {
		return currentInsuranceType1;
	}

	public void setCurrentInsuranceType1(String currentInsuranceType1) {
		this.currentInsuranceType1 = currentInsuranceType1;
	}

	public String getCurrentInsuranceCarrier1() {
		return currentInsuranceCarrier1;
	}

	public void setCurrentInsuranceCarrier1(String currentInsuranceCarrier1) {
		this.currentInsuranceCarrier1 = currentInsuranceCarrier1;
	}

	public String getCurrentInsuranceType2() {
		return currentInsuranceType2;
	}

	public void setCurrentInsuranceType2(String currentInsuranceType2) {
		this.currentInsuranceType2 = currentInsuranceType2;
	}

	public String getCurrentInsuranceCarrier2() {
		return currentInsuranceCarrier2;
	}

	public void setCurrentInsuranceCarrier2(String currentInsuranceCarrier2) {
		this.currentInsuranceCarrier2 = currentInsuranceCarrier2;
	}

	public String getCurrentInsuranceType3() {
		return currentInsuranceType3;
	}

	public void setCurrentInsuranceType3(String currentInsuranceType3) {
		this.currentInsuranceType3 = currentInsuranceType3;
	}

	public String getCurrentInsuranceCarrier3() {
		return currentInsuranceCarrier3;
	}

	public void setCurrentInsuranceCarrier3(String currentInsuranceCarrier3) {
		this.currentInsuranceCarrier3 = currentInsuranceCarrier3;
	}

	public String getCurrentInsuranceType4() {
		return currentInsuranceType4;
	}

	public void setCurrentInsuranceType4(String currentInsuranceType4) {
		this.currentInsuranceType4 = currentInsuranceType4;
	}

	public String getCurrentInsuranceCarrier4() {
		return currentInsuranceCarrier4;
	}

	public void setCurrentInsuranceCarrier4(String currentInsuranceCarrier4) {
		this.currentInsuranceCarrier4 = currentInsuranceCarrier4;
	}

	public String getCurrentInsuranceExpiry4() {
		return currentInsuranceExpiry4;
	}

	public void setCurrentInsuranceExpiry4(String currentInsuranceExpiry4) {
		this.currentInsuranceExpiry4 = currentInsuranceExpiry4;
	}

	public String getLineHolders1() {
		return lineHolders1;
	}

	public void setLineHolders1(String lineHolders1) {
		this.lineHolders1 = lineHolders1;
	}

	public String getLineHoldersLoc1() {
		return lineHoldersLoc1;
	}

	public void setLineHoldersLoc1(String lineHoldersLoc1) {
		this.lineHoldersLoc1 = lineHoldersLoc1;
	}

	public String getLineHolders2() {
		return lineHolders2;
	}

	public void setLineHolders2(String lineHolders2) {
		this.lineHolders2 = lineHolders2;
	}

	public String getLineHoldersLoc2() {
		return lineHoldersLoc2;
	}

	public void setLineHoldersLoc2(String lineHoldersLoc2) {
		this.lineHoldersLoc2 = lineHoldersLoc2;
	}

	public String getLineHolders3() {
		return lineHolders3;
	}

	public void setLineHolders3(String lineHolders3) {
		this.lineHolders3 = lineHolders3;
	}

	public String getLineHoldersLoc3() {
		return lineHoldersLoc3;
	}

	public void setLineHoldersLoc3(String lineHoldersLoc3) {
		this.lineHoldersLoc3 = lineHoldersLoc3;
	}

	public String getLineHolders4() {
		return lineHolders4;
	}

	public void setLineHolders4(String lineHolders4) {
		this.lineHolders4 = lineHolders4;
	}

	public String getLineHoldersLoc4() {
		return lineHoldersLoc4;
	}

	public void setLineHoldersLoc4(String lineHoldersLoc4) {
		this.lineHoldersLoc4 = lineHoldersLoc4;
	}

	public String getAddressOfLocation1() {
		return addressOfLocation1;
	}

	public void setAddressOfLocation1(String addressOfLocation1) {
		this.addressOfLocation1 = addressOfLocation1;
	}

	public String getAddressOfLocationUse1() {
		return addressOfLocationUse1;
	}

	public void setAddressOfLocationUse1(String addressOfLocationUse1) {
		this.addressOfLocationUse1 = addressOfLocationUse1;
	}

	public String getAddressOfLocation2() {
		return addressOfLocation2;
	}

	public void setAddressOfLocation2(String addressOfLocation2) {
		this.addressOfLocation2 = addressOfLocation2;
	}

	public String getAddressOfLocationUse2() {
		return addressOfLocationUse2;
	}

	public void setAddressOfLocationUse2(String addressOfLocationUse2) {
		this.addressOfLocationUse2 = addressOfLocationUse2;
	}

	public String getAddressOfLocation3() {
		return addressOfLocation3;
	}

	public void setAddressOfLocation3(String addressOfLocation3) {
		this.addressOfLocation3 = addressOfLocation3;
	}

	public String getAddressOfLocationUse3() {
		return addressOfLocationUse3;
	}

	public void setAddressOfLocationUse3(String addressOfLocationUse3) {
		this.addressOfLocationUse3 = addressOfLocationUse3;
	}

	public String getAddressOfLocation4() {
		return addressOfLocation4;
	}

	public void setAddressOfLocation4(String addressOfLocation4) {
		this.addressOfLocation4 = addressOfLocation4;
	}

	public String getAddressOfLocationUse4() {
		return addressOfLocationUse4;
	}

	public void setAddressOfLocationUse4(String addressOfLocationUse4) {
		this.addressOfLocationUse4 = addressOfLocationUse4;
	}

	public String getAddressOfLocation5() {
		return addressOfLocation5;
	}

	public void setAddressOfLocation5(String addressOfLocation5) {
		this.addressOfLocation5 = addressOfLocation5;
	}

	public String getAddressOfLocationUse5() {
		return addressOfLocationUse5;
	}

	public void setAddressOfLocationUse5(String addressOfLocationUse5) {
		this.addressOfLocationUse5 = addressOfLocationUse5;
	}

	public String getLocationRentedToOthers1() {
		return locationRentedToOthers1;
	}

	public void setLocationRentedToOthers1(String locationRentedToOthers1) {
		this.locationRentedToOthers1 = locationRentedToOthers1;
	}

	public String getLocationRentedToOthers2() {
		return locationRentedToOthers2;
	}

	public void setLocationRentedToOthers2(String locationRentedToOthers2) {
		this.locationRentedToOthers2 = locationRentedToOthers2;
	}

	public String getLocationRentedToOthers3() {
		return locationRentedToOthers3;
	}

	public void setLocationRentedToOthers3(String locationRentedToOthers3) {
		this.locationRentedToOthers3 = locationRentedToOthers3;
	}

	public String getLocationRentedToOthers4() {
		return locationRentedToOthers4;
	}

	public void setLocationRentedToOthers4(String locationRentedToOthers4) {
		this.locationRentedToOthers4 = locationRentedToOthers4;
	}

	public String getLocationRentedToOthers5() {
		return locationRentedToOthers5;
	}

	public void setLocationRentedToOthers5(String locationRentedToOthers5) {
		this.locationRentedToOthers5 = locationRentedToOthers5;
	}

	public double getBuildingLimit() {
		return buildingLimit;
	}

	public void setBuildingLimit(double buildingLimit) {
		this.buildingLimit = buildingLimit;
	}

	public double getBuildingDeductible() {
		return buildingDeductible;
	}

	public void setBuildingDeductible(double buildingDeductible) {
		this.buildingDeductible = buildingDeductible;
	}

	public double getContentsLimit() {
		return contentsLimit;
	}

	public void setContentsLimit(double contentsLimit) {
		this.contentsLimit = contentsLimit;
	}

	public double getContentsDeductible() {
		return contentsDeductible;
	}

	public void setContentsDeductible(double contentsDeductible) {
		this.contentsDeductible = contentsDeductible;
	}

	public double getStockLimit() {
		return stockLimit;
	}

	public void setStockLimit(double stockLimit) {
		this.stockLimit = stockLimit;
	}

	public double getStockDeductible() {
		return stockDeductible;
	}

	public void setStockDeductible(double stockDeductible) {
		this.stockDeductible = stockDeductible;
	}

	public double getOfficeContentLimit() {
		return officeContentLimit;
	}

	public void setOfficeContentLimit(double officeContentLimit) {
		this.officeContentLimit = officeContentLimit;
	}

	public double getOfficeContentDeductible() {
		return officeContentDeductible;
	}

	public void setOfficeContentDeductible(double officeContentDeductible) {
		this.officeContentDeductible = officeContentDeductible;
	}

	public double getEdpLimit() {
		return edpLimit;
	}

	public void setEdpLimit(double edpLimit) {
		this.edpLimit = edpLimit;
	}

	public double getEdpDeductible() {
		return edpDeductible;
	}

	public void setEdpDeductible(double edpDeductible) {
		this.edpDeductible = edpDeductible;
	}

	public double getEquipmentLimit() {
		return equipmentLimit;
	}

	public void setEquipmentLimit(double equipmentLimit) {
		this.equipmentLimit = equipmentLimit;
	}

	public double getEquipmentDeductible() {
		return equipmentDeductible;
	}

	public void setEquipmentDeductible(double equipmentDeductible) {
		this.equipmentDeductible = equipmentDeductible;
	}

	public double getOffPremisesLimit() {
		return offPremisesLimit;
	}

	public void setOffPremisesLimit(double offPremisesLimit) {
		this.offPremisesLimit = offPremisesLimit;
	}

	public double getOffPremisesDeductible() {
		return offPremisesDeductible;
	}

	public void setOffPremisesDeductible(double offPremisesDeductible) {
		this.offPremisesDeductible = offPremisesDeductible;
	}

	public double getTransitLimit() {
		return transitLimit;
	}

	public void setTransitLimit(double transitLimit) {
		this.transitLimit = transitLimit;
	}

	public double getTransitDeductible() {
		return transitDeductible;
	}

	public void setTransitDeductible(double transitDeductible) {
		this.transitDeductible = transitDeductible;
	}

	public double getMiscPropertyLimit() {
		return miscPropertyLimit;
	}

	public void setMiscPropertyLimit(double miscPropertyLimit) {
		this.miscPropertyLimit = miscPropertyLimit;
	}

	public double getMiscPropertyDeductible() {
		return miscPropertyDeductible;
	}

	public void setMiscPropertyDeductible(double miscPropertyDeductible) {
		this.miscPropertyDeductible = miscPropertyDeductible;
	}

	public double getContractorEquipmentLimit() {
		return contractorEquipmentLimit;
	}

	public void setContractorEquipmentLimit(double contractorEquipmentLimit) {
		this.contractorEquipmentLimit = contractorEquipmentLimit;
	}

	public double getContractorEquipmentDeductible() {
		return contractorEquipmentDeductible;
	}

	public void setContractorEquipmentDeductible(
			double contractorEquipmentDeductible) {
		this.contractorEquipmentDeductible = contractorEquipmentDeductible;
	}

	public double getInstallationFloaterLimit() {
		return installationFloaterLimit;
	}

	public void setInstallationFloaterLimit(double installationFloaterLimit) {
		this.installationFloaterLimit = installationFloaterLimit;
	}

	public double getInstallationFloaterDeductible() {
		return installationFloaterDeductible;
	}

	public void setInstallationFloaterDeductible(
			double installationFloaterDeductible) {
		this.installationFloaterDeductible = installationFloaterDeductible;
	}

	public double getToolFloaterLimit() {
		return toolFloaterLimit;
	}

	public void setToolFloaterLimit(double toolFloaterLimit) {
		this.toolFloaterLimit = toolFloaterLimit;
	}

	public double getToolFloaterDeductible() {
		return toolFloaterDeductible;
	}

	public void setToolFloaterDeductible(double toolFloaterDeductible) {
		this.toolFloaterDeductible = toolFloaterDeductible;
	}

	public double getSignFloaterLimit() {
		return signFloaterLimit;
	}

	public void setSignFloaterLimit(double signFloaterLimit) {
		this.signFloaterLimit = signFloaterLimit;
	}

	public double getSignFloaterDeductible() {
		return signFloaterDeductible;
	}

	public void setSignFloaterDeductible(double signFloaterDeductible) {
		this.signFloaterDeductible = signFloaterDeductible;
	}

	public double getMotorTruckLimit() {
		return motorTruckLimit;
	}

	public void setMotorTruckLimit(double motorTruckLimit) {
		this.motorTruckLimit = motorTruckLimit;
	}

	public double getMotorTruckDeductible() {
		return motorTruckDeductible;
	}

	public void setMotorTruckDeductible(double motorTruckDeductible) {
		this.motorTruckDeductible = motorTruckDeductible;
	}

	public double getGlassLimit() {
		return glassLimit;
	}

	public void setGlassLimit(double glassLimit) {
		this.glassLimit = glassLimit;
	}

	public double getGlassDeductible() {
		return glassDeductible;
	}

	public void setGlassDeductible(double glassDeductible) {
		this.glassDeductible = glassDeductible;
	}

	public double getSewerBackupDeductible() {
		return sewerBackupDeductible;
	}

	public void setSewerBackupDeductible(double sewerBackupDeductible) {
		this.sewerBackupDeductible = sewerBackupDeductible;
	}

	public double getFloodDeductible() {
		return floodDeductible;
	}

	public void setFloodDeductible(double floodDeductible) {
		this.floodDeductible = floodDeductible;
	}

	public double getEarthquakeDeductible() {
		return earthquakeDeductible;
	}

	public void setEarthquakeDeductible(double earthquakeDeductible) {
		this.earthquakeDeductible = earthquakeDeductible;
	}

	public double getProfitLimit() {
		return profitLimit;
	}

	public void setProfitLimit(double profitLimit) {
		this.profitLimit = profitLimit;
	}

	public double getProfitDeductible() {
		return profitDeductible;
	}

	public void setProfitDeductible(double profitDeductible) {
		this.profitDeductible = profitDeductible;
	}

	public double getGrossEarningLimit() {
		return grossEarningLimit;
	}

	public void setGrossEarningLimit(double grossEarningLimit) {
		this.grossEarningLimit = grossEarningLimit;
	}

	public double getGrossEarningDeductible() {
		return grossEarningDeductible;
	}

	public void setGrossEarningDeductible(double grossEarningDeductible) {
		this.grossEarningDeductible = grossEarningDeductible;
	}

	public double getRentalIncomeLimit() {
		return rentalIncomeLimit;
	}

	public void setRentalIncomeLimit(double rentalIncomeLimit) {
		this.rentalIncomeLimit = rentalIncomeLimit;
	}

	public double getRentalIncomeDeductible() {
		return rentalIncomeDeductible;
	}

	public void setRentalIncomeDeductible(double rentalIncomeDeductible) {
		this.rentalIncomeDeductible = rentalIncomeDeductible;
	}

	public double getExtraExpenseLimit() {
		return extraExpenseLimit;
	}

	public void setExtraExpenseLimit(double extraExpenseLimit) {
		this.extraExpenseLimit = extraExpenseLimit;
	}

	public double getExtraExpenseDeductible() {
		return extraExpenseDeductible;
	}

	public void setExtraExpenseDeductible(double extraExpenseDeductible) {
		this.extraExpenseDeductible = extraExpenseDeductible;
	}

	public double getOffPremisesPowerLimit() {
		return offPremisesPowerLimit;
	}

	public void setOffPremisesPowerLimit(double offPremisesPowerLimit) {
		this.offPremisesPowerLimit = offPremisesPowerLimit;
	}

	public double getOffPremisesPowerDeductible() {
		return offPremisesPowerDeductible;
	}

	public void setOffPremisesPowerDeductible(double offPremisesPowerDeductible) {
		this.offPremisesPowerDeductible = offPremisesPowerDeductible;
	}

	public double getInsideOutsideLimit() {
		return insideOutsideLimit;
	}

	public void setInsideOutsideLimit(double insideOutsideLimit) {
		this.insideOutsideLimit = insideOutsideLimit;
	}

	public double getInsideOutsideDeductible() {
		return insideOutsideDeductible;
	}

	public void setInsideOutsideDeductible(double insideOutsideDeductible) {
		this.insideOutsideDeductible = insideOutsideDeductible;
	}

	public double getBfMoneyLimit() {
		return bfMoneyLimit;
	}

	public void setBfMoneyLimit(double bfMoneyLimit) {
		this.bfMoneyLimit = bfMoneyLimit;
	}

	public double getBfMoneyDeductible() {
		return bfMoneyDeductible;
	}

	public void setBfMoneyDeductible(double bfMoneyDeductible) {
		this.bfMoneyDeductible = bfMoneyDeductible;
	}

	public double getDeopistorForgeryLimit() {
		return deopistorForgeryLimit;
	}

	public void setDeopistorForgeryLimit(double deopistorForgeryLimit) {
		this.deopistorForgeryLimit = deopistorForgeryLimit;
	}

	public double getDeopistorForgeryDeductible() {
		return deopistorForgeryDeductible;
	}

	public void setDeopistorForgeryDeductible(double deopistorForgeryDeductible) {
		this.deopistorForgeryDeductible = deopistorForgeryDeductible;
	}

	public double getMoneyOrdersLimit() {
		return moneyOrdersLimit;
	}

	public void setMoneyOrdersLimit(double moneyOrdersLimit) {
		this.moneyOrdersLimit = moneyOrdersLimit;
	}

	public double getMoneyOrdersDeductible() {
		return moneyOrdersDeductible;
	}

	public void setMoneyOrdersDeductible(double moneyOrdersDeductible) {
		this.moneyOrdersDeductible = moneyOrdersDeductible;
	}

	public double getEmployDishonestyLimit() {
		return employDishonestyLimit;
	}

	public void setEmployDishonestyLimit(double employDishonestyLimit) {
		this.employDishonestyLimit = employDishonestyLimit;
	}

	public double getEmployDishonestyDeductible() {
		return employDishonestyDeductible;
	}

	public void setEmployDishonestyDeductible(double employDishonestyDeductible) {
		this.employDishonestyDeductible = employDishonestyDeductible;
	}

	public double getCglLimit() {
		return cglLimit;
	}

	public void setCglLimit(double cglLimit) {
		this.cglLimit = cglLimit;
	}

	public double getCglDeductible() {
		return cglDeductible;
	}

	public void setCglDeductible(double cglDeductible) {
		this.cglDeductible = cglDeductible;
	}

	public double getTenantsLegalLimit() {
		return tenantsLegalLimit;
	}

	public void setTenantsLegalLimit(double tenantsLegalLimit) {
		this.tenantsLegalLimit = tenantsLegalLimit;
	}

	public double getTenantsLegalDeductible() {
		return tenantsLegalDeductible;
	}

	public void setTenantsLegalDeductible(double tenantsLegalDeductible) {
		this.tenantsLegalDeductible = tenantsLegalDeductible;
	}

	public double getNonOwnedAutoLimit() {
		return nonOwnedAutoLimit;
	}

	public void setNonOwnedAutoLimit(double nonOwnedAutoLimit) {
		this.nonOwnedAutoLimit = nonOwnedAutoLimit;
	}

	public double getNonOwnedAutoDeductible() {
		return nonOwnedAutoDeductible;
	}

	public void setNonOwnedAutoDeductible(double nonOwnedAutoDeductible) {
		this.nonOwnedAutoDeductible = nonOwnedAutoDeductible;
	}

	public double getSef96Limit() {
		return sef96Limit;
	}

	public void setSef96Limit(double sef96Limit) {
		this.sef96Limit = sef96Limit;
	}

	public double getSef96Deductible() {
		return sef96Deductible;
	}

	public void setSef96Deductible(double sef96Deductible) {
		this.sef96Deductible = sef96Deductible;
	}

	public double getSef94Limit() {
		return sef94Limit;
	}

	public void setSef94Limit(double sef94Limit) {
		this.sef94Limit = sef94Limit;
	}

	public double getSef94Deductible() {
		return sef94Deductible;
	}

	public void setSef94Deductible(double sef94Deductible) {
		this.sef94Deductible = sef94Deductible;
	}

	public double getDoLimit() {
		return doLimit;
	}

	public void setDoLimit(double doLimit) {
		this.doLimit = doLimit;
	}

	public double getDoDeductible() {
		return doDeductible;
	}

	public void setDoDeductible(double doDeductible) {
		this.doDeductible = doDeductible;
	}

	public double getEoLimit() {
		return eoLimit;
	}

	public void setEoLimit(double eoLimit) {
		this.eoLimit = eoLimit;
	}

	public double getEoDeductible() {
		return eoDeductible;
	}

	public void setEoDeductible(double eoDeductible) {
		this.eoDeductible = eoDeductible;
	}

	public double getEmployerLimit() {
		return employerLimit;
	}

	public void setEmployerLimit(double employerLimit) {
		this.employerLimit = employerLimit;
	}

	public double getEmployerDeductible() {
		return employerDeductible;
	}

	public void setEmployerDeductible(double employerDeductible) {
		this.employerDeductible = employerDeductible;
	}

	public double getUmbrellaLimit() {
		return umbrellaLimit;
	}

	public void setUmbrellaLimit(double umbrellaLimit) {
		this.umbrellaLimit = umbrellaLimit;
	}

	public double getUmbrellaDeductible() {
		return umbrellaDeductible;
	}

	public void setUmbrellaDeductible(double umbrellaDeductible) {
		this.umbrellaDeductible = umbrellaDeductible;
	}

	public double getWrapUpLimit() {
		return wrapUpLimit;
	}

	public void setWrapUpLimit(double wrapUpLimit) {
		this.wrapUpLimit = wrapUpLimit;
	}

	public double getWrapUpDeductible() {
		return wrapUpDeductible;
	}

	public void setWrapUpDeductible(double wrapUpDeductible) {
		this.wrapUpDeductible = wrapUpDeductible;
	}

	public double getStdComprehensiveLimit() {
		return stdComprehensiveLimit;
	}

	public void setStdComprehensiveLimit(double stdComprehensiveLimit) {
		this.stdComprehensiveLimit = stdComprehensiveLimit;
	}

	public double getStdComprehensiveDeductible() {
		return stdComprehensiveDeductible;
	}

	public void setStdComprehensiveDeductible(double stdComprehensiveDeductible) {
		this.stdComprehensiveDeductible = stdComprehensiveDeductible;
	}

	public double getAirConditioningLimit() {
		return airConditioningLimit;
	}

	public void setAirConditioningLimit(double airConditioningLimit) {
		this.airConditioningLimit = airConditioningLimit;
	}

	public double getAirConditioningDeductible() {
		return airConditioningDeductible;
	}

	public void setAirConditioningDeductible(double airConditioningDeductible) {
		this.airConditioningDeductible = airConditioningDeductible;
	}

	public double getProductionMachineryLimit() {
		return productionMachineryLimit;
	}

	public void setProductionMachineryLimit(double productionMachineryLimit) {
		this.productionMachineryLimit = productionMachineryLimit;
	}

	public double getProductionMachineryDeductible() {
		return productionMachineryDeductible;
	}

	public void setProductionMachineryDeductible(
			double productionMachineryDeductible) {
		this.productionMachineryDeductible = productionMachineryDeductible;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTotalSqFootage() {
		return totalSqFootage;
	}

	public void setTotalSqFootage(double totalSqFootage) {
		this.totalSqFootage = totalSqFootage;
	}

	public double getInsdSqFootage() {
		return insdSqFootage;
	}

	public void setInsdSqFootage(double insdSqFootage) {
		this.insdSqFootage = insdSqFootage;
	}

	public int getNoOfStories() {
		return noOfStories;
	}

	public void setNoOfStories(int noOfStories) {
		this.noOfStories = noOfStories;
	}

	

	public String getFireProtection() {
		return fireProtection;
	}

	public void setFireProtection(String fireProtection) {
		this.fireProtection = fireProtection;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}

	

	public String getWallsframe() {
		return wallsframe;
	}

	public void setWallsframe(String wallsframe) {
		this.wallsframe = wallsframe;
	}

	public String getWallshcb() {
		return wallshcb;
	}

	public void setWallshcb(String wallshcb) {
		this.wallshcb = wallshcb;
	}

	public String getWallssteel() {
		return wallssteel;
	}

	public void setWallssteel(String wallssteel) {
		this.wallssteel = wallssteel;
	}

	public String getWallsbrick() {
		return wallsbrick;
	}

	public void setWallsbrick(String wallsbrick) {
		this.wallsbrick = wallsbrick;
	}

	public String getRoofwood() {
		return roofwood;
	}

	public void setRoofwood(String roofwood) {
		this.roofwood = roofwood;
	}

	public String getRoofsteel() {
		return roofsteel;
	}

	public void setRoofsteel(String roofsteel) {
		this.roofsteel = roofsteel;
	}

	public String getRoofconcrete() {
		return roofconcrete;
	}

	public void setRoofconcrete(String roofconcrete) {
		this.roofconcrete = roofconcrete;
	}

	public String getFloorsconcrete() {
		return floorsconcrete;
	}

	public void setFloorsconcrete(String floorsconcrete) {
		this.floorsconcrete = floorsconcrete;
	}

	public String getFloorswood() {
		return floorswood;
	}

	public void setFloorswood(String floorswood) {
		this.floorswood = floorswood;
	}

	public String getHeatinggas() {
		return heatinggas;
	}

	public void setHeatinggas(String heatinggas) {
		this.heatinggas = heatinggas;
	}

	public String getHeatingoil() {
		return heatingoil;
	}

	public void setHeatingoil(String heatingoil) {
		this.heatingoil = heatingoil;
	}

	public String getHeatingelectric() {
		return heatingelectric;
	}

	public void setHeatingelectric(String heatingelectric) {
		this.heatingelectric = heatingelectric;
	}

	public String getHeatingother() {
		return heatingother;
	}

	public void setHeatingother(String heatingother) {
		this.heatingother = heatingother;
	}

	public String getElectricalbreakers() {
		return electricalbreakers;
	}

	public void setElectricalbreakers(String electricalbreakers) {
		this.electricalbreakers = electricalbreakers;
	}

	public String getElectricalfuses() {
		return electricalfuses;
	}

	public void setElectricalfuses(String electricalfuses) {
		this.electricalfuses = electricalfuses;
	}

	public String getElectricalamps() {
		return electricalamps;
	}

	public void setElectricalamps(String electricalamps) {
		this.electricalamps = electricalamps;
	}

	public String getPlumbingcopper() {
		return plumbingcopper;
	}

	public void setPlumbingcopper(String plumbingcopper) {
		this.plumbingcopper = plumbingcopper;
	}

	public String getPlumbingpvc() {
		return plumbingpvc;
	}

	public void setPlumbingpvc(String plumbingpvc) {
		this.plumbingpvc = plumbingpvc;
	}

	public String getPlumbingother() {
		return plumbingother;
	}

	public void setPlumbingother(String plumbingother) {
		this.plumbingother = plumbingother;
	}

	public String getAdditionalcoverage() {
		return additionalcoverage;
	}

	public void setAdditionalcoverage(String additionalcoverage) {
		this.additionalcoverage = additionalcoverage;
	}

	public String getCurrentInsurer() {
		return currentInsurer;
	}

	public void setCurrentInsurer(String currentInsurer) {
		this.currentInsurer = currentInsurer;
	}

	public Date getCurrentExpDate() {
		return currentExpDate;
	}

	public void setCurrentExpDate(Date currentExpDate) {
		this.currentExpDate = currentExpDate;
	}

	public double getPremiumTarget() {
		return premiumTarget;
	}

	public void setPremiumTarget(double premiumTarget) {
		this.premiumTarget = premiumTarget;
	}

	public String getLienHolders1() {
		return lienHolders1;
	}

	public void setLienHolders1(String lienHolders1) {
		this.lienHolders1 = lienHolders1;
	}

	public String getLienHoldersVehicle1() {
		return lienHoldersVehicle1;
	}

	public void setLienHoldersVehicle1(String lienHoldersVehicle1) {
		this.lienHoldersVehicle1 = lienHoldersVehicle1;
	}

	public String getLienHolders2() {
		return lienHolders2;
	}

	public void setLienHolders2(String lienHolders2) {
		this.lienHolders2 = lienHolders2;
	}

	public String getLienHoldersVehicle2() {
		return lienHoldersVehicle2;
	}

	public void setLienHoldersVehicle2(String lienHoldersVehicle2) {
		this.lienHoldersVehicle2 = lienHoldersVehicle2;
	}

	public String getLienHolders3() {
		return lienHolders3;
	}

	public void setLienHolders3(String lienHolders3) {
		this.lienHolders3 = lienHolders3;
	}

	public String getLienHoldersVehicle3() {
		return lienHoldersVehicle3;
	}

	public void setLienHoldersVehicle3(String lienHoldersVehicle3) {
		this.lienHoldersVehicle3 = lienHoldersVehicle3;
	}

	public Date getClaimDate1() {
		return claimDate1;
	}

	public void setClaimDate1(Date claimDate1) {
		this.claimDate1 = claimDate1;
	}

	public String getClaimDesc1() {
		return claimDesc1;
	}

	public void setClaimDesc1(String claimDesc1) {
		this.claimDesc1 = claimDesc1;
	}

	public Date getClaimDate2() {
		return claimDate2;
	}

	public void setClaimDate2(Date claimDate2) {
		this.claimDate2 = claimDate2;
	}

	public String getClaimDesc2() {
		return claimDesc2;
	}

	public void setClaimDesc2(String claimDesc2) {
		this.claimDesc2 = claimDesc2;
	}

	public Date getClaimDate3() {
		return claimDate3;
	}

	public void setClaimDate3(Date claimDate3) {
		this.claimDate3 = claimDate3;
	}

	public String getClaimDesc3() {
		return claimDesc3;
	}

	public void setClaimDesc3(String claimDesc3) {
		this.claimDesc3 = claimDesc3;
	}

	public Date getClaimDate4() {
		return claimDate4;
	}

	public void setClaimDate4(Date claimDate4) {
		this.claimDate4 = claimDate4;
	}

	public String getClaimDesc4() {
		return claimDesc4;
	}

	public void setClaimDesc4(String claimDesc4) {
		this.claimDesc4 = claimDesc4;
	}

	public Date getClaimDate5() {
		return claimDate5;
	}

	public void setClaimDate5(Date claimDate5) {
		this.claimDate5 = claimDate5;
	}

	public String getClaimDesc5() {
		return claimDesc5;
	}

	public void setClaimDesc5(String claimDesc5) {
		this.claimDesc5 = claimDesc5;
	}

	public Date getClaimDate6() {
		return claimDate6;
	}

	public void setClaimDate6(Date claimDate6) {
		this.claimDate6 = claimDate6;
	}

	public String getClaimDesc6() {
		return claimDesc6;
	}

	public void setClaimDesc6(String claimDesc6) {
		this.claimDesc6 = claimDesc6;
	}

	

	public String getCommoditiesTransportedBy() {
		return commoditiesTransportedBy;
	}

	public void setCommoditiesTransportedBy(String commoditiesTransportedBy) {
		this.commoditiesTransportedBy = commoditiesTransportedBy;
	}

	public String getHaulingForOthers() {
		return haulingForOthers;
	}

	public void setHaulingForOthers(String haulingForOthers) {
		this.haulingForOthers = haulingForOthers;
	}

	public String getFilingState1() {
		return filingState1;
	}

	public void setFilingState1(String filingState1) {
		this.filingState1 = filingState1;
	}

	public String getFilingUSDot1() {
		return filingUSDot1;
	}

	public void setFilingUSDot1(String filingUSDot1) {
		this.filingUSDot1 = filingUSDot1;
	}

	public String getDilingDocket1() {
		return dilingDocket1;
	}

	public void setDilingDocket1(String dilingDocket1) {
		this.dilingDocket1 = dilingDocket1;
	}

	public String getFilingType1() {
		return filingType1;
	}

	public void setFilingType1(String filingType1) {
		this.filingType1 = filingType1;
	}

	public String getFilingName1() {
		return filingName1;
	}

	public void setFilingName1(String filingName1) {
		this.filingName1 = filingName1;
	}

	public String getFilingState2() {
		return filingState2;
	}

	public void setFilingState2(String filingState2) {
		this.filingState2 = filingState2;
	}

	public String getFilingUSDot2() {
		return filingUSDot2;
	}

	public void setFilingUSDot2(String filingUSDot2) {
		this.filingUSDot2 = filingUSDot2;
	}

	public String getDilingDocket2() {
		return dilingDocket2;
	}

	public void setDilingDocket2(String dilingDocket2) {
		this.dilingDocket2 = dilingDocket2;
	}

	public String getFilingType2() {
		return filingType2;
	}

	public void setFilingType2(String filingType2) {
		this.filingType2 = filingType2;
	}

	public String getFilingName2() {
		return filingName2;
	}

	public void setFilingName2(String filingName2) {
		this.filingName2 = filingName2;
	}

	public String getFilingState3() {
		return filingState3;
	}

	public void setFilingState3(String filingState3) {
		this.filingState3 = filingState3;
	}

	public String getFilingUSDot3() {
		return filingUSDot3;
	}

	public void setFilingUSDot3(String filingUSDot3) {
		this.filingUSDot3 = filingUSDot3;
	}

	public String getDilingDocket3() {
		return dilingDocket3;
	}

	public void setDilingDocket3(String dilingDocket3) {
		this.dilingDocket3 = dilingDocket3;
	}

	public String getFilingType3() {
		return filingType3;
	}

	public void setFilingType3(String filingType3) {
		this.filingType3 = filingType3;
	}

	public String getFilingName3() {
		return filingName3;
	}

	public void setFilingName3(String filingName3) {
		this.filingName3 = filingName3;
	}


	public String getVehicleNonOwned() {
		return vehicleNonOwned;
	}

	public void setVehicleNonOwned(String vehicleNonOwned) {
		this.vehicleNonOwned = vehicleNonOwned;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getTypeOfNonOwned() {
		return typeOfNonOwned;
	}

	public void setTypeOfNonOwned(String typeOfNonOwned) {
		this.typeOfNonOwned = typeOfNonOwned;
	}

	public double getAvgNoOfVehicles() {
		return avgNoOfVehicles;
	}

	public void setAvgNoOfVehicles(double avgNoOfVehicles) {
		this.avgNoOfVehicles = avgNoOfVehicles;
	}

	public double getAvgValue() {
		return avgValue;
	}

	public void setAvgValue(double avgValue) {
		this.avgValue = avgValue;
	}

	public double getMaxVehicleValue() {
		return maxVehicleValue;
	}

	public void setMaxVehicleValue(double maxVehicleValue) {
		this.maxVehicleValue = maxVehicleValue;
	}

	public double getMaxCostValue() {
		return maxCostValue;
	}

	public void setMaxCostValue(double maxCostValue) {
		this.maxCostValue = maxCostValue;
	}

	public String getInstructionNotes() {
		return instructionNotes;
	}

	public void setInstructionNotes(String instructionNotes) {
		this.instructionNotes = instructionNotes;
	}

	public String getMarketerUserName() {
		return marketerUserName;
	}

	public void setMarketerUserName(String marketerUserName) {
		this.marketerUserName = marketerUserName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProducerUserName() {
		return producerUserName;
	}

	public void setProducerUserName(String producerUserName) {
		this.producerUserName = producerUserName;
	}

	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}

	public String getNonProfit() {
		return nonProfit;
	}

	public void setNonProfit(String nonProfit) {
		this.nonProfit = nonProfit;
	}

	public String getOwner1() {
		return owner1;
	}

	public void setOwner1(String owner1) {
		this.owner1 = owner1;
	}

	public String getOwner2() {
		return owner2;
	}

	public void setOwner2(String owner2) {
		this.owner2 = owner2;
	}

	public String getOwner3() {
		return owner3;
	}

	public void setOwner3(String owner3) {
		this.owner3 = owner3;
	}

	public String getOwner4() {
		return owner4;
	}

	public void setOwner4(String owner4) {
		this.owner4 = owner4;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getBoardOfDirector1() {
		return boardOfDirector1;
	}

	public void setBoardOfDirector1(String boardOfDirector1) {
		this.boardOfDirector1 = boardOfDirector1;
	}

	public String getBoardOfDirector2() {
		return boardOfDirector2;
	}

	public void setBoardOfDirector2(String boardOfDirector2) {
		this.boardOfDirector2 = boardOfDirector2;
	}

	public String getBoardOfDirector4() {
		return boardOfDirector4;
	}

	public void setBoardOfDirector4(String boardOfDirector4) {
		this.boardOfDirector4 = boardOfDirector4;
	}

	public String getBoardOfDirector3() {
		return boardOfDirector3;
	}

	public void setBoardOfDirector3(String boardOfDirector3) {
		this.boardOfDirector3 = boardOfDirector3;
	}

	public String getCurrency1() {
		return currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public String getCurrency2() {
		return currency2;
	}

	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	public String getCurrency3() {
		return currency3;
	}

	public void setCurrency3(String currency3) {
		this.currency3 = currency3;
	}

	public String getCurrency4() {
		return currency4;
	}

	public void setCurrency4(String currency4) {
		this.currency4 = currency4;
	}

	public int getOnpremises() {
		return onpremises;
	}

	public void setOnpremises(int onpremises) {
		this.onpremises = onpremises;
	}

	public int getOffpremises() {
		return offpremises;
	}

	public void setOffpremises(int offpremises) {
		this.offpremises = offpremises;
	}

	public int getResidential() {
		return residential;
	}

	public void setResidential(int residential) {
		this.residential = residential;
	}

	public int getCommercial() {
		return commercial;
	}

	public void setCommercial(int commercial) {
		this.commercial = commercial;
	}

	public int getSubcontracted() {
		return subcontracted;
	}

	public void setSubcontracted(int subcontracted) {
		this.subcontracted = subcontracted;
	}

	public String getEcommerce() {
		return ecommerce;
	}

	public void setEcommerce(String ecommerce) {
		this.ecommerce = ecommerce;
	}

	public String getProfessionalLiability() {
		return professionalLiability;
	}

	public void setProfessionalLiability(String professionalLiability) {
		this.professionalLiability = professionalLiability;
	}

	public String getCyberLiability() {
		return cyberLiability;
	}

	public void setCyberLiability(String cyberLiability) {
		this.cyberLiability = cyberLiability;
	}

	public String getPollutionexposure() {
		return pollutionexposure;
	}

	public void setPollutionexposure(String pollutionexposure) {
		this.pollutionexposure = pollutionexposure;
	}

	public String getAccidentalBenefits() {
		return accidentalBenefits;
	}

	public void setAccidentalBenefits(String accidentalBenefits) {
		this.accidentalBenefits = accidentalBenefits;
	}

	public String getMalpracticeExposure() {
		return malpracticeExposure;
	}

	public void setMalpracticeExposure(String malpracticeExposure) {
		this.malpracticeExposure = malpracticeExposure;
	}

	public String getAbuseExposure() {
		return abuseExposure;
	}

	public void setAbuseExposure(String abuseExposure) {
		this.abuseExposure = abuseExposure;
	}

	public String getBondingOpportunities() {
		return bondingOpportunities;
	}

	public void setBondingOpportunities(String bondingOpportunities) {
		this.bondingOpportunities = bondingOpportunities;
	}

	public String getGroupBenefits() {
		return groupBenefits;
	}

	public void setGroupBenefits(String groupBenefits) {
		this.groupBenefits = groupBenefits;
	}

	public String getPensionPlan() {
		return pensionPlan;
	}

	public void setPensionPlan(String pensionPlan) {
		this.pensionPlan = pensionPlan;
	}

	public String getBusinessInterruptionSheet() {
		return businessInterruptionSheet;
	}

	public void setBusinessInterruptionSheet(String businessInterruptionSheet) {
		this.businessInterruptionSheet = businessInterruptionSheet;
	}

	public Date getCurrentInsuranceExpiry1() {
		return currentInsuranceExpiry1;
	}

	public void setCurrentInsuranceExpiry1(Date currentInsuranceExpiry1) {
		this.currentInsuranceExpiry1 = currentInsuranceExpiry1;
	}

	public Date getCurrentInsuranceExpiry2() {
		return currentInsuranceExpiry2;
	}

	public void setCurrentInsuranceExpiry2(Date currentInsuranceExpiry2) {
		this.currentInsuranceExpiry2 = currentInsuranceExpiry2;
	}

	public Date getCurrentInsuranceExpiry3() {
		return currentInsuranceExpiry3;
	}

	public void setCurrentInsuranceExpiry3(Date currentInsuranceExpiry3) {
		this.currentInsuranceExpiry3 = currentInsuranceExpiry3;
	}

	public String getAddressOfLocationOwnedyes1() {
		return addressOfLocationOwnedyes1;
	}

	public void setAddressOfLocationOwnedyes1(String addressOfLocationOwnedyes1) {
		this.addressOfLocationOwnedyes1 = addressOfLocationOwnedyes1;
	}

	public String getAddressOfLocationOwnedyes2() {
		return addressOfLocationOwnedyes2;
	}

	public void setAddressOfLocationOwnedyes2(String addressOfLocationOwnedyes2) {
		this.addressOfLocationOwnedyes2 = addressOfLocationOwnedyes2;
	}

	public String getAddressOfLocationOwnedyes3() {
		return addressOfLocationOwnedyes3;
	}

	public void setAddressOfLocationOwnedyes3(String addressOfLocationOwnedyes3) {
		this.addressOfLocationOwnedyes3 = addressOfLocationOwnedyes3;
	}

	public String getAddressOfLocationOwnedno1() {
		return addressOfLocationOwnedno1;
	}

	public void setAddressOfLocationOwnedno1(String addressOfLocationOwnedno1) {
		this.addressOfLocationOwnedno1 = addressOfLocationOwnedno1;
	}

	public String getAddressOfLocationOwnedno2() {
		return addressOfLocationOwnedno2;
	}

	public void setAddressOfLocationOwnedno2(String addressOfLocationOwnedno2) {
		this.addressOfLocationOwnedno2 = addressOfLocationOwnedno2;
	}

	public String getAddressOfLocationOwnedno3() {
		return addressOfLocationOwnedno3;
	}

	public void setAddressOfLocationOwnedno3(String addressOfLocationOwnedno3) {
		this.addressOfLocationOwnedno3 = addressOfLocationOwnedno3;
	}

	public String getProducercomments() {
		return producercomments;
	}

	public void setProducercomments(String producercomments) {
		this.producercomments = producercomments;
	}

	public String getMarketercomments() {
		return marketercomments;
	}

	public void setMarketercomments(String marketercomments) {
		this.marketercomments = marketercomments;
	}

	public byte[] getFile1() {
		return file1;
	}

	public void setFile1(byte[] file1) {
		this.file1 = file1;
	}

	public String getFile1Name() {
		return file1Name;
	}

	public void setFile1Name(String file1Name) {
		this.file1Name = file1Name;
	}

	public byte[] getFile2() {
		return file2;
	}

	public void setFile2(byte[] file2) {
		this.file2 = file2;
	}

	public String getFile2Name() {
		return file2Name;
	}

	public void setFile2Name(String file2Name) {
		this.file2Name = file2Name;
	}

	public byte[] getFile3() {
		return file3;
	}

	public void setFile3(byte[] file3) {
		this.file3 = file3;
	}

	public String getFile3Name() {
		return file3Name;
	}

	public void setFile3Name(String file3Name) {
		this.file3Name = file3Name;
	}

	public byte[] getFile4() {
		return file4;
	}

	public void setFile4(byte[] file4) {
		this.file4 = file4;
	}

	public String getFile4Name() {
		return file4Name;
	}

	public void setFile4Name(String file4Name) {
		this.file4Name = file4Name;
	}

	public byte[] getFile5() {
		return file5;
	}

	public void setFile5(byte[] file5) {
		this.file5 = file5;
	}

	public String getFile5Name() {
		return file5Name;
	}

	public void setFile5Name(String file5Name) {
		this.file5Name = file5Name;
	}

	public byte[] getFile6() {
		return file6;
	}

	public void setFile6(byte[] file6) {
		this.file6 = file6;
	}

	public String getFile6Name() {
		return file6Name;
	}

	public void setFile6Name(String file6Name) {
		this.file6Name = file6Name;
	}

	public byte[] getFile7() {
		return file7;
	}

	public void setFile7(byte[] file7) {
		this.file7 = file7;
	}

	public String getFile7Name() {
		return file7Name;
	}

	public void setFile7Name(String file7Name) {
		this.file7Name = file7Name;
	}

	public byte[] getFile8() {
		return file8;
	}

	public void setFile8(byte[] file8) {
		this.file8 = file8;
	}

	public String getFile8Name() {
		return file8Name;
	}

	public void setFile8Name(String file8Name) {
		this.file8Name = file8Name;
	}

	public byte[] getFile9() {
		return file9;
	}

	public void setFile9(byte[] file9) {
		this.file9 = file9;
	}

	public String getFile9Name() {
		return file9Name;
	}

	public void setFile9Name(String file9Name) {
		this.file9Name = file9Name;
	}

	public byte[] getFile10() {
		return file10;
	}

	public void setFile10(byte[] file10) {
		this.file10 = file10;
	}

	public String getFile10Name() {
		return file10Name;
	}

	public void setFile10Name(String file10Name) {
		this.file10Name = file10Name;
	}

	public String getTruckMan() {
		return truckMan;
	}

	public void setTruckMan(String truckMan) {
		this.truckMan = truckMan;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getGrossEarningCheckbox() {
		return grossEarningCheckbox;
	}

	public void setGrossEarningCheckbox(String grossEarningCheckbox) {
		this.grossEarningCheckbox = grossEarningCheckbox;
	}

	public String getOthercoverage1() {
		return othercoverage1;
	}

	public void setOthercoverage1(String othercoverage1) {
		this.othercoverage1 = othercoverage1;
	}

	public String getOthercoverage2() {
		return othercoverage2;
	}

	public void setOthercoverage2(String othercoverage2) {
		this.othercoverage2 = othercoverage2;
	}

	public double getOtherCoverageLimit1() {
		return otherCoverageLimit1;
	}

	public void setOtherCoverageLimit1(double otherCoverageLimit1) {
		this.otherCoverageLimit1 = otherCoverageLimit1;
	}

	public double getOtherCoverageDeductible1() {
		return otherCoverageDeductible1;
	}

	public void setOtherCoverageDeductible1(double otherCoverageDeductible1) {
		this.otherCoverageDeductible1 = otherCoverageDeductible1;
	}

	public double getOtherCoverageLimit2() {
		return otherCoverageLimit2;
	}

	public void setOtherCoverageLimit2(double otherCoverageLimit2) {
		this.otherCoverageLimit2 = otherCoverageLimit2;
	}

	public double getOtherCoverageDeductible2() {
		return otherCoverageDeductible2;
	}

	public void setOtherCoverageDeductible2(double otherCoverageDeductible2) {
		this.otherCoverageDeductible2 = otherCoverageDeductible2;
	}

	public String getBasement() {
		return basement;
	}

	public void setBasement(String basement) {
		this.basement = basement;
	}

	public String getRoofupdated() {
		return roofupdated;
	}

	public void setRoofupdated(String roofupdated) {
		this.roofupdated = roofupdated;
	}

	public String getHeatingupdated() {
		return heatingupdated;
	}

	public void setHeatingupdated(String heatingupdated) {
		this.heatingupdated = heatingupdated;
	}

	public String getElectricalupdated() {
		return electricalupdated;
	}

	public void setElectricalupdated(String electricalupdated) {
		this.electricalupdated = electricalupdated;
	}

	public String getPlumbingupdated() {
		return plumbingupdated;
	}

	public void setPlumbingupdated(String plumbingupdated) {
		this.plumbingupdated = plumbingupdated;
	}

	public String getFireProtectiondistance() {
		return fireProtectiondistance;
	}

	public void setFireProtectiondistance(String fireProtectiondistance) {
		this.fireProtectiondistance = fireProtectiondistance;
	}

	public double getBuildingLimit1() {
		return buildingLimit1;
	}

	public void setBuildingLimit1(double buildingLimit1) {
		this.buildingLimit1 = buildingLimit1;
	}

	public double getBuildingDeductible1() {
		return buildingDeductible1;
	}

	public void setBuildingDeductible1(double buildingDeductible1) {
		this.buildingDeductible1 = buildingDeductible1;
	}

	public double getContentsLimit1() {
		return contentsLimit1;
	}

	public void setContentsLimit1(double contentsLimit1) {
		this.contentsLimit1 = contentsLimit1;
	}

	public double getContentsDeductible1() {
		return contentsDeductible1;
	}

	public void setContentsDeductible1(double contentsDeductible1) {
		this.contentsDeductible1 = contentsDeductible1;
	}

	public double getStockLimit1() {
		return stockLimit1;
	}

	public void setStockLimit1(double stockLimit1) {
		this.stockLimit1 = stockLimit1;
	}

	public double getStockDeductible1() {
		return stockDeductible1;
	}

	public void setStockDeductible1(double stockDeductible1) {
		this.stockDeductible1 = stockDeductible1;
	}

	public double getOfficeContentLimit1() {
		return officeContentLimit1;
	}

	public void setOfficeContentLimit1(double officeContentLimit1) {
		this.officeContentLimit1 = officeContentLimit1;
	}

	public double getOfficeContentDeductible1() {
		return officeContentDeductible1;
	}

	public void setOfficeContentDeductible1(double officeContentDeductible1) {
		this.officeContentDeductible1 = officeContentDeductible1;
	}

	public double getEdpLimit1() {
		return edpLimit1;
	}

	public void setEdpLimit1(double edpLimit1) {
		this.edpLimit1 = edpLimit1;
	}

	public double getEdpDeductible1() {
		return edpDeductible1;
	}

	public void setEdpDeductible1(double edpDeductible1) {
		this.edpDeductible1 = edpDeductible1;
	}

	public double getEquipmentLimit1() {
		return equipmentLimit1;
	}

	public void setEquipmentLimit1(double equipmentLimit1) {
		this.equipmentLimit1 = equipmentLimit1;
	}

	public double getEquipmentDeductible1() {
		return equipmentDeductible1;
	}

	public void setEquipmentDeductible1(double equipmentDeductible1) {
		this.equipmentDeductible1 = equipmentDeductible1;
	}

	public double getOffPremisesLimit1() {
		return offPremisesLimit1;
	}

	public void setOffPremisesLimit1(double offPremisesLimit1) {
		this.offPremisesLimit1 = offPremisesLimit1;
	}

	public double getOffPremisesDeductible1() {
		return offPremisesDeductible1;
	}

	public void setOffPremisesDeductible1(double offPremisesDeductible1) {
		this.offPremisesDeductible1 = offPremisesDeductible1;
	}

	public double getTransitLimit1() {
		return transitLimit1;
	}

	public void setTransitLimit1(double transitLimit1) {
		this.transitLimit1 = transitLimit1;
	}

	public double getTransitDeductible1() {
		return transitDeductible1;
	}

	public void setTransitDeductible1(double transitDeductible1) {
		this.transitDeductible1 = transitDeductible1;
	}

	public double getMiscPropertyLimit1() {
		return miscPropertyLimit1;
	}

	public void setMiscPropertyLimit1(double miscPropertyLimit1) {
		this.miscPropertyLimit1 = miscPropertyLimit1;
	}

	public double getMiscPropertyDeductible1() {
		return miscPropertyDeductible1;
	}

	public void setMiscPropertyDeductible1(double miscPropertyDeductible1) {
		this.miscPropertyDeductible1 = miscPropertyDeductible1;
	}

	public double getContractorEquipmentLimit1() {
		return contractorEquipmentLimit1;
	}

	public void setContractorEquipmentLimit1(double contractorEquipmentLimit1) {
		this.contractorEquipmentLimit1 = contractorEquipmentLimit1;
	}

	public double getContractorEquipmentDeductible1() {
		return contractorEquipmentDeductible1;
	}

	public void setContractorEquipmentDeductible1(
			double contractorEquipmentDeductible1) {
		this.contractorEquipmentDeductible1 = contractorEquipmentDeductible1;
	}

	public double getInstallationFloaterLimit1() {
		return installationFloaterLimit1;
	}

	public void setInstallationFloaterLimit1(double installationFloaterLimit1) {
		this.installationFloaterLimit1 = installationFloaterLimit1;
	}

	public double getInstallationFloaterDeductible1() {
		return installationFloaterDeductible1;
	}

	public void setInstallationFloaterDeductible1(
			double installationFloaterDeductible1) {
		this.installationFloaterDeductible1 = installationFloaterDeductible1;
	}

	public double getToolFloaterLimit1() {
		return toolFloaterLimit1;
	}

	public void setToolFloaterLimit1(double toolFloaterLimit1) {
		this.toolFloaterLimit1 = toolFloaterLimit1;
	}

	public double getToolFloaterDeductible1() {
		return toolFloaterDeductible1;
	}

	public void setToolFloaterDeductible1(double toolFloaterDeductible1) {
		this.toolFloaterDeductible1 = toolFloaterDeductible1;
	}

	public double getSignFloaterLimit1() {
		return signFloaterLimit1;
	}

	public void setSignFloaterLimit1(double signFloaterLimit1) {
		this.signFloaterLimit1 = signFloaterLimit1;
	}

	public double getSignFloaterDeductible1() {
		return signFloaterDeductible1;
	}

	public void setSignFloaterDeductible1(double signFloaterDeductible1) {
		this.signFloaterDeductible1 = signFloaterDeductible1;
	}

	public String getTruckMan1() {
		return truckMan1;
	}

	public void setTruckMan1(String truckMan1) {
		this.truckMan1 = truckMan1;
	}

	public String getOwner11() {
		return owner11;
	}

	public void setOwner11(String owner11) {
		this.owner11 = owner11;
	}

	public double getMotorTruckLimit1() {
		return motorTruckLimit1;
	}

	public void setMotorTruckLimit1(double motorTruckLimit1) {
		this.motorTruckLimit1 = motorTruckLimit1;
	}

	public double getMotorTruckDeductible1() {
		return motorTruckDeductible1;
	}

	public void setMotorTruckDeductible1(double motorTruckDeductible1) {
		this.motorTruckDeductible1 = motorTruckDeductible1;
	}

	public double getGlassLimit1() {
		return glassLimit1;
	}

	public void setGlassLimit1(double glassLimit1) {
		this.glassLimit1 = glassLimit1;
	}

	public double getGlassDeductible1() {
		return glassDeductible1;
	}

	public void setGlassDeductible1(double glassDeductible1) {
		this.glassDeductible1 = glassDeductible1;
	}

	public double getSewerBackupLimit1() {
		return sewerBackupLimit1;
	}

	public void setSewerBackupLimit1(double sewerBackupLimit1) {
		this.sewerBackupLimit1 = sewerBackupLimit1;
	}

	public double getSewerBackupDeductible1() {
		return sewerBackupDeductible1;
	}

	public void setSewerBackupDeductible1(double sewerBackupDeductible1) {
		this.sewerBackupDeductible1 = sewerBackupDeductible1;
	}

	public double getFloodLimit1() {
		return floodLimit1;
	}

	public void setFloodLimit1(double floodLimit1) {
		this.floodLimit1 = floodLimit1;
	}

	public double getFloodDeductible1() {
		return floodDeductible1;
	}

	public void setFloodDeductible1(double floodDeductible1) {
		this.floodDeductible1 = floodDeductible1;
	}

	public double getEarthquakeLimit1() {
		return earthquakeLimit1;
	}

	public void setEarthquakeLimit1(double earthquakeLimit1) {
		this.earthquakeLimit1 = earthquakeLimit1;
	}

	public double getEarthquakeDeductible1() {
		return earthquakeDeductible1;
	}

	public void setEarthquakeDeductible1(double earthquakeDeductible1) {
		this.earthquakeDeductible1 = earthquakeDeductible1;
	}

	public double getProfitLimit1() {
		return profitLimit1;
	}

	public void setProfitLimit1(double profitLimit1) {
		this.profitLimit1 = profitLimit1;
	}

	public double getProfitDeductible1() {
		return profitDeductible1;
	}

	public void setProfitDeductible1(double profitDeductible1) {
		this.profitDeductible1 = profitDeductible1;
	}

	public String getGrossEarning801() {
		return grossEarning801;
	}

	public void setGrossEarning801(String grossEarning801) {
		this.grossEarning801 = grossEarning801;
	}

	public String getGrossEarning501() {
		return grossEarning501;
	}

	public void setGrossEarning501(String grossEarning501) {
		this.grossEarning501 = grossEarning501;
	}

	public double getGrossEarningLimit1() {
		return grossEarningLimit1;
	}

	public void setGrossEarningLimit1(double grossEarningLimit1) {
		this.grossEarningLimit1 = grossEarningLimit1;
	}

	public double getGrossEarningDeductible1() {
		return grossEarningDeductible1;
	}

	public void setGrossEarningDeductible1(double grossEarningDeductible1) {
		this.grossEarningDeductible1 = grossEarningDeductible1;
	}

	public double getRentalIncomeLimit1() {
		return rentalIncomeLimit1;
	}

	public void setRentalIncomeLimit1(double rentalIncomeLimit1) {
		this.rentalIncomeLimit1 = rentalIncomeLimit1;
	}

	public double getRentalIncomeDeductible1() {
		return rentalIncomeDeductible1;
	}

	public void setRentalIncomeDeductible1(double rentalIncomeDeductible1) {
		this.rentalIncomeDeductible1 = rentalIncomeDeductible1;
	}

	public double getExtraExpenseLimit1() {
		return extraExpenseLimit1;
	}

	public void setExtraExpenseLimit1(double extraExpenseLimit1) {
		this.extraExpenseLimit1 = extraExpenseLimit1;
	}

	public double getExtraExpenseDeductible1() {
		return extraExpenseDeductible1;
	}

	public void setExtraExpenseDeductible1(double extraExpenseDeductible1) {
		this.extraExpenseDeductible1 = extraExpenseDeductible1;
	}

	public double getOffPremisesPowerLimit1() {
		return offPremisesPowerLimit1;
	}

	public void setOffPremisesPowerLimit1(double offPremisesPowerLimit1) {
		this.offPremisesPowerLimit1 = offPremisesPowerLimit1;
	}

	public double getOffPremisesPowerDeductible1() {
		return offPremisesPowerDeductible1;
	}

	public void setOffPremisesPowerDeductible1(
			double offPremisesPowerDeductible1) {
		this.offPremisesPowerDeductible1 = offPremisesPowerDeductible1;
	}

	public double getInsideOutsideLimit1() {
		return insideOutsideLimit1;
	}

	public void setInsideOutsideLimit1(double insideOutsideLimit1) {
		this.insideOutsideLimit1 = insideOutsideLimit1;
	}

	public double getInsideOutsideDeductible1() {
		return insideOutsideDeductible1;
	}

	public void setInsideOutsideDeductible1(double insideOutsideDeductible1) {
		this.insideOutsideDeductible1 = insideOutsideDeductible1;
	}

	public double getBfMoneyLimit1() {
		return bfMoneyLimit1;
	}

	public void setBfMoneyLimit1(double bfMoneyLimit1) {
		this.bfMoneyLimit1 = bfMoneyLimit1;
	}

	public double getBfMoneyDeductible1() {
		return bfMoneyDeductible1;
	}

	public void setBfMoneyDeductible1(double bfMoneyDeductible1) {
		this.bfMoneyDeductible1 = bfMoneyDeductible1;
	}

	public double getDeopistorForgeryLimit1() {
		return deopistorForgeryLimit1;
	}

	public void setDeopistorForgeryLimit1(double deopistorForgeryLimit1) {
		this.deopistorForgeryLimit1 = deopistorForgeryLimit1;
	}

	public double getDeopistorForgeryDeductible1() {
		return deopistorForgeryDeductible1;
	}

	public void setDeopistorForgeryDeductible1(
			double deopistorForgeryDeductible1) {
		this.deopistorForgeryDeductible1 = deopistorForgeryDeductible1;
	}

	public double getMoneyOrdersLimit1() {
		return moneyOrdersLimit1;
	}

	public void setMoneyOrdersLimit1(double moneyOrdersLimit1) {
		this.moneyOrdersLimit1 = moneyOrdersLimit1;
	}

	public double getMoneyOrdersDeductible1() {
		return moneyOrdersDeductible1;
	}

	public void setMoneyOrdersDeductible1(double moneyOrdersDeductible1) {
		this.moneyOrdersDeductible1 = moneyOrdersDeductible1;
	}

	public double getEmployDishonestyLimit1() {
		return employDishonestyLimit1;
	}

	public void setEmployDishonestyLimit1(double employDishonestyLimit1) {
		this.employDishonestyLimit1 = employDishonestyLimit1;
	}

	public double getEmployDishonestyDeductible1() {
		return employDishonestyDeductible1;
	}

	public void setEmployDishonestyDeductible1(
			double employDishonestyDeductible1) {
		this.employDishonestyDeductible1 = employDishonestyDeductible1;
	}

	public double getCglLimit1() {
		return cglLimit1;
	}

	public void setCglLimit1(double cglLimit1) {
		this.cglLimit1 = cglLimit1;
	}

	public double getCglDeductible1() {
		return cglDeductible1;
	}

	public void setCglDeductible1(double cglDeductible1) {
		this.cglDeductible1 = cglDeductible1;
	}

	public double getTenantsLegalLimit1() {
		return tenantsLegalLimit1;
	}

	public void setTenantsLegalLimit1(double tenantsLegalLimit1) {
		this.tenantsLegalLimit1 = tenantsLegalLimit1;
	}

	public double getTenantsLegalDeductible1() {
		return tenantsLegalDeductible1;
	}

	public void setTenantsLegalDeductible1(double tenantsLegalDeductible1) {
		this.tenantsLegalDeductible1 = tenantsLegalDeductible1;
	}

	public double getNonOwnedAutoLimit1() {
		return nonOwnedAutoLimit1;
	}

	public void setNonOwnedAutoLimit1(double nonOwnedAutoLimit1) {
		this.nonOwnedAutoLimit1 = nonOwnedAutoLimit1;
	}

	public double getNonOwnedAutoDeductible1() {
		return nonOwnedAutoDeductible1;
	}

	public void setNonOwnedAutoDeductible1(double nonOwnedAutoDeductible1) {
		this.nonOwnedAutoDeductible1 = nonOwnedAutoDeductible1;
	}

	public double getSef96Limit1() {
		return sef96Limit1;
	}

	public void setSef96Limit1(double sef96Limit1) {
		this.sef96Limit1 = sef96Limit1;
	}

	public double getSef96Deductible1() {
		return sef96Deductible1;
	}

	public void setSef96Deductible1(double sef96Deductible1) {
		this.sef96Deductible1 = sef96Deductible1;
	}

	public double getSef94Limit1() {
		return sef94Limit1;
	}

	public void setSef94Limit1(double sef94Limit1) {
		this.sef94Limit1 = sef94Limit1;
	}

	public double getSef94Deductible1() {
		return sef94Deductible1;
	}

	public void setSef94Deductible1(double sef94Deductible1) {
		this.sef94Deductible1 = sef94Deductible1;
	}

	public double getDoLimit1() {
		return doLimit1;
	}

	public void setDoLimit1(double doLimit1) {
		this.doLimit1 = doLimit1;
	}

	public double getDoDeductible1() {
		return doDeductible1;
	}

	public void setDoDeductible1(double doDeductible1) {
		this.doDeductible1 = doDeductible1;
	}

	public double getEoLimit1() {
		return eoLimit1;
	}

	public void setEoLimit1(double eoLimit1) {
		this.eoLimit1 = eoLimit1;
	}

	public double getEoDeductible1() {
		return eoDeductible1;
	}

	public void setEoDeductible1(double eoDeductible1) {
		this.eoDeductible1 = eoDeductible1;
	}

	public double getEmployerLimit1() {
		return employerLimit1;
	}

	public void setEmployerLimit1(double employerLimit1) {
		this.employerLimit1 = employerLimit1;
	}

	public double getEmployerDeductible1() {
		return employerDeductible1;
	}

	public void setEmployerDeductible1(double employerDeductible1) {
		this.employerDeductible1 = employerDeductible1;
	}

	public double getUmbrellaLimit1() {
		return umbrellaLimit1;
	}

	public void setUmbrellaLimit1(double umbrellaLimit1) {
		this.umbrellaLimit1 = umbrellaLimit1;
	}

	public double getUmbrellaDeductible1() {
		return umbrellaDeductible1;
	}

	public void setUmbrellaDeductible1(double umbrellaDeductible1) {
		this.umbrellaDeductible1 = umbrellaDeductible1;
	}

	public double getWrapUpLimit1() {
		return wrapUpLimit1;
	}

	public void setWrapUpLimit1(double wrapUpLimit1) {
		this.wrapUpLimit1 = wrapUpLimit1;
	}

	public double getWrapUpDeductible1() {
		return wrapUpDeductible1;
	}

	public void setWrapUpDeductible1(double wrapUpDeductible1) {
		this.wrapUpDeductible1 = wrapUpDeductible1;
	}

	public double getStdComprehensiveLimit1() {
		return stdComprehensiveLimit1;
	}

	public void setStdComprehensiveLimit1(double stdComprehensiveLimit1) {
		this.stdComprehensiveLimit1 = stdComprehensiveLimit1;
	}

	public double getStdComprehensiveDeductible1() {
		return stdComprehensiveDeductible1;
	}

	public void setStdComprehensiveDeductible1(
			double stdComprehensiveDeductible1) {
		this.stdComprehensiveDeductible1 = stdComprehensiveDeductible1;
	}

	public double getAirConditioningLimit1() {
		return airConditioningLimit1;
	}

	public void setAirConditioningLimit1(double airConditioningLimit1) {
		this.airConditioningLimit1 = airConditioningLimit1;
	}

	public double getAirConditioningDeductible1() {
		return airConditioningDeductible1;
	}

	public void setAirConditioningDeductible1(double airConditioningDeductible1) {
		this.airConditioningDeductible1 = airConditioningDeductible1;
	}

	public double getProductionMachineryLimit1() {
		return productionMachineryLimit1;
	}

	public void setProductionMachineryLimit1(double productionMachineryLimit1) {
		this.productionMachineryLimit1 = productionMachineryLimit1;
	}

	public double getProductionMachineryDeductible1() {
		return productionMachineryDeductible1;
	}

	public void setProductionMachineryDeductible1(
			double productionMachineryDeductible1) {
		this.productionMachineryDeductible1 = productionMachineryDeductible1;
	}

	public String getOthercoverage11() {
		return othercoverage11;
	}

	public void setOthercoverage11(String othercoverage11) {
		this.othercoverage11 = othercoverage11;
	}

	public String getOthercoverage21() {
		return othercoverage21;
	}

	public void setOthercoverage21(String othercoverage21) {
		this.othercoverage21 = othercoverage21;
	}

	public double getOtherCoverageLimit11() {
		return otherCoverageLimit11;
	}

	public void setOtherCoverageLimit11(double otherCoverageLimit11) {
		this.otherCoverageLimit11 = otherCoverageLimit11;
	}

	public double getOtherCoverageDeductible11() {
		return otherCoverageDeductible11;
	}

	public void setOtherCoverageDeductible11(double otherCoverageDeductible11) {
		this.otherCoverageDeductible11 = otherCoverageDeductible11;
	}

	public double getOtherCoverageLimit21() {
		return otherCoverageLimit21;
	}

	public void setOtherCoverageLimit21(double otherCoverageLimit21) {
		this.otherCoverageLimit21 = otherCoverageLimit21;
	}

	public double getOtherCoverageDeductible21() {
		return otherCoverageDeductible21;
	}

	public void setOtherCoverageDeductible21(double otherCoverageDeductible21) {
		this.otherCoverageDeductible21 = otherCoverageDeductible21;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public int getAge1() {
		return age1;
	}

	public void setAge1(int age1) {
		this.age1 = age1;
	}

	public double getTotalSqFootage1() {
		return totalSqFootage1;
	}

	public void setTotalSqFootage1(double totalSqFootage1) {
		this.totalSqFootage1 = totalSqFootage1;
	}

	public double getInsdSqFootage1() {
		return insdSqFootage1;
	}

	public void setInsdSqFootage1(double insdSqFootage1) {
		this.insdSqFootage1 = insdSqFootage1;
	}

	public int getNoOfStories1() {
		return noOfStories1;
	}

	public void setNoOfStories1(int noOfStories1) {
		this.noOfStories1 = noOfStories1;
	}

	public String getBasement1() {
		return basement1;
	}

	public void setBasement1(String basement1) {
		this.basement1 = basement1;
	}

	public String getWalls1() {
		return walls1;
	}

	public void setWalls1(String walls1) {
		this.walls1 = walls1;
	}

	public String getRoof1() {
		return roof1;
	}

	public void setRoof1(String roof1) {
		this.roof1 = roof1;
	}

	public String getRoofupdated1() {
		return roofupdated1;
	}

	public void setRoofupdated1(String roofupdated1) {
		this.roofupdated1 = roofupdated1;
	}

	public String getFloors1() {
		return floors1;
	}

	public void setFloors1(String floors1) {
		this.floors1 = floors1;
	}

	public String getHeating1() {
		return heating1;
	}

	public void setHeating1(String heating1) {
		this.heating1 = heating1;
	}

	public String getHeatingupdated1() {
		return heatingupdated1;
	}

	public void setHeatingupdated1(String heatingupdated1) {
		this.heatingupdated1 = heatingupdated1;
	}

	public String getElectrical1() {
		return electrical1;
	}

	public void setElectrical1(String electrical1) {
		this.electrical1 = electrical1;
	}

	public String getElectricalupdated1() {
		return electricalupdated1;
	}

	public void setElectricalupdated1(String electricalupdated1) {
		this.electricalupdated1 = electricalupdated1;
	}

	public String getPlumbing1() {
		return plumbing1;
	}

	public void setPlumbing1(String plumbing1) {
		this.plumbing1 = plumbing1;
	}

	public String getPlumbingupdated1() {
		return plumbingupdated1;
	}

	public void setPlumbingupdated1(String plumbingupdated1) {
		this.plumbingupdated1 = plumbingupdated1;
	}

	public String getFireProtection1() {
		return fireProtection1;
	}

	public void setFireProtection1(String fireProtection1) {
		this.fireProtection1 = fireProtection1;
	}

	public String getFireProtectiondistance1() {
		return fireProtectiondistance1;
	}

	public void setFireProtectiondistance1(String fireProtectiondistance1) {
		this.fireProtectiondistance1 = fireProtectiondistance1;
	}

	public String getSecurity1() {
		return security1;
	}

	public void setSecurity1(String security1) {
		this.security1 = security1;
	}

	public String getNotes1() {
		return notes1;
	}

	public void setNotes1(String notes1) {
		this.notes1 = notes1;
	}

	public double getBuildingLimit2() {
		return buildingLimit2;
	}

	public void setBuildingLimit2(double buildingLimit2) {
		this.buildingLimit2 = buildingLimit2;
	}

	public double getBuildingDeductible2() {
		return buildingDeductible2;
	}

	public void setBuildingDeductible2(double buildingDeductible2) {
		this.buildingDeductible2 = buildingDeductible2;
	}

	public double getContentsLimit2() {
		return contentsLimit2;
	}

	public void setContentsLimit2(double contentsLimit2) {
		this.contentsLimit2 = contentsLimit2;
	}

	public double getContentsDeductible2() {
		return contentsDeductible2;
	}

	public void setContentsDeductible2(double contentsDeductible2) {
		this.contentsDeductible2 = contentsDeductible2;
	}

	public double getStockLimit2() {
		return stockLimit2;
	}

	public void setStockLimit2(double stockLimit2) {
		this.stockLimit2 = stockLimit2;
	}

	public double getStockDeductible2() {
		return stockDeductible2;
	}

	public void setStockDeductible2(double stockDeductible2) {
		this.stockDeductible2 = stockDeductible2;
	}

	public double getOfficeContentLimit2() {
		return officeContentLimit2;
	}

	public void setOfficeContentLimit2(double officeContentLimit2) {
		this.officeContentLimit2 = officeContentLimit2;
	}

	public double getOfficeContentDeductible2() {
		return officeContentDeductible2;
	}

	public void setOfficeContentDeductible2(double officeContentDeductible2) {
		this.officeContentDeductible2 = officeContentDeductible2;
	}

	public double getEdpLimit2() {
		return edpLimit2;
	}

	public void setEdpLimit2(double edpLimit2) {
		this.edpLimit2 = edpLimit2;
	}

	public double getEdpDeductible2() {
		return edpDeductible2;
	}

	public void setEdpDeductible2(double edpDeductible2) {
		this.edpDeductible2 = edpDeductible2;
	}

	public double getEquipmentLimit2() {
		return equipmentLimit2;
	}

	public void setEquipmentLimit2(double equipmentLimit2) {
		this.equipmentLimit2 = equipmentLimit2;
	}

	public double getEquipmentDeductible2() {
		return equipmentDeductible2;
	}

	public void setEquipmentDeductible2(double equipmentDeductible2) {
		this.equipmentDeductible2 = equipmentDeductible2;
	}

	public double getOffPremisesLimit2() {
		return offPremisesLimit2;
	}

	public void setOffPremisesLimit2(double offPremisesLimit2) {
		this.offPremisesLimit2 = offPremisesLimit2;
	}

	public double getOffPremisesDeductible2() {
		return offPremisesDeductible2;
	}

	public void setOffPremisesDeductible2(double offPremisesDeductible2) {
		this.offPremisesDeductible2 = offPremisesDeductible2;
	}

	public double getTransitLimit2() {
		return transitLimit2;
	}

	public void setTransitLimit2(double transitLimit2) {
		this.transitLimit2 = transitLimit2;
	}

	public double getTransitDeductible2() {
		return transitDeductible2;
	}

	public void setTransitDeductible2(double transitDeductible2) {
		this.transitDeductible2 = transitDeductible2;
	}

	public double getMiscPropertyLimit2() {
		return miscPropertyLimit2;
	}

	public void setMiscPropertyLimit2(double miscPropertyLimit2) {
		this.miscPropertyLimit2 = miscPropertyLimit2;
	}

	public double getMiscPropertyDeductible2() {
		return miscPropertyDeductible2;
	}

	public void setMiscPropertyDeductible2(double miscPropertyDeductible2) {
		this.miscPropertyDeductible2 = miscPropertyDeductible2;
	}

	public double getContractorEquipmentLimit2() {
		return contractorEquipmentLimit2;
	}

	public void setContractorEquipmentLimit2(double contractorEquipmentLimit2) {
		this.contractorEquipmentLimit2 = contractorEquipmentLimit2;
	}

	public double getContractorEquipmentDeductible2() {
		return contractorEquipmentDeductible2;
	}

	public void setContractorEquipmentDeductible2(
			double contractorEquipmentDeductible2) {
		this.contractorEquipmentDeductible2 = contractorEquipmentDeductible2;
	}

	public double getInstallationFloaterLimit2() {
		return installationFloaterLimit2;
	}

	public void setInstallationFloaterLimit2(double installationFloaterLimit2) {
		this.installationFloaterLimit2 = installationFloaterLimit2;
	}

	public double getInstallationFloaterDeductible2() {
		return installationFloaterDeductible2;
	}

	public void setInstallationFloaterDeductible2(
			double installationFloaterDeductible2) {
		this.installationFloaterDeductible2 = installationFloaterDeductible2;
	}

	public double getToolFloaterLimit2() {
		return toolFloaterLimit2;
	}

	public void setToolFloaterLimit2(double toolFloaterLimit2) {
		this.toolFloaterLimit2 = toolFloaterLimit2;
	}

	public double getToolFloaterDeductible2() {
		return toolFloaterDeductible2;
	}

	public void setToolFloaterDeductible2(double toolFloaterDeductible2) {
		this.toolFloaterDeductible2 = toolFloaterDeductible2;
	}

	public double getSignFloaterLimit2() {
		return signFloaterLimit2;
	}

	public void setSignFloaterLimit2(double signFloaterLimit2) {
		this.signFloaterLimit2 = signFloaterLimit2;
	}

	public double getSignFloaterDeductible2() {
		return signFloaterDeductible2;
	}

	public void setSignFloaterDeductible2(double signFloaterDeductible2) {
		this.signFloaterDeductible2 = signFloaterDeductible2;
	}

	public String getTruckMan2() {
		return truckMan2;
	}

	public void setTruckMan2(String truckMan2) {
		this.truckMan2 = truckMan2;
	}

	public String getOwner12() {
		return owner12;
	}

	public void setOwner12(String owner12) {
		this.owner12 = owner12;
	}

	public double getMotorTruckLimit2() {
		return motorTruckLimit2;
	}

	public void setMotorTruckLimit2(double motorTruckLimit2) {
		this.motorTruckLimit2 = motorTruckLimit2;
	}

	public double getMotorTruckDeductible2() {
		return motorTruckDeductible2;
	}

	public void setMotorTruckDeductible2(double motorTruckDeductible2) {
		this.motorTruckDeductible2 = motorTruckDeductible2;
	}

	public double getGlassLimit2() {
		return glassLimit2;
	}

	public void setGlassLimit2(double glassLimit2) {
		this.glassLimit2 = glassLimit2;
	}

	public double getGlassDeductible2() {
		return glassDeductible2;
	}

	public void setGlassDeductible2(double glassDeductible2) {
		this.glassDeductible2 = glassDeductible2;
	}

	public double getSewerBackupLimit2() {
		return sewerBackupLimit2;
	}

	public void setSewerBackupLimit2(double sewerBackupLimit2) {
		this.sewerBackupLimit2 = sewerBackupLimit2;
	}

	public double getSewerBackupDeductible2() {
		return sewerBackupDeductible2;
	}

	public void setSewerBackupDeductible2(double sewerBackupDeductible2) {
		this.sewerBackupDeductible2 = sewerBackupDeductible2;
	}

	public double getFloodLimit2() {
		return floodLimit2;
	}

	public void setFloodLimit2(double floodLimit2) {
		this.floodLimit2 = floodLimit2;
	}

	public double getFloodDeductible2() {
		return floodDeductible2;
	}

	public void setFloodDeductible2(double floodDeductible2) {
		this.floodDeductible2 = floodDeductible2;
	}

	public double getEarthquakeLimit2() {
		return earthquakeLimit2;
	}

	public void setEarthquakeLimit2(double earthquakeLimit2) {
		this.earthquakeLimit2 = earthquakeLimit2;
	}

	public double getEarthquakeDeductible2() {
		return earthquakeDeductible2;
	}

	public void setEarthquakeDeductible2(double earthquakeDeductible2) {
		this.earthquakeDeductible2 = earthquakeDeductible2;
	}

	public double getProfitLimit2() {
		return profitLimit2;
	}

	public void setProfitLimit2(double profitLimit2) {
		this.profitLimit2 = profitLimit2;
	}

	public double getProfitDeductible2() {
		return profitDeductible2;
	}

	public void setProfitDeductible2(double profitDeductible2) {
		this.profitDeductible2 = profitDeductible2;
	}

	public String getGrossEarning802() {
		return grossEarning802;
	}

	public void setGrossEarning802(String grossEarning802) {
		this.grossEarning802 = grossEarning802;
	}

	public String getGrossEarning502() {
		return grossEarning502;
	}

	public void setGrossEarning502(String grossEarning502) {
		this.grossEarning502 = grossEarning502;
	}

	public double getGrossEarningLimit2() {
		return grossEarningLimit2;
	}

	public void setGrossEarningLimit2(double grossEarningLimit2) {
		this.grossEarningLimit2 = grossEarningLimit2;
	}

	public double getGrossEarningDeductible2() {
		return grossEarningDeductible2;
	}

	public void setGrossEarningDeductible2(double grossEarningDeductible2) {
		this.grossEarningDeductible2 = grossEarningDeductible2;
	}

	public double getRentalIncomeLimit2() {
		return rentalIncomeLimit2;
	}

	public void setRentalIncomeLimit2(double rentalIncomeLimit2) {
		this.rentalIncomeLimit2 = rentalIncomeLimit2;
	}

	public double getRentalIncomeDeductible2() {
		return rentalIncomeDeductible2;
	}

	public void setRentalIncomeDeductible2(double rentalIncomeDeductible2) {
		this.rentalIncomeDeductible2 = rentalIncomeDeductible2;
	}

	public double getExtraExpenseLimit2() {
		return extraExpenseLimit2;
	}

	public void setExtraExpenseLimit2(double extraExpenseLimit2) {
		this.extraExpenseLimit2 = extraExpenseLimit2;
	}

	public double getExtraExpenseDeductible2() {
		return extraExpenseDeductible2;
	}

	public void setExtraExpenseDeductible2(double extraExpenseDeductible2) {
		this.extraExpenseDeductible2 = extraExpenseDeductible2;
	}

	public double getOffPremisesPowerLimit2() {
		return offPremisesPowerLimit2;
	}

	public void setOffPremisesPowerLimit2(double offPremisesPowerLimit2) {
		this.offPremisesPowerLimit2 = offPremisesPowerLimit2;
	}

	public double getOffPremisesPowerDeductible2() {
		return offPremisesPowerDeductible2;
	}

	public void setOffPremisesPowerDeductible2(
			double offPremisesPowerDeductible2) {
		this.offPremisesPowerDeductible2 = offPremisesPowerDeductible2;
	}

	public double getInsideOutsideLimit2() {
		return insideOutsideLimit2;
	}

	public void setInsideOutsideLimit2(double insideOutsideLimit2) {
		this.insideOutsideLimit2 = insideOutsideLimit2;
	}

	public double getInsideOutsideDeductible2() {
		return insideOutsideDeductible2;
	}

	public void setInsideOutsideDeductible2(double insideOutsideDeductible2) {
		this.insideOutsideDeductible2 = insideOutsideDeductible2;
	}

	public double getBfMoneyLimit2() {
		return bfMoneyLimit2;
	}

	public void setBfMoneyLimit2(double bfMoneyLimit2) {
		this.bfMoneyLimit2 = bfMoneyLimit2;
	}

	public double getBfMoneyDeductible2() {
		return bfMoneyDeductible2;
	}

	public void setBfMoneyDeductible2(double bfMoneyDeductible2) {
		this.bfMoneyDeductible2 = bfMoneyDeductible2;
	}

	public double getDeopistorForgeryLimit2() {
		return deopistorForgeryLimit2;
	}

	public void setDeopistorForgeryLimit2(double deopistorForgeryLimit2) {
		this.deopistorForgeryLimit2 = deopistorForgeryLimit2;
	}

	public double getDeopistorForgeryDeductible2() {
		return deopistorForgeryDeductible2;
	}

	public void setDeopistorForgeryDeductible2(
			double deopistorForgeryDeductible2) {
		this.deopistorForgeryDeductible2 = deopistorForgeryDeductible2;
	}

	public double getMoneyOrdersLimit2() {
		return moneyOrdersLimit2;
	}

	public void setMoneyOrdersLimit2(double moneyOrdersLimit2) {
		this.moneyOrdersLimit2 = moneyOrdersLimit2;
	}

	public double getMoneyOrdersDeductible2() {
		return moneyOrdersDeductible2;
	}

	public void setMoneyOrdersDeductible2(double moneyOrdersDeductible2) {
		this.moneyOrdersDeductible2 = moneyOrdersDeductible2;
	}

	public double getEmployDishonestyLimit2() {
		return employDishonestyLimit2;
	}

	public void setEmployDishonestyLimit2(double employDishonestyLimit2) {
		this.employDishonestyLimit2 = employDishonestyLimit2;
	}

	public double getEmployDishonestyDeductible2() {
		return employDishonestyDeductible2;
	}

	public void setEmployDishonestyDeductible2(
			double employDishonestyDeductible2) {
		this.employDishonestyDeductible2 = employDishonestyDeductible2;
	}

	public double getCglLimit2() {
		return cglLimit2;
	}

	public void setCglLimit2(double cglLimit2) {
		this.cglLimit2 = cglLimit2;
	}

	public double getCglDeductible2() {
		return cglDeductible2;
	}

	public void setCglDeductible2(double cglDeductible2) {
		this.cglDeductible2 = cglDeductible2;
	}

	public double getTenantsLegalLimit2() {
		return tenantsLegalLimit2;
	}

	public void setTenantsLegalLimit2(double tenantsLegalLimit2) {
		this.tenantsLegalLimit2 = tenantsLegalLimit2;
	}

	public double getTenantsLegalDeductible2() {
		return tenantsLegalDeductible2;
	}

	public void setTenantsLegalDeductible2(double tenantsLegalDeductible2) {
		this.tenantsLegalDeductible2 = tenantsLegalDeductible2;
	}

	public double getNonOwnedAutoLimit2() {
		return nonOwnedAutoLimit2;
	}

	public void setNonOwnedAutoLimit2(double nonOwnedAutoLimit2) {
		this.nonOwnedAutoLimit2 = nonOwnedAutoLimit2;
	}

	public double getNonOwnedAutoDeductible2() {
		return nonOwnedAutoDeductible2;
	}

	public void setNonOwnedAutoDeductible2(double nonOwnedAutoDeductible2) {
		this.nonOwnedAutoDeductible2 = nonOwnedAutoDeductible2;
	}

	public double getSef96Limit2() {
		return sef96Limit2;
	}

	public void setSef96Limit2(double sef96Limit2) {
		this.sef96Limit2 = sef96Limit2;
	}

	public double getSef96Deductible2() {
		return sef96Deductible2;
	}

	public void setSef96Deductible2(double sef96Deductible2) {
		this.sef96Deductible2 = sef96Deductible2;
	}

	public double getSef94Limit2() {
		return sef94Limit2;
	}

	public void setSef94Limit2(double sef94Limit2) {
		this.sef94Limit2 = sef94Limit2;
	}

	public double getSef94Deductible2() {
		return sef94Deductible2;
	}

	public void setSef94Deductible2(double sef94Deductible2) {
		this.sef94Deductible2 = sef94Deductible2;
	}

	public double getDoLimit2() {
		return doLimit2;
	}

	public void setDoLimit2(double doLimit2) {
		this.doLimit2 = doLimit2;
	}

	public double getDoDeductible2() {
		return doDeductible2;
	}

	public void setDoDeductible2(double doDeductible2) {
		this.doDeductible2 = doDeductible2;
	}

	public double getEoLimit2() {
		return eoLimit2;
	}

	public void setEoLimit2(double eoLimit2) {
		this.eoLimit2 = eoLimit2;
	}

	public double getEoDeductible2() {
		return eoDeductible2;
	}

	public void setEoDeductible2(double eoDeductible2) {
		this.eoDeductible2 = eoDeductible2;
	}

	public double getEmployerLimit2() {
		return employerLimit2;
	}

	public void setEmployerLimit2(double employerLimit2) {
		this.employerLimit2 = employerLimit2;
	}

	public double getEmployerDeductible2() {
		return employerDeductible2;
	}

	public void setEmployerDeductible2(double employerDeductible2) {
		this.employerDeductible2 = employerDeductible2;
	}

	public double getUmbrellaLimit2() {
		return umbrellaLimit2;
	}

	public void setUmbrellaLimit2(double umbrellaLimit2) {
		this.umbrellaLimit2 = umbrellaLimit2;
	}

	public double getUmbrellaDeductible2() {
		return umbrellaDeductible2;
	}

	public void setUmbrellaDeductible2(double umbrellaDeductible2) {
		this.umbrellaDeductible2 = umbrellaDeductible2;
	}

	public double getWrapUpLimit2() {
		return wrapUpLimit2;
	}

	public void setWrapUpLimit2(double wrapUpLimit2) {
		this.wrapUpLimit2 = wrapUpLimit2;
	}

	public double getWrapUpDeductible2() {
		return wrapUpDeductible2;
	}

	public void setWrapUpDeductible2(double wrapUpDeductible2) {
		this.wrapUpDeductible2 = wrapUpDeductible2;
	}

	public double getStdComprehensiveLimit2() {
		return stdComprehensiveLimit2;
	}

	public void setStdComprehensiveLimit2(double stdComprehensiveLimit2) {
		this.stdComprehensiveLimit2 = stdComprehensiveLimit2;
	}

	public double getStdComprehensiveDeductible2() {
		return stdComprehensiveDeductible2;
	}

	public void setStdComprehensiveDeductible2(
			double stdComprehensiveDeductible2) {
		this.stdComprehensiveDeductible2 = stdComprehensiveDeductible2;
	}

	public double getAirConditioningLimit2() {
		return airConditioningLimit2;
	}

	public void setAirConditioningLimit2(double airConditioningLimit2) {
		this.airConditioningLimit2 = airConditioningLimit2;
	}

	public double getAirConditioningDeductible2() {
		return airConditioningDeductible2;
	}

	public void setAirConditioningDeductible2(double airConditioningDeductible2) {
		this.airConditioningDeductible2 = airConditioningDeductible2;
	}

	public double getProductionMachineryLimit2() {
		return productionMachineryLimit2;
	}

	public void setProductionMachineryLimit2(double productionMachineryLimit2) {
		this.productionMachineryLimit2 = productionMachineryLimit2;
	}

	public double getProductionMachineryDeductible2() {
		return productionMachineryDeductible2;
	}

	public void setProductionMachineryDeductible2(
			double productionMachineryDeductible2) {
		this.productionMachineryDeductible2 = productionMachineryDeductible2;
	}

	public String getOthercoverage12() {
		return othercoverage12;
	}

	public void setOthercoverage12(String othercoverage12) {
		this.othercoverage12 = othercoverage12;
	}

	public String getOthercoverage22() {
		return othercoverage22;
	}

	public void setOthercoverage22(String othercoverage22) {
		this.othercoverage22 = othercoverage22;
	}

	public double getOtherCoverageLimit12() {
		return otherCoverageLimit12;
	}

	public void setOtherCoverageLimit12(double otherCoverageLimit12) {
		this.otherCoverageLimit12 = otherCoverageLimit12;
	}

	public double getOtherCoverageDeductible12() {
		return otherCoverageDeductible12;
	}

	public void setOtherCoverageDeductible12(double otherCoverageDeductible12) {
		this.otherCoverageDeductible12 = otherCoverageDeductible12;
	}

	public double getOtherCoverageLimit22() {
		return otherCoverageLimit22;
	}

	public void setOtherCoverageLimit22(double otherCoverageLimit22) {
		this.otherCoverageLimit22 = otherCoverageLimit22;
	}

	public double getOtherCoverageDeductible22() {
		return otherCoverageDeductible22;
	}

	public void setOtherCoverageDeductible22(double otherCoverageDeductible22) {
		this.otherCoverageDeductible22 = otherCoverageDeductible22;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public int getAge2() {
		return age2;
	}

	public void setAge2(int age2) {
		this.age2 = age2;
	}

	public double getTotalSqFootage2() {
		return totalSqFootage2;
	}

	public void setTotalSqFootage2(double totalSqFootage2) {
		this.totalSqFootage2 = totalSqFootage2;
	}

	public double getInsdSqFootage2() {
		return insdSqFootage2;
	}

	public void setInsdSqFootage2(double insdSqFootage2) {
		this.insdSqFootage2 = insdSqFootage2;
	}

	public int getNoOfStories2() {
		return noOfStories2;
	}

	public void setNoOfStories2(int noOfStories2) {
		this.noOfStories2 = noOfStories2;
	}

	public String getBasement2() {
		return basement2;
	}

	public void setBasement2(String basement2) {
		this.basement2 = basement2;
	}

	public String getWalls2() {
		return walls2;
	}

	public void setWalls2(String walls2) {
		this.walls2 = walls2;
	}

	public String getRoof2() {
		return roof2;
	}

	public void setRoof2(String roof2) {
		this.roof2 = roof2;
	}

	public String getRoofupdated2() {
		return roofupdated2;
	}

	public void setRoofupdated2(String roofupdated2) {
		this.roofupdated2 = roofupdated2;
	}

	public String getFloors2() {
		return floors2;
	}

	public void setFloors2(String floors2) {
		this.floors2 = floors2;
	}

	public String getHeating2() {
		return heating2;
	}

	public void setHeating2(String heating2) {
		this.heating2 = heating2;
	}

	public String getHeatingupdated2() {
		return heatingupdated2;
	}

	public void setHeatingupdated2(String heatingupdated2) {
		this.heatingupdated2 = heatingupdated2;
	}

	public String getElectrical2() {
		return electrical2;
	}

	public void setElectrical2(String electrical2) {
		this.electrical2 = electrical2;
	}

	public String getElectricalupdated2() {
		return electricalupdated2;
	}

	public void setElectricalupdated2(String electricalupdated2) {
		this.electricalupdated2 = electricalupdated2;
	}

	public String getPlumbing2() {
		return plumbing2;
	}

	public void setPlumbing2(String plumbing2) {
		this.plumbing2 = plumbing2;
	}

	public String getPlumbingupdated2() {
		return plumbingupdated2;
	}

	public void setPlumbingupdated2(String plumbingupdated2) {
		this.plumbingupdated2 = plumbingupdated2;
	}

	public String getFireProtection2() {
		return fireProtection2;
	}

	public void setFireProtection2(String fireProtection2) {
		this.fireProtection2 = fireProtection2;
	}

	public String getFireProtectiondistance2() {
		return fireProtectiondistance2;
	}

	public void setFireProtectiondistance2(String fireProtectiondistance2) {
		this.fireProtectiondistance2 = fireProtectiondistance2;
	}

	public String getSecurity2() {
		return security2;
	}

	public void setSecurity2(String security2) {
		this.security2 = security2;
	}

	public String getNotes2() {
		return notes2;
	}

	public void setNotes2(String notes2) {
		this.notes2 = notes2;
	}

	public double getBuildingLimit3() {
		return buildingLimit3;
	}

	public void setBuildingLimit3(double buildingLimit3) {
		this.buildingLimit3 = buildingLimit3;
	}

	public double getBuildingDeductible3() {
		return buildingDeductible3;
	}

	public void setBuildingDeductible3(double buildingDeductible3) {
		this.buildingDeductible3 = buildingDeductible3;
	}

	public double getContentsLimit3() {
		return contentsLimit3;
	}

	public void setContentsLimit3(double contentsLimit3) {
		this.contentsLimit3 = contentsLimit3;
	}

	public double getContentsDeductible3() {
		return contentsDeductible3;
	}

	public void setContentsDeductible3(double contentsDeductible3) {
		this.contentsDeductible3 = contentsDeductible3;
	}

	public double getStockLimit3() {
		return stockLimit3;
	}

	public void setStockLimit3(double stockLimit3) {
		this.stockLimit3 = stockLimit3;
	}

	public double getStockDeductible3() {
		return stockDeductible3;
	}

	public void setStockDeductible3(double stockDeductible3) {
		this.stockDeductible3 = stockDeductible3;
	}

	public double getOfficeContentLimit3() {
		return officeContentLimit3;
	}

	public void setOfficeContentLimit3(double officeContentLimit3) {
		this.officeContentLimit3 = officeContentLimit3;
	}

	public double getOfficeContentDeductible3() {
		return officeContentDeductible3;
	}

	public void setOfficeContentDeductible3(double officeContentDeductible3) {
		this.officeContentDeductible3 = officeContentDeductible3;
	}

	public double getEdpLimit3() {
		return edpLimit3;
	}

	public void setEdpLimit3(double edpLimit3) {
		this.edpLimit3 = edpLimit3;
	}

	public double getEdpDeductible3() {
		return edpDeductible3;
	}

	public void setEdpDeductible3(double edpDeductible3) {
		this.edpDeductible3 = edpDeductible3;
	}

	public double getEquipmentLimit3() {
		return equipmentLimit3;
	}

	public void setEquipmentLimit3(double equipmentLimit3) {
		this.equipmentLimit3 = equipmentLimit3;
	}

	public double getEquipmentDeductible3() {
		return equipmentDeductible3;
	}

	public void setEquipmentDeductible3(double equipmentDeductible3) {
		this.equipmentDeductible3 = equipmentDeductible3;
	}

	public double getOffPremisesLimit3() {
		return offPremisesLimit3;
	}

	public void setOffPremisesLimit3(double offPremisesLimit3) {
		this.offPremisesLimit3 = offPremisesLimit3;
	}

	public double getOffPremisesDeductible3() {
		return offPremisesDeductible3;
	}

	public void setOffPremisesDeductible3(double offPremisesDeductible3) {
		this.offPremisesDeductible3 = offPremisesDeductible3;
	}

	public double getTransitLimit3() {
		return transitLimit3;
	}

	public void setTransitLimit3(double transitLimit3) {
		this.transitLimit3 = transitLimit3;
	}

	public double getTransitDeductible3() {
		return transitDeductible3;
	}

	public void setTransitDeductible3(double transitDeductible3) {
		this.transitDeductible3 = transitDeductible3;
	}

	public double getMiscPropertyLimit3() {
		return miscPropertyLimit3;
	}

	public void setMiscPropertyLimit3(double miscPropertyLimit3) {
		this.miscPropertyLimit3 = miscPropertyLimit3;
	}

	public double getMiscPropertyDeductible3() {
		return miscPropertyDeductible3;
	}

	public void setMiscPropertyDeductible3(double miscPropertyDeductible3) {
		this.miscPropertyDeductible3 = miscPropertyDeductible3;
	}

	public double getContractorEquipmentLimit3() {
		return contractorEquipmentLimit3;
	}

	public void setContractorEquipmentLimit3(double contractorEquipmentLimit3) {
		this.contractorEquipmentLimit3 = contractorEquipmentLimit3;
	}

	public double getContractorEquipmentDeductible3() {
		return contractorEquipmentDeductible3;
	}

	public void setContractorEquipmentDeductible3(
			double contractorEquipmentDeductible3) {
		this.contractorEquipmentDeductible3 = contractorEquipmentDeductible3;
	}

	public double getInstallationFloaterLimit3() {
		return installationFloaterLimit3;
	}

	public void setInstallationFloaterLimit3(double installationFloaterLimit3) {
		this.installationFloaterLimit3 = installationFloaterLimit3;
	}

	public double getInstallationFloaterDeductible3() {
		return installationFloaterDeductible3;
	}

	public void setInstallationFloaterDeductible3(
			double installationFloaterDeductible3) {
		this.installationFloaterDeductible3 = installationFloaterDeductible3;
	}

	public double getToolFloaterLimit3() {
		return toolFloaterLimit3;
	}

	public void setToolFloaterLimit3(double toolFloaterLimit3) {
		this.toolFloaterLimit3 = toolFloaterLimit3;
	}

	public double getToolFloaterDeductible3() {
		return toolFloaterDeductible3;
	}

	public void setToolFloaterDeductible3(double toolFloaterDeductible3) {
		this.toolFloaterDeductible3 = toolFloaterDeductible3;
	}

	public double getSignFloaterLimit3() {
		return signFloaterLimit3;
	}

	public void setSignFloaterLimit3(double signFloaterLimit3) {
		this.signFloaterLimit3 = signFloaterLimit3;
	}

	public double getSignFloaterDeductible3() {
		return signFloaterDeductible3;
	}

	public void setSignFloaterDeductible3(double signFloaterDeductible3) {
		this.signFloaterDeductible3 = signFloaterDeductible3;
	}

	public String getTruckMan3() {
		return truckMan3;
	}

	public void setTruckMan3(String truckMan3) {
		this.truckMan3 = truckMan3;
	}

	public String getOwner13() {
		return owner13;
	}

	public void setOwner13(String owner13) {
		this.owner13 = owner13;
	}

	public double getMotorTruckLimit3() {
		return motorTruckLimit3;
	}

	public void setMotorTruckLimit3(double motorTruckLimit3) {
		this.motorTruckLimit3 = motorTruckLimit3;
	}

	public double getMotorTruckDeductible3() {
		return motorTruckDeductible3;
	}

	public void setMotorTruckDeductible3(double motorTruckDeductible3) {
		this.motorTruckDeductible3 = motorTruckDeductible3;
	}

	public double getGlassLimit3() {
		return glassLimit3;
	}

	public void setGlassLimit3(double glassLimit3) {
		this.glassLimit3 = glassLimit3;
	}

	public double getGlassDeductible3() {
		return glassDeductible3;
	}

	public void setGlassDeductible3(double glassDeductible3) {
		this.glassDeductible3 = glassDeductible3;
	}

	public double getSewerBackupLimit3() {
		return sewerBackupLimit3;
	}

	public void setSewerBackupLimit3(double sewerBackupLimit3) {
		this.sewerBackupLimit3 = sewerBackupLimit3;
	}

	public double getSewerBackupDeductible3() {
		return sewerBackupDeductible3;
	}

	public void setSewerBackupDeductible3(double sewerBackupDeductible3) {
		this.sewerBackupDeductible3 = sewerBackupDeductible3;
	}

	public double getFloodLimit3() {
		return floodLimit3;
	}

	public void setFloodLimit3(double floodLimit3) {
		this.floodLimit3 = floodLimit3;
	}

	public double getFloodDeductible3() {
		return floodDeductible3;
	}

	public void setFloodDeductible3(double floodDeductible3) {
		this.floodDeductible3 = floodDeductible3;
	}

	public double getEarthquakeLimit3() {
		return earthquakeLimit3;
	}

	public void setEarthquakeLimit3(double earthquakeLimit3) {
		this.earthquakeLimit3 = earthquakeLimit3;
	}

	public double getEarthquakeDeductible3() {
		return earthquakeDeductible3;
	}

	public void setEarthquakeDeductible3(double earthquakeDeductible3) {
		this.earthquakeDeductible3 = earthquakeDeductible3;
	}

	public double getProfitLimit3() {
		return profitLimit3;
	}

	public void setProfitLimit3(double profitLimit3) {
		this.profitLimit3 = profitLimit3;
	}

	public double getProfitDeductible3() {
		return profitDeductible3;
	}

	public void setProfitDeductible3(double profitDeductible3) {
		this.profitDeductible3 = profitDeductible3;
	}

	public String getGrossEarning803() {
		return grossEarning803;
	}

	public void setGrossEarning803(String grossEarning803) {
		this.grossEarning803 = grossEarning803;
	}

	public String getGrossEarning503() {
		return grossEarning503;
	}

	public void setGrossEarning503(String grossEarning503) {
		this.grossEarning503 = grossEarning503;
	}

	public double getGrossEarningLimit3() {
		return grossEarningLimit3;
	}

	public void setGrossEarningLimit3(double grossEarningLimit3) {
		this.grossEarningLimit3 = grossEarningLimit3;
	}

	public double getGrossEarningDeductible3() {
		return grossEarningDeductible3;
	}

	public void setGrossEarningDeductible3(double grossEarningDeductible3) {
		this.grossEarningDeductible3 = grossEarningDeductible3;
	}

	public double getRentalIncomeLimit3() {
		return rentalIncomeLimit3;
	}

	public void setRentalIncomeLimit3(double rentalIncomeLimit3) {
		this.rentalIncomeLimit3 = rentalIncomeLimit3;
	}

	public double getRentalIncomeDeductible3() {
		return rentalIncomeDeductible3;
	}

	public void setRentalIncomeDeductible3(double rentalIncomeDeductible3) {
		this.rentalIncomeDeductible3 = rentalIncomeDeductible3;
	}

	public double getExtraExpenseLimit3() {
		return extraExpenseLimit3;
	}

	public void setExtraExpenseLimit3(double extraExpenseLimit3) {
		this.extraExpenseLimit3 = extraExpenseLimit3;
	}

	public double getExtraExpenseDeductible3() {
		return extraExpenseDeductible3;
	}

	public void setExtraExpenseDeductible3(double extraExpenseDeductible3) {
		this.extraExpenseDeductible3 = extraExpenseDeductible3;
	}

	public double getOffPremisesPowerLimit3() {
		return offPremisesPowerLimit3;
	}

	public void setOffPremisesPowerLimit3(double offPremisesPowerLimit3) {
		this.offPremisesPowerLimit3 = offPremisesPowerLimit3;
	}

	public double getOffPremisesPowerDeductible3() {
		return offPremisesPowerDeductible3;
	}

	public void setOffPremisesPowerDeductible3(
			double offPremisesPowerDeductible3) {
		this.offPremisesPowerDeductible3 = offPremisesPowerDeductible3;
	}

	public double getInsideOutsideLimit3() {
		return insideOutsideLimit3;
	}

	public void setInsideOutsideLimit3(double insideOutsideLimit3) {
		this.insideOutsideLimit3 = insideOutsideLimit3;
	}

	public double getInsideOutsideDeductible3() {
		return insideOutsideDeductible3;
	}

	public void setInsideOutsideDeductible3(double insideOutsideDeductible3) {
		this.insideOutsideDeductible3 = insideOutsideDeductible3;
	}

	public double getBfMoneyLimit3() {
		return bfMoneyLimit3;
	}

	public void setBfMoneyLimit3(double bfMoneyLimit3) {
		this.bfMoneyLimit3 = bfMoneyLimit3;
	}

	public double getBfMoneyDeductible3() {
		return bfMoneyDeductible3;
	}

	public void setBfMoneyDeductible3(double bfMoneyDeductible3) {
		this.bfMoneyDeductible3 = bfMoneyDeductible3;
	}

	public double getDeopistorForgeryLimit3() {
		return deopistorForgeryLimit3;
	}

	public void setDeopistorForgeryLimit3(double deopistorForgeryLimit3) {
		this.deopistorForgeryLimit3 = deopistorForgeryLimit3;
	}

	public double getDeopistorForgeryDeductible3() {
		return deopistorForgeryDeductible3;
	}

	public void setDeopistorForgeryDeductible3(
			double deopistorForgeryDeductible3) {
		this.deopistorForgeryDeductible3 = deopistorForgeryDeductible3;
	}

	public double getMoneyOrdersLimit3() {
		return moneyOrdersLimit3;
	}

	public void setMoneyOrdersLimit3(double moneyOrdersLimit3) {
		this.moneyOrdersLimit3 = moneyOrdersLimit3;
	}

	public double getMoneyOrdersDeductible3() {
		return moneyOrdersDeductible3;
	}

	public void setMoneyOrdersDeductible3(double moneyOrdersDeductible3) {
		this.moneyOrdersDeductible3 = moneyOrdersDeductible3;
	}

	public double getEmployDishonestyLimit3() {
		return employDishonestyLimit3;
	}

	public void setEmployDishonestyLimit3(double employDishonestyLimit3) {
		this.employDishonestyLimit3 = employDishonestyLimit3;
	}

	public double getEmployDishonestyDeductible3() {
		return employDishonestyDeductible3;
	}

	public void setEmployDishonestyDeductible3(
			double employDishonestyDeductible3) {
		this.employDishonestyDeductible3 = employDishonestyDeductible3;
	}

	public double getCglLimit3() {
		return cglLimit3;
	}

	public void setCglLimit3(double cglLimit3) {
		this.cglLimit3 = cglLimit3;
	}

	public double getCglDeductible3() {
		return cglDeductible3;
	}

	public void setCglDeductible3(double cglDeductible3) {
		this.cglDeductible3 = cglDeductible3;
	}

	public double getTenantsLegalLimit3() {
		return tenantsLegalLimit3;
	}

	public void setTenantsLegalLimit3(double tenantsLegalLimit3) {
		this.tenantsLegalLimit3 = tenantsLegalLimit3;
	}

	public double getTenantsLegalDeductible3() {
		return tenantsLegalDeductible3;
	}

	public void setTenantsLegalDeductible3(double tenantsLegalDeductible3) {
		this.tenantsLegalDeductible3 = tenantsLegalDeductible3;
	}

	public double getNonOwnedAutoLimit3() {
		return nonOwnedAutoLimit3;
	}

	public void setNonOwnedAutoLimit3(double nonOwnedAutoLimit3) {
		this.nonOwnedAutoLimit3 = nonOwnedAutoLimit3;
	}

	public double getNonOwnedAutoDeductible3() {
		return nonOwnedAutoDeductible3;
	}

	public void setNonOwnedAutoDeductible3(double nonOwnedAutoDeductible3) {
		this.nonOwnedAutoDeductible3 = nonOwnedAutoDeductible3;
	}

	public double getSef96Limit3() {
		return sef96Limit3;
	}

	public void setSef96Limit3(double sef96Limit3) {
		this.sef96Limit3 = sef96Limit3;
	}

	public double getSef96Deductible3() {
		return sef96Deductible3;
	}

	public void setSef96Deductible3(double sef96Deductible3) {
		this.sef96Deductible3 = sef96Deductible3;
	}

	public double getSef94Limit3() {
		return sef94Limit3;
	}

	public void setSef94Limit3(double sef94Limit3) {
		this.sef94Limit3 = sef94Limit3;
	}

	public double getSef94Deductible3() {
		return sef94Deductible3;
	}

	public void setSef94Deductible3(double sef94Deductible3) {
		this.sef94Deductible3 = sef94Deductible3;
	}

	public double getDoLimit3() {
		return doLimit3;
	}

	public void setDoLimit3(double doLimit3) {
		this.doLimit3 = doLimit3;
	}

	public double getDoDeductible3() {
		return doDeductible3;
	}

	public void setDoDeductible3(double doDeductible3) {
		this.doDeductible3 = doDeductible3;
	}

	public double getEoLimit3() {
		return eoLimit3;
	}

	public void setEoLimit3(double eoLimit3) {
		this.eoLimit3 = eoLimit3;
	}

	public double getEoDeductible3() {
		return eoDeductible3;
	}

	public void setEoDeductible3(double eoDeductible3) {
		this.eoDeductible3 = eoDeductible3;
	}

	public double getEmployerLimit3() {
		return employerLimit3;
	}

	public void setEmployerLimit3(double employerLimit3) {
		this.employerLimit3 = employerLimit3;
	}

	public double getEmployerDeductible3() {
		return employerDeductible3;
	}

	public void setEmployerDeductible3(double employerDeductible3) {
		this.employerDeductible3 = employerDeductible3;
	}

	public double getUmbrellaLimit3() {
		return umbrellaLimit3;
	}

	public void setUmbrellaLimit3(double umbrellaLimit3) {
		this.umbrellaLimit3 = umbrellaLimit3;
	}

	public double getUmbrellaDeductible3() {
		return umbrellaDeductible3;
	}

	public void setUmbrellaDeductible3(double umbrellaDeductible3) {
		this.umbrellaDeductible3 = umbrellaDeductible3;
	}

	public double getWrapUpLimit3() {
		return wrapUpLimit3;
	}

	public void setWrapUpLimit3(double wrapUpLimit3) {
		this.wrapUpLimit3 = wrapUpLimit3;
	}

	public double getWrapUpDeductible3() {
		return wrapUpDeductible3;
	}

	public void setWrapUpDeductible3(double wrapUpDeductible3) {
		this.wrapUpDeductible3 = wrapUpDeductible3;
	}

	public double getStdComprehensiveLimit3() {
		return stdComprehensiveLimit3;
	}

	public void setStdComprehensiveLimit3(double stdComprehensiveLimit3) {
		this.stdComprehensiveLimit3 = stdComprehensiveLimit3;
	}

	public double getStdComprehensiveDeductible3() {
		return stdComprehensiveDeductible3;
	}

	public void setStdComprehensiveDeductible3(
			double stdComprehensiveDeductible3) {
		this.stdComprehensiveDeductible3 = stdComprehensiveDeductible3;
	}

	public double getAirConditioningLimit3() {
		return airConditioningLimit3;
	}

	public void setAirConditioningLimit3(double airConditioningLimit3) {
		this.airConditioningLimit3 = airConditioningLimit3;
	}

	public double getAirConditioningDeductible3() {
		return airConditioningDeductible3;
	}

	public void setAirConditioningDeductible3(double airConditioningDeductible3) {
		this.airConditioningDeductible3 = airConditioningDeductible3;
	}

	public double getProductionMachineryLimit3() {
		return productionMachineryLimit3;
	}

	public void setProductionMachineryLimit3(double productionMachineryLimit3) {
		this.productionMachineryLimit3 = productionMachineryLimit3;
	}

	public double getProductionMachineryDeductible3() {
		return productionMachineryDeductible3;
	}

	public void setProductionMachineryDeductible3(
			double productionMachineryDeductible3) {
		this.productionMachineryDeductible3 = productionMachineryDeductible3;
	}

	public String getOthercoverage13() {
		return othercoverage13;
	}

	public void setOthercoverage13(String othercoverage13) {
		this.othercoverage13 = othercoverage13;
	}

	public String getOthercoverage23() {
		return othercoverage23;
	}

	public void setOthercoverage23(String othercoverage23) {
		this.othercoverage23 = othercoverage23;
	}

	public double getOtherCoverageLimit13() {
		return otherCoverageLimit13;
	}

	public void setOtherCoverageLimit13(double otherCoverageLimit13) {
		this.otherCoverageLimit13 = otherCoverageLimit13;
	}

	public double getOtherCoverageDeductible13() {
		return otherCoverageDeductible13;
	}

	public void setOtherCoverageDeductible13(double otherCoverageDeductible13) {
		this.otherCoverageDeductible13 = otherCoverageDeductible13;
	}

	public double getOtherCoverageLimit23() {
		return otherCoverageLimit23;
	}

	public void setOtherCoverageLimit23(double otherCoverageLimit23) {
		this.otherCoverageLimit23 = otherCoverageLimit23;
	}

	public double getOtherCoverageDeductible23() {
		return otherCoverageDeductible23;
	}

	public void setOtherCoverageDeductible23(double otherCoverageDeductible23) {
		this.otherCoverageDeductible23 = otherCoverageDeductible23;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public int getAge3() {
		return age3;
	}

	public void setAge3(int age3) {
		this.age3 = age3;
	}

	public double getTotalSqFootage3() {
		return totalSqFootage3;
	}

	public void setTotalSqFootage3(double totalSqFootage3) {
		this.totalSqFootage3 = totalSqFootage3;
	}

	public double getInsdSqFootage3() {
		return insdSqFootage3;
	}

	public void setInsdSqFootage3(double insdSqFootage3) {
		this.insdSqFootage3 = insdSqFootage3;
	}

	public int getNoOfStories3() {
		return noOfStories3;
	}

	public void setNoOfStories3(int noOfStories3) {
		this.noOfStories3 = noOfStories3;
	}

	public String getBasement3() {
		return basement3;
	}

	public void setBasement3(String basement3) {
		this.basement3 = basement3;
	}

	public String getWalls3() {
		return walls3;
	}

	public void setWalls3(String walls3) {
		this.walls3 = walls3;
	}

	public String getRoof3() {
		return roof3;
	}

	public void setRoof3(String roof3) {
		this.roof3 = roof3;
	}

	public String getRoofupdated3() {
		return roofupdated3;
	}

	public void setRoofupdated3(String roofupdated3) {
		this.roofupdated3 = roofupdated3;
	}

	public String getFloors3() {
		return floors3;
	}

	public void setFloors3(String floors3) {
		this.floors3 = floors3;
	}

	public String getHeating3() {
		return heating3;
	}

	public void setHeating3(String heating3) {
		this.heating3 = heating3;
	}

	public String getHeatingupdated3() {
		return heatingupdated3;
	}

	public void setHeatingupdated3(String heatingupdated3) {
		this.heatingupdated3 = heatingupdated3;
	}

	public String getElectrical3() {
		return electrical3;
	}

	public void setElectrical3(String electrical3) {
		this.electrical3 = electrical3;
	}

	public String getElectricalupdated3() {
		return electricalupdated3;
	}

	public void setElectricalupdated3(String electricalupdated3) {
		this.electricalupdated3 = electricalupdated3;
	}

	public String getPlumbing3() {
		return plumbing3;
	}

	public void setPlumbing3(String plumbing3) {
		this.plumbing3 = plumbing3;
	}

	public String getPlumbingupdated3() {
		return plumbingupdated3;
	}

	public void setPlumbingupdated3(String plumbingupdated3) {
		this.plumbingupdated3 = plumbingupdated3;
	}

	public String getFireProtection3() {
		return fireProtection3;
	}

	public void setFireProtection3(String fireProtection3) {
		this.fireProtection3 = fireProtection3;
	}

	public String getFireProtectiondistance3() {
		return fireProtectiondistance3;
	}

	public void setFireProtectiondistance3(String fireProtectiondistance3) {
		this.fireProtectiondistance3 = fireProtectiondistance3;
	}

	public String getSecurity3() {
		return security3;
	}

	public void setSecurity3(String security3) {
		this.security3 = security3;
	}

	public String getNotes3() {
		return notes3;
	}

	public void setNotes3(String notes3) {
		this.notes3 = notes3;
	}

	public double getBuildingLimit4() {
		return buildingLimit4;
	}

	public void setBuildingLimit4(double buildingLimit4) {
		this.buildingLimit4 = buildingLimit4;
	}

	public double getBuildingDeductible4() {
		return buildingDeductible4;
	}

	public void setBuildingDeductible4(double buildingDeductible4) {
		this.buildingDeductible4 = buildingDeductible4;
	}

	public double getContentsLimit4() {
		return contentsLimit4;
	}

	public void setContentsLimit4(double contentsLimit4) {
		this.contentsLimit4 = contentsLimit4;
	}

	public double getContentsDeductible4() {
		return contentsDeductible4;
	}

	public void setContentsDeductible4(double contentsDeductible4) {
		this.contentsDeductible4 = contentsDeductible4;
	}

	public double getStockLimit4() {
		return stockLimit4;
	}

	public void setStockLimit4(double stockLimit4) {
		this.stockLimit4 = stockLimit4;
	}

	public double getStockDeductible4() {
		return stockDeductible4;
	}

	public void setStockDeductible4(double stockDeductible4) {
		this.stockDeductible4 = stockDeductible4;
	}

	public double getOfficeContentLimit4() {
		return officeContentLimit4;
	}

	public void setOfficeContentLimit4(double officeContentLimit4) {
		this.officeContentLimit4 = officeContentLimit4;
	}

	public double getOfficeContentDeductible4() {
		return officeContentDeductible4;
	}

	public void setOfficeContentDeductible4(double officeContentDeductible4) {
		this.officeContentDeductible4 = officeContentDeductible4;
	}

	public double getEdpLimit4() {
		return edpLimit4;
	}

	public void setEdpLimit4(double edpLimit4) {
		this.edpLimit4 = edpLimit4;
	}

	public double getEdpDeductible4() {
		return edpDeductible4;
	}

	public void setEdpDeductible4(double edpDeductible4) {
		this.edpDeductible4 = edpDeductible4;
	}

	public double getEquipmentLimit4() {
		return equipmentLimit4;
	}

	public void setEquipmentLimit4(double equipmentLimit4) {
		this.equipmentLimit4 = equipmentLimit4;
	}

	public double getEquipmentDeductible4() {
		return equipmentDeductible4;
	}

	public void setEquipmentDeductible4(double equipmentDeductible4) {
		this.equipmentDeductible4 = equipmentDeductible4;
	}

	public double getOffPremisesLimit4() {
		return offPremisesLimit4;
	}

	public void setOffPremisesLimit4(double offPremisesLimit4) {
		this.offPremisesLimit4 = offPremisesLimit4;
	}

	public double getOffPremisesDeductible4() {
		return offPremisesDeductible4;
	}

	public void setOffPremisesDeductible4(double offPremisesDeductible4) {
		this.offPremisesDeductible4 = offPremisesDeductible4;
	}

	public double getTransitLimit4() {
		return transitLimit4;
	}

	public void setTransitLimit4(double transitLimit4) {
		this.transitLimit4 = transitLimit4;
	}

	public double getTransitDeductible4() {
		return transitDeductible4;
	}

	public void setTransitDeductible4(double transitDeductible4) {
		this.transitDeductible4 = transitDeductible4;
	}

	public double getMiscPropertyLimit4() {
		return miscPropertyLimit4;
	}

	public void setMiscPropertyLimit4(double miscPropertyLimit4) {
		this.miscPropertyLimit4 = miscPropertyLimit4;
	}

	public double getMiscPropertyDeductible4() {
		return miscPropertyDeductible4;
	}

	public void setMiscPropertyDeductible4(double miscPropertyDeductible4) {
		this.miscPropertyDeductible4 = miscPropertyDeductible4;
	}

	public double getContractorEquipmentLimit4() {
		return contractorEquipmentLimit4;
	}

	public void setContractorEquipmentLimit4(double contractorEquipmentLimit4) {
		this.contractorEquipmentLimit4 = contractorEquipmentLimit4;
	}

	public double getContractorEquipmentDeductible4() {
		return contractorEquipmentDeductible4;
	}

	public void setContractorEquipmentDeductible4(
			double contractorEquipmentDeductible4) {
		this.contractorEquipmentDeductible4 = contractorEquipmentDeductible4;
	}

	public double getInstallationFloaterLimit4() {
		return installationFloaterLimit4;
	}

	public void setInstallationFloaterLimit4(double installationFloaterLimit4) {
		this.installationFloaterLimit4 = installationFloaterLimit4;
	}

	public double getInstallationFloaterDeductible4() {
		return installationFloaterDeductible4;
	}

	public void setInstallationFloaterDeductible4(
			double installationFloaterDeductible4) {
		this.installationFloaterDeductible4 = installationFloaterDeductible4;
	}

	public double getToolFloaterLimit4() {
		return toolFloaterLimit4;
	}

	public void setToolFloaterLimit4(double toolFloaterLimit4) {
		this.toolFloaterLimit4 = toolFloaterLimit4;
	}

	public double getToolFloaterDeductible4() {
		return toolFloaterDeductible4;
	}

	public void setToolFloaterDeductible4(double toolFloaterDeductible4) {
		this.toolFloaterDeductible4 = toolFloaterDeductible4;
	}

	public double getSignFloaterLimit4() {
		return signFloaterLimit4;
	}

	public void setSignFloaterLimit4(double signFloaterLimit4) {
		this.signFloaterLimit4 = signFloaterLimit4;
	}

	public double getSignFloaterDeductible4() {
		return signFloaterDeductible4;
	}

	public void setSignFloaterDeductible4(double signFloaterDeductible4) {
		this.signFloaterDeductible4 = signFloaterDeductible4;
	}

	public String getTruckMan4() {
		return truckMan4;
	}

	public void setTruckMan4(String truckMan4) {
		this.truckMan4 = truckMan4;
	}

	public String getOwner14() {
		return owner14;
	}

	public void setOwner14(String owner14) {
		this.owner14 = owner14;
	}

	public double getMotorTruckLimit4() {
		return motorTruckLimit4;
	}

	public void setMotorTruckLimit4(double motorTruckLimit4) {
		this.motorTruckLimit4 = motorTruckLimit4;
	}

	public double getMotorTruckDeductible4() {
		return motorTruckDeductible4;
	}

	public void setMotorTruckDeductible4(double motorTruckDeductible4) {
		this.motorTruckDeductible4 = motorTruckDeductible4;
	}

	public double getGlassLimit4() {
		return glassLimit4;
	}

	public void setGlassLimit4(double glassLimit4) {
		this.glassLimit4 = glassLimit4;
	}

	public double getGlassDeductible4() {
		return glassDeductible4;
	}

	public void setGlassDeductible4(double glassDeductible4) {
		this.glassDeductible4 = glassDeductible4;
	}

	public double getSewerBackupLimit4() {
		return sewerBackupLimit4;
	}

	public void setSewerBackupLimit4(double sewerBackupLimit4) {
		this.sewerBackupLimit4 = sewerBackupLimit4;
	}

	public double getSewerBackupDeductible4() {
		return sewerBackupDeductible4;
	}

	public void setSewerBackupDeductible4(double sewerBackupDeductible4) {
		this.sewerBackupDeductible4 = sewerBackupDeductible4;
	}

	public double getFloodLimit4() {
		return floodLimit4;
	}

	public void setFloodLimit4(double floodLimit4) {
		this.floodLimit4 = floodLimit4;
	}

	public double getFloodDeductible4() {
		return floodDeductible4;
	}

	public void setFloodDeductible4(double floodDeductible4) {
		this.floodDeductible4 = floodDeductible4;
	}

	public double getEarthquakeLimit4() {
		return earthquakeLimit4;
	}

	public void setEarthquakeLimit4(double earthquakeLimit4) {
		this.earthquakeLimit4 = earthquakeLimit4;
	}

	public double getEarthquakeDeductible4() {
		return earthquakeDeductible4;
	}

	public void setEarthquakeDeductible4(double earthquakeDeductible4) {
		this.earthquakeDeductible4 = earthquakeDeductible4;
	}

	public double getProfitLimit4() {
		return profitLimit4;
	}

	public void setProfitLimit4(double profitLimit4) {
		this.profitLimit4 = profitLimit4;
	}

	public double getProfitDeductible4() {
		return profitDeductible4;
	}

	public void setProfitDeductible4(double profitDeductible4) {
		this.profitDeductible4 = profitDeductible4;
	}

	public String getGrossEarning804() {
		return grossEarning804;
	}

	public void setGrossEarning804(String grossEarning804) {
		this.grossEarning804 = grossEarning804;
	}

	public String getGrossEarning504() {
		return grossEarning504;
	}

	public void setGrossEarning504(String grossEarning504) {
		this.grossEarning504 = grossEarning504;
	}

	public double getGrossEarningLimit4() {
		return grossEarningLimit4;
	}

	public void setGrossEarningLimit4(double grossEarningLimit4) {
		this.grossEarningLimit4 = grossEarningLimit4;
	}

	public double getGrossEarningDeductible4() {
		return grossEarningDeductible4;
	}

	public void setGrossEarningDeductible4(double grossEarningDeductible4) {
		this.grossEarningDeductible4 = grossEarningDeductible4;
	}

	public double getRentalIncomeLimit4() {
		return rentalIncomeLimit4;
	}

	public void setRentalIncomeLimit4(double rentalIncomeLimit4) {
		this.rentalIncomeLimit4 = rentalIncomeLimit4;
	}

	public double getRentalIncomeDeductible4() {
		return rentalIncomeDeductible4;
	}

	public void setRentalIncomeDeductible4(double rentalIncomeDeductible4) {
		this.rentalIncomeDeductible4 = rentalIncomeDeductible4;
	}

	public double getExtraExpenseLimit4() {
		return extraExpenseLimit4;
	}

	public void setExtraExpenseLimit4(double extraExpenseLimit4) {
		this.extraExpenseLimit4 = extraExpenseLimit4;
	}

	public double getExtraExpenseDeductible4() {
		return extraExpenseDeductible4;
	}

	public void setExtraExpenseDeductible4(double extraExpenseDeductible4) {
		this.extraExpenseDeductible4 = extraExpenseDeductible4;
	}

	public double getOffPremisesPowerLimit4() {
		return offPremisesPowerLimit4;
	}

	public void setOffPremisesPowerLimit4(double offPremisesPowerLimit4) {
		this.offPremisesPowerLimit4 = offPremisesPowerLimit4;
	}

	public double getOffPremisesPowerDeductible4() {
		return offPremisesPowerDeductible4;
	}

	public void setOffPremisesPowerDeductible4(
			double offPremisesPowerDeductible4) {
		this.offPremisesPowerDeductible4 = offPremisesPowerDeductible4;
	}

	public double getInsideOutsideLimit4() {
		return insideOutsideLimit4;
	}

	public void setInsideOutsideLimit4(double insideOutsideLimit4) {
		this.insideOutsideLimit4 = insideOutsideLimit4;
	}

	public double getInsideOutsideDeductible4() {
		return insideOutsideDeductible4;
	}

	public void setInsideOutsideDeductible4(double insideOutsideDeductible4) {
		this.insideOutsideDeductible4 = insideOutsideDeductible4;
	}

	public double getBfMoneyLimit4() {
		return bfMoneyLimit4;
	}

	public void setBfMoneyLimit4(double bfMoneyLimit4) {
		this.bfMoneyLimit4 = bfMoneyLimit4;
	}

	public double getBfMoneyDeductible4() {
		return bfMoneyDeductible4;
	}

	public void setBfMoneyDeductible4(double bfMoneyDeductible4) {
		this.bfMoneyDeductible4 = bfMoneyDeductible4;
	}

	public double getDeopistorForgeryLimit4() {
		return deopistorForgeryLimit4;
	}

	public void setDeopistorForgeryLimit4(double deopistorForgeryLimit4) {
		this.deopistorForgeryLimit4 = deopistorForgeryLimit4;
	}

	public double getDeopistorForgeryDeductible4() {
		return deopistorForgeryDeductible4;
	}

	public void setDeopistorForgeryDeductible4(
			double deopistorForgeryDeductible4) {
		this.deopistorForgeryDeductible4 = deopistorForgeryDeductible4;
	}

	public double getMoneyOrdersLimit4() {
		return moneyOrdersLimit4;
	}

	public void setMoneyOrdersLimit4(double moneyOrdersLimit4) {
		this.moneyOrdersLimit4 = moneyOrdersLimit4;
	}

	public double getMoneyOrdersDeductible4() {
		return moneyOrdersDeductible4;
	}

	public void setMoneyOrdersDeductible4(double moneyOrdersDeductible4) {
		this.moneyOrdersDeductible4 = moneyOrdersDeductible4;
	}

	public double getEmployDishonestyLimit4() {
		return employDishonestyLimit4;
	}

	public void setEmployDishonestyLimit4(double employDishonestyLimit4) {
		this.employDishonestyLimit4 = employDishonestyLimit4;
	}

	public double getEmployDishonestyDeductible4() {
		return employDishonestyDeductible4;
	}

	public void setEmployDishonestyDeductible4(
			double employDishonestyDeductible4) {
		this.employDishonestyDeductible4 = employDishonestyDeductible4;
	}

	public double getCglLimit4() {
		return cglLimit4;
	}

	public void setCglLimit4(double cglLimit4) {
		this.cglLimit4 = cglLimit4;
	}

	public double getCglDeductible4() {
		return cglDeductible4;
	}

	public void setCglDeductible4(double cglDeductible4) {
		this.cglDeductible4 = cglDeductible4;
	}

	public double getTenantsLegalLimit4() {
		return tenantsLegalLimit4;
	}

	public void setTenantsLegalLimit4(double tenantsLegalLimit4) {
		this.tenantsLegalLimit4 = tenantsLegalLimit4;
	}

	public double getTenantsLegalDeductible4() {
		return tenantsLegalDeductible4;
	}

	public void setTenantsLegalDeductible4(double tenantsLegalDeductible4) {
		this.tenantsLegalDeductible4 = tenantsLegalDeductible4;
	}

	public double getNonOwnedAutoLimit4() {
		return nonOwnedAutoLimit4;
	}

	public void setNonOwnedAutoLimit4(double nonOwnedAutoLimit4) {
		this.nonOwnedAutoLimit4 = nonOwnedAutoLimit4;
	}

	public double getNonOwnedAutoDeductible4() {
		return nonOwnedAutoDeductible4;
	}

	public void setNonOwnedAutoDeductible4(double nonOwnedAutoDeductible4) {
		this.nonOwnedAutoDeductible4 = nonOwnedAutoDeductible4;
	}

	public double getSef96Limit4() {
		return sef96Limit4;
	}

	public void setSef96Limit4(double sef96Limit4) {
		this.sef96Limit4 = sef96Limit4;
	}

	public double getSef96Deductible4() {
		return sef96Deductible4;
	}

	public void setSef96Deductible4(double sef96Deductible4) {
		this.sef96Deductible4 = sef96Deductible4;
	}

	public double getSef94Limit4() {
		return sef94Limit4;
	}

	public void setSef94Limit4(double sef94Limit4) {
		this.sef94Limit4 = sef94Limit4;
	}

	public double getSef94Deductible4() {
		return sef94Deductible4;
	}

	public void setSef94Deductible4(double sef94Deductible4) {
		this.sef94Deductible4 = sef94Deductible4;
	}

	public double getDoLimit4() {
		return doLimit4;
	}

	public void setDoLimit4(double doLimit4) {
		this.doLimit4 = doLimit4;
	}

	public double getDoDeductible4() {
		return doDeductible4;
	}

	public void setDoDeductible4(double doDeductible4) {
		this.doDeductible4 = doDeductible4;
	}

	public double getEoLimit4() {
		return eoLimit4;
	}

	public void setEoLimit4(double eoLimit4) {
		this.eoLimit4 = eoLimit4;
	}

	public double getEoDeductible4() {
		return eoDeductible4;
	}

	public void setEoDeductible4(double eoDeductible4) {
		this.eoDeductible4 = eoDeductible4;
	}

	public double getEmployerLimit4() {
		return employerLimit4;
	}

	public void setEmployerLimit4(double employerLimit4) {
		this.employerLimit4 = employerLimit4;
	}

	public double getEmployerDeductible4() {
		return employerDeductible4;
	}

	public void setEmployerDeductible4(double employerDeductible4) {
		this.employerDeductible4 = employerDeductible4;
	}

	public double getUmbrellaLimit4() {
		return umbrellaLimit4;
	}

	public void setUmbrellaLimit4(double umbrellaLimit4) {
		this.umbrellaLimit4 = umbrellaLimit4;
	}

	public double getUmbrellaDeductible4() {
		return umbrellaDeductible4;
	}

	public void setUmbrellaDeductible4(double umbrellaDeductible4) {
		this.umbrellaDeductible4 = umbrellaDeductible4;
	}

	public double getWrapUpLimit4() {
		return wrapUpLimit4;
	}

	public void setWrapUpLimit4(double wrapUpLimit4) {
		this.wrapUpLimit4 = wrapUpLimit4;
	}

	public double getWrapUpDeductible4() {
		return wrapUpDeductible4;
	}

	public void setWrapUpDeductible4(double wrapUpDeductible4) {
		this.wrapUpDeductible4 = wrapUpDeductible4;
	}

	public double getStdComprehensiveLimit4() {
		return stdComprehensiveLimit4;
	}

	public void setStdComprehensiveLimit4(double stdComprehensiveLimit4) {
		this.stdComprehensiveLimit4 = stdComprehensiveLimit4;
	}

	public double getStdComprehensiveDeductible4() {
		return stdComprehensiveDeductible4;
	}

	public void setStdComprehensiveDeductible4(
			double stdComprehensiveDeductible4) {
		this.stdComprehensiveDeductible4 = stdComprehensiveDeductible4;
	}

	public double getAirConditioningLimit4() {
		return airConditioningLimit4;
	}

	public void setAirConditioningLimit4(double airConditioningLimit4) {
		this.airConditioningLimit4 = airConditioningLimit4;
	}

	public double getAirConditioningDeductible4() {
		return airConditioningDeductible4;
	}

	public void setAirConditioningDeductible4(double airConditioningDeductible4) {
		this.airConditioningDeductible4 = airConditioningDeductible4;
	}

	public double getProductionMachineryLimit4() {
		return productionMachineryLimit4;
	}

	public void setProductionMachineryLimit4(double productionMachineryLimit4) {
		this.productionMachineryLimit4 = productionMachineryLimit4;
	}

	public double getProductionMachineryDeductible4() {
		return productionMachineryDeductible4;
	}

	public void setProductionMachineryDeductible4(
			double productionMachineryDeductible4) {
		this.productionMachineryDeductible4 = productionMachineryDeductible4;
	}

	public String getOthercoverage14() {
		return othercoverage14;
	}

	public void setOthercoverage14(String othercoverage14) {
		this.othercoverage14 = othercoverage14;
	}

	public String getOthercoverage24() {
		return othercoverage24;
	}

	public void setOthercoverage24(String othercoverage24) {
		this.othercoverage24 = othercoverage24;
	}

	public double getOtherCoverageLimit14() {
		return otherCoverageLimit14;
	}

	public void setOtherCoverageLimit14(double otherCoverageLimit14) {
		this.otherCoverageLimit14 = otherCoverageLimit14;
	}

	public double getOtherCoverageDeductible14() {
		return otherCoverageDeductible14;
	}

	public void setOtherCoverageDeductible14(double otherCoverageDeductible14) {
		this.otherCoverageDeductible14 = otherCoverageDeductible14;
	}

	public double getOtherCoverageLimit24() {
		return otherCoverageLimit24;
	}

	public void setOtherCoverageLimit24(double otherCoverageLimit24) {
		this.otherCoverageLimit24 = otherCoverageLimit24;
	}

	public double getOtherCoverageDeductible24() {
		return otherCoverageDeductible24;
	}

	public void setOtherCoverageDeductible24(double otherCoverageDeductible24) {
		this.otherCoverageDeductible24 = otherCoverageDeductible24;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public int getAge4() {
		return age4;
	}

	public void setAge4(int age4) {
		this.age4 = age4;
	}

	public double getTotalSqFootage4() {
		return totalSqFootage4;
	}

	public void setTotalSqFootage4(double totalSqFootage4) {
		this.totalSqFootage4 = totalSqFootage4;
	}

	public double getInsdSqFootage4() {
		return insdSqFootage4;
	}

	public void setInsdSqFootage4(double insdSqFootage4) {
		this.insdSqFootage4 = insdSqFootage4;
	}

	public int getNoOfStories4() {
		return noOfStories4;
	}

	public void setNoOfStories4(int noOfStories4) {
		this.noOfStories4 = noOfStories4;
	}

	public String getBasement4() {
		return basement4;
	}

	public void setBasement4(String basement4) {
		this.basement4 = basement4;
	}

	public String getWalls4() {
		return walls4;
	}

	public void setWalls4(String walls4) {
		this.walls4 = walls4;
	}

	public String getRoof4() {
		return roof4;
	}

	public void setRoof4(String roof4) {
		this.roof4 = roof4;
	}

	public String getRoofupdated4() {
		return roofupdated4;
	}

	public void setRoofupdated4(String roofupdated4) {
		this.roofupdated4 = roofupdated4;
	}

	public String getFloors4() {
		return floors4;
	}

	public void setFloors4(String floors4) {
		this.floors4 = floors4;
	}

	public String getHeating4() {
		return heating4;
	}

	public void setHeating4(String heating4) {
		this.heating4 = heating4;
	}

	public String getHeatingupdated4() {
		return heatingupdated4;
	}

	public void setHeatingupdated4(String heatingupdated4) {
		this.heatingupdated4 = heatingupdated4;
	}

	public String getElectrical4() {
		return electrical4;
	}

	public void setElectrical4(String electrical4) {
		this.electrical4 = electrical4;
	}

	public String getElectricalupdated4() {
		return electricalupdated4;
	}

	public void setElectricalupdated4(String electricalupdated4) {
		this.electricalupdated4 = electricalupdated4;
	}

	public String getPlumbing4() {
		return plumbing4;
	}

	public void setPlumbing4(String plumbing4) {
		this.plumbing4 = plumbing4;
	}

	public String getPlumbingupdated4() {
		return plumbingupdated4;
	}

	public void setPlumbingupdated4(String plumbingupdated4) {
		this.plumbingupdated4 = plumbingupdated4;
	}

	public String getFireProtection4() {
		return fireProtection4;
	}

	public void setFireProtection4(String fireProtection4) {
		this.fireProtection4 = fireProtection4;
	}

	public String getFireProtectiondistance4() {
		return fireProtectiondistance4;
	}

	public void setFireProtectiondistance4(String fireProtectiondistance4) {
		this.fireProtectiondistance4 = fireProtectiondistance4;
	}

	public String getSecurity4() {
		return security4;
	}

	public void setSecurity4(String security4) {
		this.security4 = security4;
	}

	public String getNotes4() {
		return notes4;
	}

	public void setNotes4(String notes4) {
		this.notes4 = notes4;
	}

	public String getOtherSpecify() {
		return otherSpecify;
	}

	public void setOtherSpecify(String otherSpecify) {
		this.otherSpecify = otherSpecify;
	}

	public String getWithUs() {
		return withUs;
	}

	public void setWithUs(String withUs) {
		this.withUs = withUs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
