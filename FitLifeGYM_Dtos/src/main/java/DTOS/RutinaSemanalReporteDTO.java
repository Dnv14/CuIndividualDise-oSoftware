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
public class RutinaSemanalReporteDTO {
    private String diaSemana;
    private String notas;
    private List<DetalleRutinaReporteDTO> detalleRutina;

    public RutinaSemanalReporteDTO() {
    }

    
    public RutinaSemanalReporteDTO(String diaSemana, String notas, List<DetalleRutinaReporteDTO> detalleRutina) {
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

    public List<DetalleRutinaReporteDTO> getDetalleRutina() {
        return detalleRutina;
    }

    public void setDetalleRutina(List<DetalleRutinaReporteDTO> detalleRutina) {
        this.detalleRutina = detalleRutina;
    }
}
