/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Rutina;
import Excepciones.PersistenciaException;
import Interfaces.IRutinasDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Diego
 */
public class RutinasDAOMongo implements IRutinasDAO {

    private static final String NOMBRE_COLECCION = "rutinas";

    @Override
    public Rutina guardarRutina(Rutina rutina) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Rutina> coleccionRutinas = db.getCollection(NOMBRE_COLECCION, Rutina.class);

            coleccionRutinas.insertOne(rutina);

            return rutina;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al registrar la rutina");
        }
    }

    @Override
    public void eliminarRutina(String idCliente, String diaSemana) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {

            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Rutina> coleccionRutinas = db.getCollection(NOMBRE_COLECCION, Rutina.class);

            coleccionRutinas.deleteOne(and(eq("idCliente", new ObjectId(idCliente)), eq("diaSemana", diaSemana)));
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al eliminar la rutina ");
        }
    }

    @Override
    public Rutina editarRutina(Rutina rutina) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Rutina> coleccion = db.getCollection(NOMBRE_COLECCION, Rutina.class);

            coleccion.replaceOne(eq("_id", new ObjectId(rutina.getId())), rutina);

            return rutina;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al editar la rutina");
        }
    }

    //cliente
    @Override
    public Rutina consultarRutina(String idCliente, String diaSemana) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Rutina> coleccion = db.getCollection(NOMBRE_COLECCION, Rutina.class);

            Rutina consultaRutina = coleccion.find(and(eq("idCliente", new ObjectId(idCliente)), eq("diaSemana", diaSemana))).first();

            return consultaRutina;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar la rutina");
        }
    }

    @Override
    public List<Rutina> consultarTodasRutinaCliente(String idCliente) throws PersistenciaException {
        try (MongoClient client = CreadorConexiones.crearConexion()) {
            List<Rutina> rutinasCliente = new LinkedList<>();
            MongoDatabase db = CreadorConexiones.obtenerCodecs(client);
            MongoCollection<Rutina> coleccion = db.getCollection(NOMBRE_COLECCION, Rutina.class);

            List<String> diasSemanaOrdenar = List.of("Lunes", "Martes", "Miercoles", "Jueves", "Viernes");
            for (String dia : diasSemanaOrdenar) {
                Rutina rutinaDia = coleccion.find(and(eq("idCliente", new ObjectId(idCliente)), eq("diaSemana", dia))).first();
                if (rutinaDia != null) {
                    rutinasCliente.add(rutinaDia);
                }
            }
            return rutinasCliente;

        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar las rutinas del Cliente");
        }
    }

}
