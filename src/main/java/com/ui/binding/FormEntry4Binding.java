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
    private StringProperty edpdeductible;
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
    private StringProperty sef94limit;
    private StringProperty sef94deductible;
    private StringProperty dandlimit;
    private StringProperty danddeductible;
    private StringProperty eandlimit;
    private StringProperty eanddeductible;
    private StringProperty employerslimit;
    private StringProperty employersdeductible;
    private StringProperty umbrellalimit;
    private StringProperty umbrelladeductible;
    private StringProperty wrapuplimit;
    private StringProperty wrapupdeductible;
    private StringProperty stdlimit;
    private StringProperty stddeductible;
    private StringProperty aclimit;
    private StringProperty acdeductible;
    private StringProperty productionmachinerylimit;
    private StringProperty productionmachinerydeductible;
    private StringProperty othercoverage1;
    private StringProperty othercoverage2;
    private StringProperty othercoverage1limit;
    private StringProperty othercoverage2limit;
    private StringProperty othercoverage1deductible;
    private StringProperty othercoverage2deductible;
    private StringProperty additionalcoverage;
    private StringProperty locationaddress;
    private StringProperty locationage;
    private StringProperty totsqfootage;
    private StringProperty insidesqfootage;
    private StringProperty noofstories;
    private StringProperty basement;
    private StringProperty wallsframe;
    private StringProperty wallshcb;
    private StringProperty wallssteel;
    private StringProperty wallsbrick;
    private StringProperty woodjoist;
    private StringProperty steeldeck;
    private StringProperty roofconcrete;
    private StringProperty roofupdated;
    private StringProperty floorsconcrete;
    private StringProperty floorswood;
    private StringProperty fagas;
    private StringProperty faoil;
    private StringProperty heatingelectric;
    private StringProperty heatingother;
    private StringProperty heatingupdated;
    private StringProperty electricalbreakers;
    private StringProperty electricalfuses;
    private StringProperty noofamps;
    private StringProperty electricalupdated;
    private StringProperty copper;
    private StringProperty pvc;           
    private StringProperty plumbingother;
    private StringProperty plumbingupdated;
    private StringProperty sprinklers;    
    private StringProperty svccontract;
    private StringProperty hydrant;
    private StringProperty firehall;
    private StringProperty unprotected;
    private StringProperty distance;
    private StringProperty alarmsystem;
    private StringProperty centralmonitored;
    private StringProperty windowbars;
    private StringProperty deadbolts;
    private StringProperty aoladdress4;
    private StringProperty autocurrentinsurer;
    private StringProperty autocurrentexpirydate;
    private StringProperty autopremiumtarget;
    private StringProperty lessholder1;
    private StringProperty autovehicle1;
    private StringProperty autovehicle2;
    private StringProperty autovehicle3;
    private StringProperty lessholder2;
    private StringProperty lessholder3;
    private StringProperty autodateofclaim1;
    private StringProperty autodateofclaim2;
    private StringProperty autodateofclaim3;
    private StringProperty autodescriptionofclaim1;
    private StringProperty autodescriptionofclaim2;
    private StringProperty autodescriptionofclaim3;
    private StringProperty commoditiestransported;
    private StringProperty liststate1;
    private StringProperty liststate2;
    private StringProperty liststate3;
    private StringProperty liststate4;
    private StringProperty usdot1;
    private StringProperty usdot2;
    private StringProperty usdot3;
    private StringProperty usdot4;
    private StringProperty docket1;
    private StringProperty docket2;
    private StringProperty docket3;
    private StringProperty docket4;
    private StringProperty typeoffiling1;
    private StringProperty typeoffiling2;
    private StringProperty typeoffiling3;
    private StringProperty typeoffiling4;
    private StringProperty namerequired1;
    private StringProperty namerequired2;
    private StringProperty namerequired3;
    private StringProperty namerequired4;
    private StringProperty nonownedliability;
    private StringProperty nonownedcontract;
    private StringProperty typeofnonowned;
    private StringProperty anytime;
    private StringProperty avgvalue;
    private StringProperty maxannually;
    private StringProperty mostexpensive;
    private StringProperty autosubmissioncomments;
    
    
    
    
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
        edpdeductible=new SimpleStringProperty();
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
        sef94limit= new SimpleStringProperty();
        sef94deductible= new SimpleStringProperty();
        dandlimit = new SimpleStringProperty();
        danddeductible = new SimpleStringProperty();
        eandlimit = new SimpleStringProperty();
        eanddeductible = new SimpleStringProperty();
        employerslimit = new SimpleStringProperty();
        employersdeductible = new SimpleStringProperty();
        umbrellalimit = new SimpleStringProperty();
        umbrelladeductible = new SimpleStringProperty();
        wrapuplimit = new SimpleStringProperty();
        wrapupdeductible = new SimpleStringProperty();
        stdlimit = new SimpleStringProperty();
        stddeductible = new SimpleStringProperty();
        aclimit = new SimpleStringProperty();
        acdeductible = new SimpleStringProperty();
        productionmachinerylimit = new SimpleStringProperty();
        productionmachinerydeductible=new SimpleStringProperty();
        othercoverage1=new SimpleStringProperty();
        othercoverage2=new SimpleStringProperty();
        othercoverage1limit=new SimpleStringProperty();
        othercoverage2limit=new SimpleStringProperty();
        othercoverage1deductible=new SimpleStringProperty();
        othercoverage2deductible=new SimpleStringProperty();
        additionalcoverage=new SimpleStringProperty();
        locationaddress = new SimpleStringProperty();
        locationage = new SimpleStringProperty();
        totsqfootage = new SimpleStringProperty();
        insidesqfootage = new SimpleStringProperty();
        noofstories = new SimpleStringProperty();
        basement = new SimpleStringProperty();
        wallsframe = new SimpleStringProperty();
        wallshcb = new SimpleStringProperty();
        wallssteel = new SimpleStringProperty();
        wallsbrick = new SimpleStringProperty();
        woodjoist = new SimpleStringProperty();
        steeldeck = new SimpleStringProperty();
        roofconcrete = new SimpleStringProperty();
        roofupdated = new SimpleStringProperty();
        floorsconcrete = new SimpleStringProperty();
        floorswood=new SimpleStringProperty();
        fagas=new SimpleStringProperty();
        faoil=new SimpleStringProperty();
        heatingelectric=new SimpleStringProperty();
        heatingother=new SimpleStringProperty();
        heatingupdated=new SimpleStringProperty();
        electricalbreakers=new SimpleStringProperty();
        electricalfuses=new SimpleStringProperty();
        noofamps=new SimpleStringProperty();
        electricalupdated=new SimpleStringProperty();
        copper=new SimpleStringProperty();
        pvc=new SimpleStringProperty();
        plumbingother=new SimpleStringProperty();
        plumbingupdated=new SimpleStringProperty();
        sprinklers=new SimpleStringProperty();
        svccontract=new SimpleStringProperty();
        hydrant=new SimpleStringProperty();
        firehall=new SimpleStringProperty();
        unprotected=new SimpleStringProperty();
        distance=new SimpleStringProperty();
        alarmsystem=new SimpleStringProperty();
        centralmonitored=new SimpleStringProperty();
        windowbars=new SimpleStringProperty();
        deadbolts=new SimpleStringProperty();
        aoladdress4=new SimpleStringProperty();
        autocurrentinsurer=new SimpleStringProperty();
        autocurrentexpirydate=new SimpleStringProperty();
        autopremiumtarget=new SimpleStringProperty();
        lessholder1=new SimpleStringProperty();
        autovehicle1=new SimpleStringProperty();
        lessholder3=new SimpleStringProperty();
        autodescriptionofclaim1=new SimpleStringProperty();
        autodescriptionofclaim2=new SimpleStringProperty();
        autodescriptionofclaim3=new SimpleStringProperty();
        commoditiestransported=new SimpleStringProperty();
        liststate1=new SimpleStringProperty();
        liststate2=new SimpleStringProperty();
        liststate3=new SimpleStringProperty();
        liststate4=new SimpleStringProperty();
        autodateofclaim1=new SimpleStringProperty();
        autodateofclaim2=new SimpleStringProperty();
        autodateofclaim3=new SimpleStringProperty();
        lessholder2=new SimpleStringProperty();
        autovehicle3= new SimpleStringProperty();
        autovehicle2= new SimpleStringProperty();
        usdot1 = new SimpleStringProperty();
        usdot2 = new SimpleStringProperty();
        usdot3 = new SimpleStringProperty();
        usdot4 = new SimpleStringProperty();
        docket1 = new SimpleStringProperty();
        docket2 = new SimpleStringProperty();
        docket3 = new SimpleStringProperty();
        docket4 = new SimpleStringProperty();
        typeoffiling1 = new SimpleStringProperty();
        typeoffiling2 = new SimpleStringProperty();
        typeoffiling3 = new SimpleStringProperty();
        typeoffiling4 = new SimpleStringProperty();
        namerequired1 = new SimpleStringProperty();
        namerequired2 = new SimpleStringProperty();
        namerequired3 = new SimpleStringProperty();
        namerequired4=new SimpleStringProperty();
        nonownedliability=new SimpleStringProperty();
        nonownedcontract=new SimpleStringProperty();
        typeofnonowned=new SimpleStringProperty();
        anytime=new SimpleStringProperty();
        avgvalue=new SimpleStringProperty();
        maxannually=new SimpleStringProperty();
        mostexpensive=new SimpleStringProperty();
        autosubmissioncomments=new SimpleStringProperty();  
    }
    
     public String getlocationaddress() {
        return (String) this.locationaddress.get();
    }

    public void setlocationaddress(String locationaddress) {
        this.locationaddress.set(locationaddress);
    }

    public StringProperty locationaddressProperty() {
        return this.locationaddress;
    }
    
    public String getlocationage() {
        return (String) this.locationage.get();
    }

    public void setlocationage(String locationage) {
        this.locationage.set(locationage);
    }

    public StringProperty locationageProperty() {
        return this.locationage;
    }
    
     public String gettotsqfootage() {
        return (String) this.totsqfootage.get();
    }

    public void settotsqfootage(String totsqfootage) {
        this.totsqfootage.set(totsqfootage);
    }

    public StringProperty totsqfootageProperty() {
        return this.totsqfootage;
    }
    
    public String getinsidesqfootage() {
        return (String) this.insidesqfootage.get();
    }

    public void setinsidesqfootage(String insidesqfootage) {
        this.insidesqfootage.set(insidesqfootage);
    }

    public StringProperty insidesqfootageProperty() {
        return this.insidesqfootage;
    }
    
    public String getnoofstories() {
        return (String) this.noofstories.get();
    }

    public void setnoofstories(String noofstories) {
        this.noofstories.set(noofstories);
    }

    public StringProperty noofstoriesProperty() {
        return this.noofstories;
    }
    
    public String getbasement() {
        return (String) this.basement.get();
    }

    public void setbasement(String basement) {
        this.basement.set(basement);
    }

    public StringProperty basementProperty() {
        return this.basement;
    }
    
    public String getwallsframe() {
        return (String) this.wallsframe.get();
    }

    public void setwallsframe(String wallsframe) {
        this.wallsframe.set(wallsframe);
    }

    public StringProperty wallsframeProperty() {
        return this.wallsframe;
    }
    
    public String getwallshcb() {
        return (String) this.wallshcb.get();
    }

    public void setwallshcb(String wallshcb) {
        this.wallshcb.set(wallshcb);
    }

    public StringProperty wallshcbProperty() {
        return this.wallshcb;
    }
    
    public String getwallssteel() {
        return (String) this.wallssteel.get();
    }

    public void setwallssteel(String wallssteel) {
        this.wallssteel.set(wallssteel);
    }

    public StringProperty wallssteelProperty() {
        return this.wallssteel;
    }
    
    public String getwallsbrick() {
        return (String) this.wallsbrick.get();
    }

    public void setwallsbrick(String wallsbrick) {
        this.wallsbrick.set(wallsbrick);
    }

    public StringProperty wallsbrickProperty() {
        return this.wallsbrick;
    }
    
    public String getwoodjoist() {
        return (String) this.woodjoist.get();
    }

    public void setwoodjoist(String woodjoist) {
        this.woodjoist.set(woodjoist);
    }

    public StringProperty woodjoistProperty() {
        return this.woodjoist;
    }
    
    public String getsteeldeck() {
        return (String) this.steeldeck.get();
    }

    public void setsteeldeck(String steeldeck) {
        this.steeldeck.set(steeldeck);
    }

    public StringProperty steeldeckProperty() {
        return this.steeldeck;
    }
    
    public String getroofconcrete() {
        return (String) this.roofconcrete.get();
    }

    public void setroofconcrete(String roofconcrete) {
        this.roofconcrete.set(roofconcrete);
    }

    public StringProperty roofconcreteProperty() {
        return this.roofconcrete;
    }
    
    public String getroofupdated() {
        return (String) this.roofupdated.get();
    }

    public void setroofupdated(String roofupdated) {
        this.roofupdated.set(roofupdated);
    }

    public StringProperty roofupdatedProperty() {
        return this.roofupdated;
    }
    
    public String getfloorsconcrete() {
        return (String) this.floorsconcrete.get();
    }

    public void setfloorsconcrete(String floorsconcrete) {
        this.floorsconcrete.set(floorsconcrete);
    }

    public StringProperty floorsconcreteProperty() {
        return this.floorsconcrete;
    }
    
    public String getfloorswood() {
        return (String) this.floorswood.get();
    }

    public void setfloorswood(String floorswood) {
        this.floorswood.set(floorswood);
    }

    public StringProperty floorswoodProperty() {
        return this.floorswood;
    }
    
    public String getfagas() {
        return (String) this.fagas.get();
    }

    public void setfagas(String fagas) {
        this.fagas.set(fagas);
    }

    public StringProperty fagasProperty() {
        return this.fagas;
    }
    
    public String getfaoil() {
        return (String) this.faoil.get();
    }

    public void setfaoil(String faoil) {
        this.faoil.set(faoil);
    }

    public StringProperty faoilProperty() {
        return this.faoil;
    }
    
     public String getheatingelectric() {
        return (String) this.heatingelectric.get();
    }

    public void setheatingelectric(String heatingelectric) {
        this.heatingelectric.set(heatingelectric);
    }

    public StringProperty heatingelectricProperty() {
        return this.heatingelectric;
    }
    
     public String getheatingother() {
        return (String) this.heatingother.get();
    }

    public void setheatingother(String heatingother) {
        this.heatingother.set(heatingother);
    }

    public StringProperty heatingotherProperty() {
        return this.heatingother;
    }
    
    public String getheatingupdated() {
        return (String) this.heatingupdated.get();
    }

    public void setheatingupdated(String heatingupdated) {
        this.heatingupdated.set(heatingupdated);
    }

    public StringProperty heatingupdatedProperty() {
        return this.heatingupdated;
    }
    
    
    public String getelectricalbreakers() {
        return (String) this.electricalbreakers.get();
    }

    public void setelectricalbreakers(String electricalbreakers) {
        this.electricalbreakers.set(electricalbreakers);
    }

    public StringProperty electricalbreakersProperty() {
        return this.electricalbreakers;
    }
    
    public String getelectricalfuses() {
        return (String) this.electricalfuses.get();
    }

    public void setelectricalfuses(String electricalfuses) {
        this.electricalfuses.set(electricalfuses);
    }

    public StringProperty electricalfusesProperty() {
        return this.electricalfuses;
    }
    
    public String getnoofamps() {
        return (String) this.noofamps.get();
    }

    public void setnoofamps(String noofamps) {
        this.noofamps.set(noofamps);
    }

    public StringProperty noofampsProperty() {
        return this.noofamps;
    }
    
    public String getelectricalupdated() {
        return (String) this.electricalupdated.get();
    }

    public void setelectricalupdated(String electricalupdated) {
        this.electricalupdated.set(electricalupdated);
    }

    public StringProperty electricalupdatedProperty() {
        return this.electricalupdated;
    }
    
    public String getcopper() {
        return (String) this.copper.get();
    }

    public void setcopper(String copper) {
        this.copper.set(copper);
    }

    public StringProperty copperProperty() {
        return this.copper;
    }
    
    public String getpvc() {
        return (String) this.pvc.get();
    }

    public void setpvc(String pvc) {
        this.pvc.set(pvc);
    }

    public StringProperty pvcProperty() {
        return this.pvc;
    }
    
    public String getplumbingother() {
        return (String) this.plumbingother.get();
    }

    public void setplumbingother(String plumbingother) {
        this.plumbingother.set(plumbingother);
    }

    public StringProperty plumbingotherProperty() {
        return this.plumbingother;
    }
    
    public String getplumbingupdated() {
        return (String) this.plumbingupdated.get();
    }

    public void setplumbingupdated(String plumbingupdated) {
        this.plumbingupdated.set(plumbingupdated);
    }

    public StringProperty plumbingupdatedProperty() {
        return this.plumbingupdated;
    }
    
    public String getsprinklers() {
        return (String) this.sprinklers.get();
    }

    public void setsprinklers(String sprinklers) {
        this.sprinklers.set(sprinklers);
    }

    public StringProperty sprinklersProperty() {
        return this.sprinklers;
    }
    
    public String getsvccontract() {
        return (String) this.svccontract.get();
    }

    public void setsvccontract(String svccontract) {
        this.svccontract.set(svccontract);
    }

    public StringProperty svccontractProperty() {
        return this.svccontract;
    }
    
    public String gethydrant() {
        return (String) this.hydrant.get();
    }

    public void sethydrant(String hydrant) {
        this.hydrant.set(hydrant);
    }

    public StringProperty hydrantProperty() {
        return this.hydrant;
    }
    
    public String getfirehall() {
        return (String) this.firehall.get();
    }

    public void setfirehall(String firehall) {
        this.firehall.set(firehall);
    }

    public StringProperty firehallProperty() {
        return this.firehall;
    }
    
    public String getunprotected() {
        return (String) this.unprotected.get();
    }

    public void setunprotected(String unprotected) {
        this.unprotected.set(unprotected);
    }

    public StringProperty unprotectedProperty() {
        return this.unprotected;
    }
    
    public String getdistance() {
        return (String) this.distance.get();
    }

    public void setdistance(String distance) {
        this.distance.set(distance);
    }

    public StringProperty distanceProperty() {
        return this.distance;
    }
    
    public String getalarmsystem() {
        return (String) this.alarmsystem.get();
    }

    public void setalarmsystem(String alarmsystem) {
        this.alarmsystem.set(alarmsystem);
    }

    public StringProperty alarmsystemProperty() {
        return this.alarmsystem;
    }
    
    public String getcentralmonitored() {
        return (String) this.centralmonitored.get();
    }

    public void setcentralmonitored(String centralmonitored) {
        this.centralmonitored.set(centralmonitored);
    }

    public StringProperty centralmonitoredProperty() {
        return this.centralmonitored;
    }
    
    public String getwindowbars() {
        return (String) this.windowbars.get();
    }

    public void setwindowbars(String windowbars) {
        this.windowbars.set(windowbars);
    }

    public StringProperty windowbarsProperty() {
        return this.windowbars;
    }
    
    public String getdeadbolts() {
        return (String) this.deadbolts.get();
    }

    public void setdeadbolts(String deadbolts) {
        this.deadbolts.set(deadbolts);
    }

    public StringProperty deadboltsProperty() {
        return this.deadbolts;
    }
    
    public String getaoladdress4() {
        return (String) this.aoladdress4.get();
    }

    public void setaoladdress4(String aoladdress4) {
        this.aoladdress4.set(aoladdress4);
    }

    public StringProperty aoladdress4Property() {
        return this.aoladdress4;
    }
    
    public String getautocurrentinsurer() {
        return (String) this.autocurrentinsurer.get();
    }

    public void setautocurrentinsurer(String autocurrentinsurer) {
        this.autocurrentinsurer.set(autocurrentinsurer);
    }

    public StringProperty autocurrentinsurerProperty() {
        return this.autocurrentinsurer;
    }
    
    public String getautovehicle1() {
        return (String) this.autovehicle1.get();
    }

    public void setautovehicle1(String autovehicle1) {
        this.autovehicle1.set(autovehicle1);
    }

    public StringProperty autovehicle1Property() {
        return this.autovehicle1;
    }
    
     public String getcommoditiestransported() {
        return (String) this.commoditiestransported.get();
    }

    public void setcommoditiestransported(String commoditiestransported) {
        this.commoditiestransported.set(commoditiestransported);
    }

    public StringProperty commoditiestransportedProperty() {
        return this.commoditiestransported;
    }
    
    public String getautodescriptionofclaim1() {
        return (String) this.autodescriptionofclaim1.get();
    }

    public void setautodescriptionofclaim1(String autodescriptionofclaim1) {
        this.autodescriptionofclaim1.set(autodescriptionofclaim1);
    }

    public StringProperty autodescriptionofclaim1Property() {
        return this.autodescriptionofclaim1;
    }   
    
     public String getlessholder3() {
        return (String) this.lessholder3.get();
    }

    public void setlessholder3(String lessholder3) {
        this.lessholder3.set(lessholder3);
    }

    public StringProperty lessholder3Property() {
        return this.lessholder3;
    }
    
    public String getliststate1() {
        return (String) this.liststate1.get();
    }

    public void setliststate1(String liststate1) {
        this.liststate1.set(liststate1);
    }

    public StringProperty liststate1Property() {
        return this.liststate1;
    }
    
     public String getliststate2() {
        return (String) this.liststate2.get();
    }

    public void setliststate2(String liststate2) {
        this.liststate2.set(liststate2);
    }

    public StringProperty liststate2Property() {
        return this.liststate2;
    }
    
    public String getliststate3() {
        return (String) this.liststate3.get();
    }

    public void setliststate3(String liststate3) {
        this.liststate3.set(liststate3);
    }

    public StringProperty liststate3Property() {
        return this.liststate3;
    }
    public String getliststate4() {
        return (String) this.liststate4.get();
    }

    public void setliststate4(String liststate4) {
        this.liststate4.set(liststate4);
    }

    public StringProperty liststate4Property() {
        return this.liststate4;
    }
    
    public String getautodescriptionofclaim2() {
        return (String) this.autodescriptionofclaim2.get();
    }

    public void setautodescriptionofclaim2(String autodescriptionofclaim2) {
        this.autodescriptionofclaim2.set(autodescriptionofclaim2);
    }

    public StringProperty autodescriptionofclaim2Property() {
        return this.autodescriptionofclaim2;
    }
    
    public String getautodescriptionofclaim3() {
        return (String) this.autodescriptionofclaim3.get();
    }

    public void setautodescriptionofclaim3(String autodescriptionofclaim3) {
        this.autodescriptionofclaim3.set(autodescriptionofclaim3);
    }

    public StringProperty autodescriptionofclaim3Property() {
        return this.autodescriptionofclaim3;
    }
    
     public String getautodateofclaim1() {
        return (String) this.autodateofclaim1.get();
    }

    public void setautodateofclaim1(String autodateofclaim1) {
        this.autodateofclaim1.set(autodateofclaim1);
    }

    public StringProperty autodateofclaim1Property() {
        return this.autodateofclaim1;
    }
    
    public String getautodateofclaim2() {
        return (String) this.autodateofclaim2.get();
    }

    public void setautodateofclaim2(String autodateofclaim2) {
        this.autodateofclaim2.set(autodateofclaim2);
    }

    public StringProperty autodateofclaim2Property() {
        return this.autodateofclaim2;
    }
    
    public String getautodateofclaim3() {
        return (String) this.autodateofclaim3.get();
    }

    public void setautodateofclaim3(String autodateofclaim3) {
        this.autodateofclaim3.set(autodateofclaim3);
    }

    public StringProperty autodateofclaim3Property() {
        return this.autodateofclaim3;
    }
    
    public String getlessholder2() {
        return (String) this.lessholder2.get();
    }

    public void setlessholder2(String lessholder2) {
        this.lessholder2.set(lessholder2);
    }

    public StringProperty lessholder2Property() {
        return this.lessholder2;
    }
    
    
    public String getautovehicle3() {
        return (String) this.autovehicle3.get();
    }

    public void setautovehicle3(String autovehicle3) {
        this.autovehicle3.set(autovehicle3);
    }

    public StringProperty autovehicle3Property() {
        return this.autovehicle3;
    }
    
     public String getautovehicle2() {
        return (String) this.autovehicle2.get();
    }

    public void setautovehicle2(String autovehicle2) {
        this.autovehicle2.set(autovehicle2);
    }

    public StringProperty autovehicle2Property() {
        return this.autovehicle2;
    }
    
     public String getautocurrentexpirydate() {
        return (String) this.autocurrentexpirydate.get();
    }

    public void setautocurrentexpirydate(String autocurrentexpirydate) {
        this.autocurrentexpirydate.set(autocurrentexpirydate);
    }

    public StringProperty autocurrentexpirydateProperty() {
        return this.autocurrentexpirydate;
    }
    
    public String getautopremiumtarget() {
        return (String) this.autopremiumtarget.get();
    }

    public void setautopremiumtarget(String autopremiumtarget) {
        this.autopremiumtarget.set(autopremiumtarget);
    }

    public StringProperty autopremiumtargetProperty() {
        return this.autopremiumtarget;
    }
    public String getlessholder1() {
        return (String) this.lessholder1.get();
    }

    public void setlessholder1(String lessholder1) {
        this.lessholder1.set(lessholder1);
    }

    public StringProperty lessholder1Property() {
        return this.lessholder1 ;
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
    public String getedpdeductible() {
        return (String) this.edpdeductible.get();
    }

    public void setedpdeductible(String edpdeductible) {
        this.edpdeductible.set(edpdeductible);
    }

    public StringProperty edpdeductibleProperty() {
        return this.edpdeductible;
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
    public String getsef96limit() {
        return (String) this.sef96limit.get();
    }

    public void setsef96limit(String sef96limit) {
        this.sef96limit.set(sef96limit);
    }

    public StringProperty sef96limitProperty() {
        return this.sef96limit;
    }
    public String getsef94limit() {
        return (String) this.sef94limit.get();
    }

    public void setsef94limit(String sef94limit) {
        this.sef94limit.set(sef94limit);
    }

    public StringProperty sef94limitProperty() {
        return this.sef94limit;
    }
    public String getsef94deductible() {
        return (String) this.sef94deductible.get();
    }

    public void setsef94deductible(String sef94deductible) {
        this.sef94deductible.set(sef94deductible);
    }

    public StringProperty sef94deductibleProperty() {
        return this.sef94deductible ;
    }
    public String getdandlimit() {
        return (String) this.dandlimit.get();
    }

    public void setdandlimit(String dandlimit) {
        this.dandlimit.set(dandlimit);
    }

    public StringProperty dandlimitProperty() {
        return this.dandlimit;
    }
    
    public String getdanddeductible() {
        return (String) this.danddeductible.get();
    }

    public void setdanddeductible(String danddeductible) {
        this.danddeductible.set(danddeductible);
    }

    public StringProperty danddeductibleProperty() {
        return this.danddeductible;
    }
    
     public String geteandlimit() {
        return (String) this.eandlimit.get();
    }

    public void seteandlimit(String eandlimit) {
        this.eandlimit.set(eandlimit);
    }

    public StringProperty eandlimitProperty() {
        return this.eandlimit;
    }
    
    public String geteanddeductible() {
        return (String) this.eanddeductible.get();
    }

    public void seteanddeductible(String eanddeductible) {
        this.eanddeductible.set(eanddeductible);
    }

    public StringProperty eanddeductibleProperty() {
        return this.eanddeductible;
    }
    
    public String getemployerslimit() {
        return (String) this.employerslimit.get();
    }

    public void setemployerslimit(String employerslimit) {
        this.employerslimit.set(employerslimit);
    }

    public StringProperty employerslimitProperty() {
        return this.employerslimit;
    }
    
    public String getemployersdeductible() {
        return (String) this.employersdeductible.get();
    }

    public void setemployersdeductible(String employersdeductible) {
        this.employersdeductible.set(employersdeductible);
    }

    public StringProperty employersdeductibleProperty() {
        return this.employersdeductible;
    }
    
    public String getumbrellalimit() {
        return (String) this.umbrellalimit.get();
    }

    public void setumbrellalimit(String umbrellalimit) {
        this.umbrellalimit.set(umbrellalimit);
    }

    public StringProperty umbrellalimitProperty() {
        return this.umbrellalimit;
    }
    
    public String getumbrelladeductible() {
        return (String) this.umbrelladeductible.get();
    }

    public void setumbrelladeductible(String umbrelladeductible) {
        this.umbrelladeductible.set(umbrelladeductible);
    }

    public StringProperty umbrelladeductibleProperty() {
        return this.umbrelladeductible;
    }
    
    public String getwrapuplimit() {
        return (String) this.wrapuplimit.get();
    }

    public void setwrapuplimit(String wrapuplimit) {
        this.wrapuplimit.set(wrapuplimit);
    }

    public StringProperty wrapuplimitProperty() {
        return this.wrapuplimit;
    }
    
    public String getwrapupdeductible() {
        return (String) this.wrapupdeductible.get();
    }

    public void setwrapupdeductible(String wrapupdeductible) {
        this.wrapupdeductible.set(wrapupdeductible);
    }

    public StringProperty wrapupdeductibleProperty() {
        return this.wrapupdeductible;
    }
    
    public String getstdlimit() {
        return (String) this.stdlimit.get();
    }

    public void setstdlimit(String stdlimit) {
        this.stdlimit.set(stdlimit);
    }

    public StringProperty stdlimitProperty() {
        return this.stdlimit;
    }
    
    public String getstddeductible() {
        return (String) this.stddeductible.get();
    }

    public void setstddeductible(String stddeductible) {
        this.stddeductible.set(stddeductible);
    }

    public StringProperty stddeductibleProperty() {
        return this.stddeductible;
    }
    
    public String getaclimit() {
        return (String) this.aclimit.get();
    }

    public void setaclimit(String aclimit) {
        this.aclimit.set(aclimit);
    }

    public StringProperty aclimitProperty() {
        return this.aclimit;
    }
    
    public String getacdeductible() {
        return (String) this.acdeductible.get();
    }

    public void setacdeductible(String acdeductible) {
        this.acdeductible.set(acdeductible);
    }

    public StringProperty acdeductibleProperty() {
        return this.acdeductible;
    }
    
    public String getproductionmachinerylimit() {
        return (String) this.productionmachinerylimit.get();
    }

    public void setproductionmachinerylimit(String productionmachinerylimit) {
        this.productionmachinerylimit.set(productionmachinerylimit);
    }

    public StringProperty productionmachinerylimitProperty() {
        return this.productionmachinerylimit;
    }
    
    public String getproductionmachinerydeductible() {
        return (String) this.productionmachinerydeductible.get();
    }

    public void setproductionmachinerydeductible(String productionmachinerydeductible) {
        this.productionmachinerydeductible.set(productionmachinerydeductible);
    }

    public StringProperty productionmachinerydeductibleProperty() {
        return this.productionmachinerydeductible;
    }
    
    public String getothercoverage1() {
        return (String) this.othercoverage1.get();
    }

    public void setothercoverage1(String othercoverage1) {
        this.othercoverage1.set(othercoverage1);
    }

    public StringProperty othercoverage1Property() {
        return this.othercoverage1;
    }
    
    public String getothercoverage2() {
        return (String) this.othercoverage2.get();
    }

    public void setothercoverage2(String othercoverage2) {
        this.othercoverage2.set(othercoverage2);
    }

    public StringProperty othercoverage2Property() {
        return this.othercoverage2;
    }
    
     public String getothercoverage1limit() {
        return (String) this.othercoverage1limit.get();
    }

    public void setothercoverage1limit(String othercoverage1limit) {
        this.othercoverage1limit.set(othercoverage1limit);
    }

    public StringProperty othercoverage1limitProperty() {
        return this.othercoverage1limit;
    }
    
     public String getothercoverage2limit() {
        return (String) this.othercoverage2limit.get();
    }

    public void setothercoverage2limit(String othercoverage2limit) {
        this.othercoverage2limit.set(othercoverage2limit);
    }

    public StringProperty othercoverage2limitProperty() {
        return this.othercoverage2limit;
    }
    
    public String getothercoverage1deductible() {
        return (String) this.othercoverage1deductible.get();
    }

    public void setothercoverage1deductible(String othercoverage1deductible) {
        this.othercoverage1deductible.set(othercoverage1deductible);
    }

    public StringProperty othercoverage1deductibleProperty() {
        return this.othercoverage1deductible;
    }
    public String getothercoverage2deductible() {
        return (String) this.othercoverage2deductible.get();
    }

    public void setothercoverage2deductible(String othercoverage2deductible) {
        this.othercoverage2deductible.set(othercoverage2deductible);
    }

    public StringProperty othercoverage2deductibleProperty() {
        return this.othercoverage2deductible;
    }
    public String getadditionalcoverage() {
        return (String) this.additionalcoverage.get();
    }

    public void setadditionalcoverage(String additionalcoverage) {
        this.additionalcoverage.set(additionalcoverage);
    }

    public StringProperty additionalcoverageProperty() {
        return this.additionalcoverage;
    }
    public String getusdot1() {
        return (String) this.usdot1.get();
    }

    public void setusdot1(String usdot1) {
        this.usdot1.set(usdot1);
    }

    public StringProperty usdot1Property() {
        return this.usdot1;
    }
    
    public String getusdot2() {
        return (String) this.usdot2.get();
    }

    public void setusdot2(String usdot2) {
        this.usdot2.set(usdot2);
    }

    public StringProperty usdot2Property() {
        return this.usdot2;
    }
    
     public String getusdot3() {
        return (String) this.usdot3.get();
    }

    public void setusdot3(String usdot3) {
        this.usdot3.set(usdot3);
    }

    public StringProperty usdot3Property() {
        return this.usdot3;
    }
    
    public String getusdot4() {
        return (String) this.usdot4.get();
    }

    public void setusdot4(String usdot4) {
        this.usdot4.set(usdot4);
    }

    public StringProperty usdot4Property() {
        return this.usdot4;
    }
    
    public String getdocket1() {
        return (String) this.docket1.get();
    }

    public void setdocket1(String docket1) {
        this.docket1.set(docket1);
    }

    public StringProperty docket1Property() {
        return this.docket1;
    }
    
    public String getdocket2() {
        return (String) this.docket2.get();
    }

    public void setdocket2(String docket2) {
        this.docket2.set(docket2);
    }

    public StringProperty docket2Property() {
        return this.docket2;
    }
    
    public String getdocket3() {
        return (String) this.docket3.get();
    }

    public void setdocket3(String docket3) {
        this.docket3.set(docket3);
    }

    public StringProperty docket3Property() {
        return this.docket3;
    }
    
    public String getdocket4() {
        return (String) this.docket4.get();
    }

    public void setdocket4(String docket4) {
        this.docket4.set(docket4);
    }

    public StringProperty docket4Property() {
        return this.docket4;
    }
    
    public String gettypeoffiling1() {
        return (String) this.typeoffiling1.get();
    }

    public void settypeoffiling1(String typeoffiling1) {
        this.typeoffiling1.set(typeoffiling1);
    }

    public StringProperty typeoffiling1Property() {
        return this.typeoffiling1;
    }
    
    public String gettypeoffiling2() {
        return (String) this.typeoffiling2.get();
    }

    public void settypeoffiling2(String typeoffiling2) {
        this.typeoffiling2.set(typeoffiling2);
    }

    public StringProperty typeoffiling2Property() {
        return this.typeoffiling2;
    }
    
    public String gettypeoffiling3() {
        return (String) this.typeoffiling3.get();
    }

    public void settypeoffiling3(String typeoffiling3) {
        this.typeoffiling3.set(typeoffiling3);
    }

    public StringProperty typeoffiling3Property() {
        return this.typeoffiling3;
    }
    
    public String gettypeoffiling4() {
        return (String) this.typeoffiling4.get();
    }

    public void settypeoffiling4(String typeoffiling4) {
        this.typeoffiling4.set(typeoffiling4);
    }

    public StringProperty typeoffiling4Property() {
        return this.typeoffiling4;
    }
    
    public String getnamerequired1() {
        return (String) this.namerequired1.get();
    }

    public void setnamerequired1(String namerequired1) {
        this.namerequired1.set(namerequired1);
    }

    public StringProperty namerequired1Property() {
        return this.namerequired1;
    }
    
    public String getnamerequired2() {
        return (String) this.namerequired2.get();
    }

    public void setnamerequired2(String namerequired2) {
        this.namerequired2.set(namerequired2);
    }

    public StringProperty namerequired2Property() {
        return this.namerequired2;
    }
    
    public String getnamerequired3() {
        return (String) this.namerequired3.get();
    }

    public void setnamerequired3(String namerequired3) {
        this.namerequired3.set(namerequired3);
    }

    public StringProperty namerequired3Property() {
        return this.namerequired3;
    }
    
    public String getnamerequired4() {
        return (String) this.namerequired4.get();
    }

    public void setnamerequired4(String namerequired4) {
        this.namerequired4.set(namerequired4);
    }

    public StringProperty namerequired4Property() {
        return this.namerequired4;
    }
    
    public String getnonownedliability() {
        return (String) this.nonownedliability.get();
    }

    public void setnonownedliability(String nonownedliability) {
        this.nonownedliability.set(nonownedliability);
    }

    public StringProperty nonownedliabilityProperty() {
        return this.nonownedliability;
    }
    
    public String getnonownedcontract() {
        return (String) this.nonownedcontract.get();
    }

    public void setnonownedcontract(String nonownedcontract) {
        this.nonownedcontract.set(nonownedcontract);
    }

    public StringProperty nonownedcontractProperty() {
        return this.nonownedcontract;
    }
    
     public String gettypeofnonowned() {
        return (String) this.typeofnonowned.get();
    }

    public void settypeofnonowned(String typeofnonowned) {
        this.typeofnonowned.set(typeofnonowned);
    }

    public StringProperty typeofnonownedProperty() {
        return this.typeofnonowned;
    }
    
     public String getanytime() {
        return (String) this.anytime.get();
    }

    public void setanytime(String anytime) {
        this.anytime.set(anytime);
    }

    public StringProperty anytimeProperty() {
        return this.anytime;
    }
    
    public String getavgvalue() {
        return (String) this.avgvalue.get();
    }

    public void setavgvalue(String avgvalue) {
        this.avgvalue.set(avgvalue);
    }

    public StringProperty avgvalueProperty() {
        return this.avgvalue;
    }
    
    
    public String getmaxannually() {
        return (String) this.maxannually.get();
    }

    public void setmaxannually(String maxannually) {
        this.maxannually.set(maxannually);
    }

    public StringProperty maxannuallyProperty() {
        return this.maxannually;
    }
    
    public String getmostexpensive() {
        return (String) this.mostexpensive.get();
    }

    public void setmostexpensive(String mostexpensive) {
        this.mostexpensive.set(mostexpensive);
    }

    public StringProperty mostexpensiveProperty() {
        return this.mostexpensive;
    }
    
    public String getautosubmissioncomments() {
        return (String) this.autosubmissioncomments.get();
    }

    public void setautosubmissioncomments(String autosubmissioncomments) {
        this.autosubmissioncomments.set(autosubmissioncomments);
    }

    public StringProperty autosubmissioncommentsProperty() {
        return this.autosubmissioncomments;
    }
}
