package edu.fiuba.algo3.interfaz.estilos.estilosBotonOpcion;

import edu.fiuba.algo3.interfaz.botones.Boton;
import edu.fiuba.algo3.interfaz.botones.tipoBoton.TipoBoton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class EstilosBotonOpcionGrande extends EstilosBotonOpcion {

    public EstilosBotonOpcionGrande(Boton unBoton, Color color, TipoBoton tipoBoton) {

        super(unBoton, color, tipoBoton);

        boton.setFont(new Font("FreeSans", 25));
        boton.setPrefSize(390, 180);
    }
}