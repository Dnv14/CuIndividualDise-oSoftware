/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funcionalidadiniciarsesionrenovarmembresia;

import DTOS.NuevoClienteDTO;
import DTOS.RenovarMembresiaDTO;
import DTOsENUMs.TipoMembresiaDTO;
import DTOS.AdministradorDTO;
import DTOS.NuevaMembresiaDTO;
import java.util.List;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public interface IFuncionalidadIniciarSesionRenovarMembresia {

    public abstract NuevoClienteDTO iniciarSesionCliente(NuevoClienteDTO clienteDTO) throws NegocioExceptionRenovar;

    public abstract AdministradorDTO iniciarSesionAdministrador(AdministradorDTO administradorDTO) throws NegocioExceptionRenovar;

    public abstract List<NuevaMembresiaDTO> consultarMembresias() throws NegocioExceptionRenovar;

    public abstract void renovarMembresia(RenovarMembresiaDTO dto) throws NegocioExceptionRenovar;

    public abstract NuevaMembresiaDTO buscarMembresiaPorTipo(TipoMembresiaDTO tipo) throws NegocioExceptionRenovar;

}
