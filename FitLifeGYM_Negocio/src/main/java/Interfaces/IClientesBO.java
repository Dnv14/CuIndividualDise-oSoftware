/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.BOException;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevoClienteDTO;
import Entidades.Cliente;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IClientesBO {

    public abstract NuevoClienteDTO registrarCliente(NuevoClienteDTO cliente) throws BOException;
    
    public abstract NuevoClienteDTO iniciarSesion(NuevoClienteDTO cliente)throws BOException;

    public abstract NuevoClienteDTO buscarClientePorId(String id) throws BOException;

    public abstract List<NuevoClienteDTO> consultarClientes() throws BOException;

    public abstract NuevaMembresiaCompradaDTO gestionMembresiaCliente(String idCliente, NuevaMembresiaCompradaDTO compra) throws BOException;
}
