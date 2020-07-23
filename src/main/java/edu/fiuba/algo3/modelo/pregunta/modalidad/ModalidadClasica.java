package edu.fiuba.algo3.modelo.pregunta.modalidad;

import edu.fiuba.algo3.modelo.pregunta.respuesta.EstadisticasRespuestas;

import java.util.HashMap;
import java.util.Map;

public class ModalidadClasica extends ModalidadConExclusividad {

    @Override
    public HashMap<Integer, Integer> obtenerPuntajesPorJugador(HashMap<Integer, EstadisticasRespuestas> idsJugadores_estadisticasRespuestas){

        //Refactorizar

        HashMap<Integer, Integer> puntajes = new HashMap<Integer, Integer>();
        for (Map.Entry<Integer, EstadisticasRespuestas> entrada : idsJugadores_estadisticasRespuestas.entrySet()) {
            EstadisticasRespuestas estadisticasActual = entrada.getValue();
            if(estadisticasActual.hayOpcionesIncorrectas() || estadisticasActual.hayOpcionesCorrectasNoElegidas()){
                puntajes.put(entrada.getKey(), 0);
            } else{
                puntajes.put(entrada.getKey(), 1);
            }
        }
        return puntajes;
    }
}
