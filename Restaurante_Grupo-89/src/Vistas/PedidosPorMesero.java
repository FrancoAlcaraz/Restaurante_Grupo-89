/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Bel
 */
public class PedidosPorMesero extends javax.swing.JInternalFrame {

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

    public PedidosPorMesero() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbnGrouppedidos = new javax.swing.ButtonGroup();
        jPanel2 = new PanelImagen();
        jMesero = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePorMesa = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rbnRealizadas = new javax.swing.JRadioButton();
        rbnPendientes = new javax.swing.JRadioButton();

        setClosable(true);

        jMesero.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jMesero.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMeseroItemStateChanged(evt);
            }
        });
        jMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeseroActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Pedidos por mesero");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/camarero.png"))); // NOI18N
        jLabel2.setText("Mesero:");
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
                "Pedido", "Precio", "Cantidad de Productos", "Mesa", "Estado"
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

        rbnRealizadas.setBackground(new java.awt.Color(255, 255, 255));
        rbnGrouppedidos.add(rbnRealizadas);
        rbnRealizadas.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        rbnRealizadas.setText("Pedidos Pendientes");
        rbnRealizadas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbnRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnRealizadasActionPerformed(evt);
            }
        });

        rbnPendientes.setBackground(new java.awt.Color(255, 255, 255));
        rbnGrouppedidos.add(rbnPendientes);
        rbnPendientes.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        rbnPendientes.setText("Pedidos Realizados");
        rbnPendientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbnPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPendientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbnPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(rbnRealizadas))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(59, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jMesero)
                        .addComponent(rbnRealizadas)
                        .addComponent(rbnPendientes))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeseroActionPerformed

    }//GEN-LAST:event_jMeseroActionPerformed

    private void jMeseroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMeseroItemStateChanged
        if (rbnRealizadas.isSelected() && !rbnPendientes.isSelected()) {
            realizado();
        } else if (rbnPendientes.isSelected() && !rbnRealizadas.isSelected()) {
            pendiente();
        } else {
            mostrar();
        }
    }//GEN-LAST:event_jMeseroItemStateChanged

    private void rbnRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnRealizadasActionPerformed
        realizado();
    }//GEN-LAST:event_rbnRealizadasActionPerformed

    private void rbnPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPendientesActionPerformed
        pendiente();
    }//GEN-LAST:event_rbnPendientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<Mesero> jMesero;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePorMesa;
    private javax.swing.JButton jbModificar;
    private javax.swing.ButtonGroup rbnGrouppedidos;
    private javax.swing.JRadioButton rbnPendientes;
    private javax.swing.JRadioButton rbnRealizadas;
    // End of variables declaration//GEN-END:variables

    private void cabecera() {
        modelo.addColumn("Nro Pedido");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad de productos");
        modelo.addColumn("Nro Mesa");
        modelo.addColumn("Estado");

        jTablePorMesa.setModel(modelo);
    }

    private void boxEstado() {
        MeseroData pd = new MeseroData();
        List<Mesero> dato = pd.obtenerMeseros();
        String estado[] = new String[2];
        estado[0] = "Realizada";
        estado[1] = "Pendiente";
        jestado.addItem(estado[0]);
        jestado.addItem(estado[1]);
        jTablePorMesa.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(jestado));
    }

    private void CargarCombo() {
        MeseroData md = new MeseroData();
        List<Mesero> lista = md.obtenerMeseros();
        for (Mesero mesero : lista) {
            jMesero.addItem(mesero);
        }
    }

    public void mostrar() {
        Mesero seleccionado = (Mesero) jMesero.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesero = seleccionado.getIdMesero();
            PedidosData pd = new PedidosData();
            MesaData md = new MesaData();
            List<Pedidos> lista = pd.ListarPedidos();
            List<Mesa> listamesa = md.ObtenerMesas();

            for (int i = 0; i < lista.size(); i++) {
                Pedidos pedido = lista.get(i);
                if (pedido.getMesero().getIdMesero() == idmesero) {
                    int nroPedido = pedido.getNroPedido();
                    boolean yaProcesado = false;

                    for (int j = 0; j < i; j++) {
                        if (lista.get(j).getNroPedido() == nroPedido) {
                            yaProcesado = true;
                            break;
                        }
                    }
                    if (!yaProcesado) {
                        for (Mesa mesa : listamesa) {
                            if (mesa != null && pedido.getMesa().getIdMesa() == mesa.getIdMesa()) {
                                int NroMesa = mesa.getNumero();
                                String estadoPedido = pedido.isEstado() ? "Realizado" : "Pendiente";
                                double precioTotal = 0.0;
                                int contadorProductos = 0;

                                for (Pedidos pedido2 : lista) {
                                    if (pedido2.getNroPedido() == nroPedido) {
                                        Double precio = pedido2.getProducto().getPrecio();
                                        precioTotal += precio;
                                        contadorProductos++;
                                    }
                                }
                                modelo.addRow(new Object[]{nroPedido, precioTotal,
                                    contadorProductos, NroMesa, estadoPedido});
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private void pendiente() {
        Mesero seleccionado = (Mesero) jMesero.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesero = seleccionado.getIdMesero();
            PedidosData pd = new PedidosData();
            MesaData md = new MesaData();
            List<Pedidos> lista = pd.ListarPedidos();
            List<Mesa> listamesa = md.ObtenerMesas();

            for (int i = 0; i < lista.size(); i++) {
                Pedidos pedido = lista.get(i);
                if (pedido.getMesero().getIdMesero() == idmesero && pedido.isEstado()) {
                    int nroPedido = pedido.getNroPedido();
                    boolean yaProcesado = false;

                    for (int j = 0; j < i; j++) {
                        if (lista.get(j).getNroPedido() == nroPedido) {
                            yaProcesado = true;
                            break;
                        }
                    }
                    if (!yaProcesado) {
                        for (Mesa mesa : listamesa) {
                            if (mesa != null && pedido.getMesa().getIdMesa() == mesa.getIdMesa()) {
                                int NroMesa = mesa.getNumero();
                                String estadoPedido = "Realizado";
                                double precioTotal = 0.0;
                                int contadorProductos = 0;

                                for (Pedidos pedido2 : lista) {
                                    if (pedido2.getNroPedido() == nroPedido) {
                                        Double precio = pedido2.getProducto().getPrecio();
                                        precioTotal += precio;
                                        contadorProductos++;
                                    }
                                }
                                modelo.addRow(new Object[]{nroPedido, precioTotal,
                                    contadorProductos, NroMesa, estadoPedido});
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private void realizado() {
        Mesero seleccionado = (Mesero) jMesero.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesero = seleccionado.getIdMesero();
            PedidosData pd = new PedidosData();
            MesaData md = new MesaData();
            List<Pedidos> lista = pd.ListarPedidos();
            List<Mesa> listamesa = md.ObtenerMesas();

            for (int i = 0; i < lista.size(); i++) {
                Pedidos pedido = lista.get(i);
                if (pedido.getMesero().getIdMesero() == idmesero && !pedido.isEstado()) {
                    int nroPedido = pedido.getNroPedido();
                    boolean yaProcesado = false;

                    for (int j = 0; j < i; j++) {
                        if (lista.get(j).getNroPedido() == nroPedido) {
                            yaProcesado = true;
                            break;
                        }
                    }
                    if (!yaProcesado) {
                        for (Mesa mesa : listamesa) {
                            if (mesa != null && pedido.getMesa().getIdMesa() == mesa.getIdMesa()) {
                                int NroMesa = mesa.getNumero();
                                String estadoPedido = "Pendiente";
                                double precioTotal = 0.0;
                                int contadorProductos = 0;

                                for (Pedidos pedido2 : lista) {
                                    if (pedido2.getNroPedido() == nroPedido) {
                                        Double precio = pedido2.getProducto().getPrecio();
                                        precioTotal += precio;
                                        contadorProductos++;
                                    }
                                }
                                modelo.addRow(new Object[]{nroPedido, precioTotal,
                                    contadorProductos, NroMesa, estadoPedido});
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
