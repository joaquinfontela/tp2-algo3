package edu.fiuba.algo3.controladores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonJugarHandler implements EventHandler<ActionEvent> {

    Stage stage;
    Scene proximaEscena;

    public BotonJugarHandler(Stage unStage, Scene scene) {

        stage = unStage;
        proximaEscena = scene;
    }

    @Override
    public void handle(ActionEvent event) {

        stage.setScene(proximaEscena);
    }
}