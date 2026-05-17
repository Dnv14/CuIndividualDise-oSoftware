/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import static Adapter.DtosAEntidadesAdapter.adaptarAdministradorDTO;
import static Adapter.EntidadesADTOsAdapter.adapatarAdministradorEntidad;
import DTOS.AdministradorDTO;
import Entidades.Administrador;
import Excepciones.PersistenciaException;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import Interfaces.IAdministradorBO;

/**
 *
 * @author Diego
 */
public class AdministradorBO implements IAdministradorBO {

    private IPersistenciaFachada persistenciaFachada;

    public AdministradorBO() {
        this.persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public AdministradorDTO iniciarSesionAdministrador(AdministradorDTO administradorDTO) throws BOException {
        try {
            Administrador administradorEntidad = persistenciaFachada.iniciarSesionAdministrador(administradorDTO.getCorreo(), administradorDTO.getContrasenia());

            return adapatarAdministradorEntidad(administradorEntidad);

        } catch (PersistenciaException ex) {
            throw new BOException("Error al loguear al adminstrador", ex);
        }
    }

    @Override
    public AdministradorDTO registrarAdministrador(AdministradorDTO administradorDTO) throws BOException {
        try {
            Administrador administradorEntidad = adaptarAdministradorDTO(administradorDTO);
            Administrador administradorRegistrado = persistenciaFachada.registrarAdministrador(administradorEntidad);
            
            return adapatarAdministradorEntidad(administradorRegistrado);

        } catch (PersistenciaException ex) {
            throw new BOException("Error al loguear al adminstrador", ex);
        }
    }

}
