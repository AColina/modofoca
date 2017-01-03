package Vistas;

import Controladores.Controlador_Imagenes;
import Controladores.Controlador_MyFiles;
import Controladores.Controlador_Principal;
import explorador.explorer;
import java.awt.Dimension;
import javax.swing.JDialog;

/**
 *
 * @author Angel Colina
 */
public class My_Files extends javax.swing.JPanel {

    /**
     * Creates new form My_Files
     */
    private final Controlador_MyFiles cm;
    private final Controlador_Principal cp;
    private JDialog dialog=null;
    
    public My_Files(Controlador_Principal cp)  {
        this.cp=cp; 
        initComponents();
        cm= new Controlador_MyFiles();        
        this.setCursor(Controladores.Controlador_Principal.getCursorP());
        this.BotonSalir.setCursor(Controladores.Controlador_Principal.getCursorB());
        TablaMisArchivos.setCursor(Controladores.Controlador_Principal.getCursorB());
        cm.setTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        BotonSalir = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMisArchivos = new javax.swing.JTable();
        abrir = new javax.swing.JButton();
        del = new javax.swing.JButton();
        copiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"/Img/exit.png"));
        BotonSalir.setText("exit");
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSalirMouseExited(evt);
            }
        });
        jDesktopPane1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 30));

        TablaMisArchivos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TablaMisArchivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seleccionar", "Numero", "Archivo", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMisArchivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMisArchivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaMisArchivos);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        abrir.setText("Abrir en carpeta");
        abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirActionPerformed(evt);
            }
        });
        jDesktopPane1.add(abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 130, -1));

        del.setText("Eliminar");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jDesktopPane1.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 90, -1));

        copiar.setText("Copiar");
        copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copiarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(copiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 90, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(Controlador_Imagenes.Archivos_click);
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 220, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        cp.getPrincipal();
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        BotonSalir.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"/Img/exittriste.png"));
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        BotonSalir.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"/Img/exit.png"));
    }//GEN-LAST:event_BotonSalirMouseExited

    private void TablaMisArchivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMisArchivosMouseClicked
        
    }//GEN-LAST:event_TablaMisArchivosMouseClicked

    private void abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirActionPerformed
        if(dialog != null){
            dialog.dispose();
        }        
        dialog = new JDialog();       
        dialog.add(new explorer(dialog,cm.getDatos()));
        dialog.setSize(new Dimension(915, 556));
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        dialog.repaint();
        dialog.validate();
    }//GEN-LAST:event_abrirActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        cm.Eliminar();
    }//GEN-LAST:event_delActionPerformed

    private void copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copiarActionPerformed
       cm.copiar();
    }//GEN-LAST:event_copiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonSalir;
    public static javax.swing.JTable TablaMisArchivos;
    private javax.swing.JButton abrir;
    private javax.swing.JButton copiar;
    private javax.swing.JButton del;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
