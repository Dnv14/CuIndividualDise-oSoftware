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
public class ReporteAdministradorPdfDTO {

    private String fechaGenerado;
    private List<ClienteReporteAdminPdfDTO> clientes;

    public ReporteAdministradorPdfDTO() {
    }

    public ReporteAdministradorPdfDTO(String fechaGenerado, List<ClienteReporteAdminPdfDTO> clientes) {
        this.fechaGenerado = fechaGenerado;
        this.clientes = clientes;
    }

    public String getFechaGenerado() {
        return fechaGenerado;
    }

    public void setFechaGenerado(String fechaGenerado) {
        this.fechaGenerado = fechaGenerado;
    }

    public List<ClienteReporteAdminPdfDTO> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteReporteAdminPdfDTO> clientes) {
        this.clientes = clientes;
    }

}
