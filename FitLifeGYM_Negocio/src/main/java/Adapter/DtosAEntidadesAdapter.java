/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

import DTOS.AdministradorDTO;
import DTOS.DetallesRutinaDTO;
import DTOS.EjerciciosSeleccionadosDTO;
import DTOS.EnfermedadesSeleccionadasDTO;
import DTOS.LesionesSeleccionadasDTO;
import DTOsENUMs.EstadoDTO;
import DTOS.NuevaMembresiaCompradaDTO;
import DTOS.NuevaMembresiaDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.RutinaDTO;
import DTOS.UsuarioDTO;
import DTOsENUMs.EstadoRutinaDTO;
import DTOsENUMs.NivelCondicionDTO;
import DTOsENUMs.TipoMembresiaDTO;
import Entidades.Administrador;
import Entidades.Cliente;
import Entidades.DetallesRutina;
import Entidades.EjerciciosSeleccionados;
import Entidades.EnfermedadesSeleccionadas;
import Entidades.Estado;
import Entidades.EstadoRutina;
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
                    clienteDTO.getFechaNacimiento(), membresiaComprada);
            return clienteConId;
        }

        Cliente clienteSinId = new Cliente(clienteDTO.getIdUsuario(),
                clienteDTO.getTelefono(), clienteDTO.getFechaNacimiento(),
                membresiaComprada);

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

    public static NivelCondicion adaptarNivelCondicionDTO(NivelCondicionDTO nivelCondicionDTO) {
        NivelCondicion nivelCondicionEntidad = NivelCondicion.BAJA;

        if (nivelCondicionDTO == NivelCondicionDTO.INTERMEDIA) {
            nivelCondicionEntidad = NivelCondicion.INTERMEDIA;
        } else if (nivelCondicionDTO == NivelCondicionDTO.AVANZADA) {
            nivelCondicionEntidad = NivelCondicion.AVANZADA;
        }

        return nivelCondicionEntidad;
    }

    public static RegistroFisico adaptarRegistroFisicoDTO(RegistroFisicoDTO registroFisicoDTO) {
        if (registroFisicoDTO == null) {
            return null;
        }

        List<LesionesSeleccionadas> lesionesSeleccionadas = new LinkedList<>();
        List<EnfermedadesSeleccionadas> enfermedadesSeleccionadas = new LinkedList<>();

        if (registroFisicoDTO.getLesiones() != null) {
            for (LesionesSeleccionadasDTO lDto : registroFisicoDTO.getLesiones()) {
                LesionesSeleccionadas lesion = new LesionesSeleccionadas();
                lesion.setId(lDto.getId());
                lesion.setNombre(lDto.getNombre());
                lesionesSeleccionadas.add(lesion);
            }
        }

        if (registroFisicoDTO.getEnfermedades() != null) {
            for (EnfermedadesSeleccionadasDTO eDto : registroFisicoDTO.getEnfermedades()) {
                EnfermedadesSeleccionadas enfermedad = new EnfermedadesSeleccionadas();
                enfermedad.setId(eDto.getId());
                enfermedad.setNombre(eDto.getNombre());
                enfermedadesSeleccionadas.add(enfermedad);
            }
        }

        if (registroFisicoDTO.getId() != null) {
            RegistroFisico registroFisicoConId = new RegistroFisico(registroFisicoDTO.getId(),
                    registroFisicoDTO.getIdCliente(),
                    adaptarNivelCondicionDTO(registroFisicoDTO.getNivelCondicion()),
                    lesionesSeleccionadas, enfermedadesSeleccionadas);
            return registroFisicoConId;
        }

        RegistroFisico registroFisicoSinId = new RegistroFisico(
                registroFisicoDTO.getIdCliente(),
                adaptarNivelCondicionDTO(registroFisicoDTO.getNivelCondicion()),
                lesionesSeleccionadas, enfermedadesSeleccionadas);
        return registroFisicoSinId;
    }

    public static EstadoRutina adaptarEstadoRutinaDTO(EstadoRutinaDTO estadoRutinaDTO) {
        EstadoRutina estadoRutinaEntidad = EstadoRutina.ASIGNADA;

        if (estadoRutinaDTO == EstadoRutinaDTO.SIN_ASIGNAR) {
            estadoRutinaEntidad = EstadoRutina.SIN_ASIGNAR;
        }
        return estadoRutinaEntidad;
    }

    public static Rutina adaptarRutinaDTO(RutinaDTO rutinaDTO) {
        if (rutinaDTO == null) {
            return null;
        }

        List<DetallesRutina> detallesRutina = new LinkedList<>();

        if (rutinaDTO.getDetallesRutina() != null) {
            for (DetallesRutinaDTO dt : rutinaDTO.getDetallesRutina()) {

                List<EjerciciosSeleccionados> ejerciciosSeleccionados = new LinkedList<>();
                for (EjerciciosSeleccionadosDTO est : dt.getEjerciciosSeleccionados()) {
                    EjerciciosSeleccionados ejercicioSeleccionado = new EjerciciosSeleccionados();
                    ejercicioSeleccionado.setId(est.getId());
                    ejercicioSeleccionado.setNombre(est.getNombre());
                    ejerciciosSeleccionados.add(ejercicioSeleccionado);
                }

                DetallesRutina detalleRutina = new DetallesRutina();
                detalleRutina.setId(dt.getId());
                detalleRutina.setEjerciciosSeleccionados(ejerciciosSeleccionados);
                detalleRutina.setPesoRecomendado(dt.getPesoRecomendado());
                detalleRutina.setRepeticionesRecomendadas(dt.getRepeticionesRecomendadas());
                detalleRutina.setSeriesRecomendadas(dt.getSeriesRecomendadas());
                detallesRutina.add(detalleRutina);
            }
        }

        if (rutinaDTO.getId() != null) {
            Rutina rutinaConId = new Rutina(rutinaDTO.getId(), rutinaDTO.getIdCliente(),
                    rutinaDTO.getDiaSemana(), rutinaDTO.getFechaAsignada(),
                    adaptarEstadoRutinaDTO(rutinaDTO.getEstadoRutina()),
                    detallesRutina, rutinaDTO.getNotas());
            return rutinaConId;
        }

        Rutina rutinaSinId = new Rutina(rutinaDTO.getIdCliente(),
                rutinaDTO.getDiaSemana(), rutinaDTO.getFechaAsignada(),
                adaptarEstadoRutinaDTO(rutinaDTO.getEstadoRutina()),
                detallesRutina, rutinaDTO.getNotas());

        return rutinaSinId;
    }

    public static Administrador adaptarAdministradorDTO(AdministradorDTO administradorDTO) {
        if (administradorDTO == null) {
            return null;
        }

        if (administradorDTO.getId() != null) {
            Administrador administradoConId = new Administrador();
            administradoConId.setId(administradorDTO.getId());
            administradoConId.setIdUsuario(administradorDTO.getIdUsuario());

            if (administradorDTO.getNombre() != null) {
                administradoConId.setNombre(administradorDTO.getNombre());
            }

            if (administradorDTO.getCorreo() != null) {
                administradoConId.setCorreo(administradorDTO.getCorreo());
            }
            if (administradorDTO.getContrasenia() != null) {
                administradoConId.setContrasenia(administradorDTO.getContrasenia());
            }

            return administradoConId;
        }

        Administrador administradorSinId = new Administrador();
        administradorSinId.setIdUsuario(administradorDTO.getIdUsuario());
        administradorSinId.setId(null);
        if (administradorDTO.getNombre() != null) {
            administradorSinId.setNombre(administradorDTO.getNombre());
        }
        if (administradorDTO.getCorreo() != null) {
            administradorSinId.setCorreo(administradorDTO.getCorreo());
        }
        if (administradorDTO.getContrasenia() != null) {
            administradorSinId.setContrasenia(administradorDTO.getContrasenia());
        }

        return administradorSinId;
    }
}
