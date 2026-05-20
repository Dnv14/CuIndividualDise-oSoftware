/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import DTOS.NuevoClienteDTO;
import DTOS.RegistroFisicoDTO;
import com.mycompany.funcionalidadregistrofisico.RegistroFisicoException;
import java.awt.HeadlessException;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class AdministrarCliente extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AdministrarCliente.class.getName());

    private ControlNavegacion controlNavegacion;
    private NuevoClienteDTO clienteSeleccionado;
    private ControlRegistroFisico controlRegistroFisico;

    public AdministrarCliente(ControlNavegacion controlNavegacion, ControlRegistroFisico controlRegistroFisico) {
        this.controlRegistroFisico = controlRegistroFisico;
        this.controlNavegacion = controlNavegacion;
        this.clienteSeleccionado = this.controlRegistroFisico.getClienteSeleccionado();
        this.setTitle("Administrar a Cliente");
        initComponents();
        this.setLocationRelativeTo(null);
        clienteNombreLabel();
        cargarImagenesMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombreCliente = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblAdministrarRutina = new javax.swing.JLabel();
        btnSeleccionarAdministrarRutina = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        lblRegistroFisico = new javax.swing.JLabel();
        btnRegistroFisico = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        lblReportes = new javax.swing.JLabel();
        btnReportes = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        btnVolverAtras3 = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        lblImagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1080, 10));

        lblNombreCliente.setBackground(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setFont(new java.awt.Font("Arial", 3, 48)); // NOI18N
        lblNombreCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCliente.setText("Nombre Cliente......");
        jPanel.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 830, -1));

        jSeparator5.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator5.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 180, 10, 270));

        lblAdministrarRutina.setBackground(new java.awt.Color(255, 255, 255));
        lblAdministrarRutina.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblAdministrarRutina.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministrarRutina.setText("Administrar Rutina");
        jPanel.add(lblAdministrarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 180, 40));

        btnSeleccionarAdministrarRutina.setBackground(new java.awt.Color(255, 0, 51));
        btnSeleccionarAdministrarRutina.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSeleccionarAdministrarRutina.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarAdministrarRutina.setText("Seleccionar");
        btnSeleccionarAdministrarRutina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSeleccionarAdministrarRutina.addActionListener(this::btnSeleccionarAdministrarRutinaActionPerformed);
        jPanel.add(btnSeleccionarAdministrarRutina, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 187, 40));

        jSeparator6.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator6.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 240, -1));

        jSeparator7.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator7.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 240, -1));

        jSeparator8.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator8.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 10, 270));

        jSeparator9.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator9.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 10, 270));

        lblRegistroFisico.setBackground(new java.awt.Color(255, 255, 255));
        lblRegistroFisico.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblRegistroFisico.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistroFisico.setText("Ver Registro Fisico");
        jPanel.add(lblRegistroFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 200, 40));

        btnRegistroFisico.setBackground(new java.awt.Color(255, 0, 51));
        btnRegistroFisico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistroFisico.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistroFisico.setText("Seleccionar");
        btnRegistroFisico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRegistroFisico.addActionListener(this::btnRegistroFisicoActionPerformed);
        jPanel.add(btnRegistroFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 187, 40));

        jSeparator10.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator10.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 240, -1));

        jSeparator11.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator11.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 240, -1));

        jSeparator12.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator12.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 10, 270));

        jSeparator13.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator13.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 10, 270));

        lblReportes.setBackground(new java.awt.Color(255, 255, 255));
        lblReportes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblReportes.setForeground(new java.awt.Color(255, 255, 255));
        lblReportes.setText("Reportes");
        jPanel.add(lblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 100, 40));

        btnReportes.setBackground(new java.awt.Color(255, 0, 51));
        btnReportes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Seleccionar");
        btnReportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReportes.addActionListener(this::btnReportesActionPerformed);
        jPanel.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 187, 40));

        jSeparator14.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator14.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 240, -1));

        jSeparator15.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator15.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 240, -1));

        jSeparator16.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator16.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 10, 270));

        btnVolverAtras3.setBackground(new java.awt.Color(255, 0, 51));
        btnVolverAtras3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolverAtras3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverAtras3.setText("<");
        btnVolverAtras3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolverAtras3.addActionListener(this::btnVolverAtras3ActionPerformed);
        jPanel.add(btnVolverAtras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblTitulo1.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setFont(new java.awt.Font("Arial", 3, 70)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo1.setText("Administrar Cliente");
        jPanel.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 730, 80));
        jPanel.add(lblImagen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 220, 180));
        jPanel.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 230, 180));
        jPanel.add(lblImagen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 220, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarAdministrarRutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarAdministrarRutinaActionPerformed
        controlNavegacion.navegarRutinaSemanalAdmin();
    }//GEN-LAST:event_btnSeleccionarAdministrarRutinaActionPerformed

    private void btnRegistroFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroFisicoActionPerformed
        try {
            RegistroFisicoDTO registroFisico = controlRegistroFisico.consultarRegistroFisicoDTO(clienteSeleccionado.getId());
            if (registroFisico == null) {
                JOptionPane.showMessageDialog(this, "Este cliente no tiene registro fisico", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            } else {
                controlNavegacion.navegarConsultarRegistroFisico();
            }
        } catch (RegistroFisicoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnRegistroFisicoActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnVolverAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras3ActionPerformed
        controlRegistroFisico.limpiarClienteSeleccionado();
        controlNavegacion.navegarBuscadorCliente();
    }//GEN-LAST:event_btnVolverAtras3ActionPerformed

    public void clienteNombreLabel() {
        lblNombreCliente.setText(clienteSeleccionado.getNombre() + " " + clienteSeleccionado.getApellidos());
    }

    private void cargarImagenesMenu() {
        try {
            URL pathImagen = getClass().getResource("/ImagenMenuRutinas.png");

            if (pathImagen != null) {
                ImageIcon imagen = new ImageIcon(pathImagen);
                Image escalaImagen = imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
                Image escalaImagen1 = imagen.getImage().getScaledInstance(lblImagen1.getWidth(), lblImagen1.getHeight(), Image.SCALE_SMOOTH);
                Image escalaImagen2 = imagen.getImage().getScaledInstance(lblImagen2.getWidth(), lblImagen2.getHeight(), Image.SCALE_SMOOTH);

                ImageIcon imagenFinal = new ImageIcon(escalaImagen);
                ImageIcon imagenFinal1 = new ImageIcon(escalaImagen1);
                ImageIcon imagenFinal2 = new ImageIcon(escalaImagen2);

                lblImagen.setIcon(imagenFinal);
                lblImagen1.setIcon(imagenFinal1);
                lblImagen2.setIcon(imagenFinal2);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la imagen", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistroFisico;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSeleccionarAdministrarRutina;
    private javax.swing.JButton btnVolverAtras3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblAdministrarRutina;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblRegistroFisico;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblTitulo1;
    // End of variables declaration//GEN-END:variables
}
