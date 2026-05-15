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
import static com.mongodb.client.model.Filters.eq;
import static javax.management.Query.and;

/**
 *
 * @author Diego
 */
public class AdministradorDAOMongo implements IAdministradorDAO {

    private static final String NOMBRE_COLECCION = "administradores";

    @Override
    public Administrador iniciarSesionAdmin(String correo, String password) throws PersistenciaException {
//        try (MongoClient client = CreadorConexiones.crearConexion()) {
//            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
//            MongoCollection<Administrador> coleccion = db.getCollection(NOMBRE_COLECCION, Administrador.class);
//
//            Administrador administrador = coleccion.find(and(eq("correo", correo), eq("password", password))).first();
//
//            return administrador;
//        } catch (MongoException ex) {
//            throw new PersistenciaException("Error al validar credenciales de admin");
//        }
        return null;
    }

}
