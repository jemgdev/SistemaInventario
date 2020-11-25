/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import controlador.ProductoController;
import controlador.ProveedoresController;
import controlador.CategoriaControlller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Productos;
/**
 *
 * @author geanl
 */
public class dgRegistarProducto extends javax.swing.JDialog {

    static int idProducto; 
    static int opcion;
    ProductoController productoController = new ProductoController();
    CategoriaControlller categoriaController = new CategoriaControlller();
    ProveedoresController proveedorController = new ProveedoresController();
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
    
    public dgRegistarProducto(java.awt.Frame parent, boolean modal) throws ParseException {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        llenarCbCategoria();
        llenarCbProveedor();
        switch (opcion) {
            case 1: modificarPorducto(); break;
            case 2: agregarProducto(); break;
        }
        
    }

    void agregarProducto() {
        btnAgreProducto.setVisible(true);
        btnModificarProducto.setVisible(false);
    }
    
    void modificarPorducto() throws ParseException {
        
        btnAgreProducto.setVisible(false);
        btnModificarProducto.setVisible(true);
        Productos p = productoController.getProducto(idProducto);
        txtNombreProducto.setText(p.getNombre_producto());
        txtPrecioProducto.setText(""+p.getPrecio());
        txtStock.setText(""+p.getStock());
        cbCategoria.setSelectedItem(p.getNombre_producto());
        cbProveedor.setSelectedItem(p.getNombre_proveedores());
        dateFechaIngreso.setDate(sd.parse(p.getFecha_ingreso()));
        dateFechaSalida.setDate(sd.parse(p.getFecha_vencimiento()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dateFechaIngreso = new com.toedter.calendar.JDateChooser();
        dateFechaSalida = new com.toedter.calendar.JDateChooser();
        cbProveedor = new javax.swing.JComboBox<>();
        cbCategoria = new javax.swing.JComboBox<>();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioProducto = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnAgreProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnCerrarReg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setPreferredSize(new java.awt.Dimension(717, 532));
        setResizable(false);
        setSize(new java.awt.Dimension(717, 532));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese Fecha Ingreso:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 160, 157, 20);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese Fecha de Vencimiento:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 200, 220, 20);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel4.setText("Ingrese Nombre del Producto:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 80, 210, 20);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel6.setText("Ingrese Nombre del Proveedor:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 280, 230, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel5.setText("Elija una Categoria:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 240, 150, 20);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel7.setText("Ingrese Precio del Producto:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 120, 197, 20);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel8.setText("Ingrese el Stock:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 320, 140, 20);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel10.setText("Registro de Producto");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(280, 30, 200, 25);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-male-user-23.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 48))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(510, 100, 170, 220);
        getContentPane().add(dateFechaIngreso);
        dateFechaIngreso.setBounds(300, 160, 160, 32);
        getContentPane().add(dateFechaSalida);
        dateFechaSalida.setBounds(300, 200, 160, 32);

        cbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbProveedor);
        cbProveedor.setBounds(300, 280, 160, 26);

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbCategoria);
        cbCategoria.setBounds(300, 240, 160, 26);
        getContentPane().add(txtNombreProducto);
        txtNombreProducto.setBounds(300, 80, 160, 24);
        getContentPane().add(txtPrecioProducto);
        txtPrecioProducto.setBounds(300, 120, 160, 24);
        getContentPane().add(txtStock);
        txtStock.setBounds(300, 320, 160, 24);

        btnAgreProducto.setText("Agregar Producto");
        btnAgreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgreProducto);
        btnAgreProducto.setBounds(80, 420, 150, 32);

        btnModificarProducto.setText("Modificar Producto");
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarProducto);
        btnModificarProducto.setBounds(80, 420, 150, 32);

        btnCerrarReg.setText("Cerrar");
        btnCerrarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarRegActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarReg);
        btnCerrarReg.setBounds(500, 420, 100, 32);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/FMainMenu.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 717, 532);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreProductoActionPerformed
        
    }//GEN-LAST:event_btnAgreProductoActionPerformed

    private void btnCerrarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarRegActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarRegActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    /**
     * @param args the command line arguments
     */
    void llenarCbCategoria() {
        cbCategoria.removeAllItems();
        categoriaController.listadoCategoria().forEach((p)->{
            cbCategoria.addItem(p.getNombre_Categoria());
        });
    }
    
    void llenarCbProveedor() {
        cbProveedor.removeAllItems();
        proveedorController.listaProveedores().forEach((p)->{
            cbProveedor.addItem(p.getNombre_proveedores());
        });
    }
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dgRegistarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dgRegistarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dgRegistarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dgRegistarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dgRegistarProducto dialog = null;
                try {
                    dialog = new dgRegistarProducto(new javax.swing.JFrame(), true);
                } catch (ParseException ex) {
                    Logger.getLogger(dgRegistarProducto.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgreProducto;
    private javax.swing.JButton btnCerrarReg;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JComboBox<String> cbProveedor;
    private com.toedter.calendar.JDateChooser dateFechaIngreso;
    private com.toedter.calendar.JDateChooser dateFechaSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioProducto;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getLbTitulo() {
        return jLabel10;
    }
}
