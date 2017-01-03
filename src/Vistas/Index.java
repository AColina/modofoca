package Vistas;

import Controladores.Controlador_Imagenes;
import Controladores.Controlador_Principal;
import login.Login;

/**
 *
 * @author Angel Colina
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    int X, Y;

    public Index() {
        Index.setDefaultLookAndFeelDecorated(true);
        Controlador_Principal.setTheme();
        initComponents();
        this.setName("Modofoca");
        Fondo.setLayout(new java.awt.BorderLayout());
        this.setLocationRelativeTo(null);
        Fondo.removeAll();
        Fondo.add(new Login());
        Fondo.updateUI();
        this.setIconImage(new Controlador_Imagenes().Icono); // NOI18N
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ModoFoca Server");
        setUndecorated(true);
        setResizable(false);

        Fondo.setLayout(new java.awt.BorderLayout());
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                X=evt.getX();
                Y=evt.getY();
            }
        });
        final Index pan=this;
        Fondo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void  mouseDragged(java.awt.event.MouseEvent evt){
                java.awt.Point point = java.awt.MouseInfo.getPointerInfo().getLocation();
                pan.setLocation(point.x - X, point.y - Y);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Index().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Fondo;
    // End of variables declaration//GEN-END:variables
}
