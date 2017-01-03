package Controladores;

import java.awt.Dimension;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import Clases.Registro;
import java.sql.Connection;
import explorador.explorer;
import java.io.FilenameFilter;
import login.Conectar;

/**
 *
 * @author Angel Colina
 */

public class Controlador_Peliculas {
 
    private static File movies[];
    private static File Series[];
    private JDialog dialog=null;
    private int click=-1;
    private Registro reg;
    private Connection con;
    private final String Directorio=Controlador_Principal.getRuta();
    private int identificador;
    
    public Controlador_Peliculas() {       
        reg= new Registro();
        con= new Conectar().Conexion();
        identificador=0;
        
    }
    public DefaultTableModel setTablePeliculas(){
        
        String data[][]={};
        String col[]={"NOMBRE"};
        
        JFileChooser view = new JFileChooser();
       DefaultTableModel model = new DefaultTableModel(data, col){
                boolean[] canEdit = new boolean [] {
                    false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            };
       
            movies= new java.io.File(Directorio+"\\Peliculas").listFiles(filtro());
            if(movies != null){
                for(int i=0; i<movies.length; i++){           
                    model.addRow(new Object[]{movies[i].getName(),view.getTypeDescription(movies[i]),movies[i].getAbsoluteFile().length()});
                }
            }
            return model;
        
    }
    public DefaultTableModel setTableSeries(){
       
        String data[][]={};
        String col[]={"NOMBRE"};
        
        JFileChooser view = new JFileChooser();
       DefaultTableModel model = new DefaultTableModel(data, col){
                boolean[] canEdit = new boolean [] {
                    false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            };
        
            Series= new java.io.File(Directorio+"\\Series").listFiles(filtro());
            if(Series != null){
                for(int i=0; i<Series.length; i++){           
                    model.addRow(new Object[]{Series[i].getName(),view.getTypeDescription(Series[i]),Series[i].getAbsoluteFile().length()});
                }
            }
            return model;
        
    }
    public void ejecutar(int pos){
      if(pos==click){
          if(identificador==0){
              OpenFolder(movies[pos].getAbsolutePath());
          }else{
              OpenFolder(Series[pos].getAbsolutePath());
          }
      }else{
          click=pos;
      }
    }
    private FilenameFilter filtro(){
        FilenameFilter fil = new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
              return new java.io.File(dir+"\\"+name).isDirectory();
            }
        };
        return fil;
    }
    private void OpenFolder(String folder){
        if(dialog != null){
            dialog.dispose();
        }
        dialog = new JDialog();
        dialog.add(new explorer(dialog,folder));
        dialog.setSize(new Dimension(915, 556));
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        dialog.repaint();
        dialog.validate();
        click=-1;
    }
    
    public void setIdentificador(byte identificador){
        this.identificador=identificador;
    }
    public int getIdentificador(){
       return this.identificador;
    }
}
