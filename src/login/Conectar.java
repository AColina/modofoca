package login;

import Clases.Utilidades;


public class Conectar {
    
    
    private final String BD = "ModoFoca_Server";
//    private final String User = "root";
//    private final String Pass = "";
    
    private final String User = "angel";
    private final String Pass = "@ngel121";
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String URL = "jdbc:mysql://modofoca/"+BD;
//    private final String URL = "jdbc:mysql://localhost/"+BD;
    
    java.sql.Connection con = null;
    java.sql.PreparedStatement pstm = null;
    java.sql.CallableStatement call = null;
    java.sql.ResultSet rs = null;
    
    
    public java.sql.Connection Conexion () {
        
        try {
            Class.forName(Driver);
            con = java.sql.DriverManager.getConnection(URL, User, Pass);
            
            if (con != null) {
              //  JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
            } else {
                Utilidades.MsjE("Conexion Fallida");            
            }
        } catch (ClassNotFoundException | java.sql.SQLException | java.awt.HeadlessException ex) {
            Utilidades.MsjE("Error AL Conectar con la Base de Datos");
            Utilidades.writeException(ex);
        }
        
        return con;
    } // Cierre del metodo conexion
    
} // Cierre de la clase conectar
