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
import javafx.scene.control.Hyperlink;
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
    private Hyperlink applicationid;
    @FXML
    private Label businessname;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
    public void setProducer(String producer){
        this.producer.setText(producer);
    }
    
    public void setBusinessName(String producer){
        this.businessname.setText(producer);
    }
    
     public void setDate(String producer){
        this.date.setText(producer);
    }
    
    public void setSeverity(String producer){
        this.severity.setText(producer);
    }
    
    public void setApplicationId(String producer){
        this.applicationid.setText(producer);
    }
    
    @FXML
    public void openForm(){
        ((EnterCodeUIController) (screenPage.getControlledScreen("OtherScreen"))).setApplicationId(applicationid.getText());
    }
    
    
}
