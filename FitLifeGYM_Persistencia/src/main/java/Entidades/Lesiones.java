/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

/**
 *
 * @author MrGam
 */
public class Lesiones {
    @BsonId
    @BsonRepresentation(BsonType.OBJECT_ID)
    private String id;
    private String nombre;

    public Lesiones() {
    }

    public Lesiones(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Lesiones(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Lesiones{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
