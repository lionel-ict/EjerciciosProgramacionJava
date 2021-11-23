package ud4ejercicios2vectores;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] rating = new int[8];
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos el rating de los 8 jugadores
        for (int i = 0; i < 8; i++) {
            System.out.print("Dime rating " + i + ": ");
            rating[i] = in.nextInt();
        }
        
        // Ordenamos el array
        Arrays.sort(rating);
        
        // Mostramos los rating recorriendo el vector desde el final porque
        // Arrays.sort() ordena ascendente, pero queremos mostrarlo descendente
        for (int i = 7; i >= 0; i--) {
            System.out.println(rating[i]);
        }
        
    }
    
}
