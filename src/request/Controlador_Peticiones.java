package request;

import Controladores.Controlador_Principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import login.Conectar;
import Clases.Utilidades;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Angel Colina
 */
public class Controlador_Peticiones {
    
    private final Conectar con;
    private PreparedStatement pstm;
    private ResultSet rs;
    private final Peticiones p;
    
    public Controlador_Peticiones(Peticiones p) {
        this.p=p;
        con = new Conectar();
    }
    
    public javax.swing.DefaultComboBoxModel load_tipo(){
        javax.swing.DefaultComboBoxModel model = null;
        try{
            model= new DefaultComboBoxModel();
            String Query="Select * from tipo";
            pstm= con.Conexion().prepareStatement(Query);
            rs=pstm.executeQuery();
            while (rs.next()) {                
                model.addElement(rs.getString(2));
            }
            return model;
        }catch(java.sql.SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Utilidades.writeException(ex);
        }
        return null;
    }
    
    public void setTable(int selec){
        String data[][]=null;
        String col[]={"Numero","Tipo","Descripcion","Usuario"};
        try{
            String Query="Select * from peticiones ORDER BY num DESC";
            pstm= con.Conexion().prepareStatement(Query);
            rs=pstm.executeQuery();
            data= new String[0][col.length];
            while (rs.next()) {  
                
                data=Utilidades.redim(data, col.length, data.length+1);
                
                data[data.length-1][0]=Integer.toString(rs.getInt(1));
                String des=rs.getString(2);
                byte len=10;
                if(des.length()<len){
                    len=(byte)des.length();
                }
                data[data.length-1][2]=rs.getString(2).substring(0, len)+"...";
                data[data.length-1][3]=Controlador_Principal.getName(rs.getString(3));
                data[data.length-1][1]=Integer.toString(rs.getInt(4));
            }
            for (String[] data1 : data) {
                data1[1] = getTipo(Integer.parseInt(data1[1]));
            }
            p.tabla_peticiones.setModel( new DefaultTableModel(data, col){
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };
                
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }              
            });
            p.tabla_peticiones.getTableHeader().setReorderingAllowed(false);
            int []  size=new int[]{
                    50,80,100,110
                 };
            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer(); 
            Alinear.setHorizontalAlignment(SwingConstants.CENTER);
            for (int i = 0; i < p.tabla_peticiones.getColumnCount(); i++) {
                p.tabla_peticiones.getColumnModel().getColumn(i).setMinWidth(size[i]-5);
                p.tabla_peticiones.getColumnModel().getColumn(i).setPreferredWidth(size[i]);
                p.tabla_peticiones.getColumnModel().getColumn(i).setMaxWidth(size[i]+5);
                p.tabla_peticiones.getColumnModel().getColumn(i).setCellRenderer(Alinear);
            }
        }catch(java.sql.SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage()); 
           Utilidades.writeException(ex);
        }
     
    }
    public void Select(int tipo){
        try{
             
            String Query="Select count(*) from peticiones";
            pstm= con.Conexion().prepareStatement(Query);
            rs=pstm.executeQuery();
            short cant=0;
            while (rs.next()) {                
                cant=(short)rs.getInt(1);
            }
            cant=(short)(cant-tipo);
            System.out.println(cant);
            Query="Select * from peticiones where  num  = '"+cant+"'";
            pstm= con.Conexion().prepareStatement(Query);
            rs=pstm.executeQuery();
            String texto="";
            while (rs.next()) {                
                texto=rs.getString(2);
            }
            p.Descripcion.setText(texto);
        }catch(java.sql.SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage()); 
           Utilidades.writeException(ex);
        }
    }
    private String getTipo(int id){
         try{
            String Query="Select * from tipo where id = '"+id+"'";
            pstm= con.Conexion().prepareStatement(Query);
            rs=pstm.executeQuery();
            
            while (rs.next()) {                
                return rs.getString(2);
            }
        }catch(java.sql.SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage()); 
           Utilidades.writeException(ex);
        }
         return null;
    }       
    private int getTipo_Id(String tipo){
         try{
             ResultSet rss;
            String Query="Select * from tipo where nombre = '"+tipo+"'";
            pstm= con.Conexion().prepareStatement(Query);
            rss=pstm.executeQuery();
            
            while (rss.next()) {                
                return rss.getInt(1);
            }
        }catch(java.sql.SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage()); 
           Utilidades.writeException(ex);
        }
         return -1;
    }
    public boolean Nuevo(String Descriocion,String tipo){
        String Query="Insert into peticiones (descr,autentificacion_user,tipo_id) values('"+Descriocion+"','"
                +Controlador_Principal.getUser()+"',"+getTipo_Id(tipo)+")";
           try{
            pstm= con.Conexion().prepareStatement(Query);
            return pstm.execute();
            
        }catch(java.sql.SQLException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
           Utilidades.writeException(ex);
        }
           return false;
    }
    public void Añadir(){
        JDialog dialog = new JDialog();
        dialog.add(new Nuevo_Peticion(p,this,dialog));
        dialog.setModal(true);
        dialog.pack();
        dialog.setTitle("Añadir nueva peticion :");
//        dialog.setIconImage(Controlador_Principal.frame.getIconImage());
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);        
        dialog.validate();
        dialog.repaint();
    }
    
}
