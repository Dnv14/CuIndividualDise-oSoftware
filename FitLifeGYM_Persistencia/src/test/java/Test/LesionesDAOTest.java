/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import Entidades.Lesiones;
import PersistenciaMongo.LesionesDAOMongo;
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
public class LesionesDAOTest {

    private LesionesDAOMongo lesionesDAO;

    public LesionesDAOTest() {
    }

    @BeforeEach()
    public void init() {
        this.lesionesDAO = new LesionesDAOMongo();
    }

    @Test
    public void precargarLesioneSiLasPrecarga() {
        List<Lesiones> lesionesEsperadas = new LinkedList<>();
        lesionesEsperadas.add(new Lesiones("Hernia Discal"));
        lesionesEsperadas.add(new Lesiones("Desgarre en Manguito Rotador"));
        lesionesEsperadas.add(new Lesiones("Esguince de Tobillo"));
        lesionesEsperadas.add(new Lesiones("Artrosis de Rodilla"));
        lesionesEsperadas.add(new Lesiones("Rotura de Algún Ligamento"));

        assertDoesNotThrow(() -> {
            List<Lesiones> lesiones = lesionesDAO.consultarTodos();

            assertEquals(lesionesEsperadas.size(), lesiones.size());

            for (int i = 0; i < lesiones.size(); i++) {
                assertEquals(lesiones.get(i).getNombre(), lesionesEsperadas.get(i).getNombre());
            }

            for (Lesiones e : lesiones) {
                System.out.println(e + "\n");
            }
        });

    }

}
