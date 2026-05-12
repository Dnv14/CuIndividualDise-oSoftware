/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import Entidades.Ejercicio;
import Entidades.Enfermedades;
import PersistenciaMongo.EnfermedadesDAOMongo;
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
public class EnfermedadesDAOTest {

    private EnfermedadesDAOMongo enfermedadesDAO;

    public EnfermedadesDAOTest() {
    }

    @BeforeEach()
    public void init() {
        this.enfermedadesDAO = new EnfermedadesDAOMongo();
    }

    @Test
    public void precargarEnfermedadesSiLasPrecarga() {
        List<Enfermedades> enfermedadesEsperadas = new LinkedList<>();
        enfermedadesEsperadas.add(new Enfermedades("Hipertensión"));
        enfermedadesEsperadas.add(new Enfermedades("Diabetes"));
        enfermedadesEsperadas.add(new Enfermedades("Asma"));
        enfermedadesEsperadas.add(new Enfermedades("Taquicardia"));
        enfermedadesEsperadas.add(new Enfermedades("Hipotiroidismo"));

        assertDoesNotThrow(() -> {
            List<Enfermedades> enfermedades = enfermedadesDAO.consultarTodos();

            assertEquals(enfermedadesEsperadas.size(), enfermedades.size());

            for (int i = 0; i < enfermedades.size(); i++) {
                assertEquals(enfermedades.get(i).getNombre(), enfermedadesEsperadas.get(i).getNombre());
            }

            for (Enfermedades e : enfermedades) {
                System.out.println(e + "\n");
            }
        });
    }
}
