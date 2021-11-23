import java.util.Scanner;

public class Alpha13
{
    public static void main(String[] args) {
        
        // Variables
        int a, b;
        
        // Creo el Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos a y b
        System.out.println("Dime a y b:");
        a = in.nextInt();
        b = in.nextInt();
        
        // Bucle desde A hasta B
        for(int i = a; i <= b; i++){
            // Mostramos solo si es par
            if ((i % 2) == 0)
                System.out.println(i);
        }
        
    }
}
