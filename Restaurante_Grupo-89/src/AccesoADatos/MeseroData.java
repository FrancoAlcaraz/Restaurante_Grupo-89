package AccesoADatos;

import Entidades.Categoria;
import Entidades.Mesero;
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

public class MeseroData {

    private Connection con = null;

    public MeseroData() {
        con = Conexion.getConexion();
    }

    public int AgregarMesero(Mesero mesero) {
    String sql = "INSERT INTO `mesero`(`dni`, `nombre`, `estado`) VALUES (?,?,?)";
    try {
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        ps.setInt(1, mesero.getDni());
        ps.setString(2, mesero.getNombre());
        ps.setBoolean(3, mesero.isEstado());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if (rs.next()) {
            mesero.setIdMesero(rs.getInt(1));
            return mesero.getIdMesero(); // Devuelve el ID generado
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos ");
    }
    
    return -1; // Devuelve un valor predeterminado en caso de error
}

    public Mesero ObtenerMesero(int idmesero) {
        Mesero mesero = null;
        try {
            String sql = "SELECT `idMesero`, `dni`, `nombre`, `estado` FROM `mesero` WHERE `idMesero`=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idmesero);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mesero = new Mesero();
                mesero.setIdMesero(idmesero);
                mesero.setDni(rs.getInt("dni"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setEstado(rs.getBoolean("estado"));
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
        }
        return mesero;
    }

    public void ModificarMesero(int dni, String nombre, boolean estado, int idmesero) {
        String sql = "UPDATE `mesero` SET `dni`=?,`nombre`=? ,`estado`=? WHERE `idMesero`=? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setString(2, nombre);
            ps.setBoolean(3, estado);
            ps.setInt(4, idmesero);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesero Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El mesero no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
        }
    }

    public void EliminarMesa(int IdMesero) {
        String sql = "DELETE FROM `mesero` WHERE idMesero=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdMesero);
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Mesero Eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar al mesero");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Mesero> obtenerMeseros() {
        List<Mesero> meseros = new ArrayList<>();
        String sql = "SELECT * FROM mesero ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Mesero mesero = new Mesero();
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setDni(rs.getInt("dni"));
                mesero.setEstado(rs.getBoolean("estado"));

                meseros.add(mesero);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar productos: " + ex);
        }
        return meseros;

    }

}
