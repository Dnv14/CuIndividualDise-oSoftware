/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Enfermedades;
import Interfaces.IEnfermedadesDAO;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class EnfermedadesDAOMongo implements IEnfermedadesDAO {

    private static final String NOMBRE_COLECCION = "enfermedades";

    @Override
    public List<Enfermedades> consultarTodos() {
        List<Enfermedades> listaEnfermedades = new LinkedList<>();

        try (MongoClient cliente = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(cliente);

            MongoCollection<Enfermedades> coleccionEnfermedades = db.getCollection(NOMBRE_COLECCION, Enfermedades.class);
            coleccionEnfermedades.find().into(listaEnfermedades);
            return listaEnfermedades;
        }
    }

    @Override
    public List<Enfermedades> cargarEnfermedades() {
        List<Enfermedades> listaEnfermedades = new LinkedList<>();
        List<Enfermedades> listaActual = consultarTodos();

        try (MongoClient cliente = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(cliente);

            MongoCollection<Enfermedades> coleccionEnfermedades = db.getCollection(NOMBRE_COLECCION, Enfermedades.class);

            if (listaActual.size() == 0 || listaActual == null) {
                listaEnfermedades.add(new Enfermedades("Hipertensión"));
                listaEnfermedades.add(new Enfermedades("Diabetes"));
                listaEnfermedades.add(new Enfermedades("Asma"));
                listaEnfermedades.add(new Enfermedades("Taquicardia"));
                listaEnfermedades.add(new Enfermedades("Hipotiroidismo"));
                
                coleccionEnfermedades.insertMany(listaEnfermedades);
                return listaEnfermedades;
            }

            return listaActual;
        }
    }

}
