/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Usuario;
import Excepciones.PersistenciaException;

/**
 *
 * @author Diego
 */
public interface IUsuariosDAO {
    public abstract Usuario registrarUsuario(Usuario usuario)throws PersistenciaException;
}
