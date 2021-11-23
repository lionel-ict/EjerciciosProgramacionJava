package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        // Variables
        String f, p1, p2;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos frase y dos palabras
        System.out.print("Introduce frase F: ");
        f = in.nextLine();
        System.out.print("Introduce palabra P1: ");
        p1 = in.nextLine();
        System.out.print("Introduce palabra P2: ");
        p2 = in.nextLine();
        
        // Mostramos F tras sustituir P1 por P2
        System.out.println(f.replace(p1, p2));
        
    }
}
