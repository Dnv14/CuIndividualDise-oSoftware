/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import DTOS.DetallesRutinaDTO;
import DTOS.EjerciciosDTO;
import DTOS.EjerciciosSeleccionadosDTO;
import DTOS.EnfermedadesDTO;
import DTOS.EnfermedadesSeleccionadasDTO;
import DTOS.LesionesDTO;
import DTOS.LesionesSeleccionadasDTO;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevaMembresiaDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.RutinaDTO;
import DTOS.UsuarioDTO;
import DTOsENUMs.EstadoDTO;
import DTOsENUMs.EstadoRutinaDTO;
import DTOsENUMs.NivelCondicionDTO;
import DTOsENUMs.TipoMembresiaDTO;
import Entidades.Cliente;
import Entidades.DetallesRutina;
import Entidades.Ejercicio;
import Entidades.EjerciciosSeleccionados;
import Entidades.Enfermedades;
import Entidades.EnfermedadesSeleccionadas;
import Entidades.Estado;
import Entidades.EstadoRutina;
import Entidades.Lesiones;
import Entidades.LesionesSeleccionadas;
import Entidades.Membresia;
import Entidades.MembresiaComprada;
import Entidades.NivelCondicion;
import Entidades.RegistroFisico;
import Entidades.Rutina;
import Entidades.TipoMembresia;
import Entidades.Usuario;
import java.util.LinkedList;
import java.util.List;

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
                    membresiaDTO);

            return clienteDTOConId;
        }

        NuevoClienteDTO clienteSinId = new NuevoClienteDTO(
                clienteEntidad.getIdUsuario(),
                clienteEntidad.getTelefono(), clienteEntidad.getFechaNacimiento(),
                membresiaDTO);

        return clienteSinId;

    }

    public static NuevoClienteDTO adaptarClienteInicioSesionEntidad(Cliente clienteEntidad) {
        if (clienteEntidad == null) {
            return null;
        }
        NuevaMembresiaCompradaDTO membresiaDTO = adaptarMembresiaCompradaEntidad(clienteEntidad.getMembresiaComprada());

        NuevoClienteDTO clienteInicioSesion = new NuevoClienteDTO();

        clienteInicioSesion.setId(clienteEntidad.getId());
        clienteInicioSesion.setIdUsuario(clienteEntidad.getIdUsuario());
        clienteInicioSesion.setTelefono(clienteEntidad.getTelefono());
        clienteInicioSesion.setFechaNacimiento(clienteEntidad.getFechaNacimiento());
        clienteInicioSesion.setMembresíaComprada(membresiaDTO);

        clienteInicioSesion.setNombre(clienteEntidad.getNombre());
        clienteInicioSesion.setApellidos(clienteEntidad.getApellidos());
        clienteInicioSesion.setCorreo(clienteEntidad.getCorreo());

        return clienteInicioSesion;
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

    public static NivelCondicionDTO adaptarNivelCondicionEntidad(NivelCondicion nivelCondicionEntidad) {
        NivelCondicionDTO nivelCondicionDTO = NivelCondicionDTO.BAJA;

        if (nivelCondicionEntidad == NivelCondicion.INTERMEDIA) {
            nivelCondicionDTO = NivelCondicionDTO.INTERMEDIA;
        } else if (nivelCondicionEntidad == NivelCondicion.AVANZADA) {
            nivelCondicionDTO = NivelCondicionDTO.AVANZADA;
        }

        return nivelCondicionDTO;
    }

    public static RegistroFisicoDTO adaptarRegistroFisicoEntidad(RegistroFisico registroFisicoEntidad) {
        if (registroFisicoEntidad == null) {
            return null;
        }

        List<LesionesSeleccionadasDTO> lesionesSeleccionadas = new LinkedList<>();
        List<EnfermedadesSeleccionadasDTO> enfermedadesSeleccionadas = new LinkedList<>();

        if (registroFisicoEntidad.getLesiones() != null) {
            for (LesionesSeleccionadas l : registroFisicoEntidad.getLesiones()) {
                LesionesSeleccionadasDTO lesionDTO = new LesionesSeleccionadasDTO();
                lesionDTO.setId(l.getId());
                lesionDTO.setNombre(l.getNombre());
                lesionesSeleccionadas.add(lesionDTO);
            }
        }

        if (registroFisicoEntidad.getEnfermedades() != null) {
            for (EnfermedadesSeleccionadas e : registroFisicoEntidad.getEnfermedades()) {
                EnfermedadesSeleccionadasDTO enfermedadDTO = new EnfermedadesSeleccionadasDTO();
                enfermedadDTO.setId(e.getId());
                enfermedadDTO.setNombre(e.getNombre());
                enfermedadesSeleccionadas.add(enfermedadDTO);
            }
        }

        if (registroFisicoEntidad.getId() != null) {
            RegistroFisicoDTO registroFisicoConId = new RegistroFisicoDTO(registroFisicoEntidad.getId(),
                    registroFisicoEntidad.getIdCliente(),
                    adaptarNivelCondicionEntidad(registroFisicoEntidad.getNivelCondicion()),
                    lesionesSeleccionadas, enfermedadesSeleccionadas);
            return registroFisicoConId;
        }

        RegistroFisicoDTO registroFisicoSinId = new RegistroFisicoDTO(
                registroFisicoEntidad.getIdCliente(),
                adaptarNivelCondicionEntidad(registroFisicoEntidad.getNivelCondicion()),
                lesionesSeleccionadas, enfermedadesSeleccionadas);
        return registroFisicoSinId;
    }

    public static List<EjerciciosDTO> adaptarEjerciciosEntidad(List<Ejercicio> ejercicios) {
        List<EjerciciosDTO> ejerciciosDTO = new LinkedList<>();

        for (Ejercicio e : ejercicios) {
            EjerciciosDTO ejercicioDTO = new EjerciciosDTO();
            ejercicioDTO.setId(e.getId());
            ejercicioDTO.setNombre(e.getNombre());
            ejerciciosDTO.add(ejercicioDTO);
        }

        return ejerciciosDTO;
    }

    public static List<EnfermedadesDTO> adaptarEnfermedadesEntidad(List<Enfermedades> enfermedades) {
        List<EnfermedadesDTO> enfermedadesDTO = new LinkedList<>();

        for (Enfermedades e : enfermedades) {
            EnfermedadesDTO enfermedadDTO = new EnfermedadesDTO();
            enfermedadDTO.setId(e.getId());
            enfermedadDTO.setNombre(e.getNombre());
            enfermedadesDTO.add(enfermedadDTO);
        }

        return enfermedadesDTO;
    }

    public static List<LesionesDTO> adaptarLesionesEntidad(List<Lesiones> lesiones) {
        List<LesionesDTO> lesionesDTO = new LinkedList<>();

        for (Lesiones e : lesiones) {
            LesionesDTO lesionDTO = new LesionesDTO();
            lesionDTO.setId(e.getId());
            lesionDTO.setNombre(e.getNombre());
            lesionesDTO.add(lesionDTO);
        }

        return lesionesDTO;
    }

    public static EstadoRutinaDTO adaptarEstadoRutinaEntidad(EstadoRutina estadoRutinaEntidad) {
        EstadoRutinaDTO estadoRutinaDTO = EstadoRutinaDTO.ASIGNADA;

        if (estadoRutinaEntidad == EstadoRutina.SIN_ASIGNAR) {
            estadoRutinaDTO = EstadoRutinaDTO.SIN_ASIGNAR;
        }
        return estadoRutinaDTO;
    }

    public static RutinaDTO adaptarRutinaEntidad(Rutina rutinaEntidad) {
        if (rutinaEntidad == null) {
            return null;
        }

        List<DetallesRutinaDTO> detallesRutina = new LinkedList<>();

        if (rutinaEntidad.getDetallesRutina() != null) {
            for (DetallesRutina dt : rutinaEntidad.getDetallesRutina()) {

                List<EjerciciosSeleccionadosDTO> ejerciciosSeleccionados = new LinkedList<>();
                for (EjerciciosSeleccionados est : dt.getEjerciciosSeleccionados()) {
                    EjerciciosSeleccionadosDTO ejercicioSeleccionado = new EjerciciosSeleccionadosDTO();
                    ejercicioSeleccionado.setId(est.getId());
                    ejercicioSeleccionado.setNombre(est.getNombre());
                    ejerciciosSeleccionados.add(ejercicioSeleccionado);
                }

                DetallesRutinaDTO detalleRutina = new DetallesRutinaDTO();
                detalleRutina.setId(dt.getId());
                detalleRutina.setEjerciciosSeleccionados(ejerciciosSeleccionados);
                detalleRutina.setPesoRecomendado(dt.getPesoRecomendado());
                detalleRutina.setRepeticionesRecomendadas(dt.getRepeticionesRecomendadas());
                detalleRutina.setSeriesRecomendadas(dt.getSeriesRecomendadas());
                detalleRutina.setNotas(dt.getNotas());
                detallesRutina.add(detalleRutina);
            }
        }

        if (rutinaEntidad.getId() != null) {
            RutinaDTO rutinaConId = new RutinaDTO(rutinaEntidad.getId(), rutinaEntidad.getIdCliente(),
                    rutinaEntidad.getDiaSemana(), rutinaEntidad.getFechaAsignada(),
                    adaptarEstadoRutinaEntidad(rutinaEntidad.getEstadoRutina()),
                    detallesRutina);
            return rutinaConId;
        }

        RutinaDTO rutinaSinId = new RutinaDTO(rutinaEntidad.getIdCliente(),
                rutinaEntidad.getDiaSemana(), rutinaEntidad.getFechaAsignada(),
                adaptarEstadoRutinaEntidad(rutinaEntidad.getEstadoRutina()),
                detallesRutina);

        return rutinaSinId;
    }
}
