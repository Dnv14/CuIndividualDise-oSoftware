/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Administrador;
import Excepciones.PersistenciaException;
import Interfaces.IAdministradorDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Aggregates;
import static com.mongodb.client.model.Aggregates.lookup;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.computed;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;

import java.util.LinkedList;
import java.util.List;
import org.bson.conversions.Bson;

/**
 *
 * @author Diego
 */
public class AdministradorDAOMongo implements IAdministradorDAO {

    private static final String NOMBRE_COLECCION = "administradores";

    @Override
    public Administrador iniciarSesionAdmin(String correo, String contrasenia) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Administrador> coleccion = db.getCollection(NOMBRE_COLECCION, Administrador.class);

            List<Bson> pipeline = new LinkedList<>();

            pipeline.add(lookup("usuarios", "idUsuario", "_id", "datosUsuario"));
            pipeline.add(Aggregates.unwind("$datosUsuario"));

            pipeline.add(Aggregates.match(and(eq("datosUsuario.correo", correo), eq("datosUsuario.contrasenia", contrasenia))));
            pipeline.add(Aggregates.project(fields(include("idUsuario"), computed("nombre", "$datosUsuario.nombre"))));

            Administrador administradorLogueado = coleccion.aggregate(pipeline).first();

            return administradorLogueado;

        } catch (MongoException ex) {
            throw new PersistenciaException("Error al validar credenciales de admin");
        }

    }

    @Override
    public Administrador registrarAdministrador(Administrador administrador) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Administrador> coleccion = db.getCollection(NOMBRE_COLECCION, Administrador.class);

            if (administrador.getId() == null || administrador.getId().trim().isEmpty() || administrador.getId().length() < 24) {
                administrador.setId(null);
            }

            coleccion.insertOne(administrador);

            return administrador;

        } catch (MongoException ex) {
            throw new PersistenciaException("Error al registrar al administrador");
        }
    }
}
