/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.NegocioException;
import DTOS.NuevoClienteDTO;
import Entidades.Cliente;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IClientesBO {

    public abstract NuevoClienteDTO registrarCliente(NuevoClienteDTO cliente)throws NegocioException;

    public abstract NuevoClienteDTO buscarClientePorId(String id)throws NegocioException;

    public abstract List<NuevoClienteDTO> consultarClientes() throws NegocioException;
}
