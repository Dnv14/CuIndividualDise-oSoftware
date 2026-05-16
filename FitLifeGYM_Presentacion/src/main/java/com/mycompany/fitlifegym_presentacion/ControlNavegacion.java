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
    private ControlRegistroInicioSesion controlRegistroInicioSesion;

    public ControlNavegacion(ControlRegistroInicioSesion controlForms) {
        this.controlRegistroInicioSesion = controlForms;
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
        mostrarPantalla(new MainFitLifeFORM(this));
    }

    public void navegarBenificios(NuevoClienteDTO cliente) {
        mostrarPantalla(new BeneficiosFORM(this, controlRegistroInicioSesion, cliente));
    }

    public void navegarBienvenida(NuevoClienteDTO cliente) {
        mostrarPantalla(new BienvenidaFORM(this, controlRegistroInicioSesion, cliente));
    }

    public void navegarMetodosPago(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarPantalla(new SuscribirseFORM(this, controlRegistroInicioSesion, membresia, cliente));
    }
    
    public void navegarRegistroFisico(){
        
    }
    

    //Dialogs
    public void navegarRegistrarseCliente() {
        mostrarDialogo(new RegistrarseClienteFORM(this.frameActual, true, this, controlRegistroInicioSesion));
    }

    public void navegarIniciarSesionCliente() {
        mostrarDialogo(new IniciarSesionClienteFORM(this.frameActual, true, this, controlRegistroInicioSesion));
    }

    public void navegarTransferenciaMetodo(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarDialogo(new TransferenciaFORM(this.frameActual, true, this, controlRegistroInicioSesion, membresia, cliente));
    }

    public void navegarTarjetaMetodo(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarDialogo(new TarjetaFORM(this.frameActual, true, this, controlRegistroInicioSesion, membresia, cliente));
    }

    public void navegarIniciarSesionPaypal(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarDialogo(new IniciarSesionPaypalFORM(this.frameActual, true, this, controlRegistroInicioSesion, membresia, cliente));
    }
    
    
}
