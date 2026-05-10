/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Entidades.Lesiones;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface ILesionesDAO {

    public abstract List<Lesiones> consultarTodos();
}
