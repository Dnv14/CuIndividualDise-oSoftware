/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
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
    private ControlRegistroFisico controlRegistroFisico;
    private NuevoClienteDTO clienteSeleccionado;

    public ControlNavegacion() {
        this.controlRegistroInicioSesion = new ControlRegistroInicioSesion();
        this.controlRegistroFisico = new ControlRegistroFisico(this.controlRegistroInicioSesion);
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
        mostrarPantalla(new BienvenidaFORM(this, controlRegistroInicioSesion, cliente, controlRegistroFisico));
    }

    public void navegarMetodosPago(TipoMembresiaDTO membresia, NuevoClienteDTO cliente) {
        mostrarPantalla(new SuscribirseFORM(this, controlRegistroInicioSesion, membresia, cliente));
    }

    public void navegarRegistroFisico() {
        mostrarPantalla(new RegistroFisicoFORM(this, controlRegistroFisico, controlRegistroInicioSesion));
    }

    public void navegarMenuRutinasCliente() {
        mostrarPantalla(new MenuRutinasClienteFORM(this, controlRegistroInicioSesion));
    }

    public void navegarRutinaSemanalCliente() {
        mostrarPantalla(new RutinaSemanalClienteFORM(this));
    }

    public void navegarMenuAdministrador() {
        mostrarPantalla(new MenuAdministradorFORM(this));
    }

    public void navegarBuscadorCliente() {
        mostrarPantalla(new BuscadorClienteFORM(this, controlRegistroFisico));
    }

    public void navegarAdministrarCliente() {
        mostrarPantalla(new AdministrarCliente(this, controlRegistroFisico));
    }

    public void navegarRutinaSemanalAdmin() {
        mostrarPantalla(new RutinaSemanalAdministradorFORM(this,controlRegistroFisico));
    }

    public void navegarBienvenidaAdministrador() {
        mostrarPantalla(new BienvenidaAdministradorFORM(this, controlRegistroInicioSesion));
    }

    public void navegarDetallesRutinaAdmin(String diaSemana) {
        mostrarPantalla(new DetalleRutinaDiaAdministradorFORM(this, controlRegistroFisico, diaSemana));
    }

    public void navegarDetallesRutinaCliente(String diaSemana) {
        mostrarPantalla(new DetalleRutinaDiaClienteFORM(this, controlRegistroInicioSesion, controlRegistroFisico, diaSemana));
    }

    public void navegarEditarOEliminarRutina(String diaSemana) {
        mostrarPantalla(new DetallesRutinaEliminarOEditarFORM(this, controlRegistroFisico, diaSemana));
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

    public void navegarRegistrarseAdministrador() {
        mostrarDialogo(new RegistrarseAdministradorFORM(frameActual, true, this, controlRegistroInicioSesion));
    }

    public void navegarIniciarSesionAdministrador() {
        mostrarDialogo(new IniciarSesionAdministradorFORM(frameActual, true, this, controlRegistroInicioSesion));
    }

    public void navegarVerNotasCliente(String notas) {
        mostrarDialogo(new VerNotasClienteFORM(frameActual, true, this, notas));
    }

    public void navegarConsultarRegistroFisico() {
        mostrarDialogo(new ConsultarRegistroFisicoFORM(frameActual, true, this,controlRegistroFisico));
    }

    public void navegarAgregarNotasAdmin() {
        mostrarDialogo(new AgregarNotasAdministradorFORM(frameActual, true, this));
    }

    public void navegarRegistroFisicoConfirmar(RegistroFisicoDTO registroSinConfirmar) {
        mostrarDialogo(new RegistroFisicoConfirmarFORM(frameActual, true, this, controlRegistroFisico, registroSinConfirmar));
    }
}
