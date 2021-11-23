
import java.util.Scanner;

public class EjercicioC12 {

    public static void main(String[] args) {

        // Variables
        int mes;
        int dias;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos el nº de día
        System.out.print("Dime el mes (del 1 al 12): ");
        mes = in.nextInt();

        // Dias del mes
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = 0;
        }

        // Mostramos los dias del mes
        System.out.println("El mes tiene " + dias + " dias");

    }
}
