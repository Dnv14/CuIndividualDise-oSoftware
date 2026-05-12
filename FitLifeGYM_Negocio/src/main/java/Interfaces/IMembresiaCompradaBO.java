/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import BOs.NegocioException;
import DTOS.NuevaMembresiaCompradaDTO;
import Entidades.MembresiaComprada;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IMembresiaCompradaBO {
//no se usa 
    //nose porque 
    
    public abstract MembresiaComprada RegistrarMembresia(String idCliente ,NuevaMembresiaCompradaDTO compra) throws NegocioException;

    public abstract List<MembresiaComprada> obtenerTodas() throws NegocioException;
}
