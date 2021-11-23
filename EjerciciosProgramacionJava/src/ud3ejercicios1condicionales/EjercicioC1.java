
import java.util.Scanner;

public class EjercicioC1 {

    public static void main(String[] args) {

        // Variables
        int edad;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos edad
        System.out.print("Dime tu edad: ");
        edad = in.nextInt();

        // Comprobamos si es mayor de edad
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
    }
}
