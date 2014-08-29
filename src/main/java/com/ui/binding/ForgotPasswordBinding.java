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
public class ForgotPasswordBinding {
    private StringProperty forgotPasswordEmailAddressField;
    private StringProperty forgotPasswordPassCodeField;
    private StringProperty forgotPasswordPasswordField;
    private StringProperty forgotPasswordRePasswordField;
    

    public ForgotPasswordBinding() {
        forgotPasswordEmailAddressField = new SimpleStringProperty(); 
        forgotPasswordPassCodeField = new SimpleStringProperty(); 
        forgotPasswordPasswordField = new SimpleStringProperty(); 
        forgotPasswordRePasswordField = new SimpleStringProperty(); 
    }

    public String getForgotPasswordEmailAddressField() {
        return (String) this.forgotPasswordEmailAddressField.get();
    }

    public void setForgotPasswordEmailAddressField(String forgotPasswordEmailAddressField) {
        this.forgotPasswordEmailAddressField.set(forgotPasswordEmailAddressField);
    }

    public StringProperty forgotPasswordEmailAddressFieldProperty() {
        return this.forgotPasswordEmailAddressField;
    }
    
    public String getforgotPasswordPassCodeField() {
        return (String) this.forgotPasswordPassCodeField.get();
    }

    public void setforgotPasswordPassCodeField(String forgotPasswordPassCodeField) {
        this.forgotPasswordPassCodeField.set(forgotPasswordPassCodeField);
    }

    public StringProperty forgotPasswordPassCodeFieldProperty() {
        return this.forgotPasswordPassCodeField;
    }
    
    public String getforgotPasswordPasswordField() {
        return (String) this.forgotPasswordPasswordField.get();
    }

    public void setforgotPasswordPasswordField(String forgotPasswordPasswordField) {
        this.forgotPasswordPasswordField.set(forgotPasswordPasswordField);
    }

    public StringProperty forgotPasswordPasswordFieldProperty() {
        return this.forgotPasswordPasswordField;
    }
    
    public String getforgotPasswordRePasswordField() {
        return (String) this.forgotPasswordRePasswordField.get();
    }

    public void setforgotPasswordRePasswordField(String forgotPasswordRePasswordField) {
        this.forgotPasswordRePasswordField.set(forgotPasswordRePasswordField);
    }

    public StringProperty forgotPasswordRePasswordFieldProperty() {
        return this.forgotPasswordRePasswordField;
    }

    
}
