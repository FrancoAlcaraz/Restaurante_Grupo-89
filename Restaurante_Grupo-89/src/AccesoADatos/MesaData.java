package AccesoADatos;

import Entidades.Mesa;
import Entidades.Pedidos;
import Entidades.Reserva;
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

public class MesaData {
    
    private Connection con = null;
    
    public MesaData() {
        con = Conexion.getConexion();
    }
<<<<<<< HEAD
    
    public void AgregarMesa(Mesa mesa) {
        String sql = "INSERT INTO `mesa`(`idMesa`, `capacidad`, `estado`, `idReserva`, `idPedido`) VALUES ('?','?','?','?','?')";
        try {
=======
 public void AgregarMesa(Mesa mesa){
 String sql="INSERT INTO `mesa`(`idMesa`, `cantidad`, `estado`, `idPedido`) VALUES ('?','?','?','?','?')";
  try {
>>>>>>> a9c3bc843ae0f121853de667a2845e8fe6dcc748
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
<<<<<<< HEAD
            ps.setInt(5, mesa.getReserva().getIdReserva());
            ps.setInt(5, mesa.getPedido().getIdPedido());
=======
            
            ps.setInt(5,mesa.getPedido().getIdPedido());
>>>>>>> a9c3bc843ae0f121853de667a2845e8fe6dcc748
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
    public List<Mesa> ListarMesa() {
        ArrayList<Mesa> mesas = new ArrayList<>();
        try {
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM mesa WHERE Estado = 1 ");
            while (rs.next()) {
                Pedidos pedido1 = new Pedidos();
                Mesa mesa = new Mesa();
                Reserva reserva1 = new Reserva();
                mesa.setIdMesa(rs.getInt("IDMesa"));
                mesa.setCapacidad(rs.getInt("Capacidad"));
                mesa.setEstado(rs.getBoolean("Estado"));
                pedido1.setIdPedido(rs.getInt("IDPedido"));
                reserva1.setIdReserva(rs.getInt("IDReserva"));
                mesas.add(mesa);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa " + ex.getMessage());
        }
        return mesas;
        
    }
    
    public void EliminarMesa(int IdMesa){
      String sql="DELETE FROM `mesa` WHERE idMesa=?";
        try {
                PreparedStatement ps=con.prepareStatement(sql);
               ps.setInt(1, IdMesa);
                System.out.println("Mesa Eliminada");
                
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ModificarMesa(int IdMesa){
    //Statement ps=con.createStatement();
   // ResultSet rs=ps.executeQuery("");
    
    
    }
}
