package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {

        // Variables
        String f;
        int pos;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos frase con 2 palabras
        System.out.print("Introduce frase con 2 palabras: ");
        f = in.nextLine();

        // Buscamos la posición donde está el espacio
        pos = f.indexOf(" ");

        // Mostramos subcadena desde 0 hasta pos
        System.out.println(f.substring(0, pos));

        // Mostramos subcadena desde pos+1 hasta el final
        System.out.println(f.substring(pos + 1, f.length()));

    }
}
