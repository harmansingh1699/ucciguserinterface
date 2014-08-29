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
public class LoginSceneBinding {
    private StringProperty username;
    private StringProperty password;

    public LoginSceneBinding() {
        username = new SimpleStringProperty();
        password = new SimpleStringProperty();
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

    public String getUsername() {
        return (String) this.username.get();
    }

    public void setUsername(String username) {
        this.username.set(username);
    }

    public StringProperty usernameProperty() {
        return this.username;
    }
}
