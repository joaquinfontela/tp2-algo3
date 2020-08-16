package edu.fiuba.algo3.interfaz.botones.botonesComunes;

import edu.fiuba.algo3.interfaz.botones.Boton;
import edu.fiuba.algo3.interfaz.estilos.estilosBotonesComunes.EstilosBotonPuntajesParciales;
import javafx.scene.control.Button;

public class BotonPuntajesParciales extends BotonComun {

    public BotonPuntajesParciales() {

        this.setSkin(new EstilosBotonPuntajesParciales(this));
    }
}