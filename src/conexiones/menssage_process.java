package conexiones;

import Clases.Cmd;
import Controladores.Controlador_Imagenes;

/**
 *
 * @author Angel Colina
 */
public class menssage_process extends Thread {
    
    private final String mensaje;
    
    public menssage_process(String mensaje) {
        this.mensaje=mensaje;
    }
    
    @Override
    public void run(){
        String a[]= mensaje.split("-");
        if(a[0].trim().equalsIgnoreCase("reconectar")){
            new Controlador_Conexion();
        }else
        if(a[1].trim().equalsIgnoreCase("exit")){
            Cmd.logout();
            System.exit(1);
        }else
        if(a[1].trim().equalsIgnoreCase("rt")){
            Controladores.Controlador_Principal.Ruta=a[2].substring(1);
             new Controlador_Imagenes();
            new Controladores.Controlador_Principal();

        }
        
    }
}
