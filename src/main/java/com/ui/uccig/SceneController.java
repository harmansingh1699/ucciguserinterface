/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 *
 * @author harsimransingh
 */
public class SceneController implements Initializable {

    private ScreenNavigator screenPage;
    @FXML
    private Label date;
    @FXML
    private Label severity;
    @FXML
    private Label producer;
    @FXML
    private Label applicationid;
    @FXML
    private Label businessname;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
    public void setProducer(String producer){
        this.producer.setText(producer);
    }
    
    public void setBusinessName(String producer){
        this.producer.setText(producer);
    }
    
    
}
