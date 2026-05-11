/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Enfermedades;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IEnfermedadesDAO {

    public abstract List<Enfermedades> consultarTodos();
    
    public abstract List<Enfermedades> cargarEnfermedades();
}
