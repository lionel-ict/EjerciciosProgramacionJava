package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        // variables
        String texto1, texto2;
        int comparacion;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos 2 textos
        System.out.print("Introduce un texto: ");
        texto1 = in.nextLine();
        System.out.print("Introduce otro texto: ");
        texto2 = in.nextLine();
        
        // Comparamos cadenas
        comparacion = texto1.compareToIgnoreCase(texto2);
        
        // Si es negativo, texto1 va primero. Si es 0, son iguales
        if (comparacion <= 0) {
            System.out.println(texto1);
            System.out.println(texto2);
        }
        // En otro caso, texto2 va primero
        else {
            System.out.println(texto2);
            System.out.println(texto1);
        }
        
    }
}
