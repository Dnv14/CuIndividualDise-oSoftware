/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import Entidades.Ejercicio;
import PersistenciaMongo.EjerciciosDAOSMongo;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego
 */
public class EjerciciosDAOSTEST {

    private EjerciciosDAOSMongo ejerciciosDAO;

    public EjerciciosDAOSTEST() {
    }

    @BeforeEach()
    public void init() {
        this.ejerciciosDAO = new EjerciciosDAOSMongo();
    }

    @Test
    public void precargarLosEjerciciosSiLosPrecarga() {
        List<Ejercicio> ejerciciosEsperados = new LinkedList<>();
        ejerciciosEsperados.add(new Ejercicio("Press de Banca"));
        ejerciciosEsperados.add(new Ejercicio("Press Militar"));
        ejerciciosEsperados.add(new Ejercicio("Sentadilla"));
        ejerciciosEsperados.add(new Ejercicio("Peso Muerto"));
        ejerciciosEsperados.add(new Ejercicio("Curl de Bicep"));
        ejerciciosEsperados.add(new Ejercicio("Curl Martillo"));
        ejerciciosEsperados.add(new Ejercicio("Extensión de Cuadriceps"));
        ejerciciosEsperados.add(new Ejercicio("Extensión de Femoral"));
        ejerciciosEsperados.add(new Ejercicio("Press Inclinado"));
        ejerciciosEsperados.add(new Ejercicio("Dominadas"));

        assertDoesNotThrow(() -> {
            List<Ejercicio> ejercicios = ejerciciosDAO.consultarTodos();

            assertEquals(ejerciciosEsperados.size(), ejercicios.size());

            for (int i = 0; i < ejercicios.size(); i++) {
                assertEquals(ejercicios.get(i).getNombre(), ejerciciosEsperados.get(i).getNombre());
            }

            for (Ejercicio e : ejercicios) {
                System.out.println(e + "\n");
            }
        });
    }
}
