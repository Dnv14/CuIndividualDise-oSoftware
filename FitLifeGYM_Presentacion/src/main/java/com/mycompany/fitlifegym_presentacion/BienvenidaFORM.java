/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOsENUMs.EstadoDTO;
import DTOS.NuevoClienteDTO;
import DTOS.UsuarioDTO;
import DTOsENUMs.TipoMembresiaDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class BienvenidaFORM extends javax.swing.JFrame {

    private ControlNavegacion controlNavegacion;
    private ControlRegistroInicioSesion controlForms;
    private NuevoClienteDTO cliente;

    public BienvenidaFORM(ControlNavegacion controlNavegacion, ControlRegistroInicioSesion controlForms, NuevoClienteDTO cliente) {
        this.controlNavegacion = controlNavegacion;
        this.controlForms = controlForms;
        this.cliente = controlForms.getClienteActual();

        this.setTitle("Bienvenida");
        initComponents();
        this.setLocationRelativeTo(null);
        configiracionPorMembresia();
        mostrarDatosCliente();
    }

    private void mostrarDatosCliente() {
        if (this.cliente != null) {

            String nombre = this.cliente.getNombre();

            if (this.cliente.getMembresíaComprada() != null) {
                String plan = this.cliente.getMembresíaComprada().getMembresia().getTipoMembresia().name();
                String estado = this.cliente.getMembresíaComprada().getEstado().name();

                lblTitulo.setText("Bienvenido: " + nombre + " | Plan: " + plan);
                LblEstadoMembresia.setText("ESTADO: " + estado);
            } else {
                lblTitulo.setText("Bienvenido: " + nombre + " | Sin membresía");
                LblEstadoMembresia.setText("ESTADO: INACTIVO");
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textAreaInstalaciones = new javax.swing.JTextArea();
        btnCursos = new javax.swing.JButton();
        btnNutricion = new javax.swing.JButton();
        btnAmbienteMusical = new javax.swing.JButton();
        btnProgreso = new javax.swing.JButton();
        btnBeneficios = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        btnQuejaSugerencia = new javax.swing.JButton();
        LblEstadoMembresia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Bienvenido: \"Nombre\"");

        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textAreaInstalaciones.setBackground(new java.awt.Color(18, 18, 18));
        textAreaInstalaciones.setColumns(20);
        textAreaInstalaciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textAreaInstalaciones.setForeground(new java.awt.Color(255, 255, 255));
        textAreaInstalaciones.setRows(5);
        textAreaInstalaciones.setText("¡Bienvenido a Fit Life GYM!\nAhora formas parte de un gimnasio diseñado para ayudarte a entrenar,\nProgresar y alcanzar tus objetivos");
        jScrollPane5.setViewportView(textAreaInstalaciones);

        btnCursos.setBackground(new java.awt.Color(44, 44, 44));
        btnCursos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCursos.setForeground(new java.awt.Color(255, 255, 255));
        btnCursos.setText("Cursos Especiales");
        btnCursos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNutricion.setBackground(new java.awt.Color(44, 44, 44));
        btnNutricion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNutricion.setForeground(new java.awt.Color(255, 255, 255));
        btnNutricion.setText("Centro de nutrición");
        btnNutricion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNutricion.addActionListener(this::btnNutricionActionPerformed);

        btnAmbienteMusical.setBackground(new java.awt.Color(44, 44, 44));
        btnAmbienteMusical.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAmbienteMusical.setForeground(new java.awt.Color(255, 255, 255));
        btnAmbienteMusical.setText("Ambiente Musical");
        btnAmbienteMusical.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAmbienteMusical.addActionListener(this::btnAmbienteMusicalActionPerformed);

        btnProgreso.setBackground(new java.awt.Color(44, 44, 44));
        btnProgreso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnProgreso.setForeground(new java.awt.Color(255, 255, 255));
        btnProgreso.setText("Progreso Fisico");
        btnProgreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnProgreso.addActionListener(this::btnProgresoActionPerformed);

        btnBeneficios.setBackground(new java.awt.Color(51, 51, 51));
        btnBeneficios.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnBeneficios.setForeground(new java.awt.Color(255, 255, 255));
        btnBeneficios.setText("Beneficios");
        btnBeneficios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBeneficios.addActionListener(this::btnBeneficiosActionPerformed);

        lblTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));

        btnQuejaSugerencia.setBackground(new java.awt.Color(44, 44, 44));
        btnQuejaSugerencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnQuejaSugerencia.setForeground(new java.awt.Color(255, 255, 255));
        btnQuejaSugerencia.setText("Quejas");
        btnQuejaSugerencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnQuejaSugerencia.addActionListener(this::btnQuejaSugerenciaActionPerformed);

        LblEstadoMembresia.setBackground(new java.awt.Color(255, 255, 255));
        LblEstadoMembresia.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        LblEstadoMembresia.setForeground(new java.awt.Color(255, 255, 255));
        LblEstadoMembresia.setText("ESTADO:");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTitulo1))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(btnBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblEstadoMembresia, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnNutricion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnAmbienteMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnQuejaSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNutricion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAmbienteMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuejaSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBeneficios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEstadoMembresia, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 974, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNutricionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNutricionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNutricionActionPerformed

    private void btnAmbienteMusicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmbienteMusicalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAmbienteMusicalActionPerformed

    private void btnProgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProgresoActionPerformed

    private void btnBeneficiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeneficiosActionPerformed

        NuevoClienteDTO cliente = controlForms.getClienteActual();

        if (cliente.getMembresíaComprada() == null || cliente.getMembresíaComprada().getEstado() == EstadoDTO.INACTIVO) {
            controlNavegacion.navegarBenificios(cliente);
        } else {
            String planActual = cliente.getMembresíaComprada().getMembresia().getTipoMembresia().name();
            JOptionPane.showMessageDialog(this,
                    "Actualmente tienes el Plan " + planActual + " activo\n" + "Tu membresía vence el: " + cliente.getMembresíaComprada().getFechaFin(), "Membresía Activa", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnBeneficiosActionPerformed

    private void btnQuejaSugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuejaSugerenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuejaSugerenciaActionPerformed

    private void configiracionPorMembresia() {
        if (cliente == null || cliente.getMembresíaComprada().getMembresia().getTipoMembresia() == null) {
            return;
        }

        TipoMembresiaDTO tipo = cliente.getMembresíaComprada().getMembresia().getTipoMembresia();

        btnCursos.setEnabled(false);
        btnNutricion.setEnabled(false);
        btnAmbienteMusical.setEnabled(false);
        btnProgreso.setEnabled(false);

        switch (tipo) {
            case ORO:
                btnCursos.setEnabled(true);
                btnProgreso.setEnabled(true);
                btnNutricion.setEnabled(true);
                btnAmbienteMusical.setEnabled(true);
                break;
            case PLATA:
                btnNutricion.setEnabled(true);
                btnAmbienteMusical.setEnabled(true);
                break;
            case BRONCE:
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblEstadoMembresia;
    private javax.swing.JButton btnAmbienteMusical;
    private javax.swing.JButton btnBeneficios;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnNutricion;
    private javax.swing.JButton btnProgreso;
    private javax.swing.JButton btnQuejaSugerencia;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextArea textAreaInstalaciones;
    // End of variables declaration//GEN-END:variables
}
