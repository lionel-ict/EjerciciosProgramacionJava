package ud3ejercicios2buclesalpha;


import java.util.Scanner;

public class Alpha14 {

    public static void main(String[] args) {

        // Variables
        int numero;
        boolean algunMult10 = false;

        // Creo el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos 5 números
        for (int i = 1; i <= 5; i++) {
            
            // Pedimos número
            System.out.print("Dime un numero: ");
            numero = in.nextInt();
            
            // Si es par, ponemos interruptor a true
            if ((numero % 10) == 0) {
                algunMult10 = true;
            }
        }

        // Mostramos si alguno era múltiplo
        if (algunMult10)
            System.out.println("Alguno era múltiplo de 10");
        else
            System.out.println("Ninguno era múltiplo de 10");
    }
}
