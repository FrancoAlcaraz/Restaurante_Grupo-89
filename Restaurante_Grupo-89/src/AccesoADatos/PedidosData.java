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
    String sql = "INSERT INTO `pedido`(`idMesero`, `idMesa`, `estado`) VALUES (?, ?, ?)";
    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, pedido.getMesero().getIdMesero());
        ps.setInt(2, pedido.getMesa().getIdMesa());
        ps.setBoolean(3, pedido.isEstado());

        int exito = ps.executeUpdate();
        if (exito == 1) {
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pedido Agregado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al agregar el pedido.");
        }

        ps.close();
    } catch (SQLException ex) {
        // Maneja la excepción adecuadamente, por ejemplo, registra el error o muestra un mensaje más informativo.
        JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos: " + ex.getMessage());
    }
}

    public void ModificarPedido(Pedidos pedido) {
        if (!pedido.isEstado()) {
            JOptionPane.showMessageDialog(null, "El pedido está inactivo y no se puede modificar.");
            return;
        }
        String sqlE = "DELETE FROM `pedido` WHERE idPedido = ? and estado=?";
        String sqlI = "INSERT INTO `pedido`(`idPedido`,`idProducto`,`idMesero`, `idMesa`,estado) VALUES (?,?,?,?,?)";

        PreparedStatement ps = null;
        try {
            // Eliminar todos los productos asociados al pedido
            PreparedStatement psE = con.prepareStatement(sqlE);
            psE.setInt(1, pedido.getIdPedido());
            psE.setBoolean(2, pedido.isEstado());
            psE.executeUpdate();
            psE.close();

            // Insertar los nuevos productos al pedido
            PreparedStatement psI = con.prepareStatement(sqlI);

            for (Producto producto : pedido.getProducto()) {
                psI.setInt(1, pedido.getIdPedido());
                psI.setInt(2, producto.getIdProducto());
                psI.setInt(3, pedido.getMesero().getIdMesero());
                psI.setInt(4, pedido.getMesa().getIdMesa());
                psI.setBoolean(5, pedido.isEstado());
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

    public void ModificarEstado(Pedidos pedido) {
        String sql = "UPDATE `pedidos` SET estado = ? WHERE `idPedido` = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, !pedido.isEstado()); // Cambia el estado actual
            ps.setInt(2, pedido.getIdPedido());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Estado del Mesero Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El mesero no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
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
   
    public List<Pedidos> obtenerPedidosPorMesa(int idMesa) {
        ArrayList<Pedidos> pedidos = new ArrayList<>();
        String sql = "SELECT `idPedido`, `idProducto`, `idMesero`, `idMesa`, `estado` FROM `pedido` WHERE idMesa=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                 Pedidos pedido = new Pedidos();
                Mesero mesero = meserodata.ObtenerMesero(rs.getInt("idMesero"));
                Mesa mesa = md.ObtenerMesaxID(rs.getInt("idMesa"));
                Producto prod = data.obtenerProductosxID(rs.getInt("idProducto"));
                pedido.setIdPedido(rs.getInt("IDPedido"));
                pedido.setMesero(mesero);
                pedido.setMesa(mesa);
                pedido.setProducto1(prod);
                pedido.setEstado(rs.getBoolean("estado"));
                pedidos.add(pedido);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar por mesa" + ex.getMessage());
        }
        return pedidos;
    }
}
