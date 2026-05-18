/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Diego
 */
public class DetalleRutinaDiaAdministradorFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DetalleRutinaDiaAdministradorFORM.class.getName());

    private ControlNavegacion controlNavegacion;
    private String diaSemana;

    public DetalleRutinaDiaAdministradorFORM(ControlNavegacion controlNavegacion,String diaSemana) {
        this.controlNavegacion = controlNavegacion;
        this.diaSemana = diaSemana;
        this.setTitle("Detalles de Rutina");
        initComponents();
        this.setLocationRelativeTo(null);
        agregarDiaSemana();
        diseñoTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tablaDetallesRutina = new javax.swing.JTable();
        btnGuardarRutinaDetalles = new javax.swing.JButton();
        btnEliminarRutina = new javax.swing.JButton();
        btnVerRegistroFisico = new javax.swing.JButton();
        btnNotas = new javax.swing.JButton();

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
        ));
        tablaDetallesRutina.setAutoscrolls(false);
        tablaDetallesRutina.getTableHeader().setResizingAllowed(false);
        tablaDetallesRutina.getTableHeader().setReorderingAllowed(false);
        tablaDetallesRutina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDetallesRutinaMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tablaDetallesRutina);

        btnGuardarRutinaDetalles.setBackground(new java.awt.Color(255, 0, 51));
        btnGuardarRutinaDetalles.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardarRutinaDetalles.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarRutinaDetalles.setText("Guardar Rutina");
        btnGuardarRutinaDetalles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardarRutinaDetalles.addActionListener(this::btnGuardarRutinaDetallesActionPerformed);

        btnEliminarRutina.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminarRutina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminarRutina.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarRutina.setText("Eliminar Rutina");
        btnEliminarRutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminarRutina.addActionListener(this::btnEliminarRutinaActionPerformed);

        btnVerRegistroFisico.setBackground(new java.awt.Color(255, 0, 51));
        btnVerRegistroFisico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVerRegistroFisico.setForeground(new java.awt.Color(255, 255, 255));
        btnVerRegistroFisico.setText("Registro Físico");
        btnVerRegistroFisico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVerRegistroFisico.addActionListener(this::btnVerRegistroFisicoActionPerformed);

        btnNotas.setBackground(new java.awt.Color(255, 0, 51));
        btnNotas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNotas.setForeground(new java.awt.Color(255, 255, 255));
        btnNotas.setText("Agregar Notas");
        btnNotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNotas.addActionListener(this::btnNotasActionPerformed);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnVerRegistroFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170)
                .addComponent(btnEliminarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarRutinaDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerRegistroFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarRutina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarRutinaDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaDetallesRutinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetallesRutinaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaDetallesRutinaMouseClicked

    private void btnGuardarRutinaDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarRutinaDetallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarRutinaDetallesActionPerformed

    private void btnEliminarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarRutinaActionPerformed

    private void btnVerRegistroFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistroFisicoActionPerformed
        controlNavegacion.navegarConsultarRegistroFisico();
    }//GEN-LAST:event_btnVerRegistroFisicoActionPerformed

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        controlNavegacion.navegarAgregarNotasAdmin();
    }//GEN-LAST:event_btnNotasActionPerformed

    public void agregarDiaSemana(){
        lblTitulo.setText("Día: " + diaSemana);
    }
    
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
        jScrollPane.getViewport().setBackground(new java.awt.Color(30, 30, 30));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarRutina;
    private javax.swing.JButton btnGuardarRutinaDetalles;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnVerRegistroFisico;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaDetallesRutina;
    // End of variables declaration//GEN-END:variables
}
