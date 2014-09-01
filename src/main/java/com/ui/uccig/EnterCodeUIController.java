/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import com.rav.insurance.insuranceformoperations.webservice.contracts.GetInsuranceFormResponse;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.animation.TranslateTransitionBuilder;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author ravjotsingh
 */
public class EnterCodeUIController implements Initializable, IScreenController {

    private ScreenNavigator screenPage;
    ArrayList<String> str=new ArrayList<String>();
    List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
    private GetInsuranceFormResponse form;
    
    @FXML
    private Pane searcharchive2;
    
    @FXML
    private Pane searcharchive;
    @FXML
    private Pane fullScreenPane;
    @FXML
    private GridPane gridpane;
   
    

    

     /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        str.add("Ravjot");
        str.add("Chani");
        str.add("Herman");
        str.add("YoYo"); 
        str.add("Ravjot");
        str.add("Chani");
        str.add("Herman");
        str.add("YoYo"); 
            }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }
@FXML
    public void submitAction1() throws Exception {
        int j=0;
        for(int i =0;i<str.size();i++)
        { System.out.println(str.size());
        
           // gridpane.getChildren().add(new dynamicloading());
        dynamicloading dl = new dynamicloading();
        dl.getController().setProducer(str.get(i));
        if(i%4==0&&i>0)
        {j++;
        }gridpane.add(dl, i%4, j);
        }
        animatedMovement(-1269, 0);    
        }
    @FXML
    public void submitAction3() {
        animatedMovement(0, -715);
        searcharchive.setVisible(true);
        searcharchive2.setVisible(false);
        }
    
     @FXML
    public void submitAction4() {
        animatedMovement(-1269, -715);
        }
     @FXML
    public void submitAction5() {
        searcharchive.setVisible(false);
        searcharchive2.setVisible(true);
        }
     @FXML
    public void submitAction10() {
        NextScreenController controller = (NextScreenController)screenPage.getControlledScreen("NextScreen");
        controller.viewApplication(form);
    }
    
    
    public void animatedMovement(int x, int y) {
        TranslateTransition animatedMove = TranslateTransitionBuilder.
                create().
                toX(x).
                toY(y).
                duration(Duration.seconds(0.5)).
                node(fullScreenPane).
                build();
                animatedMove.play();
    }

    
}
