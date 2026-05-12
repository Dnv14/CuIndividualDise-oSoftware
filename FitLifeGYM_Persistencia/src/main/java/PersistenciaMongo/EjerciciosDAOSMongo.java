/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Ejercicio;
import Excepciones.PersistenciaException;
import Interfaces.IEjerciciosDAO;
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
public class EjerciciosDAOSMongo implements IEjerciciosDAO {

    private static final String NOMBRE_COLECCION = "ejercicios";

    @Override
    public List<Ejercicio> consultarTodos() throws PersistenciaException {
        List<Ejercicio> listaEjercicios = new LinkedList<>();

        try (MongoClient cliente = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(cliente);

            MongoCollection<Ejercicio> coleccionEjercicios = db.getCollection(NOMBRE_COLECCION, Ejercicio.class);

            if (coleccionEjercicios.countDocuments() == 0) {
                listaEjercicios.add(new Ejercicio("Press de Banca"));
                listaEjercicios.add(new Ejercicio("Press Militar"));
                listaEjercicios.add(new Ejercicio("Sentadilla"));
                listaEjercicios.add(new Ejercicio("Peso Muerto"));
                listaEjercicios.add(new Ejercicio("Curl de Bicep"));
                listaEjercicios.add(new Ejercicio("Curl Martillo"));
                listaEjercicios.add(new Ejercicio("Extensión de Cuadriceps"));
                listaEjercicios.add(new Ejercicio("Extensión de Femoral"));
                listaEjercicios.add(new Ejercicio("Press Inclinado"));
                listaEjercicios.add(new Ejercicio("Dominadas"));
                coleccionEjercicios.insertMany(listaEjercicios);
            }

            return coleccionEjercicios.find().into(new LinkedList<>());
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar los ejercicios");
        }
    }
}
