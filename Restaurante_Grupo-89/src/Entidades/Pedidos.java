
package Entidades;


public class Pedidos {
    int IdPedido;
    Producto producto;
    Mesero mesero;
    Mesa mesa;

    public Pedidos(int IdPedido, Producto producto, Mesero mesero, Mesa mesa) {
        this.IdPedido = IdPedido;
        this.producto = producto;
        this.mesero = mesero;
        this.mesa = mesa;
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

    @Override
    public String toString() {
        return "Pedidos{" + "IdPedido=" + IdPedido + ", producto=" + producto + ", mesero=" + mesero + ", mesa=" + mesa + '}';
    }
    
}
