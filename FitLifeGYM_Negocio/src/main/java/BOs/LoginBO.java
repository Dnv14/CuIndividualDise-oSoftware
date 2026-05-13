/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import Interfaces.ILoginBO;
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
import Fachada.IPersistenciaFachada;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public class LoginBO implements ILoginBO {

    private IPersistenciaFachada persistenciaFachada;

    public LoginBO(IPersistenciaFachada fachadaPersistencia) {
        this.persistenciaFachada = fachadaPersistencia;
    }

    @Override
    public NuevoClienteDTO iniciarSesion(LoginDTO login) throws NegocioException {
        try {
            Cliente cliente = persistenciaFachada.buscarPorPin(login.getPin());

            if (cliente == null) {
                return null;
            }

            return EntidadesADTOsAdapter.adaptarClienteEntidad(cliente);

        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al iniciar sesion", ex);
        }
    }

}
