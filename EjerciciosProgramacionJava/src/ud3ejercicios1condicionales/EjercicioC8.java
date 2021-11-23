
import java.util.Scanner;

public class EjercicioC8 {

    public static void main(String[] args) {

        // Variables
        int a, b;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos dos números
        System.out.print("Dime un número: ");
        a = in.nextInt();
        System.out.print("Dime otro número: ");
        b = in.nextInt();

        // Comprobamos si a es múltiplo de b
        if ((a % b) == 0) {
            System.out.println(a + " SÍ es múltiplo de " + b);
        } else {
            System.out.println(a + " NO es múltiplo de " + b);
        }
    }
}
