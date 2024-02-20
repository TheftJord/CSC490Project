package org.example.project490;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.stage.Screen;

public class HelloApplication extends Application {
    
    private static Scene scene;
    
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("homePage-view.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Buisness Management System");
        stage.setScene(scene);
        
        //following code will find the resolution of the screen being used, and resize the GUI to match it
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX(screenBounds.getMinX());
        stage.setY(screenBounds.getMinY());
        stage.setWidth(screenBounds.getWidth());
        stage.setHeight(screenBounds.getHeight());
        //minimum resoltuion before GUI controls start overlapping
        stage.setMinHeight(650);
        stage.setMinWidth(1000);
        
        stage.show();
    }
    
    //following two functions are used by the menu buttons to change the screen to the desired GUI
    //scene has been madde a static member variable to facilitate these functions
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}