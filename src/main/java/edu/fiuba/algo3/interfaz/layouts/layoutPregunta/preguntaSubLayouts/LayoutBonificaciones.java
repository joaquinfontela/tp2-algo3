package edu.fiuba.algo3.interfaz.layouts.layoutPregunta.preguntaSubLayouts;

import edu.fiuba.algo3.controladores.BotonSeleccionableHandler;
import edu.fiuba.algo3.interfaz.botones.botonesBonificacion.BotonExclusividad;
import edu.fiuba.algo3.interfaz.botones.botonesBonificacion.BotonMultiplicadorX2;
import edu.fiuba.algo3.interfaz.botones.botonesBonificacion.BotonMultiplicadorX3;
import edu.fiuba.algo3.interfaz.botones.ListaDeBotonesSeleccionables;
import edu.fiuba.algo3.modelo.GestorDeJuego;
import javafx.scene.layout.StackPane;

public class LayoutBonificaciones extends StackPane {

    private BotonExclusividad botonExclusividad;
    private BotonMultiplicadorX2 botonMultiplicadorX2;
    private BotonMultiplicadorX3 botonMultiplicadorX3;

    public LayoutBonificaciones(GestorDeJuego gestor) {

        botonExclusividad = new BotonExclusividad(-50,-420);
        if (!gestor.jugadorActualTieneAlgunaExclusividad() || !gestor.sePuedeUsarExclusividad()){
            botonExclusividad.setDisable(true);
        }
        botonExclusividad.setOnAction(new BotonSeleccionableHandler(botonExclusividad));
        this.getChildren().add(botonExclusividad);
        ListaDeBotonesSeleccionables lista = new ListaDeBotonesSeleccionables();
        botonMultiplicadorX2 = new BotonMultiplicadorX2(-50, -285);
        if (!gestor.jugadorActualTieneAlgunMultiplicadorX2() || gestor.sePuedeUsarExclusividad()) {
            botonMultiplicadorX2.setDisable(true);
        }
        botonMultiplicadorX2.setOnAction(new BotonSeleccionableHandler(botonMultiplicadorX2));
        lista.add(botonMultiplicadorX2);
        this.getChildren().add(botonMultiplicadorX2);
        botonMultiplicadorX3 = new BotonMultiplicadorX3(-50, -170);
        if (!gestor.jugadorActualTieneAlgunMultiplicadorX3() || gestor.sePuedeUsarExclusividad()) {
            botonMultiplicadorX3.setDisable(true);
        }
        botonMultiplicadorX3.setOnAction(new BotonSeleccionableHandler(botonMultiplicadorX3));
        lista.add(botonMultiplicadorX3);
        this.getChildren().add(botonMultiplicadorX3);
    }

    public boolean multiplicadorX2Seleccionado() {
        return botonMultiplicadorX2.fueSeleccionado();
    }

    public boolean multiplicadorX3Seleccionado() {
        return botonMultiplicadorX3.fueSeleccionado();
    }

    public boolean exclusividadSeleccionada() {
        return botonExclusividad.fueSeleccionado();
    }
}