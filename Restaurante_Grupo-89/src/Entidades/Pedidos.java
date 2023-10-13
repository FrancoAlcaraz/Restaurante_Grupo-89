package Entidades;

import java.util.List;

public class Pedidos {

    int IdPedido;
    List<Producto> producto;
    Mesero mesero;
    Mesa mesa;
    boolean estado;
    Producto producto1;

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

    public Pedidos(int IdPedido, Mesero mesero, Mesa mesa, boolean estado, Producto producto1) {
        this.IdPedido = IdPedido;
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = estado;
        this.producto1 = producto1;
    }

    public Pedidos(Mesero mesero, Mesa mesa, boolean estado, Producto producto1) {
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = estado;
        this.producto1 = producto1;
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

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "IdPedido=" + IdPedido + ", producto=" + producto + ", mesero=" + mesero + ", mesa=" + mesa + ", estado=" + estado + '}';
    }

   
    
}
