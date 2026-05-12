/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import Entidades.Membresia;
import Entidades.TipoMembresia;
import Excepciones.PersistenciaException;
import Interfaces.IMembresiaDAO;
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
public class MembresiaDAOMongo implements IMembresiaDAO {

    private static final String NOMBRE_COLECCION = "membresias";

    @Override
    public List<Membresia> obtenerYCargarMembresias() throws PersistenciaException {
        List<Membresia> listaMembresias = new LinkedList<>();

        try (MongoClient cliente = CreadorConexiones.crearConexion()) {
            MongoDatabase db = CreadorConexiones.obtenerCodecs(cliente);
            MongoCollection<Membresia> coleccionMembresias = db.getCollection(NOMBRE_COLECCION, Membresia.class);

            if (coleccionMembresias.countDocuments() == 0) {
                listaMembresias.add(new Membresia(TipoMembresia.BRONCE, 300.0));
                listaMembresias.add(new Membresia(TipoMembresia.PLATA, 500.0));
                listaMembresias.add(new Membresia(TipoMembresia.ORO, 750.0));

                coleccionMembresias.insertMany(listaMembresias);
                return listaMembresias;
            }
            coleccionMembresias.find().into(listaMembresias);

            return listaMembresias;
        } catch (MongoException ex) {
            throw new PersistenciaException("Error al consultar las membresias");
        }
    }

}
