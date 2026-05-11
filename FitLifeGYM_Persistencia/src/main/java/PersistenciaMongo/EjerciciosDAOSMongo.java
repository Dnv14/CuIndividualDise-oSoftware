/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Ejercicio;
import Interfaces.IEjerciciosDAO;
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
    public List<Ejercicio> consultarTodos() {
        List<Ejercicio> listaEjercicios = new LinkedList<>();

        try (MongoClient cliente = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(cliente);

            MongoCollection<Ejercicio> coleccionEjercicios = db.getCollection(NOMBRE_COLECCION, Ejercicio.class);

            coleccionEjercicios.find().into(listaEjercicios);

//            for(Ejercicio e :coleccionEjercicios.find()){
//                listaEjercicios.add(e);
//            }
            return listaEjercicios;
        }
    }

    @Override
    public List<Ejercicio> cargarEjercicios() {
        List<Ejercicio> ejercicios = new LinkedList<>();
        List<Ejercicio> listaActual = consultarTodos();

        try (MongoClient cliente = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(cliente);
            MongoCollection<Ejercicio> coleccionEjercicios = db.getCollection(NOMBRE_COLECCION, Ejercicio.class);

            if (listaActual == null || listaActual.size() == 0) {
                ejercicios.add(new Ejercicio("Press de Banca"));
                ejercicios.add(new Ejercicio("Press Militar"));
                ejercicios.add(new Ejercicio("Sentadilla"));
                ejercicios.add(new Ejercicio("Peso Muerto"));
                ejercicios.add(new Ejercicio("Curl de Bicep"));
                ejercicios.add(new Ejercicio("Curl Martillo"));
                ejercicios.add(new Ejercicio("Extensión de Cuadriceps"));
                ejercicios.add(new Ejercicio("Extensión de Femoral"));
                ejercicios.add(new Ejercicio("Press Inclinado"));
                ejercicios.add(new Ejercicio("Dominadas"));

                coleccionEjercicios.insertMany(ejercicios);
                return ejercicios;
            }

        }
        return listaActual;
    }
}
