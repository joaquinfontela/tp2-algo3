package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.generadoresDeLayouts;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcion;
import edu.fiuba.algo3.interfaz.botones.tipoBoton.Seleccionable;
import edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones.*;
import javafx.scene.layout.StackPane;

import java.util.ArrayList;

public class GeneradorLayoutMultipleChoice implements GeneradorLayoutOpciones {

    DistribuidorDeOpciones layout;

    @Override
    public StackPane generarLayout(ArrayList<String> opciones) {

        Class tipoSeleccionable = Seleccionable.class;

        if (opciones.size() == 2){
            layout = new DistribuidorDeDosOpciones(opciones, tipoSeleccionable);
        } else if (opciones.size() == 3) {
            layout = new DistribuidorDeTresOpciones(opciones, tipoSeleccionable);
        } else if (opciones.size() == 4) {
            layout = new DistribuidorDeCuatroOpciones(opciones, tipoSeleccionable);
        } else if (opciones.size() == 5) {
            layout = new DistribuidorDeCincoOpciones(opciones, tipoSeleccionable);
        } else {
            layout = new DistribuidorDeSeisOpciones(opciones, tipoSeleccionable);
        }
        return layout;
    }

    @Override
    public ArrayList<BotonOpcion> obtenerBotones() {

        return layout.obtenerBotones();
    }
}