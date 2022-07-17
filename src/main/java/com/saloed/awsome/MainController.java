package com.saloed.awsome;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

@Component
@NoArgsConstructor
public class MainController implements Initializable {

    @FXML public Label label;
    @FXML private Button button;
    @Autowired private MainService mainService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("location = " + location);
        System.out.println("resources.getString(\"text\") = " + resources.getString("text"));
        button.setDefaultButton(true);
        label.setLabelFor(button);
    }

    @FXML
    public void onPress() {
        mainService.callButton();
        label.setText("Ouuuccch! " + new Random().nextInt());
    }
}
