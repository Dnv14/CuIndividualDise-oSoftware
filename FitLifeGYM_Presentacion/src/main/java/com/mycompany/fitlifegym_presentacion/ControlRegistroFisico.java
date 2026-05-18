/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.DetallesRutinaDTO;
import DTOS.EnfermedadesDTO;
import DTOS.LesionesDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.RutinaDTO;
import DTOsPersistencia.filtrosBusquedaClientesDTO;
import com.mycompany.funcionalidadregistrofisico.FuncionalidadRegistroFisico;
import com.mycompany.funcionalidadregistrofisico.IFuncionalidadRegistroFisico;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ControlRegistroFisico {

    private NuevoClienteDTO clienteLogueado;
    private NuevoClienteDTO clienteSeleccionado;
    private ControlRegistroInicioSesion controlInicio;
    private IFuncionalidadRegistroFisico funcionalidadRegistroFisico;

    public ControlRegistroFisico(ControlRegistroInicioSesion controlRegistroFisico) {
        this.controlInicio = controlRegistroFisico;
        this.clienteLogueado = controlRegistroFisico.getClienteActual();
        this.funcionalidadRegistroFisico = new FuncionalidadRegistroFisico();
    }

    public List<NuevoClienteDTO> buscarClientesPorFiltro(filtrosBusquedaClientesDTO filtros) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.consultarClientesFiltros(filtros);
    }

    public void asignarClienteSeleccionado(String id) throws RegistroFisicoException {
        this.clienteSeleccionado = funcionalidadRegistroFisico.buscarClientePorId(id);
    }

    public RegistroFisicoDTO consultarRegistroFisicoDTO(String idCliente) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.consultarRegistroFisico(idCliente);
    }

    public List<EnfermedadesDTO> traerEnfermedades() throws RegistroFisicoException {
        return funcionalidadRegistroFisico.traerEnfermedades();
    }

    public List<LesionesDTO> traerLesiones() throws RegistroFisicoException {
        return funcionalidadRegistroFisico.traerLesiones();
    }

    public RegistroFisicoDTO guardarRegistroFisico(RegistroFisicoDTO registroFisicoDTO) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.guardarRegistroFisico(registroFisicoDTO);
    }

    public RutinaDTO consultarDetallesRutina(String idCliente, String diaSemana) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.consultarRutina(idCliente,diaSemana);
    }

    public NuevoClienteDTO getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void limpiarClienteSeleccionado() {
        this.clienteSeleccionado = null;
    }

}
