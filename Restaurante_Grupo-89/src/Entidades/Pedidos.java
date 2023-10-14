package Entidades;

import java.util.List;

public class Pedidos {

    int IdPedido;
    Producto producto;
    Mesero mesero;
    Mesa mesa;
    boolean estado;
    int nroPedido;

    public Pedidos(int IdPedido, Producto producto, Mesero mesero, Mesa mesa, boolean estado, int nroPedido) {
        this.IdPedido = IdPedido;
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = estado;
        this.nroPedido = nroPedido;
    }

    public Pedidos(Producto producto, Mesero mesero, Mesa mesa, boolean estado, int nroPedido) {
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = estado;
        this.nroPedido = nroPedido;
    }

    public Pedidos() {
    }

    public int getIdPedido() {
        return IdPedido;
    }

    public void setIdPedido(int IdPedido) {
        this.IdPedido = IdPedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
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

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "IdPedido=" + IdPedido + ", producto=" + producto + ", mesero=" + mesero + ", mesa=" + mesa + ", estado=" + estado + ", nroPedido=" + nroPedido + '}';
    }

}