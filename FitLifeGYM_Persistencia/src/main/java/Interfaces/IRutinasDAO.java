/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Rutina;

/**
 *
 * @author Diego
 */
public interface IRutinasDAO {
    
    public abstract Rutina guardarRutina(Rutina rutina);
    
    public abstract void eliminarRutina(String idCliente);
    
    public abstract Rutina editarRutina(Rutina rutina);
    
    public abstract Rutina consultarRutina(String idCliente);
}
