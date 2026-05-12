/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;
import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

/**
 *
 * @author MrGam
 */
public class RegistroFisico {
    
    @BsonId
    @BsonRepresentation(BsonType.OBJECT_ID)
    private String id;
    private String idCliente;
    private NivelCondicion nivelCondicion;
    private List<Lesiones> lesiones;
    private List<Enfermedades> enfermedades;

    public RegistroFisico() {
    }

    
    
    public RegistroFisico(String id, String idCliente, NivelCondicion nivelCondicion, List<Lesiones> lesiones, List<Enfermedades> enfermedades) {
        this.id = id;
        this.idCliente = idCliente;
        this.nivelCondicion = nivelCondicion;
        this.lesiones = lesiones;
        this.enfermedades = enfermedades;
    }

    public RegistroFisico(String idCliente, NivelCondicion nivelCondicion, List<Lesiones> lesiones, List<Enfermedades> enfermedades) {
        this.idCliente = idCliente;
        this.nivelCondicion = nivelCondicion;
        this.lesiones = lesiones;
        this.enfermedades = enfermedades;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public NivelCondicion getNivelCondicion() {
        return nivelCondicion;
    }

    public void setNivelCondicion(NivelCondicion nivelCondicion) {
        this.nivelCondicion = nivelCondicion;
    }

    public List<Lesiones> getLesiones() {
        return lesiones;
    }

    public void setLesiones(List<Lesiones> lesiones) {
        this.lesiones = lesiones;
    }

    public List<Enfermedades> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<Enfermedades> enfermedades) {
        this.enfermedades = enfermedades;
    }

    @Override
    public String toString() {
        return "RegistroFisico{" + "id=" + id + ", idCliente=" + idCliente + ", nivelCondicion=" + nivelCondicion + ", lesiones=" + lesiones + ", enfermedades=" + enfermedades + '}';
    }
    
    
    
}
