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
    public void guardar(NuevaMembresiaDTO membresiaDTO) throws NegocioException {

        if (membresiaDTO.getTipoMembresia() == null) {
            throw new NegocioException("El tipo de membresia no puede ser nulo.");
        }

        if (membresiaDTO.getPrecio() == null || membresiaDTO.getPrecio() <= 0) {
            throw new NegocioException("El precio debe ser mayor a 0.");
        }

        if (membresiaDTO.getVigencia() == null) {
            throw new NegocioException("La vigencia no puede ser nula.");
        }

        if (membresiaDTO.getVigencia().isBefore(LocalDate.now())) {
            throw new NegocioException("La vigencia no puede ser una fecha pasada.");
        }
        Membresia membresia = DtosAEntidadesAdapter.adaptarMembresia(membresiaDTO);
        try {
            persistenciaFachada.guardarMembresia(membresia);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al guardar la membresia.", ex);
        }
    }

    @Override
    public List<Membresia> obtenerTodas() throws NegocioException {
        try {
            return persistenciaFachada.obtenerMembresias();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al obtener las membresias", ex);
        }
    }

    @Override
    public Membresia obtenerPorId(String id) throws NegocioException {

        if (id == null) {
            throw new NegocioException("El ID no puede ser nulo.");
        }

        try {
            return persistenciaFachada.obtenerMembresiaPorId(id);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al obtener membresia por ID.", ex);
        }
    }
}
