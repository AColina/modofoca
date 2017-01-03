package Controladores;

import Clases.Registro;
import Clases.Utilidades;
import Vistas.Cargar;
import explorador.Copiar;
import java.io.File;

/**
 *
 * @author Angel Colina
 */
public class Controlador_Cargar {

    private File salida;
    private File entrada;
    private final Cargar c;
    private final Registro reg;

    public Controlador_Cargar(Cargar c) {
        this.c = c;
        this.slt = new javax.swing.JFileChooser();
        this.slt.setApproveButtonText("Cargar");
        reg = new Registro();
    }

    public void ejecutar(String Programa) {
        this.slt.setFileSelectionMode(2);
        javax.swing.filechooser.FileFilter filtro = new javax.swing.filechooser.FileNameExtensionFilter("Comprimido", "rar", "zip", "7z");
        this.slt.removeChoosableFileFilter(this.slt.getAcceptAllFileFilter());
        this.slt.addChoosableFileFilter(filtro);

        int opc = this.slt.showOpenDialog(this.c);
        if ((opc == 0) && (this.slt.getSelectedFile().exists())) {

            this.entrada = this.slt.getSelectedFile();
            this.salida = new File(Controlador_Principal.getRuta() + Programa);
            reg.Actividad("Cargar", salida.toString() + "\\" + this.entrada.getName());
            if (this.entrada.exists() && (this.entrada.getName().endsWith(".rar") || this.entrada.getName().endsWith(".zip")
                    || this.entrada.getName().endsWith(".7z") || this.entrada.getName().endsWith(".tgz")
                    || this.entrada.getName().endsWith(".7-zip") || this.entrada.getName().endsWith(".tar"))
                    && this.entrada.isFile()) {
                String aux[] = {entrada.getAbsolutePath()};
                javax.swing.JDialog copy = new javax.swing.JDialog();
                Copiar cop = new Copiar(copy);
                copy.setTitle("Copiando...");
//                cop.setCopy(aux, salida.toString(),new String[]{salida.toString().substring(salida.toString().lastIndexOf("\\"))});
                cop.setCopy(aux, salida.toString());
                copy.add(cop);
                copy.pack();
                copy.repaint();
                copy.validate();
                copy.setVisible(true);
            } else {
                javax.swing.JOptionPane.showMessageDialog(Cargar.jDesktopPane1, "Recuerda que tiene que ser un archivo comprimido");
            }
        }
    }

    public void ejecutar_Vagedad(String Video) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Utilidades.writeException(ex);
        }
        this.slt.setFileSelectionMode(1);
        this.slt.removeChoosableFileFilter(this.slt.getAcceptAllFileFilter());

        int opc = this.slt.showOpenDialog(this.c);
        if ((opc == 0) && (this.slt.getSelectedFile().exists()) && (this.slt.getSelectedFile().isDirectory())) {

            this.entrada = this.slt.getSelectedFile();
            this.salida = new File(Controlador_Principal.getRuta() + Video);
            reg.Actividad("Cargar", salida.toString() + "\\" + this.entrada.getName());
//          if (this.salida.mkdir() == true) {
            String aux[] = {entrada.getAbsolutePath()};
            javax.swing.JDialog copy = new javax.swing.JDialog();
            Copiar cop = new Copiar(copy);
            copy.setTitle("Copiando...");
            cop.setCopy(aux, salida.toString());
            copy.add(cop);
            copy.pack();
            copy.repaint();
            copy.validate();
            copy.setVisible(true);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Utilidades.writeException(ex);
            }
//          }
        }
    }
    private final javax.swing.JFileChooser slt;
}
