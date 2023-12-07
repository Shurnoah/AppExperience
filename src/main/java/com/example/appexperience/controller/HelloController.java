package com.example.appexperience.controller;

import com.example.appexperience.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    public Button buttonLogIn;
    public void userLogIn (ActionEvent event) throws IOException {
        HelloApplication HA = new HelloApplication();
        HA.changeScene("VentanaInicio.fxml");
    }
}