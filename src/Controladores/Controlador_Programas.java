package Controladores;

import Vistas.Programas;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import Clases.Registro;
import explorador.Copiar;

/**
 *
 * @author Angel Colina
 */
public class Controlador_Programas {

    private final File directorio = new File(Controlador_Principal.getRuta() + "Programas");
    private File Ficheros[];
    private Registro reg;
    private int click = -1;

    public Controlador_Programas() {
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
        for (File Fichero : Ficheros) {
            model.addRow(new Object[]{Fichero.getName(), view.getTypeDescription(Fichero), Fichero.getAbsoluteFile().length()});
        }
        Programas.tabla_programas.setModel(model);

    }

    public void ejecutar() {

        int n = Programas.tabla_programas.getSelectedRow();
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

