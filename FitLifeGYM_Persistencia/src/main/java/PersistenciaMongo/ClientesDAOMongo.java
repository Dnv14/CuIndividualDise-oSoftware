/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Cliente;
import Entidades.Estado;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.TipoMembresia;
import Excepciones.PersistenciaException;
import Interfaces.IClientesDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.set;
import com.mongodb.client.result.UpdateResult;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Diego
 */
public class ClientesDAOMongo implements IClientesDAO {

    private static final String NOMBRE_COLECCION = "clientes";

    @Override
    public Cliente registrarCliente(Cliente cliente) throws PersistenciaException {

        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Cliente> coleccionClientes = db.getCollection(NOMBRE_COLECCION, Cliente.class);

            if (cliente.getMembresiaComprada() == null) {
                cliente.setMembresiaComprada(null);
            }

            coleccionClientes.insertOne(cliente);

            return cliente;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al registrar Cliente");
        }
    }

    @Override
    public Cliente consultarClientePorId(String _id) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Cliente> coleccionClientes = db.getCollection(NOMBRE_COLECCION, Cliente.class);

            Cliente cliente = coleccionClientes.find(eq("_id", new ObjectId(_id))).first();

            return cliente;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar el cliente por id");
        }
    }

    @Override
    public List<Cliente> consultarClientes() throws PersistenciaException {
        List<Cliente> clientes = new LinkedList<>();

        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Cliente> coleccionClientes = db.getCollection(NOMBRE_COLECCION, Cliente.class);

            coleccionClientes.find().into(clientes);
            return clientes;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar los clientes");
        }
    }

    @Override
    public Cliente buscarPorPin(String pin) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Cliente> coleccionClientes = db.getCollection(NOMBRE_COLECCION, Cliente.class);

            Cliente cliente = coleccionClientes.find(eq("pin", pin)).first();

            return cliente;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar el cliente por su pin");
        }
    }

    @Override
    public void actualizarMembresia(String idCliente, TipoMembresia nuevaMembresia) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            if (idCliente == null || idCliente.trim().isEmpty()) {
                throw new PersistenciaException("El ID del cliente no puede estar vacío.");
            }
            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Cliente> coleccionClientes = db.getCollection(NOMBRE_COLECCION, Cliente.class);

            Cliente cliente = consultarClientePorId(idCliente);

            if (cliente != null) {
                double precio;

                if (nuevaMembresia == TipoMembresia.ORO) {
                    precio = 750.0;
                } else if (nuevaMembresia == TipoMembresia.PLATA) {
                    precio = 500.0;
                } else {
                    precio = 300.0;
                }
                MembresiaComprada nuevaCompra = new MembresiaComprada(
                        new Membresia(nuevaMembresia, precio),
                        LocalDate.now(),
                        LocalDate.now().plusMonths(1),
                        precio,
                        Estado.ACTIVO
                );
                coleccionClientes.updateOne(eq("_id", new ObjectId(idCliente)), set("membresiaComprada", nuevaCompra));

            }
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al darle la membresia a cliente");
        }

    }

    @Override
    public MembresiaComprada guardarMembresiaCompradaCliente(String idCliente, MembresiaComprada compra) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            if (idCliente == null || idCliente.trim().isEmpty()) {
                throw new PersistenciaException("El ID del cliente no puede estar vacío.");
            }

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Cliente> coleccion = db.getCollection(NOMBRE_COLECCION, Cliente.class);

            coleccion.updateOne(eq("_id", new ObjectId(idCliente)), set("membresiaComprada", compra));

            return compra;

        } catch (MongoException ex) {
            throw new PersistenciaException("Error al anidar membresía");

        }
    }

    @Override
    public List<MembresiaComprada> consultarTodasMembresiasCompradas() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
