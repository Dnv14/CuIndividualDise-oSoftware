/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersistenciaMongo;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Diego
 */
public class CreadorConexiones {

    public static final String CADENA_CONEXION = "mongodb://localhost:27017";
    public static final String BASE_DATOS = "ProyectoFinal";

    public static MongoClient crearConexion() {

        MongoClient cliente = MongoClients.create(CADENA_CONEXION);
        return cliente;
    }

    public static MongoDatabase obtenerCodecs(MongoClient client) {
        //genera n proveedor de codecs
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        //generar un registro de codecs default + pojo
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));

        MongoDatabase db = client.getDatabase(BASE_DATOS).withCodecRegistry(pojoCodecRegistry);

        return db;
    }

}
