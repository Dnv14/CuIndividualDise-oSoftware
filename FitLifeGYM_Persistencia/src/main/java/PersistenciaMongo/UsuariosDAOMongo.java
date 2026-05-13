/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Usuario;
import Excepciones.PersistenciaException;
import Interfaces.IUsuariosDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Diego
 */
public class UsuariosDAOMongo implements IUsuariosDAO{
    
    final private String NOMBRE_COLECCION = "usuarios";
    
    @Override
    public Usuario registrarUsuario(Usuario usuario) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Usuario> coleccionUsuarios = db.getCollection(NOMBRE_COLECCION, Usuario.class);

            coleccionUsuarios.insertOne(usuario);

            return usuario;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al registrar Cliente");
        }
    }
    
}
