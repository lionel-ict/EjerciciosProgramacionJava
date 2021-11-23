
import java.util.Scanner;

public class EjercicioC7 {

    public static void main(String[] args) {

        // Variables
        int a, b, c;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos tres números
        System.out.print("Dime un número: ");
        a = in.nextInt();
        System.out.print("Dime otro número: ");
        b = in.nextInt();
        System.out.print("Dime otro número: ");
        c = in.nextInt();

        // Comprobamos cual es el mayor
        if (a >= b && a >= c) {
            System.out.println("El mayor es " + a);
        } else if (b >= a && b >= c) {
            System.out.println("El mayor es " + b);
        } else {
            System.out.println("El mayor es " + c);
        }

        // OTRA FORMA DE HACERLO
        // System.out.println("El mayor es " + Math.max(a, Math.max(b,c)));
    }
}
