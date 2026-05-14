/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import static Adapter.EntidadesADTOsAdapter.adaptarLesionesEntidad;
import DTOS.LesionesDTO;
import Entidades.Lesiones;
import Excepciones.PersistenciaException;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import Interfaces.ILesionesBO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class LesionesBO implements ILesionesBO {

    private IPersistenciaFachada persistenciaFachada;

    public LesionesBO() {
        persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public List<LesionesDTO> consultarLesiones() throws BOException {
        try {
            List<Lesiones> lesionesEntidad = persistenciaFachada.consultarLesiones();
            return adaptarLesionesEntidad(lesionesEntidad);
        } catch (PersistenciaException ex) {
            throw new BOException("error al consultar las Lesiones");
        }
    }
}
