import java.util.Scanner;

public class Beta07 {

    public static void main(String[] args) {
        
        // Variables
        int n, fact = 1;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos N
        System.out.print("Dime N: ");
        n = in.nextInt();
        
        // Calculamos N! (el factorial de N)
        // Bucle i va desde N hasta 1, multiplicamos por i
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        
        // Mostramos N!
        System.out.println("N! es " + n + "! = " + fact);
    }
}
