/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import Interfaces.IClientesBO;
import static Adapter.DtosAEntidadesAdapter.adaptarClienteDTO;
import static Adapter.DtosAEntidadesAdapter.adaptarMembresiaCompradaDTO;
import static Adapter.EntidadesADTOsAdapter.adaptarClienteEntidad;
import static Adapter.EntidadesADTOsAdapter.adaptarClienteInicioSesionEntidad;
import static Adapter.EntidadesADTOsAdapter.adaptarMembresiaCompradaEntidad;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevoClienteDTO;
import DTOsPersistencia.FiltrosBusquedaClientesDTO;

import Excepciones.PersistenciaException;
import Entidades.Cliente;
import Entidades.MembresiaComprada;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import java.util.LinkedList;

import java.util.List;
import org.bson.Document;

/**
 *
 * @author Diego
 */
public class ClientesBO implements IClientesBO {

    private IPersistenciaFachada persistenciaFachada;

    public ClientesBO() {
        this.persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public NuevoClienteDTO registrarCliente(NuevoClienteDTO clienteDTO) throws BOException {

        try {
            Cliente clienteEntidad = adaptarClienteDTO(clienteDTO);
            Cliente clienteGuardado = persistenciaFachada.registrarCliente(clienteEntidad);

            return adaptarClienteEntidad(clienteGuardado);
        } catch (PersistenciaException ex) {
            throw new BOException("Error al registrar el cliente", ex);
        }
    }

    @Override
    public NuevoClienteDTO iniciarSesion(NuevoClienteDTO clienteDTO) throws BOException {
        try {
            Cliente clienteEntidad = persistenciaFachada.iniciarSesionCliente(clienteDTO.getCorreo(), clienteDTO.getContrasenia());

            return adaptarClienteInicioSesionEntidad(clienteEntidad);
        } catch (PersistenciaException ex) {
            throw new BOException("Error al registrar el cliente", ex);
        }
    }

    @Override
    public List<NuevoClienteDTO> filtrosBarraBusquedaCliente(FiltrosBusquedaClientesDTO filtrosDTO) throws BOException {
        try {
            List<Document> documentos = persistenciaFachada.barraBusquedaConsultarClientes(filtrosDTO);

            List<NuevoClienteDTO> listaClientesDTO = new LinkedList<>();

            for (Document d : documentos) {
                NuevoClienteDTO clienteDTO = new NuevoClienteDTO();

                if (d.getObjectId("idCliente") != null) {
                    clienteDTO.setId(d.getObjectId("idCliente").toHexString());
                }
                clienteDTO.setNombre(d.getString("nombreCompleto"));
                clienteDTO.setDiasRutina(d.getInteger("diasRutina", 0));
                listaClientesDTO.add(clienteDTO);
            }

            return listaClientesDTO;
        } catch (PersistenciaException ex) {
            throw new BOException("Error al consultar los clientes", ex);
        }
    }

    @Override
    public NuevoClienteDTO buscarClientePorId(String id) throws BOException {
        if (id == null) {
            throw new BOException("Se debe de colocar un ID.");
        }

        try {
            Cliente clienteConsultado = persistenciaFachada.consultarClientePorId(id);
            return adaptarClienteInicioSesionEntidad(clienteConsultado);

        } catch (PersistenciaException ex) {
            throw new BOException("Error al consultar los cliente", ex);
        }
    }

    @Override
    public List<NuevoClienteDTO> consultarClientes() throws BOException {
        List<NuevoClienteDTO> clientesConsultados = new LinkedList<>();
        try {
            for (Cliente c : persistenciaFachada.consultarClientes()) {
                clientesConsultados.add(adaptarClienteEntidad(c));
            }
            return clientesConsultados;
        } catch (PersistenciaException ex) {
            throw new BOException("Error al consultar los clientes", ex);
        }
    }

    @Override
    public NuevaMembresiaCompradaDTO gestionMembresiaCliente(String idCliente, NuevaMembresiaCompradaDTO compra) throws BOException {
        try {
            MembresiaComprada MembresiaCompradaEntidad = adaptarMembresiaCompradaDTO(compra);

            MembresiaComprada membresiaComprada = persistenciaFachada.guardarMembresiaCompradaCliente(idCliente, MembresiaCompradaEntidad);

            return adaptarMembresiaCompradaEntidad(membresiaComprada);
        } catch (PersistenciaException ex) {
            throw new BOException("Error al actualizar membresía", ex);
        }
    }

}
