/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infraestructura;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Diego
 */
public class GeneradorReportePDF implements IGeneradorReportePDF {

    @Override
    public byte[] generarReporteRutinaCliente(ReporteRutinaClientePdfDTO datos) throws GeneradorPDFException {
        Document documento = new Document(PageSize.A4, 36, 36, 54, 54);
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        try {
            PdfWriter.getInstance(documento, salida);
            documento.open();

            Font fuenteTitulo = new Font(Font.FontFamily.HELVETICA, 24, Font.BOLD, new BaseColor(225, 6, 0));
            Font fuenteSubtitulo = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL, BaseColor.DARK_GRAY);
            Font fuenteDia = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.BLACK);
            Font fuenteEncabezadoTabla = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.WHITE);
            Font fuenteCuerpoTabla = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
            Font fuenteNotas = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLD, BaseColor.DARK_GRAY);

            Paragraph titulo = new Paragraph("FitLife GYM - SEMANA DE ENTRENAMIENTO", fuenteTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.setSpacingAfter(15);
            documento.add(titulo);

            documento.add(new Paragraph("Cliente: " + datos.getNombreCliente(), fuenteSubtitulo));
            documento.add(new Paragraph("Fecha de Descarga: " + datos.getFechaGenerado(), fuenteSubtitulo));
            documento.add(new Paragraph("-----------------------------------------------------", fuenteSubtitulo));
            documento.add(Chunk.NEWLINE);

            for (RutinaSemanaPdfDTO diaSemana : datos.getDiasRutina()) {
                Paragraph parrafoDia = new Paragraph(diaSemana.getDiaSemana(), fuenteDia);
                parrafoDia.setSpacingBefore(6f);
                documento.add(parrafoDia);

                if (diaSemana.getNotas() != null) {
                    Paragraph parrafoNotas = new Paragraph("Notas: " + diaSemana.getNotas(), fuenteNotas);
                    parrafoNotas.setSpacingAfter(3f);
                    documento.add(parrafoNotas);
                }

                PdfPTable tablaDetalles = new PdfPTable(4);
                tablaDetalles.setWidthPercentage(100);
                tablaDetalles.setWidths(new float[]{5f, 1.5f, 1.5f, 2f});
                tablaDetalles.setSpacingBefore(2f);
                tablaDetalles.setSpacingAfter(6f);
                tablaDetalles.setHeaderRows(1);

                String[] encabezadoTabla = {"Ejercicio", "Series Recomendadas", "Repeticiones Recomendadas", "Peso Recomendado"};
                for (String e : encabezadoTabla) {
                    PdfPCell celda = new PdfPCell(new Phrase(e, fuenteEncabezadoTabla));
                    celda.setBackgroundColor(new BaseColor(40, 40, 40));
                    celda.setBorder(Rectangle.NO_BORDER);
                    celda.setPadding(5);
                    if (!e.equals("Ejercicio")) {
                        celda.setHorizontalAlignment(Element.ALIGN_CENTER);
                    }
                    tablaDetalles.addCell(celda);
                }
                for (DetalleRutinaPdfDTO ejercicios : diaSemana.getDetalleRutina()) {

                    PdfPCell celdaNombre = new PdfPCell(new Phrase(ejercicios.getNombreEjercicio(), fuenteCuerpoTabla));
                    celdaNombre.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celdaNombre.setBorder(Rectangle.NO_BORDER);
                    celdaNombre.setPadding(4);
                    tablaDetalles.addCell(celdaNombre);

                    PdfPCell celdaSeries = new PdfPCell(new Phrase(String.valueOf(ejercicios.getSeriesRecomendadas()), fuenteCuerpoTabla));
                    celdaSeries.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celdaSeries.setBorder(Rectangle.NO_BORDER);
                    celdaSeries.setPadding(4);
                    tablaDetalles.addCell(celdaSeries);

                    PdfPCell celdaRepeteciones = new PdfPCell(new Phrase(String.valueOf(ejercicios.getRepeticionesRecomendadas()), fuenteCuerpoTabla));
                    celdaRepeteciones.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celdaRepeteciones.setBorder(Rectangle.NO_BORDER);
                    celdaRepeteciones.setPadding(4);
                    tablaDetalles.addCell(celdaRepeteciones);

                    PdfPCell celdaPeso = new PdfPCell(new Phrase(ejercicios.getPesoRecomendadas() + " Kg", fuenteCuerpoTabla));
                    celdaPeso.setHorizontalAlignment(Element.ALIGN_CENTER);
                    celdaPeso.setBorder(Rectangle.NO_BORDER);
                    celdaPeso.setPadding(4);
                    tablaDetalles.addCell(celdaPeso);
                }
                documento.add(tablaDetalles);

                Paragraph separador = new Paragraph("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                        new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL, BaseColor.BLACK));
                separador.setSpacingAfter(10);
                documento.add(separador);
            }

            documento.close();
            return salida.toByteArray();

        } catch (DocumentException e) {
            throw new GeneradorPDFException("Error al generar el PDF");
        }

    }

    @Override
    public byte[] generarReporteAdministrador(ReporteAdministradorPdfDTO datos) throws GeneradorPDFException {
        Document documento = new Document(PageSize.A4, 36, 36, 54, 54);
        ByteArrayOutputStream salida = new ByteArrayOutputStream();

        try {
            PdfWriter.getInstance(documento, salida);
            documento.open();

            Font fuenteTitulo = new Font(Font.FontFamily.HELVETICA, 22, Font.BOLD, new BaseColor(225, 6, 0));
            Font fuenteSubtitulo = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.DARK_GRAY);
            Font fuenteEncabezadoTabla = new Font(Font.FontFamily.HELVETICA, 11, Font.BOLD, BaseColor.WHITE);
            Font fuenteCuerpoTabla = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);

            Paragraph titulo = new Paragraph("FITLIFE GYM - REPORTE DE CLIENTES", fuenteTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.setSpacingAfter(15);
            documento.add(titulo);

            documento.add(new Paragraph("Fecha de Descarga: " + datos.getFechaGenerado(), fuenteSubtitulo));
            documento.add(new Paragraph("-------------------------------------------------------------------------------------------------------", fuenteSubtitulo));
            documento.add(Chunk.NEWLINE);

            PdfPTable tablaClientes = new PdfPTable(3);
            tablaClientes.setWidthPercentage(100);
            tablaClientes.setWidths(new float[]{3f, 5f, 2f});
            tablaClientes.setSpacingBefore(10f);
            tablaClientes.setSpacingAfter(10f);
            tablaClientes.setHeaderRows(1);

            String[] encabezados = {"ID Cliente", "Nombre Completo", "Días de Rutina"};
            for (String e : encabezados) {
                PdfPCell celdaHeader = new PdfPCell(new Phrase(e, fuenteEncabezadoTabla));
                celdaHeader.setBackgroundColor(new BaseColor(40, 40, 40));
                celdaHeader.setBorder(Rectangle.NO_BORDER);
                celdaHeader.setPadding(6);
                celdaHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                celdaHeader.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tablaClientes.addCell(celdaHeader);
            }

            for (ClienteReporteAdminPdfDTO cliente : datos.getClientes()) {
                PdfPCell celdaId = new PdfPCell(new Phrase(cliente.getIdCliente(), fuenteCuerpoTabla));
                celdaId.setHorizontalAlignment(Element.ALIGN_CENTER);
                celdaId.setBorder(Rectangle.NO_BORDER);
                celdaId.setPadding(5);
                tablaClientes.addCell(celdaId);

                PdfPCell celdaNombre = new PdfPCell(new Phrase(cliente.getNombreCompleto(), fuenteCuerpoTabla));
                celdaNombre.setHorizontalAlignment(Element.ALIGN_CENTER);
                celdaNombre.setBorder(Rectangle.NO_BORDER);
                celdaNombre.setPadding(5);
                tablaClientes.addCell(celdaNombre);

                PdfPCell celdaDias = new PdfPCell(new Phrase(String.valueOf(cliente.getDiasRutina()), fuenteCuerpoTabla));
                celdaDias.setHorizontalAlignment(Element.ALIGN_CENTER);
                celdaDias.setBorder(Rectangle.NO_BORDER);
                celdaDias.setPadding(5);
                tablaClientes.addCell(celdaDias);
            }

            documento.add(tablaClientes);
            documento.close();
            return salida.toByteArray();

        } catch (DocumentException e) {
            throw new GeneradorPDFException("Error al generar el PDF");
        }
    }
}
