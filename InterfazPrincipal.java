/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba01;

import java.util.ArrayList;

/**
 *
 * @author NOVAK
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPrincipal
     */
    public static ArrayList<Libro> ListaLibros = new ArrayList<>();
    public static ArrayList<Cliente> ListaClientes = new ArrayList<>();
    public static ArrayList<Empleado> ListaEmpleados = new ArrayList<>();
    
    public InterfazPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("BibliotecSmart");
        this.setSize(500, 500);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BoletaButton = new javax.swing.JButton();
        StockButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("SmartBibliotec"); // NOI18N

        jLabel1.setText("           <<INSERTE IMAGEN>>");

        BoletaButton.setText("Generar boleta");
        BoletaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoletaButtonActionPerformed(evt);
            }
        });

        StockButton.setText("Ver stock");
        StockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(StockButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BoletaButton)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BoletaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(196, 196, 196))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BoletaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoletaButtonActionPerformed
        Boleta b1 = new Boleta(this, false);
        b1.setLocationRelativeTo(null);
        b1.setVisible(true);
    }//GEN-LAST:event_BoletaButtonActionPerformed

    private void StockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockButtonActionPerformed

    }//GEN-LAST:event_StockButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoletaButton;
    private javax.swing.JButton StockButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
