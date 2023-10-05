package Entidades;

public class Mesa {

    private int IdMesa;
    private int Cantidad;
    private boolean Estado;

    public Mesa(int IdMesa, int Cantidad, boolean Estado) {
        this.IdMesa = IdMesa;
        this.Cantidad = Cantidad;
        this.Estado = Estado;

    }

    public Mesa() {
    }

    public int getIdMesa() {
        return IdMesa;
    }

    public void setIdMesa(int IdMesa) {
        this.IdMesa = IdMesa;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Cantidad = Capacidad;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Mesa{" + "IdMesa=" + IdMesa + ", Capacidad=" + Cantidad + ", Estado=" + Estado + '}';
    }

}
