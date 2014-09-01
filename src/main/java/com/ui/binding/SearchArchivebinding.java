/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SearchArchivebinding {
    private StringProperty searchproducerid;
    private StringProperty searchmarketerid;
    private StringProperty searchapplicationid;
    private StringProperty searchbusinessname ;
    private StringProperty searchwithusyes;
    private StringProperty searchwithusno;
    private StringProperty searchdate1;
    private StringProperty searchdate2 ;
    private StringProperty searchdate3;
    private StringProperty searchdate4;
       
    public SearchArchivebinding() {
        searchproducerid = new SimpleStringProperty();
        searchmarketerid = new SimpleStringProperty();
        searchapplicationid = new SimpleStringProperty();
        searchbusinessname  = new SimpleStringProperty();
        searchwithusyes = new SimpleStringProperty();
        searchwithusno = new SimpleStringProperty();
        searchdate1 = new SimpleStringProperty();
        searchdate2  = new SimpleStringProperty();
        searchdate3 = new SimpleStringProperty();
        searchdate4 = new SimpleStringProperty();
    }

    public String getsearchproducerid() {
        return (String) this.searchproducerid.get();
    }

    public void setsearchproducerid(String searchproducerid) {
        this.searchproducerid.set(searchproducerid);
    }

    public StringProperty searchproduceridProperty() {
        return this.searchproducerid;
    }
    
    public String getsearchmarketerid() {
        return (String) this.searchmarketerid.get();
    }

    public void setsearchmarketerid(String searchmarketerid) {
        this.searchmarketerid.set(searchmarketerid);
    }

    public StringProperty searchmarketeridProperty() {
        return this.searchmarketerid;
    }
    
     public String getsearchapplicationid() {
        return (String) this.searchapplicationid.get();
    }

    public void setsearchapplicationid(String searchapplicationid) {
        this.searchapplicationid.set(searchapplicationid);
    }

    public StringProperty searchapplicationidProperty() {
        return this.searchapplicationid;
    }
    
    public String getsearchbusinessname() {
        return (String) this.searchbusinessname.get();
    }

    public void setsearchbusinessname (String searchbusinessname ) {
        this.searchbusinessname.set(searchbusinessname );
    }

    public StringProperty searchbusinessnameProperty() {
        return this.searchbusinessname;
    }
    
    public String getsearchwithusyes() {
        return (String) this.searchwithusyes.get();
    }

    public void setsearchwithusyes(String searchwithusyes) {
        this.searchwithusyes.set(searchwithusyes);
    }

    public StringProperty searchwithusyesProperty() {
        return this.searchwithusyes;
    }
    
    public String getsearchwithusno() {
        return (String) this.searchwithusno.get();
    }

    public void setsearchwithusno(String searchwithusno) {
        this.searchwithusno.set(searchwithusno);
    }

    public StringProperty searchwithusnoProperty() {
        return this.searchwithusno;
    }
    
    public String getsearchdate1() {
        return (String) this.searchdate1.get();
    }

    public void setsearchdate1(String searchdate1) {
        this.searchdate1.set(searchdate1);
    }

    public StringProperty searchdate1Property() {
        return this.searchdate1;
    }
    
    public String getsearchdate2 () {
        return (String) this.searchdate2.get();
    }

    public void setsearchdate2(String searchdate2) {
        this.searchdate2.set(searchdate2);
    }

    public StringProperty searchdate2Property() {
        return this.searchdate2;
    }
    
    public String getsearchdate3() {
        return (String) this.searchdate3.get();
    }

    public void setsearchdate3(String searchdate3) {
        this.searchdate3.set(searchdate3);
    }

    public StringProperty searchdate3Property() {
        return this.searchdate3;
    }
    
    public String getsearchdate4() {
        return (String) this.searchdate4.get();
    }

    public void setsearchdate4(String searchdate4) {
        this.searchdate4.set(searchdate4);
    }

    public StringProperty searchdate4Property() {
        return this.searchdate4;
    }
}
