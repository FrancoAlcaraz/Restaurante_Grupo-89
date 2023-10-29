/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Bel
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagen/Menu.png"));
        Image image = icon.getImage();
        jEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        btnAgregarPedido = new javax.swing.JButton();
        bAgregarMesero = new javax.swing.JButton();
        btnAgregarMesa = new javax.swing.JButton();
        btnAgregarP = new javax.swing.JButton();
        btPreciosProductos = new javax.swing.JButton();
        btPedidosXmesa = new javax.swing.JButton();
        btPedidosXmesero = new javax.swing.JButton();
        btProductosXcategoria = new javax.swing.JButton();
        btPedidosXnumero = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEscritorio.setBackground(new java.awt.Color(255, 255, 255));

        btnAgregarPedido.setBackground(java.awt.Color.white);
        btnAgregarPedido.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        btnAgregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/numeroPedido.png"))); // NOI18N
        btnAgregarPedido.setText("Haz tu Pedido");
        btnAgregarPedido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        bAgregarMesero.setBackground(java.awt.Color.white);
        bAgregarMesero.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        bAgregarMesero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/camarero.png"))); // NOI18N
        bAgregarMesero.setText("Agregar Mesero");
        bAgregarMesero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        bAgregarMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarMeseroActionPerformed(evt);
            }
        });

        btnAgregarMesa.setBackground(java.awt.Color.white);
        btnAgregarMesa.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        btnAgregarMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/MesasYSillas.png"))); // NOI18N
        btnAgregarMesa.setText("Agregar Mesa");
        btnAgregarMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btnAgregarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMesaActionPerformed(evt);
            }
        });

        btnAgregarP.setBackground(java.awt.Color.white);
        btnAgregarP.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        btnAgregarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/CopaTenedor.png"))); // NOI18N
        btnAgregarP.setText("Agregar Producto");
        btnAgregarP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btnAgregarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPActionPerformed(evt);
            }
        });

        btPreciosProductos.setBackground(java.awt.Color.white);
        btPreciosProductos.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        btPreciosProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/MenuRes.png"))); // NOI18N
        btPreciosProductos.setText("Menu");
        btPreciosProductos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btPreciosProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreciosProductosActionPerformed(evt);
            }
        });

        btPedidosXmesa.setBackground(java.awt.Color.white);
        btPedidosXmesa.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        btPedidosXmesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/mesita.png"))); // NOI18N
        btPedidosXmesa.setText("Mesas");
        btPedidosXmesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btPedidosXmesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidosXmesaActionPerformed(evt);
            }
        });

        btPedidosXmesero.setBackground(java.awt.Color.white);
        btPedidosXmesero.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        btPedidosXmesero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/HazTuPedido.png"))); // NOI18N
        btPedidosXmesero.setText("Pedidos");
        btPedidosXmesero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btPedidosXmesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidosXmeseroActionPerformed(evt);
            }
        });

        btProductosXcategoria.setBackground(java.awt.Color.white);
        btProductosXcategoria.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        btProductosXcategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Productos.png"))); // NOI18N
        btProductosXcategoria.setText("Productos");
        btProductosXcategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btProductosXcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProductosXcategoriaActionPerformed(evt);
            }
        });

        btPedidosXnumero.setBackground(java.awt.Color.white);
        btPedidosXnumero.setFont(new java.awt.Font("DejaVu Serif", 0, 12)); // NOI18N
        btPedidosXnumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/BuscarPedido.png"))); // NOI18N
        btPedidosXnumero.setText("Busca tu Pedido");
        btPedidosXnumero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));
        btPedidosXnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPedidosXnumeroActionPerformed(evt);
            }
        });

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Usuario.png"))); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Administracion.png"))); // NOI18N
        jLabel2.setText("Administración");

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Mesero.png"))); // NOI18N
        jLabel3.setText("Mesero");

        jEscritorio.setLayer(btnAgregarPedido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(bAgregarMesero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(btnAgregarMesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(btnAgregarP, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(btPreciosProductos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(btPedidosXmesa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(btPedidosXmesero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(btProductosXcategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(btPedidosXnumero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addComponent(btPedidosXmesero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btPedidosXmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btPedidosXnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(btnAgregarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(112, 112, 112)
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btPreciosProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btProductosXcategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addComponent(btnAgregarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAgregarMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(449, 449, 449))
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(btnAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPreciosProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPedidosXnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProductosXcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregarMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAgregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPedidosXmesero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPedidosXmesa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMesaActionPerformed
       
        jEscritorio.repaint();
        AgregarMesa am = new AgregarMesa();
        am.setVisible(true);
        jEscritorio.add(am);
        jEscritorio.moveToFront(am);
    }//GEN-LAST:event_btnAgregarMesaActionPerformed

    private void bAgregarMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarMeseroActionPerformed
        
        jEscritorio.repaint();
        AgregarMesero ame = new AgregarMesero();
        ame.setVisible(true);
        jEscritorio.add(ame);
        jEscritorio.moveToFront(ame);
    }//GEN-LAST:event_bAgregarMeseroActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        
        
        jEscritorio.repaint();
        AgregarPedido ap = new AgregarPedido();
        ap.setVisible(true);
        jEscritorio.add(ap);
        jEscritorio.moveToFront(ap);
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void btnAgregarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPActionPerformed
       
        jEscritorio.repaint();
        AgregarProducto apr = new AgregarProducto();
        apr.setVisible(true);
        jEscritorio.add(apr);
        jEscritorio.moveToFront(apr);
    }//GEN-LAST:event_btnAgregarPActionPerformed

    private void btPreciosProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPreciosProductosActionPerformed
     
        jEscritorio.repaint();
        PreciosDeProducto pp = new PreciosDeProducto();
        pp.setVisible(true);
        jEscritorio.add(pp);
        jEscritorio.moveToFront(pp);

    }//GEN-LAST:event_btPreciosProductosActionPerformed

    private void btPedidosXmesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidosXmesaActionPerformed
        
        jEscritorio.repaint();
        PedidosPorMesa ppm = new PedidosPorMesa();
        ppm.setVisible(true);
        jEscritorio.add(ppm);
        jEscritorio.moveToFront(ppm);
    }//GEN-LAST:event_btPedidosXmesaActionPerformed

    private void btPedidosXmeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidosXmeseroActionPerformed

  
        jEscritorio.repaint();
        PedidosPorMesero ame = new PedidosPorMesero();
        ame.setVisible(true);
        jEscritorio.add(ame);
        jEscritorio.moveToFront(ame);

    }//GEN-LAST:event_btPedidosXmeseroActionPerformed

    private void btProductosXcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProductosXcategoriaActionPerformed

        
        jEscritorio.repaint();
        ProductosPorCategoria ppc = new ProductosPorCategoria();
        ppc.setVisible(true);
        jEscritorio.add(ppc);
        jEscritorio.moveToFront(ppc);

    }//GEN-LAST:event_btProductosXcategoriaActionPerformed

    private void btPedidosXnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPedidosXnumeroActionPerformed

        jEscritorio.repaint();
        PedidosXNumero pn = new PedidosXNumero();
        pn.setVisible(true);
        jEscritorio.add(pn);
        jEscritorio.moveToFront(pn);

    }//GEN-LAST:event_btPedidosXnumeroActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarMesero;
    private javax.swing.JButton btPedidosXmesa;
    private javax.swing.JButton btPedidosXmesero;
    private javax.swing.JButton btPedidosXnumero;
    private javax.swing.JButton btPreciosProductos;
    private javax.swing.JButton btProductosXcategoria;
    private javax.swing.JButton btnAgregarMesa;
    private javax.swing.JButton btnAgregarP;
    private javax.swing.JButton btnAgregarPedido;
    public javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
