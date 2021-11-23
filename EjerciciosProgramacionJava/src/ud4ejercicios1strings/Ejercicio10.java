package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        // Variables
        String f;
        int pos;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos frase
        System.out.print("Introduce frase: ");
        f = in.nextLine();

        // Recorremos los caracteres de F, mostrándolos uno a uno.
        // Si encontramos un espacio imprimimos nueva línea
        for (int i = 0; i < f.length(); i++) {
            char c = f.charAt(i);
            if (c == ' ')
                System.out.println("");
            else
                System.out.print(c);
        }
        
    }
}
