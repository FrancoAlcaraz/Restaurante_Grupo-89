/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class CategoriaData {

    Connection con = null;

    public CategoriaData() {
        con = Conexion.getConexion();
    }

    public Categoria ObtenerCategoria(int id) {

        String sql = "SELECT * FROM `categoria` WHERE idCategoria=?";

        Categoria categoria = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                categoria = new Categoria();
                categoria.setIdcategoria(rs.getInt("idCategoria"));

                categoria.setCategoria(rs.getString("nombre"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe tal categoria");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla categorias " + ex.getMessage());
        }
        return categoria;

    }

    public List<Categoria> listarCategorias() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        String sql = "SELECT * FROM categoria";

        try (PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setIdcategoria(rs.getInt("idCategoria"));
                categoria.setCategoria(rs.getString("nombre"));
                categorias.add(categoria);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla categoria: " + ex.getMessage());
        }

        return categorias;
    }

}
