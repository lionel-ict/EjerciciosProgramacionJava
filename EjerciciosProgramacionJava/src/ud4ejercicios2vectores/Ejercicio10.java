package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        // Variables
        int n;
        double[] alturas;
        double total = 0, media;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int cuantosPorEncima = 0;
        int cuantosPorDebajo = 0;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos n (cuantas alturas)
        System.out.print("Dime N: ");
        n = in.nextInt();
        
        // Creamos vector de tamaño n
        alturas = new double[n];
        
        // Pedimos las alturas y almacenamos en vector
        for (int i = 0; i < n; i++) {
            System.out.print("Dime altura " + i + ": ");
            alturas[i] = in.nextDouble();
        }
        
        // Calculamos total (necesario para la media), máximo y mínimo
        for (int i = 0; i < n; i++) {
            total += alturas[i];
            max = Math.max(alturas[i], max);
            min = Math.min(alturas[i], min);
        }
        
        // Calculamos la media
        media = total / n;
        
        // Ahora que sabemos la media, recorremos el vector para contar
        // cuantos valores están por encima y por debajo de la media
        for (int i = 0; i < n; i++) {
            if (alturas[i] > media)
                cuantosPorEncima++;
            else if (alturas[i] < media)
                cuantosPorDebajo++;
        }
        
        // Mostramos toda la información requerida
        System.out.println("MEDIA : " + media);
        System.out.println("MÁXIMO: " + max);
        System.out.println("MÍNIMO: " + min);
        System.out.println("POR ENCIMA DE LA MEDIA: " + cuantosPorEncima);
        System.out.println("POR DEBAJO DE LA MEDIA: " + cuantosPorDebajo);
        
    }
    
}
