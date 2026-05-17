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
    @BsonRepresentation(BsonType.OBJECT_ID)
    private String idUsuario;

    //para el inicio de sesion
    private String nombre;
    private String correo;
    private String contrasenia;

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

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
