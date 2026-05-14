/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import static Adapter.EntidadesADTOsAdapter.adaptarEnfermedadesEntidad;
import DTOS.EnfermedadesDTO;
import Entidades.Enfermedades;
import Excepciones.PersistenciaException;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import Interfaces.IEnfermedadesBO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class EnfermedadesBO implements IEnfermedadesBO {

    private IPersistenciaFachada persistenciaFachada;

    public EnfermedadesBO() {
        persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public List<EnfermedadesDTO> consultarEnfermedades() throws BOException {
        try {
            List<Enfermedades> enfermedades = persistenciaFachada.consultarEnfermedades();
            return adaptarEnfermedadesEntidad(enfermedades);
        } catch (PersistenciaException ex) {
            throw new BOException("error al consultar las Enfermedades");
        }
    }
}
