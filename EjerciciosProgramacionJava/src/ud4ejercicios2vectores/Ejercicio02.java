package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] numeros = new double[10];
        double total = 0;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos 10 numeros y los guardamos en el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }
        
        // Calculamos la suma total
        for (int i = 0; i < 10; i++) {
            total += numeros[i];
        }
        
        // Mostramos suma total
        System.out.println("TOTAL: " + total);
        
    }
    
}
