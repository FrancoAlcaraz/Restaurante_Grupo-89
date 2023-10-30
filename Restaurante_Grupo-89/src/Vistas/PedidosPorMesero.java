/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesoADatos.MeseroData;
import AccesoADatos.PedidosData;
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
    DefaultTableModel modelo = new DefaultTableModel(){
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

        jMesero.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
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
        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("Mesero:");

        jTablePorMesa.setAutoCreateRowSorter(true);
        jTablePorMesa.setBackground(new java.awt.Color(255, 227, 191));
        jTablePorMesa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
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
        rbnRealizadas.setText("Pedidos Realizados");
        rbnRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnRealizadasActionPerformed(evt);
            }
        });

        rbnPendientes.setBackground(new java.awt.Color(255, 255, 255));
        rbnGrouppedidos.add(rbnPendientes);
        rbnPendientes.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        rbnPendientes.setText("Pedidos Pendientes");
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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(496, 496, 496)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jLabel1)))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(35, 35, 35)
                        .addComponent(jMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbnRealizadas)
                        .addGap(20, 20, 20)
                        .addComponent(rbnPendientes)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbnRealizadas)
                        .addComponent(rbnPendientes)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

                // Modifica el estado de cada pedido con el mismo número de pedido
                pd.ModificarEstado(est, nropedido );
            }
        }
        JOptionPane.showMessageDialog(null, "El estado del pedido se ha modificado correctamente.");
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeseroActionPerformed
        // TODO add your handling code here:
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
            List<Pedidos> lista = pd.ListarPedidos();

            int nroPedidoProcesado = -1;
            double precioTotal = 0.0;
            int NroMesa = 0;
            int contadorProductos = 0;

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.getMesero().getIdMesero() == idmesero) {
                    int nroPedido = pedido.getNroPedido();
                    if (nroPedido != nroPedidoProcesado) {
                        if (nroPedidoProcesado != -1) {
                            String estadoPedido = pedido.isEstado() ? "Realizado" : "Pendiente";
                            modelo.addRow(new Object[]{nroPedidoProcesado,
                                precioTotal, contadorProductos, NroMesa, estadoPedido});
                        }
                        nroPedidoProcesado = nroPedido;
                        precioTotal = 0.0;
                        contadorProductos = 0;
                        NroMesa = pedido.getMesa().getNumero();
                    }

                    Double precio = pedido.getProducto().getPrecio();
                    precioTotal += precio;
                    contadorProductos++;
                }
            }

            if (nroPedidoProcesado != -1) {
                String estadoPedido = lista.get(lista.size() - 1).isEstado() ? "Realizado" : "Pendiente";
                modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal,
                    contadorProductos, NroMesa, estadoPedido});
            }
        }
    }
    
    private void pendiente() {
        Mesero seleccionado = (Mesero) jMesero.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesa = seleccionado.getIdMesero();
            boolean estado = true;
            PedidosData pd = new PedidosData();

            List<Pedidos> lista = pd.ListarPedidos();
            if (rbnPendientes.isSelected()) {
                estado = false;
            }

            int nroPedidoProcesado = -1; 
            double precioTotal = 0.0; 
            int NroMesa = 0; 
            int contadorProductos = 0; 

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.isEstado() == estado && pedido.getMesero().getIdMesero() == idmesa) {
                    int nroPedido = pedido.getNroPedido();
                    if (nroPedido != nroPedidoProcesado) {
                        if (nroPedidoProcesado != -1) {
                            modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal, contadorProductos, NroMesa, "Pendiente"});
                        }
                        nroPedidoProcesado = nroPedido;
                        precioTotal = 0.0;
                        contadorProductos = 0;
                        NroMesa = pedido.getMesa().getNumero();
                    }

                    Double precio = pedido.getProducto().getPrecio();
                    precioTotal += precio;
                    contadorProductos++;
                }
            }
            if (nroPedidoProcesado != -1) {
                modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal, contadorProductos, NroMesa, "Pendiente"});
            }
        }
    }

    private void realizado() {
        Mesero seleccionado = (Mesero) jMesero.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesero = seleccionado.getIdMesero();
            boolean estado = true;
            PedidosData pd = new PedidosData();

            List<Pedidos> lista = pd.ListarPedidos();
            if (rbnRealizadas.isSelected()) {
                estado = true;
            }
            int nroPedidoProcesado = -1; 
            double precioTotal = 0.0; 
            int NroMesa = 0;
            int contadorProductos = 0; 

            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.isEstado() == estado && pedido.getMesero().getIdMesero() == idmesero) {
                    int nropedido = pedido.getNroPedido();
                    if (nropedido != nroPedidoProcesado) {
                        if (nroPedidoProcesado != -1) {
                            modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal, contadorProductos, NroMesa, "Realizada"});
                        }
                        nroPedidoProcesado = nropedido;
                        precioTotal = 0.0;
                        contadorProductos = 0;
                        NroMesa = pedido.getMesa().getNumero();
                    }
                    
                    Double precio = pedido.getProducto().getPrecio();
                    precioTotal += precio;
                    contadorProductos++;
                }
            }
            if (nroPedidoProcesado != -1) {
                modelo.addRow(new Object[]{nroPedidoProcesado, precioTotal, contadorProductos, NroMesa, "Realizada"});
            }
        }
    }
}
