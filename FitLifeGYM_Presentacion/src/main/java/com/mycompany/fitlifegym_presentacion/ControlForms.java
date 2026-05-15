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
import BOs.BOException;
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
import com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado.NegocioExceptionRegistrar;
import com.mycompany.funcionalidadiniciarsesionrenovarmembresia.FuncionalidadIniciarSesionRenovarMembresia;
import com.mycompany.funcionalidadiniciarsesionrenovarmembresia.IFuncionalidadIniciarSesionRenovarMembresia;
import com.mycompany.funcionalidadiniciarsesionrenovarmembresia.NegocioExceptionRenovar;
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
        IClientesBO clientesBO = new ClientesBO();
        IUsuarioBO usuariosBO = new UsuarioBO();
        IMembresiaBO membresiaBO = new MembresiaBO();
        ILoginBO loginBO = new LoginBO();
        IRenovarMembresiaBO renovarBO = new RenovarMembresiaBO();

        this.funcionalidadRegistrarUsuario = new FuncionalidadRegistroUsuario(clientesBO, usuariosBO);
        this.funcionalidadRenovarUsuario = new FuncionalidadIniciarSesionRenovarMembresia(loginBO, membresiaBO, renovarBO, clientesBO);
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

    public void asignarMembresiaCliente(NuevoClienteDTO cliente, TipoMembresiaDTO membresia) throws BOException, NegocioExceptionRenovar {
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

    public void registrarCliente(NuevoClienteDTO clienteDTO, UsuarioDTO usuarioDTO) throws BOException, NegocioExceptionRenovar, NegocioExceptionRegistrar {
        funcionalidadRegistrarUsuario.validarDatosUsuarioCliente(clienteDTO);
        this.clienteActual = funcionalidadRegistrarUsuario.RegistrarCliente(clienteDTO, usuarioDTO);

        if (this.clienteActual != null) {
            this.clienteActual.setNombre(usuarioDTO.getNombre());
            this.clienteActual.setApellidos(usuarioDTO.getApellidos());
            this.clienteActual.setCorreo(usuarioDTO.getCorreo());
        }

        this.usuarioActual = null;
        this.clienteRegistro = null;
        this.usuarioRegistro = null;
    }

    public void procesarPagoTarjeta(String numeroTarjeta, String cvv, String fechaVencimiento, String nombreTitular) throws BOException, NegocioExceptionRegistrar {
        funcionalidadRegistrarUsuario.validarTarjeta(cvv, numeroTarjeta, fechaVencimiento, nombreTitular);
        NuevaMembresiaCompradaDTO membresiaActivada = funcionalidadRegistrarUsuario.gestionMembresiaCliente(this.clienteActual.getId(), this.membresiaSeleccionada);

        this.clienteActual.setMembresíaComprada(membresiaActivada);
        this.membresiaSeleccionada = null;

    }

    public void procesarPagoPaypal(String correo, String contrasenia) throws BOException, NegocioExceptionRegistrar {
        funcionalidadRegistrarUsuario.validarPaypal(correo, contrasenia);
        NuevaMembresiaCompradaDTO membresiaActivada = funcionalidadRegistrarUsuario.gestionMembresiaCliente(this.clienteActual.getId(), this.membresiaSeleccionada);

        this.clienteActual.setMembresíaComprada(membresiaActivada);
        this.membresiaSeleccionada = null;

    }

    public void procesarPagoTransferencia() throws BOException, NegocioExceptionRegistrar {
        NuevaMembresiaCompradaDTO membresiaActivada = funcionalidadRegistrarUsuario.gestionMembresiaCliente(this.clienteActual.getId(), this.membresiaSeleccionada);

        this.clienteActual.setMembresíaComprada(membresiaActivada);
        this.membresiaSeleccionada = null;

    }

    public List<NuevoClienteDTO> consultarClientes() throws BOException, NegocioExceptionRegistrar {
        return funcionalidadRegistrarUsuario.obtenerTodosLosClientes();
    }

    //Modificado
    public NuevoClienteDTO iniciarSesion(String correo, String contrasenia) throws BOException, NegocioExceptionRenovar {
        NuevoClienteDTO loginDTO = new NuevoClienteDTO();
        loginDTO.setCorreo(correo);
        loginDTO.setContrasenia(contrasenia);

        this.clienteActual = funcionalidadRenovarUsuario.iniciarSesion(loginDTO);

        return this.clienteActual;
    }

    //Nuevo Para consultar las Membresias
    public List<NuevaMembresiaDTO> consultarMembresias() throws BOException, NegocioExceptionRenovar {
        return funcionalidadRenovarUsuario.consultarMembresias();
    }

    // Para Consultar Los Tipos de Membresia
    public NuevaMembresiaDTO buscarMembresiaPorTipo(TipoMembresiaDTO tipo) throws BOException, NegocioExceptionRenovar {
        return funcionalidadRenovarUsuario.buscarMembresiaPorTipo(tipo);
    }

    //Nuevo(lo agregrege para la renovacion)
    public void renovarMembresia(TipoMembresiaDTO tipoDTO) throws BOException, NegocioExceptionRenovar {
        if (this.clienteActual == null || this.clienteActual.getId() == null) {
            throw new BOException("No se encontró un ID de cliente ");
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
