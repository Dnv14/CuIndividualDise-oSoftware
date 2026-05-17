/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Administrador;
import Excepciones.PersistenciaException;

/**
 *
 * @author Diego
 */
public interface IAdministradorDAO {
    
    public Administrador iniciarSesionAdmin(String correo, String contrasenia) throws PersistenciaException;
    
    public Administrador registrarAdministrador(Administrador administrador) throws PersistenciaException;
}
