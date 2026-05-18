/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.NuevoClienteDTO;
import DTOsPersistencia.filtrosBusquedaClientesDTO;
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
public class BuscadorClienteFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BuscadorClienteFORM.class.getName());

    private ControlNavegacion controlNavegacion;
    private ControlRegistroFisico controlRegistroFisico;

    public BuscadorClienteFORM(ControlNavegacion controlNavegacion, ControlRegistroFisico controlRegistroFisico) {
        this.controlNavegacion = controlNavegacion;
        this.controlRegistroFisico = controlRegistroFisico;
        this.setTitle("Buscador de Clientes");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        buscadorClientesTable = new javax.swing.JTable();
        btnVolverAtras3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Buscador Clientes");

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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(703, 573));

        buscadorClientesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        buscadorClientesTable.setAutoscrolls(false);
        buscadorClientesTable.getTableHeader().setResizingAllowed(false);
        buscadorClientesTable.getTableHeader().setReorderingAllowed(false);
        buscadorClientesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscadorClientesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(buscadorClientesTable);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
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
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void buscadorClientesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscadorClientesTableMouseClicked
        int fila = buscadorClientesTable.getSelectedRow();
        String idCliente = (String) buscadorClientesTable.getValueAt(fila, 0);
        try {
            controlRegistroFisico.asignarClienteSeleccionado(idCliente);
            controlNavegacion.navegarAdministrarCliente();
        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscadorClientesTableMouseClicked

    private void btnVolverAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras3ActionPerformed
        controlNavegacion.navegarMenuAdministrador();
    }//GEN-LAST:event_btnVolverAtras3ActionPerformed

    public void mostrarResultados(List<NuevoClienteDTO> clientes) {

        DefaultTableModel modelo = (DefaultTableModel) buscadorClientesTable.getModel();
        modelo.setRowCount(0);
        for (NuevoClienteDTO c : clientes) {

            
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNombre(),
                c.getDiasRutina()
            });
        }
    }

    private void ejecutarBusqueda() {
        try {
            String textoBusqueda = busquedaTextField.getText().trim();
            String filtroSeleccionado = filtrosComboBox.getSelectedItem().toString();

            filtrosBusquedaClientesDTO filtros = new filtrosBusquedaClientesDTO();
            filtros.setNombreCliente(textoBusqueda);
            filtros.setEstadoRutina(filtroSeleccionado);

            List<NuevoClienteDTO> listaResultados = controlRegistroFisico.buscarClientesPorFiltro(filtros);

            this.mostrarResultados(listaResultados);

        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void diseñoTabla() {
        buscadorClientesTable.setRowHeight(30);
        buscadorClientesTable.setBackground(new java.awt.Color(30, 30, 30));
        buscadorClientesTable.setForeground(java.awt.Color.WHITE);
        buscadorClientesTable.setGridColor(new java.awt.Color(225, 6, 0));
        buscadorClientesTable.getTableHeader().setBackground(new java.awt.Color(30, 30, 30));
        buscadorClientesTable.getTableHeader().setForeground(java.awt.Color.WHITE);
        buscadorClientesTable.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        DefaultTableCellRenderer renderCentrado = new DefaultTableCellRenderer();
        renderCentrado.setHorizontalAlignment(JLabel.CENTER);
        buscadorClientesTable.getColumnModel().getColumn(0).setCellRenderer(renderCentrado);
        buscadorClientesTable.getColumnModel().getColumn(1).setCellRenderer(renderCentrado);
        buscadorClientesTable.getColumnModel().getColumn(2).setCellRenderer(renderCentrado);
        jScrollPane1.getViewport().setBackground(new java.awt.Color(30, 30, 30));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolverAtras3;
    private javax.swing.JTable buscadorClientesTable;
    private javax.swing.JTextField busquedaTextField;
    private javax.swing.JComboBox<String> filtrosComboBox;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
