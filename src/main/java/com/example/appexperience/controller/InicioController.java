package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class InicioController {
    public Button ButtonTst;
    public void backToLog (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("IniciarSesion.fxml"); /////////////////////////////////////////////Eliminar
    }
    public Button ButtonBuscqueda;
    public void irABusqueda (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Busqueda.fxml");
    }
    public Button ButtonNovedades;
    public void irANovedades (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Novedades.fxml");
    }
    public Label LabelNombreUser;
    public void modficadoNombreUser (MouseEvent event) throws IOException {
//        LabelNombreUser.setStyle("-fx-text-fill: blue; -fx-underline: true;");
        Main HA = new Main();
        HA.changeScene("OpcionesPerfil.fxml");
    }
    public Button ButtonmodificarDatos;
    public void irAModificarDatos (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Preferencias.fxml");
    }
    public Button ButtonActividadesGuardadas;
    public void irAActividadesGuardadas (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("GuardadasActividades.fxml");
    }
    public Button ButtonActividadesReservadas;
    public void irAActividadesReservadas (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("ReservadasActividades.fxml");
    }
}
