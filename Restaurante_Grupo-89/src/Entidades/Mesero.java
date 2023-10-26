package Entidades;

public class Mesero {

    int IdMesero;
    int dni;
    String nombre;
    boolean Estado;

    public Mesero(int IdMesero, int dni, String nombre, boolean Estado) {
        this.IdMesero = IdMesero;
        this.dni = dni;
        this.nombre = nombre;
        this.Estado = Estado;

    }

    public Mesero(int dni, String nombre, boolean Estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.Estado = Estado;
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

    @Override
    public String toString() {
        return nombre ;
    }

}
