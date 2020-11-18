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
import javax.swing.JInternalFrame;

/**
 *
 * @author r.kumbara
 */
public class frmMain extends javax.swing.JFrame {

    int x = 230;
    EventsController view;
    private JInternalFrame activeFrame;
    public frmMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        view = new EventsController(this);
        closeAllFrames();
    }
    
    void closeAllFrames() {
        frmRegistro.setVisible(false);
        frmSalida.setVisible(false);
        frmProveedores.setVisible(false);
        frmHistorial.setVisible(false);
        frmClasificacion.setVisible(false);
        frmListadoUsuarios.setVisible(false);
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        slideBar = new javax.swing.JPanel();
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
        panelClasificacion = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelListadoUsuarios = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        slideIcon = new javax.swing.JLabel();
        frmListadoUsuarios = new javax.swing.JInternalFrame();
        btnCerrarListado = new javax.swing.JButton();
        frmClasificacion = new javax.swing.JInternalFrame();
        btnCerrarClasificacion = new javax.swing.JButton();
        frmSalida = new javax.swing.JInternalFrame();
        btnCerrarSalida = new javax.swing.JButton();
        frmRegistro = new javax.swing.JInternalFrame();
        btnCerrarRegistro = new javax.swing.JButton();
        frmProveedores = new javax.swing.JInternalFrame();
        btnCerrarProveedores = new javax.swing.JButton();
        frmHistorial = new javax.swing.JInternalFrame();
        btnCerrarHistorial = new javax.swing.JButton();
        gg = new javax.swing.JLabel();
        fontImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(1230, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 625));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slideBar.setBackground(new java.awt.Color(54, 70, 78));
        slideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelSalida.setBackground(new java.awt.Color(54, 70, 78));
        panelSalida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-magazine-23.png"))); // NOI18N
        panelSalida.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salida de Productos");
        panelSalida.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        slideBar.add(panelSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 40));

        panelRegistro.setBackground(new java.awt.Color(54, 70, 78));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-home-page-23.png"))); // NOI18N
        panelRegistro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro de Productos");
        panelRegistro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        slideBar.add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 230, 40));

        panelProveedores.setBackground(new java.awt.Color(54, 70, 78));
        panelProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-male-user-23.png"))); // NOI18N
        panelProveedores.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Proveedores");
        panelProveedores.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        slideBar.add(panelProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 40));

        panelDetalle.setBackground(new java.awt.Color(54, 70, 78));
        panelDetalle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-increase-23.png"))); // NOI18N
        panelDetalle.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Historial de Productos");
        panelDetalle.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        slideBar.add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 230, 40));

        panelClasificacion.setBackground(new java.awt.Color(54, 70, 78));
        panelClasificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-survey-23.png"))); // NOI18N
        panelClasificacion.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Clasificación de Productos");
        panelClasificacion.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, 20));

        slideBar.add(panelClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 40));

        panelListadoUsuarios.setBackground(new java.awt.Color(54, 70, 78));
        panelListadoUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-increase-23.png"))); // NOI18N
        panelListadoUsuarios.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 40, 30));

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Listado de Usuarios");
        panelListadoUsuarios.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 140, 20));

        slideBar.add(panelListadoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 230, 40));

        jPanel1.add(slideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 650));

        slideIcon.setBackground(new java.awt.Color(0, 102, 204));
        slideIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slideIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-menu-30.png"))); // NOI18N
        slideIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        slideIcon.setOpaque(true);
        slideIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slideIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                slideIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                slideIconMouseExited(evt);
            }
        });
        jPanel1.add(slideIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 40, -1));

        frmListadoUsuarios.setVisible(true);

        btnCerrarListado.setText("Cerrar");
        btnCerrarListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmListadoUsuariosLayout = new javax.swing.GroupLayout(frmListadoUsuarios.getContentPane());
        frmListadoUsuarios.getContentPane().setLayout(frmListadoUsuariosLayout);
        frmListadoUsuariosLayout.setHorizontalGroup(
            frmListadoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmListadoUsuariosLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(btnCerrarListado)
                .addContainerGap(591, Short.MAX_VALUE))
        );
        frmListadoUsuariosLayout.setVerticalGroup(
            frmListadoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmListadoUsuariosLayout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(btnCerrarListado)
                .addGap(119, 119, 119))
        );

        jPanel1.add(frmListadoUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 1000, 650));

        frmClasificacion.setVisible(true);

        btnCerrarClasificacion.setText("Cerrar");
        btnCerrarClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarClasificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmClasificacionLayout = new javax.swing.GroupLayout(frmClasificacion.getContentPane());
        frmClasificacion.getContentPane().setLayout(frmClasificacionLayout);
        frmClasificacionLayout.setHorizontalGroup(
            frmClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmClasificacionLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(btnCerrarClasificacion)
                .addContainerGap(591, Short.MAX_VALUE))
        );
        frmClasificacionLayout.setVerticalGroup(
            frmClasificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmClasificacionLayout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(btnCerrarClasificacion)
                .addGap(119, 119, 119))
        );

        jPanel1.add(frmClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 1000, 650));

        frmSalida.setVisible(true);

        btnCerrarSalida.setText("Cerrar");
        btnCerrarSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmSalidaLayout = new javax.swing.GroupLayout(frmSalida.getContentPane());
        frmSalida.getContentPane().setLayout(frmSalidaLayout);
        frmSalidaLayout.setHorizontalGroup(
            frmSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmSalidaLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(btnCerrarSalida)
                .addContainerGap(591, Short.MAX_VALUE))
        );
        frmSalidaLayout.setVerticalGroup(
            frmSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmSalidaLayout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(btnCerrarSalida)
                .addGap(119, 119, 119))
        );

        jPanel1.add(frmSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 1000, 650));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarRegistro)
                .addGap(344, 344, 344))
        );
        frmRegistroLayout.setVerticalGroup(
            frmRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmRegistroLayout.createSequentialGroup()
                .addContainerGap(514, Short.MAX_VALUE)
                .addComponent(btnCerrarRegistro)
                .addGap(82, 82, 82))
        );

        jPanel1.add(frmRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 1000, 650));

        frmProveedores.setVisible(true);

        btnCerrarProveedores.setText("Cerrar");
        btnCerrarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frmProveedoresLayout = new javax.swing.GroupLayout(frmProveedores.getContentPane());
        frmProveedores.getContentPane().setLayout(frmProveedoresLayout);
        frmProveedoresLayout.setHorizontalGroup(
            frmProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmProveedoresLayout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(btnCerrarProveedores)
                .addContainerGap(605, Short.MAX_VALUE))
        );
        frmProveedoresLayout.setVerticalGroup(
            frmProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmProveedoresLayout.createSequentialGroup()
                .addContainerGap(500, Short.MAX_VALUE)
                .addComponent(btnCerrarProveedores)
                .addGap(96, 96, 96))
        );

        jPanel1.add(frmProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 1000, 650));

        frmHistorial.setVisible(true);

        btnCerrarHistorial.setText("Cerrar");
        btnCerrarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarHistorialActionPerformed(evt);
            }
        });

        gg.setText("hola");

        javax.swing.GroupLayout frmHistorialLayout = new javax.swing.GroupLayout(frmHistorial.getContentPane());
        frmHistorial.getContentPane().setLayout(frmHistorialLayout);
        frmHistorialLayout.setHorizontalGroup(
            frmHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frmHistorialLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(btnCerrarHistorial)
                .addContainerGap(591, Short.MAX_VALUE))
            .addGroup(frmHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(frmHistorialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gg)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        frmHistorialLayout.setVerticalGroup(
            frmHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frmHistorialLayout.createSequentialGroup()
                .addContainerGap(477, Short.MAX_VALUE)
                .addComponent(btnCerrarHistorial)
                .addGap(119, 119, 119))
            .addGroup(frmHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(frmHistorialLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(gg)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(frmHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 1000, 650));

        fontImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/FMainMenu.png"))); // NOI18N
        jPanel1.add(fontImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 720));

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

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slideIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideIconMouseClicked

        if ( x == 230 ) {
            slideBar.setSize(230, 650);
            Thread th = new Thread() {
                @Override
                public void run(){
                    try {
                        int cont = 0 ;
                        for ( int i = 230; i >= 0; i--){
                            cont++;
                            Thread.sleep(1);
                            slideBar.setSize(i, 650);
                            try {
                                activeFrame.setSize(770 + cont, 650);
                                activeFrame.setLocation(i, 70);
                            } catch (Exception e) {
                            }
                 
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x=0;
        } else if( x == 0 ){
            slideBar.setSize(x, 650);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try {
                        int cont = 0 ;
                        for (int i = 0; i <= x; i++){
                            cont++;
                            Thread.sleep(1);
                            slideBar.setSize(i, 650);
                            try {
                                activeFrame.setSize((770 + x) - cont, 650);
                                activeFrame.setLocation(i, 70);
                            } catch (Exception e) {
                            }
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 230;
        }
    }//GEN-LAST:event_slideIconMouseClicked

    private void slideIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideIconMouseEntered
        labelcolor(slideIcon);
    }//GEN-LAST:event_slideIconMouseEntered

    private void slideIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slideIconMouseExited
        resetlabelcolor(slideIcon);
    }//GEN-LAST:event_slideIconMouseExited

    private void btnCerrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegistroActionPerformed
        frmRegistro.setVisible(false);
    }//GEN-LAST:event_btnCerrarRegistroActionPerformed

    private void btnCerrarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarProveedoresActionPerformed
        frmProveedores.setVisible(false);
    }//GEN-LAST:event_btnCerrarProveedoresActionPerformed

    private void btnCerrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSalidaActionPerformed
        frmSalida.setVisible(false);
    }//GEN-LAST:event_btnCerrarSalidaActionPerformed

    private void btnCerrarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarHistorialActionPerformed
        frmHistorial.setVisible(false);
    }//GEN-LAST:event_btnCerrarHistorialActionPerformed

    private void btnCerrarClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarClasificacionActionPerformed
        frmClasificacion.setVisible(false);
    }//GEN-LAST:event_btnCerrarClasificacionActionPerformed

    private void btnCerrarListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarListadoActionPerformed
        frmListadoUsuarios.setVisible(false);
    }//GEN-LAST:event_btnCerrarListadoActionPerformed

    public void setActiveFrame(JInternalFrame frame) {
        this.activeFrame = frame;
    }
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
    private javax.swing.JButton btnCerrarClasificacion;
    private javax.swing.JButton btnCerrarHistorial;
    private javax.swing.JButton btnCerrarListado;
    private javax.swing.JButton btnCerrarProveedores;
    private javax.swing.JButton btnCerrarRegistro;
    private javax.swing.JButton btnCerrarSalida;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fontImage;
    private javax.swing.JInternalFrame frmClasificacion;
    private javax.swing.JInternalFrame frmHistorial;
    private javax.swing.JInternalFrame frmListadoUsuarios;
    private javax.swing.JInternalFrame frmProveedores;
    private javax.swing.JInternalFrame frmRegistro;
    private javax.swing.JInternalFrame frmSalida;
    private javax.swing.JLabel gg;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JPanel panelClasificacion;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelListadoUsuarios;
    private javax.swing.JPanel panelProveedores;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JPanel panelSalida;
    private javax.swing.JPanel slideBar;
    private javax.swing.JLabel slideIcon;
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

    public javax.swing.JPanel getPanelClasificacion() {
        return panelClasificacion;
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

    public javax.swing.JInternalFrame getFrmSalida() {
        return frmSalida;
    }

    public javax.swing.JInternalFrame getFrmProveedores() {
        return frmProveedores;
    }

    public javax.swing.JInternalFrame getFrmHistorial() {
        return frmHistorial;
    }

    public javax.swing.JInternalFrame getFrmClasificacion() {
        return frmClasificacion;
    }

    public javax.swing.JInternalFrame getFrmListadoUsuarios() {
        return frmListadoUsuarios;
    }
    
    

}
