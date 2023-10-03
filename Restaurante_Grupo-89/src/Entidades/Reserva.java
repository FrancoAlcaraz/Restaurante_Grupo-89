
package Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reserva {
     int idReserva;
     int dni;
     String nombre;
     LocalDate fecha;
     LocalTime hora;
     boolean estado;

    public Reserva(int idReserva, int dni, String nombre, LocalDate fecha, LocalTime hora, boolean estado) {
        this.idReserva = idReserva;
        this.dni = dni;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
