/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOsPersistencia;

/**
 *
 * @author Diego
 */
public class BusquedaClientesDTO {

    String idCliente;
    String nombreCompleto;
    Integer diasRutina;

    public BusquedaClientesDTO() {
    }

    public BusquedaClientesDTO(String idCliente, String nombreCompleto, Integer diasRutina) {
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
