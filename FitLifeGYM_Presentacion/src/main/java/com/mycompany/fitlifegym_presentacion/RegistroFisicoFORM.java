/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.EnfermedadesDTO;
import DTOS.EnfermedadesSeleccionadasDTO;
import DTOS.LesionesDTO;
import DTOS.LesionesSeleccionadasDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import DTOsENUMs.NivelCondicionDTO;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class RegistroFisicoFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RegistroFisicoFORM.class.getName());

    private ControlNavegacion controlNavegacion;
    private ControlRegistroFisico controlRegistroFisico;
    private ControlRegistroInicioSesion controlRegistroInicioSesion;
    private NuevoClienteDTO clienteActual;
    private List<String> enfermedadesConfirmadas = new LinkedList<>();
    private List<String> lesionesConfirmadas = new LinkedList<>();

    public RegistroFisicoFORM(ControlNavegacion controlNavegacion, ControlRegistroFisico controlRegistroFisico, ControlRegistroInicioSesion controlRegistroInicioSesion) {
        this.controlNavegacion = controlNavegacion;
        this.controlRegistroFisico = controlRegistroFisico;
        this.controlRegistroInicioSesion = controlRegistroInicioSesion;
        this.clienteActual = controlRegistroInicioSesion.getClienteActual();
        this.setResizable(false);
        this.setTitle("Registro Fisico");
        initComponents();
        llenarTablas();
        tipoComboBox.setFocusable(false);
        this.setLocationRelativeTo(null);
        leyendaNivelCondicion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        lblLimitacionesFisicas = new javax.swing.JLabel();
        lblNivelCondicion = new javax.swing.JLabel();
        lblEnfermedades = new javax.swing.JLabel();
        tipoComboBox = new javax.swing.JComboBox<>();
        jScrollPane = new javax.swing.JScrollPane();
        enfermedadesTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        limitacionesFisicasTable = new javax.swing.JTable();
        lblLeyendaCondicion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Registro Físico");

        lblLimitacionesFisicas.setBackground(new java.awt.Color(255, 255, 255));
        lblLimitacionesFisicas.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblLimitacionesFisicas.setForeground(new java.awt.Color(255, 255, 255));
        lblLimitacionesFisicas.setText("Limitaciones Físicas:");

        lblNivelCondicion.setBackground(new java.awt.Color(255, 255, 255));
        lblNivelCondicion.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblNivelCondicion.setForeground(new java.awt.Color(255, 255, 255));
        lblNivelCondicion.setText("Nivel de Condición:");

        lblEnfermedades.setBackground(new java.awt.Color(255, 255, 255));
        lblEnfermedades.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblEnfermedades.setForeground(new java.awt.Color(255, 255, 255));
        lblEnfermedades.setText("Enfermedades:");

        tipoComboBox.setBackground(new java.awt.Color(102, 102, 102));
        tipoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tipoComboBox.setForeground(new java.awt.Color(255, 255, 255));
        tipoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BAJA", "INTERMEDIA", "AVANZADA" }));
        tipoComboBox.addActionListener(this::tipoComboBoxActionPerformed);

        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane.setPreferredSize(new java.awt.Dimension(703, 573));

        enfermedadesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        enfermedadesTable.setAutoscrolls(false);
        enfermedadesTable.getTableHeader().setResizingAllowed(false);
        enfermedadesTable.getTableHeader().setReorderingAllowed(false);
        enfermedadesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enfermedadesTableMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(enfermedadesTable);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(703, 573));

        limitacionesFisicasTable.setModel(new javax.swing.table.DefaultTableModel(
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
        limitacionesFisicasTable.setAutoscrolls(false);
        limitacionesFisicasTable.getTableHeader().setResizingAllowed(false);
        limitacionesFisicasTable.getTableHeader().setReorderingAllowed(false);
        limitacionesFisicasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limitacionesFisicasTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(limitacionesFisicasTable);

        lblLeyendaCondicion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLeyendaCondicion.setForeground(new java.awt.Color(255, 255, 255));
        lblLeyendaCondicion.setText("LEYENDAAAAAAAAAA");

        btnGuardar.setBackground(new java.awt.Color(255, 0, 51));
        btnGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGap(0, 54, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(lblEnfermedades, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(lblLimitacionesFisicas, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(41, 41, 41))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(lblLeyendaCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 536, Short.MAX_VALUE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(lblNivelCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblLimitacionesFisicas)))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEnfermedades)
                        .addGap(176, 176, 176)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNivelCondicion)
                            .addComponent(tipoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblLeyendaCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 246, Short.MAX_VALUE))))
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
            .addGap(0, 863, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tipoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoComboBoxActionPerformed
        this.leyendaNivelCondicion();
    }//GEN-LAST:event_tipoComboBoxActionPerformed

    private void enfermedadesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enfermedadesTableMouseClicked
        int fila = enfermedadesTable.getSelectedRow();
        if (fila == -1) {
            return;
        }
        String nombreEnfermedad = (String) enfermedadesTable.getValueAt(fila, 0);

        if (!enfermedadesConfirmadas.contains(nombreEnfermedad)) {
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Deseas seleccionar la enfermedad: " + nombreEnfermedad + "?", "Confirmar Selección", JOptionPane.YES_NO_OPTION);

            if (respuesta == JOptionPane.YES_OPTION) {
                enfermedadesConfirmadas.add(nombreEnfermedad);
                JOptionPane.showMessageDialog(this, nombreEnfermedad + " agregada");
            }
        } else {
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Deseas QUITAR: " + nombreEnfermedad + " de la lista?", "Quitar Selección", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                enfermedadesConfirmadas.remove(nombreEnfermedad);
                JOptionPane.showMessageDialog(this, nombreEnfermedad + " eliminada");
            }
        }
    }//GEN-LAST:event_enfermedadesTableMouseClicked

    private void limitacionesFisicasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limitacionesFisicasTableMouseClicked
        int fila = limitacionesFisicasTable.getSelectedRow();
        if (fila == -1) {
            return;
        }
        String nombreLesion = (String) limitacionesFisicasTable.getValueAt(fila, 0);

        if (!lesionesConfirmadas.contains(nombreLesion)) {
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Deseas seleccionar la limitación: " + nombreLesion + "?", "Confirmar Selección", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                lesionesConfirmadas.add(nombreLesion);
                JOptionPane.showMessageDialog(this, nombreLesion + " agregada");
            }
        } else {
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Deseas QUITAR: " + nombreLesion + " de la lista?", "Quitar Selección", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                lesionesConfirmadas.remove(nombreLesion);
                JOptionPane.showMessageDialog(this, nombreLesion + " eliminada");
            }
        }

    }//GEN-LAST:event_limitacionesFisicasTableMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        List<EnfermedadesSeleccionadasDTO> enfermedadesSeleccionadas = new LinkedList<>();
        List<LesionesSeleccionadasDTO> lesionesSeleccionadas = new LinkedList<>();

        for (String nombre : enfermedadesConfirmadas) {
            EnfermedadesSeleccionadasDTO enfermedadesSeleccionadasSinConfirmar = new EnfermedadesSeleccionadasDTO();
            enfermedadesSeleccionadasSinConfirmar.setNombre(nombre);
            enfermedadesSeleccionadas.add(enfermedadesSeleccionadasSinConfirmar);
        }
        for (String nombre : lesionesConfirmadas) {
            LesionesSeleccionadasDTO lesionesSeleccionadasSinConfirmar = new LesionesSeleccionadasDTO();
            lesionesSeleccionadasSinConfirmar.setNombre(nombre);
            lesionesSeleccionadas.add(lesionesSeleccionadasSinConfirmar);
        }
        String nivelCondicion = (String) tipoComboBox.getSelectedItem();

        RegistroFisicoDTO registroFisicoSinConfirmar = new RegistroFisicoDTO();
        registroFisicoSinConfirmar.setIdCliente(clienteActual.getId());
        registroFisicoSinConfirmar.setEnfermedades(enfermedadesSeleccionadas);
        registroFisicoSinConfirmar.setLesiones(lesionesSeleccionadas);
        registroFisicoSinConfirmar.setNivelCondicion(NivelCondicionDTO.valueOf(nivelCondicion));

        controlNavegacion.navegarRegistroFisicoConfirmar(registroFisicoSinConfirmar);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void diseñoTablas() {
        if (enfermedadesTable == null) {
            System.out.println("  enfermedadesTable es NULL en este milisegundo!");
            return;
        }
        enfermedadesTable.setRowHeight(45);
        enfermedadesTable.setBackground(new java.awt.Color(30, 30, 30));
        enfermedadesTable.setForeground(java.awt.Color.WHITE);
        enfermedadesTable.setGridColor(new java.awt.Color(225, 6, 0));

        enfermedadesTable.getTableHeader().setBackground(new java.awt.Color(30, 30, 30));
        enfermedadesTable.getTableHeader().setForeground(java.awt.Color.WHITE);
        enfermedadesTable.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));

        DefaultTableCellRenderer renderEnfermedades = new DefaultTableCellRenderer();
        renderEnfermedades.setHorizontalAlignment(JLabel.CENTER);
        enfermedadesTable.getColumnModel().getColumn(0).setCellRenderer(renderEnfermedades);
        jScrollPane.getViewport().setBackground(new java.awt.Color(30, 30, 30));

        limitacionesFisicasTable.setRowHeight(48);
        limitacionesFisicasTable.setBackground(new java.awt.Color(30, 30, 30));
        limitacionesFisicasTable.setForeground(java.awt.Color.WHITE);
        limitacionesFisicasTable.setGridColor(new java.awt.Color(225, 6, 0));

        limitacionesFisicasTable.getTableHeader().setBackground(new java.awt.Color(30, 30, 30));
        limitacionesFisicasTable.getTableHeader().setForeground(java.awt.Color.WHITE);
        limitacionesFisicasTable.getTableHeader().setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));

        DefaultTableCellRenderer renderLimitaciones = new DefaultTableCellRenderer();
        renderLimitaciones.setHorizontalAlignment(JLabel.CENTER);

    }

    public void llenarTablas() {

        try {
            List<EnfermedadesDTO> enfermedadesDTO = controlRegistroFisico.traerEnfermedades();
            List<LesionesDTO> lesionesDTO = controlRegistroFisico.traerLesiones();

            DefaultTableModel modeloEnfermedades = (DefaultTableModel) enfermedadesTable.getModel();
            modeloEnfermedades.setRowCount(0);
            for (EnfermedadesDTO e : enfermedadesDTO) {
                modeloEnfermedades.addRow(new Object[]{
                    e.getNombre()
                });
            }

            DefaultTableModel modeloLesiones = (DefaultTableModel) limitacionesFisicasTable.getModel();
            modeloLesiones.setRowCount(0);
            for (LesionesDTO l : lesionesDTO) {
                modeloLesiones.addRow(new Object[]{
                    l.getNombre()
                });
            }

            diseñoTablas();
        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void leyendaNivelCondicion() {
        String nivelSeleccionado = (String) tipoComboBox.getSelectedItem();

        if (nivelSeleccionado.equals("BAJA")) {
            lblLeyendaCondicion.setText("Nunca he hecho ejercicio");
        } else if (nivelSeleccionado.equals("INTERMEDIA")) {
            lblLeyendaCondicion.setText("Hago ejercicio regularmente 1-3 días a la semana");
        } else {
            lblLeyendaCondicion.setText("Hago ejercicio constantemente 3-5 días a la semana");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTable enfermedadesTable;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEnfermedades;
    private javax.swing.JLabel lblLeyendaCondicion;
    private javax.swing.JLabel lblLimitacionesFisicas;
    private javax.swing.JLabel lblNivelCondicion;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable limitacionesFisicasTable;
    private javax.swing.JComboBox<String> tipoComboBox;
    // End of variables declaration//GEN-END:variables
}
