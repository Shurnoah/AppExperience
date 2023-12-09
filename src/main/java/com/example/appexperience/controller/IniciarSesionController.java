package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class IniciarSesionController {

    public Label labelCrearCuenta;
    public void irACrearCuenta (MouseEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("CrearUsuario.fxml");
    }
    public Button buttonLogIn;
    public TextField labelUser;
    public TextField labelPass;
    public void userLogIn (ActionEvent event) throws IOException {
        Main HA = new Main();
        if ("ADMIN".equals(labelUser.getText().toUpperCase()) && "ADMIN".equals(labelPass.getText().toUpperCase())){
            HA.changeScene("Inicio.fxml");
        } else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de inicio de sesión");
            alert.setHeaderText(null);
            alert.setContentText("Nombre de usuario o Contraseña son incorrectos.");
            alert.showAndWait();
        }
    }

}