/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.BOException;
import DTOS.LesionesDTO;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface ILesionesBO {
    public abstract List<LesionesDTO> consultarLesiones()throws BOException;
}
