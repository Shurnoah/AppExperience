package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class CrearUsuarioController {
    public Label labelIniciarSesion;
    public void irAIniciarSesion (MouseEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("IniciarSesion.fxml");
    }
    public Button buttonCrearUsuario;
    public TextField labelUser;
    public TextField labelCorreo;
    public TextField labelPass;
    public TextField labelPass2;
    public void  irACrearUsuario(ActionEvent event) throws IOException {
        Main HA = new Main();
        if (labelUser.getText().isBlank() || labelCorreo.getText().isBlank() || labelPass.getText().isBlank() || labelPass2.getText().isBlank()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error en Creación de Cuenta");
            alert.setHeaderText(null);
            alert.setContentText("No puede dejar campos vacios.");
            alert.showAndWait();
        }else if (!labelPass.getText().equals(labelPass2.getText())){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error en Creación de Cuenta");
            alert.setHeaderText(null);
            alert.setContentText("Las contraseñas no coinciden.");
            alert.showAndWait();

            labelPass.setText("");
            labelPass2.setText("");
        }else {
            HA.changeScene("Inicio.fxml");
        }
    }

}
