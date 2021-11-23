package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {

        // Variables
        String f, p;
        int pos = 0;
        int contador = 0;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos frase y palabra
        System.out.print("Introduce frase F: ");
        f = in.nextLine();
        System.out.print("Introduce palabra P: ");
        p = in.nextLine();

        // Bucle que busca todas las ocurrencias de P en F
        do {
            // Busca 'p' a partir de la posicion 'pos'
            pos = f.indexOf(p, pos);
            
            // Si lo ha encontrado, actualizamos contador y posicion
            if (pos >= 0) {
                contador++;
                pos++;
            }
        } while (pos != -1);

        // Mostramos cuantas veces aparece
        System.out.println("P aparece " + contador + " veces");

    }
}
