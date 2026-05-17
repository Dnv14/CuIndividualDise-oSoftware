/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import DTOsPersistencia.filtrosBusquedaClientesDTO;
import Entidades.Cliente;
import Entidades.Estado;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.TipoMembresia;
import Entidades.Usuario;
import Excepciones.PersistenciaException;
import Interfaces.IClientesDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Aggregates.lookup;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.project;
import static com.mongodb.client.model.Aggregates.unwind;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.gt;
import static com.mongodb.client.model.Filters.regex;
import static com.mongodb.client.model.Projections.computed;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import static com.mongodb.client.model.Updates.set;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
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
    public Cliente iniciarSesionCliente(String correo, String contrasenia) throws PersistenciaException {
//        try (MongoClient client = CreadorConexiones.crearConexion()) {
//            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
//
//            MongoCollection<Usuario> coleccionUsuarios = db.getCollection("usuarios", Usuario.class);
//            Usuario usuario = coleccionUsuarios.find(and(eq("correo", correo), eq("contrasenia", contrasenia))).first();
//
//            if (usuario == null) {
//                return null;
//            }
//
//            MongoCollection<Cliente> coleccionClientes = db.getCollection("clientes", Cliente.class);
//            Cliente cliente = coleccionClientes.find(eq("idUsuario", usuario.getId())).first();
//
//            if (cliente != null) {
//                cliente.setNombre(usuario.getNombre());
//                cliente.setApellidos(usuario.getApellidos());
//                cliente.setCorreo(usuario.getCorreo());
//                cliente.setIdUsuario(usuario.getId());
//                return cliente;
//            }
//
//            return null;
//
//        } catch (MongoException ex) {
//            throw new PersistenciaException("Error al iniciar sesión");
//        }

        try (MongoClient client = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);

            MongoCollection<Usuario> coleccionUsuarios = db.getCollection("usuarios", Usuario.class);
            Usuario usuario = coleccionUsuarios.find(and(eq("correo", correo), eq("contrasenia", contrasenia))).first();

            if (usuario == null) {
                return null;
            }

            MongoCollection<Cliente> coleccionClientes = db.getCollection("clientes", Cliente.class);
            Cliente cliente = coleccionClientes.find(eq("idUsuario", new ObjectId(usuario.getId()))).first();

            if (cliente != null) {
                cliente.setNombre(usuario.getNombre());
                cliente.setApellidos(usuario.getApellidos());
                cliente.setCorreo(usuario.getCorreo());
                cliente.setIdUsuario(usuario.getId());
                return cliente;
            }
            return null;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al iniciar sesión");
        }
    }

    @Override
    public Cliente consultarClientePorId(String _id) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Cliente> coleccionClientes = db.getCollection(NOMBRE_COLECCION, Cliente.class);

            List<Bson> pipeline = new LinkedList<>();

            pipeline.add(match(eq("_id", new ObjectId(_id))));
            pipeline.add(lookup("usuarios", "idUsuario", "_id", "datosUsuario"));
            pipeline.add(unwind("$datosUsuario"));
            pipeline.add(project(fields(computed("idCliente", "$_id"),
                    include("idUsuario", "telefono", "fechaNacimiento"),
                    computed("nombre", "$datosUsuario.nombre"),
                    computed("apellidos", "$datosUsuario.apellidos"),
                    computed("correoElectronico", "$datosUsuario.correoElectronico"))));

            Cliente cliente = coleccionClientes.aggregate(pipeline).first();

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
    public List<Document> barraBusquedaConsultarClientes(filtrosBusquedaClientesDTO filtrosDTO) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Document> coleccionClientes = db.getCollection("clientes", Document.class);

            List<Bson> pipeline = new LinkedList<>();
            pipeline.add(lookup("usuarios", "idUsuario", "_id", "datosUsuario"));
            pipeline.add(unwind("$datosUsuario"));

            pipeline.add(lookup("rutinas", "_id", "idCliente", "datosRutina"));

            pipeline.add(project(fields(
                    computed("idCliente", "$_id"),
                    computed("nombreCompleto", new Document("$concat", List.of("$datosUsuario.nombre", " ", "$datosUsuario.apellidos"))),
                    computed("diasRutina", new Document("$size", "$datosRutina"))
            )));

            List<Bson> filtros = new LinkedList<>();

            if (filtrosDTO.getNombreCliente() != null && !filtrosDTO.getNombreCliente().trim().isEmpty()) {
                filtros.add(regex("nombreCompleto", filtrosDTO.getNombreCliente(), "i"));
            }

            if (filtrosDTO.getEstadoRutina() != null) {
                if (filtrosDTO.getEstadoRutina().equals("ASIGNADA")) {
                    filtros.add(gt("diasRutina", 0));
                } else if (filtrosDTO.getEstadoRutina().equals("SIN_ASIGNAR")) {
                    filtros.add(eq("diasRutina", 0));
                }
            }
            if (!filtros.isEmpty()) {
                pipeline.add(match(and(filtros)));
            }

            List<Document> resultadoDocs = new LinkedList<>();
            for (Document document : coleccionClientes.aggregate(pipeline)) {
                resultadoDocs.add(document);
            }

            return resultadoDocs;

        } catch (Exception ex) {
            throw new PersistenciaException("Error en consultar la tabla: " + ex.getMessage());
        }
    }

    @Override
    public List<MembresiaComprada> consultarTodasMembresiasCompradas() throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
