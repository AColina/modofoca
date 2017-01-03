package usuarios;

import javax.swing.JDialog;
import Clases.Utilidades;
import Controladores.Controlador_Principal;
import login.controlador_login;
/**
 *
 * @author Angel Colina
 */
public class Perfil extends javax.swing.JPanel {

    private final JDialog dialog;
    private final Controlador_Usuario cu;
    private String pass;
    
    public Perfil(JDialog dialog,String user) {
        this.dialog=dialog;
        initComponents();
        cu= new Controlador_Usuario();
        load(user);
    }

    private void load(String user){
        Object [] obj=cu.getUsuario(user);
        this.user.setText(user);
        this.pass=obj[0].toString();
        this.nombre.setText(obj[1].toString());
        this.apellido.setText(obj[2].toString());
        if(obj[3]==null){
            mail.setEnabled(true);
        }else{
            mail.setText(obj[3].toString());
        }
        this.nivel.setSelectedIndex(Integer.parseInt(obj[4].toString()));
        if(this.nivel.getSelectedIndex()==2){
            this.user.setEnabled(true);
            this.nombre.setEnabled(true);
            this.apellido.setEnabled(true);
            if(obj[3]==null){
                mail.setEnabled(true);
            }else{
                mail.setText(obj[3].toString());
                mail.setEnabled(true);
            }
            this.nivel.setEnabled(true);
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
        n_pass = new javax.swing.JPasswordField();
        confir = new javax.swing.JLabel();
        a_pass = new javax.swing.JPasswordField();
        user = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        nivel = new javax.swing.JComboBox();
        Aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        mail = new javax.swing.JTextField();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        n_pass2 = new javax.swing.JPasswordField();

        jLabel1.setText("Nombre :");

        jLabel2.setText("Apellido :");

        jLabel3.setText("Usuario :");

        jLabel4.setText("Antigua contraseña :");

        jLabel5.setText("Nueva contraseña :");

        jLabel6.setText("Nivel :");

        n_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                n_passKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n_passKeyTyped(evt);
            }
        });

        a_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                a_passKeyTyped(evt);
            }
        });

        user.setEnabled(false);
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });

        nombre.setEnabled(false);
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        apellido.setEnabled(false);
        apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                apellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidoKeyTyped(evt);
            }
        });

        nivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Administrador", "Desarrollador" }));
        nivel.setEnabled(false);

        Aceptar.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"/Img/Accept-Male-User.png"));
        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"/Img/Remove-Male-User.png"));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        mail.setEnabled(false);

        jLabel7.setText("Correo :");

        jLabel8.setText("Verificar contraseña :");

        jLabel9.setText("Cambiar contraseña ");

        n_pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                n_pass2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                n_pass2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(Aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addGap(55, 55, 55))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(34, 34, 34)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(n_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(a_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(mail, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(nivel, 0, 162, Short.MAX_VALUE)
                                    .addComponent(n_pass2)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9)))
                .addGap(22, 22, 22))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(a_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(n_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(n_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(Aceptar))
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(n_pass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(confir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(a_pass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(apellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(nivel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Aceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(mail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(n_pass2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        user.setText(controlador_login.revalidarCampos(user.getText()));
        a_pass.setText(controlador_login.revalidarCampos(a_pass.getText()));
        n_pass.setText(controlador_login.revalidarCampos(n_pass.getText()));
        nombre.setText(controlador_login.revalidarCampos(nombre.getText()));
        apellido.setText(controlador_login.revalidarCampos(apellido.getText()));
        mail.setText(controlador_login.revalidarCampos(mail.getText()));   
        
        if("".equals(user.getText().trim()) || "".equals(nombre.getText().trim()) || 
                "".equals(apellido .getText().trim()) || "".equals(mail.getText().trim())){
            Utilidades.MsjE("A dejado un campo en blaco");
        }else
        if((a_pass .getText().trim().length()>0 && n_pass .getText().trim().length()== 0 && n_pass2 .getText().trim().length()==0) ||
           (a_pass .getText().trim().length()>0 && n_pass .getText().trim().length()> 0 && n_pass2 .getText().trim().length()==0)  ||
           (a_pass .getText().trim().length()>0 && n_pass .getText().trim().length()== 0 && n_pass2 .getText().trim().length()>0)  ||
           (a_pass .getText().trim().length()==0 && n_pass .getText().trim().length()> 0 && n_pass2 .getText().trim().length()==0) ||
           (a_pass .getText().trim().length()==0 && n_pass .getText().trim().length()> 0 && n_pass2 .getText().trim().length()>0)  ||
           (a_pass .getText().trim().length()==0 && n_pass .getText().trim().length()== 0 && n_pass2 .getText().trim().length()>0)  ){
            Utilidades.MsjE("Si no desea cambiar la contraseña \ndebe dejar todos los campos en blanco\n"
                    + "de lo contrario debe completar todos los campos");
        }else
        if(!n_pass.getText().equals(n_pass2.getText())){
            Utilidades.MsjE("Las contraseñas no coinciden");
        }else
        if(nivel.getSelectedIndex() ==-1){
           Utilidades.MsjE("Debe seleccionar el nivel del usuario");  
        }else
        if(controlador_login.key_validate(user.getText())==true || controlador_login.key_validate(a_pass.getText())==true
                ||controlador_login.key_validate(n_pass.getText())==true  ){
            Utilidades.MsjE("Ni el usuario ni la contraseña pueden tener caracteres especiales"); 
        }else
        if(n_pass.getText().trim().length()>0 && n_pass.getText().length() <4){
            Utilidades.MsjE("la contraseña debe tener minimo 4 caracteres");
        }else
        if(a_pass.getText().trim().length()>0 && !a_pass.getText().equals(pass)){
            Utilidades.MsjE("Contraseña incorrecta");
        }else{
            Object Datos[]= new Object[6];
            Datos[0]=user.getText();
            Datos[1]=n_pass.getText();
            if(Datos[1].toString().trim().length()==0) Datos[1]=pass;
            Datos[2]=nombre.getText();
            Datos[3]=apellido.getText();
            Datos[4]=mail.getText();
            Datos[5]=nivel.getSelectedIndex();
           if( cu.update(Datos)==true){
               Utilidades.Msj("Datos modificados con exito");
               dialog.dispose();
           }else{
               Utilidades.MsjE("Error al modificar datos");
           }
        }
        a_pass.setText("");
        n_pass.setText("");
        n_pass2.setText("");
    }//GEN-LAST:event_AceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dialog.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void n_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_passKeyPressed
        controlador_login.key_validate(evt); 
        if(n_pass2.getText().equals(n_pass.getText()+evt.getKeyChar())){
            confir.setText("Las contraseñas coniciden");
        }else{
             confir.setText("Las contraseñas no coniciden");
        }
    }//GEN-LAST:event_n_passKeyPressed

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_user_pass(user.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_userKeyTyped

    private void a_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a_passKeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_user_pass(a_pass.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_a_passKeyTyped

    private void n_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_passKeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_user_pass(n_pass.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_n_passKeyTyped

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

    private void n_pass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_pass2KeyPressed
       controlador_login.key_validate(evt); 
        if(n_pass.getText().equals(n_pass2.getText()+evt.getKeyChar())){
            confir.setText("Las contraseñas coniciden");
        }else{
             confir.setText("Las contraseñas no coniciden");
        }
    }//GEN-LAST:event_n_pass2KeyPressed

    private void n_pass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n_pass2KeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_user_pass(n_pass.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_n_pass2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JPasswordField a_pass;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel confir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField n_pass;
    private javax.swing.JPasswordField n_pass2;
    private javax.swing.JComboBox nivel;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
