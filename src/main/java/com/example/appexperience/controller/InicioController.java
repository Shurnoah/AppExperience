package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

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
    public void modficadoNombreUser (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("IniciarSesion.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
    public Button ButtonmodificarDatos;
    public void irAModificarDatos (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("IniciarSesion.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
    public Button ButtonActividadesGuardadas;
    public void irAActividadesGuardadas (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("IniciarSesion.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
    public Button ButtonActividadesReservadas;
    public void irAActividadesReservadas (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("IniciarSesion.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
}
