package ud3ejercicios2bucles;

import java.util.Scanner;

public class Alpha11
{
    public static void main(String[] args) {
        
        // Variables
        double precio, total = 0;
        
        // Creo el Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos precios al usuario mientras sean positivos
        do {
            // Pedimos precio
            System.out.print("Dime un precio: ");
            precio = in.nextDouble();
            
            // Sumamos precio al total SOLO SI es positivo para
            // evitar que sume el último precio (el negativo)
            if (precio >0)
                total += precio;
            
        } while (precio >= 0);
        
        // Mostramos el total
        System.out.println("Total: " + total);
    }
}
