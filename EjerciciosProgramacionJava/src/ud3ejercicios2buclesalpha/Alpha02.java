import java.util.Scanner;

public class Alpha02
{
    public static void main(String[] args) {
        
        // Variables
        int a, b;
        
        // Creo el Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos a y b
        System.out.print("Dime a y b: ");
        a = in.nextInt();
        b = in.nextInt();
        
        // Mostramos valores entre a y b
        for(int i = a; i <= b; i++){
            System.out.println(i);
        }
    }
}
