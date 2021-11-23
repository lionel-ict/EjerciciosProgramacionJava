package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio07 {
    
    public static void main(String[] args) {
        
        // Variables
        int p, q, cuantos;
        int[] numeros;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos p y q
        System.out.println("Dime P: ");
        p = in.nextInt();
        System.out.println("Dime Q: ");
        q = in.nextInt();
        
        // Calculamos cuantos valores hay desde P hasta Q
        cuantos = q - p + 1;
        
        // Creamos el array de tamaño 'cuantos'
        numeros = new int[cuantos];
        
        // Insertamos los valores desde P hasta Q
        for (int i = 0; i < cuantos; i++) {
            numeros[i] = p + i;
        }
        
        // Mostramos los numeros
        for (int i = 0; i < cuantos; i++) {
            System.out.println("Numero " + i + ": " + numeros[i]);
        }
        
    }
    
}
