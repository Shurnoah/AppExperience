package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class OpcionesPerfilController {
    public Button buttonBusqueda;
    public void irABusqueda (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Busqueda.fxml");
    }
    public Button buttonGuardar;
    public Button buttonInicio;
    public void irAInicio (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
    public Label labelVolver;
    public void irAInicio (MouseEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
    public Button buttonNovedades;
    public void irANovedades (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Novedades.fxml");
    }
    public Button buttonIniciarSesion;
    public void irAIniciarSesion (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("IniciarSesion.fxml");
    }
    public Button buttonCrearCuenta;
    public void irACrearCuenta (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("CrearUsuario.fxml");
    }
}
