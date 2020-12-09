package org.openjfx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.FileChooser;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void newPlaylist() throws IOException {
        App.newPlaylistButton();
        //FileChooser fileChooser = new FileChooser();
        //fileChooser.showOpenDialog(Stage)
    }




    //Menu Items

    //File Menu
    @FXML
    private void newStart() throws IOException {
        App.newAppWindow();
    }

    @FXML
    private void newQuit() {
        App.quit();
    }
}
