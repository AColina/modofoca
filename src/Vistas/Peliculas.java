package Vistas;


import Controladores.Controlador_Imagenes;
import Controladores.Controlador_Peliculas;
import Controladores.Controlador_Principal;


/**
 *
 * @author Angel Colina
 */
public class Peliculas extends javax.swing.JPanel {

    
    private final Controlador_Principal cp;
    private final Controlador_Peliculas cpe;
    
    public Peliculas(Controlador_Principal cp)  {
        this.cp=cp; 
        initComponents();
        this.setCursor(Controlador_Principal.getCursorP());
        this.BotonSalir.setCursor(Controlador_Principal.getCursorB());
        TablaPeliculas.setCursor(Controlador_Principal.getCursorB());
        TablaSeries.setCursor(Controlador_Principal.getCursorB());
        this.jTabbedPane1.setCursor(Controlador_Principal.getCursorB());
        cpe= new Controlador_Peliculas();
        TablaPeliculas.setModel(cpe.setTablePeliculas());        
        TablaSeries.setModel(cpe.setTableSeries());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPeliculas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaSeries = new javax.swing.JTable();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(Controlador_Imagenes.Camara_click);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 190));

        TablaPeliculas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TablaPeliculas.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPeliculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPeliculas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 10, 400, 360));

        jTabbedPane1.addTab("Peliculas", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaSeries.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TablaSeries.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaSeries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaSeriesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TablaSeries);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 10, 400, 360));

        jLabel3.setIcon(Controlador_Imagenes.Serie_click);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 190));

        jTabbedPane1.addTab("Series", jPanel2);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 680, 440));

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
        add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        //cambio de pestaña
        if(cpe!= null){
            if(cpe.getIdentificador()==0){
                cpe.setIdentificador((byte)1);
            }else{
                cpe.setIdentificador((byte)0);
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        cp.getPrincipal();
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        BotonSalir.setIcon(Controlador_Imagenes.Salir_Enter);
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        BotonSalir.setIcon(Controlador_Imagenes.Salir);
    }//GEN-LAST:event_BotonSalirMouseExited

    private void TablaPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPeliculasMouseClicked
       cpe.ejecutar(TablaPeliculas.getSelectedRow());
    }//GEN-LAST:event_TablaPeliculasMouseClicked

    private void TablaSeriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaSeriesMouseClicked
        cpe.ejecutar(TablaSeries.getSelectedRow());
    }//GEN-LAST:event_TablaSeriesMouseClicked
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JTable TablaPeliculas;
    public static javax.swing.JTable TablaSeries;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
