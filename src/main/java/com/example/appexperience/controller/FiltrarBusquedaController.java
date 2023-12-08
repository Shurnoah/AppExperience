package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class FiltrarBusquedaController {
    public Button buttonNovedades;
    public void irANovedades(ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Novedades.fxml");
    }
    public Button buttonBusqueda;
    public Button buttonBusquedaVolver;
    public Button buttonBusquedaIcono;
    public void irABusqueda(ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Busqueda.fxml");
    }
    public Button buttonGuardarPreferencias;
    public Button buttonInicio;
    public void irAInicio(ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
}
