package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] numeros = new int[20];
        int sumaPos = 0;
        int sumaNeg = 0;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos 20 numeros y los guardamos en el vector
        for (int i = 0; i < 20; i++) {
            System.out.print("Dame el valor " + i + ": ");
            numeros[i] = in.nextInt();
        }
        
        // Recorremos el vector sumando positivos y negativos por separado
        for (int i = 0; i < 20; i++) {
            if (numeros[i] >= 0)
                sumaPos += numeros[i];
            else
                sumaNeg += numeros[i];
        }
        
        // Mostramos máximo y mínimo
        System.out.println("SUMA DE POSITIVOS: " + sumaPos);
        System.out.println("SUMA DE NEGATIVOS: " + sumaNeg);
        
    }
    
}
