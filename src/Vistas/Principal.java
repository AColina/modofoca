package Vistas;

import Controladores.Controlador_Imagenes;
import Controladores.Controlador_Principal;
import javax.swing.JPanel;
import request.Peticiones;
/**
 *
 * @author Angel Colina
 */
public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    private final Controlador_Principal cp;
    
    public Principal(Controlador_Principal cp)  {
        
        this.cp=cp; 
        initComponents();        
        this.setCursor(Controlador_Principal.getCursorP());
        this.BotonSalir.setCursor(Controlador_Principal.getCursorB());
        this.BotonPelis.setCursor(Controlador_Principal.getCursorB());
        this.BotonPrograma.setCursor(Controlador_Principal.getCursorB());
        this.BotonJuegos.setCursor(Controlador_Principal.getCursorB());
        this.Cargar.setCursor(Controlador_Principal.getCursorB());
        this.Cargar.setCursor(Controlador_Principal.getCursorB());
        this.BotonPeticiones.setCursor(Controlador_Principal.getCursorB());
        this.BotonUsuario.setCursor(Controlador_Principal.getCursorB());
        this.BotonMisArchivos.setCursor(Controlador_Principal.getCursorB());
        proxy.setSelected(cp.checkProxy());

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        BotonSalir = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        BotonUsuario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BotonPelis = new javax.swing.JLabel();
        BotonJuegos = new javax.swing.JLabel();
        BotonPrograma = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonPeticiones = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Cargar = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        BotonMisArchivos = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        botonChat = new javax.swing.JButton();
        proxy = new javax.swing.JCheckBox();

        setLayout(new java.awt.BorderLayout());

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡MODOFOCA NETWORK!");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(130, 30, 440, 50);

        nombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nombre.setText("usuario");
        jDesktopPane1.add(nombre);
        nombre.setBounds(10, 430, 320, 22);

        BotonUsuario.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/man.png"));
        BotonUsuario.setToolTipText("Opciones de usuario");
        BotonUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonUsuarioMouseExited(evt);
            }
        });
        jDesktopPane1.add(BotonUsuario);
        BotonUsuario.setBounds(0, 0, 60, 50);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Descargas"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonPelis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonPelis.setIcon(Controlador_Imagenes.Pelicula);
        BotonPelis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPelisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonPelisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonPelisMouseExited(evt);
            }
        });
        jPanel1.add(BotonPelis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 100));

        BotonJuegos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonJuegos.setIcon(Controlador_Imagenes.Juego);
        BotonJuegos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonJuegosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonJuegosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonJuegosMouseExited(evt);
            }
        });
        jPanel1.add(BotonJuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 100));

        BotonPrograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonPrograma.setIcon(Controlador_Imagenes.Programas);
        BotonPrograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonProgramaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonProgramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonProgramaMouseExited(evt);
            }
        });
        jPanel1.add(BotonPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 100));

        jLabel3.setText("Peliculas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 98, -1, -1));

        jLabel4.setText("Juegos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 195, -1, -1));

        jLabel5.setText("Programas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 315, -1, -1));

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(10, 80, 210, 340);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Extras"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonPeticiones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BotonPeticiones.setIcon(Controlador_Imagenes.Peticion);
        BotonPeticiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPeticionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonPeticionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonPeticionesMouseExited(evt);
            }
        });
        jPanel2.add(BotonPeticiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 90));

        jLabel7.setText("Peticiones");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jDesktopPane1.add(jPanel2);
        jPanel2.setBounds(230, 300, 460, 120);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Mi perfil"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cargar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cargar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargar.setIcon(Controlador_Imagenes.Cargar);
        Cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CargarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CargarMouseExited(evt);
            }
        });
        jPanel3.add(Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 140, 120));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Cargar Archivos");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 110, -1));

        BotonMisArchivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BotonMisArchivos.setIcon(Controlador_Imagenes.Archivos);
        BotonMisArchivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMisArchivosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMisArchivosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonMisArchivosMouseExited(evt);
            }
        });
        jPanel3.add(BotonMisArchivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 140, 120));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Mis Archivos");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jDesktopPane1.add(jPanel3);
        jPanel3.setBounds(230, 80, 460, 210);

        botonChat.setText("Chat  ");
        botonChat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        botonChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonChatActionPerformed(evt);
            }
        });
        jDesktopPane1.add(botonChat);
        botonChat.setBounds(580, 440, 110, 20);

        proxy.setText("Proxy");
        proxy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proxyMouseClicked(evt);
            }
        });
        jDesktopPane1.add(proxy);
        proxy.setBounds(630, 50, 60, 23);

        add(jDesktopPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPelisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPelisMouseEntered
        BotonPelis.setIcon(Controlador_Imagenes.Pelicula_over); // NOI18N        
    }//GEN-LAST:event_BotonPelisMouseEntered

    private void BotonPelisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPelisMouseExited
        BotonPelis.setIcon(Controlador_Imagenes.Pelicula); // NOI18N
    }//GEN-LAST:event_BotonPelisMouseExited

    private void BotonJuegosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJuegosMouseEntered
       BotonJuegos.setIcon(Controlador_Imagenes.Juego_over); // NOI18N
    }//GEN-LAST:event_BotonJuegosMouseEntered

    private void BotonJuegosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJuegosMouseExited
       BotonJuegos.setIcon(Controlador_Imagenes.Juego); // NOI18N
    }//GEN-LAST:event_BotonJuegosMouseExited

    private void BotonProgramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProgramaMouseEntered
       BotonPrograma.setIcon(Controlador_Imagenes.Programas_over); // NOI18N
    }//GEN-LAST:event_BotonProgramaMouseEntered

    private void BotonProgramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProgramaMouseExited
        BotonPrograma.setIcon(Controlador_Imagenes.Programas); // NOI18N
    }//GEN-LAST:event_BotonProgramaMouseExited

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        System.exit(1);
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        BotonSalir.setIcon(Controlador_Imagenes.Salir_Enter);
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        BotonSalir.setIcon(Controlador_Imagenes.Salir);
    }//GEN-LAST:event_BotonSalirMouseExited

    private void BotonJuegosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJuegosMouseClicked
        this.removeAll();
        this.add(new Juegos(cp));
        this.updateUI();
        this.repaint();
        
    }//GEN-LAST:event_BotonJuegosMouseClicked

    private void BotonProgramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonProgramaMouseClicked
        this.removeAll();
        this.add(new Programas(cp));
        this.updateUI();
        this.repaint();
    }//GEN-LAST:event_BotonProgramaMouseClicked

    private void CargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseClicked
        this.removeAll();
        this.add(new Cargar(cp));
        this.updateUI();
        this.repaint();
    }//GEN-LAST:event_CargarMouseClicked

    private void BotonPelisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPelisMouseClicked
        this.removeAll();
        this.add(new Peliculas(cp));
        this.updateUI();
        this.repaint();
                        
    }//GEN-LAST:event_BotonPelisMouseClicked

    private void BotonPeticionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPeticionesMouseClicked
        this.removeAll();
        this.add(new Peticiones(cp));
        this.updateUI();
        this.repaint();
    }//GEN-LAST:event_BotonPeticionesMouseClicked

    private void BotonPeticionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPeticionesMouseEntered
        BotonPeticiones.setIcon(Controlador_Imagenes.Peticion_over);
    }//GEN-LAST:event_BotonPeticionesMouseEntered

    private void BotonPeticionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPeticionesMouseExited
        BotonPeticiones.setIcon(Controlador_Imagenes.Peticion);
        
    }//GEN-LAST:event_BotonPeticionesMouseExited

    private void BotonUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonUsuarioMouseClicked
        cp.PopUp_desplegable((JPanel)this,BotonUsuario.getX(),BotonUsuario.getY()+BotonUsuario.getHeight()-10);
    }//GEN-LAST:event_BotonUsuarioMouseClicked

    private void BotonUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonUsuarioMouseEntered
        BotonUsuario.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/man2.png"));
    }//GEN-LAST:event_BotonUsuarioMouseEntered

    private void BotonUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonUsuarioMouseExited
        BotonUsuario.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/man.png"));
    }//GEN-LAST:event_BotonUsuarioMouseExited

    private void CargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseEntered
       Cargar.setIcon(Controlador_Imagenes.Cargar_over);
    }//GEN-LAST:event_CargarMouseEntered

    private void CargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CargarMouseExited
       Cargar.setIcon(Controlador_Imagenes.Cargar);
    }//GEN-LAST:event_CargarMouseExited

    private void BotonMisArchivosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMisArchivosMouseEntered
        BotonMisArchivos.setIcon(Controlador_Imagenes.Archivos_over);
    }//GEN-LAST:event_BotonMisArchivosMouseEntered

    private void BotonMisArchivosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMisArchivosMouseExited
       BotonMisArchivos.setIcon(Controlador_Imagenes.Archivos);
    }//GEN-LAST:event_BotonMisArchivosMouseExited

    private void BotonMisArchivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMisArchivosMouseClicked
        this.removeAll();
        this.add(new My_Files(cp));
        this.updateUI();
        this.repaint();
    }//GEN-LAST:event_BotonMisArchivosMouseClicked

    private void botonChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonChatActionPerformed
        cp.popUpChat((JPanel)this,botonChat.getX(),botonChat.getY(),botonChat.getWidth());
    }//GEN-LAST:event_botonChatActionPerformed

    private void proxyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proxyMouseClicked
      cp.setCheck(proxy.isSelected());
    }//GEN-LAST:event_proxyMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonJuegos;
    private javax.swing.JLabel BotonMisArchivos;
    private javax.swing.JLabel BotonPelis;
    private javax.swing.JLabel BotonPeticiones;
    private javax.swing.JLabel BotonPrograma;
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JLabel BotonUsuario;
    private javax.swing.JLabel Cargar;
    private javax.swing.JButton botonChat;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JLabel nombre;
    private javax.swing.JCheckBox proxy;
    // End of variables declaration//GEN-END:variables
}
