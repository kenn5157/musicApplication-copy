package org.openjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class UserInputBoxController {

    @FXML
    public Button cancel;

    @FXML
    public void handleCancelButtonOnAction(ActionEvent event) {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }


    public void acceptPlaylistName(ActionEvent event) {

    }

}
