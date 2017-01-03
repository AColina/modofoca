package usuarios;

import javax.swing.JDialog;
import Clases.Utilidades;
import Controladores.Controlador_Principal;
import login.controlador_login;
/**
 *
 * @author Angel Colina
 */
public class Modificar_usuario extends javax.swing.JPanel {

    private final JDialog dialog;
    private final Controlador_Usuario cu;
    
    public Modificar_usuario(JDialog dialog) {
        this.dialog=dialog;
        initComponents();
        jPanel1.setVisible(false);
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
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        nivel = new javax.swing.JComboBox();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();

        jLabel3.setText("Usuario :");

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

        guardar.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/Accept-Male-User.png"));
        guardar.setText("Guardar");
        guardar.setEnabled(false);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/Remove-Male-User.png"));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Usuario"));

        jLabel1.setText("Nombre :");

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

        jLabel2.setText("Apellido :");

        jLabel7.setText("Correo Electronico :");

        nivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario" }));

        jLabel6.setText("Nivel :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel6)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(86, 86, 86)
                                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(86, 86, 86)
                                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Buscar.setText("Buscar");
        Buscar.setEnabled(false);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Buscar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(guardar)
                        .addGap(62, 62, 62)
                        .addComponent(cancelar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(cancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(user, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(guardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(cancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Buscar, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
          user.setText(controlador_login.revalidarCampos(user.getText()));
          nombre.setText(controlador_login.revalidarCampos(nombre.getText()));
          apellido.setText(controlador_login.revalidarCampos(apellido.getText()));
          mail.setText(controlador_login.revalidarCampos(mail.getText()));

        if("".equals(user.getText().trim()) || "".equals(nombre.getText().trim()) || 
           "".equals(apellido .getText().trim()) || "".equals(mail .getText().trim())){
            Utilidades.MsjE("A dejado un campo en blaco");
        }else        
        if(nivel.getSelectedIndex() ==-1){
           Utilidades.MsjE("Debe seleccionar el nivel del usuario");  
        }else
        if(cu.existe(user.getText())==true){
            Utilidades.MsjE("El usuario ya existe\n Debe elegir otro");  
        }else
        if(controlador_login.key_validate(user.getText())==true ){
            Utilidades.MsjE("Ni el usuario ni la contraseña pueden tener caracteres especiales"); 
        }else{
            Object Datos[]= new Object[6];
            Datos[0]=user.getText();
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
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dialog.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        controlador_login.keyValidate(evt);
        controlador_login.key_user_pass(user.getText()+evt.getKeyChar(),evt);
    }//GEN-LAST:event_userKeyTyped

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
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER && user.getText().length()>3){Buscar();}
    }//GEN-LAST:event_userKeyPressed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        controlador_login.key_validate(evt);
    }//GEN-LAST:event_nombreKeyPressed

    private void apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidoKeyPressed
        controlador_login.key_validate(evt);
    }//GEN-LAST:event_apellidoKeyPressed

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
      if(user.getText().length()<4){Buscar.setEnabled(false);}else{Buscar.setEnabled(true);}
    }//GEN-LAST:event_userKeyReleased

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_BuscarActionPerformed

    private void Buscar(){
       Object obj[]=cu.getUsuario(user.getText());
        if(obj != null ){
            if(Integer.parseInt(obj[4].toString())<2){
                if(Integer.parseInt(obj[4].toString())==1 && Controlador_Principal.getNivel()==1){
                    Utilidades.MsjE("Un administrador no puede modificar los datos de otro administrador");
                }else{
                    nombre.setText(obj[1].toString());
                    apellido.setText(obj[2].toString());
                    try{
                        mail.setText(obj[3].toString());
                    }catch(NullPointerException ex){mail.setText("");}
                    try{
                        nivel.setSelectedIndex(Integer.parseInt(obj[4].toString()));
                    }catch(NumberFormatException ex){nivel.setSelectedIndex(1);}
                    jPanel1.setVisible(true);
                    dialog.pack();
                }
            }else{
                Utilidades.MsjE("No se pueden modificar los datos de un desarrollador");
            }
        } 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton guardar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail;
    private javax.swing.JComboBox nivel;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
