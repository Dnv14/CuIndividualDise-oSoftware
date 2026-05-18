/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

import DTOsENUMs.EstadoRutinaDTO;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Diego
 */
public class RutinaDTO {

    private String id;
    private String idCliente;
    private String diaSemana;
    private Date fechaAsignada;
    private EstadoRutinaDTO estadoRutina;
    private List<DetallesRutinaDTO> detallesRutina;
    private String notas;

    public RutinaDTO() {
    }

    public RutinaDTO(String id, String idCliente, String diaSemana, Date fechaAsignada, EstadoRutinaDTO estadoRutina, List<DetallesRutinaDTO> detallesRutina, String notas) {
        this.id = id;
        this.idCliente = idCliente;
        this.diaSemana = diaSemana;
        this.fechaAsignada = fechaAsignada;
        this.estadoRutina = estadoRutina;
        this.detallesRutina = detallesRutina;
        this.notas = notas;
    }

    public RutinaDTO(String idCliente, String diaSemana, Date fechaAsignada, EstadoRutinaDTO estadoRutina, List<DetallesRutinaDTO> detallesRutina, String notas) {
        this.idCliente = idCliente;
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

    public EstadoRutinaDTO getEstadoRutina() {
        return estadoRutina;
    }

    public void setEstadoRutina(EstadoRutinaDTO estadoRutina) {
        this.estadoRutina = estadoRutina;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public List<DetallesRutinaDTO> getDetallesRutina() {
        return detallesRutina;
    }

    public void setDetallesRutina(List<DetallesRutinaDTO> detallesRutina) {
        this.detallesRutina = detallesRutina;
    }

}
