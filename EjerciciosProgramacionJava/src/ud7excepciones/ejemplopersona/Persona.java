package ud7excepciones.ejemplopersona;

public class Persona {
    
    // El nombre debe contener al menos 3 caracteres
    String nombre;
    // No puede ser negativa
    int edad;

    public Persona(String nombre, int edad) throws Exception {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3)
            throw new PersonaException("ERROR: El nombre no puede ser tan corto");
        else
            this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 0)
            throw new PersonaException("ERROR: La edad no puede ser negativa");
        else
            this.edad = edad;
    }
    
    
    
}
