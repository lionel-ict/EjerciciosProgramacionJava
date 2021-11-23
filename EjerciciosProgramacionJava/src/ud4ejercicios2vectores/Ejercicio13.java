package ud4ejercicios2vectores;


import java.util.Scanner;

public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        // Variables
        int[] secuencia;
        int n, valorInicial, incremento;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos N
        System.out.print("Dime N: ");
        n = in.nextInt();
        
        // Creamos el vector de tamaño N
        secuencia = new int[n];
        
        // Pedimos V e I
        System.out.print("Dime Valor Inicial: ");
        valorInicial = in.nextInt();
        System.out.print("Dime Incremento   : ");
        incremento = in.nextInt();
        
        // Insertamos la cuencia en el vector
        for (int i = 0; i < n; i++) {
            secuencia[i] = valorInicial + (incremento * i);
        }
        
        // Mostramos la secuencia
        for (int i = 0; i < n; i++) {
            System.out.println("Numero " + i + ": " + secuencia[i]);
        }
        
    }
    
}
