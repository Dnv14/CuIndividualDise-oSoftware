/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.fitlifegym_presentacion;

/**
 *
 * @author Diego
 */
public class FitLifeGYM_Presentacion {

    public static void main(String[] args) {
        ControlRegistroInicioSesion controlRegistroInicioSesion = new ControlRegistroInicioSesion();
        ControlNavegacion controlNavegacion = new ControlNavegacion(controlRegistroInicioSesion);

        controlNavegacion.navegarMenuPrincipal();
    }
}
