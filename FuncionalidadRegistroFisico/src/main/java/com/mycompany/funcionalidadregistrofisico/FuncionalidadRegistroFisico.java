/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadregistrofisico;

import BOs.BOException;
import BOs.ClientesBO;
import BOs.RegistroFisicoBO;
import BOs.RutinasBO;
import DTOS.DetallesRutinaDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.RutinaDTO;
import DTOsPersistencia.filtrosBusquedaClientesDTO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class FuncionalidadRegistroFisico implements IFuncionalidadRegistroFisico {

    private RutinasBO rutinasBO;
    private RegistroFisicoBO registroFisicoBO;
    private ClientesBO clientesBO;

    public FuncionalidadRegistroFisico() {
        rutinasBO = new RutinasBO();
        registroFisicoBO = new RegistroFisicoBO();
        clientesBO = new ClientesBO();
    }

    //TODOOOO validaciones
    @Override
    public RegistroFisicoDTO consultarRegistroFisico(String idCliente) throws RegistroFisicoException {
        try {
            return registroFisicoBO.consultarRegistroFisico(idCliente);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar el registro fisico", ex);
        }
    }

    //apartado usuario
    @Override
    public RegistroFisicoDTO guardarRegistroFisico(RegistroFisicoDTO registroFisicoDTO) throws RegistroFisicoException {
        try {
            return registroFisicoBO.guardarRegistroFisico(registroFisicoDTO);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al guardar el registro fisico", ex);
        }
    }

    @Override
    public RutinaDTO consultarRutina(RutinaDTO rutinaDTO) throws RegistroFisicoException {
        try {
            return rutinasBO.guardarRutina(rutinaDTO);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar rutina", ex);
        }
    }

    //apartado como administrador 
    @Override
    public List<NuevoClienteDTO> consultarClientesFiltros(filtrosBusquedaClientesDTO filtros) throws RegistroFisicoException {
        try {
            return clientesBO.filtrosBarraBusquedaCliente(filtros);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar clientes", ex);
        }
    }

    @Override
    public RutinaDTO guardarRutina(RutinaDTO rutina) throws RegistroFisicoException {
        try {
            return rutinasBO.guardarRutina(rutina);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al guardar la rutina ", ex);
        }
    }

    @Override
    public void eliminarRutina(String idCliente, String diaSemana) throws RegistroFisicoException {
        try {
            rutinasBO.eliminarRutina(idCliente, diaSemana);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al guardar la rutina ", ex);
        }
    }

    @Override
    public RutinaDTO editarRutina(RutinaDTO rutinaDTO) throws RegistroFisicoException {
        try {
            return rutinasBO.editarRutina(rutinaDTO);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al editar la rutina ", ex);
        }
    }

}
