/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

/**
 *
 * @author Diego
 */
public class DetalleRutinaReporteDTO {
    private String nombreEjercicio;
    private Integer seriesRecomendadas;
    private Integer repeticionesRecomendadas;
    private Integer pesoRecomendadas;

    public DetalleRutinaReporteDTO() {
    }

    public DetalleRutinaReporteDTO(String nombreEJercicio, Integer seriesRecomendadas, Integer repeticionesRecomendadas, Integer pesoRecomendadas) {
        this.nombreEjercicio = nombreEJercicio;
        this.seriesRecomendadas = seriesRecomendadas;
        this.repeticionesRecomendadas = repeticionesRecomendadas;
        this.pesoRecomendadas = pesoRecomendadas;
    }

    public String getNombreEjercicio() {
        return nombreEjercicio;
    }

    public void setNombreEjercicio(String nombreEjercicio) {
        this.nombreEjercicio = nombreEjercicio;
    }

    public int getSeriesRecomendadas() {
        return seriesRecomendadas;
    }

    public void setSeriesRecomendadas(int seriesRecomendadas) {
        this.seriesRecomendadas = seriesRecomendadas;
    }

    public int getRepeticionesRecomendadas() {
        return repeticionesRecomendadas;
    }

    public void setRepeticionesRecomendadas(int repeticionesRecomendadas) {
        this.repeticionesRecomendadas = repeticionesRecomendadas;
    }

    public int getPesoRecomendadas() {
        return pesoRecomendadas;
    }

    public void setPesoRecomendadas(int pesoRecomendadas) {
        this.pesoRecomendadas = pesoRecomendadas;
    }

}
