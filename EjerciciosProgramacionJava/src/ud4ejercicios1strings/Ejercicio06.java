package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        // variables
        String frase, palabra;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos frase y palabra
        System.out.print("Introduce una frase F: ");
        frase = in.nextLine();
        System.out.print("Introduce una palabra P: ");
        palabra = in.nextLine();

        // Si F contiene P, comprobamos también si empieza o termina por P
        if (frase.indexOf(palabra) >= 0) {
            
            System.out.println("F contiene P");
            
            if (frase.startsWith(palabra))
                System.out.println("F empieza por P");
            else
                System.out.println("F NO empieza por P");

            if (frase.endsWith(palabra))
                System.out.println("F termina por P");
            else
                System.out.println("F NO termina por P");
        }
        // Si NO contiene P, seguro que tampoco empieza ni termina
        else {
            System.out.println("F NO contiene P => tampoco empieza ni termina por P");
        }

    }
}
