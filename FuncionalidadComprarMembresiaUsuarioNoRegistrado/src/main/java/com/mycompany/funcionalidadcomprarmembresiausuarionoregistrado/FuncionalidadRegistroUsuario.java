/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado;

import BOs.AdministradorBO;
import DTOS.NuevoClienteDTO;
import Interfaces.IClientesBO;
import BOs.BOException;
import BOs.ClientesBO;
import BOs.UsuarioBO;
import DTOS.AdministradorDTO;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.UsuarioDTO;
import Interfaces.IAdministradorBO;

import Interfaces.IUsuarioBO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class FuncionalidadRegistroUsuario implements IFuncionalidadRegistrarUsuario {

    private final IClientesBO clientesBO;
    private final IUsuarioBO usuariosBO;
    private final IAdministradorBO administradorBO;

    public FuncionalidadRegistroUsuario() {
        this.clientesBO = new ClientesBO();
        this.usuariosBO = new UsuarioBO();
        this.administradorBO = new AdministradorBO();
    }

    @Override
    public NuevoClienteDTO RegistrarCliente(NuevoClienteDTO clienteDTO, UsuarioDTO usuarioDTO) throws NegocioExceptionRegistrar {
        validarDatosUsuarioCliente(clienteDTO);

        try {
            UsuarioDTO usuarioRegistrado = usuariosBO.registrarUsuario(usuarioDTO);
            clienteDTO.setIdUsuario(usuarioRegistrado.getId());

            NuevoClienteDTO clienteRegistrado = clientesBO.registrarCliente(clienteDTO);
            

            return clienteRegistrado;
        } catch (BOException ex) {
            throw new NegocioExceptionRegistrar("Error al registrar el cliente.", ex);
        }
    }

    @Override
    public AdministradorDTO RegistrarAdministrador(AdministradorDTO administradorDTO, UsuarioDTO usuarioDTO) throws NegocioExceptionRegistrar {
        try {
            UsuarioDTO usuarioRegistrado = usuariosBO.registrarUsuario(usuarioDTO);
            administradorDTO.setIdUsuario(usuarioRegistrado.getId());

            AdministradorDTO administradorRegistrado = administradorBO.registrarAdministrador(administradorDTO);
            System.out.println(administradorRegistrado);
            System.out.println(administradorDTO);

            return administradorRegistrado;
        } catch (BOException ex) {
            throw new NegocioExceptionRegistrar("Error al registrar al administrador.", ex);
        }
    }

    @Override
    public NuevaMembresiaCompradaDTO gestionMembresiaCliente(String idCliente, NuevaMembresiaCompradaDTO compra) throws NegocioExceptionRegistrar {
        try {
            return clientesBO.gestionMembresiaCliente(idCliente, compra);
        } catch (BOException ex) {
            throw new NegocioExceptionRegistrar("Error al gestionar la membresia de cliente", ex);
        }
    }

    @Override
    public List<NuevoClienteDTO> obtenerTodosLosClientes() throws NegocioExceptionRegistrar {
        try {
            return clientesBO.consultarClientes();
        } catch (BOException ex) {
            throw new NegocioExceptionRegistrar("Error al obtener todos los clientes", ex);
        }
    }

    @Override
    public void validarDatosUsuarioCliente(NuevoClienteDTO clienteDTO) throws NegocioExceptionRegistrar {
        if(clienteDTO.getFechaNacimiento() == null){
            throw new NegocioExceptionRegistrar("La fecha de nacimiento no debe estar vacia..");
        }
        if (clienteDTO.getTelefono().isEmpty() || !clienteDTO.getTelefono().matches("\\d{10}")) {
            throw new NegocioExceptionRegistrar("Ingrese el formato válido del teléfono.");
        }

    }

    @Override
    public void validarDatosUsuarios(UsuarioDTO usuarioDTO) throws NegocioExceptionRegistrar {
        if (usuarioDTO.getNombre() == null || usuarioDTO.getNombre().isEmpty()) {
            throw new NegocioExceptionRegistrar("El nombre del cliente no puede ser nulo.");
        }

        if (usuarioDTO.getApellidos() == null || usuarioDTO.getApellidos().isEmpty()) {
            throw new NegocioExceptionRegistrar("El appelido del cliente no puede ser nulo.");
        }

        if (!usuarioDTO.getApellidos().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$") || !usuarioDTO.getNombre().matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
            throw new NegocioExceptionRegistrar("El nombre o apellido solo puede tener caracteres alfanumericos.");
        }
        
        if (usuarioDTO.getNombre().length() > 25) {
            throw new NegocioExceptionRegistrar("El nombre es demasiado largo.");
        }
        
        if (usuarioDTO.getApellidos().length() > 25) {
            throw new NegocioExceptionRegistrar("Los apellidos son demasiados largos.");
        }

        if (usuarioDTO.getCorreo() == null || !usuarioDTO.getCorreo().contains("@")) {
            throw new NegocioExceptionRegistrar("El formato del correo no es válido.");
        }
        if (usuarioDTO.getContrasenia().length() < 6) {
            throw new NegocioExceptionRegistrar("La contraseña es muy corta, escriba una más larga");
        }

    }

    @Override
    public void validarTarjeta(String cvv, String numeroTarjeta, String fechaVencimiento, String nombreTitular) throws NegocioExceptionRegistrar {
        if (!numeroTarjeta.matches("\\d{16}")) {
            throw new NegocioExceptionRegistrar("La tarjeta debe tener exactamente 16 números.");
        }

        if (!cvv.matches("\\d{3}")) {
            throw new NegocioExceptionRegistrar("El CVV debe ser de 3 dígitos.");
        }

        if (!fechaVencimiento.matches("(0[1-9]|1[0-2])/[0-9]{2}")) {
            throw new NegocioExceptionRegistrar("Formato de fecha inválido (MM/YY)");
        }

        if (nombreTitular.isEmpty() || numeroTarjeta.isEmpty() || cvv.isEmpty() || fechaVencimiento.isEmpty()) {
            throw new NegocioExceptionRegistrar("Favor de llenar todos los campos");
        }
    }

    @Override
    public void validarPaypal(String correo, String contrasenia) throws NegocioExceptionRegistrar {
        if (!correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            throw new NegocioExceptionRegistrar("Formato de correo inválido");
        }

        if (contrasenia.isEmpty()) {
            throw new NegocioExceptionRegistrar("La contraseña no puede estar vacía");
        }
    }

}
