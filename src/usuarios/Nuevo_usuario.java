package usuarios;

import javax.swing.JDialog;
import Clases.Utilidades;
import Controladores.Controlador_Principal;
import javax.swing.ImageIcon;
import login.controlador_login;
/**
 *
 * @author Angel Colina
 */
public class Nuevo_usuario extends javax.swing.JPanel {

    private final JDialog dialog;
    private final Controlador_Usuario cu;
    
    public Nuevo_usuario(JDialog dialog) {
        this.dialog=dialog;
        initComponents();
        cu= new Controlador_Usuario();
        load();
    }
    private void load(){
        if(Controlador_Principal.getNivel()==2){
            nivel.addItem("Administrador");
            nivel.addItem("Desarrollador");
        }
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        pass2 = new javax.swing.JPasswordField();
        confir = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        nivel = new javax.swing.JComboBox();
        crear = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        check = new javax.swing.JLabel();

        jLabel1.setText("Nombre :");

        jLabel2.setText("Apellido :");

        jLabel3.setText("Usuario :");

        jLabel4.setText("Contraseña :");

        jLabel5.setText("Verificar contraseña :");

        jLabel6.setText("Nivel :");

        pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pass2KeyTyped(evt);
            }
        });

        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                apellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        nivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario" }));

        crear.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"/Img/Accept-Male-User.png"));
        crear.setText("Crear");
        crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"/Img/Remove-Male-User.png"));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Correo :");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(crear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addGap(30, 30, 30))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(21, 21, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(apellido)
                            .addComponent(nombre)
                            .addComponent(user)
                            .addComponent(pass)
                            .addComponent(pass2)
                            .addComponent(confir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(confir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crear)
                    .addComponent(cancelar))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pass2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(confir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(pass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(apellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nivel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(crear, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(check, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearActionPerformed
        user.setText(controlador_login.revalidarCampos(user.getText()));
        pass.setText(controlador_login.revalidarCampos(pass.getText()));
        nombre.setText(controlador_login.revalidarCampos(nombre.getText()));
        apellido.setText(controlador_login.revalidarCampos(apellido.getText()));
        mail.setText(controlador_login.revalidarCampos(mail.getText()));     
        
        
        if("".equals(user.getText().trim()) || "".equals(pass.getText().trim()) || "".equals(pass2.getText().trim()) || "".equals(nombre.getText().trim()) || "".equals(apellido .getText().trim())){
            Utilidades.MsjE("A dejado un campo en blaco");
        }else
        if(!pass.getText().equals(pass2.getText())){
            Utilidades.MsjE("Las contraseñas no coinciden");
        }else
        if(nivel.getSelectedIndex() ==-1){
           Utilidades.MsjE("Debe seleccionar el nivel del usuario");  
        }else
        if(cu.existe(user.getText())==true){
            Utilidades.MsjE("El usuario ya existe\n Debe elegir otro");  
        }else
        if(controlador_login.key_validate(user.getText())==true || controlador_login.key_validate(pass.getText())==true){
            Utilidades.MsjE("Ni el usuario ni la contraseña pueden tener caracteres especiales"); 
        }else
        if(user.getText().length() <4){
            Utilidades.MsjE("El usuario debe tener minimo 4 caracteres");
        }else
        if(pass.getText().length() <4){
            Utilidades.MsjE("La contraseña debe tener minimo 4 caracteres");
        }else{
            Object Datos[]= new Object[6];
            Datos[0]=user.getText();
            Datos[1]=pass.getText();
            Datos[2]=nombre.getText();
            Datos[3]=apellido.getText();
            Datos[4]=mail.getText();
            Datos[5]=nivel.getSelectedIndex();
           if( cu.insert(Datos)==true){
               Utilidades.Msj("Usuario creado exitosamente");
               dialog.dispose();
           }else{
               Utilidades.MsjE("Error al crear el usuario");
           }
        }
        pass.setText("");
        pass2.setText("");
    }//GEN-LAST:event_crearActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dialog.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void pass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass2KeyPressed
        controlador_login.key_validate(evt); 
        if(pass.getText().equals(pass2.getText()+evt.getKeyChar())){
            confir.setText("Las contraseñas coniciden");
        }else{
             confir.setText("Las contraseñas no coniciden");
        }
    }//GEN-LAST:event_pass2KeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        controlador_login.key_validate(evt); 
        if(!"".equals(pass2.getText()) && pass.getText().equals(pass2.getText()+evt.getKeyChar())){
            confir.setText("Las contraseñas coniciden");
        }else{
             confir.setText("Las contraseñas no coniciden");
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

    private void pass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass2KeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_user_pass(pass2.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_pass2KeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_nombre(nombre.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_nombre(apellido.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_apellidoKeyTyped

    private void userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyPressed
        controlador_login.key_validate(evt);        
    }//GEN-LAST:event_userKeyPressed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        controlador_login.key_validate(evt);
    }//GEN-LAST:event_nombreKeyPressed

    private void apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyPressed
        controlador_login.key_validate(evt);
    }//GEN-LAST:event_apellidoKeyPressed

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
        if(user.getText().length()<4){
            check.setIcon(new ImageIcon(Controlador_Principal.getRuta()+"Img/Delete-16.png"));
        }else{
            if(!cu.existe(user.getText())){
                check.setIcon(new ImageIcon(Controlador_Principal.getRuta()+"Img/Check-16.png"));
            }else{
                check.setIcon(new ImageIcon(Controlador_Principal.getRuta()+"Img/Delete-16.png"));
            }
        }
    }//GEN-LAST:event_userKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel check;
    private javax.swing.JLabel confir;
    private javax.swing.JButton crear;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JComboBox nivel;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass2;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
