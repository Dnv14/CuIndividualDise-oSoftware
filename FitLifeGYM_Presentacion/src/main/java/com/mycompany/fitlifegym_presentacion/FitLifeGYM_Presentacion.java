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
        ControlForms controlForms = new ControlForms();
        ControlNavegacion controlNavegacion = new ControlNavegacion(controlForms);

        controlNavegacion.navegarMenuPrincipal();
    }
}
