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
    private List<LesionesDTO> lesiones;
    private List<EnfermedadesDTO> enfermedades;

    public RegistroFisicoDTO(String id, String idCliente, NivelCondicionDTO nivelCondicion, List<LesionesDTO> lesiones, List<EnfermedadesDTO> enfermedades) {
        this.id = id;
        this.idCliente = idCliente;
        this.nivelCondicion = nivelCondicion;
        this.lesiones = lesiones;
        this.enfermedades = enfermedades;
    }

    public RegistroFisicoDTO(String idCliente, NivelCondicionDTO nivelCondicion, List<LesionesDTO> lesiones, List<EnfermedadesDTO> enfermedades) {
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

    public List<LesionesDTO> getLesiones() {
        return lesiones;
    }

    public void setLesiones(List<LesionesDTO> lesiones) {
        this.lesiones = lesiones;
    }

    public List<EnfermedadesDTO> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<EnfermedadesDTO> enfermedades) {
        this.enfermedades = enfermedades;
    }
}
