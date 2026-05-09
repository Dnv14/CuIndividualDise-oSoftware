/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevaMembresiaDTO;
import DTOS.NuevoClienteDTO;
import DTOsENUMs.EstadoDTO;
import DTOsENUMs.TipoMembresiaDTO;
import Entidades.Cliente;
import Entidades.Estado;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.TipoMembresia;

/**
 *
 * @author Diego
 */
public class EntidadesADTOsAdapter {

    public static NuevaMembresiaDTO adaptarMembresiaADTO(Membresia membresia) {
        if (membresia == null) {
            return null;
        }

        TipoMembresiaDTO tipoDTO = adaptarTipoMembresiaADTO(membresia.getTipoMembresia());
        return new NuevaMembresiaDTO(tipoDTO, membresia.getPrecio(), membresia.getVigencia());
    }

    public static NuevaMembresiaCompradaDTO adaptarMembresiaCompradaADTO(MembresiaComprada membresiaComprada) {
        if (membresiaComprada == null) {
            return null;
        }

        NuevaMembresiaDTO mDTO = adaptarMembresiaADTO(membresiaComprada.getMembresia());
        EstadoDTO estadoDTO = adaptarEstadoADTO(membresiaComprada.getEstado());

        return new NuevaMembresiaCompradaDTO(
                mDTO,
                membresiaComprada.getFechaInicio(),
                membresiaComprada.getFechaFin(),
                membresiaComprada.getPrecioPagado(),
                estadoDTO
        );
    }

    public static NuevoClienteDTO adaptarClienteADTO(Cliente cliente) {
        if (cliente == null) {
            return null;
        }

        NuevaMembresiaCompradaDTO membresiaDTO = adaptarMembresiaCompradaADTO(cliente.getMembresíaComprada());

        return new NuevoClienteDTO(
                cliente.getId(),
                cliente.getNombre(),
                cliente.getApellidos(),
                cliente.getCorreo(),
                cliente.getContrasenia(),
                cliente.getTelefono(),
                cliente.getFechaNacimiento(),
                cliente.getPin(),
                membresiaDTO
        );
    }

    public static TipoMembresiaDTO adaptarTipoMembresiaADTO(TipoMembresia tipo) {
        if (tipo == TipoMembresia.PLATA) {
            return TipoMembresiaDTO.PLATA;
        }
        if (tipo == TipoMembresia.ORO) {
            return TipoMembresiaDTO.ORO;
        }
        return TipoMembresiaDTO.BRONCE;
    }

    public static EstadoDTO adaptarEstadoADTO(Estado estado) {
        return (estado == Estado.ACTIVO) ? EstadoDTO.ACTIVO : EstadoDTO.INACTIVO;
    }
    
    
}
