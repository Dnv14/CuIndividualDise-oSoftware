/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOsPersistencia;

/**
 *
 * @author Diego
 */
public class filtrosBusquedaClientesDTO {

    private String nombreCliente;
    private String estadoRutina;

    public filtrosBusquedaClientesDTO() {
    }

    
    
    public filtrosBusquedaClientesDTO(String nombreCliente, String estadoRutina) {
        this.nombreCliente = nombreCliente;
        this.estadoRutina = estadoRutina;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEstadoRutina() {
        return estadoRutina;
    }

    public void setEstadoRutina(String estadoRutina) {
        this.estadoRutina = estadoRutina;
    }
    
    

}
