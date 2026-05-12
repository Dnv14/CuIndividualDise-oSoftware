/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import Entidades.Cliente;
import Entidades.Estado;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.TipoMembresia;
import Excepciones.PersistenciaException;
import Interfaces.IClientesDAO;
import PersistenciaMongo.ClientesDAOMongo;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.AssertionsKt.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego
 */
public class ClientesDAOTEST {

    private ClientesDAOMongo clientesDAO;

    public ClientesDAOTEST() {
    }

    @BeforeEach()
    public void init() {
        this.clientesDAO = new ClientesDAOMongo();
    }

    @Test
    public void agregarClienteSiFunciona() throws PersistenciaException {
        Cliente cliente = new Cliente();
        // Atributos de Usuario
        cliente.setNombre("Diego");
        cliente.setApellidos("Navarro");
        cliente.setCorreo("dieguitoPRo@pro.com");
        cliente.setContrasenia("contrasenia12");

        // Atributos de Cliente
        cliente.setTelefono("6441234567");
        cliente.setFechaNacimiento(LocalDate.of(2000, 1, 1));
        cliente.setPin("1234");

        // membresia
        Membresia info = new Membresia(TipoMembresia.PLATA, 500.0);
        cliente.setMembresiaComprada(new MembresiaComprada(info, LocalDate.now(), LocalDate.now().plusMonths(1), 500.0, Estado.ACTIVO));

        Cliente clienteGuardar = clientesDAO.registrarCliente(cliente);

        assertNotNull(clienteGuardar.getContrasenia());
        System.out.println("cliente guardado " + clienteGuardar);
    }
}
