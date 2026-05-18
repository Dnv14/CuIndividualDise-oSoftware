/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import Entidades.DetallesRutina;
import Entidades.EjerciciosSeleccionados;
import Entidades.EstadoRutina;
import Entidades.Rutina;
import Excepciones.PersistenciaException;
import PersistenciaMongo.RutinasDAOMongo;
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

    @Test
    public void crearRutinaSiFuncionaBien() throws PersistenciaException {

        String idCliente = "6a08d5df068c357a976a1764";

        List<DetallesRutina> listaDetalles = new LinkedList<>();

        DetallesRutina detalle1 = new DetallesRutina();
        detalle1.setPesoRecomendado(60);
        detalle1.setSeriesRecomendadas(4);
        detalle1.setRepeticionesRecomendadas(10);

        EjerciciosSeleccionados ej1 = new EjerciciosSeleccionados();
        ej1.setNombre("Press de Banca");

        List<EjerciciosSeleccionados> ejs1 = new LinkedList<>();
        ejs1.add(ej1);
        detalle1.setEjerciciosSeleccionados(ejs1);

        listaDetalles.add(detalle1);

        DetallesRutina detalle2 = new DetallesRutina();
        detalle2.setPesoRecomendado(15);
        detalle2.setSeriesRecomendadas(3);
        detalle2.setRepeticionesRecomendadas(12);

        EjerciciosSeleccionados ej2 = new EjerciciosSeleccionados();
        ej2.setNombre("Press inclinado");

        List<EjerciciosSeleccionados> ejs2 = new LinkedList<>();
        ejs2.add(ej2);
        detalle2.setEjerciciosSeleccionados(ejs2);

        listaDetalles.add(detalle2);

        DetallesRutina detalle3 = new DetallesRutina();
        detalle3.setPesoRecomendado(0);
        detalle3.setSeriesRecomendadas(4);
        detalle3.setRepeticionesRecomendadas(15);

        EjerciciosSeleccionados ej3 = new EjerciciosSeleccionados();
        ej3.setNombre("Dominadas");

        List<EjerciciosSeleccionados> ejs3 = new LinkedList<>();
        ejs3.add(ej3);
        detalle3.setEjerciciosSeleccionados(ejs3);

        listaDetalles.add(detalle3);

        Rutina rutinaLunes = new Rutina();
        rutinaLunes.setIdCliente(idCliente);
        rutinaLunes.setDiaSemana("LUNES");
        rutinaLunes.setFechaAsignada(new Date());
        rutinaLunes.setEstadoRutina(EstadoRutina.ASIGNADA);
        rutinaLunes.setDetallesRutina(listaDetalles);

        rutinaLunes.setNotas("Calentar bien manguito rotador. Controlar la bajada en los ejercicios pesados.");

        assertDoesNotThrow(() -> {
            Rutina rutinaGuardada = rutinaDAO.guardarRutina(rutinaLunes);

            assertNotNull(rutinaGuardada.getId());
            assertEquals(3, rutinaGuardada.getDetallesRutina().size());
            assertEquals("LUNES", rutinaGuardada.getDiaSemana());

            assertNotNull(rutinaGuardada.getNotas());

            System.out.println("Nota guardada: " + rutinaGuardada.getNotas());
            System.out.println(rutinaGuardada);
        });
    }
}
