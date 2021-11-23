
import java.util.Scanner;

public class EjercicioC3 {

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

        // Comprobamos cual es el mayor
        if (a >= b) {
            System.out.println("El mayor es " + a);
        } else {
            System.out.println("El mayor es " + b);
        }
    }
}
