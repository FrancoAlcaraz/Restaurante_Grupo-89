/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante_grupo.pkg89;

import AccesoADatos.ProductoData;
import Entidades.Producto;
import java.util.List;

public class Restaurante_Grupo89 {

    public static void main(String[] args) {

        Producto prod = new Producto("Sopa", 5, 10.50, "Comida");
        ProductoData pr = new ProductoData();
        System.out.println(prod);
        //pr.agregarProducto(prod);
        //pr.modificarProducto("Pollo", 8, 100.30, "Comida", 1);
        //System.out.println(pr.obtenerProductos(1));
        // List<Producto> listaDeArreglos = pr.obtenerProductosxPrecio(10.50);
        // for (Producto produ : listaDeArreglos) {
        //   System.out.println(pr.obtenerProductosxPrecio(10.50).toString());
        // }
        List<Producto> listaDeProductos = pr.obtenerProductos();

        for (Producto producto : listaDeProductos) {
            System.out.println(producto.toString()); // 
        }
        //pr.eliminarProducto(2);

    }

}
