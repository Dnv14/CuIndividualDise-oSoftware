/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Ejercicio;
import Excepciones.PersistenciaException;

import java.util.List;

/**
 *
 * @author Diego
 */
public interface IEjerciciosDAO {

    public List<Ejercicio> consultarTodos()throws PersistenciaException;
    
   
}
