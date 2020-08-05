package edu.fiuba.algo3.interfaz.layouts.distribuidoresDeOpciones;

import javafx.scene.layout.StackPane;

import java.util.ArrayList;

public class DistribuidorDeSeisOpciones extends DistribuidorDeOpciones {

    public StackPane getLayout(ArrayList<String> opciones) {

        agregarOpcion(opciones.get(0), -400, -200);
        agregarOpcion(opciones.get(1), 400, -200);
        agregarOpcion(opciones.get(2), -400, -50);
        agregarOpcion(opciones.get(3), 400, -50);
        agregarOpcion(opciones.get(4), 0, -50);
        agregarOpcion(opciones.get(5), 0, -200);
        return layout;
    }
}