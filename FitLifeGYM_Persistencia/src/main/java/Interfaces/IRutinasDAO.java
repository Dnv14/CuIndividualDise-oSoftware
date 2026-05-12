/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Rutina;
import Excepciones.PersistenciaException;

/**
 *
 * @author Diego
 */
public interface IRutinasDAO {

    public abstract Rutina guardarRutina(Rutina rutina) throws PersistenciaException;

    public abstract void eliminarRutina(String idCliente, String diaSemana) throws PersistenciaException;

    public abstract Rutina editarRutina(Rutina rutina) throws PersistenciaException;

    public abstract Rutina consultarRutina(String idCliente, String diaSemana) throws PersistenciaException;
}
