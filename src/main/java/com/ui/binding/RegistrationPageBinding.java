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
public class RegistrationPageBinding {
    private StringProperty pusername;
    private StringProperty password;
    private StringProperty rpassword;
    private StringProperty email;
    private StringProperty name;
    
    public RegistrationPageBinding() {
        pusername = new SimpleStringProperty();
        password = new SimpleStringProperty();
        rpassword = new SimpleStringProperty();
        email = new SimpleStringProperty();
        name=new SimpleStringProperty();
    }

    public String getPassword() {
        return (String) this.password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public StringProperty passwordProperty() {
        return this.password;
    }
    
    public String getRPassword() {
        return (String) this.rpassword.get();
    }

    public void setRPassword(String rpassword) {
        this.rpassword.set(rpassword);
    }

    public StringProperty rpasswordProperty() {
        return this.rpassword;
    }

    public String getUsername() {
        return (String) this.pusername.get();
    }

    public void setUsername(String username) {
        this.pusername.set(username);
    }

    public StringProperty usernameProperty() {
        return this.pusername;
    }
    
     public String getEmailAddress() {
        return (String) this.email.get();
    }

    public void setEmailAddress(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return this.email;
    }
    
    public String getname() {
        return (String) this.name.get();
    }

    public void setLastname(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return this.name;
    }
}
