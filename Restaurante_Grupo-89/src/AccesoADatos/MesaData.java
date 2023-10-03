
package AccesoADatos;

import Entidades.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;


public class MesaData {
    private Connection con=null;

    public MesaData() {
        con=Conexion.getConexion();
    }
 public void AgregarMesa(Mesa mesa){
 String sql="INSERT INTO `mesa`(`idMesa`, `cantidad`, `estado`, `idPedido`) VALUES ('?','?','?','?','?')";
  try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getCapacidad());
            ps.setBoolean(3, mesa.isEstado());
            
            ps.setInt(5,mesa.getPedido().getIdPedido());
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

  public List<Mesa> ListarMesa(){
  
  
  
  
  }
          
  
  
 }     
    
    
    
    
}
