package request;

import Controladores.Controlador_Principal;
/**
 *
 * @author Angel Colina
 */
public class Peticiones extends javax.swing.JPanel {

    private final Controlador_Principal cp;
    private final Controlador_Peticiones cpe;
    
    public Peticiones(Controlador_Principal cp) {
        this.cp=cp;
        initComponents();
        this.setCursor(Controlador_Principal.getCursorP());
        this.BotonSalir.setCursor(Controlador_Principal.getCursorB());
        this.Boton_Nuevo.setCursor(Controlador_Principal.getCursorB());
        this.tabla_peticiones.setCursor(Controlador_Principal.getCursorB());
        this.cpe = new Controlador_Peticiones(this);
        actulizar();
        
    }

    public final void actulizar(){      
        cpe.setTable(1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_peticiones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        Boton_Nuevo = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(230, 230));

        tabla_peticiones.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tabla_peticiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_peticiones.setDoubleBuffered(true);
        tabla_peticiones.setColumnSelectionAllowed(false);
        tabla_peticiones.setRowSelectionAllowed(true);
        tabla_peticiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_peticionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_peticiones);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 36, 364, 417);

        Descripcion.setEditable(false);
        Descripcion.setColumns(10);
        Descripcion.setRows(5);
        jScrollPane2.setViewportView(Descripcion);
        // Para que se partan automáticamente las líneas al llegar al final
        Descripcion.setLineWrap(true);

        // Para que el partido se haga respetando las palabras. Sólo se parte la
        // línea en los espacios entre palabras.
        Descripcion.setWrapStyleWord(true);

        jDesktopPane1.add(jScrollPane2);
        jScrollPane2.setBounds(380, 36, 310, 236);

        Boton_Nuevo.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/document-new.png"));
        Boton_Nuevo.setToolTipText("Realizar una nueva peticion");
        Boton_Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Boton_NuevoMouseClicked(evt);
            }
        });
        jDesktopPane1.add(Boton_Nuevo);
        Boton_Nuevo.setBounds(420, 290, 35, 35);

        BotonSalir.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/exit.png"));
        BotonSalir.setText("exit");
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonSalirMouseExited(evt);
            }
        });
        jDesktopPane1.add(BotonSalir);
        BotonSalir.setBounds(670, 0, 30, 30);

        jLabel1.setText("Nueva peticion");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(400, 340, 80, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_peticionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_peticionesMouseClicked

        cpe.Select(tabla_peticiones.getSelectedRow());
    }//GEN-LAST:event_tabla_peticionesMouseClicked

    private void Boton_NuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Boton_NuevoMouseClicked
        cpe.Añadir();
    }//GEN-LAST:event_Boton_NuevoMouseClicked

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        cp.getPrincipal();
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void BotonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseEntered
        BotonSalir.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/exittriste.png"));
    }//GEN-LAST:event_BotonSalirMouseEntered

    private void BotonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseExited
        BotonSalir.setIcon(new javax.swing.ImageIcon(Controlador_Principal.getRuta()+"/Img/exit.png"));
    }//GEN-LAST:event_BotonSalirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JLabel Boton_Nuevo;
    public javax.swing.JTextArea Descripcion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tabla_peticiones;
    // End of variables declaration//GEN-END:variables
}
