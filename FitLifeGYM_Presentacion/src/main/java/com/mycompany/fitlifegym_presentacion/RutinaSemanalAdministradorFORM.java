/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Diego
 */
public class RutinaSemanalAdministradorFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RutinaSemanalAdministradorFORM.class.getName());

    private ControlNavegacion controlNavegacion;

    public RutinaSemanalAdministradorFORM(ControlNavegacion controlNavegacion) {
        this.controlNavegacion = controlNavegacion;
        this.setTitle("Rutina Semanal Administrar");
        initComponents();
        this.setLocationRelativeTo(null);
        diseñoTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        DiasSemanaTable = new javax.swing.JTable();
        btnVolverAtras3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Rutina Semanal");

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane.setPreferredSize(new java.awt.Dimension(703, 573));

        DiasSemanaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Lunes"},
                {"Martes"},
                {"Miercoles"},
                {"Jueves"},
                {"Viernes"}
            },
            new String [] {
                "Día"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DiasSemanaTable.setAutoscrolls(false);
        DiasSemanaTable.getTableHeader().setResizingAllowed(false);
        DiasSemanaTable.getTableHeader().setReorderingAllowed(false);
        DiasSemanaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiasSemanaTableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(DiasSemanaTable);

        btnVolverAtras3.setBackground(new java.awt.Color(255, 0, 51));
        btnVolverAtras3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolverAtras3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverAtras3.setText("<");
        btnVolverAtras3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolverAtras3.addActionListener(this::btnVolverAtras3ActionPerformed);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addComponent(btnVolverAtras3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo))
                    .addComponent(btnVolverAtras3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
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
            .addGap(0, 601, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DiasSemanaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiasSemanaTableMouseClicked
        int fila = DiasSemanaTable.getSelectedRow();
        String diaSemana = (String) DiasSemanaTable.getValueAt(fila, 0);
        try {
            
            controlNavegacion.navegarDetallesRutinaAdmin(diaSemana);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DiasSemanaTableMouseClicked

    private void btnVolverAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras3ActionPerformed
        controlNavegacion.navegarAdministrarCliente();
    }//GEN-LAST:event_btnVolverAtras3ActionPerformed

    private void diseñoTabla() {
        DiasSemanaTable.setRowHeight(75);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        DiasSemanaTable.getTableHeader().setBackground(new java.awt.Color(30, 30, 30));
        DiasSemanaTable.getTableHeader().setForeground(java.awt.Color.WHITE);
        DiasSemanaTable.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        DiasSemanaTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        DiasSemanaTable.setBackground(new java.awt.Color(30, 30, 30));
        DiasSemanaTable.setForeground(java.awt.Color.WHITE);
        DiasSemanaTable.setGridColor(new java.awt.Color(225, 6, 0));
        jScrollPane.getViewport().setBackground(new java.awt.Color(30, 30, 30));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DiasSemanaTable;
    private javax.swing.JButton btnVolverAtras3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
