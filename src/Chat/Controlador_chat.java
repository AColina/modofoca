package Chat;

import Controladores.Controlador_Principal;
import javax.swing.JTextArea;
import usuarios.Controlador_Usuario;

/**
 *
 * @author Angel Colina
 */
public class Controlador_chat {

    private final String usuario;
    private JTextArea cuerpo;
    private String nombre;
    private javax.swing.JScrollPane scroll;
    private String estado;

    /**
     *
     * @param usuario
     */
    public Controlador_chat(String usuario) {
        this.usuario = usuario;
        this.estado = "Conectado";
        load();       
    }

    private void load() {
        Object uax[] = new Controlador_Usuario().getUsuario(usuario);
        nombre = (uax[1].toString() + " " + uax[2].toString());
    }

    public void loadEstado() {
        Principal.nombre.setText(nombre + " - " + estado);
    }

    void enviar(String mensaje) {
        cuerpo.append("Yo:\n" + mensaje + "\n\n");
        mensaje = "chat - private - " + Controlador_Principal.getUser() + " - " + usuario + " - " + mensaje;
        scroll.getVerticalScrollBar().setValue(scroll.getVerticalScrollBar().getValue() + 100);
        conexiones.Controlador_Conexion.enviarDatos(mensaje);
    }

    void recibir(String mensaje) {
        cuerpo.append(nombre + ":\n" + mensaje + "\n\n");
        scroll.getVerticalScrollBar().setValue(scroll.getVerticalScrollBar().getValue() + 100);
    }

    String getUsuario() {
        return usuario;
    }

    String getNombre() {
        return nombre;
    }

    void setScroll(javax.swing.JScrollPane jScrollPane) {
        this.scroll = jScrollPane;
    }

    void setCuerpo(JTextArea cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    void exit(index salir) {
        Controlador_listaChat.getListaChat().removerChat(salir);
    }
}
