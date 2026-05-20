/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infraestructura;

import java.util.List;

/**
 *
 * @author Diego
 */
public class ReporteRutinaClientePdfDTO {

    private String nombreCliente;
    private String fechaGenerado;
    private List<RutinaSemanaPdfDTO> diasRutina;

    public ReporteRutinaClientePdfDTO() {
    }

    public ReporteRutinaClientePdfDTO(String nombreCliente, String fechaGenerado, List<RutinaSemanaPdfDTO> diasRutina) {
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

    public List<RutinaSemanaPdfDTO> getDiasRutina() {
        return diasRutina;
    }

    public void setDiasRutina(List<RutinaSemanaPdfDTO> diasRutina) {
        this.diasRutina = diasRutina;
    }
    
    

}
