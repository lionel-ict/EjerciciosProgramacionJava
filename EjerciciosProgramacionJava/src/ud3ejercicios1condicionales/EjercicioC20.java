
import java.util.Scanner;

public class EjercicioC20 {

    public static void main(String[] args) {

        // Variables
        int nota;

        // Creamos el scanner
        Scanner in = new Scanner(System.in);

        // Pedimos la temperatura
        System.out.print("Dame una nota entre 0 y 10: ");
        nota = in.nextInt();

        // Mostramos calificación alfabética
        if (nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Bien");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }

    }
}
