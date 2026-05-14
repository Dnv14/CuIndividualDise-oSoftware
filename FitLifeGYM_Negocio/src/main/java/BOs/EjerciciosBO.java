/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import static Adapter.EntidadesADTOsAdapter.adaptarEjerciciosEntidad;
import DTOS.EjerciciosDTO;
import Entidades.Ejercicio;
import Excepciones.PersistenciaException;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import Interfaces.IEjerciciosBO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class EjerciciosBO implements IEjerciciosBO {

    private IPersistenciaFachada persistenciaFachada;

    public EjerciciosBO() {
        persistenciaFachada = new PersistenciaFachada();
    }

    @Override
    public List<EjerciciosDTO> consultarEjercicios() throws BOException {
        try {
            List<Ejercicio> ejerciciosEntidad = persistenciaFachada.consultarEjercicios();
            return adaptarEjerciciosEntidad(ejerciciosEntidad);
        } catch (PersistenciaException ex) {
            throw new BOException("error al consultar los ejercicios");
        }
    }

}
