package ud3ejercicios1condicionales;


import java.util.Scanner;

public class EjercicioC9 {

    public static void main(String[] args) {

        // Variables
        int a, b;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos dos números
        System.out.print("Dime un número: ");
        a = in.nextInt();
        System.out.print("Dime otro número: ");
        b = in.nextInt();

        // Comprobamos si alguno es múltiplo del otro
        if ((a % b) == 0) {
            System.out.println(a + " es múltiplo de " + b);
        } else if ((b % a) == 0) {
            System.out.println(b + " es múltiplo de " + a);
        } else {
            System.out.println("Ninguno es múltiplo del otro");
        }
    }
}
