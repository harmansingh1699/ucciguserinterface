/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FormEntry4Binding {
    private StringProperty buildinglimit;
    private StringProperty buildingdeductible;
    private StringProperty contentslimit;
    private StringProperty contentsdeductible;
    private StringProperty stocklimit;
    private StringProperty stockdeductible;
    private StringProperty officelimit;
    private StringProperty officedeductible;
    private StringProperty edplimit;
    private StringProperty equipmentlimit;
    private StringProperty equipmentdeductible;
    private StringProperty offpremiseslimit;
    private StringProperty offpremisesdeductible;
    private StringProperty transitlimit;
    private StringProperty transitdeductible;
    private StringProperty miscpropertylimit;
    private StringProperty miscpropertydeductible;
    private StringProperty contractorsequipmentlimit;
    private StringProperty contractorsequipmentdeductible;
    private StringProperty installationfloatorlimit;
    private StringProperty installationfloatordeductible;
    private StringProperty toolfloatorlimit;
    private StringProperty toolfloatordeductible;
    private StringProperty signfloatorlimit;
    private StringProperty signfloatordeductible;
    private StringProperty motortruckcargolimit;
    private StringProperty motortruckcargodeductible;           
    private StringProperty glasslimit;
    private StringProperty glassdeductible;
    private StringProperty sewerblackupdeductible;    
    private StringProperty flooddeductible;
    private StringProperty earthquakedeductible;
    private StringProperty profitslimit;
    private StringProperty profitsdeductible;
    private StringProperty grossearningslimit;
    private StringProperty grossearningsdeductible;
    private StringProperty rentalincomelimit;
    private StringProperty rentalincomedeductible;
    private StringProperty extraexpenselimit;
    private StringProperty extraexpensedeductible;
    private StringProperty offpremisespowerlimit;
    private StringProperty offpremisespowerdeductible;
    private StringProperty insideoutsidelimit;
    private StringProperty insideoutsidedeductible;
    private StringProperty bfmoneylimit;
    private StringProperty bfmoneydeductible;
    private StringProperty forgerylimit;
    private StringProperty forgerydeductible;
    private StringProperty moneyorderslimit;
    private StringProperty moneyordersdeductible;
    private StringProperty dishonestylimit;
    private StringProperty dishonestydeductible;
    private StringProperty cgllimit;
    private StringProperty cgldeductible;
    private StringProperty tenantslimit;
    private StringProperty tenantsdeductible;
    private StringProperty nonownedlimit;
    private StringProperty nonowneddeductible;
    private StringProperty sef96limit;
    private StringProperty sef96deductible;
    
    
    public FormEntry4Binding() {
        buildinglimit = new SimpleStringProperty();
        buildingdeductible = new SimpleStringProperty();
        contentslimit = new SimpleStringProperty();
        contentsdeductible = new SimpleStringProperty();
        stocklimit = new SimpleStringProperty();
        stockdeductible = new SimpleStringProperty();
        officelimit = new SimpleStringProperty();
        officedeductible = new SimpleStringProperty();
        edplimit = new SimpleStringProperty();
        equipmentlimit = new SimpleStringProperty();
        equipmentdeductible = new SimpleStringProperty();
        offpremiseslimit = new SimpleStringProperty();
        offpremisesdeductible = new SimpleStringProperty();
        transitlimit = new SimpleStringProperty();
        transitdeductible = new SimpleStringProperty();
        miscpropertylimit=new SimpleStringProperty();
        miscpropertydeductible=new SimpleStringProperty();
        contractorsequipmentlimit=new SimpleStringProperty();
        contractorsequipmentdeductible=new SimpleStringProperty();
        installationfloatorlimit=new SimpleStringProperty();
        installationfloatordeductible=new SimpleStringProperty();
        toolfloatorlimit=new SimpleStringProperty();
        toolfloatordeductible=new SimpleStringProperty();
        signfloatorlimit=new SimpleStringProperty();
        signfloatordeductible=new SimpleStringProperty();
        motortruckcargolimit=new SimpleStringProperty();
        motortruckcargodeductible=new SimpleStringProperty();
        glasslimit=new SimpleStringProperty();
        glassdeductible=new SimpleStringProperty();
        sewerblackupdeductible=new SimpleStringProperty();
        flooddeductible=new SimpleStringProperty();
        earthquakedeductible=new SimpleStringProperty();
        profitslimit=new SimpleStringProperty();
        profitsdeductible=new SimpleStringProperty();
        grossearningslimit=new SimpleStringProperty();
        grossearningsdeductible=new SimpleStringProperty();
        rentalincomelimit=new SimpleStringProperty();
        rentalincomedeductible=new SimpleStringProperty();
        extraexpenselimit=new SimpleStringProperty();
        extraexpensedeductible=new SimpleStringProperty();
        offpremisespowerlimit=new SimpleStringProperty();
        offpremisespowerdeductible=new SimpleStringProperty();
        insideoutsidelimit=new SimpleStringProperty();
        insideoutsidedeductible=new SimpleStringProperty();
        bfmoneylimit=new SimpleStringProperty();
        moneyorderslimit=new SimpleStringProperty();
        cgllimit=new SimpleStringProperty();
        cgldeductible=new SimpleStringProperty();
        tenantslimit=new SimpleStringProperty();
        tenantsdeductible=new SimpleStringProperty();
        nonownedlimit=new SimpleStringProperty();
        nonowneddeductible=new SimpleStringProperty();
        moneyordersdeductible=new SimpleStringProperty();
        dishonestylimit=new SimpleStringProperty();
        dishonestydeductible=new SimpleStringProperty();
        forgerydeductible=new SimpleStringProperty();
        forgerylimit= new SimpleStringProperty();
        bfmoneydeductible= new SimpleStringProperty();
        sef96limit= new SimpleStringProperty();
        sef96deductible= new SimpleStringProperty();
    }

    public String getbuildinglimit() {
        return (String) this.buildinglimit.get();
    }

    public void setbuildinglimit(String buildinglimit) {
        this.buildinglimit.set(buildinglimit);
    }

    public StringProperty buildinglimitProperty() {
        return this.buildinglimit;
    }
    
    public String getbuildingdeductible() {
        return (String) this.buildingdeductible.get();
    }

    public void setbuildingdeductible(String buildingdeductible) {
        this.buildingdeductible.set(buildingdeductible);
    }

    public StringProperty buildingdeductibleProperty() {
        return this.buildingdeductible;
    }
    
     public String getcontentslimit() {
        return (String) this.contentslimit.get();
    }

    public void setcontentslimit(String contentslimit) {
        this.contentslimit.set(contentslimit);
    }

    public StringProperty contentslimitProperty() {
        return this.contentslimit;
    }
    
    public String getcontentsdeductible() {
        return (String) this.contentsdeductible.get();
    }

    public void setcontentsdeductible(String contentsdeductible) {
        this.contentsdeductible.set(contentsdeductible);
    }

    public StringProperty contentsdeductibleProperty() {
        return this.contentsdeductible;
    }
    
    public String getstocklimit() {
        return (String) this.stocklimit.get();
    }

    public void setstocklimit(String stocklimit) {
        this.stocklimit.set(stocklimit);
    }

    public StringProperty stocklimitProperty() {
        return this.stocklimit;
    }
    
    public String getstockdeductible() {
        return (String) this.stockdeductible.get();
    }

    public void setstockdeductible(String stockdeductible) {
        this.stockdeductible.set(stockdeductible);
    }

    public StringProperty stockdeductibleProperty() {
        return this.stockdeductible;
    }
    
    public String getofficelimit() {
        return (String) this.officelimit.get();
    }

    public void setofficelimit(String officelimit) {
        this.officelimit.set(officelimit);
    }

    public StringProperty officelimitProperty() {
        return this.officelimit;
    }
    
    public String getofficedeductible() {
        return (String) this.officedeductible.get();
    }

    public void setofficedeductible(String officedeductible) {
        this.officedeductible.set(officedeductible);
    }

    public StringProperty officedeductibleProperty() {
        return this.officedeductible;
    }
    
    public String getedplimit() {
        return (String) this.edplimit.get();
    }

    public void setedplimit(String edplimit) {
        this.edplimit.set(edplimit);
    }

    public StringProperty edplimitProperty() {
        return this.edplimit;
    }
    
    public String getequipmentlimit() {
        return (String) this.equipmentlimit.get();
    }

    public void setequipmentlimit(String equipmentlimit) {
        this.equipmentlimit.set(equipmentlimit);
    }

    public StringProperty equipmentlimitProperty() {
        return this.equipmentlimit;
    }
    
    public String getequipmentdeductible() {
        return (String) this.equipmentdeductible.get();
    }

    public void setequipmentdeductible(String equipmentdeductible) {
        this.equipmentdeductible.set(equipmentdeductible);
    }

    public StringProperty equipmentdeductibleProperty() {
        return this.equipmentdeductible;
    }
    
    public String getoffpremiseslimit() {
        return (String) this.offpremiseslimit.get();
    }

    public void setoffpremiseslimit(String offpremiseslimit) {
        this.offpremiseslimit.set(offpremiseslimit);
    }

    public StringProperty offpremiseslimitProperty() {
        return this.offpremiseslimit;
    }
    
    public String getoffpremisesdeductible() {
        return (String) this.offpremisesdeductible.get();
    }

    public void setoffpremisesdeductible(String offpremisesdeductible) {
        this.offpremisesdeductible.set(offpremisesdeductible);
    }

    public StringProperty offpremisesdeductibleProperty() {
        return this.offpremisesdeductible;
    }
    
    public String gettransitlimit() {
        return (String) this.transitlimit.get();
    }

    public void settransitlimit(String transitlimit) {
        this.transitlimit.set(transitlimit);
    }

    public StringProperty transitlimitProperty() {
        return this.transitlimit;
    }
    
    public String gettransitdeductible() {
        return (String) this.transitdeductible.get();
    }

    public void settransitdeductible(String transitdeductible) {
        this.transitdeductible.set(transitdeductible);
    }

    public StringProperty transitdeductibleProperty() {
        return this.transitdeductible;
    }
    
    public String getmiscpropertylimit() {
        return (String) this.miscpropertylimit.get();
    }

    public void setmiscpropertylimit(String miscpropertylimit) {
        this.miscpropertylimit.set(miscpropertylimit);
    }

    public StringProperty miscpropertylimitProperty() {
        return this.miscpropertylimit;
    }
    
    public String getmiscpropertydeductible() {
        return (String) this.miscpropertydeductible.get();
    }

    public void setmiscpropertydeductible(String miscpropertydeductible) {
        this.miscpropertydeductible.set(miscpropertydeductible);
    }

    public StringProperty miscpropertydeductibleProperty() {
        return this.miscpropertydeductible;
    }
    
    public String getcontractorsequipmentlimit() {
        return (String) this.contractorsequipmentlimit.get();
    }

    public void setcontractorsequipmentlimit(String contractorsequipmentlimit) {
        this.contractorsequipmentlimit.set(contractorsequipmentlimit);
    }

    public StringProperty contractorsequipmentlimitProperty() {
        return this.contractorsequipmentlimit;
    }
    
     public String getcontractorsequipmentdeductible() {
        return (String) this.contractorsequipmentdeductible.get();
    }

    public void setcontractorsequipmentdeductible(String contractorsequipmentdeductible) {
        this.contractorsequipmentdeductible.set(contractorsequipmentdeductible);
    }

    public StringProperty contractorsequipmentdeductibleProperty() {
        return this.contractorsequipmentdeductible;
    }
    
     public String getinstallationfloatorlimit() {
        return (String) this.installationfloatorlimit.get();
    }

    public void setinstallationfloatorlimit(String installationfloatorlimit) {
        this.installationfloatorlimit.set(installationfloatorlimit);
    }

    public StringProperty installationfloatorlimitProperty() {
        return this.installationfloatorlimit;
    }
    
    public String getinstallationfloatordeductible() {
        return (String) this.installationfloatordeductible.get();
    }

    public void setinstallationfloatordeductible(String installationfloatordeductible) {
        this.installationfloatordeductible.set(installationfloatordeductible);
    }

    public StringProperty installationfloatordeductibleProperty() {
        return this.installationfloatordeductible;
    }
    
    
    public String gettoolfloatorlimit() {
        return (String) this.toolfloatorlimit.get();
    }

    public void settoolfloatorlimit(String toolfloatorlimit) {
        this.toolfloatorlimit.set(toolfloatorlimit);
    }

    public StringProperty toolfloatorlimitProperty() {
        return this.toolfloatorlimit;
    }
    
    public String gettoolfloatordeductible() {
        return (String) this.toolfloatordeductible.get();
    }

    public void settoolfloatordeductible(String toolfloatordeductible) {
        this.toolfloatordeductible.set(toolfloatordeductible);
    }

    public StringProperty toolfloatordeductibleProperty() {
        return this.toolfloatordeductible;
    }
    
    public String getsignfloatorlimit() {
        return (String) this.signfloatorlimit.get();
    }

    public void setsignfloatorlimit(String signfloatorlimit) {
        this.signfloatorlimit.set(signfloatorlimit);
    }

    public StringProperty signfloatorlimitProperty() {
        return this.signfloatorlimit;
    }
    
    public String getsignfloatordeductible() {
        return (String) this.signfloatordeductible.get();
    }

    public void setsignfloatordeductible(String signfloatordeductible) {
        this.signfloatordeductible.set(signfloatordeductible);
    }

    public StringProperty signfloatordeductibleProperty() {
        return this.signfloatordeductible;
    }
    
    public String getmotortruckcargolimit() {
        return (String) this.motortruckcargolimit.get();
    }

    public void setmotortruckcargolimit(String motortruckcargolimit) {
        this.motortruckcargolimit.set(motortruckcargolimit);
    }

    public StringProperty motortruckcargolimitProperty() {
        return this.motortruckcargolimit;
    }
    
    public String getmotortruckcargodeductible() {
        return (String) this.motortruckcargodeductible.get();
    }

    public void setmotortruckcargodeductible(String motortruckcargodeductible) {
        this.motortruckcargodeductible.set(motortruckcargodeductible);
    }

    public StringProperty motortruckcargodeductibleProperty() {
        return this.motortruckcargodeductible;
    }
    
    public String getglasslimit() {
        return (String) this.glasslimit.get();
    }

    public void setglasslimit(String glasslimit) {
        this.glasslimit.set(glasslimit);
    }

    public StringProperty glasslimitProperty() {
        return this.glasslimit;
    }
    
    public String getglassdeductible() {
        return (String) this.glassdeductible.get();
    }

    public void setglassdeductible(String glassdeductible) {
        this.glassdeductible.set(glassdeductible);
    }

    public StringProperty glassdeductibleProperty() {
        return this.glassdeductible;
    }
    
    public String getsewerblackupdeductible() {
        return (String) this.sewerblackupdeductible.get();
    }

    public void setsewerblackupdeductible(String sewerblackupdeductible) {
        this.sewerblackupdeductible.set(sewerblackupdeductible);
    }

    public StringProperty sewerblackupdeductibleProperty() {
        return this.sewerblackupdeductible;
    }
    
    public String getflooddeductible() {
        return (String) this.flooddeductible.get();
    }

    public void setflooddeductible(String flooddeductible) {
        this.flooddeductible.set(flooddeductible);
    }

    public StringProperty flooddeductibleProperty() {
        return this.flooddeductible;
    }
    
    public String getearthquakedeductible() {
        return (String) this.earthquakedeductible.get();
    }

    public void setearthquakedeductible(String earthquakedeductible) {
        this.earthquakedeductible.set(earthquakedeductible);
    }

    public StringProperty earthquakedeductibleProperty() {
        return this.earthquakedeductible;
    }
    
    public String getprofitslimit() {
        return (String) this.profitslimit.get();
    }

    public void setprofitslimit(String profitslimit) {
        this.profitslimit.set(profitslimit);
    }

    public StringProperty profitslimitProperty() {
        return this.profitslimit;
    }
    
    public String getprofitsdeductible() {
        return (String) this.profitsdeductible.get();
    }

    public void setprofitsdeductible(String profitsdeductible) {
        this.profitsdeductible.set(profitsdeductible);
    }

    public StringProperty profitsdeductibleProperty() {
        return this.profitsdeductible;
    }
    
    public String getgrossearningslimit() {
        return (String) this.grossearningslimit.get();
    }

    public void setgrossearningslimit(String grossearningslimit) {
        this.grossearningslimit.set(grossearningslimit);
    }

    public StringProperty grossearningslimitProperty() {
        return this.grossearningslimit;
    }
    
    public String getgrossearningsdeductible() {
        return (String) this.grossearningsdeductible.get();
    }

    public void setgrossearningsdeductible(String grossearningsdeductible) {
        this.grossearningsdeductible.set(grossearningsdeductible);
    }

    public StringProperty grossearningsdeductibleProperty() {
        return this.grossearningsdeductible;
    }
    
    public String getrentalincomelimit() {
        return (String) this.rentalincomelimit.get();
    }

    public void setrentalincomelimit(String rentalincomelimit) {
        this.rentalincomelimit.set(rentalincomelimit);
    }

    public StringProperty rentalincomelimitProperty() {
        return this.rentalincomelimit;
    }
    
    public String getrentalincomedeductible() {
        return (String) this.rentalincomedeductible.get();
    }

    public void setrentalincomedeductible(String rentalincomedeductible) {
        this.rentalincomedeductible.set(rentalincomedeductible);
    }

    public StringProperty rentalincomedeductibleProperty() {
        return this.rentalincomedeductible;
    }
    
    public String getextraexpenselimit() {
        return (String) this.extraexpenselimit.get();
    }

    public void setextraexpenselimit(String extraexpenselimit) {
        this.extraexpenselimit.set(extraexpenselimit);
    }

    public StringProperty extraexpenselimitProperty() {
        return this.extraexpenselimit;
    }
    
    public String getextraexpensedeductible() {
        return (String) this.extraexpensedeductible.get();
    }

    public void setextraexpensedeductible(String extraexpensedeductible) {
        this.extraexpensedeductible.set(extraexpensedeductible);
    }

    public StringProperty extraexpensedeductibleProperty() {
        return this.extraexpensedeductible;
    }
    
    public String getoffpremisespowerlimit() {
        return (String) this.offpremisespowerlimit.get();
    }

    public void setoffpremisespowerlimit(String offpremisespowerlimit) {
        this.offpremisespowerlimit.set(offpremisespowerlimit);
    }

    public StringProperty offpremisespowerlimitProperty() {
        return this.offpremisespowerlimit;
    }
    
    public String getbfmoneylimit() {
        return (String) this.bfmoneylimit.get();
    }

    public void setbfmoneylimit(String bfmoneylimit) {
        this.bfmoneylimit.set(bfmoneylimit);
    }

    public StringProperty bfmoneylimitProperty() {
        return this.bfmoneylimit;
    }
    
     public String gettenantsdeductible() {
        return (String) this.tenantsdeductible.get();
    }

    public void settenantsdeductible(String tenantsdeductible) {
        this.tenantsdeductible.set(tenantsdeductible);
    }

    public StringProperty tenantsdeductibleProperty() {
        return this.tenantsdeductible;
    }
    
    public String getcgllimit() {
        return (String) this.cgllimit.get();
    }

    public void setcgllimit(String cgllimit) {
        this.cgllimit.set(cgllimit);
    }

    public StringProperty cgllimitProperty() {
        return this.cgllimit;
    }   
    
     public String getmoneyorderslimit() {
        return (String) this.moneyorderslimit.get();
    }

    public void setmoneyorderslimit(String moneyorderslimit) {
        this.moneyorderslimit.set(moneyorderslimit);
    }

    public StringProperty moneyorderslimitProperty() {
        return this.moneyorderslimit;
    }
    
    public String getnonownedlimit() {
        return (String) this.nonownedlimit.get();
    }

    public void setnonownedlimit(String nonownedlimit) {
        this.nonownedlimit.set(nonownedlimit);
    }

    public StringProperty nonownedlimitProperty() {
        return this.nonownedlimit;
    }
    
     public String getnonowneddeductible() {
        return (String) this.nonowneddeductible.get();
    }

    public void setnonowneddeductible(String nonowneddeductible) {
        this.nonowneddeductible.set(nonowneddeductible);
    }

    public StringProperty nonowneddeductibleProperty() {
        return this.nonowneddeductible;
    }
    
    public String getcgldeductible() {
        return (String) this.cgldeductible.get();
    }

    public void setcgldeductible(String cgldeductible) {
        this.cgldeductible.set(cgldeductible);
    }

    public StringProperty cgldeductibleProperty() {
        return this.cgldeductible;
    }
    
    public String gettenantslimit() {
        return (String) this.tenantslimit.get();
    }

    public void settenantslimit(String tenantslimit) {
        this.tenantslimit.set(tenantslimit);
    }

    public StringProperty tenantslimitProperty() {
        return this.tenantslimit;
    }
    
     public String getmoneyordersdeductible() {
        return (String) this.moneyordersdeductible.get();
    }

    public void setmoneyordersdeductible(String moneyordersdeductible) {
        this.moneyordersdeductible.set(moneyordersdeductible);
    }

    public StringProperty moneyordersdeductibleProperty() {
        return this.moneyordersdeductible;
    }
    
    public String getdishonestylimit() {
        return (String) this.dishonestylimit.get();
    }

    public void setdishonestylimit(String dishonestylimit) {
        this.dishonestylimit.set(dishonestylimit);
    }

    public StringProperty dishonestylimitProperty() {
        return this.dishonestylimit;
    }
    
    public String getdishonestydeductible() {
        return (String) this.dishonestydeductible.get();
    }

    public void setdishonestydeductible(String dishonestydeductible) {
        this.dishonestydeductible.set(dishonestydeductible);
    }

    public StringProperty dishonestydeductibleProperty() {
        return this.dishonestydeductible;
    }
    
    public String getforgerydeductible() {
        return (String) this.forgerydeductible.get();
    }

    public void setforgerydeductible(String forgerydeductible) {
        this.forgerydeductible.set(forgerydeductible);
    }

    public StringProperty forgerydeductibleProperty() {
        return this.forgerydeductible;
    }
    
    
    public String getforgerylimit() {
        return (String) this.forgerylimit.get();
    }

    public void setforgerylimit(String forgerylimit) {
        this.forgerylimit.set(forgerylimit);
    }

    public StringProperty forgerylimitProperty() {
        return this.forgerylimit;
    }
    
     public String getbfmoneydeductible() {
        return (String) this.bfmoneydeductible.get();
    }

    public void setbfmoneydeductible(String bfmoneydeductible) {
        this.bfmoneydeductible.set(bfmoneydeductible);
    }

    public StringProperty bfmoneydeductibleProperty() {
        return this.bfmoneydeductible;
    }
    
     public String getoffpremisespowerdeductible() {
        return (String) this.offpremisespowerdeductible.get();
    }

    public void setoffpremisespowerdeductible(String offpremisespowerdeductible) {
        this.offpremisespowerdeductible.set(offpremisespowerdeductible);
    }

    public StringProperty offpremisespowerdeductibleProperty() {
        return this.offpremisespowerdeductible;
    }
    
    public String getinsideoutsidelimit() {
        return (String) this.insideoutsidelimit.get();
    }

    public void setinsideoutsidelimit(String insideoutsidelimit) {
        this.insideoutsidelimit.set(insideoutsidelimit);
    }

    public StringProperty insideoutsidelimitProperty() {
        return this.insideoutsidelimit;
    }
    public String getinsideoutsidedeductible() {
        return (String) this.insideoutsidedeductible.get();
    }

    public void setinsideoutsidedeductible(String insideoutsidedeductible) {
        this.insideoutsidedeductible.set(insideoutsidedeductible);
    }

    public StringProperty insideoutsidedeductibleProperty() {
        return this.insideoutsidedeductible ;
    }
    
    public String getsef96deductible() {
        return (String) this.sef96deductible.get();
    }

    public void setsef96deductible(String sef96deductible) {
        this.sef96deductible.set(sef96deductible);
    }

    public StringProperty sef96deductibleProperty() {
        return this.sef96deductible ;
    }
}
