/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.Controlador_Cargar;
import javax.swing.JDialog;
/**
 *
 * @author Angel Colina
 */
public class select extends javax.swing.JPanel {

    /*
     * Creates new form select
     */
    JDialog dialog;
    Controlador_Cargar cc;
    
    public select(JDialog dialog,Controlador_Cargar cc) {
        this.cc=cc;
        this.dialog=dialog;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Series = new javax.swing.JButton();
        Peliculas = new javax.swing.JButton();

        Series.setText("Series");
        Series.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeriesActionPerformed(evt);
            }
        });

        Peliculas.setText("Peliculas");
        Peliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeliculasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Series)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Peliculas)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Series, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Peliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(Series, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Peliculas, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void PeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeliculasActionPerformed
        cc.ejecutar_Vagedad("Peliculas");
        dialog.dispose();
    }//GEN-LAST:event_PeliculasActionPerformed

    private void SeriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeriesActionPerformed
     
        this.dialog.dispose();
        JDialog dia = new JDialog();
        dia.add(new Serie(dia, cc));
        dia.pack();
        dia.setTitle("Seleccione una opcion");
        dia.setModal(true);
        dia.setResizable(false);
        dia.setLocationRelativeTo(null);
        dia.setVisible(true);
        dia.repaint();
        dia.validate();
    }//GEN-LAST:event_SeriesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Peliculas;
    private javax.swing.JButton Series;
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
