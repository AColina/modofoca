package recovery;

import Clases.Utilidades;
import usuarios.Controlador_Usuario;
import Vistas.Index;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTextField;
import login.Conectar;
import login.Login;
import login.controlador_login;

/**
 *
 * @author Angel Colina
 */
public class Controlador_recovery {
    
    public final ArrayList<JComponent> componentes;
    private final Connection con;
    private final recovery_pass rp;
    private final controlador_login cl;
    private final Controlador_Usuario cu;
    
    public Controlador_recovery(recovery_pass rp) {
        con = new Conectar().Conexion();
        componentes= new ArrayList<>();
        this.rp=rp;
        cl= new controlador_login();
        cu= new Controlador_Usuario();
    }
    public void setVisible(boolean visible){
        for (JComponent jComponent : componentes) {
            jComponent.setVisible(visible);
        }
    }
    void envio(boolean estado_envio){
        this.rp.envio(estado_envio);
    }
    public void enviar(String dato){
        String user;
        String mail=null;
        if(cu.existe(dato)){
            user=dato;
            Object [] aux= cu.getUsuario(user);
            if(aux[3]!= null){
                mail=aux[3].toString();
            }            
        }else{
            user=cu.mailExist(dato);
            mail=dato;
        }
        if(user != null && mail != null){
            String codigo= new generador_codigo().randomString(6);               
            if (change_request(codigo, user)) {
                String Mensaje="Codigo de Verificación: "+codigo;
                System.out.println(mail);
                    new Controlador_mail(mail, "Recuperar Contraseña", Mensaje, this).start();
//                envio(true);
            }  
        }else{
            Utilidades.MsjE("El Usuario o el correo no fue encontrado en la Base de Datos");
            envio(false);
        }
    }
    private boolean change_request(String codigo,String user){
        user=controlador_login.revalidarCampos(user);
        String Query="update autentificacion set recovery='"+codigo+"' where user='"+user+"'";    
        try {
             PreparedStatement pstm = con.prepareStatement(Query);            

            if (pstm.executeUpdate() != 0) {
                return true;
            }

        } catch (java.sql.SQLException | java.awt.HeadlessException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
        return false;
    }
    public void verificar(JTextField code,JTextField user){
        if(code.getText().length()==6){
            String Query="Select * from autentificacion where recovery='"+code.getText()+"'";
            try{
                PreparedStatement pstm=con.prepareCall(Query);
                ResultSet rs=pstm.executeQuery();
                String u=null;
                while(rs.next()){
                    u=rs.getString("user");
                }
                if(u != null && !"".equals(u)){
                    code.setEnabled(false);
                    user.setText(u);
                    setVisible(true);                    
                }else{
                    Utilidades.MsjE("Error en el codigo de verificacion \n Usuario no encontrado");
                }

            }catch(java.sql.SQLException ex){
                Utilidades.MsjE(ex.getMessage());
                Utilidades.writeException(ex);
            }   
        }
    }
    public void aceptar(String user,String pass,String pass2){
        if(!pass.equals(pass2)){
            Utilidades.MsjE("Las contraseñas no coinciden");
        }else
        if(pass.length()<3){
            Utilidades.MsjE("La contraseña debe ser mayor a 4 caracteres");
        }else{
            if(update(user,pass)){
                Utilidades.Msj("Contraseña cambiada exitosamente");
                regresar();
            }
        }
    }
    private boolean update (String user,String pass) {    
       String Query="update autentificacion set password='"+pass+"' where user='"+user+"'";
        try {
           PreparedStatement pstm = con.prepareStatement(Query);
                                   
            if (pstm.executeUpdate() != 0) {
                return true;
            }
            
        } catch (java.sql.SQLException | java.awt.HeadlessException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
      return false;
    }
    public void regresar(){
        Index.Fondo.removeAll();
        Index.Fondo.add(new Login());
        Index.Fondo.updateUI();
        Index.Fondo.repaint();
    }
}
