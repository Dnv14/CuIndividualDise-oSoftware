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

    //inicio de sesionm
    private String nombre;
    private String correo;
    private String contrasenia;

    public AdministradorDTO() {
    }

    public AdministradorDTO(String id, String idUsuario) {
        this.id = id;
        this.idUsuario = idUsuario;
    }

    public String getId() {
        return id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "AdministradorDTO{" + "id=" + id + ", idUsuario=" + idUsuario + '}';
    }

}
