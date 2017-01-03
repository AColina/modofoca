package Clases;

import Controladores.Controlador_Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import login.Conectar;

/**
 *
 * @author Angel Colina
 */
public class Registro {
    private final Conectar con;
    private PreparedStatement pstm;
    private ResultSet rs;
            
    public Registro() {
        con= new Conectar();
    }
    
    public void ingreso(String user){
        Date fecha= new Date();
        String Query="Select count(*) from registro_ingreso where user = '"+user+"'";
        try{
            pstm= con.Conexion().prepareStatement(Query);
            rs=pstm.executeQuery();
            int n=0;
            while(rs.next()){
                n=rs.getInt(1);
            }
            Query="insert into registro_ingreso values('"+user+(n+1)+"','"+Utilidades.DateToString(fecha)+"','"+Utilidades.HoraToString(fecha)+"','"+user+"')";
            pstm= con.Conexion().prepareStatement(Query);
            pstm.executeUpdate();
        }catch(java.sql.SQLException ex){
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
    }
    
     public void Actividad(String actividad,String Archivo){
        Date fecha= new Date();
        try{
            String Query="insert into registro_actividad(Archivo,dia,hora,autentificacion_user,actividades_num) "
            + "values('"+Archivo.replace("\\", "\\\\")+"','"+Utilidades.DateToString(fecha)+"','"+Utilidades.HoraToString(fecha)+"','"+Controlador_Principal.getUser()+"',"+getidActividad(actividad)+")";


            pstm= con.Conexion().prepareStatement(Query);
            pstm.executeUpdate();
        }catch(java.sql.SQLException ex){
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
    }
    private int getidActividad(String actividad){
        String Query="Select * from actividades where actividad = '"+actividad+"'";
        try{
            pstm= con.Conexion().prepareStatement(Query);
            rs=pstm.executeQuery();
            while(rs.next()){
              return  rs.getInt(1);
            }
        }catch(java.sql.SQLException ex){
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
        return -1;
     }
    private void drop(String archivo){
        String Query;
        String aux=archivo.replace("\\", "\\\\");
        Query="delete from registro_actividad where Archivo='"+aux+"'";
        System.out.println(Query);
        try {
            pstm= con.Conexion().prepareStatement(Query);
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Utilidades.writeException(ex);
        }
        
    }
    public boolean delete(java.io.File file){
        int opc=JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar el archivo seleccionado");
        if(opc==0){
            drop(file.toString());
            Actividad("Eliminar",file.toString());
            if(file.isFile()){
                return file.delete();
            }else{
                return Cmd.deleteFolder(file.toString());
            }
        }
        return false;
    }
    public boolean rename(String file,String nombre){
        drop(file);       
        java.io.File f1=new java.io.File(file);
        String nombre_n=file.substring(0, file.lastIndexOf("\\")+1)+nombre+file.substring(file.lastIndexOf("."));
        boolean va=f1.renameTo(new java.io.File(nombre_n));
        if(va) Actividad("Rename",nombre_n);
       return va;

    }
}
