/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.DetalleRutinaReporteDTO;
import DTOS.DetallesRutinaDTO;
import DTOS.NuevoClienteDTO;
import DTOS.ReporteRutinaClienteDTO;
import DTOS.RutinaDTO;
import DTOS.RutinaSemanalReporteDTO;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Diego
 */
public class MenuRutinasClienteFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuRutinasClienteFORM.class.getName());

    private ControlNavegacion controlNavegacion;
    private ControlRegistroInicioSesion controlRegistroInicioSesion;
    private ControlRegistroFisico controlRegistroFisico;

    public MenuRutinasClienteFORM(ControlNavegacion controlNavegacion, ControlRegistroInicioSesion controlRegistroInicioSesion, ControlRegistroFisico controlRegistroFisico) {
        this.controlNavegacion = controlNavegacion;
        this.controlRegistroInicioSesion = controlRegistroInicioSesion;
        this.controlRegistroFisico = controlRegistroFisico;
        this.setResizable(false);
        this.setTitle("Menú Rutinas");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblConsultarRutina = new javax.swing.JLabel();
        btnSeleccionarConsultarRutina = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        lblDescargar = new javax.swing.JLabel();
        btnSeleccionarDescargarRutina = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        btnVolverAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 93, 960, 10));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 70)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Menú de Rutinas");
        jPanel.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 600, 94));

        jSeparator5.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator5.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 180, 10, 270));

        lblConsultarRutina.setBackground(new java.awt.Color(255, 255, 255));
        lblConsultarRutina.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblConsultarRutina.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultarRutina.setText("Consultar Rutina");
        jPanel.add(lblConsultarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 160, 40));

        btnSeleccionarConsultarRutina.setBackground(new java.awt.Color(255, 0, 51));
        btnSeleccionarConsultarRutina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSeleccionarConsultarRutina.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarConsultarRutina.setText("Seleccionar");
        btnSeleccionarConsultarRutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSeleccionarConsultarRutina.addActionListener(this::btnSeleccionarConsultarRutinaActionPerformed);
        jPanel.add(btnSeleccionarConsultarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 187, 40));

        jSeparator6.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator6.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 240, -1));

        jSeparator7.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator7.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 240, -1));

        jSeparator8.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator8.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 10, 270));

        jSeparator9.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator9.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 10, 270));

        lblDescargar.setBackground(new java.awt.Color(255, 255, 255));
        lblDescargar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblDescargar.setForeground(new java.awt.Color(255, 255, 255));
        lblDescargar.setText("Descargar Rutina PDF");
        jPanel.add(lblDescargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 200, 40));

        btnSeleccionarDescargarRutina.setBackground(new java.awt.Color(255, 0, 51));
        btnSeleccionarDescargarRutina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSeleccionarDescargarRutina.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarDescargarRutina.setText("Seleccionar");
        btnSeleccionarDescargarRutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSeleccionarDescargarRutina.addActionListener(this::btnSeleccionarDescargarRutinaActionPerformed);
        jPanel.add(btnSeleccionarDescargarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 187, 40));

        jSeparator10.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator10.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 240, -1));

        jSeparator11.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator11.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 240, -1));

        jSeparator12.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator12.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 10, 270));

        btnVolverAtras.setBackground(new java.awt.Color(255, 0, 51));
        btnVolverAtras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolverAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverAtras.setText("<");
        btnVolverAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolverAtras.addActionListener(this::btnVolverAtrasActionPerformed);
        jPanel.add(btnVolverAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarConsultarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarConsultarRutinaActionPerformed
        controlNavegacion.navegarRutinaSemanalCliente();
    }//GEN-LAST:event_btnSeleccionarConsultarRutinaActionPerformed

    private void btnSeleccionarDescargarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarDescargarRutinaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar Plan de Entrenamiento Semanal");
        fileChooser.setFileFilter(new FileNameExtensionFilter("Documento PDF", "pdf"));
        Date fechaActual = new Date();
        SimpleDateFormat formatoFechas = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = formatoFechas.format(fechaActual);

        int seleccionUsuario = fileChooser.showSaveDialog(this);
        if (seleccionUsuario == JFileChooser.APPROVE_OPTION) {
            java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
            String ruta = archivoSeleccionado.getAbsolutePath();
            if (!ruta.toLowerCase().endsWith(".pdf")) {
                ruta += ".pdf";
            }

            try {
                NuevoClienteDTO clienteActual = controlRegistroInicioSesion.getClienteActual();
                List<RutinaDTO> rutinasConsultadas = controlRegistroFisico.consultarTodasRutinasCliente(clienteActual.getId());

                if (rutinasConsultadas == null || rutinasConsultadas.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Usted no tiene rutinas registradas en la semana para exportar", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                ReporteRutinaClienteDTO reporteRutinaDatos = new ReporteRutinaClienteDTO();
                reporteRutinaDatos.setNombreCliente(clienteActual.getNombre());
                reporteRutinaDatos.setFechaGenerado(fechaString);

                List<RutinaSemanalReporteDTO> listaDiasSemanaReporte = new LinkedList<>();

                for (RutinaDTO rDto : rutinasConsultadas) {
                    RutinaSemanalReporteDTO diaSemanaReporteDatos = new RutinaSemanalReporteDTO();
                    diaSemanaReporteDatos.setDiaSemana(rDto.getDiaSemana());
                    diaSemanaReporteDatos.setNotas(rDto.getNotas());

                    List<DetalleRutinaReporteDTO> listaEjerciciosReporte = new LinkedList<>();

                    for (DetallesRutinaDTO drDto : rDto.getDetallesRutina()) {
                        DetalleRutinaReporteDTO ejercicioReporteDatos = new DetalleRutinaReporteDTO();

                        ejercicioReporteDatos.setSeriesRecomendadas(drDto.getSeriesRecomendadas());
                        ejercicioReporteDatos.setRepeticionesRecomendadas(drDto.getRepeticionesRecomendadas());
                        ejercicioReporteDatos.setPesoRecomendadas(drDto.getPesoRecomendado());
                        String nombreEjercicio = drDto.getEjerciciosSeleccionados().get(0).getNombre();

                        ejercicioReporteDatos.setNombreEjercicio(nombreEjercicio);
                        listaEjerciciosReporte.add(ejercicioReporteDatos);
                    }
                    diaSemanaReporteDatos.setDetalleRutina(listaEjerciciosReporte);
                    listaDiasSemanaReporte.add(diaSemanaReporteDatos);
                }

                reporteRutinaDatos.setDiasRutina(listaDiasSemanaReporte);

                byte[] pdfBytes = controlRegistroFisico.descargarRutinaPdf(reporteRutinaDatos);
                FileOutputStream outpout = new FileOutputStream(ruta);
                outpout.write(pdfBytes);
                outpout.flush();
                outpout.close();

                JOptionPane.showMessageDialog(this, "¡PDF Creado con éxito en: " + ruta, "Éxito", JOptionPane.INFORMATION_MESSAGE);

            } catch (RegistroFisicoException | IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al descargar el reporte: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSeleccionarDescargarRutinaActionPerformed

    private void btnVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtrasActionPerformed
        controlNavegacion.navegarBienvenida(controlRegistroInicioSesion.getClienteActual());
    }//GEN-LAST:event_btnVolverAtrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarConsultarRutina;
    private javax.swing.JButton btnSeleccionarDescargarRutina;
    private javax.swing.JButton btnVolverAtras;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblConsultarRutina;
    private javax.swing.JLabel lblDescargar;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
