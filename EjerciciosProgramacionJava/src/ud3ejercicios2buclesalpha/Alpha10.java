package ud3ejercicios2buclesalpha;

import java.util.Scanner;

public class Alpha10
{
    public static void main(String[] args) {
        
        // Variables
        double precio, total = 0;
        
        // Creo el Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos 5 precios y acumulamos en total
        for (int i = 1; i <= 5; i++) {
            System.out.print("Dime un precio: ");
            precio = in.nextDouble();
            total += precio;
        }
        
        // Mostramos el total
        System.out.println("Total: " + total);
    }
}
