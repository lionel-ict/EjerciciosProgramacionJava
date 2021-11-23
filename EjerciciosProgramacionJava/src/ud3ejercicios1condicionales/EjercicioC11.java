
import java.util.Scanner;

public class EjercicioC11 {

    public static void main(String[] args) {

        // Variables
        int d;
        String dia;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos el nº de día
        System.out.print("Dime el día de la semana (del 1 al 7): ");
        d = in.nextInt();

        // Obtenemos el String del día
        switch (d) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Error";
        }

        // Mostramos el día de la semana
        System.out.println("El día de la semana es " + dia);

    }
}
