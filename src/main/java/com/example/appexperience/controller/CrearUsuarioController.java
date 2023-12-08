package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class CrearUsuarioController {
    public Button buttonCrearUsuario;
    public void  irACrearUsuario(ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
}
