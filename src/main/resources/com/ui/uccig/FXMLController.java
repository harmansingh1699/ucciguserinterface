/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ui.uccig;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author harsimransingh
 */
public class FXMLController implements Initializable {
    @FXML
    private Font x1;
    @FXML
    private TextField keycontact;
    @FXML
    private TextField keyphone;
    @FXML
    private TextField keyemail;
    @FXML
    private TextField secondarycontact;
    @FXML
    private TextField secondaryphone;
    @FXML
    private TextField secondaryemail;
    @FXML
    private TextField businessname;
    @FXML
    private TextField mailingaddress;
    @FXML
    private TextField fax;
    @FXML
    private TextField website;
    @FXML
    private ChoiceBox<?> Nooflocations;
    @FXML
    private ChoiceBox<?> noofownedautos;
    @FXML
    private RadioButton profit;
    @FXML
    private Font x2;
    @FXML
    private RadioButton nonprofit;
    @FXML
    private ChoiceBox<?> entitytype;
    @FXML
    private TextField otherspecify;
    @FXML
    private TextField yearsinbusiness;
    @FXML
    private TextField relatedexperience;
    @FXML
    private TextField owner;
    @FXML
    private TextField bod;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitAction(ActionEvent event) {
    }
    
}
