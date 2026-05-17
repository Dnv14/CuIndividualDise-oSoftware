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
public class DetallesRutinaDTO {

    private String id;
    private List<EjerciciosSeleccionadosDTO> ejerciciosSeleccionados;
    private Integer pesoRecomendado;
    private Integer repeticionesRecomendadas;
    private Integer seriesRecomendadas;
    private String notas;

    public DetallesRutinaDTO() {
    }

    public DetallesRutinaDTO(String id, List<EjerciciosSeleccionadosDTO> ejerciciosSeleccionados, Integer pesoRecomendado, Integer repeticionesRecomendadas, Integer seriesRecomendadas, String notas) {
        this.id = id;
        this.ejerciciosSeleccionados = ejerciciosSeleccionados;
        this.pesoRecomendado = pesoRecomendado;
        this.repeticionesRecomendadas = repeticionesRecomendadas;
        this.seriesRecomendadas = seriesRecomendadas;
        this.notas = notas;
    }

    public DetallesRutinaDTO(List<EjerciciosSeleccionadosDTO> ejerciciosSeleccionados, Integer pesoRecomendado, Integer repeticionesRecomendadas, Integer seriesRecomendadas, String notas) {
        this.ejerciciosSeleccionados = ejerciciosSeleccionados;
        this.pesoRecomendado = pesoRecomendado;
        this.repeticionesRecomendadas = repeticionesRecomendadas;
        this.seriesRecomendadas = seriesRecomendadas;
        this.notas = notas;
    }

    public List<EjerciciosSeleccionadosDTO> getEjerciciosSeleccionados() {
        return ejerciciosSeleccionados;
    }

    public void setEjerciciosSeleccionados(List<EjerciciosSeleccionadosDTO> ejerciciosSeleccionados) {
        this.ejerciciosSeleccionados = ejerciciosSeleccionados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Integer getPesoRecomendado() {
        return pesoRecomendado;
    }

    public void setPesoRecomendado(Integer pesoRecomendado) {
        this.pesoRecomendado = pesoRecomendado;
    }

    public Integer getRepeticionesRecomendadas() {
        return repeticionesRecomendadas;
    }

    public void setRepeticionesRecomendadas(Integer repeticionesRecomendadas) {
        this.repeticionesRecomendadas = repeticionesRecomendadas;
    }

    public Integer getSeriesRecomendadas() {
        return seriesRecomendadas;
    }

    public void setSeriesRecomendadas(Integer seriesRecomendadas) {
        this.seriesRecomendadas = seriesRecomendadas;
    }

}
