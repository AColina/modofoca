package login;

import Clases.Registro;
import Clases.Utilidades;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Angel Colina
 */
public class controlador_login {
    
    private final java.sql.Connection con;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    
    public controlador_login(javax.swing.JPasswordField pass, javax.swing.JTextField user) {
        this.user=user;
        this.pass=pass;
        con = new Conectar().Conexion();
    }

    public controlador_login() {
        con = new Conectar().Conexion();
    }
    
    public static boolean key_validate(java.awt.event.KeyEvent evt){
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar()) && 
       evt.getKeyCode() != java.awt.event.KeyEvent.VK_ENTER &&  evt.getKeyCode() != java.awt.event.KeyEvent.VK_BACK_SPACE
       && evt.getKeyCode() != 127 && evt.getKeyCode() != 37 && evt.getKeyCode() != 38 && evt.getKeyCode() != 39
       && evt.getKeyCode() != 40 && evt.getKeyCode() != 20 && evt.getKeyCode() != 16){            
           Utilidades.MsjE("No se admiten caracteres especiales");
           return false;
        }
        return true;
    }
    public static void keyValidate(java.awt.event.KeyEvent evt){
        if(!Character.isLetter(evt.getKeyChar()) && !Character.isDigit(evt.getKeyChar())){
            evt.consume();
           
        }
    }
    public static boolean key_validate(String texto){
        
        for (int i = 0; i < texto.length(); i++) {
            if(!Character.isDigit(texto.charAt(i)) && !Character.isLetter(texto.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static void key_user_pass(String texto,java.awt.event.KeyEvent evt){
       
        if(texto.length()>15){
            evt.consume();
        }
    }
    public static void key_nombre(String texto,java.awt.event.KeyEvent evt){
        
        if(texto.length()>30){
            evt.consume();
        }
    }
    public String[] verificar(){
        if(user.getText().replaceAll("\\s++", "").trim().isEmpty()==false && pass.getText().replaceAll("\\s++", "").trim().isEmpty()==false){
            if(conexiones.Controlador_Conexion.getConexion()==true){
                Registro r= new Registro();
                String Query="Select * from autentificacion where user='"+user.getText()+"' and password='"+pass.getText()+"'";
                try{
                    PreparedStatement pstm=con.prepareCall(Query);
                    ResultSet rs=pstm.executeQuery();
                    String v[]= new String[3];
                    while(rs.next()){
                        v[0]= Byte.toString(rs.getByte("nivel"));
                        v[1]=rs.getString("nombre")+" "+rs.getString("apellido");
                        v[2]=user.getText();
                        r.ingreso(v[2]);
                        return v;
                    }
                    Utilidades.MsjE("Usuario o contraseña incorrecta");
                }catch(java.sql.SQLException ex){
                    Utilidades.MsjE(ex.getMessage());
                    Utilidades.writeException(ex);
                }
            }else{
                 Utilidades.MsjE("Esperando coneccion del servidor");
            }
        }else{
            Utilidades.MsjE("Debe llanar todos los campos");
        }
        return null;
    }
    public static String revalidarCampos(String valor){
        return valor.replaceAll("\"", "@@").replaceAll("'", "@@@");
    }
}
