package AccesoADatos;

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

}
