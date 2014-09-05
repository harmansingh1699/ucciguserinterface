/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.uccig;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/**
 *
 * @author harsimransingh
 */
public class dynamicloading extends Pane {

    private SceneController controller = null;

    public dynamicloading(ScreenNavigator screenNavigator) throws Exception {
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("/fxml/Scene.fxml"));
        Parent loadScreen = (Parent) myLoader.load();
        controller
                = ((SceneController) myLoader.getController());
        controller.setScreenNavigator(screenNavigator);
        // Parent root = FXMLLoader.load(getClass().getResource();
        this.getChildren().add(loadScreen);
    }

    public SceneController getController() {
        return controller;
    }
}
