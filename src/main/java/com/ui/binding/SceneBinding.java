/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.binding;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class SceneBinding {
    private StringProperty date;
    private StringProperty severity;
    private StringProperty producer;
    private StringProperty applicationid ;
    private StringProperty businessname;
   
    
    public SceneBinding() {
        date = new SimpleStringProperty();
        severity = new SimpleStringProperty();
        producer = new SimpleStringProperty();
        applicationid  = new SimpleStringProperty();
        businessname = new SimpleStringProperty();
    }

    
    
    public String getdate() {
        return (String) this.date.get();
    }

    public void setdate(String date) {
        this.date.set(date);
    }

    public StringProperty dateProperty() {
        return this.date;
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
    
     public String getproducer() {
        return (String) this.producer.get();
    }

    public void setproducer(String producer) {
        this.producer.set(producer);
    }

    public StringProperty producerProperty() {
        return this.producer;
    }
    
    public String getapplicationid() {
        return (String) this.applicationid.get();
    }

    public void setapplicationid (String applicationid ) {
        this.applicationid.set(applicationid );
    }

    public StringProperty applicationidProperty() {
        return this.applicationid;
    }
    
    public String getbusinessname() {
        return (String) this.businessname.get();
    }

    public void setbusinessname(String businessname) {
        this.businessname.set(businessname);
    }

    public StringProperty businessnameProperty() {
        return this.businessname;
    }
}
