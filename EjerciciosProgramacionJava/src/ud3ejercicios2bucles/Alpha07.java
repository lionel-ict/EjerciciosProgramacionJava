package ud3ejercicios2bucles;

import java.util.Scanner;

public class Alpha07
{
    public static void main(String[] args) {
        
        // Variables
        int a, b, suma = 0;
        
        // Creo el Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos a y b
        System.out.println("Dime a y b:");
        a = in.nextInt();
        b = in.nextInt();
        
        // Sumamos los números desde a hasta b
        for(int i = a; i <= b; i++){
            suma += i;
        }
        
        // Mostramos la suma
        System.out.println(suma);
    }
}
