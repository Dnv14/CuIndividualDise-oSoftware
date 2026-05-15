/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadiniciarsesionrenovarmembresia;

import DTOS.LoginDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RenovarMembresiaDTO;
import DTOsENUMs.TipoMembresiaDTO;
import Interfaces.ILoginBO;
import Interfaces.IMembresiaBO;
import Interfaces.IRenovarMembresiaBO;
import BOs.BOException;
import DTOS.NuevaMembresiaDTO;
import Interfaces.IClientesBO;
import java.util.List;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public class FuncionalidadIniciarSesionRenovarMembresia implements IFuncionalidadIniciarSesionRenovarMembresia {

    private final ILoginBO loginBO;
    private final IMembresiaBO membresiaBO;
    private final IRenovarMembresiaBO renovarMembresiaBO;
    private final IClientesBO clientesBO;

    public FuncionalidadIniciarSesionRenovarMembresia(ILoginBO loginBO, IMembresiaBO membresiaBO, IRenovarMembresiaBO renovarMembresiaBO, IClientesBO clientesBO) {
        this.loginBO = loginBO;
        this.membresiaBO = membresiaBO;
        this.renovarMembresiaBO = renovarMembresiaBO;
        this.clientesBO = clientesBO;
    }

    @Override
    public NuevoClienteDTO iniciarSesion(NuevoClienteDTO clienteDTO) throws NegocioExceptionRenovar {
        if (clienteDTO == null) {
            throw new NegocioExceptionRenovar("Los datos de inicio de sesion no pueden ser nulos.");
        }

        if (clienteDTO.getContrasenia() == null || clienteDTO.getContrasenia().isBlank()) {
            throw new NegocioExceptionRenovar("La contraseña no puede estar vacia.");
        }

        if (clienteDTO.getCorreo() == null || clienteDTO.getCorreo().isBlank()) {
            throw new NegocioExceptionRenovar("El correo electrónico es obligatorio.");
        }

        try {
            return clientesBO.iniciarSesion(clienteDTO);
        } catch (BOException ex) {
            throw new NegocioExceptionRenovar("No se pudo procesar el inicio de sesion: " + ex.getMessage());
        }
    }

    @Override
    public List<NuevaMembresiaDTO> consultarMembresias() throws NegocioExceptionRenovar {
        List<NuevaMembresiaDTO> membresias;
        try {
            membresias = membresiaBO.obtenerMembresias();
        } catch (BOException ex) {
            throw new NegocioExceptionRenovar("No se pudo obtener las membresias" + ex.getMessage());
        }

        if (membresias == null || membresias.isEmpty()) {
            throw new NegocioExceptionRenovar("No hay tipos de membresia disponibles.");
        }

        return membresias;
    }

    @Override
    public void renovarMembresia(RenovarMembresiaDTO dto) throws NegocioExceptionRenovar {
        if (dto == null) {
            throw new NegocioExceptionRenovar("Los datos de la renovacion no pueden ser nulos.");
        }

        if (dto.getIdCliente() == null) {
            throw new NegocioExceptionRenovar("El ID del cliente no puede ser nulo.");
        }

        if (dto.getTipoMembresia() == null) {
            throw new NegocioExceptionRenovar("Se debe de elegir un tipo de membresia.");
        }

        try {
            renovarMembresiaBO.renovarMembresia(dto);
        } catch (BOException ex) {

            throw new NegocioExceptionRenovar("No se pudo procesar la renovación: " + ex.getMessage());
        }
    }

    @Override
    public NuevaMembresiaDTO buscarMembresiaPorTipo(TipoMembresiaDTO tipo) throws NegocioExceptionRenovar {
        if (tipo == null) {
            throw new NegocioExceptionRenovar("El tipo de membresia no puede ser nulo.");
        }

        List<NuevaMembresiaDTO> membresias;
        try {
            membresias = membresiaBO.obtenerMembresias();
        } catch (BOException ex) {
            throw new NegocioExceptionRenovar("No se pudo buscar la membresia: " + ex.getMessage());
        }

        if (membresias == null || membresias.isEmpty()) {
            throw new NegocioExceptionRenovar("No hay membresias disponibles.");
        }

        for (NuevaMembresiaDTO m : membresias) {
            if (m.getTipoMembresia().name().equals(tipo.name())) {
                return m;
            }
        }

        throw new NegocioExceptionRenovar("No se encontro la membresia '" + tipo + "' en la BD.");
    }

}
