package Controladores;

import Clases.Registro;
import Clases.Utilidades;
import Vistas.My_Files;
import explorador.Copiar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import login.Conectar;

/**
 *
 * @author Angel Colina
 */
public class Controlador_MyFiles {
    
    private final Conectar con;
    private PreparedStatement pstm;
    private ResultSet rs;
    private ArrayList<String> files;
    private final Registro reg;
    
    public Controlador_MyFiles() {
        con = new Conectar(); 
        reg= new Registro();
    }
    public void setTable(){
        Object [][]datos=null;
        String col[]={"Seleccionar","Numero","Archivo","Fecha"};
        files=new ArrayList<>();
        try{
            String Query="Select * from registro_actividad where actividades_num=1 and autentificacion_user ='"+Controlador_Principal.getUser()+"'";
            pstm= con.Conexion().prepareStatement(Query);
            rs=pstm.executeQuery();
            datos= new String[0][col.length];
            while (rs.next()) {  
                String des=rs.getString(2);
                if(new java.io.File(des).exists()){ 
                   
                    datos=Utilidades.redim(datos, col.length, datos.length+1);  
                    datos[datos.length-1][0]=null;
                    datos[datos.length-1][1]=Integer.toString(datos.length);
                    files.add(des);
                    datos[datos.length-1][2]=des.substring(des.lastIndexOf("\\")+1, des.length());
                    datos[datos.length-1][3]=rs.getString(3);
                }
            }
            My_Files.TablaMisArchivos.setModel(new javax.swing.table.DefaultTableModel(datos,col) {
                Class[] types = new Class [] {
                    java.lang.Boolean.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
                };
                boolean[] canEdit = new boolean [] {
                    true, false, false, false
                };

                @Override
                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            
            My_Files.TablaMisArchivos.getTableHeader().setReorderingAllowed(false);
            
            int []  size=new int[]{
                    60,60,200,110
                 };
            DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer(); 
            Alinear.setHorizontalAlignment(SwingConstants.CENTER);
            for (int i = 0; i < My_Files.TablaMisArchivos.getColumnCount(); i++) {
                My_Files.TablaMisArchivos.getColumnModel().getColumn(i).setMinWidth(size[i]-5);
                My_Files.TablaMisArchivos.getColumnModel().getColumn(i).setPreferredWidth(size[i]);
                My_Files.TablaMisArchivos.getColumnModel().getColumn(i).setMaxWidth(size[i]+5);
                My_Files.TablaMisArchivos.getColumnModel().getColumn(i).setWidth(size[i]);
                if(i>0)
                My_Files.TablaMisArchivos.getColumnModel().getColumn(i).setCellRenderer(Alinear);
            }

        }catch(java.sql.SQLException ex){
           Utilidades.MsjE(ex.getMessage());
           Utilidades.writeException(ex);
        }
     
    }
    public void Eliminar(){
        for (int i = 0; i < My_Files.TablaMisArchivos.getRowCount(); i++) {          
            
            if(My_Files.TablaMisArchivos.getValueAt(i, 0)!= null && Boolean.parseBoolean(My_Files.TablaMisArchivos.getValueAt(i, 0).toString())){              
                reg.delete(new java.io.File(files.get(i)));                    
            }            
        }
        setTable();
    }
    public Object[]getDatos(){
        return files.toArray();
    }
    public void copiar(){
        slt = new javax.swing.JFileChooser();
         slt.setApproveButtonText("Copiar");
        ArrayList<String> aux= new ArrayList<>();
        for (int i = 0; i < My_Files.TablaMisArchivos.getRowCount(); i++) {
            if(My_Files.TablaMisArchivos.getValueAt(i, 0)!= null && Boolean.parseBoolean(My_Files.TablaMisArchivos.getValueAt(i, 0).toString())){              
                aux.add(files.get(i));
            }            
        }
        if(aux.size()>0){
            this.slt.setFileSelectionMode(1);
            this.slt.removeChoosableFileFilter(this.slt.getAcceptAllFileFilter());

            int opc = this.slt.showOpenDialog(null);
            if ((opc == 0) && (this.slt.getSelectedFile().exists()==true) && (this.slt.getSelectedFile().isDirectory())) {
                java.io.File salida = new java.io.File(this.slt.getSelectedFile()+"\\Mis Archivos");
                if(!salida.exists() ||  !salida.isDirectory()){
                    salida.mkdir();
                }
               if(salida.exists()){
                    javax.swing.JDialog copy= new javax.swing.JDialog();
                    Copiar cop=new Copiar(copy);
                    copy.setTitle("Copiando...");
                    cop.setCopy(aux.toArray(), salida.toString());
                    copy.add(cop);
                    copy.pack();
                    copy.repaint();
                    copy.validate();
                    copy.setVisible(true);
               }
            }
        }
    }
    
    private javax.swing.JFileChooser slt;

}
