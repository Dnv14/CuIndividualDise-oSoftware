/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

/**
 *
 * @author Diego
 */
public class AdministradorDTO {

    private String id;
    private String idUsuario;

    public AdministradorDTO() {
    }

    public AdministradorDTO(String id, String idUsuario) {
        this.id = id;
        this.idUsuario = idUsuario;
    }

    public String getId() {
        return id;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    @Override
    public String toString() {
        return "AdministradorDTO{" + "id=" + id + ", idUsuario=" + idUsuario + '}';
    }

}
