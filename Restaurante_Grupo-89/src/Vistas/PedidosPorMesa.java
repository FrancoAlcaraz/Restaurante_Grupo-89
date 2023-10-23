package Vistas;

import AccesoADatos.MesaData;
import AccesoADatos.MeseroData;
import AccesoADatos.PedidosData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedidos;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PedidosPorMesa extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    JComboBox jestado = new JComboBox();
    PanelImagen fondo = new PanelImagen();

    public PedidosPorMesa() {
        this.setContentPane(fondo);
        initComponents();
        CargarCombo();
        cabecera();
        boxEstado();
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbnGrouppedidos = new javax.swing.ButtonGroup();
        jPanel1 = new PanelImagen();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePorMesa = new javax.swing.JTable();
        rbnRealizadas = new javax.swing.JRadioButton();
        rbnPendientes = new javax.swing.JRadioButton();
        jRefrescar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMesa = new javax.swing.JComboBox<>();

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pedidos por mesa");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mesa:");

        jTablePorMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pedido", "Precio", "Estado", "Mesero"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablePorMesa);

        rbnRealizadas.setBackground(new java.awt.Color(0, 204, 102));
        rbnGrouppedidos.add(rbnRealizadas);
        rbnRealizadas.setText("Pedidos Realizados");
        rbnRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnRealizadasActionPerformed(evt);
            }
        });

        rbnPendientes.setBackground(new java.awt.Color(0, 204, 102));
        rbnGrouppedidos.add(rbnPendientes);
        rbnPendientes.setText("Pedidos Pendientes");
        rbnPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPendientesActionPerformed(evt);
            }
        });

        jRefrescar.setBackground(new java.awt.Color(255, 255, 255));
        jRefrescar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jRefrescar.setText("Refrescar");
        jRefrescar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefrescarActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(255, 255, 255));
        jbModificar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(jRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(142, 142, 142)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbnRealizadas))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(rbnPendientes))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnRealizadas)
                    .addComponent(rbnPendientes))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
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

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        int fila = jTablePorMesa.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "Seleccione el pedido a modificar");
            return;
        }
        PedidosData pd = new PedidosData();
        List<Pedidos> lista = pd.ListarPedidos();
        boolean est = false;
        int nropedido = Integer.parseInt(jTablePorMesa.getValueAt(fila, 0).toString());
        for (Pedidos pedidos : lista) {
            int idproducto = pedidos.getProducto().getIdProducto();
            if (idproducto != -1 && nropedido == pedidos.getNroPedido()) {
                String estado = (String) jestado.getSelectedItem();

                if (estado.equalsIgnoreCase("Realizada")) {
                    est = true;
                } else if (estado.equalsIgnoreCase("Pendiente")) {
                    est = false;
                }
            }
            pd.ModificarEstado(est, nropedido, idproducto);

        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void rbnPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPendientesActionPerformed
        Mesa seleccionado = (Mesa) jMesa.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesa = seleccionado.getIdMesa();
            boolean estado = true;
            PedidosData pd = new PedidosData();

            List<Pedidos> lista = pd.ListarPedidos();
            if (rbnPendientes.isSelected()) {
                estado = false;
            }

            int nroPedidoProcesado = -1; // Variable para llevar un seguimiento del número de pedido actual
            double precioTotal = 0.0; // Variable para el precio total de productos en el mismo número de pedido
            String nombreMesero = ""; // Variable para el nombre del mesero
            int contadorProductos = 0; // Contador de productos en el pedido actual

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.isEstado() == estado && pedido.getMesa().getIdMesa() == idmesa) {
                    int nroPedido = pedido.getNroPedido();
                    if (nroPedido != nroPedidoProcesado) {
                        // Este es un nuevo número de pedido, agrega la información a la tabla y reinicia el contador de productos y el precio total
                        if (nroPedidoProcesado != -1) {
                            // Solo agrega el precio total si no es el primer número de pedido
                            modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal, contadorProductos, nombreMesero, "Pendiente"});
                        }
                        nroPedidoProcesado = nroPedido;
                        precioTotal = 0.0;
                        contadorProductos = 0;
                        nombreMesero = pedido.getMesero().getNombre();
                    }

                    Double precio = pedido.getProducto().getPrecio();
                    precioTotal += precio;
                    contadorProductos++;
                }
            }

            // Agrega la última entrada correspondiente al último número de pedido
            if (nroPedidoProcesado != -1) {
                modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal, contadorProductos, nombreMesero, "Pendiente"});
            }
        }
    }//GEN-LAST:event_rbnPendientesActionPerformed

    private void rbnRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnRealizadasActionPerformed
        Mesa seleccionado = (Mesa) jMesa.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesa = seleccionado.getIdMesa();
            boolean estado = true;
            PedidosData pd = new PedidosData();

            List<Pedidos> lista = pd.ListarPedidos();
            if (rbnRealizadas.isSelected()) {
                estado = true;
            }

            int nroPedidoProcesado = -1; // Variable para llevar un seguimiento del número de pedido actual
            double precioTotal = 0.0; // Variable para el precio total de productos en el mismo número de pedido
            String NombreMesero = ""; // Variable para el nombre del mesero
            int contadorProductos = 0; // Contador de productos en el pedido actual

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.isEstado() == estado && pedido.getMesa().getIdMesa() == idmesa) {
                    int nropedido = pedido.getNroPedido();
                    if (nropedido != nroPedidoProcesado) {
                        // Este es un nuevo número de pedido, agrega la información a la tabla y reinicia el contador de productos y el precio total
                        if (nroPedidoProcesado != -1) {
                            // Solo agrega el precio total si no es el primer número de pedido
                            modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal, contadorProductos, NombreMesero, "Realizada"});
                        }
                        nroPedidoProcesado = nropedido;
                        precioTotal = 0.0;
                        contadorProductos = 0;
                        NombreMesero = pedido.getMesero().getNombre();
                    }

                    Double precio = pedido.getProducto().getPrecio();
                    precioTotal += precio;
                    contadorProductos++;
                }
            }

            // Agrega la última entrada correspondiente al último número de pedido
            if (nroPedidoProcesado != -1) {
                modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal, contadorProductos, NombreMesero, "Realizada"});
            }
        }
    }//GEN-LAST:event_rbnRealizadasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefrescarActionPerformed
        Mesa seleccionado = (Mesa) jMesa.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesa = seleccionado.getIdMesa();
            PedidosData pd = new PedidosData();
            String estado = "_";
            List<Pedidos> lista = pd.ListarPedidos();

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.getMesa().getIdMesa() == idmesa) {
                    int nropedido = pedido.getNroPedido();
                    double precio = pedido.getProducto().getPrecio();
                    if (pedido.isEstado() == true) {
                        estado = "Realizada";
                    } else {
                        estado = "Pendiente";
                    }
                    String nombreMesero = pedido.getMesero().getNombre();

                    modelo.addRow(new Object[]{nropedido, precio, estado, nombreMesero});
                }

            }

        }
    }//GEN-LAST:event_jRefrescarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<Mesa> jMesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jRefrescar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePorMesa;
    private javax.swing.JButton jbModificar;
    private javax.swing.ButtonGroup rbnGrouppedidos;
    private javax.swing.JRadioButton rbnPendientes;
    private javax.swing.JRadioButton rbnRealizadas;
    // End of variables declaration//GEN-END:variables

    private void CargarCombo() {
        MesaData md = new MesaData();
        List<Mesa> lista = md.ObtenerMesas();
        for (Mesa mesa : lista) {
            jMesa.addItem(mesa);
        }
    }

    private void cabecera() {
        modelo.addColumn("NroPedido");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad de productos");
        modelo.addColumn("Nombre Mesero");
        modelo.addColumn("Estado");

        jTablePorMesa.setModel(modelo);
    }

    private void boxEstado() {
        MeseroData pd = new MeseroData();
        List<Mesero> dato = pd.obtenerProductos();
        String estado[] = new String[2];
        estado[0] = "Realizada";
        estado[1] = "Pendiente";
        jestado.addItem(estado[0]);
        jestado.addItem(estado[1]);
        jTablePorMesa.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(jestado));
    }

}
