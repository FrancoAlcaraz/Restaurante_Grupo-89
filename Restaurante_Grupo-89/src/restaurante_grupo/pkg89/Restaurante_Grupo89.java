/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante_grupo.pkg89;

import AccesoADatos.CategoriaData;
import AccesoADatos.MesaData;
import AccesoADatos.MeseroData;
import AccesoADatos.ProductoData;
import Entidades.Categoria;
import Entidades.Mesa;
import Entidades.Mesero;
import Entidades.Producto;
import java.util.List;

public class Restaurante_Grupo89 {

    public static void main(String[] args) {
        // CategoriaData cd=new CategoriaData();
        // Categoria ct=new Categoria();
        // ct=cd.ObtenerCategoria(6);
        // Producto prod = new Producto("Pollo", 6, 100.32,ct);
        //ProductoData pr = new ProductoData();
        // System.out.println(prod);

        //pr.agregarProducto(prod);
        //pr.modificarProducto("Pollo", 8, 100.30, "Comida", 1);
        // pr.agregarProducto(prod);
        //  pr.modificarProducto("Pollo", 8, 100.30, "Comida", 1);
        //System.out.println(pr.obtenerProductos(1));
        // List<Producto> listaDeArreglos = pr.obtenerProductosxPrecio(10.50);
        // for (Producto produ : listaDeArreglos) {
        //   System.out.println(pr.obtenerProductosxPrecio(10.50).toString());
        // }
        // List<Producto> listaDeProductos = pr.obtenerProductos();
        //for (Producto producto : listaDeProductos) {
        // System.out.println(producto.toString()); // 
        // }
        //pr.eliminarProducto(2);
        /* Mesa ms=new Mesa(9, 4, true);
        MesaData md=new MesaData();
        
        md.AgregarMesa(ms);*/
        Mesero mesero = new Mesero(213455, "Carlo", true);
        MeseroData md = new MeseroData();
        md.AgregarMesero(mesero);

    }

}
