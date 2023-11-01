package Vistas;

import AccesoADatos.MesaData;
import AccesoADatos.MeseroData;
import AccesoADatos.PedidosData;
import Entidades.Mesa;
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

    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int fila, int columna) {
            if (columna == 4) {
                return true;
            }
            return false;
        }
    };
    JComboBox jestado = new JComboBox();
    PanelImagen fondo = new PanelImagen();

    public PedidosPorMesa() {
        this.setContentPane(fondo);
        initComponents();
        CargarCombo();
        cabecera();
        boxEstado();
        mostrar();
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
        jbModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMesa = new javax.swing.JComboBox<>();

        setClosable(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Pedidos por mesa");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/MesasYSillas.png"))); // NOI18N
        jLabel2.setText("Mesa:");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        jTablePorMesa.setAutoCreateRowSorter(true);
        jTablePorMesa.setBackground(new java.awt.Color(255, 227, 191));
        jTablePorMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTablePorMesa.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jTablePorMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Pedido", "Precio", "Cantidad de Productos", "Mesero", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePorMesa.setGridColor(new java.awt.Color(255, 153, 153));
        jTablePorMesa.setSelectionBackground(new java.awt.Color(255, 153, 153));
        jTablePorMesa.setSelectionForeground(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(jTablePorMesa);

        rbnRealizadas.setBackground(new java.awt.Color(255, 255, 255));
        rbnGrouppedidos.add(rbnRealizadas);
        rbnRealizadas.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        rbnRealizadas.setText("Pedidos Realizados");
        rbnRealizadas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbnRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnRealizadasActionPerformed(evt);
            }
        });

        rbnPendientes.setBackground(new java.awt.Color(255, 255, 255));
        rbnGrouppedidos.add(rbnPendientes);
        rbnPendientes.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        rbnPendientes.setText("Pedidos Pendientes");
        rbnPendientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbnPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPendientesActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(255, 255, 255));
        jbModificar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMesa.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jMesa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMesa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMesaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jMesa, 0, 198, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(rbnRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbnPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbnRealizadas)
                    .addComponent(rbnPendientes))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
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
        boolean est = false;
        int nropedido = Integer.parseInt(jTablePorMesa.getValueAt(fila, 0).toString());

        List<Pedidos> lista = pd.ListarPedidos();
        for (Pedidos pedido : lista) {
            if (nropedido == pedido.getNroPedido()) {
                String estado = (String) jestado.getSelectedItem();

                if (estado.equalsIgnoreCase("Realizada")) {
                    est = true;
                } else if (estado.equalsIgnoreCase("Pendiente")) {
                    est = false;
                }

                pd.ModificarEstado(est, nropedido);

            }
        }
        JOptionPane.showMessageDialog(null, "El estado del pedido se ha modificado correctamente.");

    }//GEN-LAST:event_jbModificarActionPerformed

    private void rbnPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPendientesActionPerformed
        pendiente();
    }//GEN-LAST:event_rbnPendientesActionPerformed

    private void rbnRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnRealizadasActionPerformed
        realizado();
    }//GEN-LAST:event_rbnRealizadasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMesaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMesaItemStateChanged
        if (rbnRealizadas.isSelected() && !rbnPendientes.isSelected()) {
            realizado();
        } else if (rbnPendientes.isSelected() && !rbnRealizadas.isSelected()) {
            pendiente();
        } else {
            mostrar();
        }
    }//GEN-LAST:event_jMesaItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<Mesa> jMesa;
    private javax.swing.JPanel jPanel1;
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
        String estado[] = new String[2];
        estado[0] = "Realizada";
        estado[1] = "Pendiente";
        jestado.addItem(estado[0]);
        jestado.addItem(estado[1]);
        jTablePorMesa.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(jestado));
    }

    public void mostrar() {
        Mesa seleccionado = (Mesa) jMesa.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesa = seleccionado.getIdMesa();
            PedidosData pd = new PedidosData();
            List<Pedidos> lista = pd.ListarPedidos();

            int nroPedidoProcesado = -1;
            double precioTotal = 0.0;
            String nombreMesero = "";
            int contadorProductos = 0;

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.getMesa().getIdMesa() == idmesa) {
                    int nroPedido = pedido.getNroPedido();
                    if (nroPedido != nroPedidoProcesado) {
                        if (nroPedidoProcesado != -1) {
                            String estadoPedido = pedido.isEstado() ? "Realizado" : "Pendiente";
                            modelo.addRow(new Object[]{nroPedidoProcesado,
                                precioTotal, contadorProductos, nombreMesero, estadoPedido});
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

            if (nroPedidoProcesado != -1) {
                String estadoPedido = lista.get(lista.size() - 1).isEstado() ? "Realizado" : "Pendiente";
                modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal,
                    contadorProductos, nombreMesero, estadoPedido});
            }
        }
    }

    private void pendiente() {
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

            int nroPedidoProcesado = -1;
            double precioTotal = 0.0;
            String nombreMesero = "";
            int contadorProductos = 0;

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.isEstado() == estado
                        && pedido.getMesa().getIdMesa() == idmesa) {
                    int nroPedido = pedido.getNroPedido();
                    if (nroPedido != nroPedidoProcesado) {
                        if (nroPedidoProcesado != -1) {
                            modelo.addRow(new Object[]{nroPedidoProcesado,
                                precioTotal, contadorProductos, nombreMesero,
                                "Pendiente"});
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
            if (nroPedidoProcesado != -1) {
                modelo.addRow(new Object[]{nroPedidoProcesado,
                    precioTotal, contadorProductos, nombreMesero, "Pendiente"});
            }
        }
    }

    private void realizado() {
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
            int nroPedidoProcesado = -1;
            double precioTotal = 0.0;
            String NombreMesero = "";
            int contadorProductos = 0;

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.isEstado() == estado
                        && pedido.getMesa().getIdMesa() == idmesa) {
                    int nropedido = pedido.getNroPedido();
                    if (nropedido != nroPedidoProcesado) {
                        if (nroPedidoProcesado != -1) {
                            modelo.addRow(new Object[]{nroPedidoProcesado,
                                precioTotal, contadorProductos, NombreMesero,
                                "Realizada"});
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
            if (nroPedidoProcesado != -1) {
                modelo.addRow(new Object[]{nroPedidoProcesado,
                    precioTotal, contadorProductos, NombreMesero, "Realizada"});
            }
        }
    }
}
