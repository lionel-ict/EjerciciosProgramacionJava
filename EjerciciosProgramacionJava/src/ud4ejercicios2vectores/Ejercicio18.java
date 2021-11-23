package ud4ejercicios2vectores;


import java.util.Arrays;

public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] numeros = new int[30];
        
        // Rellenamos el vector con números aleatorios
        for (int i = 0; i < 30; i++) {
            numeros[i] = (int)(Math.random() * 10);
        }
        
        // Ordenamos el array
        Arrays.sort(numeros);
        
        // Mostramos el array
        System.out.print(Arrays.toString(numeros));
        
    }
    
}
