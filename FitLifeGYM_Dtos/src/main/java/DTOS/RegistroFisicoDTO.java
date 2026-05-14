/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

import DTOsENUMs.NivelCondicionDTO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class RegistroFisicoDTO {

    private String id;
    private String idCliente;
    private NivelCondicionDTO nivelCondicion;
    private List<LesionesSeleccionadasDTO> lesiones;
    private List<EnfermedadesSeleccionadasDTO> enfermedades;

    public RegistroFisicoDTO(String id, String idCliente, NivelCondicionDTO nivelCondicion, List<LesionesSeleccionadasDTO> lesiones, List<EnfermedadesSeleccionadasDTO> enfermedades) {
        this.id = id;
        this.idCliente = idCliente;
        this.nivelCondicion = nivelCondicion;
        this.lesiones = lesiones;
        this.enfermedades = enfermedades;
    }

    public RegistroFisicoDTO(String idCliente, NivelCondicionDTO nivelCondicion, List<LesionesSeleccionadasDTO> lesiones, List<EnfermedadesSeleccionadasDTO> enfermedades) {
        this.idCliente = idCliente;
        this.nivelCondicion = nivelCondicion;
        this.lesiones = lesiones;
        this.enfermedades = enfermedades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public NivelCondicionDTO getNivelCondicion() {
        return nivelCondicion;
    }

    public void setNivelCondicion(NivelCondicionDTO nivelCondicion) {
        this.nivelCondicion = nivelCondicion;
    }

    public List<LesionesSeleccionadasDTO> getLesiones() {
        return lesiones;
    }

    public void setLesiones(List<LesionesSeleccionadasDTO> lesiones) {
        this.lesiones = lesiones;
    }

    public List<EnfermedadesSeleccionadasDTO> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<EnfermedadesSeleccionadasDTO> enfermedades) {
        this.enfermedades = enfermedades;
    }

   
}
