/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.infraestructura;

/**
 *
 * @author Diego
 */
public interface IGeneradorReportePDF {

    public byte[] generarReporteRutinaCliente(ReporteRutinaClientePdfDTO datos) throws GeneradorPDFException;

    public byte[] generarReporteAdministrador(ReporteAdministradorPdfDTO datos) throws GeneradorPDFException;

}
