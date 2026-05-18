/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.DetallesRutinaDTO;
import DTOS.EjerciciosSeleccionadosDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RutinaDTO;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class DetallesRutinaEliminarOEditarFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DetallesRutinaEliminarOEditarFORM.class.getName());

    private NuevoClienteDTO clienteActual;

    private ControlNavegacion controlNavegacion;
    private ControlRegistroFisico controlRegistroFisico;
    private RutinaDTO rutinaDTO;
    private String diaSemana;

    public DetallesRutinaEliminarOEditarFORM(ControlNavegacion controlNavegacion, ControlRegistroFisico controlRegistroFisico, String diaSemana) {
        this.controlNavegacion = controlNavegacion;
        this.controlRegistroFisico = controlRegistroFisico;
        this.diaSemana = diaSemana;
        this.clienteActual = controlRegistroFisico.getClienteSeleccionado();
        this.setTitle("Día con Rutina ya Asignada!!");
        initComponents();
        this.setLocationRelativeTo(null);
        llenarTablas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tablaDetallesRutina = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnVolverAtras = new javax.swing.JButton();
        btnNotas = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Rutina: DIA");

        jScrollPane.setPreferredSize(new java.awt.Dimension(703, 573));

        tablaDetallesRutina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Ejercicio", "Peso Recomendado", "Repeticiones Recomendadas", "Series Recomendadas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDetallesRutina.setAutoscrolls(false);
        tablaDetallesRutina.getTableHeader().setResizingAllowed(false);
        tablaDetallesRutina.getTableHeader().setReorderingAllowed(false);
        tablaDetallesRutina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDetallesRutinaMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tablaDetallesRutina);

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar Rutina");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnVolverAtras.setBackground(new java.awt.Color(255, 0, 51));
        btnVolverAtras.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolverAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverAtras.setText("<");
        btnVolverAtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolverAtras.addActionListener(this::btnVolverAtrasActionPerformed);

        btnNotas.setBackground(new java.awt.Color(255, 0, 51));
        btnNotas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNotas.setForeground(new java.awt.Color(255, 255, 255));
        btnNotas.setText("Ver notas");
        btnNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNotas.addActionListener(this::btnNotasActionPerformed);

        btnEditar.setBackground(new java.awt.Color(255, 0, 51));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar Rutina");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addComponent(btnVolverAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo))
                    .addComponent(btnVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaDetallesRutinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetallesRutinaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaDetallesRutinaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this,
                "¿Deseas Eliminar la rutina?", "Confirmar Selección", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            try {
                controlRegistroFisico.eliminarRutina(clienteActual.getId(), diaSemana);
                JOptionPane.showMessageDialog(this, "Rutina eliminada con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
                controlNavegacion.navegarRutinaSemanalAdmin();
                this.dispose();
            } catch (RegistroFisicoException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Operación cancelada", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtrasActionPerformed
        controlNavegacion.navegarRutinaSemanalAdmin();
    }//GEN-LAST:event_btnVolverAtrasActionPerformed

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        try {
            this.rutinaDTO = controlRegistroFisico.consultarDetallesRutina(clienteActual.getId(), diaSemana);
            controlNavegacion.navegarVerNotasCliente(rutinaDTO.getNotas());
        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, "Operación cancelada", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnNotasActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        controlNavegacion.navegarDetallesRutinaAdmin(diaSemana);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void diseñoTabla() {
        tablaDetallesRutina.setRowHeight(60);
        tablaDetallesRutina.setBackground(new java.awt.Color(30, 30, 30));
        tablaDetallesRutina.setForeground(java.awt.Color.WHITE);
        tablaDetallesRutina.setGridColor(new java.awt.Color(225, 6, 0));
        tablaDetallesRutina.getTableHeader().setBackground(new java.awt.Color(30, 30, 30));
        tablaDetallesRutina.getTableHeader().setForeground(java.awt.Color.WHITE);
        tablaDetallesRutina.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        DefaultTableCellRenderer renderCentrado = new DefaultTableCellRenderer();
        renderCentrado.setHorizontalAlignment(JLabel.CENTER);
        tablaDetallesRutina.getColumnModel().getColumn(0).setCellRenderer(renderCentrado);
        tablaDetallesRutina.getColumnModel().getColumn(1).setCellRenderer(renderCentrado);
        tablaDetallesRutina.getColumnModel().getColumn(2).setCellRenderer(renderCentrado);
        tablaDetallesRutina.getColumnModel().getColumn(3).setCellRenderer(renderCentrado);
        jScrollPane.getViewport().setBackground(new java.awt.Color(30, 30, 30));
    }

    public void llenarTablas() {
        try {
            this.rutinaDTO = controlRegistroFisico.consultarDetallesRutina(clienteActual.getId(), diaSemana);
            DefaultTableModel modelo = (DefaultTableModel) tablaDetallesRutina.getModel();
            modelo.setRowCount(0);

            if (rutinaDTO == null || rutinaDTO.getDetallesRutina() == null) {
                modelo.addRow(new Object[]{" Sin Rutina", "-", "-", "-"});
                return;
            }
            for (DetallesRutinaDTO dto : rutinaDTO.getDetallesRutina()) {
                for (EjerciciosSeleccionadosDTO edto : dto.getEjerciciosSeleccionados()) {
                    modelo.addRow(new Object[]{
                        edto.getNombre(),
                        dto.getPesoRecomendado(),
                        dto.getRepeticionesRecomendadas(),
                        dto.getSeriesRecomendadas()
                    });
                }
            }
            diseñoTabla();
        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnVolverAtras;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaDetallesRutina;
    // End of variables declaration//GEN-END:variables
}
