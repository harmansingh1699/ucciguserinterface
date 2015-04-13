package com.ui.uccig;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(final Stage stage) throws Exception {
      
        ScreenNavigator screenNavigator = new ScreenNavigator();
        //screenNavigator.loadScreen("FirstScreen", "/fxml/EnterCodeUI.fxml");
        screenNavigator.loadScreen("FirstScreen", "/fxml/LoginRegistrationSceneFXML.fxml");
        screenNavigator.loadScreen("NextScreen", "/fxml/NextScreen.fxml");
        screenNavigator.loadScreen("AutoSubmission", "/fxml/autosubmission.fxml");
        screenNavigator.loadScreen("OtherScreen", "/fxml/EnterCodeUI.fxml");
        screenNavigator.setScreen("FirstScreen");
        
        FlowPane root = new FlowPane();
        root.getChildren().addAll(screenNavigator);
        root.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });
        root.autosize();
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/calendarstyle.css");

        //stage.initStyle(StageStyle.UNDECORATED);
        stage.sizeToScene();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setTitle("UCCIG");
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{launch(args);}catch(Exception e){e.printStackTrace();}
    }

}
