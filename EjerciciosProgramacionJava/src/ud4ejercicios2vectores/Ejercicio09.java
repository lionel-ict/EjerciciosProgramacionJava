package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio09 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] numeros = new int[100];
        int n;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Insertamos 100 números aleatorios
        for (int i = 0; i < 100; i++) {
            numeros[i] = (int)(1 + Math.random() * 10);
        }
        
        // Pedimos N
        System.out.print("Dime N: ");
        n = in.nextInt();
        
        // Mostramos las posiciones donde aparece N
        System.out.println("Posiciones donde aparece " + n + ":");
        for (int i = 0; i < 100; i++) {
            if (numeros[i] == n)
                System.out.println(i);
        }

    }
    
}
