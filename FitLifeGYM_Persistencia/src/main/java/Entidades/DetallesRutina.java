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
    private List<EjerciciosSeleccionados> ejercicios;
    private Integer pesoRecomendado;
    private Integer repeticionesRecomendadas;
    private Integer seriesRecomendadas;

    public DetallesRutina() {
    }

    public DetallesRutina(String id, List<EjerciciosSeleccionados> ejercicios, Integer pesoRecomendado, Integer repeticionesRecomendadas, Integer seriesRecomendadas) {
        this.id = id;
        this.ejercicios = ejercicios;
        this.pesoRecomendado = pesoRecomendado;
        this.repeticionesRecomendadas = repeticionesRecomendadas;
        this.seriesRecomendadas = seriesRecomendadas;
    }

    public DetallesRutina(List<EjerciciosSeleccionados> ejercicios, Integer pesoRecomendado, Integer repeticionesRecomendadas, Integer seriesRecomendadas) {
        this.ejercicios = ejercicios;
        this.pesoRecomendado = pesoRecomendado;
        this.repeticionesRecomendadas = repeticionesRecomendadas;
        this.seriesRecomendadas = seriesRecomendadas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<EjerciciosSeleccionados> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(List<EjerciciosSeleccionados> ejercicios) {
        this.ejercicios = ejercicios;
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
        return "DetallesRutina{" + "id=" + id + ", ejercicios=" + ejercicios + ", pesoRecomendado=" + pesoRecomendado + ", repeticionesRecomendadas=" + repeticionesRecomendadas + ", seriesRecomendadas=" + seriesRecomendadas + '}';
    }

    
}
