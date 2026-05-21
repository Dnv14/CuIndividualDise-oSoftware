/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.BusquedaClientesDTOBo;
import DTOS.EjerciciosDTO;
import DTOS.EnfermedadesDTO;
import DTOS.FiltrosBusquedaClientesDTOBo;
import DTOS.LesionesDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.ReporteRutinaClienteDTO;
import DTOS.RutinaDTO;
import com.mycompany.funcionalidadregistrofisico.FuncionalidadRegistroFisico;
import com.mycompany.funcionalidadregistrofisico.IFuncionalidadRegistroFisico;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ControlRegistroFisico {

//    private NuevoClienteDTO clienteLogueado;
    private NuevoClienteDTO clienteSeleccionado;
    private ControlRegistroInicioSesion controlRegistroInicioSesion;
    private IFuncionalidadRegistroFisico funcionalidadRegistroFisico;

    public ControlRegistroFisico() {
        this.funcionalidadRegistroFisico = new FuncionalidadRegistroFisico();
    }

    public List<BusquedaClientesDTOBo> buscarClientesPorFiltro(FiltrosBusquedaClientesDTOBo filtros) throws RegistroFisicoException {
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

    public List<EjerciciosDTO> traerEjercicios() throws RegistroFisicoException {
        return funcionalidadRegistroFisico.traerEjercicios();
    }

    public RegistroFisicoDTO guardarRegistroFisico(RegistroFisicoDTO registroFisicoDTO) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.guardarRegistroFisico(registroFisicoDTO);
    }

    public RutinaDTO consultarDetallesRutina(String idCliente, String diaSemana) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.consultarRutina(idCliente, diaSemana);
    }

    public RutinaDTO guardarRutinaACliente(RutinaDTO ruutinaDTO) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.guardarRutina(ruutinaDTO);
    }

    public void eliminarRutina(String idCliente, String diaSemana) throws RegistroFisicoException {
        funcionalidadRegistroFisico.eliminarRutina(idCliente, diaSemana);
    }

    public RutinaDTO editarRutina(RutinaDTO rutinaDTO) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.editarRutina(rutinaDTO);
    }

    public List<RutinaDTO> consultarTodasRutinasCliente(String idCliente) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.consultarTodasRutinaClientes(idCliente);
    }

    public byte[] descargarRutinaPdf(ReporteRutinaClienteDTO datos) throws RegistroFisicoException {
        return funcionalidadRegistroFisico.ReporteRutinaPDF(datos);
    }

    public NuevoClienteDTO getClienteSeleccionado() {
        return clienteSeleccionado;
    }

    public void limpiarClienteSeleccionado() {
        this.clienteSeleccionado = null;
    }

}
