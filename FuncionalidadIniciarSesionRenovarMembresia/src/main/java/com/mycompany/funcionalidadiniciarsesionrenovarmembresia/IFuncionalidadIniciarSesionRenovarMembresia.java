/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.funcionalidadiniciarsesionrenovarmembresia;

import DTOS.LoginDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RenovarMembresiaDTO;
import DTOsENUMs.TipoMembresiaDTO;
import BOs.NegocioException;
import Entidades.Membresia;
import java.util.List;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public interface IFuncionalidadIniciarSesionRenovarMembresia {

    public abstract NuevoClienteDTO iniciarSesion(LoginDTO login) throws NegocioException;

    public abstract List<Membresia> consultarMembresias() throws NegocioException;

    public abstract void renovarMembresia(RenovarMembresiaDTO dto) throws NegocioException;

    public abstract Membresia buscarMembresiaPorTipo(TipoMembresiaDTO tipo) throws NegocioException;

}
