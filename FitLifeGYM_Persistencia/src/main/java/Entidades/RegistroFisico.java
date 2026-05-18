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
    @BsonRepresentation(BsonType.OBJECT_ID)
    private String idCliente;
    private NivelCondicion nivelCondicion;
    private List<LesionesSeleccionadas> lesionesSeleccionadas;
    private List<EnfermedadesSeleccionadas> enfermedadesSeleccionadas;

    public RegistroFisico() {
    }

    
    
    public RegistroFisico(String id, String idCliente, NivelCondicion nivelCondicion, List<LesionesSeleccionadas> lesiones, List<EnfermedadesSeleccionadas> enfermedadesSeleccionadas) {
        this.id = id;
        this.idCliente = idCliente;
        this.nivelCondicion = nivelCondicion;
        this.lesionesSeleccionadas = lesiones;
        this.enfermedadesSeleccionadas = enfermedadesSeleccionadas;
    }

    public RegistroFisico(String idCliente, NivelCondicion nivelCondicion, List<LesionesSeleccionadas> lesiones, List<EnfermedadesSeleccionadas> enfermedadesSeleccionadas) {
        this.idCliente = idCliente;
        this.nivelCondicion = nivelCondicion;
        this.lesionesSeleccionadas = lesiones;
        this.enfermedadesSeleccionadas = enfermedadesSeleccionadas;
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

    public List<LesionesSeleccionadas> getLesiones() {
        return lesionesSeleccionadas;
    }

    public void setLesiones(List<LesionesSeleccionadas> lesionesSeleccionadas) {
        this.lesionesSeleccionadas = lesionesSeleccionadas;
    }

    public List<EnfermedadesSeleccionadas> getEnfermedades() {
        return enfermedadesSeleccionadas;
    }

    public void setEnfermedades(List<EnfermedadesSeleccionadas> enfermedadesSeleccionadas) {
        this.enfermedadesSeleccionadas = enfermedadesSeleccionadas;
    }

    @Override
    public String toString() {
        return "RegistroFisico{" + "id=" + id + ", idCliente=" + idCliente + ", nivelCondicion=" + nivelCondicion + ", lesiones=" + lesionesSeleccionadas + ", enfermedades=" + enfermedadesSeleccionadas + '}';
    }
    
    
    
}
