package com.example.appexperience.controller;

import com.example.appexperience.Main;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class NovedadesController {
    public Button buttonNovedades;
    public Button buttonBusqueda;
    public void IrABusqueda (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Busqueda.fxml");
    }
    public Button buttonInicio;
    public void irAInicio (ActionEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Inicio.fxml");
    }
    public Rectangle actPlaya;
    public void irAActividad (MouseEvent event) throws IOException {
        Main HA = new Main();
        HA.changeScene("Actividad.fxml");
    }
}
