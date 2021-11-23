package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] numeros = new double[20];
        double total = 0;
        double media;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos 20 numeros y los guardamos en el vector
        for (int i = 0; i < 20; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextDouble();
        }
        
        // Calculamos la suma total
        for (int i = 0; i < 20; i++) {
            total += numeros[i];
        }
        
        // Calculamos y mostramos la media
        media = total / 20;
        System.out.println("MEDIA: " + media);
        
    }
    
}
