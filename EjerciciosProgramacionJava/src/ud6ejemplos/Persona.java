package ud6ejemplos;

public class Persona {
    
    private String dni = "NINGUNO";
    private String nombre = "NINGUNO";
    private boolean vivo = true;
    private int edad = 0;
    
    // CONSTRUCTOR
    public Persona(String d, String n, boolean v, int e) {
        dni = d;
        nombre = n;
        vivo = v;
        edad = e;
    }
    
    
    // GETTERS
    public int getEdad() {
        return edad;
    }
    
    public boolean getVivo() {
        return vivo;
    }
    
    // SETTERS
    public void setEdad(int e) {
        if (e >= 0)
            edad = e;
        else
            System.out.println("ERROR: No se pueden poner edades negativas");
    }
    
    public void setVivo(boolean v) {
        vivo = v;
    }
    
    
    
    
    
    
    public void imprimir() {
        System.out.println("Datos de Persona: " + dni + " " + edad + " " + nombre + " " + vivo);
    }
    
    public void cumpleanyos() {
        edad++;
    }
    
    public void cumpleanyos(int cuantos) {
        edad += cuantos;
    }
    
    public void morir() {
        vivo = false;
    }
    
    public void resucitar() {
        vivo = true;
    }
    
}
