package ud6ejercicios2.Ejemplo;

public class Empleado {

    private String nombre, apellidos;
    private int edad;
    private double salario;

    public Empleado(String nombre, String apellidos, int edad, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprimir() {
        System.out.println(nombre + " " + apellidos + " " + edad + " " + salario);
    }
    
    public String toString() {
        return (nombre + " " + apellidos + " " + edad + " " + salario);
    }

}
