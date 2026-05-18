package Entidades;

import java.util.Date;
import java.util.List;
import org.bson.BsonType;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.codecs.pojo.annotations.BsonRepresentation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MrGam
 */
public class Rutina {

    @BsonId
    @BsonRepresentation(BsonType.OBJECT_ID)
    private String id;

    @BsonRepresentation(BsonType.OBJECT_ID)
    private String idCliente;
    private String diaSemana;
    private Date fechaAsignada;
    private EstadoRutina estadoRutina;
    private List<DetallesRutina> detallesRutina;
    private String notas;

    public Rutina() {
    }

    public Rutina(String idCliente, String diaSemana, Date fechaAsignada, EstadoRutina estadoRutina, List<DetallesRutina> detallesRutina, String notas) {
        this.idCliente = idCliente;
        this.diaSemana = diaSemana;
        this.fechaAsignada = fechaAsignada;
        this.estadoRutina = estadoRutina;
        this.detallesRutina = detallesRutina;
        this.notas = notas;
    }

    public Rutina(String id, String idCliente, String diaSemana, Date fechaAsignada, EstadoRutina estadoRutina, List<DetallesRutina> detallesRutina, String notas) {
        this.id = id;
        this.idCliente = idCliente;
        this.diaSemana = diaSemana;
        this.fechaAsignada = fechaAsignada;
        this.estadoRutina = estadoRutina;
        this.detallesRutina = detallesRutina;
        this.notas = notas;
    }

    public Rutina(String diaSemana, Date fechaAsignada, EstadoRutina estadoRutina, List<DetallesRutina> detallesRutina, String notas) {
        this.diaSemana = diaSemana;
        this.fechaAsignada = fechaAsignada;
        this.estadoRutina = estadoRutina;
        this.detallesRutina = detallesRutina;
        this.notas = notas;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
    }

    public void setFechaAsignada(Date fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }

    public EstadoRutina getEstadoRutina() {
        return estadoRutina;
    }

    public void setEstadoRutina(EstadoRutina estadoRutina) {
        this.estadoRutina = estadoRutina;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public List<DetallesRutina> getDetallesRutina() {
        return detallesRutina;
    }

    public void setDetallesRutina(List<DetallesRutina> detallesRutina) {
        this.detallesRutina = detallesRutina;
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", idCliente=" + idCliente + ", diaSemana=" + diaSemana + ", fechaAsignada=" + fechaAsignada + ", estadoRutina=" + estadoRutina + ", detallesRutina=" + detallesRutina + '}';
    }

}
