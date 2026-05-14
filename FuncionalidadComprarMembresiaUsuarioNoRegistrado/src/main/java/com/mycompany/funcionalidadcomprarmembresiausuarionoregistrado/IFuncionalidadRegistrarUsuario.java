/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado;

import DTOS.NuevoClienteDTO;
import BOs.BOException;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.UsuarioDTO;
import Entidades.Cliente;
import java.util.List;


/**
 *
 * @author Diego
 */
public interface IFuncionalidadRegistrarUsuario {

    public abstract NuevoClienteDTO RegistrarCliente(NuevoClienteDTO clienteDTO, UsuarioDTO usuarioDTO) throws NegocioExceptionRegistrar;
    
    public abstract List<NuevoClienteDTO> obtenerTodosLosClientes() throws NegocioExceptionRegistrar;
    
    public abstract void validarDatosUsuarioCliente(NuevoClienteDTO clienteDTO)throws NegocioExceptionRegistrar;
    
    public abstract void validarDatosUsuarios(UsuarioDTO usuarioDTO)throws NegocioExceptionRegistrar;
    
    public abstract void validarTarjeta(String cvv, String numeroTarjeta, String fechaVencimiento,String nombreTitular)throws NegocioExceptionRegistrar;
    
    public abstract void validarPaypal(String correo, String contrasenia)throws NegocioExceptionRegistrar;
    
    public abstract NuevaMembresiaCompradaDTO gestionMembresiaCliente(String idCliente, NuevaMembresiaCompradaDTO compra)throws NegocioExceptionRegistrar; 
}
