package com.saloed.awsome;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    public Label label;
    @FXML
    private Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("location = " + location);
        System.out.println("resources.getString(\"text\") = " + resources.getString("text"));
        label.setLabelFor(button);

    }

    @FXML
    public void onPress() {
        System.out.println("Ouuuccch!");
        button.setDefaultButton(true);
    }
}
