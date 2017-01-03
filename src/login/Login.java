package login;

import Clases.Utilidades;
import Controladores.Controlador_Principal;
import Vistas.Index;
import java.awt.Color;
import java.awt.event.KeyEvent;
import conexiones.Controlador_Conexion;
import java.util.logging.Level;
import java.util.logging.Logger;
import recovery.recovery_pass;
/**
 *
 * @author Angel Colina
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form Login
     */
    private final controlador_login cl;
    private final Controlador_Principal cp;
    
    public Login() {       
        initComponents();
        cl= new controlador_login(pass, user);
        cp= new Controlador_Principal();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                    new Controlador_Conexion();
            }
        });
        this.setCursor(Controlador_Principal.getCursorP());
        this.BotonSalir.setCursor(Controlador_Principal.getCursorB());
        this.BotonOlvidarContraseña.setCursor(Controlador_Principal.getCursorB());
        this.Aceptar.setCursor(Controlador_Principal.getCursorB());
        this.Cancelar.setCursor(Controlador_Principal.getCursorB());
        user.requestFocusInWindow();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        BotonOlvidarContraseña = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(703, 458));

        Aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Check.png"))); // NOI18N
        Aceptar.setToolTipText("Acceder");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Aceptar);
        Aceptar.setBounds(270, 330, 50, 40);

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Delete.png"))); // NOI18N
        Cancelar.setToolTipText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(Cancelar);
        Cancelar.setBounds(390, 330, 50, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/man.png"))); // NOI18N
        jLabel1.setToolTipText("Usuario");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(230, 190, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/application-pgp-signature.png"))); // NOI18N
        jLabel2.setToolTipText("Contraseña");
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(230, 240, 30, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("¡MODOFOCA NETWORK!");
        jLabel3.setFocusable(false);
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(130, 30, 440, 50);

        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit.png"))); // NOI18N
        BotonSalir.setFocusable(false);
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

        user.requestFocus(true);
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });
        jDesktopPane1.add(user);
        user.setBounds(270, 200, 170, 20);

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });
        jDesktopPane1.add(pass);
        pass.setBounds(270, 250, 170, 20);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/foca.gif"))); // NOI18N
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(480, 110, 180, 240);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/spr_icon2_clicked.png"))); // NOI18N
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(20, 260, 130, 120);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/spr_icon1_clicked.png"))); // NOI18N
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(10, 100, 140, 150);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/spr_icon3_clicked.png"))); // NOI18N
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(90, 170, 150, 130);

        BotonOlvidarContraseña.setText("Olvide mi contraseña");
        BotonOlvidarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonOlvidarContraseñaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonOlvidarContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonOlvidarContraseñaMouseExited(evt);
            }
        });
        jDesktopPane1.add(BotonOlvidarContraseña);
        BotonOlvidarContraseña.setBounds(270, 290, 130, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        cp.Salir();;
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exittriste.png")));
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/exit.png")));
    }//GEN-LAST:event_BotonSalirMouseExited

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        cp.Salir();
    }//GEN-LAST:event_CancelarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        
        if(controlador_login.key_validate(user.getText())==false &&controlador_login.key_validate(pass.getText())==false){
            user.setText(controlador_login.revalidarCampos(user.getText()));
            pass.setText(controlador_login.revalidarCampos(pass.getText()));
            String v[];
            if((v=cl.verificar()) != null ){
                Controlador_Conexion.enviarDatos("command - user - "+user.getText()+" - "+pass.getText());
                cp.setNivel(Byte.parseByte(v[0]),v[1],v[2]);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                cp.getPrincipal();
            }
        }else{
            Utilidades.MsjE("No se permiten caractetes especailes");
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        controlador_login.key_validate(evt);
        if(controlador_login.key_validate(user.getText())==false &&controlador_login.key_validate(pass.getText())==false){
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            user.setText(controlador_login.revalidarCampos(user.getText()));
            pass.setText(controlador_login.revalidarCampos(pass.getText()));
             String v[];
        if((v=cl.verificar()) != null){
                Controlador_Conexion.enviarDatos("command - user - "+user.getText()+" - "+pass.getText());
                cp.setNivel(Byte.parseByte(v[0]),v[1],v[2]);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                cp.getPrincipal();
            }
        }
        }else{
            Utilidades.MsjE("No se permiten caractetes especailes");
        }
    }//GEN-LAST:event_passKeyPressed

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_user_pass(user.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_userKeyTyped

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_user_pass(pass.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_passKeyTyped

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        controlador_login.key_validate(evt);
    }//GEN-LAST:event_userKeyPressed

    private void BotonOlvidarContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonOlvidarContraseñaMouseEntered
        BotonOlvidarContraseña.setForeground(new Color(71, 241, 67));
        BotonOlvidarContraseña.setFont(new java.awt.Font("Tahoma", 1, 11));
    }//GEN-LAST:event_BotonOlvidarContraseñaMouseEntered

    private void BotonOlvidarContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonOlvidarContraseñaMouseExited
        BotonOlvidarContraseña.setForeground(Color.white);
        BotonOlvidarContraseña.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_BotonOlvidarContraseñaMouseExited

    private void BotonOlvidarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonOlvidarContraseñaMouseClicked
      Index.Fondo.removeAll();
      Index.Fondo.add(new recovery_pass(cp));
      Index.Fondo.updateUI();
    }//GEN-LAST:event_BotonOlvidarContraseñaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JLabel BotonOlvidarContraseña;
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JButton Cancelar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
