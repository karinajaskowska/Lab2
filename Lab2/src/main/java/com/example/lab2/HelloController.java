package com.example.lab2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void setWelcomeText(javafx.scene.control.Label welcomeText) {
        this.welcomeText = welcomeText;
    }
}