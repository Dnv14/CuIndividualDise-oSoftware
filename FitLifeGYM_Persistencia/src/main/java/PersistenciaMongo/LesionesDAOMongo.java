/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Lesiones;
import Excepciones.PersistenciaException;
import Interfaces.ILesionesDAO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class LesionesDAOMongo implements ILesionesDAO {

    private static final String NOMBRE_COLECCION = "lesiones";

    @Override
    public List<Lesiones> consultarTodos() throws PersistenciaException {
        List<Lesiones> listaLesiones = new LinkedList<>();

        try (MongoClient cliente = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(cliente);
            MongoCollection<Lesiones> coleccionLesiones = db.getCollection(NOMBRE_COLECCION, Lesiones.class);

            if (coleccionLesiones.countDocuments() == 0) {
                listaLesiones.add(new Lesiones("Hernia Discal"));
                listaLesiones.add(new Lesiones("Desgarre en Manguito Rotador"));
                listaLesiones.add(new Lesiones("Esguince de Tobillo"));
                listaLesiones.add(new Lesiones("Artrosis de Rodilla"));
                listaLesiones.add(new Lesiones("Rotura de Algún Ligamento"));
                coleccionLesiones.insertMany(listaLesiones);
                return listaLesiones;
            }

            coleccionLesiones.find().into(listaLesiones);

            return listaLesiones;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar las lesiones");
        }
    }
}
