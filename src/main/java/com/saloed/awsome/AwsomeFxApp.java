package com.saloed.awsome;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.util.Objects;
import java.util.ResourceBundle;

@SpringBootApplication
public class AwsomeFxApp extends Application {

    private ConfigurableApplicationContext context;
    private Parent root;

    @Override
    public void init() throws IOException {
        context = SpringApplication.run(AwsomeFxApp.class);
        var loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource("main.fxml")),
            ResourceBundle.getBundle("l10n/awesome"));
        loader.setControllerFactory(context::getBean);
        loader.setResources(ResourceBundle.getBundle("l10n/awesome"));
        root = loader.load();
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Awsome App");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();
    }

    @Override
    public void stop() {
        context.close();
        Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
