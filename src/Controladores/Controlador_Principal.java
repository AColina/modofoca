package Controladores;

import Clases.Cmd;
import Clases.Utilidades;
import Vistas.Index;
import usuarios.Modificar_usuario;
import Vistas.Principal;
import conexiones.Controlador_Conexion;
import java.awt.Cursor;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import login.Conectar;
import login.Login;
import org.jvnet.substance.SubstanceLookAndFeel;
import usuarios.Nuevo_usuario;
import usuarios.Perfil;

/**
 *
 * @author Angel Colina
 */
public class Controlador_Principal {

//    private static final String IpServeer="localhost";
    private static final String IpServeer = "modofoca";
    public static final int puertoProxy = 3128;
    public static String Ruta;
    private static Cursor CursorP = new Cursor(Cursor.DEFAULT_CURSOR);
    private static Cursor CursorB = new Cursor(Cursor.DEFAULT_CURSOR);
    private static byte nivel;
    private static String nombre;
    private static String user;
    public static JFrame frame;

    public Controlador_Principal() {
        java.awt.Toolkit TK = java.awt.Toolkit.getDefaultToolkit();
        if (new java.io.File(Ruta + "Img\\PunteroFoca.png").exists()) {

            Image imp = new ImageIcon(Ruta + "Img\\PunteroFoca.png").getImage();
            Image imb = new ImageIcon(Ruta + "Img\\Puntero.png").getImage();

            Controlador_Principal.CursorP = TK.createCustomCursor(imp, new java.awt.Point(2, 2), javax.swing.JPanel.TOOL_TIP_TEXT_KEY);
            Controlador_Principal.CursorB = TK.createCustomCursor(imb, new java.awt.Point(2, 2), javax.swing.JPanel.TOOL_TIP_TEXT_KEY);
        }
    }

    public static void setTheme() {

        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteGlassSkin");
    }

    public void Salir() {
        try {
            Cmd.logout();
            System.exit(1);
        } catch (Exception ex) {
            Utilidades.writeException(ex);
        }

    }

    public boolean checkProxy() {
        return (Cmd.getProxy() == 1);
    }

    public boolean setCheck(boolean estado) {
        Cmd.setProxy(estado);
        return false;
    }

    public void setNivel(byte nivel, String nombre, String user) {
        Controlador_Principal.nivel = nivel;
        String aux;
        if (nivel == 0) {
            aux = " - Usuario";
        } else if (nivel == 1) {
            aux = " - Administrador";
        } else {
            aux = " - Desarrollador";
        }
        Controlador_Principal.nombre = nombre + aux;
        Controlador_Principal.user = user;
    }

    public static byte getNivel() {
        return nivel;
    }

    public static String getUser() {
        return user;
    }

    public static String getName(String user) {
        String Query = "Select nombre from autentificacion where user='" + user + "'";
        try {
            PreparedStatement pstm = new Conectar().Conexion().prepareCall(Query);
            ResultSet rs = pstm.executeQuery();
            String v[] = new String[3];
            while (rs.next()) {
                return rs.getString(1);
            }
        } catch (java.sql.SQLException ex) {
            Utilidades.MsjE(ex.getMessage());
            Utilidades.writeException(ex);
        }
        return null;
    }

    public void getPrincipal() {
        Index.Fondo.removeAll();
        Index.Fondo.add(new Principal(this));
        Principal.nombre.setText(nombre);
        Index.Fondo.updateUI();

    }

    public static String getRuta() {
        return Ruta;
    }

    public static String IpServer() {
        return IpServeer;
    }

    public static Cursor getCursorP() {
        return CursorP;
    }

    public static Cursor getCursorB() {
        return CursorB;
    }

    public void PopUp_desplegable(final javax.swing.JPanel panel, int x, int y) {
        javax.swing.JPopupMenu Pmenu = new javax.swing.JPopupMenu();
        if (getNivel() > 0) {

            javax.swing.JMenuItem nu = new javax.swing.JMenuItem("Nuevo usuario");
            nu.setIcon(new javax.swing.ImageIcon(Ruta + "/Img/contact-new.png"));
            nu.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    JDialog dialog = new JDialog();
                    dialog.add(new Nuevo_usuario(dialog));
                    dialog.pack();
                    dialog.setTitle("Nuevo usuario");
                    dialog.setModal(true);
                    dialog.setResizable(false);
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                    dialog.repaint();
                    dialog.validate();
                }
            });

            Pmenu.add(nu);

            javax.swing.JMenuItem mu = new javax.swing.JMenuItem("Modificar usuario");
            mu.setIcon(new javax.swing.ImageIcon(Ruta + "/Img/Edit-Male-User.png"));
            mu.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    JDialog dialog = new JDialog();
                    dialog.add(new Modificar_usuario(dialog));
                    dialog.pack();
                    dialog.setTitle("Modificar Usuario");
                    dialog.setModal(true);
                    dialog.setResizable(false);
                    dialog.setLocationRelativeTo(null);
                    dialog.setVisible(true);
                    dialog.repaint();
                    dialog.validate();
                }
            });
            Pmenu.add(mu);
            Pmenu.add(new javax.swing.JSeparator());
        }
        javax.swing.JMenuItem pe = new javax.swing.JMenuItem("Perfil");
        pe.setIcon(new javax.swing.ImageIcon(Ruta + "/Img/profil.png"));
        pe.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                JDialog dialog = new JDialog();
                dialog.add(new Perfil(dialog, user));
                dialog.pack();
                dialog.setTitle("Perfil");
                dialog.setModal(true);
                dialog.setResizable(false);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
                dialog.repaint();
                dialog.validate();
            }
        });

        Pmenu.add(pe);
        javax.swing.JMenuItem cs = new javax.swing.JMenuItem("Cambiar sesion");
        cs.setIcon(new javax.swing.ImageIcon(Ruta + "/Img/cerrar sesion.png"));
        cs.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                Controlador_Conexion.enviarDatos("command - cerrar");
                user = null;
                panel.removeAll();
                panel.add(new Login());
                panel.updateUI();
                panel.repaint();
            }
        });
        Pmenu.add(cs);
        Pmenu.show(panel, x, y);
    }

    public void popUpChat(final javax.swing.JPanel panel, int x, int y, int ancho) {
        Controlador_Conexion.enviarDatos("chat - users");
        javax.swing.JPopupMenu Pmenu = new javax.swing.JPopupMenu();
        Chat.usuarios us = new Chat.usuarios(ancho);
        Pmenu.add(us);
        Pmenu.show(panel, x, y - us.getLargo() - 10);
        Pmenu.pack();
    }

}
