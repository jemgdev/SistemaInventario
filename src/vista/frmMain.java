/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import controlador.EventsController;

/**
 *
 * @author r.kumbara
 */
public class frmMain extends javax.swing.JFrame {

    int x = 230;
    int a = 0;
    EventsController view;
    public frmMain() {
        initComponents();
        view = new EventsController(this);
        frmRegistro.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelSalida = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelRegistro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelProveedores = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelDetalle = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelInspeccion = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelListadoUsuarios = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        frmRegistro = new javax.swing.JInternalFrame();
        btnCerrarRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 70, 78));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSalida.setBackground(new java.awt.Color(54, 70, 78));
        panelSalida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-magazine-23.png"))); // NOI18N
        panelSalida.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salida de Productos");
        panelSalida.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        jPanel2.add(panelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 40));

        panelRegistro.setBackground(new java.awt.Color(54, 70, 78));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-home-page-23.png"))); // NOI18N
        panelRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro de Productos");
        panelRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        jPanel2.add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 40));

        panelProveedores.setBackground(new java.awt.Color(54, 70, 78));
        panelProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-male-user-23.png"))); // NOI18N
        panelProveedores.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proveedores");
        panelProveedores.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        jPanel2.add(panelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 40));

        panelDetalle.setBackground(new java.awt.Color(54, 70, 78));
        panelDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-increase-23.png"))); // NOI18N
        panelDetalle.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Historial de Productos");
        panelDetalle.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        jPanel2.add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 230, 40));

        panelInspeccion.setBackground(new java.awt.Color(54, 70, 78));
        panelInspeccion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-survey-23.png"))); // NOI18N
        panelInspeccion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Clasificación de Productos");
        panelInspeccion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 20));

        jPanel2.add(panelInspeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 40));

        panelListadoUsuarios.setBackground(new java.awt.Color(54, 70, 78));
        panelListadoUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-increase-23.png"))); // NOI18N
        panelListadoUsuarios.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Listado de Usuarios");
        panelListadoUsuarios.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        jPanel2.add(panelListadoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, 230, 552));

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-menu-30.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.setOpaque(true);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 40, -1));

        frmRegistro.setVisible(true);

        btnCerrarRegistro.setText("Cerrar");
        btnCerrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmRegistroLayout = new javax.swing.GroupLayout(frmRegistro.getContentPane());
        frmRegistro.getContentPane().setLayout(frmRegistroLayout);
        frmRegistroLayout.setHorizontalGroup(
            frmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRegistroLayout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(btnCerrarRegistro)
                .addGap(344, 344, 344))
        );
        frmRegistroLayout.setVerticalGroup(
            frmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRegistroLayout.createSequentialGroup()
                .addContainerGap(424, Short.MAX_VALUE)
                .addComponent(btnCerrarRegistro)
                .addGap(82, 82, 82))
        );

        jPanel1.add(frmRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 770, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/FMainMenu.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 625));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if ( x == 230 ) {
            jPanel2.setSize(230, 552);
            Thread th = new Thread() {
                @Override
                public void run(){
                    try {
                        
                        for ( int i = 230; i >= 0; i--){
                            Thread.sleep(1);
                            jPanel2.setSize(i, 552);
                            
                            a++;
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=0;
        } else if( x == 0 ){
            jPanel2.setSize(x, 552);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try {
                        for (int i = 0; i <= x; i++){
                            Thread.sleep(1);
                            jPanel2.setSize(i, 552);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x = 230;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        labelcolor(jLabel3);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        resetlabelcolor(jLabel3);
    }//GEN-LAST:event_jLabel3MouseExited

    private void btnCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegistroActionPerformed
        frmRegistro.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegistroActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarRegistro;
    private javax.swing.JInternalFrame frmRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelInspeccion;
    private javax.swing.JPanel panelListadoUsuarios;
    private javax.swing.JPanel panelProveedores;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPanel panelSalida;
    // End of variables declaration//GEN-END:variables
    private void labelcolor(JLabel label){
        label.setBackground(new java.awt.Color(53,162,107));
    }
   
    private void resetlabelcolor(JLabel label){
        label.setBackground(new java.awt.Color(54,70,78));
    }
    
    public javax.swing.JPanel getPanelDetalle() {
        return panelDetalle;
    }

    public javax.swing.JPanel getPanelInspeccion() {
        return panelInspeccion;
    }

    public javax.swing.JPanel getPanelListadoUsuarios() {
        return panelListadoUsuarios;
    }

    public javax.swing.JPanel getPanelProveedores() {
        return panelProveedores;
    }

    public javax.swing.JPanel getPanelRegistro() {
        return panelRegistro;
    }

    public javax.swing.JPanel getPanelSalida() {
        return panelSalida;
    }

    public javax.swing.JInternalFrame getFrmRegistro() {
        return frmRegistro;
    }
    
}
