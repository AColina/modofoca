package explorador;

import Clases.Utilidades;


/**
 *
 * @author Angel Colina
 */
public class th extends Thread{
    
    private final Copiar copy;
    private boolean active;
    private int n_archivos;
    private final Object Arch[];
    private final String Destino;
    private final java.nio.file.CopyOption[] cop;
    private Object folder[]=null;
    
    th(Copiar copy,Object []Archivos,java.nio.file.CopyOption[] cop, String Destino,Object folder[]){
        this.copy=copy;
        active=false;
        n_archivos=0;
        Arch=Archivos;
        this.folder=folder;
        this.cop=cop;        
        this.Destino=Destino;
    }
//     th(Copiar copy,Object []Archivos,java.nio.file.CopyOption[] cop, String Destino){
//        this.copy=copy;
//        active=false;
//        n_archivos=0;
//        Arch=Archivos;
//        this.cop=cop;
//        this.Destino=Destino;
//    }
    public void preparar(){
    //super.start();
    }
    @Override
    public void start(){
        this.active=true;
        super.start();
        
    }
    public int getSelectFile(){
        return n_archivos;
    }
    public void parar(){
    this.active=false;
    copy.cerrar();
        try {
            super.finalize();
        } catch (Throwable ex) {
        }
    }
    public boolean isRuning(){
    return active;
    }
    @Override
    public void run(){
        while(active==true){
        
            try {
                if((new java.io.File(Arch[n_archivos].toString()).isDirectory())==false){
                    copy.setLabel(new java.io.File(Arch[n_archivos].toString()).getName());
                }
                String destino;
                
                //ruta del archivo que se desea copiar
                String archivo=Arch[n_archivos].toString().substring(Arch[n_archivos].toString().indexOf(folder[n_archivos].toString()));
                destino=Destino+archivo;
                java.nio.file.Files.copy(java.nio.file.Paths.get(Arch[n_archivos].toString()), java.nio.file.Paths.get(destino), cop);                
          
            } catch (java.io.IOException |java.lang.StringIndexOutOfBoundsException ex) {
                Utilidades.MsjE("El archivo "+Arch[n_archivos].toString()+" no pudo ser copiado");
                Utilidades.writeException(ex);
            } catch(java.lang.ArrayIndexOutOfBoundsException ex){
                 Utilidades.MsjE("El archivo no pudo ser copiado");
            }
            n_archivos++;
            copy.setvalue(n_archivos);
            if(n_archivos>=Arch.length) parar();
        }
    }
}
