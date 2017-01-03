package Vistas;


import Controladores.Controlador_Imagenes;
import Controladores.Controlador_Juegos;
import Controladores.Controlador_Principal;


/**
 *
 * @author Angel Colina
 */
public class Juegos extends javax.swing.JPanel {

    /**
     * Creates new form Juegos
     */

    private final Controlador_Principal cp;
    private final Controlador_Juegos cj;
    
    public Juegos(Controlador_Principal cp)  {
        this.cp=cp; 
        initComponents();
      
        this.setCursor(Controlador_Principal.getCursorP());
        this.BotonSalir.setCursor(Controlador_Principal.getCursorB());
        Juegos.tabla_juegos.setCursor(Controlador_Principal.getCursorB());
        
       cj= new Controlador_Juegos();
       cj.setTable();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_juegos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        tabla_juegos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabla_juegos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_juegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_juegosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_juegos);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 40, 420, 400);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(Controlador_Imagenes.Juego_click);
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(0, 130, 220, 200);

        BotonSalir.setIcon(Controlador_Imagenes.Salir);
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
        jDesktopPane1.add(BotonSalir);
        BotonSalir.setBounds(670, 0, 30, 30);

        add(jDesktopPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_juegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_juegosMouseClicked
        cj.ejecutar();
    }//GEN-LAST:event_tabla_juegosMouseClicked

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
         cp.getPrincipal();
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        BotonSalir.setIcon(Controlador_Imagenes.Salir_Enter);
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        BotonSalir.setIcon(Controlador_Imagenes.Salir);
    }//GEN-LAST:event_BotonSalirMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla_juegos;
    // End of variables declaration//GEN-END:variables
}
