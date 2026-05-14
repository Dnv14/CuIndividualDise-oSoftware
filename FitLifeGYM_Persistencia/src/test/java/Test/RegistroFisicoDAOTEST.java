/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import Entidades.Enfermedades;
import Entidades.Lesiones;
import Entidades.NivelCondicion;
import Entidades.RegistroFisico;
import Excepciones.PersistenciaException;
import PersistenciaMongo.RegistroFisicoDAOMongo;
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
public class RegistroFisicoDAOTEST {

    private RegistroFisicoDAOMongo registroDAO;

    public RegistroFisicoDAOTEST() {
    }

    @BeforeEach()
    public void init() {
        this.registroDAO = new RegistroFisicoDAOMongo();
    }

//    @Test
//    public void crearRegistroFisicoSiFunciona() throws PersistenciaException {
//
//        String idCliente = "6a02a1b11fcda04bdaf8ac77";
//
//        List<Lesiones> misLesiones = new LinkedList<>();
//        misLesiones.add(new Lesiones("ESPALDA"));
//        misLesiones.add(new Lesiones("RODILLA"));
//
//        List<Enfermedades> misEnfermedades = new LinkedList<>();
//        misEnfermedades.add(new Enfermedades("DIABETES"));
//
//        RegistroFisico registro = new RegistroFisico();
//        registro.setIdCliente(idCliente);
//        registro.setNivelCondicion(NivelCondicion.INTERMEDIA);
//        registro.setLesiones(misLesiones);
//        registro.setEnfermedades(misEnfermedades);
//
//        assertDoesNotThrow(() -> {
//            RegistroFisico resultadoRegistro = registroDAO.guardarRegistroFisico(registro);
//
//            assertNotNull(resultadoRegistro.getId());
//            assertEquals(idCliente, resultadoRegistro.getIdCliente());
//
//            System.out.println("Registro Físico con guardado");
//
//        });
//    }

    @Test
    public void consultarElRegistroFisicoPorIdFunciona() throws PersistenciaException {
        String idCliente = "6a02a1b11fcda04bdaf8ac77";
        
        assertDoesNotThrow(() -> {
            RegistroFisico registroCosultado = registroDAO.consultarRegistroFisico(idCliente);
            assertNotNull(registroCosultado);
            assertEquals(registroCosultado.getIdCliente(), idCliente);
            
            System.out.println(registroCosultado);
        });
    }
}
