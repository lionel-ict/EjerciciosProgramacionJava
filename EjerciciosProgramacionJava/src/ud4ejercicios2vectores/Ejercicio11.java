package ud4ejercicios2vectores;


public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        
        // Insertamos en array1 los valores de 1 a 10
        for (int i = 0; i < 10; i++) {
            array1[i] = i + 1;
        }
        
        // Copiamos array1 en array2 en orden inverso
        for (int i = 0; i < 10; i++) {
            array2[i] = array1[9-i];
        }
        
        // Mostramos array1
        System.out.print("ARRAY 1:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array1[i]);
        }
        
        // Salto de línea
        System.out.println("");
        
        // Mostramos array2
        System.out.print("ARRAY 2:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array2[i]);
        }
        
        // Salto de línea
        System.out.println("");
    }
    
}
