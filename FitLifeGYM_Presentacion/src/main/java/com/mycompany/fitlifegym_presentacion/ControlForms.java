/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.AdministradorDTO;
import DTOS.ClienteLogueadoDTO;
import DTOsENUMs.EstadoDTO;
import DTOS.LoginDTO;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevaMembresiaDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RenovarMembresiaDTO;
import DTOsENUMs.TipoMembresiaDTO;
import com.mycompany.fitlifegym_negocio.ClientesBO;
import com.mycompany.fitlifegym_negocio.IClientesBO;
import com.mycompany.fitlifegym_negocio.ILoginBO;
import com.mycompany.fitlifegym_negocio.IMembresiaBO;
import com.mycompany.fitlifegym_negocio.IRenovarMembresiaBO;
import com.mycompany.fitlifegym_negocio.LoginBO;
import com.mycompany.fitlifegym_negocio.MembresiaBO;
import com.mycompany.fitlifegym_negocio.NegocioException;
import com.mycompany.fitlifegym_negocio.RenovarMembresiaBO;
import PersistenciaConsola.ClientesListDAO;
import PersistenciaConsola.IClientesDAO;
import PersistenciaConsola.IMembresiaDAO;
import PersistenciaConsola.MembresiaListDAO;
import Entidades.Cliente;
import Entidades.Membresia;
import com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado.FuncionalidadRegistroUsuario;
import com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado.IFuncionalidadRegistrarUsuario;
import com.mycompany.funcionalidadiniciarsesionrenovarmembresia.FuncionalidadIniciarSesionRenovarMembresia;
import com.mycompany.funcionalidadiniciarsesionrenovarmembresia.IFuncionalidadIniciarSesionRenovarMembresia;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author Diego
 */
public class ControlForms {

    private NuevoClienteDTO clienteRegistro;
    private NuevoClienteDTO clienteActual;
    private AdministradorDTO administradorActual;
    private IFuncionalidadRegistrarUsuario funcionalidadCU;
    private IFuncionalidadIniciarSesionRenovarMembresia funcionalidad;

    public ControlForms() {
        IClientesDAO dao = (IClientesDAO) new ClientesListDAO();
        IClientesBO negocio = new ClientesBO(dao);
        IMembresiaDAO membresiaDAO = new MembresiaListDAO();
        IMembresiaBO membresiaBO = new MembresiaBO(membresiaDAO);
        ILoginBO loginBO = new LoginBO(dao);
        IRenovarMembresiaBO renovarBO = new RenovarMembresiaBO(dao);
        this.funcionalidadCU = new FuncionalidadRegistroUsuario(negocio);
        this.funcionalidad = new FuncionalidadIniciarSesionRenovarMembresia(loginBO, membresiaBO, renovarBO);
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
        Membresia membresiaBD = funcionalidad.buscarMembresiaPorTipo(membresia);
        double precio = membresiaBD.getPrecio();
        LocalDate hoy = LocalDate.now();

        NuevaMembresiaDTO membresiaDTO = new NuevaMembresiaDTO(membresia, precio, hoy.plusMonths(1));
        NuevaMembresiaCompradaDTO membresiaCompradaDTO = new NuevaMembresiaCompradaDTO(
                membresiaDTO,
                hoy,
                hoy.plusMonths(1),
                precio,
                EstadoDTO.ACTIVO
        );
        cliente.setMembresíaComprada(membresiaCompradaDTO);
    }

    public void registrarCliente(NuevoClienteDTO clienteDTO) throws NegocioException { //debiar de llamarse Validar datos cliente
        funcionalidadCU.validarDatosUsuario(clienteDTO);
        this.clienteRegistro = clienteDTO;
    }

    public void procesarPagoTarjeta(NuevoClienteDTO cliente, String numeroTarjeta, String cvv, String fechaVencimiento, String nombreTitular) throws NegocioException {
        funcionalidadCU.validarTarjeta(cvv, numeroTarjeta, fechaVencimiento, nombreTitular);

        if (this.clienteActual != null) {
            TipoMembresiaDTO tipo = cliente.getMembresíaComprada().getMembresia().getTipoMembresia();
            renovarMembresia(tipo);
        } else if (this.clienteRegistro != null) {

            this.clienteRegistro.setMembresíaComprada(cliente.getMembresíaComprada());
            this.clienteActual = funcionalidadCU.RegistrarUsuario(this.clienteRegistro);
            this.clienteRegistro = null;
        }
    }

    public void procesarPagoPaypal(NuevoClienteDTO cliente, String correo, String contrasenia) throws NegocioException {
        funcionalidadCU.validarPaypal(correo, contrasenia);

        // Si hay cliente logueado es pos es renovacion
        if (this.clienteActual != null) {
            TipoMembresiaDTO tipo = cliente.getMembresíaComprada().getMembresia().getTipoMembresia();
            renovarMembresia(tipo);
        } else if (this.clienteRegistro != null) {

            this.clienteRegistro.setMembresíaComprada(cliente.getMembresíaComprada());
            this.clienteActual = funcionalidadCU.RegistrarUsuario(this.clienteRegistro);
            this.clienteRegistro = null;
        }

    }

    public void procesarPagoTransferencia(NuevoClienteDTO cliente) throws NegocioException {
        if (this.clienteActual != null) {
            TipoMembresiaDTO tipo = cliente.getMembresíaComprada().getMembresia().getTipoMembresia();
            renovarMembresia(tipo);
        } else if (this.clienteRegistro != null) {

            this.clienteRegistro.setMembresíaComprada(cliente.getMembresíaComprada());
            this.clienteActual = funcionalidadCU.RegistrarUsuario(this.clienteRegistro);
            this.clienteRegistro = null;
        }

    }

    public NuevoClienteDTO getClienteActual() {
        return clienteActual;
    }

    public List<Cliente> consultarClientes() throws NegocioException {
        return funcionalidadCU.obtenerTodas();
    }

    //Modificado
    public NuevoClienteDTO iniciarSesion(String pin, String contrasenia) throws NegocioException {
        LoginDTO loginDTO = new LoginDTO(pin, contrasenia);
        this.clienteActual = funcionalidad.iniciarSesion(loginDTO);
        return this.clienteActual;
    }

    //Nuevo Para consultar las Membresias
    public List<Membresia> consultarMembresias() throws NegocioException {
        return funcionalidad.consultarMembresias();
    }

    // Para Consultar Los Tipos de Membresia
    public Membresia buscarMembresiaPorTipo(TipoMembresiaDTO tipo) throws NegocioException {
        return funcionalidad.buscarMembresiaPorTipo(tipo);
    }

    //Nuevo(lo agregrege para la renovacion)
    public void renovarMembresia(TipoMembresiaDTO tipoDTO) throws NegocioException {
        if (this.clienteActual == null || this.clienteActual.getId() == null) {
            throw new NegocioException("No se encontró un ID de cliente ");
        }

        Membresia infoPlan = funcionalidad.buscarMembresiaPorTipo(tipoDTO);

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
        funcionalidad.renovarMembresia(renovarDTO);
    }

}
