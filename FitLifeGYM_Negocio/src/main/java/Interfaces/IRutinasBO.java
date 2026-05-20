/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.BOException;
import DTOS.RutinaDTO;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IRutinasBO {
    public abstract RutinaDTO guardarRutina(RutinaDTO rutinaDTO)throws BOException;
    
    public abstract void eliminarRutina(String idCliente, String diaSemana)throws BOException;
    
    public abstract RutinaDTO editarRutina(RutinaDTO rutina)throws BOException;
    
    public abstract RutinaDTO consultarRutina(String idCliente, String diaSemana)throws BOException;
    
    public abstract List<RutinaDTO> consultarTodasRutinaCliente(String idCliente)throws BOException;
}
