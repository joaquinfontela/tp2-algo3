package edu.fiuba.algo3.interfaz.layouts.preguntaSubLayouts.distribuidoresDeOpciones;

import edu.fiuba.algo3.controladores.BotonAgrupableHandler;
import edu.fiuba.algo3.controladores.BotonOrdenableHandler;
import edu.fiuba.algo3.controladores.BotonSeleccionableHandler;
import edu.fiuba.algo3.interfaz.botones.BotonSeleccionable;
import edu.fiuba.algo3.interfaz.botones.botonesOpcion.*;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import edu.fiuba.algo3.modelo.pregunta.pregunta.EnunciadosOpciones;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaGroupChoice;
import edu.fiuba.algo3.modelo.pregunta.respuesta.RespuestaOrderedChoice;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public abstract class DistribuidorDeOpcionesGrandes extends StackPane {

    protected void agregarOpcion(String enunciado, Integer desplazamientoEnX, Integer desplazamientoEnY,
                                 Color color, GestorDeJuego gestor, EnunciadosOpciones opcionesRespuesta) {

        Button opcion;
        if (gestor.esTipoDeRespuestaComparable(RespuestaGroupChoice.class)) {
            opcion = new BotonAgrupableGrande(enunciado, desplazamientoEnX, desplazamientoEnY);
            opcionesRespuesta.agregarEnunciadoGrupoA(enunciado);
            opcion.setOnAction(new BotonAgrupableHandler((BotonAgrupable)opcion, opcionesRespuesta));
        } else if (gestor.esTipoDeRespuestaComparable(RespuestaOrderedChoice.class)) {
            opcion = new BotonOrdenableGrande(enunciado, desplazamientoEnX, desplazamientoEnY, color);
            opcionesRespuesta.agregarEnunciadoNoOrdenado(enunciado);
            opcion.setOnAction(new BotonOrdenableHandler((BotonOrdenable)opcion, opcionesRespuesta));
        } else {
            opcion = new BotonOpcionSeleccionableGrande(enunciado, desplazamientoEnX, desplazamientoEnY, color);
            opcionesRespuesta.agregarEnunciadoNoElegido(enunciado);
            opcion.setOnAction(new BotonSeleccionableHandler((BotonOpcionSeleccionable) opcion, opcionesRespuesta));
        }
        this.getChildren().add(opcion);
    }
}