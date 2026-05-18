/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funcionalidadregistrofisico;

import DTOS.EnfermedadesDTO;
import DTOS.LesionesDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.RutinaDTO;
import DTOsPersistencia.filtrosBusquedaClientesDTO;
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
    
    public abstract List<EnfermedadesDTO> traerEnfermedades()throws RegistroFisicoException;
    
    public abstract List<LesionesDTO> traerLesiones()throws RegistroFisicoException;

    //admin
    public abstract List<NuevoClienteDTO> consultarClientesFiltros(filtrosBusquedaClientesDTO filtros) throws RegistroFisicoException;

    public abstract RutinaDTO guardarRutina(RutinaDTO rutinaDTO) throws RegistroFisicoException;

    public abstract void eliminarRutina(String idCliente, String diaSemana) throws RegistroFisicoException;

    public abstract RutinaDTO editarRutina(RutinaDTO rutinaDTO) throws RegistroFisicoException;
    
    public abstract NuevoClienteDTO buscarClientePorId(String id) throws RegistroFisicoException;
    
    

}
