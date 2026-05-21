/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infraestructura;

/**
 *
 * @author Diego
 */
public class ClienteReporteAdminPdfDTO {

    private String idCliente;
    private String nombreCompleto;
    private Integer diasRutina;

    public ClienteReporteAdminPdfDTO() {
    }

    public ClienteReporteAdminPdfDTO(String idCliente, String nombreCompleto, Integer diasRutina) {
        this.idCliente = idCliente;
        this.nombreCompleto = nombreCompleto;
        this.diasRutina = diasRutina;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getDiasRutina() {
        return diasRutina;
    }

    public void setDiasRutina(Integer diasRutina) {
        this.diasRutina = diasRutina;
    }

}
