/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import static Adapter.DtosAEntidadesAdapter.adaptarUsuarioDTO;
import static Adapter.EntidadesADTOsAdapter.adaptarUsuarioEntidad;
import DTOS.UsuarioDTO;
import Entidades.Usuario;
import Excepciones.PersistenciaException;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import Interfaces.IUsuarioBO;

/**
 *
 * @author Diego
 */
public class UsuarioBO implements IUsuarioBO {

    private IPersistenciaFachada persistenciaFachada;

    public UsuarioBO() {
        this.persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public UsuarioDTO registrarUsuario(UsuarioDTO usuarioDTO) throws BOException {

        try {
            //agarramos los datos que vienen del cu
            Usuario usuarioEntidad = adaptarUsuarioDTO(usuarioDTO);
            //transformamos a entidad para que la persistencia haga su chamba
            Usuario usuarioGuardado = persistenciaFachada.registrarUsuario(usuarioEntidad);
            //devolvemos el dto pero ahora con el id de mongo
            return adaptarUsuarioEntidad(usuarioGuardado);
        } catch (PersistenciaException ex) {
            throw new BOException("Error al registrar la cuenta en la base de datos", ex);
        }
    }
}
