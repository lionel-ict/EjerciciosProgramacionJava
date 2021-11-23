
import java.util.Scanner;

public class EjercicioC4 {

    public static void main(String[] args) {

        // Variables
        int num;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos un número
        System.out.print("Dime un número: ");
        num = in.nextInt();

        // Comprobamos si es positivo o negativo
        if (num >= 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }
}
