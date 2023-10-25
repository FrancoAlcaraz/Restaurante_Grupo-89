package AccesoADatos;

import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Pedidos;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
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
    String sql = "INSERT INTO `pedido`(`idProducto`, `idMesero`, `idMesa`, `estado`, `nroPedido`, `cantidadProducto`, `fecha`, `hora`) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, pedido.getProducto().getIdProducto());
        ps.setInt(2, pedido.getMesero().getIdMesero());
        ps.setInt(3, pedido.getMesa().getIdMesa());
        ps.setBoolean(4, pedido.isEstado());
        ps.setInt(5, pedido.getNroPedido());
        ps.setInt(6, pedido.getCantidadProducto());
        ps.setDate(7, Date.valueOf(pedido.getFecha()));
        ps.setTime(8, Time.valueOf(pedido.getHora()));

        ps.executeUpdate();
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos: " + ex.getMessage());
    }
}

    public void ModificarPedido(Pedidos pedido) {
        if (!pedido.isEstado()) {
            JOptionPane.showMessageDialog(null, "El pedido está inactivo y no se puede modificar.");
            return;
        }
        String sql = "UPDATE `pedido` SET `idPedido`=?,`idProducto`=?,"
                + "`idMesero`=?,`idMesa`=?,"
                + "' WHERE estado=? and `nroPedido`='? ";

        PreparedStatement ps = null;
        try {
            PreparedStatement psI = con.prepareStatement(sql);

            psI.setInt(1, pedido.getIdPedido());
            psI.setInt(2, pedido.getProducto().getIdProducto());
            psI.setInt(3, pedido.getMesero().getIdMesero());
            psI.setInt(4, pedido.getMesa().getIdMesa());
            psI.setBoolean(5, pedido.isEstado());
            int exito = psI.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El pedido no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedido " + ex.getMessage());
        }
    }

    public void ModificarEstado(boolean estado, int nroPedido) {
        String sql = "UPDATE `pedido` SET `estado`=? WHERE `nroPedido`=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, estado);
            ps.setInt(2, nroPedido);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Estado del Pedido Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Pedido no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de pedidos generales " + ex.getMessage());
        }
    }

    public void EliminarPedido(int nroPedido) {
        String sql = "DELETE FROM `pedido` WHERE nroPedido=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nroPedido);
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
                pedido.setIdPedido(rs.getInt("idPedido"));
                pedido.setEstado(rs.getBoolean("estado"));
                pedido.setNroPedido(rs.getInt("nroPedido"));
                pedido.setCantidadProducto(rs.getInt("cantidadProducto"));
                pedido.setFecha(rs.getDate("fecha").toLocalDate());
                pedido.setHora(rs.getTime("hora").toLocalTime());
                pedido.setMesa(mesa);
                pedido.setMesero(mesero);
                pedido.setProducto(prod);
                
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido " + ex.getMessage());
        }
        return pedidos;

    }

}
