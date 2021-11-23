
import java.util.Scanner;

public class EjercicioC13 {

    public static void main(String[] args) {

        // Variables
        int temp;

        // Creamos el scanner
        Scanner in = new Scanner(System.in);

        // Pedimos la temperatura
        System.out.print("Dime una temperatura en ºC: ");
        temp = in.nextInt();

        // Mostramos el tipo de clima
        if (temp < 10) {
            System.out.println("Frío");
        } else if (temp <= 19) {
            System.out.println("Templado");
        } else if (temp <= 29) {
            System.out.println("Caluroso");
        } else {
            System.out.println("Tropical");
        }

    }
}
