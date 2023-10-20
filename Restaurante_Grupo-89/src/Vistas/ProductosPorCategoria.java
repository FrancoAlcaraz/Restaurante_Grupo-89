/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.CategoriaData;
import AccesoADatos.ProductoData;
import Entidades.Categoria;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductosPorCategoria extends javax.swing.JInternalFrame {

    ProductoData pd = new ProductoData();
    DefaultTableModel modelo = new DefaultTableModel();
    JComboBox c = new JComboBox();

    public ProductosPorCategoria() {
        initComponents();
        CargarCombos();
        CabeceraLista();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistaCategoria = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jcategoria = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnmodificarLista = new javax.swing.JButton();
        btnEliminarProd = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 255)));
        setClosable(true);
        setResizable(true);

        jlistaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Producto", "Nombre", "Cantidad", "Precio", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jlistaCategoria);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Por Categoria");

        jcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcategoriaActionPerformed(evt);
            }
        });

        jLabel2.setText("Categoria:");

        btnmodificarLista.setText("Modificar");
        btnmodificarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarListaActionPerformed(evt);
            }
        });

        btnEliminarProd.setText("Eliminar");
        btnEliminarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProdActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnmodificarLista)
                        .addGap(164, 164, 164)
                        .addComponent(btnEliminarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(217, 217, 217))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificarLista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

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

    private void jcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcategoriaActionPerformed
        armarTabla();
    }//GEN-LAST:event_jcategoriaActionPerformed

    private void btnmodificarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarListaActionPerformed
        int fila = jlistaCategoria.getSelectedRow();
        String nNombre = jlistaCategoria.getValueAt(fila, 1).toString();
        int nCantidad = Integer.parseInt(jlistaCategoria.getValueAt(fila, 2).toString());
        double nPrecio = Double.parseDouble(jlistaCategoria.getValueAt(fila, 3).toString());
        String nCategoria = c.getSelectedItem().toString();
        if (nNombre.isEmpty() || nCantidad == -1 || nPrecio < -1 || nCategoria.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los cambpos a modificar");
            return;
        }
        try {
            if (fila == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione el producto que desea modificar");
                return;
            }

            Categoria cat = (Categoria) jcategoria.getSelectedItem();
            if (cat == null) {
                JOptionPane.showMessageDialog(null, "Seleccione una categoría válida");
                return;
            }

            int idcategoria = 0;
            if (nCategoria.equalsIgnoreCase("BEBIDA NA")) {
                idcategoria = 4;
            } else if (nCategoria.equalsIgnoreCase("COMIDA")) {
                idcategoria = 5;
            } else if (nCategoria.equalsIgnoreCase("BEBIDA")) {
                idcategoria = 6;
            }

            int id = (int) jlistaCategoria.getValueAt(fila, 0);
            for (Producto producto : pd.obtenerProductos()) {
                if (producto.getIdProducto() == id) {

                    producto.setNombre(nNombre);
                    producto.setCantidad(nCantidad);
                    producto.setPrecio(nPrecio);

                    if (!producto.getCategoria().equals(nCategoria)) {
                        Categoria cate = new Categoria(idcategoria, nCategoria);
                        producto.setCategoria(cate);
                    }

                    pd.modificarProducto(producto);

                    armarTabla();
                    break;
                }
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese correctamente los datos");
        }

    }//GEN-LAST:event_btnmodificarListaActionPerformed

    private void btnEliminarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProdActionPerformed
        int filaseleccionada = jlistaCategoria.getSelectedRow();
        List<Producto> pr = new ArrayList<>(pd.obtenerProductos());
        if (filaseleccionada != -1) {
            int idproducto = -1;
            for (Producto producto : pr) {
                idproducto = producto.getIdProducto();
            }
            if (idproducto != -1) {
                pd.eliminarProducto(idproducto);
            }
        }
    }//GEN-LAST:event_btnEliminarProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarProd;
    private javax.swing.JButton btnmodificarLista;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Categoria> jcategoria;
    private javax.swing.JTable jlistaCategoria;
    // End of variables declaration//GEN-END:variables
 private void CargarCombos() {
        jcategoria.removeAllItems();
        CategoriaData ct = new CategoriaData();
        List<Categoria> lista = ct.listarCategorias();
        for (Categoria ala : lista) {
            if (ala != null) {
                jcategoria.addItem(ala);

            }
        }
    }

    private void CabeceraLista() {
        modelo.addColumn("ID Producto");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        jlistaCategoria.setModel(modelo);
    }

    private void boxTable() {

        String dato[] = {"COMIDA", "BEBIDA", "BEBIDA NA"};
        for (String dato1 : dato) {
            c.addItem(dato1);
        }
        jlistaCategoria.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(c));
    }

    private void armarTabla() {
        Categoria pr = (Categoria) jcategoria.getSelectedItem();
        if (pr != null) {
            modelo.setRowCount(0);
            int cat = pr.getIdcategoria();
            List<Producto> lis = pd.obtenerProductosXCategoria(cat);
            for (Producto producto : lis) {
                int idP = producto.getIdProducto();
                String nombre = producto.getNombre();
                int cantidad = producto.getCantidad();
                double precio = producto.getPrecio();
                String cate = pr.getCategoria();
                modelo.addRow(new Object[]{idP, nombre, cantidad, precio, cate});
            }
        }
    }
}
