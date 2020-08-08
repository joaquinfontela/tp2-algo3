package edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EstilosBotonOpcionChico extends EstilosBotonOpcion {

    public EstilosBotonOpcionChico(Button opcion, Color color) {

        super(opcion, color);

        opcion.setFont(new Font("FreeSans", 55));
        opcion.setPrefSize(450, 100);
    }
}
