/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import DTOsENUMs.EstadoDTO;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevaMembresiaDTO;
import DTOS.NuevoClienteDTO;
import DTOS.UsuarioDTO;
import DTOsENUMs.TipoMembresiaDTO;
import Entidades.Cliente;
import Entidades.Estado;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.TipoMembresia;
import Entidades.Usuario;
import java.time.LocalDate;

/**
 *
 * @author Diego
 */
public class DtosAEntidadesAdapter {

    public static Usuario adaptarUsuarioDTO(UsuarioDTO usuarioDTO) {
        if (usuarioDTO == null) {
            return null;
        }

        if (usuarioDTO.getId() != null) {
            Usuario usuarioConId = new Usuario(usuarioDTO.getId(),
                    usuarioDTO.getNombre(), usuarioDTO.getApellidos(),
                    usuarioDTO.getCorreo(), usuarioDTO.getContrasenia());

            return usuarioConId;
        }

        Usuario usuarioSinId = new Usuario(usuarioDTO.getNombre(),
                usuarioDTO.getApellidos(), usuarioDTO.getCorreo(),
                usuarioDTO.getContrasenia());

        return usuarioSinId;
    }

    public static Cliente adaptarClienteDTO(NuevoClienteDTO clienteDTO) {
        MembresiaComprada membresiaComprada = null;

        if (clienteDTO.getMembresíaComprada() != null) {
            membresiaComprada = adaptarMembresiaCompradaDTO(clienteDTO.getMembresíaComprada());
        }

        if (clienteDTO.getId() != null) {
            Cliente clienteConId = new Cliente(clienteDTO.getId(),
                    clienteDTO.getIdUsuario(), clienteDTO.getTelefono(),
                    clienteDTO.getFechaNacimiento(), clienteDTO.getPin(), membresiaComprada);
            return clienteConId;
        }

        Cliente clienteSinId = new Cliente(clienteDTO.getIdUsuario(), 
                clienteDTO.getTelefono(), clienteDTO.getFechaNacimiento(), 
                clienteDTO.getPin(), membresiaComprada);
        
        return clienteSinId;
    }
    

    public static Membresia adaptarMembresiaDTO(NuevaMembresiaDTO nuevaMembresiaDTO) {
        if (nuevaMembresiaDTO == null) {
            return null;
        }
        TipoMembresia tipoMembresiaDominio = TipoMembresia.BRONCE;

        if (nuevaMembresiaDTO.getTipoMembresia() == TipoMembresiaDTO.PLATA) {
            tipoMembresiaDominio = TipoMembresia.PLATA;
        } else if (nuevaMembresiaDTO.getTipoMembresia() == TipoMembresiaDTO.ORO) {
            tipoMembresiaDominio = TipoMembresia.ORO;
        }

        Membresia membresia = new Membresia(tipoMembresiaDominio,
                nuevaMembresiaDTO.getPrecio(),
                nuevaMembresiaDTO.getVigencia());

        return membresia;
    }

    public static MembresiaComprada adaptarMembresiaCompradaDTO(NuevaMembresiaCompradaDTO membresiaCompradaDTO) {
        Membresia membresia = adaptarMembresiaDTO(membresiaCompradaDTO.getMembresia());
        Estado estadoDominio = Estado.ACTIVO;

        if (membresiaCompradaDTO.getEstado() == EstadoDTO.INACTIVO) {
            estadoDominio = Estado.INACTIVO;
        }

        MembresiaComprada membresiaComprada = new MembresiaComprada(membresia,
                membresiaCompradaDTO.getFechaInicio(),
                membresiaCompradaDTO.getFechaFin(),
                membresiaCompradaDTO.getPrecioPagado(),
                estadoDominio);

        return membresiaComprada;
    }

    public static TipoMembresia adaptarTipoMembresiaDTO(TipoMembresiaDTO tipoDTO) {
        if (tipoDTO == TipoMembresiaDTO.PLATA) {
            return TipoMembresia.PLATA;
        } else if (tipoDTO == TipoMembresiaDTO.ORO) {
            return TipoMembresia.ORO;
        }
        return TipoMembresia.BRONCE;
    }
}
