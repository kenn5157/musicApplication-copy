package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.*;
import javafx.stage.FileChooser;
import javafx.stage.Window;
import javafx.scene.layout.StackPane;
import javafx.scene.*;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;


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
        primaryStage.setResizable(false);
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



    //User creates new playlist
    public static void newPlaylistButton() throws IOException {
        Scene scene = new Scene(loadFXML("UserInputBox"), 310, 50);
        Stage newWindow = new Stage();
        newWindow.setTitle("Create New Playlist");
        newWindow.setScene(scene);
        newWindow.initModality(Modality.APPLICATION_MODAL);
        newWindow.show();
    }




    //Main Actions

        //Creates new playlist
    public static void createPlaylist() throws IOException {
        Scene newScene = new Scene(loadFXML("userInputBox"),150, 50);
        Stage newWindow = new Stage();
        newWindow.setTitle("Name For New Playlist");
        newWindow.setScene(newScene);
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

    //Creates playlist
    public static void playlist() {
        ArrayList playlist = new ArrayList();

        playlist.add("3 Doors Down");

        for (int i = 0; i < playlist.size();i++) {
            System.out.println(playlist.get(i));

        }
        playlist.addAll(Collections.singleton("Hi"));
    }

    public static void addToPlaylist() {

    }
}