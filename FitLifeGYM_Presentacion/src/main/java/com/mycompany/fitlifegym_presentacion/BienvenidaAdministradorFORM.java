/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.AdministradorDTO;

/**
 *
 * @author Diego
 */
public class BienvenidaAdministradorFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(BienvenidaAdministradorFORM.class.getName());

    private ControlNavegacion controlNavegacion;
    private AdministradorDTO administrador;
    private ControlRegistroInicioSesion controlRegistroInicioSesion;

    public BienvenidaAdministradorFORM(ControlNavegacion controlNavegacion, ControlRegistroInicioSesion controlRegistroInicioSesion) {
        this.controlNavegacion = controlNavegacion;
        this.administrador = controlRegistroInicioSesion.getAdministradorActual();
        initComponents();
        this.setTitle("Bienvenido Administrador!");
        mostrarDatosCliente();
        this.setLocationRelativeTo(null);
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
        lblTitulo1 = new javax.swing.JLabel();
        btnQuejaSugerencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Bienvenido Administrador: \"Nombre\"");

        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textAreaInstalaciones.setEditable(false);
        textAreaInstalaciones.setBackground(new java.awt.Color(18, 18, 18));
        textAreaInstalaciones.setColumns(20);
        textAreaInstalaciones.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textAreaInstalaciones.setForeground(new java.awt.Color(255, 255, 255));
        textAreaInstalaciones.setRows(5);
        textAreaInstalaciones.setText("¡Bienvenido a Fit Life GYM!\nAdministrar un área del gimnasio!!.");
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

        lblTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));

        btnQuejaSugerencia.setBackground(new java.awt.Color(44, 44, 44));
        btnQuejaSugerencia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnQuejaSugerencia.setForeground(new java.awt.Color(255, 255, 255));
        btnQuejaSugerencia.setText("Quejas");
        btnQuejaSugerencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnQuejaSugerencia.addActionListener(this::btnQuejaSugerenciaActionPerformed);

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
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnNutricion, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnAmbienteMusical, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
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
                .addContainerGap(155, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
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
        controlNavegacion.navegarMenuAdministrador();
    }//GEN-LAST:event_btnProgresoActionPerformed

    private void btnQuejaSugerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuejaSugerenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuejaSugerenciaActionPerformed

    private void mostrarDatosCliente() {
        if (this.administrador != null) {
            String nombre = this.administrador.getNombre();
            lblTitulo.setText("Bienvenido: " + nombre);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmbienteMusical;
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
