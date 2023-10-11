package Entidades;

import java.util.List;

public class Pedidos {

    int IdPedido;
    List<Producto> producto;
    Mesero mesero;
    Mesa mesa;
    boolean estado;

    public Pedidos(int IdPedido, List<Producto> producto, Mesero mesero, Mesa mesa, boolean estado) {
        this.IdPedido = IdPedido;
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = estado;
    }

    public Pedidos(List<Producto> producto, Mesero mesero, Mesa mesa, boolean estado) {
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = estado;
    }
    
    public Pedidos() {
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "IdPedido=" + IdPedido + ", producto=" + producto + ", mesero=" + mesero + ", mesa=" + mesa + ", estado=" + estado + '}';
    }

   
    
}
