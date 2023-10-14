
package Vistas;

import AccesoADatos.MesaData;
import AccesoADatos.MeseroData;
import AccesoADatos.PedidosData;
import AccesoADatos.ProductoData;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedidos;
import Entidades.Producto;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;


public class PedidosPorMesa extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
JComboBox jproducto=new JComboBox();
JComboBox jmesero=new JComboBox();
    public PedidosPorMesa() {
        initComponents();
        CargarCombo();
        cabecera();
        boxMesero();
        boxProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbnGrouppedidos = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMesa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePorMesa = new javax.swing.JTable();
        rbnRealizadas = new javax.swing.JRadioButton();
        rbnPendientes = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pedidos por mesa");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mesa");

        jMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMesaActionPerformed(evt);
            }
        });

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

        rbnGrouppedidos.add(rbnRealizadas);
        rbnRealizadas.setText("Pedidos Realizados");
        rbnRealizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnRealizadasActionPerformed(evt);
            }
        });

        rbnGrouppedidos.add(rbnPendientes);
        rbnPendientes.setText("Pedidos Pendientes");
        rbnPendientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPendientesActionPerformed(evt);
            }
        });

        jButton2.setText("actualizar");

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Salir");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(rbnRealizadas)
                                .addGap(65, 65, 65)
                                .addComponent(rbnPendientes))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnRealizadas)
                    .addComponent(rbnPendientes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
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

    private void jMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMesaActionPerformed

        Mesa seleccionado = (Mesa) jMesa.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesa = seleccionado.getIdMesa();
            PedidosData pd = new PedidosData();
            String estado ="_";
            List<Pedidos> lista = pd.obtenerPedidosPorMesa(idmesa);
            for (Pedidos pedido : lista) {
                if (pedido != null) {
                    int idpedido = pedido.getIdPedido();
                   String NombreMesero = pedido.getMesero().getNombre();
                   Double precio=pedido.getProducto1().getPrecio();
                    String idProducto = pedido.getProducto1().getNombre();
                    if(pedido.isEstado()==true){
                    estado="Realizada";
                    }else{
                    estado="Pendiente";
                    }
                        
                    modelo.addRow(new Object[]{idpedido, idProducto, NombreMesero,precio, estado});
                }

            }

        }
    }//GEN-LAST:event_jMesaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rbnPendientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPendientesActionPerformed
        Mesa seleccionado = (Mesa) jMesa.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesa = seleccionado.getIdMesa();
            boolean estado=true;
            PedidosData pd = new PedidosData();
            String estado1 ="_";
            List<Pedidos> lista = pd.obtenerPedidosPorMesa(idmesa);
            if(rbnPendientes.isSelected()){
            estado=false;
            }
            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.isEstado()==estado) {
                    int idpedido = pedido.getIdPedido();
                    String NombreMesero = pedido.getMesero().getNombre();
                    Double precio=pedido.getProducto1().getPrecio();
                    String idProducto = pedido.getProducto1().getNombre();
                    if(pedido.isEstado()==true){
                    estado1="Realizada";
                    }else{
                    estado1="Pendiente";
                    }
                    modelo.addRow(new Object[]{idpedido, idProducto, NombreMesero,precio, estado1});
                }
            }
        }
        
    }//GEN-LAST:event_rbnPendientesActionPerformed

    private void rbnRealizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnRealizadasActionPerformed

        Mesa seleccionado = (Mesa) jMesa.getSelectedItem();
        if (seleccionado != null) {
            modelo.setRowCount(0);
            int idmesa = seleccionado.getIdMesa();
            boolean estado=true;
            PedidosData pd = new PedidosData();
            String estado1 ="_";
            List<Pedidos> lista = pd.obtenerPedidosPorMesa(idmesa);
            if(rbnRealizadas.isSelected()){
            estado=true;
            }
            for (Pedidos pedido : lista) {
                if (pedido != null && pedido.isEstado()==estado) {
                    int idpedido = pedido.getIdPedido();
                    String NombreMesero = pedido.getMesero().getNombre();
                    Double precio=pedido.getProducto1().getPrecio();
                    String idProducto = pedido.getProducto1().getNombre();
                    if(pedido.isEstado()==true){
                    estado1="Realizada";
                    }else{
                    estado1="Pendiente";
                    }
                        
                    modelo.addRow(new Object[]{idpedido, idProducto, NombreMesero,precio, estado1});
                }

            }

        }
        
    }//GEN-LAST:event_rbnRealizadasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<Mesa> jMesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePorMesa;
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
        modelo.addColumn("Pedido");
        modelo.addColumn("Nombre producto");
        modelo.addColumn("Nombre Mesero");
        modelo.addColumn("Precio");
        modelo.addColumn("Estado");
     jTablePorMesa.setModel(modelo);
    }
    
    private void boxProducto() {
ProductoData pd=new ProductoData();
List<Producto> dato=pd.obtenerProductos();

        for (Producto dato1 : dato) {
            jproducto.addItem(dato1);
        }
        jTablePorMesa.getColumnModel().getColumn(1).setCellEditor(new DefaultCellEditor(jproducto));
    }
    
    private void boxMesero() {
MeseroData pd=new MeseroData();
List<Mesero> dato=pd.obtenerProductos();

        for (Mesero dato1 : dato) {
            jmesero.addItem(dato1);
        }
        jTablePorMesa.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(jmesero));
    }
}
