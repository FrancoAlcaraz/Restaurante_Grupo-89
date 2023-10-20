package Entidades;

public class Mesa {

    private int IdMesa;
    private int numero;
    private int Capacidad;
    private boolean Estado;

    public Mesa(int IdMesa, int numero, int Capacidad, boolean Estado) {
        this.IdMesa = IdMesa;
        this.numero = numero;
        this.Capacidad = Capacidad;
        this.Estado = Estado;

    }

    public Mesa(int numero, int Capacidad, boolean Estado) {
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        return numero + "";
    }

}
