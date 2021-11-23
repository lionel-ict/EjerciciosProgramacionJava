package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {

        // variables
        String texto, mayus, minus;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos texto
        System.out.print("Introduce un texto: ");
        texto = in.nextLine();
        
        // Convertimos a mayúsculas y minúsculas
        mayus = texto.toUpperCase();
        minus = texto.toLowerCase();
        
        // Mostramos
        System.out.println(mayus);
        System.out.println(minus);

    }

}
