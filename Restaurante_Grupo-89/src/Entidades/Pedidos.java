package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Pedidos {

    int IdPedido;
    Producto producto;
    Mesero mesero;
    Mesa mesa;
    boolean estado;
    int nroPedido;
    int cantidadProducto;
    LocalDate fecha;
    LocalTime hora;

    public Pedidos(int IdPedido, Producto producto, Mesero mesero, Mesa mesa, boolean estado, int nroPedido, int cantidadProducto, LocalDate fecha, LocalTime hora) {
        this.IdPedido = IdPedido;
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = estado;
        this.nroPedido = nroPedido;
        this.cantidadProducto = cantidadProducto;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Pedidos(Producto producto, Mesero mesero, Mesa mesa, boolean estado, int nroPedido, int cantidadProducto, LocalDate fecha, LocalTime hora) {
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
        this.estado = estado;
        this.nroPedido = nroPedido;
        this.cantidadProducto = cantidadProducto;
        this.fecha = fecha;
        this.hora = hora;
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

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return nroPedido + "";
    }

}
