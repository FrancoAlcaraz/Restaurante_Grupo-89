
package AccesoADatos;

import Entidades.Mesero;
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
        con= Conexion.getConexion();
    }
    
 public void AgregarMesero(Mesero mesero){
 String sql="INSERT INTO `mesero`(`idMesero`, `dni`, `nombre`, `estado`) VALUES ('?','?','?','?')";
  try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesero.getIdMesero());
            ps.setInt(2, mesero.getDni());
            ps.setString(3, mesero.getNombre());
            ps.setBoolean(4, mesero.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                mesero.setIdMesero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesero Agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos ");
        }
    }
 
 
    public Mesero ObtenerMesero(int idmesero) {
        Mesero mesero=null;
        try {
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("SELECT `idMesero`, `dni`, `nombre`, `estado` FROM `mesero` WHERE `estado`=1");
            while (rs.next()) {
                mesero = new Mesero();
                mesero.setIdMesero(idmesero);
                mesero.setDni(rs.getInt("dni"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero " + ex.getMessage());
        }
        return mesero;    
    }
    
    public void ModificarMesero(Mesero mesero){
     String sql = "UPDATE `mesero` SET `dni`='?',`nombre`='?',`estado`='?' WHERE `idMesero`=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, mesero.getDni());
            ps.setString(2, mesero.getNombre());
            ps.setBoolean(3,mesero.isEstado());
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
   public void EliminarMesa(int IdMesero){
      String sql="DELETE FROM `mesero` WHERE idMesero=?";
        try {
                PreparedStatement ps=con.prepareStatement(sql);
               ps.setInt(1, IdMesero);
               int res=ps.executeUpdate();
               if(res>0){
                System.out.println("Mesero Eliminado");
               }else{
                     System.out.println("Error al eliminar al mesero");  
                       }
        } catch (SQLException ex) {
            Logger.getLogger(MesaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
