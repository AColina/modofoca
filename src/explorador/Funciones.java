package explorador;

import Clases.Cmd;
import Clases.Registro;
import Clases.Utilidades;
import java.awt.Color;
import java.awt.Dimension;
import java.io.FilenameFilter;
import javax.swing.JDialog;

/**
 *
 * @author Angel Colina
 */
public class Funciones {
    
    private static String Ruta[];
    private static int Indicador;
    private static String idf;
    private jButton button[];
    private javax.swing.JLabel label[];
    private String Archivos[];
    private int lastClick=-1;
    private int  Select=-1;
    private int lastSelect=-1;
    private final explorer ex;
    private final JDialog dialog;
    private final String Ruta_p;
    private String my_files[]=null;
    private final Registro reg;
    private int rename=-1;
    private javax.swing.JTextField texto=null;
    
    public Funciones(explorer ex, JDialog dialog,String ruta) {
        this.ex=ex;       
        this.Ruta_p=ruta;
        this.dialog=dialog;
        reg= new Registro();
    }
    
    public void ini(){
        ex.fondo.removeAll();
        if(!Ruta[Indicador].equals("Mis Archivos")){
            java.io.File f1= new java.io.File(Ruta[Indicador]);
            ex.barra_direccion.setText(Ruta[Indicador].substring(FindnChar(Ruta[Indicador], '\\', 4)+1));
            ex.documentos.setText("     0 objetos");
            ex.peso.setText("0.0 Bytes");
            FilenameFilter filtro = new FilenameFilter() {

                  @Override
                  public boolean accept(java.io.File dir, String name) {
                      return name.endsWith(".db")==false || new java.io.File(dir+"\\"+name).isDirectory();
                  }
              };

            Archivos=f1.list(filtro);

            dialog.setTitle(Ruta[Indicador].substring(Ruta[Indicador].lastIndexOf("\\")+1)); 
        }else{
            Archivos= my_files;
            dialog.setTitle(Ruta[Indicador]); 
            ex.barra_direccion.setText(Ruta[Indicador]);
        }
        if(Archivos != null){
            
            button = new jButton[Archivos.length];
            label = new javax.swing.JLabel[Archivos.length];
            ex.documentos.setText("     "+Archivos.length+" objetos");
            
            //calculo de peso y asignacion de ruta
            double ac=0;
            for (int i = 0; i < Archivos.length; i++) {
                if(!Ruta[Indicador].equals("Mis Archivos")){
                    Archivos[i]=Ruta[Indicador]+"\\"+Archivos[i];
                }
                try {
                    if(!new java.io.File(Archivos[i]).isDirectory()){
                        ac+= java.nio.file.Files.size(java.nio.file.Paths.get(Archivos[i]));
                    }
                } catch (java.io.IOException z) {
                    Utilidades.writeException(z);
                }
            }
            if(ac<1024) {
                ex.peso.setText("     "+Double.toString(ac)+"  Bytes");
            }else
            if(ac>=1024 && ac<(Math.pow(1024, 2))){
                ex.peso.setText("     "+Double.toString(Math.rint((ac/1024)*100)/100)+"  KB");
            }else
            if(ac>=(Math.pow(1024, 2)) && ac<(Math.pow(1024, 3))){
                ex.peso.setText("     "+Double.toString(Math.rint((ac/(Math.pow(1024, 2)))*100)/100)+"  MB");
            }else
            if(ac>=(Math.pow(1024, 3)) && ac<(Math.pow(1024, 4))){
                ex.peso.setText("     "+Double.toString(Math.rint((ac/(Math.pow(1024, 3)))*100)/100)+"  GB");
            }
            this.Archivos=ordenar(Archivos);
            int ancho=48,alto=48; int x=25,y=10;
            
            for ( int i = 0; i < Archivos.length; i++) {
                button[i]= new jButton(x, y, ancho, alto);
                String af=Archivos[i].substring(Archivos[i].lastIndexOf("\\")+1);
                label[i]=new javax.swing.JLabel();
                if(new java.io.File(Archivos[i]).isFile()) {
                   try{
                    af=af.substring(0, af.lastIndexOf("."));
                   }catch(java.lang.StringIndexOutOfBoundsException z){}
                }
                label[i].setText("<html> <p align =\"center\" >"+af+"</p></html>");
                label[i].setSize((ancho*2)-4, 30);
                label[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                label[i].setVerticalAlignment(javax.swing.SwingConstants.TOP);
                label[i].setLocation(x-24, y+50);
                label[i].setForeground(Color.black);
                button[i].setToolTipText(Archivos[i]);
                if(i+1 < Archivos.length){
                    if(x+170 > 913){
                        y+=90; x=25;
                    }else{
                        x+=100;
                    }
                }
                ex.fondo.add(button[i]);
                ex.fondo.add(label[i]);
                buttonProperties(i);
                final int aux=i;
                 button[i].addMouseListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mousePressed(java.awt.event.MouseEvent evt ) {   
                         renombrar();
                        if(evt.getButton()==3) {
                            lastClick=-1;
                            PopUp_desplegable(evt ,aux);
                        }
                        ButtonActionPerformed(aux); 
                        }
                    });
                    button[i].addKeyListener(new java.awt.event.KeyAdapter(){
                        @Override
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        ButtonKeyPressed(evt,aux);
                    }
                });
            }
            
            if (y>434) {
               ex.Scroll.setPreferredSize(new java.awt.Dimension(908, 444));
               ex.fondo.setPreferredSize(new java.awt.Dimension(902 ,y+80));
            }else{
                ex.fondo.setPreferredSize(new java.awt.Dimension(902, 434));
            }
           
        }
         if (Indicador>0) {
                ex.atras.setEnabled(true);
            }else{
                ex.atras.setEnabled(false);
            }
            if (Indicador < Ruta.length-1) {
                ex.adelante.setEnabled(true);
            }else{
                ex.adelante.setEnabled(false);
            }
    }
    public void atras(){
        if(Indicador>0){
            Indicador--;
            setRuta(Ruta[Indicador]);
        }
    }
    public void adelante(){
        if(Indicador+1< Ruta.length){
            Indicador++;
            setRuta(Ruta[Indicador]);
        }
    }
    public void actualizar(){
        setRuta(Ruta[Indicador]);
    }
    private void ButtonActionPerformed(int index) {       
        if(lastClick== index){
            lastClick=-1;
            Goto(index);
        }else {
            lastSelect=Select;
            Select=index; 
            setSelect(); 
            lastClick=index;
        }
    }
    private void buttonProperties(int index){
        
        java.awt.Image img;
        String extension;
        if(new java.io.File(Archivos[index]).isDirectory()){
            img = new javax.swing.ImageIcon(Ruta_p+"/Img/folder_close.png").getImage();            
        }else{
            
            extension =Archivos[index].substring(Archivos[index].lastIndexOf(".")+1).toLowerCase();
            
            if(extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("gif")){
                img = new javax.swing.ImageIcon(Archivos[index]).getImage().getScaledInstance(32, 32, 1);

                
            }else
            if("mkv".equals(extension) ||"mp4".equals(extension) || "avi".equals(extension) || "wma".equals(extension) ||"mov".equals(extension)){
               img = new javax.swing.ImageIcon(Ruta_p+"/Img/vlc-48.png").getImage();

               
            }else
            if(extension.equalsIgnoreCase("txt") || extension.equalsIgnoreCase("log")){
               img = new javax.swing.ImageIcon(Ruta_p+"/Img/texto.png").getImage();
             
            }else
                if(extension.equalsIgnoreCase("rar") || extension.equalsIgnoreCase("zip") || extension.equalsIgnoreCase("7zip")||extension.equalsIgnoreCase("cab")){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/rar.png").getImage();
            }else
                if(extension.equalsIgnoreCase("docx") ){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/docx_win.png").getImage();
            }else
                if(extension.equalsIgnoreCase("bmp") ){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/bmp.png").getImage();
            }else
                if(extension.equalsIgnoreCase("bat") ){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/bat-32.png").getImage();
            }else
                if(extension.equalsIgnoreCase("iso") ){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/file_iso.png").getImage();
                         
            }else
                if(extension.equalsIgnoreCase("exe")){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/exe.png").getImage();

                
            }else
                 if(extension.equalsIgnoreCase("pdf")){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/pdf.png").getImage();

                
            }else
            if(extension.equalsIgnoreCase("vbs")){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/skd.png").getImage();

                
            }else
            if(extension.equalsIgnoreCase("xml")){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/xml.png").getImage();

                
            }else
            if(extension.equalsIgnoreCase("dll")){
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/dll.png").getImage();
                
            }else{
                img = new javax.swing.ImageIcon(Ruta_p+"/Img/nothing.png").getImage();
            }

        }

        button[index].setIcon(new javax.swing.ImageIcon(img));      
        
    }
    private void ButtonKeyPressed(java.awt.event.KeyEvent evt,int index){
      lastClick=-1;
        
        if (Character.isLetter(evt.getKeyChar()) || Character.isDigit(evt.getKeyChar())) {
            boolean repeat=true;
            int selector=Select;
            if(Select+1>=button.length) {
                selector=-1;
            }
            for (int i = selector+1; i < button.length; i++) {
               if(label[i].getText().replaceAll("<html> <p align =\"center\" >", "").toLowerCase().charAt(0) == (""+evt.getKeyChar()).toLowerCase().charAt(0)){
                    lastSelect=Select;
                    Select=i;
                    repeat=false;
                    ex.Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                    break;
                }
                if (repeat==true && i >=button.length-1) {
                    i=-1;
                    repeat=false;
                }
            }
        }else{
            switch(evt.getKeyCode()){
                //atras
                case 8:   
                    if(Indicador>0){
                        Indicador--;
                        setRuta(Ruta[Indicador]);
                        Select=0;
                        button[Select].requestFocus(true);
                    }
                break;
                //enter
                case 10: 
                         if( new java.io.File(Archivos[Select]).isDirectory()){
                            lastSelect =-1; 
                            Goto(Select);
                            Select=0; 
                            try{
                                button[Select].requestFocus(true);
                            }catch(Exception z){
                                Utilidades.writeException(z);
                                Select=-1;
                            }
                         }else{
                             System.out.println("ejecutar");
                             Ejecutar(Archivos[Select]);
                         }
                         break;
                //inicio
                case 35: lastSelect=Select; 
                         Select= button.length-1; 
                         ex.Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                         break;
                //fin
                case 36: lastSelect=Select; 
                         Select=0; 
                         ex.Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                         break;
                //izquierda
                case 37: 
                    if(Select>0){
                        lastSelect=Select; 
                        Select--; 
                        }
                    break;
                //arriba
                case 38: if(Select-9 >-1){
                        lastSelect=Select; 
                        Select-=9;
//                        Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                        ex.Scroll.getVerticalScrollBar().setValue(ex.Scroll.getVerticalScrollBar().getValue()-80);
                    }break;
                //derecha
                case 39: 
                    if(Select+1< button.length){
                        lastSelect=Select; 
                        Select++; 
                    } break;
                //abajo
                case 40: 
                    if(Select+9 < button.length){
                        lastSelect=Select; 
                        Select+=9;
                       // Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                        ex.Scroll.getVerticalScrollBar().setValue(ex.Scroll.getVerticalScrollBar().getValue()+80);
                    }else{ 
                        lastSelect=Select; 
                        Select = button.length-1;
//                        Scroll.getVerticalScrollBar().setValue(button[Select].getY());
                        ex.Scroll.getVerticalScrollBar().setValue(ex.Scroll.getVerticalScrollBar().getValue()+80);
                    }break; 
            }
        }
        setSelect();
        
        
    }
    public void buscar(){
        if(new java.io.File(idf+ex.barra_direccion.getText()).exists()){
            redim(idf+ex.barra_direccion.getText());
            setRuta(idf+ex.barra_direccion.getText());
        }else{
            javax.swing.JOptionPane.showMessageDialog(null, "El directorio no existe\n"+idf+ex.barra_direccion.getText(),"Error",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    public void copiar(){
        ex.Chooser.removeChoosableFileFilter(ex.Chooser.getFileFilter());
        
        ex.Chooser.setSelectedFile(new java.io.File(Ruta[Indicador].substring(Ruta[Indicador].lastIndexOf("\\")+1)));
        

        int opc=ex.Chooser.showSaveDialog(ex);
        if(opc== 0){//aceptar
            if(!ex.Chooser.getSelectedFile().exists()){
                if(ex.Chooser.getSelectedFile().mkdir()==true){
                   String Fichero[]= new String[] {ex.Chooser.getSelectedFile().toString().substring(ex.Chooser.getSelectedFile().toString().lastIndexOf("\\"))}; 
                    javax.swing.JDialog copy= new javax.swing.JDialog();
                    Copiar cop=new Copiar(copy);
                    copy.setTitle("Copiando...");
//                    cop.setCopy(Archivos, ex.Chooser.getSelectedFile().toString(),Fichero);
                    cop.setCopy(Archivos, ex.Chooser.getSelectedFile().toString());
                    copy.add(cop);
                    copy.pack();
                    copy.repaint();
                    copy.validate();
                    copy.setVisible(true);

                }
            }
            else {
                javax.swing.JOptionPane.showMessageDialog(null, "YA existe un archivo con ese nombre", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }  
        }
    }
    private void Ejecutar(String ruta){
       String extension =ruta.substring(ruta.lastIndexOf(".")+1).toLowerCase();
            
        if(extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("gif")){
            Cmd.visor(ruta);
        }else
        if("mkv".equals(extension) ||"mp4".equals(extension) || "avi".equals(extension) || "wma".equals(extension) ||"mov".equals(extension)){
          Cmd.vlc(ruta);

        }else
        if(extension.equalsIgnoreCase("rar") || extension.equalsIgnoreCase("zip") || extension.equalsIgnoreCase("7zip")||extension.equalsIgnoreCase("cab")){
            Cmd.rar(ruta);
        }else{
            Cmd.otros(ruta);
        }
    }
    private static int FindnChar(String str,char chr,int rep){
        int ct=0; 
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == chr){
                ct++;
                if(ct==rep){
                    return i;
                }
            }
        }
    return -1;
    }
    private void Goto(int index){
        if(new java.io.File(Archivos[index]).isDirectory()){
           String aux=Archivos[index];
           redim(aux);
           setRuta(aux);
           ex.Scroll.getVerticalScrollBar().setValue(0);
        }else{
            
            Ejecutar(Archivos[index]);
        }
    }
    public void lostFocus(){
        lastSelect=Select;
        Select=-1;
        lastClick=-1;
        setSelect();
    }
    private String [] ordenar(String vec[]){
        String v[]= new String[vec.length];
        String v2[]= new String[vec.length];
        short nexe=0;
        short nfolder=0;
        for (String vec1 : vec) {
            if (new java.io.File(vec1).isDirectory() == true) {
                v[nfolder] = vec1;
                nfolder++;
            } else {
                v2[nexe] = vec1;
                nexe++;
            }
        }
        
        if(nexe>0){
            System.arraycopy(v2, 0, v, nfolder, nexe);
        
        }
        return v;
    }
    private void PopUp_desplegable(java.awt.event.MouseEvent evt,final int boton){
        lastClick=-1;
        javax.swing.JSeparator sep = new javax.swing.JSeparator();
        javax.swing.JSeparator sep2 = new javax.swing.JSeparator();
        javax.swing.JPopupMenu Pmenu= new javax.swing.JPopupMenu();

        if(new java.io.File(Archivos[boton]).isDirectory()){
        javax.swing.JMenuItem a = new javax.swing.JMenuItem("Abrir");
        a.setIcon(new javax.swing.ImageIcon(Ruta_p+"/Img/folder_ico.png"));
        a.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Goto(boton);
            }
        });
        Pmenu.removeAll();
        Pmenu.add(a);
        }else{
        javax.swing.JMenuItem e = new javax.swing.JMenuItem("Ejecutar");
        e.setIcon(new javax.swing.ImageIcon(Ruta_p+"/Img/iEngrenages.png"));
        e.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                reg.Actividad("Ejecutar", Archivos[Select]);
                Ejecutar(Archivos[Select]);
            }
        });
        
        Pmenu.removeAll();
        Pmenu.add(e);
        }
        javax.swing.JMenuItem c = new javax.swing.JMenuItem("Copiar");
        c.setIcon(new javax.swing.ImageIcon(Ruta_p+"/Img/edit-copy.png"));
        c.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String aux[]={Archivos[Select]};
                reg.Actividad("Descargar", aux[0]);
                Cmd.clipboard(aux);
                        
                
            }
        });
        javax.swing.JMenuItem e = new javax.swing.JMenuItem("Eliminar");
        e.setIcon(new javax.swing.ImageIcon(Ruta_p+"/Img/editor_trash_delete_recycle_bin-16.png"));
        e.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                
                if(reg.delete(new java.io.File(Archivos[Select]))){
                    actualizar();
                }
            }
        });
        javax.swing.JMenuItem cn = new javax.swing.JMenuItem("Cambiar Nombre");
        cn.setIcon(new javax.swing.ImageIcon(Ruta_p+"/Img/textfield_rename.png"));
        
        cn.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                rename=Select;
                texto = new javax.swing.JTextField(label[rename].getText().replace("<html> <p align =\"center\" >", "").replace("</p></html>", ""));
                label[rename].setVisible(false);
                texto.setSize(new Dimension(label[rename].getWidth()+10,label[rename].getHeight()+10));
                texto.setLocation(label[rename].getLocation());
        
                
                texto.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyPressed(java.awt.event.KeyEvent evt) {
                    if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER ){
                        renombrar();
                    }
                }
            });
            ex.fondo.add(texto);
            texto.setVisible(true);
            //actualizar();
              ex.repaint();
            }
        });
        Pmenu.add(sep);
        Pmenu.add(c);
        if(Controladores.Controlador_Principal.getNivel()>0){
            Pmenu.add(sep2);
            Pmenu.add(e);
            Pmenu.add(cn);
        }
        Pmenu.show(ex.fondo, evt.getX()+button[boton].getX(), evt.getY()+button[boton].getY());
    }
    public void renombrar(){   
        if(rename != -1 && texto != null){
            reg.rename(Archivos[rename], texto.getText());
            try{
            label[rename].setText("<html> <p align =\"center\" >"+texto.getText()+"</p></html>");
            ex.fondo.remove(texto);
            label[rename].setVisible(true);
            ex.repaint();                        
            }catch(Exception z){
                Utilidades.MsjE("No se pudo cambiar el nombre del archivo");
                Utilidades.writeException(z);                
            }
            rename=-1;   
            texto=null;
            actualizar();
        }
    }
    private void redim(String nuevo_valor){
        if(!Ruta[Indicador].equalsIgnoreCase(nuevo_valor)){
            String aux[] =Ruta;
            Ruta= new String[Indicador+2];
            System.arraycopy(aux, 0, Ruta, 0, Indicador+1);
            Ruta[Indicador+1]=nuevo_valor;
            Indicador++;
        }
    }
    public void Star(String folder){
        Ruta=new String[1];
        Indicador=0;
        Ruta[Indicador]=folder;
        idf=Ruta[Indicador].substring(0, FindnChar(Ruta[Indicador], '\\', 4)+1);
        
    }
    public void Star(Object files[]){
        Ruta=new String[1];
        Indicador=0;
        Ruta[Indicador]="Mis Archivos";
        idf=Ruta[Indicador];
               
        Archivos= new String[files.length];
        for (int i = 0; i < files.length; i++) {
            Archivos[i]=files[i].toString();
        }
         my_files=Archivos;
    }
    public void setRuta(String Ruta){
        lastClick=-1;
        Select=-1;
        lastSelect=-1;
        button= null;
        label= null;
        Archivos= null;
        ini();
        ex.fondo.repaint();  
    }
    private void setSelect(){

        if(lastSelect != -1){
            button[lastSelect].setSelect(false);
            button[lastSelect].repaint();
        }
        if(Select != -1){
            button[Select].setSelect(true);
            button[Select].repaint();
        }
        ex.repaint();
    }
}
