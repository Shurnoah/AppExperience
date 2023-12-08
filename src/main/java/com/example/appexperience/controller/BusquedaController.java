package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class BusquedaController {
    public Button buttonInicio;
    public void irAInicio(ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
    public void irAInicio(MouseEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
    public Button buttonAplicarFiltros;

    public void irAAplicarFiltros(ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("FiltrarBusqueda.fxml");
    }

    public Button buttonNovedades;

    public void irANovedades(ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Novedades.fxml");
    }
}
