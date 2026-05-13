/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.AdministradorDTO;
import DTOsENUMs.EstadoDTO;
import DTOS.LoginDTO;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevaMembresiaDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RenovarMembresiaDTO;
import DTOsENUMs.TipoMembresiaDTO;
import BOs.ClientesBO;
import Interfaces.IClientesBO;
import Interfaces.ILoginBO;
import Interfaces.IMembresiaBO;
import Interfaces.IRenovarMembresiaBO;
import BOs.LoginBO;
import BOs.MembresiaBO;
import BOs.NegocioException;
import BOs.RenovarMembresiaBO;
import BOs.UsuarioBO;
import DTOS.UsuarioDTO;
import Entidades.Cliente;
import Entidades.Membresia;
import FabricaDAOS.FabricaDAOS;
import FabricaDAOS.IFabricaDAOS;
import Fachada.IPersistenciaFachada;
import Fachada.PersistenciaFachada;
import Interfaces.IUsuarioBO;
import com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado.FuncionalidadRegistroUsuario;
import com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado.IFuncionalidadRegistrarUsuario;
import com.mycompany.funcionalidadiniciarsesionrenovarmembresia.FuncionalidadIniciarSesionRenovarMembresia;
import com.mycompany.funcionalidadiniciarsesionrenovarmembresia.IFuncionalidadIniciarSesionRenovarMembresia;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Diego
 */
public class ControlForms {

    //actuales
    private UsuarioDTO usuarioActual;
    private AdministradorDTO administradorActual;
    private NuevoClienteDTO clienteActual;

    //registros
    private NuevaMembresiaCompradaDTO membresiaSeleccionada;
    private UsuarioDTO usuarioRegistro;
    private NuevoClienteDTO clienteRegistro;

    private IFuncionalidadRegistrarUsuario funcionalidadRegistrarUsuario;
    private IFuncionalidadIniciarSesionRenovarMembresia funcionalidadRenovarUsuario;

    public ControlForms() {
        IFabricaDAOS fabrica = new FabricaDAOS();
        IPersistenciaFachada persistenciaFachada = new PersistenciaFachada(fabrica);

        IClientesBO clientesBO = new ClientesBO(persistenciaFachada);
        IUsuarioBO usuariosBO = new UsuarioBO(persistenciaFachada);
        IMembresiaBO membresiaBO = new MembresiaBO(persistenciaFachada);
        ILoginBO loginBO = new LoginBO(persistenciaFachada);
        IRenovarMembresiaBO renovarBO = new RenovarMembresiaBO(persistenciaFachada);

        this.funcionalidadRegistrarUsuario = new FuncionalidadRegistroUsuario(clientesBO, usuariosBO);
        this.funcionalidadRenovarUsuario = new FuncionalidadIniciarSesionRenovarMembresia(loginBO, membresiaBO, renovarBO);
    }

    //control
    public TipoMembresiaDTO seleccionarMembresia(String tipo) {
        TipoMembresiaDTO tipoMembresiaDTO;
        switch (tipo) {
            case "ORO":
                tipoMembresiaDTO = TipoMembresiaDTO.ORO;
                break;
            case "PLATA":
                tipoMembresiaDTO = TipoMembresiaDTO.PLATA;
                break;
            default:
                tipoMembresiaDTO = TipoMembresiaDTO.BRONCE;
        }

        return tipoMembresiaDTO;
    }

    public void asignarMembresiaCliente(NuevoClienteDTO cliente, TipoMembresiaDTO membresia) throws NegocioException {
        NuevaMembresiaDTO membresiaBD = funcionalidadRenovarUsuario.buscarMembresiaPorTipo(membresia);
        double precio = membresiaBD.getPrecio();
        LocalDate hoy = LocalDate.now();

//        NuevaMembresiaDTO membresiaDTO = new NuevaMembresiaDTO(membresia, precio, hoy.plusMonths(1));
        NuevaMembresiaCompradaDTO membresiaCompradaDTO = new NuevaMembresiaCompradaDTO(
                membresiaBD,
                hoy,
                hoy.plusMonths(1),
                precio,
                EstadoDTO.ACTIVO
        );
        cliente.setMembresíaComprada(membresiaCompradaDTO);
        this.membresiaSeleccionada = membresiaCompradaDTO;
    }

    public void registrarCliente(NuevoClienteDTO clienteDTO, UsuarioDTO usuarioDTO) throws NegocioException {
        funcionalidadRegistrarUsuario.validarDatosUsuarioCliente(clienteDTO);
        this.clienteActual = funcionalidadRegistrarUsuario.RegistrarCliente(clienteDTO, usuarioDTO);

        this.usuarioActual = usuarioDTO;
        this.clienteRegistro = null;
        this.usuarioRegistro = null;
    }

    public void procesarPagoTarjeta(String numeroTarjeta, String cvv, String fechaVencimiento, String nombreTitular) throws NegocioException {
        funcionalidadRegistrarUsuario.validarTarjeta(cvv, numeroTarjeta, fechaVencimiento, nombreTitular);
        NuevaMembresiaCompradaDTO membresiaActivada = funcionalidadRegistrarUsuario.gestionMembresiaCliente(this.clienteActual.getId(), this.membresiaSeleccionada);

        this.clienteActual.setMembresíaComprada(membresiaActivada);
        this.membresiaSeleccionada = null;

    }

    public void procesarPagoPaypal(String correo, String contrasenia) throws NegocioException {
        funcionalidadRegistrarUsuario.validarPaypal(correo, contrasenia);
        NuevaMembresiaCompradaDTO membresiaActivada = funcionalidadRegistrarUsuario.gestionMembresiaCliente(this.clienteActual.getId(), this.membresiaSeleccionada);

        this.clienteActual.setMembresíaComprada(membresiaActivada);
        this.membresiaSeleccionada = null;

    }

    public void procesarPagoTransferencia() throws NegocioException {
        NuevaMembresiaCompradaDTO membresiaActivada = funcionalidadRegistrarUsuario.gestionMembresiaCliente(this.clienteActual.getId(), this.membresiaSeleccionada);

        this.clienteActual.setMembresíaComprada(membresiaActivada);
        this.membresiaSeleccionada = null;

    }

    public List<NuevoClienteDTO> consultarClientes() throws NegocioException {
        return funcionalidadRegistrarUsuario.obtenerTodosLosClientes();
    }

    //Modificado
    public NuevoClienteDTO iniciarSesion(String pin, String contrasenia) throws NegocioException {
        LoginDTO loginDTO = new LoginDTO(pin, contrasenia);
        this.clienteActual = funcionalidadRenovarUsuario.iniciarSesion(loginDTO);

//        this.usuarioActual = funcionalidadRegistrarUsuario.obtenerUsuarioPorId(this.clienteActual.getIdUsuario()); //TODO ocupo el agreggate
        return this.clienteActual;
    }

    //Nuevo Para consultar las Membresias
    public List<NuevaMembresiaDTO> consultarMembresias() throws NegocioException {
        return funcionalidadRenovarUsuario.consultarMembresias();
    }

    // Para Consultar Los Tipos de Membresia
    public NuevaMembresiaDTO buscarMembresiaPorTipo(TipoMembresiaDTO tipo) throws NegocioException {
        return funcionalidadRenovarUsuario.buscarMembresiaPorTipo(tipo);
    }

    //Nuevo(lo agregrege para la renovacion)
    public void renovarMembresia(TipoMembresiaDTO tipoDTO) throws NegocioException {
        if (this.clienteActual == null || this.clienteActual.getId() == null) {
            throw new NegocioException("No se encontró un ID de cliente ");
        }

        NuevaMembresiaDTO infoPlan = funcionalidadRenovarUsuario.buscarMembresiaPorTipo(tipoDTO);

        NuevaMembresiaDTO planDTO = new NuevaMembresiaDTO(tipoDTO, infoPlan.getPrecio(), LocalDate.now().plusMonths(1));
        NuevaMembresiaCompradaDTO nuevaCompra = new NuevaMembresiaCompradaDTO(
                planDTO,
                LocalDate.now(),
                LocalDate.now().plusMonths(1),
                infoPlan.getPrecio(),
                EstadoDTO.ACTIVO
        );

        this.clienteActual.setMembresíaComprada(nuevaCompra);

        RenovarMembresiaDTO renovarDTO = new RenovarMembresiaDTO(clienteActual.getId(), tipoDTO);
        funcionalidadRenovarUsuario.renovarMembresia(renovarDTO);
    }

    //getters
    public void seleccionarMembresia(NuevaMembresiaCompradaDTO seleccion) {
        this.membresiaSeleccionada = seleccion;
    }

    public NuevoClienteDTO getClienteActual() {
        return clienteActual;
    }

    public UsuarioDTO getUsuarioActual() {
        return usuarioActual;
    }

    public UsuarioDTO getUsuarioRegistro() {
        return usuarioRegistro;
    }

}
