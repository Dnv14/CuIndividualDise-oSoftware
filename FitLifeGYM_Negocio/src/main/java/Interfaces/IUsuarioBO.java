/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.BOException;
import DTOS.UsuarioDTO;
import Entidades.Usuario;

/**
 *
 * @author Diego
 */
public interface IUsuarioBO {

    public abstract UsuarioDTO registrarUsuario(UsuarioDTO usuarioDTO) throws BOException;

}
