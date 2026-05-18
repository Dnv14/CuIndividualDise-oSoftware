/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.RegistroFisico;
import Excepciones.PersistenciaException;

/**
 *
 * @author Diego
 */
public interface IRegistroFisicoDAO {

    public abstract RegistroFisico guardarRegistroFisico(RegistroFisico registroFisico)throws PersistenciaException;

    public abstract RegistroFisico consultarRegistroFisico(String idCliente)throws PersistenciaException;
    
    
}
