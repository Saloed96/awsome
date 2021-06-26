package com.saloed.awsome;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

@Component
public class MainController implements Initializable {

    @FXML
    public Label label;
    @FXML
    private Button button;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("location = " + location);
        System.out.println("resources.getString(\"text\") = " + resources.getString("text"));
        button.setDefaultButton(true);
        label.setLabelFor(button);
    }

    @FXML
    public void onPress() {
        label.setText("Ouuuccch! " + new Random().nextInt());
    }
}
