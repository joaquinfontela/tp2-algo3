package edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion;

import edu.fiuba.algo3.interfaz.botones.Boton;
import edu.fiuba.algo3.interfaz.estilos.EstilosBoton;
import javafx.geometry.Insets;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public abstract class EstilosBotonOpcion extends EstilosBoton {

    public EstilosBotonOpcion(Boton manejadorDeBoton, Color color) {
        super(manejadorDeBoton);
        boton.setStyle("-fx-border-color: black; -fx-border-width: 2px");

        boton.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        boton.setTextFill(Color.WHITE);
    }
}