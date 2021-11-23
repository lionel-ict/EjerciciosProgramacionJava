import java.util.Scanner;

public class Beta03 {

    public static void main(String[] args) {
        
        // Variables
        int num, pos = 0, neg = 0;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Bucle do-while para pedir números hasta introducir cero
        do {
            // Pedimos número
            System.out.print("¿Número? ");
            num = in.nextInt();
            
            // Contamos si es positivo o negativo
            if (num > 0)
                pos++;
            else if (num < 0)
                neg++;
            
        } while (num != 0);
        
        // Mostramos cuantos positivos y negativos
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
    }
}
