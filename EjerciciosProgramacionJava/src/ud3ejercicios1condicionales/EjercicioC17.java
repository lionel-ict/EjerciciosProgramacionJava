package ud3ejercicios1condicionales;


import java.util.Scanner;

public class EjercicioC17 {

    public static void main(String[] args) {

        // Variables
        double precioSinIva, precioConIva;
        int iva;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos precio e IVA
        System.out.print("Dime el precio: ");
        precioSinIva = in.nextDouble();
        System.out.print("Dime el IVA: ");
        iva = in.nextInt();

        // Comprobamos si los valores son válidos
        if (precioSinIva <= 0.0 || iva <= 0) {
            System.out.println("ERROR: Los valores han de ser mayores que cero");
        } else {
            // Calculamos y mostramos precio con IVA
            precioConIva = precioSinIva + (precioSinIva * iva / 100.0);
            System.out.println("Precio con IVA: " + precioConIva);
        }

    }
}
