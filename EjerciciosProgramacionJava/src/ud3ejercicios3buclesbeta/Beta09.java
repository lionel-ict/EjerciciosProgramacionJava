
import java.util.Scanner;

public class Beta09 {

    public static void main(String[] args) {

        // Variables
        int dado, d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0;

        // Tiramos 100 veces un dado de 6 caras
        for (int i = 1; i <= 100; i++) {
            
            // Tiramos el dado
            dado = (int)(Math.random() * 6 + 1);
            //System.out.println("Tirada: " + dado);
            
            // Contamos
            if (dado == 1) d1++;
            else if (dado == 2) d2++;
            else if (dado == 3) d3++;
            else if (dado == 4) d4++;
            else if (dado == 5) d5++;
            else if (dado == 6) d6++;
        }

        // Mostramos nº y % de veces que ha salido cada número
        System.out.println("Tirada 1: " + d1 + " veces (" + (d1) + "%)");
        System.out.println("Tirada 2: " + d2 + " veces (" + (d2) + "%)");
        System.out.println("Tirada 3: " + d3 + " veces (" + (d3) + "%)");
        System.out.println("Tirada 4: " + d4 + " veces (" + (d4) + "%)");
        System.out.println("Tirada 5: " + d5 + " veces (" + (d5) + "%)");
        System.out.println("Tirada 6: " + d6 + " veces (" + (d6) + "%)");

    }
}
