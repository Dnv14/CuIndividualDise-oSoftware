/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;

import DTOS.NuevaMembresiaDTO;
import Entidades.Membresia;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface IMembresiaBO {

    public abstract void guardar(NuevaMembresiaDTO membresia) throws NegocioException;

    public abstract List<Membresia> obtenerTodas() throws NegocioException;

    public abstract Membresia obtenerPorId(String id)throws NegocioException;
}
