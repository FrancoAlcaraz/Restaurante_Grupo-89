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
    CategoriaData ct = new CategoriaData();

    public void agregarProducto(Producto producto) {
        String sql = "INSERT INTO `producto`( `nombre`, `cantidad`, `precio`, `idCategoria`, `estado`) "
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setObject(4, producto.getCategoria().getIdcategoria());
            ps.setBoolean(5, producto.isEstado());
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
        List<Producto> prod = new ArrayList<>();
        String sql = "SELECT * FROM producto ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("precio"));
                Categoria cat = ct.ObtenerCategoria(rs.getInt("idCategoria"));
                producto.setCategoria(cat);
                producto.setEstado(rs.getBoolean("estado"));
                prod.add(producto);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar productos: " + ex);
        }
        return prod;

    }

    public List<Producto> obtenerProductosXCategoria(int id) {
        ArrayList<Producto> producto = new ArrayList<>();
        String sql = "SELECT `idProducto`, `nombre`, `cantidad`, `precio`, `idCategoria`, `estado` FROM `producto` WHERE idCategoria=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto produ = new Producto();
                produ.setIdProducto(rs.getInt("idProducto"));
                produ.setNombre(rs.getString("nombre"));
                produ.setCantidad(rs.getInt("cantidad"));
                produ.setPrecio(rs.getInt("precio"));
                Categoria cat = ct.ObtenerCategoria(rs.getInt("idCategoria"));
                produ.setCategoria(cat);
                produ.setEstado(rs.getBoolean("estado"));
                producto.add(produ);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar por producto" + ex.getMessage());
        }

        return producto;

    }

    public Producto obtenerProductosxID(int idProducto) {

        String sql = "SELECT * FROM producto WHERE idProducto=?";
        Producto producto = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto = new Producto();
                producto.setIdProducto(idProducto);
                producto.setNombre(rs.getString("nombre"));
                producto.setCantidad(rs.getInt("cantidad"));
                producto.setPrecio(rs.getDouble("precio"));
                Categoria cat = ct.ObtenerCategoria(rs.getInt("idCategoria"));
                producto.setEstado(rs.getBoolean("estado"));
                producto.setCategoria(cat);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar productos: " + ex);
        }
        return producto;
    }

    public List<Producto> obtenerProductosxPrecio(double precioB) {
        ArrayList<Producto> prod = new ArrayList<>();
        String sql = "SELECT * FROM producto WHERE precio=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, precioB);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                Categoria cat = ct.ObtenerCategoria(rs.getInt("idCategoria"));
                producto.setCategoria(cat);
                producto.setEstado(rs.getBoolean("estado"));
                prod.add(producto);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar productos: " + ex);
        }
        return prod;
    }

    public List<Producto> obtenerProductosxNombre(String nombre) {
        List<Producto> productos = new ArrayList<>();
        String sql = "SELECT * FROM `producto` WHERE nombre = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setCantidad(rs.getInt("cantidad"));
                Categoria cat = ct.ObtenerCategoria(rs.getInt("idCategoria"));
                producto.setCategoria(cat);
                producto.setEstado(rs.getBoolean("estado"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar productos: " + ex);
        }
        return productos;
    }

    public void modificarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombre=?, cantidad=?, precio=?, idCategoria=?, estado=? WHERE idProducto=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getCantidad());
            ps.setDouble(3, producto.getPrecio());
            ps.setObject(4, producto.getCategoria().getIdcategoria());
            ps.setBoolean(5, producto.isEstado());
            ps.setInt(6, producto.getIdProducto());

            ps.executeUpdate();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar el producto: " + ex.getMessage());
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
