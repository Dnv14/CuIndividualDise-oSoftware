/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadcomprarmembresiausuarionoregistrado;

import DTOS.NuevoClienteDTO;
import Interfaces.IClientesBO;
import BOs.NegocioException;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.UsuarioDTO;

import Interfaces.IUsuarioBO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class FuncionalidadRegistroUsuario implements IFuncionalidadRegistrarUsuario {

    private final IClientesBO clientesBO;
    private final IUsuarioBO usuariosBO;

    public FuncionalidadRegistroUsuario(IClientesBO clientesBO, IUsuarioBO usuariosBO) {
        this.clientesBO = clientesBO;
        this.usuariosBO = usuariosBO;
    }

    @Override
    public NuevoClienteDTO RegistrarCliente(NuevoClienteDTO clienteDTO, UsuarioDTO usuarioDTO) throws NegocioException {
        validarDatosUsuarioCliente(clienteDTO);

        try {
            UsuarioDTO usuarioRegistrado = usuariosBO.registrarUsuario(usuarioDTO);
            clienteDTO.setIdUsuario(usuarioRegistrado.getId());
            
            NuevoClienteDTO clienteRegistrado = clientesBO.registrarCliente(clienteDTO);
            
            return clienteRegistrado;
        } catch (NegocioException ex) {
            throw new NegocioException("Error al registrar el cliente.", ex);
        }
    }

    @Override
    public NuevaMembresiaCompradaDTO gestionMembresiaCliente(String idCliente, NuevaMembresiaCompradaDTO compra) throws NegocioException {
        try {
            return clientesBO.gestionMembresiaCliente(idCliente, compra);
        } catch (NegocioException ex) {
            throw new NegocioException("Error al gestionar la membresia de cliente", ex);
        }
    }

    @Override
    public List<NuevoClienteDTO> obtenerTodosLosClientes() throws NegocioException {
        try {
            return clientesBO.consultarClientes();
        } catch (NegocioException ex) {
            throw new NegocioException("Error al obtener todos los clientes", ex);
        }
    }

    @Override
    public void validarDatosUsuarioCliente(NuevoClienteDTO clienteDTO) throws NegocioException {

        if (clienteDTO.getTelefono().isEmpty() || !clienteDTO.getTelefono().matches("\\d{10}")) {
            throw new NegocioException("Ingrese el formato válido del teléfono.");
        }

        if (clienteDTO.getPin() == null || !clienteDTO.getPin().matches("\\d{4}")) {
            throw new NegocioException("El PIN debe ser de exactamente 4 números.");
        }
    }

    @Override
    public void validarDatosUsuarios(UsuarioDTO usuarioDTO) throws NegocioException {
        if (usuarioDTO.getNombre() == null || usuarioDTO.getNombre().isEmpty()) {
            throw new NegocioException("El nombre del cliente no puede ser nulo.");
        }

        if (usuarioDTO.getApellidos() == null || usuarioDTO.getApellidos().isEmpty()) {
            throw new NegocioException("El appelido del cliente no puede ser nulo.");
        }

        if (usuarioDTO.getCorreo() == null || !usuarioDTO.getCorreo().contains("@")) {
            throw new NegocioException("El formato del correo no es válido.");
        }

    }

    @Override
    public void validarTarjeta(String cvv, String numeroTarjeta, String fechaVencimiento, String nombreTitular) throws NegocioException {
        if (!numeroTarjeta.matches("\\d{16}")) {
            throw new NegocioException("La tarjeta debe tener exactamente 16 números.");
        }

        if (!cvv.matches("\\d{3}")) {
            throw new NegocioException("El CVV debe ser de 3 dígitos.");
        }

        if (!fechaVencimiento.matches("(0[1-9]|1[0-2])/[0-9]{2}")) {
            throw new NegocioException("Formato de fecha inválido (MM/YY)");
        }

        if (nombreTitular.isEmpty() || numeroTarjeta.isEmpty() || cvv.isEmpty() || fechaVencimiento.isEmpty()) {
            throw new NegocioException("Favor de llenar todos los campos");
        }
    }

    @Override
    public void validarPaypal(String correo, String contrasenia) throws NegocioException {
        if (!correo.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
            throw new NegocioException("Formato de correo inválido");
        }

        if (contrasenia.isEmpty()) {
            throw new NegocioException("La contraseña no puede estar vacía");
        }
    }

}
