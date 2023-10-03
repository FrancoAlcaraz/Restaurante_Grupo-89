
package Entidades;


public class Mesero {
    int IdMesero;
    int dni;
    String nombre;
    boolean Estado;
    Mesa mesa;
    Reserva reserva;

    public Mesero(int IdMesero, int dni, String nombre, boolean Estado, Mesa mesa, Reserva reserva) {
        this.IdMesero = IdMesero;
        this.dni = dni;
        this.nombre = nombre;
        this.Estado = Estado;
        this.mesa = mesa;
        this.reserva = reserva;
    }

    public Mesero() {
    }

    public int getIdMesero() {
        return IdMesero;
    }

    public void setIdMesero(int IdMesero) {
        this.IdMesero = IdMesero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Mesero{" + "IdMesero=" + IdMesero + ", dni=" + dni + ", nombre=" + nombre + ", Estado=" + Estado + ", mesa=" + mesa + ", reserva=" + reserva + '}';
    }
    
}
