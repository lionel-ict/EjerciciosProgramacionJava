package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio11v1 {

    public static void main(String[] args) {

        // Variables
        String f;
        boolean palindromo;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos frase
        System.out.print("Introduce frase: ");
        f = in.nextLine();

        // Pasamos frase a mayúsculas y quitamos espacios
        f = f.toUpperCase();
        f = f.replace(" ", "");
        
        // Comprobamos si es un palíndromo recorriendo el texto y comparando
        // el primer char con el último, el segundo char con el penúltimo, etc.
        palindromo = true;
        for (int i = 0; i < f.length()/2; i++) {
            // Comparamos el char de la posición i con el
            // char en la posición i desde el final
            if (f.charAt(i) != f.charAt(f.length() - i - 1))
                palindromo = false;
        }
        
        // Mostramos si es un palíndromo o no
        if (palindromo)
            System.out.println("¡Es un palíndromo!");
        else
            System.out.println("No es un palíndromo :(");
        
    }
}
