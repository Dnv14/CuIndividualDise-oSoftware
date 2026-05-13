/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.NegocioException;
import DTOS.NuevaMembresiaDTO;
import Entidades.Membresia;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IMembresiaBO {

    public abstract List<NuevaMembresiaDTO> obtenerMembresias() throws NegocioException;

}
