/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author ravjotsingh
 */
public class FormEntry1Binding {
    private StringProperty severity;
    private StringProperty keycontact;
    private StringProperty keyphone;
    private StringProperty keyemail;
    private StringProperty secondarycontact;
    private StringProperty secondaryphone;
    private StringProperty secondaryemail;
    private StringProperty businessname;
    private StringProperty mailingaddress;
    private StringProperty pincode;
    private StringProperty country;
    private StringProperty fax;
    private StringProperty website;
    private StringProperty nooflocations;
    private StringProperty noofownedautos;
    private StringProperty profit;
    private StringProperty nonprofit;
    private StringProperty entitytype;
    private StringProperty otherspecify;
    private StringProperty years;
    private StringProperty relatedexperience;
    private StringProperty owner1;
    private StringProperty owner2;
    private StringProperty owner3;
    private StringProperty owner4;
    private StringProperty bod1;
    private StringProperty bod2;
    private StringProperty bod3;
    private StringProperty bod4;
    
    public FormEntry1Binding() {
        severity=new SimpleStringProperty();
        keycontact = new SimpleStringProperty();
        keyphone = new SimpleStringProperty();
        keyemail = new SimpleStringProperty();
        secondarycontact = new SimpleStringProperty();
        secondaryphone = new SimpleStringProperty();
        secondaryemail = new SimpleStringProperty();
        businessname=new SimpleStringProperty();
        mailingaddress=new SimpleStringProperty();
        pincode=new SimpleStringProperty();
        country=new SimpleStringProperty();
        fax=new SimpleStringProperty();
        website=new SimpleStringProperty();
        nooflocations=new SimpleStringProperty();
        noofownedautos=new SimpleStringProperty();
        profit=new SimpleStringProperty();
        nonprofit=new SimpleStringProperty();
        entitytype=new SimpleStringProperty();
        otherspecify=new SimpleStringProperty();
        years=new SimpleStringProperty();
        relatedexperience=new SimpleStringProperty();
        owner1=new SimpleStringProperty();
        owner2=new SimpleStringProperty();
        owner3=new SimpleStringProperty();
        owner4=new SimpleStringProperty();
        bod1=new SimpleStringProperty();
        bod2=new SimpleStringProperty();
        bod3=new SimpleStringProperty();
        bod4=new SimpleStringProperty();
    }

    public String getSeverity() {
        return (String) this.severity.get();
    }

    public void setSeverity(String severity) {
        this.severity.set(severity);
    }

    public StringProperty severityProperty() {
        return this.severity;
    }
    public String getKeyContact() {
        return (String) this.keycontact.get();
    }

    public void setKeyContact(String keycontact) {
        this.keycontact.set(keycontact);
    }

    public StringProperty keyContactProperty() {
        return this.keycontact;
    }
    
    public String getSecondaryContact() {
        return (String) this.secondarycontact.get();
    }

    public void setSecondaryContact(String secondarycontact) {
        this.secondarycontact.set(secondarycontact);
    }

    public StringProperty secondaryContactProperty() {
        return this.secondarycontact;
    }
    
     public String getKeyEmail() {
        return (String) this.keyemail.get();
    }

    public void setKeyEmail(String keyemail) {
        this.keyemail.set(keyemail);
    }

    public StringProperty keyEmailProperty() {
        return this.keyemail;
    }
    
    public String getSecondaryEmail() {
        return (String) this.secondaryemail.get();
    }

    public void setSecondaryEmail(String secondaryemail) {
        this.secondaryemail.set(secondaryemail);
    }

    public StringProperty secondaryEmailProperty() {
        return this.secondaryemail;
    }
    
    public String getSecondaryPhone() {
        return (String) this.secondaryphone.get();
    }

    public void setSecondaryPhone(String secondaryphone) {
        this.secondaryphone.set(secondaryphone);
    }

    public StringProperty secondaryPhoneProperty() {
        return this.secondaryphone;
    }
    
    public String getPincode() {
        return (String) this.pincode.get();
    }

    public void setPincode(String pincode) {
        this.pincode.set(pincode);
    }

    public StringProperty pincodeProperty() {
        return this.pincode;
    }
    
    public String getCountry() {
        return (String) this.country.get();
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public StringProperty countryProperty() {
        return this.country;
    }
    
    public String getKeyPhone() {
        return (String) this.keyphone.get();
    }

    public void setKeyPhone(String keyphone) {
        this.keyphone.set(keyphone);
    }

    public StringProperty keyPhoneProperty() {
        return this.keyphone;
    }
    
    public String getBusinessName() {
        return (String) this.businessname.get();
    }

    public void setBusinessName(String businessname) {
        this.businessname.set(businessname);
    }

    public StringProperty businessNameProperty() {
        return this.businessname;
    }
    public String getMailingAddress() {
        return (String) this.mailingaddress.get();
    }

    public void setMailingAddress(String mailingaddress) {
        this.mailingaddress.set(mailingaddress);
    }

    public StringProperty mailingAddressProperty() {
        return this.mailingaddress;
    }
    
    public String getFax() {
        return (String) this.fax.get();
    }

    public void setFax(String fax) {
        this.fax.set(fax);
    }

    public StringProperty faxProperty() {
        return this.fax;
    }
    
    public String getWebsite() {
        return (String) this.website.get();
    }

    public void setWebsite(String website) {
        this.website.set(website);
    }

    public StringProperty websiteProperty() {
        return this.website;
    }
    
    public String getNoOfLocations() {
        return (String) this.nooflocations.get();
    }

    public void setNoOfLocations(String nooflocations) {
        this.nooflocations.set(nooflocations);
    }

    public StringProperty noOfLocationsProperty() {
        return this.nooflocations;
    }
    
    public String getNoOfOwnedAutos() {
        return (String) this.noofownedautos.get();
    }

    public void setNoOfOwnedAutos(String noofownedautos) {
        this.noofownedautos.set(noofownedautos);
    }

    public StringProperty noOfOwnedAutosProperty() {
        return this.noofownedautos;
    }
    public String getProfit() {
        return (String) this.profit.get();
    }

    public void setProfit(String profit) {
        this.profit.set(profit);
    }

    public StringProperty profitProperty() {
        return this.profit;
    }
    public String getnonProfit() {
        return (String) this.nonprofit.get();
    }

    public void setnonProfit(String nonprofit) {
        this.nonprofit.set(nonprofit);
    }

    public StringProperty nonProfitProperty() {
        return this.nonprofit;
    }
    
    public String getEntityType() {
        return (String) this.entitytype.get();
    }

    public void setEntityType(String entitytype) {
        this.entitytype.set(entitytype);
    }

    public StringProperty entityTypeProperty() {
        return this.entitytype;
    }
    
     public String getOtherSpecify() {
        return (String) this.otherspecify.get();
    }

    public void setOtherSpecify(String otherspecify) {
        this.otherspecify.set(otherspecify);
    }

    public StringProperty otherSpecifyProperty() {
        return this.otherspecify;
    }
    
    public String getYears() {
        return (String) this.years.get();
    }

    public void setYears(String years) {
        this.years.set(years);
    }

    public StringProperty yearsProperty() {
        return this.years;
    }
    
    public String getRelatedExperience() {
        return (String) this.relatedexperience.get();
    }

    public void setRelatedExperience(String relatedexperience) {
        this.relatedexperience.set(relatedexperience);
    }

    public StringProperty relatedExperienceProperty() {
        return this.relatedexperience;
    }
    
    public String getOwner1() {
        return (String) this.owner1.get();
    }

    public void setOwner1(String owner1) {
        this.owner1.set(owner1);
    }

    public StringProperty owner1Property() {
        return this.owner1;
    }
  
      public String getOwner2() {
        return (String) this.owner2.get();
    }

    public void setOwner2(String owner2) {
        this.owner2.set(owner2);
    }

    public StringProperty owner2Property() {
        return this.owner2;
    }
    
    public String getOwner3() {
        return (String) this.owner3.get();
    }

    public void setOwner3(String owner3) {
        this.owner3.set(owner3);
    }

    public StringProperty owner3Property() {
        return this.owner3;
    }
    
      public String getOwner4() {
        return (String) this.owner4.get();
    }

    public void setOwner4(String owner4) {
        this.owner4.set(owner4);
    }

    public StringProperty owner4Property() {
        return this.owner4;
    }
    
    public String getBod1() {
        return (String) this.bod1.get();
    }

    public void setBod1(String bod1) {
        this.bod1.set(bod1);
    }

    public StringProperty bod1Property() {
        return this.bod1;
    }   
    public String getBod2() {
        return (String) this.bod2.get();
    }

    public void setBod2(String bod2) {
        this.bod2.set(bod2);
    }

    public StringProperty bod2Property() {
        return this.bod2;
    }   
    public String getBod3() {
        return (String) this.bod3.get();
    }

    public void setBod3(String bod3) {
        this.bod3.set(bod3);
    }

    public StringProperty bod3Property() {
        return this.bod3;
    }   
    
    public String getBod4() {
        return (String) this.bod4.get();
    }

    public void setBod4(String bod4) {
        this.bod4.set(bod4);
    }

    public StringProperty bod4Property() {
        return this.bod4;
    }   
    
}
