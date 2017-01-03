package Vistas;


import Controladores.Controlador_Imagenes;
import Controladores.Controlador_Principal;
import Controladores.Controlador_Programas;


/**
 *
 * @author Angel Colina
 */
public class Programas extends javax.swing.JPanel {

    /**
     * Creates new form Programas
     */
    private final Controlador_Programas  cpo;
    private final Controlador_Principal cp;
    
    public Programas(Controlador_Principal cp)  {
        this.cp=cp; 
        initComponents();

        this.setCursor(Controlador_Principal.getCursorP());
        this.BotonSalir.setCursor(Controlador_Principal.getCursorB());
        Programas.tabla_programas.setCursor(Controlador_Principal.getCursorB());
        
        cpo= new Controlador_Programas();
        cpo.setTable();
    }
                     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_programas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        tabla_programas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabla_programas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_programas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_programasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_programas);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(240, 40, 430, 380);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(Controlador_Imagenes.Pelicula_click);
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(0, 130, 220, 200);

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

    private void tabla_programasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_programasMouseClicked
       cpo.ejecutar();
    }//GEN-LAST:event_tabla_programasMouseClicked

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla_programas;
    // End of variables declaration//GEN-END:variables
}
