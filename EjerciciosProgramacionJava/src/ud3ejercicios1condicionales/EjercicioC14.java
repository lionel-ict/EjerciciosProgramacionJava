
import java.util.Scanner;

public class EjercicioC14 {

    public static void main(String[] args) {

        // Variables
        int nMuj, nHom; // número
        double pMuj, pHom; // porcentaje
        int total;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos nº de mujeres y hombres
        System.out.print("Dime cuantas mujeres: ");
        nMuj = in.nextInt();
        System.out.print("Dime cuantos hombres: ");
        nHom = in.nextInt();

        // Calculamos
        total = nMuj + nHom;
        pMuj = 100.0 * nMuj / total;
        pHom = 100.0 * nHom / total;

        // Mostramos porcentajes
        System.out.println("Mujeres (%): " + pMuj);
        System.out.println("Hombres (%): " + pHom);
        
        // Mostramos si hay paridad
        if (nMuj > nHom)
            System.out.println("Hay más mujeres");
        else if (nHom > nMuj)
            System.out.println("Hay más hombres");
        else
            System.out.println("Hay paridad");
    }
}
