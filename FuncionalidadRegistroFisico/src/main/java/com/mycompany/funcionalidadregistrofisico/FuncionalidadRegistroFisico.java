/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funcionalidadregistrofisico;

import BOs.BOException;
import BOs.ClientesBO;
import BOs.EjerciciosBO;
import BOs.EnfermedadesBO;
import BOs.LesionesBO;
import BOs.RegistroFisicoBO;
import BOs.RutinasBO;
import DTOS.DetalleRutinaReporteDTO;
import DTOS.EjerciciosDTO;
import DTOS.EnfermedadesDTO;
import DTOS.LesionesDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOS.ReporteRutinaClienteDTO;
import DTOS.RutinaDTO;
import DTOS.RutinaSemanalReporteDTO;
import DTOsPersistencia.filtrosBusquedaClientesDTO;
import Interfaces.IClientesBO;
import Interfaces.IEjerciciosBO;
import Interfaces.IEnfermedadesBO;
import Interfaces.ILesionesBO;
import Interfaces.IRegistroFisicoBO;
import Interfaces.IRutinasBO;
import com.mycompany.infraestructura.DetalleRutinaPdfDTO;
import com.mycompany.infraestructura.GeneradorPDFException;
import com.mycompany.infraestructura.GeneradorReportePDF;
import com.mycompany.infraestructura.IGeneradorReportePDF;
import com.mycompany.infraestructura.ReporteRutinaClientePdfDTO;
import com.mycompany.infraestructura.RutinaSemanaPdfDTO;
import java.util.List;

/**
 *
 * @author Diego
 */
public class FuncionalidadRegistroFisico implements IFuncionalidadRegistroFisico {

    private IRutinasBO rutinasBO;
    private IRegistroFisicoBO registroFisicoBO;
    private IClientesBO clientesBO;
    private IEnfermedadesBO enfermedadesBO;
    private ILesionesBO lesionesBO;
    private IEjerciciosBO ejerciciosBO;
    private IGeneradorReportePDF generadorPdf;

    public FuncionalidadRegistroFisico() {
        rutinasBO = new RutinasBO();
        registroFisicoBO = new RegistroFisicoBO();
        clientesBO = new ClientesBO();
        enfermedadesBO = new EnfermedadesBO();
        lesionesBO = new LesionesBO();
        ejerciciosBO = new EjerciciosBO();
        generadorPdf = new GeneradorReportePDF();
    }

    //TODOOOO validaciones
    @Override
    public RegistroFisicoDTO consultarRegistroFisico(String idCliente) throws RegistroFisicoException {
        try {
            return registroFisicoBO.consultarRegistroFisico(idCliente);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar el registro fisico", ex);
        }
    }

    //apartado usuario
    @Override
    public RegistroFisicoDTO guardarRegistroFisico(RegistroFisicoDTO registroFisicoDTO) throws RegistroFisicoException {
        try {
            return registroFisicoBO.guardarRegistroFisico(registroFisicoDTO);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al guardar el registro fisico", ex);
        }
    }

    @Override
    public RutinaDTO consultarRutina(String idCliente, String diaSemana) throws RegistroFisicoException {
        try {
            return rutinasBO.consultarRutina(idCliente, diaSemana);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar rutina", ex);
        }
    }

    @Override
    public List<EnfermedadesDTO> traerEnfermedades() throws RegistroFisicoException {
        try {
            return enfermedadesBO.consultarEnfermedades();
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar las enfermedades", ex);
        }
    }

    @Override
    public List<LesionesDTO> traerLesiones() throws RegistroFisicoException {
        try {
            return lesionesBO.consultarLesiones();
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar las lesiones", ex);
        }
    }

    @Override
    public List<RutinaDTO> consultarTodasRutinaClientes(String idCliente) throws RegistroFisicoException {
        try {
            return rutinasBO.consultarTodasRutinaCliente(idCliente);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar las rutinas del cliente", ex);
        }
    }

    //apartado como administrador 
    @Override
    public List<NuevoClienteDTO> consultarClientesFiltros(filtrosBusquedaClientesDTO filtros) throws RegistroFisicoException {
        try {
            return clientesBO.filtrosBarraBusquedaCliente(filtros);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al consultar clientes", ex);
        }
    }

    @Override
    public RutinaDTO guardarRutina(RutinaDTO rutina) throws RegistroFisicoException {
        try {
            return rutinasBO.guardarRutina(rutina);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al guardar la rutina ", ex);
        }
    }

    @Override
    public void eliminarRutina(String idCliente, String diaSemana) throws RegistroFisicoException {
        try {
            rutinasBO.eliminarRutina(idCliente, diaSemana);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al guardar la rutina ", ex);
        }
    }

    @Override
    public RutinaDTO editarRutina(RutinaDTO rutinaDTO) throws RegistroFisicoException {
        try {
            return rutinasBO.editarRutina(rutinaDTO);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al editar la rutina ", ex);
        }
    }

    @Override
    public NuevoClienteDTO buscarClientePorId(String id) throws RegistroFisicoException {
        try {
            return clientesBO.buscarClientePorId(id);
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al buscar el cliente por id", ex);
        }
    }

    @Override
    public List<EjerciciosDTO> traerEjercicios() throws RegistroFisicoException {
        try {
            return ejerciciosBO.consultarEjercicios();
        } catch (BOException ex) {
            throw new RegistroFisicoException("Error al editar la rutina ", ex);
        }
    }

    //reportesss
    @Override
    public byte[] ReporteRutinaPDF(ReporteRutinaClienteDTO datosReporte) throws RegistroFisicoException {
        try {
            ReporteRutinaClientePdfDTO reportePdf = new ReporteRutinaClientePdfDTO();
            reportePdf.setNombreCliente(datosReporte.getNombreCliente());
            reportePdf.setFechaGenerado(datosReporte.getFechaGenerado());

            List<RutinaSemanaPdfDTO> diasPdf = new java.util.LinkedList<>();
            for (RutinaSemanalReporteDTO diaSemana : datosReporte.getDiasRutina()) {
                List<DetalleRutinaPdfDTO> detallesPdf = new java.util.LinkedList<>();

                for (DetalleRutinaReporteDTO ejerciciosReporte : diaSemana.getDetalleRutina()) {
                    DetalleRutinaPdfDTO ejercicioPdf = new DetalleRutinaPdfDTO();
                    ejercicioPdf.setNombreEjercicio(ejerciciosReporte.getNombreEjercicio());
                    ejercicioPdf.setSeriesRecomendadas(ejerciciosReporte.getSeriesRecomendadas());
                    ejercicioPdf.setRepeticionesRecomendadas(ejerciciosReporte.getRepeticionesRecomendadas());
                    ejercicioPdf.setPesoRecomendadas(ejerciciosReporte.getPesoRecomendadas());
                    detallesPdf.add(ejercicioPdf);
                }
                RutinaSemanaPdfDTO diaPdf = new RutinaSemanaPdfDTO();
                diaPdf.setDiaSemana(diaSemana.getDiaSemana());
                diaPdf.setNotas(diaSemana.getNotas());
                diaPdf.setDetalleRutina(detallesPdf);
                diasPdf.add(diaPdf);
            }

            reportePdf.setDiasRutina(diasPdf);

            return generadorPdf.generarReporteRutinaCliente(reportePdf);
        } catch (GeneradorPDFException ex) {
            throw new RegistroFisicoException("Error al descargar la rutina ", ex);
        }
    }

}
