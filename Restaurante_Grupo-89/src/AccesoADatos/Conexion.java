package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String url = "jdbc:mariadb://localhost/";
    private static String usuario = "root";
    private static String clave = "";
    private static String Bd = "resto_89";
    private static Conexion conexion = null;

    public Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "no se puede establecer la conexion" + ex);
        }

    }

    public static Connection getConexion() {
        Connection con = null;
        if (conexion == null) {
            conexion = new Conexion();
            System.out.println("Funciona!!!");
        }
        try {
            con = DriverManager.getConnection(url + Bd, usuario, clave);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error de conexion " + ex);
        }
        return con;
    }
}
