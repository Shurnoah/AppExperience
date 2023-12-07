package com.example.appexperience.controller;

import com.example.appexperience.HelloApplication;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class VentanaInicioController {
    public Button ButtonTst;
    public void backToLog (ActionEvent event) throws IOException {
        HelloApplication HA = new HelloApplication();
        HA.changeScene("hello-view.fxml");
    }
    public Button ButtonActividadesGuardadas;
    public void irAActividadesGuardadas (ActionEvent event) throws IOException {
        HelloApplication HA = new HelloApplication();
        HA.changeScene("hello-view.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
    public Button ButtonBuscqueda;
    public void irABusqueda (ActionEvent event) throws IOException {
        HelloApplication HA = new HelloApplication();
        HA.changeScene("hello-view.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
    public Button ButtonActividadesReservadas;
    public void irAActividadesReservadas (ActionEvent event) throws IOException {
        HelloApplication HA = new HelloApplication();
        HA.changeScene("hello-view.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
    public Button ButtonNovedades;
    public void irANovedades (ActionEvent event) throws IOException {
        HelloApplication HA = new HelloApplication();
        HA.changeScene("hello-view.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
    public Label LabelNombreUser;
    public void modficadoNombreUser (ActionEvent event) throws IOException {
        HelloApplication HA = new HelloApplication();
        HA.changeScene("hello-view.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
    public Button ButtonmodificarDatos;
    public void irAModificarDatos (ActionEvent event) throws IOException {
        HelloApplication HA = new HelloApplication();
        HA.changeScene("hello-view.fxml"); //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!! //CAMBIAR!!
    }
}
