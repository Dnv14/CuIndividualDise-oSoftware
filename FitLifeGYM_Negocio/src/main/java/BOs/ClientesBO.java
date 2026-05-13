/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import Interfaces.IClientesBO;
import static Adapter.DtosAEntidadesAdapter.adaptarClienteDTO;
import static Adapter.DtosAEntidadesAdapter.adaptarMembresiaCompradaDTO;
import static Adapter.EntidadesADTOsAdapter.adaptarClienteEntidad;
import static Adapter.EntidadesADTOsAdapter.adaptarMembresiaCompradaEntidad;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevoClienteDTO;

import Excepciones.PersistenciaException;
import Entidades.Cliente;
import Entidades.MembresiaComprada;
import Fachada.IPersistenciaFachada;
import java.util.LinkedList;

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
    public NuevoClienteDTO registrarCliente(NuevoClienteDTO clienteDTO) throws NegocioException {

        try {
            Cliente clienteEntidad = adaptarClienteDTO(clienteDTO);
            Cliente clienteGuardado = persistenciaFachada.registrarCliente(clienteEntidad);

            return adaptarClienteEntidad(clienteGuardado);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al registrar el cliente", ex);
        }
    }

    @Override
    public NuevoClienteDTO buscarClientePorId(String id) throws NegocioException {
        if (id == null) {
            throw new NegocioException("Se debe de colocar un ID.");
        }

        try {
            Cliente clienteConsultado = persistenciaFachada.consultarClientePorId(id);
            return adaptarClienteEntidad(clienteConsultado);

        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al consultar los cliente", ex);
        }
    }

    @Override
    public List<NuevoClienteDTO> consultarClientes() throws NegocioException {
        List<NuevoClienteDTO> clientesConsultados = new LinkedList<>();
        try {
            for (Cliente c : persistenciaFachada.consultarClientes()) {
                clientesConsultados.add(adaptarClienteEntidad(c));
            }
            return clientesConsultados;
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al consultar los clientes", ex);
        }
    }

    @Override
    public NuevaMembresiaCompradaDTO gestionMembresiaCliente(String idCliente, NuevaMembresiaCompradaDTO compra) throws NegocioException {
        try {
            MembresiaComprada MembresiaCompradaEntidad = adaptarMembresiaCompradaDTO(compra);

            MembresiaComprada membresiaComprada = persistenciaFachada.guardarMembresiaCompradaCliente(idCliente, MembresiaCompradaEntidad);

            return adaptarMembresiaCompradaEntidad(membresiaComprada);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al actualizar membresía", ex);
        }
    }

}
