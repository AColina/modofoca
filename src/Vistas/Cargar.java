package Vistas;


import Controladores.Controlador_Cargar;
import Controladores.Controlador_Imagenes;
import Controladores.Controlador_Principal;
import javax.swing.JDialog;


/**
 *
 * @author Angel Colina
 */
public class Cargar extends javax.swing.JPanel {

    /**
     * Creates new form Cargar
     */

    private final Controlador_Principal cp;
    private final Controlador_Cargar cc;
    
    
    public Cargar(Controlador_Principal cp)  {
        this.cp=cp; 
        initComponents();
        cc= new Controlador_Cargar(this);
        this.setCursor(Controlador_Principal.getCursorP());
        this.BotonJuego.setCursor(Controlador_Principal.getCursorB());
        this.BotonPelicula.setCursor(Controlador_Principal.getCursorB());
        this.BotonProgramas.setCursor(Controlador_Principal.getCursorB());
        this.BotonSalir.setCursor(Controlador_Principal.getCursorB());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonJuego = new javax.swing.JLabel();
        BotonPelicula = new javax.swing.JLabel();
        BotonProgramas = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("¡CARGAR ARCHIVOS!");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(170, 10, 390, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("¡INFORMACION IMPORTANTE!"));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("<html> <p>  Es importante destacar que mientras mas ahorremos espacio en los discos mejor, todos los archivos peliculas, programas, etc tienen que estar comprimido en RAR, de lo contrario el sistema no lo aceptara.  </p> </html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(20, 70, 260, 330);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Escoja la categoria");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(400, 50, 230, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        BotonJuego.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonJuego.setIcon(Controlador_Imagenes.Juego);
        BotonJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonJuegoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonJuegoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonJuegoMouseExited(evt);
            }
        });

        BotonPelicula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonPelicula.setIcon(Controlador_Imagenes.Pelicula);
        BotonPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPeliculaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonPeliculaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonPeliculaMouseExited(evt);
            }
        });

        BotonProgramas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonProgramas.setIcon(Controlador_Imagenes.Programas);
        BotonProgramas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonProgramasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonProgramasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonProgramasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
            .addComponent(BotonJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonProgramas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(BotonPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonProgramas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel2);
        jPanel2.setBounds(390, 100, 250, 300);

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

    private void BotonJuegoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJuegoMouseEntered
        BotonJuego.setIcon(Controlador_Imagenes.Juego_over);
    }//GEN-LAST:event_BotonJuegoMouseEntered

    private void BotonJuegoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJuegoMouseExited
        BotonJuego.setIcon(Controlador_Imagenes.Juego);
    }//GEN-LAST:event_BotonJuegoMouseExited

    private void BotonJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJuegoMouseClicked
        cc.ejecutar("Juegos"); 
    }//GEN-LAST:event_BotonJuegoMouseClicked

    private void BotonPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPeliculaMouseClicked
        JDialog jd = new JDialog();
        jd.setModal(true);
        jd.add(new select(jd, cc));
        jd.setResizable(false);
        jd.setTitle("Seleccine una opcion");
        jd.pack();
        jd.setLocationRelativeTo(this);
        jd.setVisible(true);
        jd.validate();
        jd.repaint();
    }//GEN-LAST:event_BotonPeliculaMouseClicked

    private void BotonPeliculaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPeliculaMouseEntered
        BotonPelicula.setIcon(Controlador_Imagenes.Pelicula_over);
    }//GEN-LAST:event_BotonPeliculaMouseEntered

    private void BotonPeliculaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPeliculaMouseExited
        BotonPelicula.setIcon(Controlador_Imagenes.Pelicula);
    }//GEN-LAST:event_BotonPeliculaMouseExited

    private void BotonProgramasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProgramasMouseClicked
        cc.ejecutar("Programas");
    }//GEN-LAST:event_BotonProgramasMouseClicked

    private void BotonProgramasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProgramasMouseEntered
        BotonProgramas.setIcon(Controlador_Imagenes.Programas_over);
    }//GEN-LAST:event_BotonProgramasMouseEntered

    private void BotonProgramasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProgramasMouseExited
        BotonProgramas.setIcon(Controlador_Imagenes.Programas);
    }//GEN-LAST:event_BotonProgramasMouseExited

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
    private javax.swing.JLabel BotonJuego;
    private javax.swing.JLabel BotonPelicula;
    private javax.swing.JLabel BotonProgramas;
    private javax.swing.JLabel BotonSalir;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
