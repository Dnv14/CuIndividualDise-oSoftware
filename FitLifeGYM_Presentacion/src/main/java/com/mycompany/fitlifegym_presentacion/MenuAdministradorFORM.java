/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fitlifegym_presentacion;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class MenuAdministradorFORM extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuAdministradorFORM.class.getName());

    private ControlNavegacion controlNavegacion;

    public MenuAdministradorFORM(ControlNavegacion controlNavegacion) {
        this.controlNavegacion = controlNavegacion;
        this.setTitle("Menú de Administrador");
        initComponents();
        this.setLocationRelativeTo(null);
        cargarImagenesMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lblAdministrarClientes = new javax.swing.JLabel();
        btnSeleccionarAdministrarClientes = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblImagen = new javax.swing.JLabel();
        btnVolverAtras3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(18, 18, 18));
        jPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator1.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 93, 960, 10));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Arial", 3, 70)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Menú de Administrador");
        jPanel.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 810, 94));

        jSeparator5.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator5.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 10, 270));

        lblAdministrarClientes.setBackground(new java.awt.Color(255, 255, 255));
        lblAdministrarClientes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lblAdministrarClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministrarClientes.setText("Administrar Clientes");
        jPanel.add(lblAdministrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 180, 40));

        btnSeleccionarAdministrarClientes.setBackground(new java.awt.Color(255, 0, 51));
        btnSeleccionarAdministrarClientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSeleccionarAdministrarClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionarAdministrarClientes.setText("Seleccionar");
        btnSeleccionarAdministrarClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSeleccionarAdministrarClientes.addActionListener(this::btnSeleccionarAdministrarClientesActionPerformed);
        jPanel.add(btnSeleccionarAdministrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 187, 40));

        jSeparator6.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator6.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 240, -1));

        jSeparator7.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator7.setForeground(new java.awt.Color(225, 6, 0));
        jPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 240, -1));

        jSeparator8.setBackground(new java.awt.Color(225, 6, 0));
        jSeparator8.setForeground(new java.awt.Color(225, 6, 0));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 10, 270));
        jPanel.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 220, 170));

        btnVolverAtras3.setBackground(new java.awt.Color(255, 0, 51));
        btnVolverAtras3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnVolverAtras3.setForeground(new java.awt.Color(255, 255, 255));
        btnVolverAtras3.setText("<");
        btnVolverAtras3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnVolverAtras3.addActionListener(this::btnVolverAtras3ActionPerformed);
        jPanel.add(btnVolverAtras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarAdministrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarAdministrarClientesActionPerformed
        controlNavegacion.navegarBuscadorCliente();
    }//GEN-LAST:event_btnSeleccionarAdministrarClientesActionPerformed

    private void btnVolverAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtras3ActionPerformed
        controlNavegacion.navegarBienvenidaAdministrador();

    }//GEN-LAST:event_btnVolverAtras3ActionPerformed

    private void cargarImagenesMenu() {
        try {
            URL pathImagen = getClass().getResource("/ImagenMenuRutinas.png");

            if (pathImagen != null) {
                ImageIcon imagen = new ImageIcon(pathImagen);
                Image escalaImagen = imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon imagenFinal = new ImageIcon(escalaImagen);

                lblImagen.setIcon(imagenFinal);

            } else {
                JOptionPane.showMessageDialog(this, "No se encontró la imagen", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarAdministrarClientes;
    private javax.swing.JButton btnVolverAtras;
    private javax.swing.JButton btnVolverAtras3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblAdministrarClientes;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
