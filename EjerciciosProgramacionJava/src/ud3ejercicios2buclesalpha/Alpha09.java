import java.util.Scanner;

public class Alpha09
{
    public static void main(String[] args) {
        
        // Variables
        int a, b, mult = 1;
        
        // Creo el Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos a y b
        System.out.println("Dime a y b:");
        a = in.nextInt();
        b = in.nextInt();
        
        // Acumulamos la multiplicación desde a hasta b
        for(int i = a; i <= b; i++){
            mult *= i;
        }
        
        // Mostramos la multiplicación
        System.out.println(mult);
    }
}
