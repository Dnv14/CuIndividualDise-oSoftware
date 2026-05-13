/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevaMembresiaDTO;
import DTOS.NuevoClienteDTO;
import DTOS.UsuarioDTO;
import DTOsENUMs.EstadoDTO;
import DTOsENUMs.TipoMembresiaDTO;
import Entidades.Cliente;
import Entidades.Estado;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.TipoMembresia;
import Entidades.Usuario;

/**
 *
 * @author Diego
 */
public class EntidadesADTOsAdapter {

    public static UsuarioDTO adaptarUsuarioEntidad(Usuario usuarioEntidad) {
        if (usuarioEntidad == null) {
            return null;
        }

        if (usuarioEntidad.getId() != null) {
            UsuarioDTO usuarioDTOConId = new UsuarioDTO(usuarioEntidad.getId(),
                    usuarioEntidad.getNombre(),
                    usuarioEntidad.getApellidos(), usuarioEntidad.getCorreo(),
                    usuarioEntidad.getContrasenia());

            return usuarioDTOConId;
        }

        UsuarioDTO usuarioSinId = new UsuarioDTO(usuarioEntidad.getNombre(),
                usuarioEntidad.getApellidos(), usuarioEntidad.getCorreo(),
                usuarioEntidad.getContrasenia());

        return usuarioSinId;
    }

    public static NuevoClienteDTO adaptarClienteEntidad(Cliente clienteEntidad) {
        if (clienteEntidad == null) {
            return null;
        }

        NuevaMembresiaCompradaDTO membresiaDTO = adaptarMembresiaCompradaEntidad(clienteEntidad.getMembresiaComprada());

        if (clienteEntidad.getId() != null) {
            NuevoClienteDTO clienteDTOConId = new NuevoClienteDTO(clienteEntidad.getId(),
                    clienteEntidad.getIdUsuario(),
                    clienteEntidad.getTelefono(), clienteEntidad.getFechaNacimiento(),
                    clienteEntidad.getPin(), membresiaDTO);

            return clienteDTOConId;
        }

        NuevoClienteDTO clienteSinId = new NuevoClienteDTO(
                clienteEntidad.getIdUsuario(),
                clienteEntidad.getTelefono(), clienteEntidad.getFechaNacimiento(),
                clienteEntidad.getPin(), membresiaDTO);

        return clienteSinId;

    }

    public static NuevaMembresiaDTO adaptarMembresiaEntidad(Membresia membresia) {
        if (membresia == null) {
            return null;
        }

        TipoMembresiaDTO tipoDTO = adaptarTipoMembresiaEntidad(membresia.getTipoMembresia());
        return new NuevaMembresiaDTO(tipoDTO, membresia.getPrecio(), membresia.getVigencia());
    }

    public static NuevaMembresiaCompradaDTO adaptarMembresiaCompradaEntidad(MembresiaComprada membresiaComprada) {
        if (membresiaComprada == null) {
            return null;
        }

        NuevaMembresiaDTO mDTO = adaptarMembresiaEntidad(membresiaComprada.getMembresia());
        EstadoDTO estadoDTO = adaptarEstadoEntidad(membresiaComprada.getEstado());

        return new NuevaMembresiaCompradaDTO(
                mDTO,
                membresiaComprada.getFechaInicio(),
                membresiaComprada.getFechaFin(),
                membresiaComprada.getPrecioPagado(),
                estadoDTO
        );
    }

    public static TipoMembresiaDTO adaptarTipoMembresiaEntidad(TipoMembresia tipo) {
        if (tipo == TipoMembresia.PLATA) {
            return TipoMembresiaDTO.PLATA;
        }
        if (tipo == TipoMembresia.ORO) {
            return TipoMembresiaDTO.ORO;
        }
        return TipoMembresiaDTO.BRONCE;
    }

    public static EstadoDTO adaptarEstadoEntidad(Estado estado) {
        return (estado == Estado.ACTIVO) ? EstadoDTO.ACTIVO : EstadoDTO.INACTIVO;
    }

}
