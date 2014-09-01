/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ApplicationPage {
    private StringProperty title;
    private StringProperty pname;
    private StringProperty mname;
    private StringProperty type ;
    private StringProperty category;
    private StringProperty submissiondate;
    private StringProperty severity;
    private StringProperty branch ;
    private StringProperty withus;
    
    public ApplicationPage() {
        title = new SimpleStringProperty();
        pname = new SimpleStringProperty();
        mname = new SimpleStringProperty();
        type  = new SimpleStringProperty();
        category = new SimpleStringProperty();
        submissiondate = new SimpleStringProperty();
        severity = new SimpleStringProperty();
        branch  = new SimpleStringProperty();
        withus = new SimpleStringProperty();
    }

    public String gettitle() {
        return (String) this.title.get();
    }

    public void settitle(String title) {
        this.title.set(title);
    }

    public StringProperty titleProperty() {
        return this.title;
    }
    
    public String getpname() {
        return (String) this.pname.get();
    }

    public void setpname(String pname) {
        this.pname.set(pname);
    }

    public StringProperty pnameProperty() {
        return this.pname;
    }
    
     public String getmname() {
        return (String) this.mname.get();
    }

    public void setmname(String mname) {
        this.mname.set(mname);
    }

    public StringProperty mnameProperty() {
        return this.mname;
    }
    
    public String gettype() {
        return (String) this.type.get();
    }

    public void settype (String type ) {
        this.type.set(type );
    }

    public StringProperty typeProperty() {
        return this.type;
    }
    
    public String getcategory() {
        return (String) this.category.get();
    }

    public void setcategory(String category) {
        this.category.set(category);
    }

    public StringProperty categoryProperty() {
        return this.category;
    }
    
    public String getsubmissiondate() {
        return (String) this.submissiondate.get();
    }

    public void setsubmissiondate(String submissiondate) {
        this.submissiondate.set(submissiondate);
    }

    public StringProperty submissiondateProperty() {
        return this.submissiondate;
    }
    
    public String getseverity() {
        return (String) this.severity.get();
    }

    public void setseverity(String severity) {
        this.severity.set(severity);
    }

    public StringProperty severityProperty() {
        return this.severity;
    }
    
    public String getbranch () {
        return (String) this.branch.get();
    }

    public void setbranch(String branch) {
        this.branch.set(branch);
    }

    public StringProperty branchProperty() {
        return this.branch;
    }
    
    public String getwithus() {
        return (String) this.withus.get();
    }

    public void setwithus(String withus) {
        this.withus.set(withus);
    }

    public StringProperty withusProperty() {
        return this.withus;
    }
}
