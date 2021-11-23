package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio06 {
    
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
        for (int i = 0; i < n; i++) {
            numeros[i] = m;
        }
        
        // Mostramos los numeros
        for (int i = 0; i < n; i++) {
            System.out.println("Numero " + i + ": " + numeros[i]);
        }
        
    }
    
}
