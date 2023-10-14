/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.MesaData;
import AccesoADatos.MeseroData;
import AccesoADatos.PedidosData;
import AccesoADatos.ProductoData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedidos;
import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bel
 */
public class AgregarPedido extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    double pre = 0.0;

    /**
     * Creates new form AgregarPedido
     */
    public AgregarPedido() {
        initComponents();
        armarCabecera();
        CargarComboMesa();
        CargarComboProducto();
        CargarComboHora();
        CargarComboCantidad();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbRealizarPedido = new javax.swing.JButton();
        jbAgregarProducto = new javax.swing.JButton();
        jcMesa = new javax.swing.JComboBox<>();
        jcProducto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jbEliminarProducto = new javax.swing.JButton();
        jtPrecioTotal = new javax.swing.JTextField();
        jcHora = new javax.swing.JComboBox<>();
        jcCantidad = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Haz Tu Pedido");

        jLabel2.setText("Mesa:");

        jLabel3.setText("Hora:");

        jLabel4.setText("Producto:");

        jLabel5.setText("Cantidad:");

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unidad", "Precio Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTabla);

        jbSalir.setText("Salir");

        jbRealizarPedido.setText("Realizar Pedido");
        jbRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizarPedidoActionPerformed(evt);
            }
        });

        jbAgregarProducto.setText("Agregar Producto");
        jbAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarProductoActionPerformed(evt);
            }
        });

        jLabel6.setText("Precio total:");

        jbEliminarProducto.setText("Eliminar Producto");
        jbEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarProductoActionPerformed(evt);
            }
        });

        jtPrecioTotal.setEditable(false);
        jtPrecioTotal.setText("0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcProducto, 0, 201, Short.MAX_VALUE)
                                    .addComponent(jcMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcHora, 0, 133, Short.MAX_VALUE)
                                    .addComponent(jcCantidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbRealizarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAgregarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminarProducto)
                        .addGap(106, 106, 106)))
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jcHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarProducto)
                    .addComponent(jbEliminarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbRealizarPedido)
                    .addComponent(jLabel6)
                    .addComponent(jtPrecioTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarProductoActionPerformed
        try {

            Mesa mesa = (Mesa) jcMesa.getSelectedItem();
            Producto pro = (Producto) jcProducto.getSelectedItem();
            String hora = (String) jcHora.getSelectedItem();
            int cantidad = Integer.parseInt(jcCantidad.getSelectedItem().toString());

            if (cantidad >= 1) {
                if (mesa != null && pro != null && hora != null) {
                    String nombreProducto = pro.getNombre();
                    double precio = pro.getPrecio();
                    double precioTotal = precio * (cantidad);
                    jcMesa.setEnabled(false);
                    jcHora.setEnabled(false);
                    modelo.addRow(new Object[]{nombreProducto, cantidad, precio, precioTotal});
                    jTabla.setModel(modelo);
                    int cantidadDisponible = pro.getCantidad();
                    cantidadDisponible = cantidadDisponible - cantidad;
                    jcCantidad.removeAllItems();
                    for (int i = 0; i <= cantidadDisponible; i++) {
                        jcCantidad.addItem(i);
                    }
                    pre = pre + precioTotal;
                    jtPrecioTotal.setText(String.valueOf(pre));
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione todos los campos");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione la cantidad de productos que desea agregar");
            }

        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese correctamente los datos");
        }

    }//GEN-LAST:event_jbAgregarProductoActionPerformed

    private void jbEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarProductoActionPerformed
        int filaS = jTabla.getSelectedRow();
        if (filaS == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una fila primero.");
            return;
        } else {

            try {
                double pre = Double.parseDouble(jtPrecioTotal.getText());
                double precioTotal = Double.parseDouble(modelo.getValueAt(filaS, 3).toString());
                pre -= precioTotal;
                jtPrecioTotal.setText(String.valueOf(pre));
                modelo.removeRow(filaS);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El campo de precio total no contiene un número válido.");
            }
        }
        if ((modelo.getRowCount() == 0)) {
            jcMesa.setEnabled(true);
            jcHora.setEnabled(true);
        }
    }//GEN-LAST:event_jbEliminarProductoActionPerformed

    private void jbRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizarPedidoActionPerformed
//        if (modelo.getRowCount() == 0) {
//        JOptionPane.showMessageDialog(null, "Ingrese productos para su pedido");
//        return;
//    } else {
//        Mesa mesa = (Mesa) jcMesa.getSelectedItem();
//        MesaData md = new MesaData();
//        PedidosData pd = new PedidosData();
//        ProductoData prd = new ProductoData();
//        MeseroData med = new MeseroData();
//
//        String hora = (String) jcHora.getSelectedItem();
//        int cantidad = Integer.parseInt(jcCantidad.getSelectedItem().toString());
//        int cont = modelo.getRowCount();
//
//        List<String> productos = new ArrayList<>();
//        for (int i = 0; i < cont; i++) {
//            Producto pro = (Producto) modelo.getValueAt(i, 0);;
//            String proNom = pro.getNombre();
//            productos.add(proNom);
//        }
//
//        Mesa mesaa = md.ObtenerMesaxID(mesa.getIdMesa());
//        Mesero mesero = med.ObtenerMesero(3);
//        boolean estado = true;
//
//        int nroPedido = 0;
//        List<Pedidos> listaPedidos = pd.ListarPedidos();
//
//        for (Pedidos pedido : listaPedidos) {
//            if (pedido.getNroPedido() > nroPedido) {
//                nroPedido = pedido.getNroPedido();
//            }
//        }
//
//        nroPedido++;
//
//        for (String nomP : productos) {
//            // Obtén el Producto a partir del nombre
//            Producto producto = (Producto) prd.obtenerProductosxNombre(nomP);
//            if (producto != null) {
//                pd.AgregarPedido(producto, mesa, mesero, estado, nroPedido);
//            }
//        }
//    }
    if (modelo.getRowCount() == 0) {
        JOptionPane.showMessageDialog(null, "Ingrese productos para su pedido");
        return;
    } else {
        Mesa mesa = (Mesa) jcMesa.getSelectedItem();
        MesaData md = new MesaData();
        PedidosData pd = new PedidosData();
        ProductoData prd = new ProductoData();
        MeseroData med = new MeseroData();

        String hora = (String) jcHora.getSelectedItem();
        int cantidad = Integer.parseInt(jcCantidad.getSelectedItem().toString());
        int cont = modelo.getRowCount();

        List<String> productos = new ArrayList<>();
        for (int i = 0; i < cont; i++) {
            String nombreProducto = (String) modelo.getValueAt(i, 0);
            productos.add(nombreProducto);
        }

        Mesa mesaa = md.ObtenerMesaxID(mesa.getIdMesa());
        Mesero mesero = med.ObtenerMesero(3);
        boolean estado = true;

        int nroPedido = 0;
        List<Pedidos> listaPedidos = pd.ListarPedidos();

        for (Pedidos pedido : listaPedidos) {
            if (pedido.getNroPedido() > nroPedido) {
                nroPedido = pedido.getNroPedido();
            }
        }

        nroPedido++;

        for (String nomP : productos) {
            // Obtén el Producto a partir del nombre
            Producto producto = (Producto) prd.obtenerProductosxNombre(nomP);
            if (producto != null) {
                pd.AgregarPedido(producto, mesa, mesero, estado, nroPedido);
            }
        }
    }
    }//GEN-LAST:event_jbRealizarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JButton jbAgregarProducto;
    private javax.swing.JButton jbEliminarProducto;
    private javax.swing.JButton jbRealizarPedido;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Integer> jcCantidad;
    private javax.swing.JComboBox<String> jcHora;
    private javax.swing.JComboBox<Mesa> jcMesa;
    private javax.swing.JComboBox<Producto> jcProducto;
    private javax.swing.JTextField jtPrecioTotal;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unidad");
        modelo.addColumn("Precio Total");
        jTabla.setModel(modelo);
    }

    public void CargarComboMesa() {
        jcMesa.removeAllItems();
        Mesa mesa = new Mesa();
        MesaData md = new MesaData();
        ArrayList<Mesa> lista = new ArrayList();
        List<Mesa> mes = md.ObtenerMesas();
        for (Mesa mesas : mes) {
            jcMesa.addItem(mesas);
        }
    }

    public void CargarComboProducto() {
        jcProducto.removeAllItems();
        Producto prod = new Producto();
        ProductoData pd = new ProductoData();
        ArrayList lista = new ArrayList();
        List<Producto> pro = pd.obtenerProductos();
        for (Producto prou : pro) {
            jcProducto.addItem(prou);
        }
    }

    public void CargarComboHora() {
        jcHora.removeAllItems();
        List<String> horas = new ArrayList<>();
        int horaInicial = 10;
        int horaFinal = 22;

        for (int hora = horaInicial; hora <= horaFinal; hora++) {
            String horaFormateada = String.format("%02d:00", hora);
            horas.add(horaFormateada);
        }

        for (String hor : horas) {
            jcHora.addItem(hor);
        }
    }

    public void CargarComboCantidad() {

        jcCantidad.removeAllItems();

        Producto pro = (Producto) jcProducto.getSelectedItem();
        if (pro != null) {
            int producto = pro.getCantidad();
            for (int i = 0; i <= producto; i++) {
                jcCantidad.addItem(i);
            }
        }

    }

    private void borrarFilas() {
        int f = jTabla.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
