package Clases;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Angel Colina
 */
public class Utilidades {
    
    public static String [] redim(String [] v,int longitud){
        String aux[]=v;
        v= new String[longitud];
        System.arraycopy(aux, 0, v, 0, v.length-1);
        return v;
    }
    public static String [][] redim(String [][]m,int constante,int longitud){
        String aux[][]=m;
        m= new String[longitud][constante];
        
       for (int i = 0; i < m.length-1; i++) {
            System.arraycopy(aux[i], 0, m[i], 0, constante);
            
        }
        return m;
    }
     public static Object [][] redim(Object [][]m,int constante,int longitud){
        Object aux[][]=m;
        m= new String[longitud][constante];
        
       for (int i = 0; i < m.length-1; i++) {
            System.arraycopy(aux[i], 0, m[i], 0, constante);
            
        }
        return m;
    }
    public static void MsjE(String Error){
        javax.swing.JOptionPane.showMessageDialog(null, Error,"Error",javax.swing.JOptionPane.ERROR_MESSAGE);
    
    }
    public static void Msj(String Mensaje){
        javax.swing.JOptionPane.showMessageDialog(null, Mensaje);
    
    }
    public static java.util.Date geToday(){
    java.util.Date fecha = new Date();
    return fecha;
    
    }
    public static String HoraToString (java.util.Date Hora) { 
        java.text.DateFormat Formato;
        String dateString = null;
        Formato = new java.text.SimpleDateFormat("HH:mm:ss");
        dateString = Formato.format(Hora);
        
        return dateString;
    }
    public static String DateToString (Date Fecha) {
        
        DateFormat Formato;
        String dateString = null;
        Formato = new SimpleDateFormat("yyyy-MM-dd");
        dateString = Formato.format(Fecha);
        
        return dateString;
    }

    public static Date StringtoDate (String stringDate) {
        
            DateFormat Formato = null;
            Date Fecha = null;
            Formato = new SimpleDateFormat("yyyy-MM-dd");
            
        try {
            Fecha = Formato.parse(stringDate);
            
        } catch (ParseException ex) {
            Utilidades.writeException(ex);
        }
        
         return Fecha;
    }
    public static double toMilisegundos (String hri, String hrf) {         
        int hori, mini;
        int horf, minf;
        hori=Integer.parseInt( hri.substring(0, hri.indexOf(":")));
        mini=Integer.parseInt( hri.substring(hri.indexOf(":")+1, hri.lastIndexOf(":")));
        double mili_i=((hori*3600)+(mini*60) )*1000;
        
        horf=Integer.parseInt( hrf.substring(0, hrf.indexOf(":")));
        minf=Integer.parseInt( hrf.substring(hrf.indexOf(":")+1, hrf.lastIndexOf(":")));
        
        double mili_f=((horf*3600)+(minf*60))*1000;

        return (mili_f-mili_i);
    }
    public static javax.swing.DefaultComboBoxModel Verificar_Combo(javax.swing.DefaultComboBoxModel model){
         for (int k = 0; k < 4; k++) {
            for (int i = 0; i < model.getSize(); i++) {
                for (int j = i+1; j < model.getSize(); j++) {
                    if(model.getElementAt(i).equals(model.getElementAt(j))){
                        model.removeElementAt(j);
                    }
                }
            }
         }
     return model;
    }
    public static String Cambiar_Hora(String Hora){
       String nh="";
       int h = Integer.parseInt(Hora.substring(0, Hora.indexOf(":")));
       if(h>12){
           nh=Integer.toString(h-12)+Hora.substring(Hora.indexOf(":"), Hora.lastIndexOf(":"))+ " PM";
       }else{
           nh=Integer.toString(h)+Hora.substring(Hora.indexOf(":"), Hora.lastIndexOf(":"))+ " AM";
       }
       
       return nh;
    }
    public static int getDayOfTheWeek(String date){
        Date d=StringtoDate(date);
	GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(d);
	return cal.get(Calendar.DAY_OF_WEEK);		
    }
    public static void reconecta(int seg){
        for (int i = seg; i >0 ; i--) {
            System.out.println("Reconectando al servidor en "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Utilidades.writeException(ex);
            }
        }
    }
    
    public static void writeException(Exception exception){

        try {
            java.io.File f1=new java.io.File(new java.io.File(".").getCanonicalPath()+"\\Error.log");
            if(!f1.exists()) f1.createNewFile();
            FileWriter fw = new FileWriter (f1, true);
            try (PrintWriter pw = new PrintWriter (fw)) {
                exception.printStackTrace(pw);
                pw.write("next");
                pw.flush();
            }
        }catch(java.io.IOException ex) {   
            MsjE("No se pudo escribir log de error");
        }
    }
}
