package PersistenciaConsola;

import Excepciones.PersistenciaException;
import Interfaces.IClientesDAO;
import Entidades.Cliente;
import Entidades.Estado;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.TipoMembresia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Julian
 */
public class ClientesListDAO  {

//    private static final Logger LOGGER = Logger.getLogger(ClientesListDAO.class.getName());
//    private static List<Cliente> clientes = new ArrayList<>();
//    private static long contadorID = 1;
//
//
//    public Cliente registrarCliente(Cliente cliente) throws PersistenciaException {
//        cliente.setId(String.valueOf(contadorID));
//        contadorID++;
//        this.clientes.add(cliente);
//        System.out.println("Guardando a: " + cliente.getNombre());
//        return cliente;
//    }
//
//
//    public Cliente consultarClientePorId(String id) throws PersistenciaException {
//        return this.clientes.stream()
//                .filter(m -> m.getId().equals(id))
//                .findFirst()
//                .orElse(null);
//    }
//
//  
//    public List<Cliente> consultarClientes() throws PersistenciaException {
//        return this.clientes;
//    }
//
//   
//    public Cliente buscarPorPin(String pin) throws PersistenciaException {
//        for (Cliente c : clientes) {
//            if (c.getPin().equals(pin)) {
//                return c;
//            }
//        }
//        return null;
//    }
//
// 
//    public void actualizarMembresia(String idCliente, TipoMembresia nuevaMembresia) throws PersistenciaException {
//        try {
//            Cliente cliente = consultarClientePorId(idCliente);
//            if (cliente != null) {
//                double precio;
//
//                if (nuevaMembresia == TipoMembresia.ORO) {
//                    precio = 750.0;
//                } else if (nuevaMembresia == TipoMembresia.PLATA) {
//                    precio = 500.0;
//                } else {
//                    precio = 300.0;
//                }
//
//                MembresiaComprada nuevaCompra = new MembresiaComprada(
//                        new Membresia(nuevaMembresia, precio),
//                        LocalDate.now(),
//                        LocalDate.now().plusMonths(1),
//                        precio,
//                        Estado.ACTIVO
//                );
//                cliente.setMembresiaComprada(nuevaCompra);
//            }
//        } catch (PersistenciaException ex) {
//            LOGGER.severe(ex.getMessage());
//            throw new PersistenciaException("Error al actualizar membresia", ex);
//        }
//    }
//
//    static {
//        try {
//            Membresia plan = new Membresia(TipoMembresia.ORO, 500.0, LocalDate.now().plusMonths(1));
//
//            MembresiaComprada membresiaPrueba = new MembresiaComprada(
//                    plan,
//                    LocalDate.now(),
//                    LocalDate.now().plusMonths(1),
//                    500.0,
//                    Estado.ACTIVO
//            );
//
//            MembresiaComprada membresiaPrueba2 = new MembresiaComprada(
//                    plan,
//                    LocalDate.now(),
//                    LocalDate.now().plusMonths(1),
//                    500.0,
//                    Estado.INACTIVO
//            );
//
//            Cliente clientePruebita = new Cliente(
//                    "999",
//                    "Navarro",
//                    "Software",
//                    "navarro@fitlife.com",
//                    "admin123",
//                    "6441234567",
//                    LocalDate.of(2000, 5, 20),
//                    "1234",
//                    membresiaPrueba
//            );
//
//            Cliente clientePruebita2 = new Cliente(
//                    "998",
//                    "Diego",
//                    "Navarro",
//                    "diego@fitlife.com",
//                    "admin6769",
//                    "6449876543",
//                    LocalDate.of(2000, 5, 20),
//                    "6769",
//                    membresiaPrueba2
//            );
//
//            clientes.add(clientePruebita);
//            clientes.add(clientePruebita2);
//
//        } catch (Exception e) {
//            System.err.println("Error creando sujeto de prueba: " + e.getMessage());
//        }
//    }

   
}
