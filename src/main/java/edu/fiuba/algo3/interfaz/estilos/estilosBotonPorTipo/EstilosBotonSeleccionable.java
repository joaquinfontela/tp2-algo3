package edu.fiuba.algo3.interfaz.estilos.estilosBotonPorTipo;

import edu.fiuba.algo3.interfaz.botones.Boton;
import edu.fiuba.algo3.interfaz.botones.tipoBoton.Seleccionable;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

public class EstilosBotonSeleccionable implements EstilosBotonPorTipo {

    protected Boton boton;
    protected Seleccionable seleccionable;

    public void aplicarEstilos(Boton unBoton) {

        boton = unBoton;
        seleccionable = (Seleccionable) boton.getTipo();

        eventoMousePasaPorArriba();
    }

    public void eventoMousePasaPorArriba() {

        final FadeTransition fadeIn = new FadeTransition(Duration.millis(100));
        fadeIn.setNode(boton);
        fadeIn.setToValue(0.8);
        boton.setOnMouseEntered(e -> {
            System.out.println("MOUSE ENTRO");
            try {
                if (!seleccionable.fueSeleccionado()) {
                    System.out.println("BOTON NO SELEC MOUSE ENTRO");
                    fadeIn.playFromStart();
                }
            } catch (Exception exception) {
                System.out.println("EXC 1");
            }
        });

        final FadeTransition fadeOut = new FadeTransition(Duration.millis(100));
        fadeOut.setNode(boton);
        fadeOut.setToValue(0.6);
        boton.setOnMouseExited(e -> {
            System.out.println("MOUSE SALIO");
            try {
                if (!seleccionable.fueSeleccionado()) {
                    System.out.println("BOTON NO SELEC MOUSE SALIO");
                    fadeOut.playFromStart();
                }
            } catch (Exception exception) {
                System.out.println("EXC 2");
            }
        });

        boton.setOpacity(0.6);
    }
}