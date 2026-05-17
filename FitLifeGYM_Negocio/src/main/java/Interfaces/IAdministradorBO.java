/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.BOException;
import DTOS.AdministradorDTO;

/**
 *
 * @author Diego
 */
public interface IAdministradorBO {
   
    public abstract AdministradorDTO iniciarSesionAdministrador(AdministradorDTO administradorDTO)throws BOException;
    
    public abstract AdministradorDTO registrarAdministrador(AdministradorDTO administrador)throws BOException;
}
