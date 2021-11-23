package ud4ejercicios2vectores;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        boolean iguales;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos primero 10 numeros y los guardamos en array1
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            array1[i] = in.nextInt();
        }
        
        // Pedimos otros 10 numeros y los guardamos en array2
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            array2[i] = in.nextInt();
        }
        
        // Comprobamos si los arrays son iguales
        iguales = Arrays.equals(array1, array2);
        
        // Mostramos si son iguales o no
        if (iguales)
            System.out.println("Los arrays SI son iguales");
        else
            System.out.println("Los arrays NO son iguales");
        
    }
    
}
