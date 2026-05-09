/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.fitlifegym_negocio;


import DTOS.LoginDTO;
import DTOS.NuevoClienteDTO;

/**
 *
 * @author PC GAMER MASTER RACE
 */
public interface ILoginBO {
    public abstract NuevoClienteDTO iniciarSesion(LoginDTO login) throws NegocioException;
}
