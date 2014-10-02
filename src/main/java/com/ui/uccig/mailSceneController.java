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
import javafx.scene.web.WebView;

/**
 *
 * @author harsimransingh
 */
public class mailSceneController implements Initializable,IScreenController {
    
    @FXML
    private WebView mailwebview;
    
    private ScreenNavigator screenPage;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public WebView getWebView(){
        return mailwebview;
    }

    @Override
    public void setScreenParent(ScreenNavigator screenPage) {
        this.screenPage = screenPage;
    }
}
