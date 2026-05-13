/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import static Adapter.EntidadesADTOsAdapter.adaptarMembresiaEntidad;
import Interfaces.IMembresiaBO;
import DTOS.NuevaMembresiaDTO;
import Excepciones.PersistenciaException;
import Entidades.Membresia;
import Fachada.IPersistenciaFachada;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class MembresiaBO implements IMembresiaBO {

    private IPersistenciaFachada persistenciaFachada;

    public MembresiaBO(IPersistenciaFachada fachadaPersistencia) {
        this.persistenciaFachada = fachadaPersistencia;
    }

    @Override
    public List<NuevaMembresiaDTO> obtenerMembresias() throws NegocioException {
        List<NuevaMembresiaDTO> membresiasConsulta = new LinkedList<>();

        try {
            for (Membresia m : persistenciaFachada.obtenerYCargarMembresias()) {
                membresiasConsulta.add(adaptarMembresiaEntidad(m));
            }
            
            return membresiasConsulta;
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al obtener las membresias", ex);
        }
    }

}
