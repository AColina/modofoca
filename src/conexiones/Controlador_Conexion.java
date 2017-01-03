package conexiones;

import Chat.Controlador_listaChat;
import Clases.Utilidades;
import Controladores.Controlador_Principal;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Angel Colina
 */
public class Controlador_Conexion extends Thread{
    
    private int msjs;
    private static ObjectOutputStream salida;
    private final int puerto=2990; 
    private static java.net.Socket conexion=null;
    private java.io.ObjectInputStream entrada;
    private boolean run;
    public static String Ruta="";
    private static boolean conected;
    
    public Controlador_Conexion() {    
        msjs=0;
        run=true;
        start();        
    }
    private void PrepararSocket(){
        
        while(conexion==null){
            try{
               // System.out.println("conectando al servidor");
                conexion= new Socket(InetAddress.getByName(Controlador_Principal.IpServer()), puerto); //comunicarme con el servidor
                
            }catch(java.io.IOException ex){
                System.out.println("Error al conectar al servidor\nError:\t"+ex.getMessage());
                Utilidades.reconecta(10);
            }
        }        
        conected=true;
        System.out.println("Conexion exitosa");
        if(Controlador_Principal.getUser()!= null){
            System.out.println(Controlador_Principal.getUser());
            Controlador_Conexion.enviarDatos("command - user - reconect - "+Controlador_Principal.getUser());
        }
    }
    public String getIp(){
        return conexion.getRemoteSocketAddress().toString();
    }
    public String getHost(){
        return conexion.getInetAddress().getHostName();
    }
    public static boolean getConexion(){
        return conected;
    }
    public boolean desconectar(){
        try {
            conexion.close();
            run=false;
            conected=false;
            super.finalize();
            return true;
        } catch (java.io.IOException  ex) {
            System.out.println(ex.getMessage());
            Utilidades.writeException(ex);
        } catch (Throwable ex) {
            System.out.println("Desconectar Error:\n"+ex.getMessage());
        }
         return false;
    }
    public static void enviarDatos(String mensaje){
      try {
        salida = new ObjectOutputStream(conexion.getOutputStream());
        salida.writeObject(mensaje);
        salida.flush(); //flush salida a cliente
         //salida.close();
      } //Fin try
      catch (java.io.IOException ex){ 
          System.out.println("Enviar Datos Error:\n"+ex.getMessage());
      } //Fin catch  
      
   } //Fin metodo enviarDatos
   
    @Override
    public void run(){
        PrepararSocket();
        try {
           while(run==true){
            entrada = new java.io.ObjectInputStream(conexion.getInputStream());
            
            String mensaje = (String) entrada.readObject(); 
            if(msjs==0){
                //cp.removerElemento(getHost());
                /*
                *  validar si el usuario que se conecto existe en la db
                */
            }
            msjs++;               
            if(mensaje.startsWith("command")){
                new menssage_process(mensaje).start();
            }
            if(mensaje.startsWith("chat")){
                Controlador_listaChat.getListaChat().procesarMensaje(mensaje);
            }
        }
        } catch (java.io.IOException | ClassNotFoundException ex) {
            if("null".equalsIgnoreCase(ex.getMessage())){
                System.out.println("Servidor desconectado");
            }else{
                System.out.println("Reciviendo Mensaje Error:\n"+ex.getMessage());
                try{
                    run=false;
                    conected=false;
                    conexion=null;
                    this.finalize();  
                    msjs=0;
                    new menssage_process("reconectar").start();
                }catch(Throwable es){
                 System.out.println("Finalizando Hilo Error:\n"+ex.getMessage());
                }
            }
        }
 
    }
}
