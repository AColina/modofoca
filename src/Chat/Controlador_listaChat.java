package Chat;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Angel Colina
 */
public class Controlador_listaChat {
    
    private String[] usuarios=null;
    private final ArrayList<index> user;
    private static Controlador_listaChat clc=null;
    private JList Lista=null;
    private DefaultListModel model=null;
    private int select;
    
    public Controlador_listaChat() {
        user = new ArrayList<>();
    }
    
    void abrir_chat(int select){
        if(this.select == select){
            if(chat_exists(usuarios[select])==null)
             user.add(new index( usuarios[select]));
        }else{
            this.select=select;
        }
    }
    void setList(JList lista){
        this.Lista=lista;
        model= new DefaultListModel();
    }
    void load(){
        if(usuarios !=null){
            model.clear();
            for (String string : usuarios) {
                model.addElement(string);
            }
            Lista.setModel(model);
        }
    }
    private void recibir(String [] mensaje){
       index usuario=chat_exists(mensaje[0]);
        
        if(usuario != null){
            usuario.p.cc.recibir(mensaje[1]);
        }else{
            usuario=new index(mensaje[0]);
            user.add(usuario);
            usuario.p.cc.recibir(mensaje[1]);
        }
    }
    private index chat_exists(String user){    
        for (index usuario : this.user) {
            if(usuario.p.cc.getUsuario().equals(user)){
                return usuario;             
            }
        }
        return null;
    }
    void removerChat(index salir){
        user.remove(salir);
    }
    public static Controlador_listaChat getListaChat(){
        if(clc==null){
            clc=new Controlador_listaChat();           
        }
        return clc;
    }
    public void procesarMensaje(String mensaje){
        String a[]= mensaje.split("-");
        if(a[1].trim().equalsIgnoreCase("users")){
            this.usuarios= new String[a.length-2];
            for (int i = 2; i < a.length; i++) {
                usuarios[i-2]=a[i].trim();
            }            
        }else
        if(a[1].trim().equalsIgnoreCase("private")){
             recibir(new String[]{a[2].trim(),a[4].trim()});
         }
    }
    
}
