package ud3ejercicios3buclesbeta;

import java.util.Scanner;

public class Beta05 {

    public static void main(String[] args) {
        
        // Variables
        int a, b, pares = 0, impares = 0;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos A y B
        System.out.print("Dime A: ");
        a = in.nextInt();
        System.out.print("Dime B: ");
        b = in.nextInt();
        
        // Bucle de A a B. Sumamos pares/impares
        for (int i = a; i <= b; i++) {
            if ((i % 2) == 0)
                pares += i;
            else
                impares += i;
        }
        
        // Mostramos suma de pares e impares
        System.out.println("Suma de pares  : " + pares);
        System.out.println("Suma de impares: " + impares);
    }
}
