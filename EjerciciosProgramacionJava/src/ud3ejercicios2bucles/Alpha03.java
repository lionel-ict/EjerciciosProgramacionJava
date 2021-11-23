package ud3ejercicios2bucles;

import java.util.Scanner;

public class Alpha03
{
    public static void main(String[] args) {
        
        // Variables
        int a, b;
        
        // Creo el Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos a y b
        System.out.print("Dime a y b: ");
        a = in.nextInt();
        b = in.nextInt();
        
        // Mostramos valores entre a y b en pasos de 2
        for(int i = a; i <= b; i+=2){
            System.out.println(i);
        }
    }
}
