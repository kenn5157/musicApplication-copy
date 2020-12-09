package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.*;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import javafx.scene.layout.StackPane;
import java.io.FileWriter;

import java.io.File;
import java.io.IOException;


/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage primaryStage) throws IOException {
        scene = new Scene(loadFXML("primary"), 1200, 700);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Music Application");
        //primaryStage.setResizable(false);
        primaryStage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }




    public static void newPlaylistButton() throws IOException {
        //StackPane secondaryLayout = new StackPane();
        Scene secondScene = new Scene(loadFXML("secondary"), 600, 400);

        // New window (Stage)
        Stage newWindow = new Stage();
        newWindow.setTitle("New Playlist");
        newWindow.setScene(secondScene);

        // Specifies the modality for new window.
        newWindow.initModality(Modality.APPLICATION_MODAL);

        newWindow.show();
    }




    //Menu Actions



    public static void newAppWindow() throws IOException {
        Scene newScene = new Scene(loadFXML("primary"), 1200, 700);

        Stage newWindow = new Stage();
        newWindow.setTitle("Music Application");
        newWindow.setScene(newScene);

        newWindow.show();
    }

    public static void quit() {
        System.out.println("Closing Program...");
        System.exit(0);
    }
}