package AccesoADatos;

import Entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MesaData {
    
    private Connection con = null;
    
    public MesaData() {
        con = Conexion.getConexion();
    }

    PedidosData PD=new PedidosData();
    ReservaData RD=new ReservaData();
 public void AgregarMesa(Mesa mesa){
 String sql="INSERT INTO `mesa`(`idMesa`,`numero`, `cantidad`, `estado`) VALUES ('?','?','?','?')";
  try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getNumero());
            ps.setInt(3, mesa.getCantidad());
            ps.setBoolean(4, mesa.isEstado());
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
 
    public Mesa ObtenerMesa(int idmesa) {
        Mesa mesa=null;
        try {
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT * FROM mesa WHERE Estado = 1 ");
         
            if (rs.next()) {
                mesa = new Mesa();
                mesa.setIdMesa(idmesa);
                mesa.setNumero(rs.getInt("numero"));
                mesa.setCapacidad(rs.getInt("Capacidad"));
                mesa.setEstado(true);
            }else{
                System.out.println("La Mesa no existe");
            ps.close();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa " + ex.getMessage());
        }
       
        return mesa;
    }
    
    public void EliminarMesa(int IdMesa){
      String sql="DELETE FROM `mesa` WHERE idMesa=?";
        try {
                PreparedStatement ps=con.prepareStatement(sql);
               ps.setInt(1, IdMesa);
               int res=ps.executeUpdate();
               if(res>0){
                System.out.println("Mesa Eliminada");
               }else{
                     System.out.println("Error al eliminar");  
                       }
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ModificarMesa(Mesa mesa){
     String sql = "UPDATE `mesa` SET `numero`=?, `cantidad`=?,`estado`=? WHERE idMesa=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,mesa.getNumero());
            ps.setInt(2, mesa.getCantidad());
            ps.setBoolean(3,mesa.isEstado());
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
