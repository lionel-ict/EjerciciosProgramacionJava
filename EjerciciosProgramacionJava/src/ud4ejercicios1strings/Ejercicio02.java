package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        // variables
        String texto1, texto2;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos 2 textos
        System.out.print("Introduce un texto: ");
        texto1 = in.nextLine();
        System.out.print("Introduce otro texto: ");
        texto2 = in.nextLine();
        
        // Mostramos si son iguales
        if (texto1.equals(texto2))
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");
        
        // Mostramos si son iguales sin diferenciar mayúsculas y minúsculas
        if (texto1.equalsIgnoreCase(texto2))
            System.out.println("Son iguales (sin diferenciar mayúsculas y minúsculas)");
        else
            System.out.println("No son iguales (sin diferenciar mayúsculas y minúsculas)");
        
    }

}
