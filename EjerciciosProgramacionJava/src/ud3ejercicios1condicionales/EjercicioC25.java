
import java.util.Scanner;

public class EjercicioC25 {

    public static void main(String[] args) {

        // Variables
        double minutos, cobro;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos minutos
        System.out.print("¿Minutos de la llamada? ");
        minutos = in.nextDouble();

        // Calculamos cantidad a cobrar
        if (minutos <= 5.0)
            cobro = 1.0;
        else if (minutos <= 8.0)
            cobro = 1.8;
        else if (minutos <= 10.0)
            cobro = 2.5;
        else {
            cobro = 2.5 + (0.5 * Math.ceil(minutos - 10.0));
        }
        
        // Mostramos cantidad a cobrar
        System.out.println("Cantidad a cobrar: " + cobro);
    }
}
