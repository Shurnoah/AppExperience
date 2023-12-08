package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class GuardadasActividadesController {
    public Button buttonBusqueda;
    public void IrABusqueda (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Busqueda.fxml");
    }
    public Button buttonNovedades;
    public void irANovedades (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Novedades.fxml");
    }

    public Button buttonInicio;
    public Button buttonInicioVolver;
    public void irAInicio (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
}
