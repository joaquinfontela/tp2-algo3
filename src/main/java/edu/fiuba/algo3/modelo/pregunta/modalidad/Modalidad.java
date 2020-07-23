package edu.fiuba.algo3.modelo.pregunta.modalidad;

import edu.fiuba.algo3.modelo.pregunta.respuesta.EstadisticasRespuestas;

import java.util.ArrayList;
import java.util.HashMap;

public interface Modalidad {

    public HashMap<Integer, Integer> obtenerPuntajesPorJugador(HashMap<Integer, EstadisticasRespuestas> idsJugadores_estadisticasRespuestas);
}