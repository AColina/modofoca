package Controladores;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Angel Colina
 */
public class Controlador_Imagenes {
    public final Image Icono;
    public static ImageIcon Salir;
    public static ImageIcon Salir_Enter;
    
    public static ImageIcon Pelicula;
    public static ImageIcon Pelicula_over;
    public static ImageIcon Pelicula_click;   
    
    public static ImageIcon Juego;   
    public static ImageIcon Juego_over;
    public static ImageIcon Juego_click;   

    public static ImageIcon Programas;   
    public static ImageIcon Programas_over;
    public static ImageIcon Programas_click;   
    
    public static ImageIcon Archivos;   
    public static ImageIcon Archivos_over;
    public static ImageIcon Archivos_click;   
    
    public static ImageIcon Cargar;   
    public static ImageIcon Cargar_over;
    public static ImageIcon Cargar_click;   
    
    public static ImageIcon Peticion;   
    public static ImageIcon Peticion_over;
    public static ImageIcon Peticion_click;   
    
    public static ImageIcon Camara_over;
    public static ImageIcon Camara_click;   
    
    public static ImageIcon Serie_over;
    public static ImageIcon Serie_click;   

    public Controlador_Imagenes() {
        System.out.println(Controlador_Principal.getRuta()+"Img/exit.png");
        Icono= new ImageIcon(getClass().getResource("/Img/icono.png")).getImage();
        Salir=new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"Img/exit.png");
        Salir_Enter= new ImageIcon(Controlador_Principal.getRuta()+"Img/exittriste.png");  
        
        Pelicula= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon1_normal.png");   
        Pelicula_over= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon1_over.png");   
        Pelicula_click= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon1_clicked.png");   
        
        Juego= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon2_normal.png");   
        Juego_over= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon2_over.png");   
        Juego_click= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon2_clicked.png");   

        Programas= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon3_normal.png");   
        Programas_over= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon3_over.png");   
        Programas_click= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon3_clicked.png");   
        
        Archivos= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon4_normal.png");   
        Archivos_over= new ImageIcon(Controlador_Principal.getRuta()+"/Img/spr_icon4_over.png");   
        Archivos_click= new ImageIcon(Controlador_Principal.getRuta()+"/Img/spr_icon4_clicked.png");   
        
        Cargar= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon5_normal.png");   
        Cargar_over= new ImageIcon(Controlador_Principal.getRuta()+"/Img/spr_icon5_over.png");   
        Cargar_click= new ImageIcon(Controlador_Principal.getRuta()+"/Img/spr_icon5_clicked.png");   
        
        Peticion= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon6_normal.png");   
        Peticion_over= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon6_over.png");   
        Peticion_click= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon6_clicked.png");   
        
        Camara_over= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon7_over.png");   
        Camara_click= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon7_clicked.png");   
        
        Serie_over= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon8_over.png");   
        Serie_click= new ImageIcon(Controlador_Principal.getRuta()+"Img/spr_icon8_clicked.png");   

    }
      
    
}
