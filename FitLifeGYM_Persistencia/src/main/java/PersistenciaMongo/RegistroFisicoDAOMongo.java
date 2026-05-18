/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.RegistroFisico;
import Excepciones.PersistenciaException;
import Interfaces.IRegistroFisicoDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import org.bson.types.ObjectId;

/**
 *
 * @author Diego
 */
public class RegistroFisicoDAOMongo implements IRegistroFisicoDAO {

    private static final String NOMBRE_COLECCION = "registroFisico";

    @Override
    public RegistroFisico guardarRegistroFisico(RegistroFisico registroFisico) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<RegistroFisico> coleccionRegistroFisico = db.getCollection(NOMBRE_COLECCION, RegistroFisico.class);

            coleccionRegistroFisico.insertOne(registroFisico);

            return registroFisico;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al registrar el registro fisico");
        }
    }

    @Override
    public RegistroFisico consultarRegistroFisico(String idCliente) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<RegistroFisico> coleccionRegistroFisico = db.getCollection(NOMBRE_COLECCION, RegistroFisico.class);

            RegistroFisico registroFisico = coleccionRegistroFisico.find(eq("idCliente", new ObjectId(idCliente))).first();

            return registroFisico;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar el registro fisico");
        }
    }

    @Override
    public boolean comprobarRegistroFisicoCliente(String idCliente) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);

            MongoCollection<RegistroFisico> coleccionRegistroFisico = db.getCollection("NOMBRE_COLECCION", RegistroFisico.class);

            RegistroFisico registroFisico = coleccionRegistroFisico.find(eq("idCliente", new ObjectId(idCliente))).first();

            if (registroFisico == null) {
                return false;
            }

            return true;

        } catch (MongoException ex) {
            throw new PersistenciaException("Error al verificar la existencia del registro físico: " + ex.getMessage());
        }
    }

}
