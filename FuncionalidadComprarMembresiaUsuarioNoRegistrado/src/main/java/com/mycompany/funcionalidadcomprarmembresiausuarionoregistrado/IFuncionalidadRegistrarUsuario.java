/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado;

import DTOS.NuevoClienteDTO;
import BOs.NegocioException;
import Entidades.Cliente;
import java.util.List;


/**
 *
 * @author Diego
 */
public interface IFuncionalidadRegistrarUsuario {

    public abstract NuevoClienteDTO RegistrarUsuario(NuevoClienteDTO clienteDTO) throws NegocioException;
    
    public abstract List<Cliente> obtenerTodas() throws NegocioException;
    
    public abstract void validarDatosUsuario(NuevoClienteDTO clienteDTO)throws NegocioException;
    
    public abstract void validarTarjeta(String cvv, String numeroTarjeta, String fechaVencimiento,String nombreTitular)throws NegocioException;
    
    public abstract void validarPaypal(String correo, String contrasenia)throws NegocioException;
}
