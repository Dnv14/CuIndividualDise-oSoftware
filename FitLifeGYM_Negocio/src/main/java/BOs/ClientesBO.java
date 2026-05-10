/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import Interfaces.IClientesBO;
import Adapter.DtosAEntidadesAdapter;
import DTOS.NuevoClienteDTO;

import Excepciones.PersistenciaException;
import Entidades.Cliente;
import Fachada.IPersistenciaFachada;

import java.util.List;

/**
 *
 * @author Diego
 */
public class ClientesBO implements IClientesBO {

    private IPersistenciaFachada persistenciaFachada;

    public ClientesBO(IPersistenciaFachada fachadaPersistencia) {
        this.persistenciaFachada = fachadaPersistencia;
    }

    @Override
    public Cliente registrarCliente(NuevoClienteDTO clienteDTO) throws NegocioException {
        Cliente cliente = DtosAEntidadesAdapter.adaptarClienteDTO(clienteDTO);
        try {
            return persistenciaFachada.registrarCliente(cliente);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al registrar el cliente", ex);
        }
    }

    @Override
    public Cliente buscarClientePorId(String id) throws NegocioException {

        if (id == null) {
            throw new NegocioException("Se debe de colocar un ID.");
        }

        try {
            return persistenciaFachada.consultarClientePorId(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al registrar el cliente", ex);
        }
    }

    @Override
    public List<Cliente> consultarClientes() throws NegocioException {
        try {
            return persistenciaFachada.consultarClientes();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al registrar el cliente", ex);
        }
    }

}
