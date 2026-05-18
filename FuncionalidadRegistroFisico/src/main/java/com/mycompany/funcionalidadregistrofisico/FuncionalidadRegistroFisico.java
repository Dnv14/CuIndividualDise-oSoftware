/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadregistrofisico;

import BOs.BOException;
import BOs.ClientesBO;
import BOs.EjerciciosBO;
import BOs.EnfermedadesBO;
import BOs.LesionesBO;
import BOs.RegistroFisicoBO;
import BOs.RutinasBO;
import DTOS.EjerciciosDTO;
import DTOS.EnfermedadesDTO;
import DTOS.LesionesDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.RutinaDTO;
import DTOsPersistencia.filtrosBusquedaClientesDTO;
import Interfaces.IClientesBO;
import Interfaces.IEjerciciosBO;
import Interfaces.IEnfermedadesBO;
import Interfaces.ILesionesBO;
import Interfaces.IRegistroFisicoBO;
import Interfaces.IRutinasBO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class FuncionalidadRegistroFisico implements IFuncionalidadRegistroFisico {

    private IRutinasBO rutinasBO;
    private IRegistroFisicoBO registroFisicoBO;
    private IClientesBO clientesBO;
    private IEnfermedadesBO enfermedadesBO;
    private ILesionesBO lesionesBO;
    private IEjerciciosBO ejerciciosBO;

    public FuncionalidadRegistroFisico() {
        rutinasBO = new RutinasBO();
        registroFisicoBO = new RegistroFisicoBO();
        clientesBO = new ClientesBO();
        enfermedadesBO = new EnfermedadesBO();
        lesionesBO = new LesionesBO();
        ejerciciosBO = new EjerciciosBO();
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
    public RutinaDTO consultarRutina(String idCliente, String diaSemana) throws RegistroFisicoException {
        try {
            return rutinasBO.consultarRutina(idCliente, diaSemana);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar rutina", ex);
        }
    }

    @Override
    public List<EnfermedadesDTO> traerEnfermedades() throws RegistroFisicoException {
        try {
            return enfermedadesBO.consultarEnfermedades();
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar las enfermedades", ex);
        }
    }

    @Override
    public List<LesionesDTO> traerLesiones() throws RegistroFisicoException {
        try {
            return lesionesBO.consultarLesiones();
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar las lesiones", ex);
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

    @Override
    public NuevoClienteDTO buscarClientePorId(String id) throws RegistroFisicoException {
        try {
            return clientesBO.buscarClientePorId(id);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al buscar el cliente por id", ex);
        }
    }

    @Override
    public List<EjerciciosDTO> traerEjercicios() throws RegistroFisicoException {
        try {
            return ejerciciosBO.consultarEjercicios();
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al editar la rutina ", ex);
        }
    }

}
