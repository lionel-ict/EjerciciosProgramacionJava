package ud3ejercicios2bucles;


import java.util.Scanner;

public class Alpha16 {

    public static void main(String[] args) {

        // Variables
        int numero, negativos = 0, positivos = 0;

        // Creo el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos 5 números
        for (int i = 1; i <= 5; i++) {
            
            // Pedimos número
            System.out.print("Dime un numero: ");
            numero = in.nextInt();
            
            // Contamos si positivo o negativo
            if (numero >= 0)
                positivos++;
            else
                negativos++;
        }

        // Mostramos cuantos positivos y cuantos negativos
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        
    }
}
