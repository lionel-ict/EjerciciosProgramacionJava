package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] numeros = new double[10];
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos 10 numeros y los guardamos en el vector
        for (int i = 0; i < 10; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }
        
        // Mostramos los numeros
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero " + i + ": " + numeros[i]);
        }
        
    }
    
}
