package ud5casospracticos;

import java.util.Scanner;

public class CasoPractico1Contactos {
    
    // Main principal
    public static void main(String[] args) {
        
        // Variables de contactos
        int maxC = 100;
        int numC = 0;
        String[] nombres = new String[maxC];
        String[] telefonos = new String[maxC];
        String[] correos = new String[maxC];
        
        // Otras variables
        int opcion;
        String buscar;
        int[] posiciones;
                
        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    verContactos(nombres, telefonos, correos, numC);
                    break;
                case 2:
                    agregarContacto(nombres, telefonos, correos, numC, maxC);
                    break;
                case 3:
                    eliminarContacto(nombres, telefonos, correos, numC);
                    break;
                case 4:
                    buscar = pedirString("¿Nombre? ");
                    posiciones = buscarContactos(nombres, numC, buscar);
                    verContactos(nombres, telefonos, correos, numC, posiciones);
                    break;
                case 5:
                    buscar = pedirString("¿Teléfono? ");
                    posiciones = buscarContactos(telefonos, numC, buscar);
                    verContactos(nombres, telefonos, correos, numC, posiciones);
                    break;
                case 6:
                    buscar = pedirString("¿Correo? ");
                    posiciones = buscarContactos(correos, numC, buscar);
                    verContactos(nombres, telefonos, correos, numC, posiciones);
                    break;
                case 7:
                    buscar = pedirString("¿Término a buscar globalmente? ");
                    posiciones = buscarContactos(nombres, telefonos, correos, numC, buscar);
                    verContactos(nombres, telefonos, correos, numC, posiciones);
                    break;
                case 8:
                    //
                    break;
                case 9:
                    System.out.println("¡Gracias! ¡Hasta la próxima!");
                    break;
            }

            System.out.println("");
        } while (opcion != 9);
    }

    // Muestra el menú y devuelve la opción elegida por el usuario
    public static int menu() {

        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");

        int opcion = pedirIntEnRango(1, 8);

        return opcion;
    }

    // Pide al usuario un valor int, una y otra vez hasta que responde con valor en rango
    public static int pedirIntEnRango(int min, int max) {

        Scanner in = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Dime un valor entre " + min + " y " + max + ": ");
            valor = in.nextInt();
            if (valor < min || valor > max) {
                System.out.println("AVISO: Valor no válido.");
            }
        } while (valor < min || valor > max);

        return valor;
    }
    
    // Muestra 's' por pantalla, pide al usuario un texto y lo devuelve
    public static String pedirString(String s){
        
    }
    
    // Muestra por pantalla la información de todos los contactos
    public static void verContactos(String[] nombres, String[] telefonos, String[] correos, int numC) {
        
    }
    
    // Muestra por pantalla la información solo de los contactos indicados en 'posiciones' (índices de los vectores)
    public static void verContactos(String[] nombres, String[] telefonos, String[] correos, int numC, int[] posiciones) {
        
    }
    
    // Muestra por pantalla la información solo del contacto 'posicion' (índice de los vectores) 
    public static void verContacto(String[] nombres, String[] telefonos, String[] correos, int numC, int posicion) {
        
    }
    
    // Pide al usuario la información de un contacto nuevo y lo añade al final de la lista
    public static void agregarContacto(String[] nombres, String[] telefonos, String[] correos, int numC, int maxC) {
        
    }
    
    // Pide al usuario el nº de contacto a eliminar y lo elimina de la lista
    public static void eliminarContacto(String[] nombres, String[] telefonos, String[] correos, int numC) {
        
    }
    
    // Elimina la posición 'pos' de 'vector' y mueve todos los elementos a la derecha una posición a la izquierda
    public static void eliminarPosDeVector(String[] vector, int pos) {
        
    }
    
    // Busca en 'vector' los String que contienen 'buscar'
    // Devuelve las posiciones en las que se ha encontrado
    public static int[] buscarContactos(String[] vector, int numC, String buscar){
        
    }
    
    // Busca en 'nombres', 'telefonos' y 'correos' los String que contienen 'buscar'
    // Devuelve las posiciones en las que se ha encontrado (ordenadas, sin repeticiones)
    public static int[] buscarContactos(String[] nombres, String[] telefonos, String[] correos, int numC, String buscar){
        
    }
    
    
    
}
