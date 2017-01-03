package Chat;

/**
 *
 * @author Angel Colina
 */
public class index extends javax.swing.JFrame {
    
    private final Controlador_chat cc;
    final Principal p;
    /**
     * Creates new form index
     * @param usuario
     */
    public index(String usuario) {
        initComponents();        
        cc= new Controlador_chat(usuario); 
        this.setLayout(new java.awt.BorderLayout());
        p=new Principal(cc);
        this.add(p);
        this.setTitle(cc.getNombre()+" ModoFoca Chat");
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
        this.validate();
        this.repaint();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
      cc.exit(this);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
