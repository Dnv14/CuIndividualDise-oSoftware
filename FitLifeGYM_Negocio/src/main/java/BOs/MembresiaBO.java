/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import Interfaces.IMembresiaBO;
import Adapter.DtosAEntidadesAdapter;
import DTOS.NuevaMembresiaDTO;
import Interfaces.IMembresiaDAO;
import Excepciones.PersistenciaException;
import Entidades.Membresia;
import Fachada.IPersistenciaFachada;
import java.time.LocalDate;
import java.util.ArrayList;
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
    public List<Membresia> obtenerTodas() throws NegocioException {
        try {
            return persistenciaFachada.obtenerYCargarMembresias();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al obtener las membresias", ex);
        }
    }


}
