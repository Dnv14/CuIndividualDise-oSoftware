/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;

/**
 *
 * @author MrGam
 */
public class DetallesRutina {

    private String id;
    private List<EjerciciosSeleccionados> ejerciciosSeleccionados;
    private Integer pesoRecomendado;
    private Integer repeticionesRecomendadas;
    private Integer seriesRecomendadas;
    private String notas;

    public DetallesRutina() {
    }

    public DetallesRutina(String id, List<EjerciciosSeleccionados> ejercicios, Integer pesoRecomendado, Integer repeticionesRecomendadas, Integer seriesRecomendadas, String notas) {
        this.id = id;
        this.ejerciciosSeleccionados = ejercicios;
        this.pesoRecomendado = pesoRecomendado;
        this.repeticionesRecomendadas = repeticionesRecomendadas;
        this.seriesRecomendadas = seriesRecomendadas;
        this.notas = notas;
    }

    public DetallesRutina(List<EjerciciosSeleccionados> ejercicios, Integer pesoRecomendado, Integer repeticionesRecomendadas, Integer seriesRecomendadas, String notas) {
        this.ejerciciosSeleccionados = ejercicios;
        this.pesoRecomendado = pesoRecomendado;
        this.repeticionesRecomendadas = repeticionesRecomendadas;
        this.seriesRecomendadas = seriesRecomendadas;
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

    public List<EjerciciosSeleccionados> getEjerciciosSeleccionados() {
        return ejerciciosSeleccionados;
    }

    public void setEjerciciosSeleccionados(List<EjerciciosSeleccionados> ejerciciosSeleccionados) {
        this.ejerciciosSeleccionados = ejerciciosSeleccionados;
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

    @Override
    public String toString() {
        return "DetallesRutina{" + "id=" + id + ", ejercicios=" + ejerciciosSeleccionados + ", pesoRecomendado=" + pesoRecomendado + ", repeticionesRecomendadas=" + repeticionesRecomendadas + ", seriesRecomendadas=" + seriesRecomendadas + '}';
    }

}
