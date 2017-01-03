package Vistas;

import Clases.Utilidades;
import Controladores.Controlador_Cargar;
import Controladores.Controlador_Principal;
import java.awt.Dimension;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Angel Colina
 */
public class Serie extends javax.swing.JPanel {

    /**
     * Creates new form Serie
     */
    private final JDialog dialog;
    private final Controlador_Cargar cc;
    private JList lista=null;
    private JTextField nombre=null;
    
    public Serie(JDialog dia, Controlador_Cargar cc) {
        this.dialog=dia;
        this.cc=cc;
        lista= new JList();
        nombre= new JTextField();        
        initComponents();
        fondo.setLayout(new java.awt.BorderLayout());        
        load();
        Select();
    }
    private void load(){
        
        lista.setSelectionMode(0);
        lista.setVisible(true);
        FilenameFilter filtro = new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
              return new java.io.File(dir+"\\"+name).isDirectory();
            }
        };
        java.io.File aux[]= new java.io.File(Controlador_Principal.Ruta+"\\Series").listFiles(filtro);
        javax.swing.DefaultListModel model = new DefaultListModel();
        if(aux!=  null){
            for (File file : aux) {
                model.addElement(file.getName());
            }
        }
        lista.setModel(model);
    }
    private void Select(){
          fondo.removeAll();
        if(radio_serie.isSelected()){
            fondo.setPreferredSize( new Dimension(253, 60));
            fondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Serie"));
            fondo.add(nombre);            
        }else{
            fondo.setPreferredSize( new Dimension(253, 193));
            fondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Series Disponibles"));
            fondo.add(lista);
        }
        dialog.pack();
        dialog.repaint(); 
        dialog.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        fondo = new javax.swing.JPanel();
        radio_serie = new javax.swing.JRadioButton();
        radio_capitulo = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();

        fondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Series Disponibles"));
        fondo.setName(""); // NOI18N

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        radio_serie.setSelected(true);
        radio_serie.setText("Nueva Serie");
        group.add(radio_serie);
        radio_serie.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radio_serieStateChanged(evt);
            }
        });

        radio_capitulo.setText("Nuevo Capitulo");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radio_serie)
                                .addGap(67, 67, 67)
                                .addComponent(radio_capitulo))
                            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cancelar)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_serie)
                    .addComponent(radio_capitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        group.add(radio_capitulo);
    }// </editor-fold>//GEN-END:initComponents

    private void radio_serieStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radio_serieStateChanged
         Select();
       
    }//GEN-LAST:event_radio_serieStateChanged

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed

        if(radio_serie.isSelected()){
            if(!"".equals(nombre.getText().trim())){
                if(new java.io.File(Controlador_Principal.Ruta+"Series\\"+nombre.getText()).mkdirs()){
                    cc.ejecutar_Vagedad("Series\\"+nombre.getText());
                    dialog.dispose();
                }else Utilidades.MsjE("No se puede crear un fichero con ese nombre");
            }else {
                Utilidades.MsjE("Debe escribir el nombre de la nueva serie");

            }
        }else{
            if(lista.getSelectedIndex() != -1){
                cc.ejecutar_Vagedad("Series\\"+lista.getSelectedValue().toString());
                dialog.dispose();
            }else{
                Utilidades.MsjE("Debe seleccionar un capitulo");
            }
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dialog.dispose();
    }//GEN-LAST:event_CancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JButton Cancelar;
    private javax.swing.JPanel fondo;
    private javax.swing.ButtonGroup group;
    private javax.swing.JRadioButton radio_capitulo;
    private javax.swing.JRadioButton radio_serie;
    // End of variables declaration//GEN-END:variables
}
