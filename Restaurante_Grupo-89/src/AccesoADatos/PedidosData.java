
package AccesoADatos;

import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedidos;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PedidosData {
    private Connection con=null;

    public PedidosData() {
        con=Conexion.getConexion();
    }
    public void AgregarPedido(Pedidos pedido){
    String sql="INSERT INTO `pedido`(`idPedido`,`idProducto`,`idMesero`, `idMesa`) VALUES ('?','?','?','?')";
    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, pedido.getIdPedido());
        ps.setInt(2, pedido.getProducto().getIdProducto());
        ps.setInt(3, pedido.getMesero().getIdMesero());
        ps.setInt(4,pedido.getMesa().getIdMesa());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido Agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos ");
        }
    }
    
    public void ModificarPedido(Pedidos pedido){
     String sql = "UPDATE `pedido` SET `idPedido`=?,`idProducto`=?,`idMesero`=?, `idMesa`=? WHERE idPedido=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(2, pedido.getProducto().getIdProducto());
            ps.setInt(3, pedido.getMesero().getIdMesero());
            ps.setInt(4,pedido.getMesa().getIdMesa());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido " + ex.getMessage());
        }
    }
    
    public void EliminarPedido(int IdPedido){
      String sql="DELETE FROM `pedido` WHERE idPedido=?";
        try {
                PreparedStatement ps=con.prepareStatement(sql);
                ps.setInt(1, IdPedido);
                int res=ps.executeUpdate();
                if(res>0){
                System.out.println("Pedido Eliminado");
                }else{
                    System.out.println("Error al eliminar");  
                }
        } catch (SQLException ex) {
            Logger.getLogger(PedidosData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Pedidos> ListarPedidos() {
        ArrayList<Pedidos> pedidos = new ArrayList<>();
        try {
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM `pedido` ");
            while (rs.next()) {
                Pedidos pedido = new Pedidos();
                Producto producto = new Producto();
                Mesero mesero = new Mesero();
                Mesa mesa = new Mesa();
                
                pedido.setIdPedido(rs.getInt("IDMesa"));
                producto.setIdProducto(rs.getInt("IDProducto"));
                mesero.setIdMesero(rs.getInt("IDPedido"));
                mesa.setIdMesa(rs.getInt("IDMesa"));
                pedidos.add(pedido);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;
        
    }
}
