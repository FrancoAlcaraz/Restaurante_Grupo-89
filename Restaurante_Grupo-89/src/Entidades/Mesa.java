package Entidades;

public class Mesa {

    private int IdMesa;
    private int numero;
    private int Cantidad;
    private boolean Estado;

    public Mesa(int IdMesa,int numero, int Cantidad, boolean Estado) {
        this.IdMesa = IdMesa;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
        return "Mesa{" + "IdMesa=" + IdMesa + ", numero=" + numero + ", Cantidad=" + Cantidad + ", Estado=" + Estado + '}';
    }

    

}
