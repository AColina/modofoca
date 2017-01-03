
package explorador;

import Controladores.Controlador_Principal;

/**
 *
 * @author Angel Colina
 */
public class explorer extends javax.swing.JPanel {

    private final Funciones fun;

    
    public explorer(javax.swing.JDialog dialog,String folder) {
        initComponents();
        fun =new Funciones(this,dialog,Controlador_Principal.Ruta);
        fun.Star(folder);
        fun.ini();        
        fondo.setDoubleBuffered(true);
        dialog.setIconImage(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"Img/folder.png").getImage());
    }
    
    public explorer(javax.swing.JDialog dialog,Object files[]) {
        initComponents();
        fun =new Funciones(this,dialog,Controlador_Principal.Ruta);
        fun.Star(files);
        fun.ini();        
        fondo.setDoubleBuffered(true);
        dialog.setIconImage(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"Img/folder.png").getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Chooser = new javax.swing.JFileChooser();
        Barra_es = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        Copiar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JSeparator jSeparator3 = new javax.swing.JSeparator();
        javax.swing.JSeparator jSeparator4 = new javax.swing.JSeparator();
        Barra_d = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        barra_direccion = new TextField(new java.awt.Dimension(100,20));
        ir = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
        Scroll = new javax.swing.JScrollPane();
        fondo = new javax.swing.JPanel();
        Barra_e = new javax.swing.JPanel();
        documentos = new javax.swing.JLabel();
        peso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        Chooser.setAcceptAllFileFilterUsed(false);
        Chooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        Chooser.setApproveButtonText("Copiar");
        Chooser.setApproveButtonToolTipText("Copiar archivos a la carpeta selecionada");
        Chooser.setDialogTitle("Copiar a:");
        Chooser.setAutoscrolls(true);
        Chooser.setDoubleBuffered(true);
        Chooser.setDragEnabled(true);
        Chooser.setEnabled(false);

        setMaximumSize(new java.awt.Dimension(32767, 556));

        atras.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"Img/back.png"));
        atras.setToolTipText("Atras");
        atras.setEnabled(false);
        atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasMouseExited(evt);
            }
        });
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        atras.setFocusPainted(false);
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);/**/

        adelante.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"Img/next.png"));
        adelante.setToolTipText("Adelante");
        adelante.setEnabled(false);
        adelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adelanteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adelanteMouseExited(evt);
            }
        });
        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });
        adelante.setFocusPainted(false);
        adelante.setBorderPainted(false);
        adelante.setContentAreaFilled(false);/**/

        Copiar.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"Img/copy.png"));
        Copiar.setToolTipText("Copiar carpeta");
        Copiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CopiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CopiarMouseExited(evt);
            }
        });
        Copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarActionPerformed(evt);
            }
        });
        Copiar.setFocusPainted(false);
        Copiar.setBorderPainted(false);
        Copiar.setContentAreaFilled(false);/**/

        actualizar.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"Img/view-refresh-32.png"));
        actualizar.setToolTipText("Actualizar");
        actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarMouseExited(evt);
            }
        });
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        actualizar.setFocusPainted(false);
        actualizar.setBorderPainted(false);
        actualizar.setContentAreaFilled(false);/**/

        jSeparator1.setAlignmentX(0.0F);
        jSeparator1.setAlignmentY(0.0F);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout Barra_esLayout = new javax.swing.GroupLayout(Barra_es);
        Barra_es.setLayout(Barra_esLayout);
        Barra_esLayout.setHorizontalGroup(
            Barra_esLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_esLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addComponent(jSeparator1)
        );
        Barra_esLayout.setVerticalGroup(
            Barra_esLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_esLayout.createSequentialGroup()
                .addGroup(Barra_esLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adelante, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Copiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Direccion :");

        barra_direccion.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"Img/folder_ico.ico")); // NOI18N
        barra_direccion.setEditable(false);
        barra_direccion.setBackground(new java.awt.Color(255, 255, 255));
        barra_direccion.setFocusable(false);
        barra_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                barra_direccionKeyPressed(evt);
            }
        });

        ir.setIcon(new javax.swing.ImageIcon(Controlador_Principal.Ruta+"Img/go.png"));
        ir.setText("ir");
        ir.setToolTipText("Ir a :");
        ir.setEnabled(false);
        ir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        ir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                irMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                irMouseExited(evt);
            }
        });
        ir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irActionPerformed(evt);
            }
        });
        ir.setFocusPainted(false);
        ir.setBorderPainted(false);
        ir.setContentAreaFilled(false);/**/

        jSeparator2.setAlignmentX(0.0F);
        jSeparator2.setAlignmentY(0.0F);

        javax.swing.GroupLayout Barra_dLayout = new javax.swing.GroupLayout(Barra_d);
        Barra_d.setLayout(Barra_dLayout);
        Barra_dLayout.setHorizontalGroup(
            Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Barra_dLayout.createSequentialGroup()
                .addGroup(Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addGroup(Barra_dLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(barra_direccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2))
        );
        Barra_dLayout.setVerticalGroup(
            Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_dLayout.createSequentialGroup()
                .addGroup(Barra_dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barra_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ir, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        Scroll.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Scroll.setDoubleBuffered(true);
        Scroll.setFocusable(false);
        Scroll.setMaximumSize(new java.awt.Dimension(905, 476));
        Scroll.setWheelScrollingEnabled(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setFocusable(false);
        fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fondoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        Scroll.setViewportView(fondo);

        Barra_e.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        documentos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        peso.setToolTipText("");
        peso.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout Barra_eLayout = new javax.swing.GroupLayout(Barra_e);
        Barra_e.setLayout(Barra_eLayout);
        Barra_eLayout.setHorizontalGroup(
            Barra_eLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Barra_eLayout.createSequentialGroup()
                .addComponent(documentos, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Barra_eLayout.setVerticalGroup(
            Barra_eLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(documentos, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
            .addComponent(peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Barra_es, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Barra_d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Barra_e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Barra_es, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Barra_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Barra_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
  
    private void atrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseEntered
        atras.setFocusPainted(true);
        atras.setBorderPainted(true);
        atras.setContentAreaFilled(true);/**/
    }//GEN-LAST:event_atrasMouseEntered

    private void atrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasMouseExited
        atras.setFocusPainted(false);
        atras.setBorderPainted(false);
        atras.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_atrasMouseExited

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // Atras
        fun.atras();
    }//GEN-LAST:event_atrasActionPerformed

    private void adelanteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adelanteMouseEntered
        adelante.setFocusPainted(true);
        adelante.setBorderPainted(true);
        adelante.setContentAreaFilled(true);/**/
    }//GEN-LAST:event_adelanteMouseEntered

    private void adelanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adelanteMouseExited
        adelante.setFocusPainted(false);
        adelante.setBorderPainted(false);
        adelante.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_adelanteMouseExited

    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteActionPerformed
        fun.adelante();
    }//GEN-LAST:event_adelanteActionPerformed

    private void CopiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CopiarMouseEntered
        Copiar.setFocusPainted(true);
        Copiar.setBorderPainted(true);
        Copiar.setContentAreaFilled(true);/**/
    }//GEN-LAST:event_CopiarMouseEntered

    private void CopiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CopiarMouseExited
        Copiar.setFocusPainted(false);
        Copiar.setBorderPainted(false);
        Copiar.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_CopiarMouseExited

    private void CopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarActionPerformed
        fun.copiar();
    }//GEN-LAST:event_CopiarActionPerformed

    private void actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseEntered
        actualizar.setFocusPainted(true);
        actualizar.setBorderPainted(true);
        actualizar.setContentAreaFilled(true);/**/

    }//GEN-LAST:event_actualizarMouseEntered

    private void actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarMouseExited
        actualizar.setFocusPainted(false);
        actualizar.setBorderPainted(false);
        actualizar.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_actualizarMouseExited

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        // actualizar
       fun.actualizar();
    }//GEN-LAST:event_actualizarActionPerformed

    private void barra_direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barra_direccionKeyPressed
        // ir con enter
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            fun.buscar();
            fondo.setFocusCycleRoot(true);
        }
    }//GEN-LAST:event_barra_direccionKeyPressed

    private void irMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irMouseEntered
        ir.setFocusPainted(true);
        ir.setBorderPainted(true);
        ir.setContentAreaFilled(true);/**/
    }//GEN-LAST:event_irMouseEntered

    private void irMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_irMouseExited
        ir.setFocusPainted(false);
        ir.setBorderPainted(false);
        ir.setContentAreaFilled(false);/**/
    }//GEN-LAST:event_irMouseExited

    private void irActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irActionPerformed
        //ir
        fun.buscar();
    }//GEN-LAST:event_irActionPerformed

    private void fondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fondoMouseClicked
        fun.lostFocus();
        fun.renombrar();
    }//GEN-LAST:event_fondoMouseClicked
 
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra_d;
    javax.swing.JPanel Barra_e;
    private javax.swing.JPanel Barra_es;
    public javax.swing.JFileChooser Chooser;
    private javax.swing.JButton Copiar;
    public javax.swing.JScrollPane Scroll;
    private javax.swing.JButton actualizar;
    public javax.swing.JButton adelante;
    public javax.swing.JButton atras;
    /*
    javax.swing.JTextField barra_direccion;
    */
    TextField barra_direccion;
    public javax.swing.JLabel documentos;
    javax.swing.JPanel fondo;
    private javax.swing.JButton ir;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel peso;
    // End of variables declaration//GEN-END:variables
    
}
