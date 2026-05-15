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
import Entidades.Usuario;
import Excepciones.PersistenciaException;
import PersistenciaMongo.ClientesDAOMongo;
import PersistenciaMongo.UsuariosDAOMongo;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Diego
 */
public class ClientesDAOTEST {

    private ClientesDAOMongo clientesDAO;
    private UsuariosDAOMongo usuariosDAO;

    public ClientesDAOTEST() {
    }

    @BeforeEach()
    public void init() {
        this.clientesDAO = new ClientesDAOMongo();
        this.usuariosDAO = new UsuariosDAOMongo();
    }

    @Test
    public void agregarClienteSiFunciona() throws PersistenciaException {
        Usuario usuario = new Usuario("diego", "navarro", "diegoPro@gmail.com", "sixSeven");

        Membresia membresia = new Membresia(TipoMembresia.PLATA, 500.0);

        MembresiaComprada membresiaComprada = new MembresiaComprada(membresia, LocalDate.now(), LocalDate.now().plusMonths(1), 500.0, Estado.ACTIVO);

        assertDoesNotThrow(() -> {
            Usuario usuarioRegistrado = usuariosDAO.registrarUsuario(usuario);
            Cliente cliente = new Cliente(usuarioRegistrado.getId(), "6442262864", LocalDate.now(), membresiaComprada);
            Cliente clienteRegistrado = clientesDAO.registrarCliente(cliente);

            assertEquals(clienteRegistrado.getIdUsuario(), usuarioRegistrado.getId());
            assertEquals(clienteRegistrado.getId(), cliente.getId());
            assertEquals(usuario.getId(), usuarioRegistrado.getId());

            System.out.println(usuarioRegistrado + "\n");
            System.out.println(clienteRegistrado);

        });
    }
}
