package Entidades;

public class Mesa {

   private int IdMesa;
   private int Capacidad;
   private boolean Estado;
   private Reserva reserva;
   private Pedidos pedido;

    public Mesa(int IdMesa, int Capacidad, boolean Estado, Reserva reserva, Pedidos pedido) {
        this.IdMesa = IdMesa;
        this.Capacidad = Capacidad;
        this.Estado = Estado;
        this.reserva = reserva;
        this.pedido = pedido;
    }

    public Mesa() {
    }

    public int getIdMesa() {
        return IdMesa;
    }

    public void setIdMesa(int IdMesa) {
        this.IdMesa = IdMesa;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Mesa{" + "IdMesa=" + IdMesa + ", Capacidad=" + Capacidad + ", Estado=" + Estado + ", reserva=" + reserva + ", pedido=" + pedido + '}';
    }

}
