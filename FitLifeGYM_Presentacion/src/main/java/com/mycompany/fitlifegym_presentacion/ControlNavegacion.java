/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;


import DTOS.NuevoClienteDTO;
import DTOsENUMs.TipoMembresiaDTO;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Diego
 */
public class ControlNavegacion {

    private JFrame frameActual;
    private ControlForms controlForms;

    public ControlNavegacion(ControlForms controlForms) {
        this.controlForms = controlForms;
    }

    private void mostrarPantalla(JFrame nuevoFrame) {
        if (this.frameActual != null) {
            this.frameActual.dispose();
        }

        this.frameActual = nuevoFrame;
        this.frameActual.setResizable(false);
        frameActual.setVisible(true);
    }

    private void mostrarDialogo(JDialog nuevoDialogo) {
        nuevoDialogo.setResizable(false);
        nuevoDialogo.setLocationRelativeTo(this.frameActual);
        nuevoDialogo.setVisible(true);
    }

    //frames
    public void navegarMenuPrincipal() {
        mostrarPantalla(new MainFitLifeFORM(this, controlForms));
    }

    public void navegarBenificios(NuevoClienteDTO cliente) {
        mostrarPantalla(new BeneficiosFORM(this, controlForms, cliente));
    }

    public void navegarBienvenida(NuevoClienteDTO cliente) {
        mostrarPantalla(new BienvenidaFORM(this, controlForms, cliente));
    }

    public void navegarMetodosPago(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarPantalla(new SuscribirseFORM(this, controlForms, membresia, cliente));
    }

    //Dialogs
    public void navegarRegistrarse() {
        mostrarDialogo(new RegistrarseFORM(this.frameActual, true, this, controlForms));
    }

    public void navegarIniciarSesion() {
        mostrarDialogo(new IniciarSesionFORM(this.frameActual, true, this, controlForms));
    }

    public void navegarTransferenciaMetodo(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarDialogo(new TransferenciaFORM(this.frameActual, true, this, controlForms, membresia, cliente));
    }

    public void navegarTarjetaMetodo(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarDialogo(new TarjetaFORM(this.frameActual, true, this, controlForms, membresia, cliente));
    }

    public void navegarIniciarSesionPaypal(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarDialogo(new IniciarSesionPaypalFORM(this.frameActual, true, this, controlForms, membresia, cliente));
    }
}
