package ud4ejercicios2vectores;


import java.util.Arrays;


public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] numeros = new int[55];
        int aux = 0; // Usaremos aux para recorrer el vector
        
        // Para i desde 1 hasta 10
        for (int i = 1; i <= 10; i++) {
            
            // Insertamos i veces el valor i
            // (desde la posición aux hasta aux+i)
            Arrays.fill(numeros, aux, aux+i, i);
            
            // Actualizamos aux
            aux += i;

        }
        
        // Mostramos el vector
        System.out.print(Arrays.toString(numeros));
        
    }
    
}
