package com.billy.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DemoMainController {
    @FXML
    public TextField txtInput;
    @FXML
    public Label lblOutput;

    @FXML
    public void sendQueryAction(ActionEvent actionEvent) {
        if (!txtInput.getText().trim().isEmpty()) {
            lblOutput.setText(txtInput.getText().trim());
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill input");
            alert.showAndWait();
        }
    }
}
