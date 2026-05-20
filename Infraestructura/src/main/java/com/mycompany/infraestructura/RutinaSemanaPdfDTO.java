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
public class RutinaSemanaPdfDTO {

    private String diaSemana;
    private String notas;
    private List<DetalleRutinaPdfDTO> detalleRutina;

    public RutinaSemanaPdfDTO() {
    }

    
    public RutinaSemanaPdfDTO(String diaSemana, String notas, List<DetalleRutinaPdfDTO> detalleRutina) {
        this.diaSemana = diaSemana;
        this.notas = notas;
        this.detalleRutina = detalleRutina;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public List<DetalleRutinaPdfDTO> getDetalleRutina() {
        return detalleRutina;
    }

    public void setDetalleRutina(List<DetalleRutinaPdfDTO> detalleRutina) {
        this.detalleRutina = detalleRutina;
    }
    
    
}
