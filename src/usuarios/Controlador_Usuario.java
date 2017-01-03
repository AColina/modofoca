package usuarios;

import Clases.Utilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import login.Conectar;

/**
 *
 * @author Angel Colina
 */
public class Controlador_Usuario {
    private final Connection con;
    private PreparedStatement pstm=null;
    private ResultSet rs=null;
    
    public Controlador_Usuario() {
        con= new Conectar().Conexion();
    }
    
    public boolean existe(String user){
         String Query="Select * from autentificacion where user = '"+user+"'";
        try{
            pstm= con.prepareStatement(Query);
            rs=pstm.executeQuery();
            int n=0;
            while(rs.next()){
                return true;
            }
        }catch(java.sql.SQLException ex){
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
        return false;
    }
    public boolean insert (Object Datos []) {    
       String Query="insert into autentificacion (user,password,nombre,apellido,Correo,nivel)values (?,?,?,?,?,?);";
        try {
            pstm = con.prepareStatement(Query);
            
            for (int I = 0; I <= Datos.length-1; I++) {
                pstm.setObject(I+1, Datos[I]);
            }
                       
            if (pstm.executeUpdate() != 0) {
                return true;
            }
            
        } catch (java.sql.SQLException | java.awt.HeadlessException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
      return false;
    }
    public boolean update (Object Datos []) {    
       String Query="update autentificacion set user=?, password=?, nombre=?, "
               + "apellido=?,correo=?, nivel=? where user='"+Datos[0]+"'";
        try {
            pstm = con.prepareStatement(Query);
            
            for (int I = 0; I <= Datos.length-1; I++) {
                pstm.setObject(I+1, Datos[I]);
            }
                       
            if (pstm.executeUpdate() != 0) {
                return true;
            }
            
        } catch (java.sql.SQLException | java.awt.HeadlessException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
      return false;
    }
    
    public Object[] getUsuario(String user){
    
        String Query="Select * from autentificacion where user='"+user+"'";
        try{
            pstm=con.prepareCall(Query);
            rs=pstm.executeQuery();
            Object v[]= new String[5];
            while(rs.next()){
                v[0]= rs.getString("password");
                v[1]=rs.getString("nombre");
                v[2]=rs.getString("apellido");
                v[3]=rs.getString("correo");
                v[4]=Byte.toString(rs.getByte("nivel"));
                return v;
            }
          
        }catch(java.sql.SQLException ex){
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
        return null;
    }
     public String mailExist(String mail){
         String Query="Select * from autentificacion where Correo = '"+mail+"'";
        try{
            pstm= con.prepareStatement(Query);
            rs=pstm.executeQuery();
            int n=0;
            while(rs.next()){
                return rs.getString("user");
            }
        }catch(java.sql.SQLException ex){
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
        return null;
    }
}
