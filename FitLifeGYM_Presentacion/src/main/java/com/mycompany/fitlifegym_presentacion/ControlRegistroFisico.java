/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.NuevoClienteDTO;
import DTOsPersistencia.filtrosBusquedaClientesDTO;
import com.mycompany.funcionalidadregistrofisico.FuncionalidadRegistroFisico;
import com.mycompany.funcionalidadregistrofisico.IFuncionalidadRegistroFisico;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import java.util.LinkedList;
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

    public NuevoClienteDTO getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void limpiarClienteSeleccionado() {
        this.clienteSeleccionado = null;
    }

}
