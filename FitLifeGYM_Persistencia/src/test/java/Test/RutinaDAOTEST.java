/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import Entidades.DetallesRutina;
import Entidades.EstadoRutina;
import Entidades.Rutina;
import Excepciones.PersistenciaException;
import PersistenciaMongo.RutinasDAOMongo;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego
 */
public class RutinaDAOTEST {

    private RutinasDAOMongo rutinaDAO;

    public RutinaDAOTEST() {
    }

    @BeforeEach()
    public void init() {
        this.rutinaDAO = new RutinasDAOMongo();
    }

//    @Test
//    public void crearRutinaSiFuncionaBien() throws PersistenciaException {
//
//        String idCliente = "6a02a1b11fcda04bdaf8ac77";
//
//        List<DetallesRutina> rutinaDetalles = new LinkedList<>();
//
//        DetallesRutina ejercicio1 = new DetallesRutina();
//        ejercicio1.setNombreEjercicio("Press de Banca");
//        ejercicio1.setPesoRecomendado(60);
//        ejercicio1.setSeriesRecomendadas(4);
//        ejercicio1.setRepeticionesRecomendadas(10);
//        rutinaDetalles.add(ejercicio1);
//
//        DetallesRutina ejercicio2 = new DetallesRutina();
//        ejercicio2.setNombreEjercicio("Press inclinado");
//        ejercicio2.setPesoRecomendado(15);
//        ejercicio2.setSeriesRecomendadas(3);
//        ejercicio2.setRepeticionesRecomendadas(12);
//        rutinaDetalles.add(ejercicio2);
//
//        DetallesRutina ejercicio3 = new DetallesRutina();
//        ejercicio3.setNombreEjercicio("Dominadas");
//        ejercicio3.setPesoRecomendado(0);
//        ejercicio3.setSeriesRecomendadas(4);
//        ejercicio3.setRepeticionesRecomendadas(15);
//        rutinaDetalles.add(ejercicio3);
//
//        Rutina rutinaLunes = new Rutina();
//        rutinaLunes.setIdCliente(idCliente);
//        rutinaLunes.setDiaSemana("LUNES");
//        rutinaLunes.setFechaAsignada(new Date());
//        rutinaLunes.setEstadoRutina(EstadoRutina.ASIGNADA);
//        rutinaLunes.setDetallesRutina(rutinaDetalles);
//
//        assertDoesNotThrow(() -> {
//
//            Rutina rutinaGuardada = rutinaDAO.guardarRutina(rutinaLunes);
//
//            assertNotNull(rutinaGuardada.getId());
//            assertEquals(3, rutinaGuardada.getDetallesRutina().size());
//            assertEquals("LUNES", rutinaGuardada.getDiaSemana());
//
//            System.out.println(rutinaGuardada);
//
//        });
//    }
}
