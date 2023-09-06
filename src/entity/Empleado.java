package entity;

/**
 *
 * @author julan
 */
public class Empleado {

    int dni;
    String nombre;
    String apellido;
    String categoria;
    double sueldo;
    Empresa empresa;

    public Empleado(int dni, String nombre, String apellido, String categoria, double sueldo, Empresa empresa) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empresa = empresa;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", categoria=" + categoria + ", sueldo=" + sueldo + ", empresa=" + empresa + '}';
    }

}
