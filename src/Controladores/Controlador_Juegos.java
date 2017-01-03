package Controladores;

import Vistas.Juegos;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import java.io.FilenameFilter;
import Clases.Registro;
import explorador.Copiar;

/**
 *
 * @author Angel Colina
 */
public class Controlador_Juegos {

    private final File directorio = new File(Controlador_Principal.getRuta() + "Juegos");
    private File Ficheros[];
    private int click = -1;
    private Registro reg;

    public Controlador_Juegos() {
        reg = new Registro();
    }

    public void setTable() {
        String data[][] = {};
        String col[] = {"NOMBRE"};

        JFileChooser view = new JFileChooser();
        DefaultTableModel model = new DefaultTableModel(data, col) {
            boolean[] canEdit = new boolean[]{
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        FilenameFilter filtro = new FilenameFilter() {
            @Override
            public boolean accept(java.io.File dir, String name) {
                if ((name.toLowerCase().endsWith(".rar") || name.toLowerCase().endsWith(".zip")
                        || name.toLowerCase().endsWith(".tgz") || name.toLowerCase().endsWith(".7-zip")
                        || name.toLowerCase().endsWith(".7z") || name.toLowerCase().endsWith(".tar"))
                        && new java.io.File(dir + "\\" + name).isFile()) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        Ficheros = directorio.listFiles(filtro);
        for (int i = 0; i < Ficheros.length; i++) {
            model.addRow(new Object[]{Ficheros[i].getName(), view.getTypeDescription(Ficheros[i]), Ficheros[i].getAbsoluteFile().length()});
        }
        Juegos.tabla_juegos.setModel(model);

    }

    public void ejecutar() {

        int n = Juegos.tabla_juegos.getSelectedRow();
        if (n == click) {
            slt = new javax.swing.JFileChooser();
            slt.setApproveButtonText("Copiar");
            reg.Actividad("Descargar", Ficheros[n].getAbsolutePath());
//            Cmd.rar(Ficheros[n].getAbsolutePath());
            this.slt.setFileSelectionMode(1);
            this.slt.removeChoosableFileFilter(this.slt.getAcceptAllFileFilter());

            int opc = this.slt.showOpenDialog(null);
            if ((opc == 0) && (this.slt.getSelectedFile().exists() == true) && (this.slt.getSelectedFile().isDirectory())) {
                java.io.File salida = this.slt.getSelectedFile();
                if (!salida.exists() || !salida.isDirectory()) {
                    salida.mkdir();
                }
                if (salida.exists()) {
                    javax.swing.JDialog copy = new javax.swing.JDialog();
                    Copiar cop = new Copiar(copy);
                    copy.setTitle("Copiando...");
                    cop.setCopy(new String[]{Ficheros[n].getAbsolutePath()}, salida.toString());
                    copy.add(cop);
                    copy.pack();
                    copy.repaint();
                    copy.validate();
                    copy.setVisible(true);
                }
            }
            click = -1;
        } else {
            click = n;
        }

    }
    private javax.swing.JFileChooser slt;
}
