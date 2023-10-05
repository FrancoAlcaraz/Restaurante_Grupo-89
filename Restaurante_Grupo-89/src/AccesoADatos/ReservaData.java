package AccesoADatos;

import Entidades.Mesa;
import Entidades.Reserva;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ReservaData {

    private Connection con = null;

    public ReservaData() {
        con = Conexion.getConexion();

    }

    public void agregarReserva(Reserva reserva) {
        String sql = "INSERT INTO 'reserva'('dni','nombre','fecha','hora','estado','mesa')"
                + " VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reserva.getDni());
            ps.setString(2, reserva.getNombre());
            ps.setDate(3, (Date.valueOf(reserva.getFecha())));
            ps.setTime(4, Time.valueOf(reserva.getHora()));
            ps.setBoolean(5, reserva.isEstado());
            ps.setObject(6, reserva.getMesa().getIdMesa());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva guardada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar una reserva" + ex);

        }
    }

    public List<Reserva> listarReserva() {
        ArrayList<Reserva> res = new ArrayList<>();
        String sql = "SELECT * FROM 'reserva' WHERE idReserva=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.getDni();
                reserva.getNombre();
                reserva.getFecha();
                reserva.getHora();
                reserva.isEstado();
                reserva.getMesa().getIdMesa();
                res.add(reserva);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar productos: " + ex);
        }
        return res;
    }

    public void modificarReserva(int dni, String nombre, LocalDate fecha, LocalTime hora, boolean estado, Mesa mesa, int idReserva) {
        String sql = "UPTADE reserva SET dni=?,nombre=?,fecha=?,hora=?,estado=?,mesa=?"
                + "WHERE idReserva=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setString(2, nombre);
            ps.setDate(3, Date.valueOf(fecha));
            ps.setTime(4, Time.valueOf(hora));
            ps.setBoolean(5, estado);
            ps.setObject(6, mesa.getIdMesa());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Reserva Modificada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar la reserva: " + ex);
        }

    }

    public void eliminarReserva(int idReserva) {
        String sql = "DELETE FROM reserva WHERE idReserva=? ";

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReserva);
            int exito = ps.executeUpdate();
            if (exito >= 1) {
                JOptionPane.showMessageDialog(null, "Reserva Eliminada");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "La Reserva no ha podido ser eliminada:" + ex);

        }

    }
}
