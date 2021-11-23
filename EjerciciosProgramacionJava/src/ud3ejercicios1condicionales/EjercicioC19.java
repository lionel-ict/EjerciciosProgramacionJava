
import java.util.Scanner;

public class EjercicioC19 {

    public static void main(String[] args) {

        // Variables
        int x;
        char car;

        // Scanner
        Scanner leer = new Scanner(System.in);

        // Pedimos número
        System.out.print("Introduce un número x: ");
        x = leer.nextInt();
        leer.nextLine(); // esto para recoger el 'intro'

        // Pedimos qué calcular
        System.out.print("Introduce un carácter (s/c/t) para Seno(x), Coseno(x) o Tangente(x): ");
        car = leer.nextLine().charAt(0); // charAt(0) coge la primera letra

        // Calculamos y mostramos
        switch (car) {
            case 's':
                System.out.println("El seno de " + x + " es: " + Math.sin(x));
                break;
            case 'c':
                System.out.println("El coseno de " + x + " es: " + Math.cos(x));
                break;
            case 't':
                System.out.println("La tangente de " + x + " es: " + Math.tan(x));
                break;
            default:
                System.out.println("ERROR: No has elegido s/c/t");
        }

    }
}
