package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio11v2 {

    public static void main(String[] args) {

        // Variables
        String f, fInv = "";
        boolean palindromo;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos frase
        System.out.print("Introduce frase: ");
        f = in.nextLine();

        // Pasamos frase a mayúsculas y quitamos espacios
        f = f.toUpperCase();
        f = f.replace(" ", "");
        
        // Obtenemos el inverso de f. Ejemplo: HOLA => ALOH
        for (int i = 0; i < f.length(); i++) {
            fInv = f.charAt(i) + fInv;
        }
        
        // Comparamos si f es igual que su inverso
        palindromo = f.equals(fInv);
        
        // Mostramos si es un palíndromo o no
        if (palindromo)
            System.out.println("¡Es un palíndromo!");
        else
            System.out.println("No es un palíndromo :(");
        
    }
}
