package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] array = new int[10];
        String opcion;
        int valor, posicion;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Bucle principal
        do {
            
            // Mostramos menú y pedimos qué quiere hacer el usuario
            System.out.println("MENU:");
            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir.");
            System.out.print("¿Qué quieres hacer? ");
            opcion = in.nextLine();
            
            // Opción mostrar valores
            if (opcion.equals("a")) {
                System.out.print("Valores: ");
                for (int i = 0; i < 10; i++) {
                    System.out.print(" " + array[i]);
                }
                System.out.println("");
            }
            // Opción introducir valor
            else if (opcion.equals("b")) {
                System.out.print("Dime valor: ");
                valor = in.nextInt();
                System.out.print("Dime posición: ");
                posicion = in.nextInt();
                array[posicion] = valor;
                in.nextLine();
            }
            // Opción salir
            else if (opcion.equals("c")) {
                System.out.println("¡Adios!");
            }
            // Opción errónea
            else {
                System.out.println("Opción errónea.");
            }
            
        } while (!opcion.equals("c"));
        
    }
    
}
