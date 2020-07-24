package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.pregunta.modalidad.ModalidadPenalidad;
import edu.fiuba.algo3.modelo.pregunta.modalidad.bonificacion.ExclusividadDePuntaje;
import edu.fiuba.algo3.modelo.pregunta.modalidad.bonificacion.Multiplicador;
import edu.fiuba.algo3.modelo.pregunta.respuesta.EstadisticasRespuestas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModalidadPenalidadTest {

    ModalidadPenalidad modalidad;
    HashMap<Integer, EstadisticasRespuestas> diccionarioIdEstadisticas;
    EstadisticasRespuestas estadisticasJugadorUno;
    EstadisticasRespuestas estadisticasJugadorDos;
    Multiplicador multiplicadorJugadorUnoX2;
    Multiplicador multiplicadorJugadorDosX3;

    @BeforeEach
    public void init(){

        modalidad = new ModalidadPenalidad();
        diccionarioIdEstadisticas = new HashMap<Integer, EstadisticasRespuestas>();
        estadisticasJugadorUno = new EstadisticasRespuestas();
        estadisticasJugadorDos = new EstadisticasRespuestas();
        multiplicadorJugadorUnoX2 = new Multiplicador(2,1);
        multiplicadorJugadorDosX3 = new Multiplicador(3,2);
    }

    @Test
    public void test01SeCreaUnaRespuestaCorrectaMultipleYOtraIncorrectaMultipleYSeVerificanLosPuntajesCorrespondientes(){

        for(int i = 0; i<3; i++){
            estadisticasJugadorUno.sumarCorrectaElegida();
            estadisticasJugadorDos.sumarIncorrectaElegida();
        }

        diccionarioIdEstadisticas.put(1, estadisticasJugadorUno);
        diccionarioIdEstadisticas.put(2, estadisticasJugadorDos);

        HashMap<Integer,Integer> puntajes = modalidad.obtenerPuntajesPorJugador(diccionarioIdEstadisticas);
        assertEquals(puntajes.get(1),3);
        assertEquals(puntajes.get(2),-3);
    }

    @Test
    public void test02SeCreaUnaRespuestaCorrectaParcialMultipleYOtraIncorrectaParcialMultipleYSeVerificanLosPuntajesCorrespondientes(){

        estadisticasJugadorUno.sumarCorrectaNoElegida();
        for(int i = 0; i<3; i++){
            estadisticasJugadorUno.sumarCorrectaElegida();
            estadisticasJugadorDos.sumarIncorrectaElegida();
        }
        estadisticasJugadorDos.sumarCorrectaElegida();

        diccionarioIdEstadisticas.put(1, estadisticasJugadorUno);
        diccionarioIdEstadisticas.put(2, estadisticasJugadorDos);

        HashMap<Integer,Integer> puntajes = modalidad.obtenerPuntajesPorJugador(diccionarioIdEstadisticas);
        assertEquals(puntajes.get(1),3);
        assertEquals(puntajes.get(2),-2);
    }

    @Test
    public void test03SeCreaUnaRespuestaCorrectaMultipleYOtraIncorrectaMultipleYSeVerificanLosPuntajesCorrespondientesConMultiplicadorX2DelJugadorUno(){

        modalidad.recibirBonificacion(multiplicadorJugadorUnoX2);

        for(int i = 0; i<3; i++){
            estadisticasJugadorUno.sumarCorrectaElegida();
            estadisticasJugadorDos.sumarIncorrectaElegida();
        }

        diccionarioIdEstadisticas.put(1, estadisticasJugadorUno);
        diccionarioIdEstadisticas.put(2, estadisticasJugadorDos);

        HashMap<Integer,Integer> puntajes = modalidad.obtenerPuntajesPorJugador(diccionarioIdEstadisticas);
        assertEquals(puntajes.get(1),6);
        assertEquals(puntajes.get(2),-3);
    }

    @Test
    public void test04SeCreaUnaRespuestaCorrectaMultipleYOtraIncorrectaMultipleYSeVerificanLosPuntajesCorrespondientesConMultiplicadorX3DelJugadorDos(){

        modalidad.recibirBonificacion(multiplicadorJugadorDosX3);

        for(int i = 0; i<3; i++){
            estadisticasJugadorUno.sumarCorrectaElegida();
            estadisticasJugadorDos.sumarIncorrectaElegida();
        }

        diccionarioIdEstadisticas.put(1, estadisticasJugadorUno);
        diccionarioIdEstadisticas.put(2, estadisticasJugadorDos);

        HashMap<Integer,Integer> puntajes = modalidad.obtenerPuntajesPorJugador(diccionarioIdEstadisticas);
        assertEquals(puntajes.get(1),3);
        assertEquals(puntajes.get(2),-9);
    }
}
