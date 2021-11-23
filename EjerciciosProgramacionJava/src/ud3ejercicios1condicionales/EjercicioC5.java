
import java.util.Scanner;

public class EjercicioC5 {

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

        // Los mostramos en orden ascendente
        if (a <= b) {
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(b);
            System.out.println(a);
        }

        // OTRA FORMA DE HACERLO
        // System.out.println(Math.min(a,b));
        // System.out.println(Math.max(a,b));
    }
}
