package ud4ejercicios2vectores;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        // Variables
        int n, m;
        int[] numeros;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos n y m
        System.out.println("Dime N: ");
        n = in.nextInt();
        System.out.println("Dime M: ");
        m = in.nextInt();
        
        // Creamos el array de tamaño N
        numeros = new int[n];
        
        // Insertamos M en todas las posiciones del array
        Arrays.fill(numeros, m);
        
        // Mostramos los numeros
        System.out.println(Arrays.toString(numeros));
        
    }
    
}
