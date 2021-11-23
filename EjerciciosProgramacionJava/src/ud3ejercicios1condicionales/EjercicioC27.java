
import java.util.Scanner;

public class EjercicioC27 {

    public static void main(String[] args) {

        // Variables
        int dn, mn, an; // dia, mes y año de nacimiento
        int da, ma, aa; // dia, mes y año actual
        int edad;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos fecha de nacimiento
        System.out.print("Dia nacimiento: ");
        dn = in.nextInt();
        System.out.print("Mes nacimiento: ");
        mn = in.nextInt();
        System.out.print("Año nacimiento: ");
        an = in.nextInt();

        // Pedimos fecha actual
        System.out.print("Dia actual: ");
        da = in.nextInt();
        System.out.print("Mes actual: ");
        ma = in.nextInt();
        System.out.print("Año actual: ");
        aa = in.nextInt();

        // Calculamos la edad como diferencia de años - 1
        edad = aa - an - 1;

        // Si ha pasado el cumpleaños => +1 a la edad
        if ((ma > mn) || (ma == mn && da >= dn))
            edad++;

        // Mostramos edad
        System.out.println("Edad: " + edad);

    }
}
