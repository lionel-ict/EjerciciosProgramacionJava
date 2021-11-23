package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        // Variables
        double[] numeros = new double[100];
        double r;
        int cuantos = 0;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Insertamos 100 números aleatorios
        for (int i = 0; i < 100; i++) {
            numeros[i] = Math.random();
        }
        
        // Pedimos R
        System.out.print("Dime R: ");
        r = in.nextDouble();
        
        // Recorremos el vector. Contamos cuantos valores son >= a R
        for (int i = 0; i < 100; i++) {
            if (numeros[i] >= r)
                cuantos++;
        }
        
        // Mostramos cuantos valores son >= R
        System.out.println("Valores mayores que " + r + ": " + cuantos);
        
    }
    
}
