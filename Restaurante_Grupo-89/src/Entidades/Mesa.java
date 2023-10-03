package Entidades;

public class Mesa {

    private int IdMesa;
    private int Capacidad;
    private boolean Estado;

    public Mesa(int IdMesa, int Capacidad, boolean Estado) {
        this.IdMesa = IdMesa;
        this.Capacidad = Capacidad;
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

    @Override
    public String toString() {
        return "Mesa{" + "IdMesa=" + IdMesa + ", Capacidad=" + Capacidad + ", Estado=" + Estado + '}';
    }

}
