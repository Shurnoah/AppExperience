package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class IniciarSesionController {

    public Button buttonLogIn;
    public void userLogIn (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
}