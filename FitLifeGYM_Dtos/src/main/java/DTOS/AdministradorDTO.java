/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTOS;

/**
 *
 * @author Diego
 */
public class AdministradorDTO extends UsuarioDTO{
    public AdministradorDTO() {
    }

    public AdministradorDTO(String id, String nombre, String apellidos, String correo, String contrasenia) {
        super(id, nombre, apellidos, correo, contrasenia);
    }
    
    
}
