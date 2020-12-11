package org.openjfx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PrimaryController  implements Initializable {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void newPlaylist() throws IOException {
        App.newPlaylistButton();
        //App.playlist();

        //FileChooser fileChooser = new FileChooser();
        //fileChooser.showOpenDialog(Stage)
    }



    //Main Actions

        //Playlist Arraylist
    @FXML public ListView playlists;









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



    //Initialization
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        playlists.getItems().addAll("D.A.D.","Shinedown","3 Doors Down");
        //playlists.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }
}
