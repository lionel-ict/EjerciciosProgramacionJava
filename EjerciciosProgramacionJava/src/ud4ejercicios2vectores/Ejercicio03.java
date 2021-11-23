package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] numeros = new double[10];
        double max = Double.MIN_VALUE; // Mínimo valor double posible
        double min = Double.MAX_VALUE; // Máximo valor double posible
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos 10 numeros y los guardamos en el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }
        
        // Recorremos el vector buscando el máximo y el mínimo
        for (int i = 0; i < 10; i++) {
            max = Math.max(numeros[i], max); // puede hacerse con un if-else
            min = Math.min(numeros[i], min); // puede hacerse con un if-else
        }
        
        // Mostramos máximo y mínimo
        System.out.println("MÁXIMO: " + max);
        System.out.println("MÍNIMO: " + min);
        
    }
    
}
