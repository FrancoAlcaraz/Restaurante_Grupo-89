/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.ProductoData;
import Entidades.Categoria;
import Entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bel
 */
public class PreciosDeProducto extends javax.swing.JInternalFrame {
DefaultTableModel modelo=new DefaultTableModel();
  PanelImagen fondo=new PanelImagen();
    JComboBox c = new JComboBox();
    public PreciosDeProducto() {
       this.setContentPane(fondo);
        initComponents();
        cabecera();
        boxTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelImagen();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jprecioA = new javax.swing.JTextField();
        jprecioB = new javax.swing.JTextField();
        jbuscar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Precios De Producto");

        jLabel2.setText("Precios entre:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" y");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jprecioB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprecioBActionPerformed(evt);
            }
        });

        jbuscar.setText("Buscar");
        jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuscarActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jprecioA, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jprecioB, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbuscar)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jprecioA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jprecioB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jModificar))
                .addGap(179, 179, 179))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jprecioBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprecioBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jprecioBActionPerformed

    private void jbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuscarActionPerformed
      try{
        if(jprecioA.getText().isEmpty()&& jprecioB.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "no deje campos vacio");
        
        }
        modelo.setRowCount(0);
        double precioa=Double.parseDouble(jprecioA.getText());
    double preciob=Double.parseDouble(jprecioB.getText());
     
  ProductoData pd=new ProductoData();
  List<Producto> lista=pd.obtenerProductos();
    for (Producto producto : lista) {
        if(producto!=null && precioa<=producto.getPrecio() && preciob>=producto.getPrecio()){
            int id=producto.getIdProducto();
        String nombreProducto=producto.getNombre();
        int cantidad=producto.getCantidad();
        String categoria=producto.getCategoria().getCategoria();
        double precio=producto.getPrecio();
        modelo.addRow(new Object[]{id,nombreProducto,cantidad,categoria,precio});
        }
    }}catch(Exception e){
    JOptionPane.showMessageDialog(null, "Error de tipo "+e);
    
    }
  
        
    }//GEN-LAST:event_jbuscarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
    try{
        int fila=jTable1.getSelectedRow();
        int id=(int) jTable1.getValueAt(fila, 0);
        String nNombre=jTable1.getValueAt(fila, 1).toString();
        int nCantidad=Integer.parseInt(jTable1.getValueAt(fila, 2).toString());
        double precion=Double.parseDouble(jTable1.getValueAt(fila, 4).toString());
        String nCategoria=c.getSelectedItem().toString();
        ProductoData pd=new ProductoData();
        List<Producto> lista=pd.obtenerProductos();
      int idcategoria = 0;
            if (nCategoria.equalsIgnoreCase("BEBIDA NA")) {
                idcategoria = 4;
            } else if (nCategoria.equalsIgnoreCase("COMIDA")) {
                idcategoria = 5;
            } else if (nCategoria.equalsIgnoreCase("BEBIDA")) {
                idcategoria = 6;
            }
            
        for (Producto producto : lista) {
           
            System.out.println(id);
            if(producto!=null && id==producto.getIdProducto()){
           producto.setNombre(nNombre);
            producto.setCantidad(nCantidad);
            producto.setPrecio(precion);
            
                    if (!producto.getCategoria().equals(nCategoria)) {
                        Categoria cate = new Categoria(idcategoria, nCategoria);
                        producto.setCategoria(cate);
                    }
            pd.modificarProducto(producto);
            }
          
            
        }
            }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error Exception "+e);
        }

    }//GEN-LAST:event_jModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbuscar;
    private javax.swing.JTextField jprecioA;
    private javax.swing.JTextField jprecioB;
    // End of variables declaration//GEN-END:variables
public void cabecera(){
    
 modelo.addColumn("id");
 modelo.addColumn("Nombre");
 modelo.addColumn("Cantidad");
 modelo.addColumn("Categoria");
 modelo.addColumn("Precio");
 jTable1.setModel(modelo);
}
 
    private void boxTable() {

        String dato[] = {"COMIDA", "BEBIDA", "BEBIDA NA"};
        for (String dato1 : dato) {
            c.addItem(dato1);
        }
        jTable1.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(c));
    }



    
    class PanelImagen extends JPanel {

        Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen=new ImageIcon(getClass().getResource("/Imagen/Generales.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

        }
    }
}
