/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.BOException;
import DTOS.EnfermedadesDTO;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IEnfermedadesBO {

    public abstract List<EnfermedadesDTO> consultarEnfermedades() throws BOException;
}
