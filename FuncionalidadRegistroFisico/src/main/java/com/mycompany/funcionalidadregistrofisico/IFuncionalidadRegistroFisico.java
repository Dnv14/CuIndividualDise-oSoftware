/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funcionalidadregistrofisico;

import DTOS.BusquedaClientesDTOBo;
import DTOS.EjerciciosDTO;
import DTOS.EnfermedadesDTO;
import DTOS.FiltrosBusquedaClientesDTOBo;
import DTOS.LesionesDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.ReporteRutinaClienteDTO;
import DTOS.RutinaDTO;
import DTOsPersistencia.BusquedaClientesDTO;
import DTOsPersistencia.FiltrosBusquedaClientesDTO;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IFuncionalidadRegistroFisico {

    //admin/usuario
    public abstract RegistroFisicoDTO consultarRegistroFisico(String idCliente) throws RegistroFisicoException;

    //apartado del usuario
    public abstract RegistroFisicoDTO guardarRegistroFisico(RegistroFisicoDTO registroFisicoDTO) throws RegistroFisicoException;

    public abstract RutinaDTO consultarRutina(String idCliente, String diaSemana) throws RegistroFisicoException;

    public abstract List<EnfermedadesDTO> traerEnfermedades() throws RegistroFisicoException;

    public abstract List<LesionesDTO> traerLesiones() throws RegistroFisicoException;

    public abstract List<RutinaDTO> consultarTodasRutinaClientes(String idCliente) throws RegistroFisicoException;

    //admin
    public abstract List<BusquedaClientesDTOBo> consultarClientesFiltros(FiltrosBusquedaClientesDTOBo filtros) throws RegistroFisicoException;

    public abstract RutinaDTO guardarRutina(RutinaDTO rutinaDTO) throws RegistroFisicoException;

    public abstract void eliminarRutina(String idCliente, String diaSemana) throws RegistroFisicoException;

    public abstract RutinaDTO editarRutina(RutinaDTO rutinaDTO) throws RegistroFisicoException;

    public abstract NuevoClienteDTO buscarClientePorId(String id) throws RegistroFisicoException;

    public abstract List<EjerciciosDTO> traerEjercicios() throws RegistroFisicoException;

    //imprimir Reportesss
    public byte[] ReporteRutinaPDF(ReporteRutinaClienteDTO datos) throws RegistroFisicoException;

}
