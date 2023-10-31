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
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bel
 */
public class AgregarProducto extends javax.swing.JInternalFrame {

    PanelImagen fondo = new PanelImagen();

    public AgregarProducto() {
        this.setContentPane(fondo);
        initComponents();
        cargarcombo();
        cargarProducto();
        jTextNombre.setText("");
        jTextPrecio.setText("");
        jTextStock.setText("");
        jrActivo.setSelected(false);
        jrDesactivo.setSelected(false);
        num(jTextPrecio);
        num(jTextStock);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextPrecio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jTextStock = new javax.swing.JTextField();
        jrActivo = new javax.swing.JRadioButton();
        jrDesactivo = new javax.swing.JRadioButton();
        jproductoAgregados = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcategoria = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Producto");

        jLabel2.setBackground(java.awt.Color.white);
        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        jLabel3.setBackground(java.awt.Color.white);
        jLabel3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Stock:");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);

        jLabel4.setBackground(java.awt.Color.white);
        jLabel4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Precio:");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);

        jLabel5.setBackground(java.awt.Color.white);
        jLabel5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel5.setText("Categoria:");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setOpaque(true);

        jTextNombre.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextPrecio.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jModificar.setBackground(new java.awt.Color(255, 255, 255));
        jModificar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jModificar.setText("Modificar");
        jModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jModificar.setRequestFocusEnabled(false);
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jTextStock.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTextStock.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jrActivo.setBackground(java.awt.Color.white);
        jrActivo.setText("Activo");
        jrActivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrActivoActionPerformed(evt);
            }
        });

        jrDesactivo.setBackground(java.awt.Color.white);
        jrDesactivo.setText("Desactivo");
        jrDesactivo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jrDesactivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDesactivoActionPerformed(evt);
            }
        });

        jproductoAgregados.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jproductoAgregados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jproductoAgregadosItemStateChanged(evt);
            }
        });
        jproductoAgregados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jproductoAgregadosActionPerformed(evt);
            }
        });

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Estado:");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);

        jcategoria.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrActivo)
                                .addGap(111, 111, 111)
                                .addComponent(jrDesactivo))
                            .addComponent(jTextNombre)
                            .addComponent(jTextStock)
                            .addComponent(jTextPrecio)
                            .addComponent(jcategoria, 0, 286, Short.MAX_VALUE))))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                        .addComponent(jproductoAgregados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jproductoAgregados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jcategoria)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrDesactivo)
                    .addComponent(jrActivo)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        jTextNombre.setText("");
        jTextPrecio.setText("");
        jTextStock.setText("");
        jrActivo.setSelected(false);
        jrDesactivo.setSelected(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Categoria seleccion = (Categoria) jcategoria.getSelectedItem();
        ProductoData pd = new ProductoData();
        CategoriaData cd = new CategoriaData();
        try {
            if (seleccion != null) {
                int idcategoria = seleccion.getIdcategoria();
                Categoria ct = cd.ObtenerCategoria(idcategoria);
                int stock = Integer.parseInt(jTextStock.getText());
                String NombreProducto = jTextNombre.getText();
                double Precio = Double.parseDouble(jTextPrecio.getText());
                boolean estado = true;

                if (jrActivo.isSelected()) {
                    estado = true;
                } else if (jrDesactivo.isSelected()) {
                    estado = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione el estado del producto");
                    return;
                }
                if (!NombreProducto.matches(".*[a-zA-Z].*")) {
                    JOptionPane.showMessageDialog(null, "El nombre del producto debe contener al menos una letra.");
                    return;
                }
                List<Producto> nombresProductos = pd.obtenerProductosxNombre(NombreProducto);
                for (Producto nombre : nombresProductos) {
                    if (nombre.getNombre().equalsIgnoreCase(NombreProducto)) {
                        JOptionPane.showMessageDialog(null, "Ya existe un producto con el mismo nombre");
                        return;
                    }
                }
                Producto producto = new Producto(NombreProducto, stock, Precio, ct, estado);
                pd.agregarProducto(producto);
                cargarProducto();

            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores válidos para Stock y Precio");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al guardar el producto: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        Producto prods = (Producto) jproductoAgregados.getSelectedItem();
        if (prods != null) {
            if (jTextNombre.getText().isEmpty() && jTextPrecio.getText().isEmpty()
                    && jTextStock.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No dejes campos vacíos");
                return;
            }
            try {
                int idproducto = prods.getIdProducto();
                String nNombre = jTextNombre.getText();
                double nprecio = Double.parseDouble(jTextPrecio.getText());
                int cantidad = Integer.parseInt(jTextStock.getText());
                String nCategoria = jcategoria.getSelectedItem().toString();
                boolean estado = true;

                if (jrActivo.isSelected()) {
                    estado = true;
                } else if (jrDesactivo.isSelected()) {
                    estado = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione el estado del producto");
                    return;
                }
                if (!nNombre.matches(".*[a-zA-Z].*")) {
                    JOptionPane.showMessageDialog(null, "El nombre del producto debe contener al menos una letra.");
                    return;
                }

                ProductoData pd = new ProductoData();
                List<Producto> lista = pd.obtenerProductos();
                int idcategoria = 0;

                if (nCategoria.equalsIgnoreCase("BEBIDA NA")) {
                    idcategoria = 4;
                } else if (nCategoria.equalsIgnoreCase("COMIDA")) {
                    idcategoria = 5;
                } else if (nCategoria.equalsIgnoreCase("BEBIDA")) {
                    idcategoria = 6;
                }
                boolean productoEncontrado = false;

                for (Producto producto : lista) {
                    if (producto != null && idproducto == producto.getIdProducto()) {
                        producto.setNombre(nNombre);
                        producto.setCantidad(cantidad);
                        producto.setPrecio(nprecio);
                        producto.setEstado(estado);

                        if (!producto.getCategoria().getCategoria().equals(nCategoria)) {
                            Categoria cate = new Categoria(idcategoria, nCategoria);
                            producto.setCategoria(cate);
                        }
                        pd.modificarProducto(producto);
                        productoEncontrado = true;
                        break;
                    }
                }

                if (!productoEncontrado) {
                    JOptionPane.showMessageDialog(null, "El producto no existe en la lista");
                } else {
                    JOptionPane.showMessageDialog(null, "Producto modificado con éxito.");
                    cargarProducto();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al ingresar valores numéricos: " + e.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al modificar el producto: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jproductoAgregadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jproductoAgregadosItemStateChanged
        try {
            Producto seleccion = (Producto) jproductoAgregados.getSelectedItem();
            if (seleccion != null) {
                int idProducto = seleccion.getIdProducto();
                ProductoData pd = new ProductoData();
                List<Producto> list = pd.obtenerProductos();
                for (Producto p : list) {
                    if (p != null && p.getIdProducto() == idProducto) {
                        jTextNombre.setText(p.getNombre());
                        String stock = Integer.toString(p.getCantidad());
                        String precio = Double.toString(p.getPrecio());
                        jTextStock.setText(stock);
                        jTextPrecio.setText(precio);
                        Categoria categoriaProducto = p.getCategoria();
                        DefaultComboBoxModel<Categoria> model
                                = (DefaultComboBoxModel<Categoria>) jcategoria.getModel();
                        model.setSelectedItem(categoriaProducto);
                        boolean est = p.isEstado();
                        if (est) {
                            jrActivo.setSelected(true);
                            jrDesactivo.setSelected(false);
                        } else {
                            jrActivo.setSelected(false);
                            jrDesactivo.setSelected(true);
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos del producto: " + e.getMessage());
        }
    }//GEN-LAST:event_jproductoAgregadosItemStateChanged

    private void jrActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrActivoActionPerformed
        if (jrActivo.isSelected()) {
            jrDesactivo.setSelected(false);
        }
    }//GEN-LAST:event_jrActivoActionPerformed

    private void jrDesactivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDesactivoActionPerformed
        if (jrDesactivo.isSelected()) {
            jrActivo.setSelected(false);
        }
    }//GEN-LAST:event_jrDesactivoActionPerformed

    private void jproductoAgregadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jproductoAgregadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jproductoAgregadosActionPerformed

    public void num(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                }
                if (c == '.' && jTextPrecio.getText().contains(".")) {

                    e.consume();
                }
            }

        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPrecio;
    private javax.swing.JTextField jTextStock;
    private javax.swing.JComboBox<Categoria> jcategoria;
    private javax.swing.JComboBox<Producto> jproductoAgregados;
    private javax.swing.JRadioButton jrActivo;
    private javax.swing.JRadioButton jrDesactivo;
    // End of variables declaration//GEN-END:variables
private void cargarcombo() {
        jcategoria.removeAllItems();
        CategoriaData cd = new CategoriaData();
        List<Categoria> list = cd.listarCategorias();
        for (Categoria cat : list) {
            jcategoria.addItem(cat);
        }
    }

    private void cargarProducto() {
        jproductoAgregados.removeAllItems();
        ProductoData pd = new ProductoData();
        List<Producto> list = pd.obtenerProductos();
        for (Producto produ : list) {
            jproductoAgregados.addItem(produ);
        }
    }

    class PanelImagen extends JPanel {

        Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagen/Generales.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);

        }
    }
}
