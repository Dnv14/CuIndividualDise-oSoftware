/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.BusquedaClientesDTOBo;
import DTOS.FiltrosBusquedaClientesDTOBo;
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
public class ReporteAdministradorFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ReporteAdministradorFORM.class.getName());

    private ControlNavegacion controlNavegacion;
    private ControlRegistroFisico controlRegistroFisico;

    public ReporteAdministradorFORM(ControlNavegacion controlNavegacion, ControlRegistroFisico controlRegistroFisico) {
        this.controlNavegacion = controlNavegacion;
        this.controlRegistroFisico = controlRegistroFisico;
        this.setTitle("Reporte de Clientes");
        initComponents();
        this.setLocationRelativeTo(null);
        this.diseñoTabla();
        this.ejecutarBusqueda();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        filtrosComboBox = new javax.swing.JComboBox<>();
        busquedaTextField = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        reporteClientesTable = new javax.swing.JTable();
        btnVolverAtras3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Reporte Clientes");

        filtrosComboBox.setBackground(new java.awt.Color(102, 102, 102));
        filtrosComboBox.setForeground(new java.awt.Color(255, 255, 255));
        filtrosComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "SIN_ASIGNAR", "ASIGNADA" }));
        filtrosComboBox.addActionListener(this::filtrosComboBoxActionPerformed);

        busquedaTextField.setBackground(new java.awt.Color(102, 102, 102));
        busquedaTextField.setForeground(new java.awt.Color(255, 255, 255));
        busquedaTextField.addActionListener(this::busquedaTextFieldActionPerformed);

        btnBuscar.setBackground(new java.awt.Color(255, 0, 51));
        btnBuscar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBuscar.addActionListener(this::btnBuscarActionPerformed);

        jScrollPane.setPreferredSize(new java.awt.Dimension(703, 573));

        reporteClientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Días Rutinas Asignadas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reporteClientesTable.setAutoscrolls(false);
        reporteClientesTable.getTableHeader().setResizingAllowed(false);
        reporteClientesTable.getTableHeader().setReorderingAllowed(false);
        reporteClientesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteClientesTableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(reporteClientesTable);

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
                .addGap(12, 12, 12)
                .addComponent(filtrosComboBox, 0, 182, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(busquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addComponent(btnVolverAtras3)
                .addGap(138, 138, 138)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(busquedaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtrosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void filtrosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrosComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filtrosComboBoxActionPerformed

    private void busquedaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busquedaTextFieldActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ejecutarBusqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void reporteClientesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteClientesTableMouseClicked

    }//GEN-LAST:event_reporteClientesTableMouseClicked

    private void btnVolverAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras3ActionPerformed
        controlNavegacion.navegarMenuAdministrador();
    }//GEN-LAST:event_btnVolverAtras3ActionPerformed

    public void mostrarResultados(List<BusquedaClientesDTOBo> listaResultados) {
        DefaultTableModel modelo = (DefaultTableModel) reporteClientesTable.getModel();
        modelo.setRowCount(0);

        for (BusquedaClientesDTOBo c : listaResultados) {
            modelo.addRow(new Object[]{
                c.getIdCliente(),
                c.getNombreCompleto(),
                c.getDiasRutina()
            });
        }
    }

    private void ejecutarBusqueda() {
        try {
            String textoBusqueda = busquedaTextField.getText().trim();
            String filtroSeleccionado = filtrosComboBox.getSelectedItem().toString();

            FiltrosBusquedaClientesDTOBo filtros = new FiltrosBusquedaClientesDTOBo();
            filtros.setNombreCliente(textoBusqueda);
            filtros.setEstadoRutina(filtroSeleccionado);

            List<BusquedaClientesDTOBo> listaResultados = controlRegistroFisico.buscarClientesPorFiltro(filtros);

            this.mostrarResultados(listaResultados);

        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void diseñoTabla() {
        reporteClientesTable.setRowHeight(30);
        reporteClientesTable.setBackground(new java.awt.Color(30, 30, 30));
        reporteClientesTable.setForeground(java.awt.Color.WHITE);
        reporteClientesTable.setGridColor(new java.awt.Color(225, 6, 0));
        reporteClientesTable.getTableHeader().setBackground(new java.awt.Color(30, 30, 30));
        reporteClientesTable.getTableHeader().setForeground(java.awt.Color.WHITE);
        reporteClientesTable.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        DefaultTableCellRenderer renderCentrado = new DefaultTableCellRenderer();
        renderCentrado.setHorizontalAlignment(JLabel.CENTER);
        jScrollPane.getViewport().setBackground(new java.awt.Color(30, 30, 30));

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolverAtras3;
    private javax.swing.JTextField busquedaTextField;
    private javax.swing.JComboBox<String> filtrosComboBox;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable reporteClientesTable;
    // End of variables declaration//GEN-END:variables
}
