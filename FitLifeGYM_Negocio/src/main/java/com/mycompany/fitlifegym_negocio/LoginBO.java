/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import Adapter.DtosAEntidadesAdapter;
import Adapter.EntidadesADTOsAdapter;
import DTOsENUMs.EstadoDTO;
import DTOS.LoginDTO;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevaMembresiaDTO;
import DTOS.NuevoClienteDTO;
import DTOsENUMs.TipoMembresiaDTO;
import Interfaces.IClientesDAO;
import Excepciones.PersistenciaException;
import Entidades.Cliente;
import Entidades.TipoMembresia;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public class LoginBO implements ILoginBO {

    private final IClientesDAO clientesDAO;

    public LoginBO(IClientesDAO clientesDAO) {
        this.clientesDAO = clientesDAO;
    }

    @Override
    public NuevoClienteDTO iniciarSesion(LoginDTO login) throws NegocioException {
        try {
            Cliente cliente = clientesDAO.buscarPorPin(login.getPin());

            if (cliente == null) {
                return null;
            }

            return EntidadesADTOsAdapter.adaptarClienteADTO(cliente);

        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al iniciar sesion", ex);
        }
    }

}
