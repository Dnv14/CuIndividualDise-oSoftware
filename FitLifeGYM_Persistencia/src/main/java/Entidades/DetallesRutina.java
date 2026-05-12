/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author MrGam
 */
public class DetallesRutina {
    private String id;
    private String idEjercicio;
    private String nombreEjercicio;
    private Integer pesoRecomendado;
    private Integer repeticionesRecomendadas;
    private Integer seriesRecomendadas;

    public DetallesRutina() {
    }

    public DetallesRutina(String id, String idEjercicio, String nombreEjercicio, Integer pesoRecomendado, Integer repeticionesRecomendadas, Integer seriesRecomendadas) {
        this.id = id;
        this.idEjercicio = idEjercicio;
        this.nombreEjercicio = nombreEjercicio;
        this.pesoRecomendado = pesoRecomendado;
        this.repeticionesRecomendadas = repeticionesRecomendadas;
        this.seriesRecomendadas = seriesRecomendadas;
    }

    public DetallesRutina(String idEjercicio, String nombreEjercicio, Integer pesoRecomendado, Integer repeticionesRecomendadas, Integer seriesRecomendadas) {
        this.idEjercicio = idEjercicio;
        this.nombreEjercicio = nombreEjercicio;
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

    public String getIdEjercicio() {
        return idEjercicio;
    }

    public void setIdEjercicio(String idEjercicio) {
        this.idEjercicio = idEjercicio;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
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
        return "DetallesRutina{" + "id=" + id + ", idEjercicio=" + idEjercicio + ", nombreEjercicio=" + nombreEjercicio + ", pesoRecomendado=" + pesoRecomendado + ", repeticionesRecomendadas=" + repeticionesRecomendadas + ", seriesRecomendadas=" + seriesRecomendadas + '}';
    }
    
}
