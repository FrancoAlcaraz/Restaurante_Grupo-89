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
import javax.swing.JOptionPane;

public class PedidosData {

    private Connection con = null;
    MesaData md = new MesaData();
    MeseroData meserodata = new MeseroData();
    ProductoData data = new ProductoData();

    public PedidosData() {
        con = Conexion.getConexion();
    }

    public void AgregarPedido(Pedidos pedido) {
        String sql = "INSERT INTO `pedido`(`idPedido`,`idProducto`,`idMesero`, `idMesa`) VALUES ('?','?','?','?')";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getIdPedido());
            ps.setInt(3, pedido.getMesero().getIdMesero());
            ps.setInt(4, pedido.getMesa().getIdMesa());
            for (Producto producto : pedido.getProducto()) {
                ps.setInt(2, producto.getIdProducto());
                ps.executeUpdate();
            }
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

    public void ModificarPedido(Pedidos pedido) {
        String sqlE = "DELETE FROM `pedido` WHERE idPedido = ?";
        String sqlI = "INSERT INTO `pedido`(`idPedido`,`idProducto`,`idMesero`, `idMesa`) VALUES (?,?,?,?)";

        PreparedStatement ps = null;
        try {
            // Eliminar todos los productos asociados al pedido
            PreparedStatement psE = con.prepareStatement(sqlE);
            psE.setInt(1, pedido.getIdPedido());
            psE.executeUpdate();
            psE.close();

            // Insertar los nuevos productos al pedido
            PreparedStatement psI = con.prepareStatement(sqlI);

            for (Producto producto : pedido.getProducto()) {
                psI.setInt(1, pedido.getIdPedido());
                psI.setInt(2, producto.getIdProducto());
                psI.setInt(3, pedido.getMesero().getIdMesero());
                psI.setInt(4, pedido.getMesa().getIdMesa());
                int exito = psI.executeUpdate();
                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "El pedido no existe");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido " + ex.getMessage());
        }
    }

    public void EliminarPedido(int IdPedido) {
        String sql = "DELETE FROM `pedido` WHERE idPedido=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdPedido);
            int res = ps.executeUpdate();
            if (res > 0) {
                System.out.println("Pedido Eliminado");
            } else {
                System.out.println("Error al eliminar");
            }
        } catch (SQLException ex) {
            System.out.println("error al ingresar la tabla pedido");
        }
    }

    public List<Pedidos> ListarPedidos() {
        ArrayList<Pedidos> pedidos = new ArrayList<>();
        try {
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM `pedido` ");
            while (rs.next()) {
                Pedidos pedido = new Pedidos();
                Mesero mesero = meserodata.ObtenerMesero(rs.getInt("idMesero"));
                Mesa mesa = md.ObtenerMesaxID(rs.getInt("idMesa"));
                Producto prod = data.obtenerProductosxID(rs.getInt("idProducto"));
                pedido.setIdPedido(rs.getInt("IDPedido"));
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;

    }
}
