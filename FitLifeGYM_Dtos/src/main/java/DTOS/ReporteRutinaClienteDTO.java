/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

import java.util.List;

/**
 *
 * @author Diego
 */
public class ReporteRutinaClienteDTO {
    private String nombreCliente;
    private String fechaGenerado;
    private List<RutinaSemanalReporteDTO> diasRutina;

    public ReporteRutinaClienteDTO() {
    }

    public ReporteRutinaClienteDTO(String nombreCliente, String fechaGenerado, List<RutinaSemanalReporteDTO> diasRutina) {
        this.nombreCliente = nombreCliente;
        this.fechaGenerado = fechaGenerado;
        this.diasRutina = diasRutina;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFechaGenerado() {
        return fechaGenerado;
    }

    public void setFechaGenerado(String fechaGenerado) {
        this.fechaGenerado = fechaGenerado;
    }

    public List<RutinaSemanalReporteDTO> getDiasRutina() {
        return diasRutina;
    }

    public void setDiasRutina(List<RutinaSemanalReporteDTO> diasRutina) {
        this.diasRutina = diasRutina;
    }
}
