/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import static Adapter.DtosAEntidadesAdapter.adaptarRegistroFisicoDTO;
import static Adapter.EntidadesADTOsAdapter.adaptarRegistroFisicoEntidad;
import DTOS.RegistroFisicoDTO;
import Entidades.RegistroFisico;
import Excepciones.PersistenciaException;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import Interfaces.IRegistroFisicoBO;

/**
 *
 * @author Diego
 */
public class RegistroFisicoBO implements IRegistroFisicoBO {

    private IPersistenciaFachada persistenciaFachada;

    public RegistroFisicoBO() {
        this.persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public RegistroFisicoDTO guardarRegistroFisico(RegistroFisicoDTO registroFisico) throws BOException {
        try {
            RegistroFisico registroFisicoEntidad = adaptarRegistroFisicoDTO(registroFisico);
            RegistroFisico registroGuardado = persistenciaFachada.guardarRegistroFisico(registroFisicoEntidad);
            return adaptarRegistroFisicoEntidad(registroGuardado);

        } catch (PersistenciaException ex) {
            throw new BOException("Error al guardar el registro fisico");
        }
    }

    @Override
    public RegistroFisicoDTO consultarRegistroFisico(String idCliente) throws BOException {
        try {
            RegistroFisico registroConsulta = persistenciaFachada.consultarRegistroFisico(idCliente);

            return adaptarRegistroFisicoEntidad(registroConsulta);

        } catch (PersistenciaException ex) {
            throw new BOException("Error al consultar el registro fisico");
        }
    }

   
}
