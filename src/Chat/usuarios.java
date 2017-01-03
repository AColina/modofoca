package Chat;

import java.awt.Dimension;

/**
 *
 * @author Angel Colina
 */
public class usuarios extends javax.swing.JPanel {
    
    private final Controlador_listaChat clc;
    private int largo=154;
    /**
     * Creates new form usuarios
     * @param ancho
     */
    public usuarios(int ancho) {      
        initComponents();        
        this.setPreferredSize(new Dimension(ancho, largo));
        clc= Controlador_listaChat.getListaChat();
        clc.setList(lista);        
        clc.load();
        this.validate();
        this.repaint();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();

        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        clc.abrir_chat(lista.getSelectedIndex());
    }//GEN-LAST:event_listaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lista;
    // End of variables declaration//GEN-END:variables

    public int getLargo() {
        return largo;
    }
}
