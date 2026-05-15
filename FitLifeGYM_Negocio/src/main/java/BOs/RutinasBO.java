/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import static Adapter.DtosAEntidadesAdapter.adaptarRutinaDTO;
import static Adapter.EntidadesADTOsAdapter.adaptarRutinaEntidad;
import DTOS.RutinaDTO;
import Entidades.Rutina;
import Excepciones.PersistenciaException;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import Interfaces.IRutinasBO;

/**
 *
 * @author Diego
 */
public class RutinasBO implements IRutinasBO {

    private IPersistenciaFachada persistenciaFachada;

    public RutinasBO() {
        this.persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public RutinaDTO guardarRutina(RutinaDTO rutinaDTO) throws BOException {
        try {
            Rutina rutinaEntidad = adaptarRutinaDTO(rutinaDTO);
            Rutina rutinaGuardada = persistenciaFachada.guardarRutina(rutinaEntidad);
            return adaptarRutinaEntidad(rutinaGuardada);

        } catch (PersistenciaException ex) {
            throw new BOException("Error al registrar la rutina", ex);
        }
    }

    @Override
    public void eliminarRutina(String idCliente, String diaSemana) throws BOException {
        try {
            persistenciaFachada.eliminarRutina(idCliente, diaSemana);
        } catch (PersistenciaException ex) {
            throw new BOException("Error al eliminar rutina", ex);
        }
    }

    @Override
    public RutinaDTO editarRutina(RutinaDTO rutinaDTO) throws BOException {
        try {
            Rutina rutinaEntidad = adaptarRutinaDTO(rutinaDTO);
            Rutina rutinaEditada = persistenciaFachada.editarRutina(rutinaEntidad);
            return adaptarRutinaEntidad(rutinaEditada);

        } catch (PersistenciaException ex) {
            throw new BOException("Error al editar rutina", ex);
        }
    }

    @Override
    public RutinaDTO consultarRutina(String idCliente, String diaSemana) throws BOException {
        try {

            Rutina rutinaConsultada = persistenciaFachada.consultarRutina(idCliente, diaSemana);
            return adaptarRutinaEntidad(rutinaConsultada);

        } catch (PersistenciaException ex) {
            throw new BOException("Error al consultar rutina", ex);
        }
    }

}
