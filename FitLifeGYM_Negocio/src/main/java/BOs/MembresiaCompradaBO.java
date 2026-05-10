/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import Interfaces.IMembresiaCompradaBO;
import Adapter.DtosAEntidadesAdapter;
import DTOS.NuevaMembresiaCompradaDTO;
import Interfaces.IMembresiaCompradaDAO;
import Excepciones.PersistenciaException;
import Entidades.MembresiaComprada;
import Fachada.IPersistenciaFachada;
import java.util.List;

/**
 *
 * @author Diego
 */
public class MembresiaCompradaBO implements IMembresiaCompradaBO {


    private IPersistenciaFachada persistenciaFachada;

    public MembresiaCompradaBO(IPersistenciaFachada fachadaPersistencia) {
        this.persistenciaFachada = fachadaPersistencia;
    }

    @Override
    public MembresiaComprada guardar(NuevaMembresiaCompradaDTO membresiaCompradaDTO) throws NegocioException {
        if(membresiaCompradaDTO.getMembresia() == null){
            throw new NegocioException("La membresia no puede ser nula.");
        }
        
        if(membresiaCompradaDTO.getFechaInicio() == null){
            throw new NegocioException("La fecha de incio no puede ser nula.");
        }
        
        if(membresiaCompradaDTO.getFechaFin() == null){
            throw new NegocioException("La fecha final no puede ser nula.");
        }
        
        if(membresiaCompradaDTO.getFechaFin().isBefore(membresiaCompradaDTO.getFechaInicio())){
            throw new NegocioException("La fecha fianl no puede ser anterior a la fecha de inicio.");
        }
        
        if(membresiaCompradaDTO.getPrecioPagado() == null || membresiaCompradaDTO.getPrecioPagado()<= 0){
            throw new NegocioException("El precio que se va a pagar debe ser mayor a 0.");
        }
        
        if(membresiaCompradaDTO.getEstado() == null){
            throw new NegocioException("El estado de la membresía no puede ser nula.");
        }
        MembresiaComprada mebresiaComprada = DtosAEntidadesAdapter.adaptarMembresiaCompradaDTO(membresiaCompradaDTO);

        try {
            return persistenciaFachada.guardarMembresiaComprada(mebresiaComprada);
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al guardar la membresia comprada.",ex);
        }
    }

    @Override
    public List<MembresiaComprada> obtenerTodas() throws NegocioException {
        try {
            return persistenciaFachada.obtenerTodasMembresiasCompradas();
        } catch (PersistenciaException ex) {
            throw new NegocioException("Error al obtener todas las membresias compradas.",ex);
        }
    }
}
