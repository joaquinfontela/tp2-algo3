package edu.fiuba.algo3.interfaz.layouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcion;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcionChico;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.BotonOpcionGrande;
import javafx.scene.paint.Color;

public abstract class DistribuidorDeOpcionesGrandes implements DistribuidorDeOpciones {

    @Override
    public void agregarOpcion(String enunciado, Integer desplazamientoEnX, Integer desplazamientoEnY, Color color) {

        BotonOpcion opcion = new BotonOpcionGrande(enunciado, desplazamientoEnX, desplazamientoEnY, color);
        layout.getChildren().add(opcion.getBoton());
    }
}
