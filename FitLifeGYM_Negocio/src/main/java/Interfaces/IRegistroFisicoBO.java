/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.BOException;
import DTOS.RegistroFisicoDTO;

/**
 *
 * @author Diego
 */
public interface IRegistroFisicoBO {
    
    public abstract RegistroFisicoDTO guardarRegistroFisico(RegistroFisicoDTO registroFisico)throws BOException;
    
    public abstract RegistroFisicoDTO consultarRegistroFisico(String idCliente)throws BOException;
    
    public abstract boolean confirmarConsultarRegistroFisicoCliente(String idCliente)throws BOException; 
}
