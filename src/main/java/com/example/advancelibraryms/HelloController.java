package com.example.advancelibraryms;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label hamdard;

    @FXML
    protected void Hamdard()
    {
        hamdard.setText("Hi this is Hamdullah Hamdard");
    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Helloooo this is hamdullah hamdard");
    }
}