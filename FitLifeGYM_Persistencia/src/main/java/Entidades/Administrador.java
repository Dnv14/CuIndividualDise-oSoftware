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
 * @author Diego
 */
public class Administrador {
    
    @BsonId
    @BsonRepresentation(BsonType.OBJECT_ID)
    private String id;
    private String idUsuario;

    public Administrador() {
    }

    public Administrador(String id, String idUsuario) {
        this.id = id;
        this.idUsuario = idUsuario;
    }

    public Administrador(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Administrador{" + "id=" + id + ", idUsuario=" + idUsuario + '}';
    }

    
}
