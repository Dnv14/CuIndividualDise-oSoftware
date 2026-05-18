/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.EnfermedadesSeleccionadasDTO;
import DTOS.LesionesSeleccionadasDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class ConsultarRegistroFisicoFORM extends javax.swing.JDialog {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConsultarRegistroFisicoFORM.class.getName());

    private ControlNavegacion controlNavegacion;
    private ControlRegistroFisico controlRegistroFisco;
    private RegistroFisicoDTO registroFisico;
    private NuevoClienteDTO clienteActual;

    public ConsultarRegistroFisicoFORM(java.awt.Frame parent, boolean modal, ControlNavegacion controlNavegacion, ControlRegistroFisico controlRegistroFisco) {
        super(parent, modal);
        this.controlNavegacion = controlNavegacion;
        this.controlRegistroFisco = controlRegistroFisco;
        this.clienteActual = controlRegistroFisco.getClienteSeleccionado();
        this.setLocationRelativeTo(null);
        this.setTitle("Consulta de Registro Físico");
        initComponents();
        llenarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblLimitacionesFisicas = new javax.swing.JLabel();
        lblCondicionSeleccionada = new javax.swing.JLabel();
        lblEnfermedades = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        enfermedadesSeleccionadas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        limitacionesFisicasSeleccionadas = new javax.swing.JTable();
        lblNivelCondicion1 = new javax.swing.JLabel();
        btnVolverAtras3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registro Físico: NOMBRE CLIENTE");

        lblLimitacionesFisicas.setBackground(new java.awt.Color(255, 255, 255));
        lblLimitacionesFisicas.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblLimitacionesFisicas.setForeground(new java.awt.Color(255, 255, 255));
        lblLimitacionesFisicas.setText("Limitaciones Físicas:");

        lblCondicionSeleccionada.setBackground(new java.awt.Color(255, 255, 255));
        lblCondicionSeleccionada.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblCondicionSeleccionada.setForeground(new java.awt.Color(255, 255, 255));
        lblCondicionSeleccionada.setText("Nivel de Condición Cliente");

        lblEnfermedades.setBackground(new java.awt.Color(255, 255, 255));
        lblEnfermedades.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblEnfermedades.setForeground(new java.awt.Color(255, 255, 255));
        lblEnfermedades.setText("Enfermedades:");

        jScrollPane.setPreferredSize(new java.awt.Dimension(703, 573));

        enfermedadesSeleccionadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        enfermedadesSeleccionadas.setAutoscrolls(false);
        enfermedadesSeleccionadas.getTableHeader().setResizingAllowed(false);
        enfermedadesSeleccionadas.getTableHeader().setReorderingAllowed(false);
        enfermedadesSeleccionadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enfermedadesSeleccionadasMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(enfermedadesSeleccionadas);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(703, 573));

        limitacionesFisicasSeleccionadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        limitacionesFisicasSeleccionadas.setAutoscrolls(false);
        limitacionesFisicasSeleccionadas.getTableHeader().setResizingAllowed(false);
        limitacionesFisicasSeleccionadas.getTableHeader().setReorderingAllowed(false);
        limitacionesFisicasSeleccionadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limitacionesFisicasSeleccionadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(limitacionesFisicasSeleccionadas);

        lblNivelCondicion1.setBackground(new java.awt.Color(255, 255, 255));
        lblNivelCondicion1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblNivelCondicion1.setForeground(new java.awt.Color(255, 255, 255));
        lblNivelCondicion1.setText("Nivel de Condición:");

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
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(lblLimitacionesFisicas, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(lblEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCondicionSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addComponent(btnVolverAtras3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelLayout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(lblNivelCondicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(612, Short.MAX_VALUE)))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap(92, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTitulo))
                            .addComponent(btnVolverAtras3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168)
                        .addComponent(lblLimitacionesFisicas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEnfermedades)
                        .addGap(171, 171, 171)))
                .addComponent(lblCondicionSeleccionada)
                .addGap(188, 188, 188))
            .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                    .addContainerGap(716, Short.MAX_VALUE)
                    .addComponent(lblNivelCondicion1)
                    .addGap(188, 188, 188)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enfermedadesSeleccionadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enfermedadesSeleccionadasMouseClicked

    }//GEN-LAST:event_enfermedadesSeleccionadasMouseClicked

    private void limitacionesFisicasSeleccionadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limitacionesFisicasSeleccionadasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_limitacionesFisicasSeleccionadasMouseClicked

    private void btnVolverAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverAtras3ActionPerformed

    private void diseñoTablas() {
        enfermedadesSeleccionadas.setRowHeight(40);
        enfermedadesSeleccionadas.setBackground(new java.awt.Color(30, 30, 30));
        enfermedadesSeleccionadas.setForeground(java.awt.Color.WHITE);
        enfermedadesSeleccionadas.setGridColor(new java.awt.Color(225, 6, 0));

        enfermedadesSeleccionadas.getTableHeader().setBackground(new java.awt.Color(30, 30, 30));
        enfermedadesSeleccionadas.getTableHeader().setForeground(java.awt.Color.WHITE);
        enfermedadesSeleccionadas.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));

        DefaultTableCellRenderer renderEnfermedades = new DefaultTableCellRenderer();
        renderEnfermedades.setHorizontalAlignment(JLabel.CENTER);
        enfermedadesSeleccionadas.getColumnModel().getColumn(0).setCellRenderer(renderEnfermedades);
        jScrollPane2.getViewport().setBackground(new java.awt.Color(30, 30, 30));

        limitacionesFisicasSeleccionadas.setRowHeight(40);
        limitacionesFisicasSeleccionadas.setBackground(new java.awt.Color(30, 30, 30));
        limitacionesFisicasSeleccionadas.setForeground(java.awt.Color.WHITE);
        limitacionesFisicasSeleccionadas.setGridColor(new java.awt.Color(225, 6, 0));

        limitacionesFisicasSeleccionadas.getTableHeader().setBackground(new java.awt.Color(30, 30, 30));
        limitacionesFisicasSeleccionadas.getTableHeader().setForeground(java.awt.Color.WHITE);
        limitacionesFisicasSeleccionadas.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));

        DefaultTableCellRenderer renderLimitaciones = new DefaultTableCellRenderer();
        renderLimitaciones.setHorizontalAlignment(JLabel.CENTER);
        limitacionesFisicasSeleccionadas.getColumnModel().getColumn(0).setCellRenderer(renderLimitaciones);
        jScrollPane.getViewport().setBackground(new java.awt.Color(30, 30, 30));
    }

    public void llenarTablas() {
        try {
            this.registroFisico = controlRegistroFisco.consultarRegistroFisicoDTO(clienteActual.getId());
            List<EnfermedadesSeleccionadasDTO> enfermedadesSeleccionadasDTO = this.registroFisico.getEnfermedades();
            List<LesionesSeleccionadasDTO> lesionesSeleccionadasDTO = registroFisico.getLesiones();

            DefaultTableModel modeloEnfermedades = (DefaultTableModel) this.enfermedadesSeleccionadas.getModel();
            modeloEnfermedades.setRowCount(0);

            for (EnfermedadesSeleccionadasDTO e : enfermedadesSeleccionadasDTO) {
                modeloEnfermedades.addRow(new Object[]{
                    e.getNombre()
                });
            }

            DefaultTableModel modeloLesiones = (DefaultTableModel) limitacionesFisicasSeleccionadas.getModel();
            modeloLesiones.setRowCount(0);
            for (LesionesSeleccionadasDTO l : lesionesSeleccionadasDTO) {
                modeloLesiones.addRow(new Object[]{
                    l.getNombre()
                });
            }
            diseñoTablas();
            lblTitulo.setText(clienteActual.getNombre() + clienteActual.getApellidos());

            lblCondicionSeleccionada.setText(this.registroFisico.getNivelCondicion().toString());

        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolverAtras3;
    private javax.swing.JTable enfermedadesSeleccionadas;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCondicionSeleccionada;
    private javax.swing.JLabel lblEnfermedades;
    private javax.swing.JLabel lblLimitacionesFisicas;
    private javax.swing.JLabel lblNivelCondicion1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable limitacionesFisicasSeleccionadas;
    // End of variables declaration//GEN-END:variables
}
