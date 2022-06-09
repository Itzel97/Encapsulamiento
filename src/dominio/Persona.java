package dominio;

public class Persona {

    private String nombre;
    private Double sueldo;
    private boolean eliminado;

    public Persona(String nombre, Double sueldo, boolean eliminado) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {

        return this.eliminado;

    }

    public void setEliminado(boolean eliminado) {

        this.eliminado = eliminado;
    }

}
