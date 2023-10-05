package AccesoADatos;

import Entidades.Categoria;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProductoData {

    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();

    }

    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO 'producto'('nombre','cantidad','precio','categoria')"
                + " VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getIdProducto());
            ps.setObject(4, producto.getCategoria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto ingresado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingreso de la base de datos producto:" + ex);

        }

    }

    public List<Producto> obtenerProductos() {
        ArrayList<Producto> prod = new ArrayList<>();
        String sql = "SELECT * FROM 'producto' WHERE idProducto=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Producto producto = new Producto();
                producto.getIdProducto();
                producto.getNombre();
                producto.getPrecio();
                producto.getCategoria();
                prod.add(producto);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar productos: " + ex);
        }
        return prod;
    }

    public void modificarProducto(String nombre, int cantidad, double precio, Categoria categoria, int idProducto) {
        String sql = "UPTADE producto SET nombre=?,cantidad=?,precio=?,categoria=?"
                + "WHERE idProducto=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, cantidad);
            ps.setDouble(3, precio);
            ps.setObject(4, categoria);
            ps.setInt(1, idProducto);

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Producto Modificado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el producto " + ex);
        }

    }

    public void eliminarProducto(int idProducto) {
        String sql = "DELETE FROM producto WHERE idProducto=? ";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Producto no ha podido ser eliminado:" + ex);

        }

    }
}
