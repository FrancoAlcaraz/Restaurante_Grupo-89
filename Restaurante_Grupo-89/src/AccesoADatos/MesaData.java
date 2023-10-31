package AccesoADatos;

import Entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MesaData {

    Connection con = null;

    public MesaData() {
        con = Conexion.getConexion();
    }

    public void AgregarMesa(Mesa mesa) {
        String sql = "INSERT INTO `mesa`( `numero`, `capacidad`, `estado`,`idMesa`) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(4, mesa.getIdMesa());
            ps.setInt(1, mesa.getNumero());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesa Agregada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos ");
        }
    }

    public Mesa ObtenerMesaxID(int idmesa) {
        Mesa mesa = null;
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM mesa WHERE idMesa = ? AND Estado = 1");
            ps.setInt(1, idmesa);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(idmesa);
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("Capacidad"));
                mesa.setEstado(true);
            } else {
                System.out.println("La Mesa no existe o está ocupada");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa: " + ex.getMessage());
        }

        return mesa;
    }

    public List<Mesa> ObtenerMesas() {
        List<Mesa> mesas = new ArrayList<>();
        String sql = "SELECT * FROM mesa ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setEstado(rs.getBoolean("estado"));
                mesas.add(mesa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa " + ex.getMessage());
        }

        return mesas;
    }

    public void EliminarMesa(int IdMesa) {
        String sql = "DELETE FROM `mesa` WHERE idMesa=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, IdMesa);
            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Mesa Eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a eliminar la Mesa " + ex.getMessage());
        }
    }

    public void ModificarMesa(Mesa mesa) {
        String sql = "UPDATE `mesa` SET `numero`=?,`capacidad`=?,`estado`=? WHERE idMesa=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mesa.getNumero());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            ps.setInt(4, mesa.getIdMesa());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Mesa Modificada Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La mesa no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa " + ex.getMessage());

        }
    }
}
