
import java.util.Scanner;

public class EjercicioC18 {

    public static void main(String[] args) {

        // Variables
        char car;

        // Creamos el scanner
        Scanner leer = new Scanner(System.in);

        // Pedimos letra
        System.out.println("Introduce una letra ");
        car = leer.nextLine().charAt(0);

        // Comprobamos si es mayúscula o minúscula
        if (car >= 'A' && car <= 'Z') {
            System.out.println(car + " es mayúscula");
        } else if (car >= 'a' && car <= 'z') {
            System.out.println(car + " es minúscula");
        } else {
            System.out.println(car + " no es una letra");
        }

    }
}
