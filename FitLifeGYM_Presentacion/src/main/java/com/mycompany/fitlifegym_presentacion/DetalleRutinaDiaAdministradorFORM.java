/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.DetallesRutinaDTO;
import DTOS.EjerciciosDTO;
import DTOS.EjerciciosSeleccionadosDTO;
import DTOS.NuevoClienteDTO;
import DTOS.RutinaDTO;
import DTOsENUMs.EstadoRutinaDTO;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Diego
 */
public class DetalleRutinaDiaAdministradorFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(DetalleRutinaDiaAdministradorFORM.class.getName());

    private ControlNavegacion controlNavegacion;
    private ControlRegistroFisico controlRegistroFisico;
    private String diaSemana;
    private JComboBox<EjerciciosDTO> comboboxEjercicios;
    private NuevoClienteDTO clienteSeleccionado;
    private String notasRutina = "";

    public DetalleRutinaDiaAdministradorFORM(ControlNavegacion controlNavegacion, ControlRegistroFisico controlRegistroFisico, String diaSemana) {
        this.controlNavegacion = controlNavegacion;
        this.controlRegistroFisico = controlRegistroFisico;
        this.diaSemana = diaSemana;
        this.clienteSeleccionado = controlRegistroFisico.getClienteSeleccionado();
        this.setTitle("Detalles de Rutina");
        cargarEjerciciosComboBox();
        initComponents();
        configurarEditorTabla();
        agregarDiaSemana();
        this.setLocationRelativeTo(null);
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
        btnVerRegistroFisico = new javax.swing.JButton();
        btnNotas = new javax.swing.JButton();
        btnVolverAtras3 = new javax.swing.JButton();

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
                .addGap(106, 106, 106)
                .addComponent(btnVerRegistroFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnGuardarRutinaDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addComponent(btnVolverAtras3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerRegistroFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        try {
            if (validarTablaRutina() == false) {
                return;
            }

            List<DetallesRutinaDTO> listaDetalles = new LinkedList<>();
            DefaultTableModel modeloTabla = (DefaultTableModel) tablaDetallesRutina.getModel();
            for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                Object objetoEjericico = modeloTabla.getValueAt(i, 0);

                if (objetoEjericico instanceof EjerciciosDTO) {
                    List<EjerciciosSeleccionadosDTO> ejerciciosSeleccionados = new LinkedList<>();
                    EjerciciosDTO ejercicio = (EjerciciosDTO) objetoEjericico;
                    if (ejercicio.getNombre().contains("Selecciona un Ejercicio")) {
                        continue;
                    }

                    Integer pesoRecomendado = Integer.valueOf(modeloTabla.getValueAt(i, 1).toString().trim());
                    Integer repeticionesRecomendadas = Integer.valueOf(modeloTabla.getValueAt(i, 2).toString().trim());
                    Integer seriesRecomendadas = Integer.valueOf(modeloTabla.getValueAt(i, 3).toString().trim());

                    EjerciciosSeleccionadosDTO ejercicioSeleccionado = new EjerciciosSeleccionadosDTO();
                    ejercicioSeleccionado.setId(ejercicio.getId());
                    ejercicioSeleccionado.setNombre(ejercicio.getNombre());

                    ejerciciosSeleccionados.add(ejercicioSeleccionado);

                    DetallesRutinaDTO detalleFila = new DetallesRutinaDTO();
                    detalleFila.setPesoRecomendado(pesoRecomendado);
                    detalleFila.setRepeticionesRecomendadas(repeticionesRecomendadas);
                    detalleFila.setSeriesRecomendadas(seriesRecomendadas);
                    detalleFila.setEjerciciosSeleccionados(ejerciciosSeleccionados);

                    listaDetalles.add(detalleFila);
                }
            }
            Date fechaActual = new Date();
            RutinaDTO rutinaDTO = new RutinaDTO();
            rutinaDTO.setIdCliente(clienteSeleccionado.getId());
            rutinaDTO.setDiaSemana(diaSemana);
            rutinaDTO.setFechaAsignada(fechaActual);
            rutinaDTO.setEstadoRutina(EstadoRutinaDTO.ASIGNADA);
            rutinaDTO.setNotas(notasRutina);
            rutinaDTO.setDetallesRutina(listaDetalles);

            RutinaDTO rutinaExistente = controlRegistroFisico.consultarDetallesRutina(clienteSeleccionado.getId(), diaSemana);
            if (rutinaExistente != null) {
                rutinaDTO.setId(rutinaExistente.getId());
                controlRegistroFisico.editarRutina(rutinaDTO);
                JOptionPane.showMessageDialog(this, "Rutina editada y guardada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                controlNavegacion.navegarRutinaSemanalAdmin();
                this.dispose();
            } else {
                controlRegistroFisico.guardarRutinaACliente(rutinaDTO);
                JOptionPane.showMessageDialog(this, "Rutina asignada y guardada", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                controlNavegacion.navegarRutinaSemanalAdmin();
                this.dispose();
            }

        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarRutinaDetallesActionPerformed

    private void btnVerRegistroFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegistroFisicoActionPerformed
        controlNavegacion.navegarConsultarRegistroFisico();
    }//GEN-LAST:event_btnVerRegistroFisicoActionPerformed

    private void btnNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotasActionPerformed
        controlNavegacion.navegarAgregarNotasAdmin();
    }//GEN-LAST:event_btnNotasActionPerformed

    private void btnVolverAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras3ActionPerformed
        controlNavegacion.navegarRutinaSemanalAdmin();
    }//GEN-LAST:event_btnVolverAtras3ActionPerformed

    public void agregarDiaSemana() {
        lblTitulo.setText("Día: " + diaSemana);
    }

    private void diseñoTabla() {
        tablaDetallesRutina.setFocusable(false);
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

    public void cargarEjerciciosComboBox() {
        try {
            List<EjerciciosDTO> listaEjercicios = controlRegistroFisico.traerEjercicios();
            DefaultComboBoxModel<EjerciciosDTO> modeloCombo = new DefaultComboBoxModel<>();

            EjerciciosDTO opcionDefault = new EjerciciosDTO();
            opcionDefault.setNombre("Selecciona un Ejercicio");
            modeloCombo.addElement(opcionDefault);
            for (EjerciciosDTO edto : listaEjercicios) {
                modeloCombo.addElement(edto);
            }
            comboboxEjercicios = new JComboBox<>(modeloCombo);
        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void configurarEditorTabla() {
        TableColumn columnaEjercicio = tablaDetallesRutina.getColumnModel().getColumn(0);
        columnaEjercicio.setCellEditor(new DefaultCellEditor(comboboxEjercicios));
        DefaultTableModel modeloTabla = (DefaultTableModel) tablaDetallesRutina.getModel();
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        modeloTabla.addRow(new Object[]{"Selecciona un Ejercicio", "", "", ""});
        diseñoTabla();
    }

    private boolean validarTablaRutina() {
        DefaultTableModel modelo = (DefaultTableModel) tablaDetallesRutina.getModel();
        String regex = "^[0-9]+$";

        for (int i = 0; i < modelo.getRowCount(); i++) {
            Object ejercicio = modelo.getValueAt(i, 0);
            Object pesoRecomendado = modelo.getValueAt(i, 1);
            Object repeticionesRecomendadas = modelo.getValueAt(i, 2);
            Object seriesRecomendadas = modelo.getValueAt(i, 3);
            String ejercicioString = "";
            String pesoString = "";
            String repesString = "";
            String seriesString = "";
            if (ejercicio != null) {
                ejercicioString = ejercicio.toString().trim();
            }
            if (pesoRecomendado != null) {
                pesoString = pesoRecomendado.toString().trim();
            }
            if (repeticionesRecomendadas != null) {
                repesString = repeticionesRecomendadas.toString().trim();
            }
            if (seriesRecomendadas != null) {
                seriesString = seriesRecomendadas.toString().trim();
            }

            boolean tieneEjercicio = !ejercicioString.isEmpty() && !ejercicioString.contains("Selecciona un Ejercicio");

            if (tieneEjercicio == true) {

                if (pesoString.isEmpty() || repesString.isEmpty() || seriesString.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Si seleccionó un ejercicio favor de llenar la fila completa", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

                if (!pesoString.matches(regex) || !repesString.matches(regex) || !seriesString.matches(regex)) {
                    JOptionPane.showMessageDialog(this, "Solo números enteros en Peso, Repeticiones y Series", "Error de formato", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

            } else {
                if (!pesoString.isEmpty() || !repesString.isEmpty() || !seriesString.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Favor de seleccionar un ejercicio para completar la fila", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }
        return true;
    }

    public void setNotasGlobales(String notas) {
        this.notasRutina = notas;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarRutinaDetalles;
    private javax.swing.JButton btnNotas;
    private javax.swing.JButton btnVerRegistroFisico;
    private javax.swing.JButton btnVolverAtras3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaDetallesRutina;
    // End of variables declaration//GEN-END:variables
}
