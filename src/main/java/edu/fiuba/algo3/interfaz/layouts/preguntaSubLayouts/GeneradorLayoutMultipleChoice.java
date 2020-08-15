package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcion;
import edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones.*;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;

public class GeneradorLayoutMultipleChoice implements GeneradorLayoutOpciones {

    StackPane layout;

    @Override
    public StackPane generarLayout(ArrayList<String> opciones) {

        if (opciones.size() == 2){
            layout = new DistribuidorDeDosOpciones(opciones);  // se le pasa un evento q diferencia el estilo segun el tipo de pregunta.
        } else if (opciones.size() == 3) {
            layout = new DistribuidorDeTresOpciones(opciones);
        } else if (opciones.size() == 4) {
            layout = new DistribuidorDeCuatroOpciones(opciones);
        } else if (opciones.size() == 5) {
            layout = new DistribuidorDeCincoOpciones(opciones);
        } else {
            layout = new DistribuidorDeSeisOpciones(opciones);
        }
        return layout;
    }
}