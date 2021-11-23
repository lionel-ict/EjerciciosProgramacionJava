
import java.util.Scanner;

public class EjercicioC22 {

    public static void main(String[] args) {

        // Variables
        double precio1, precio2, precio3;
        int iva;
        double totalSinIva, valorIva, totalConIva;
        double descuento = 0.0;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos 3 precios y el iva
        System.out.print("Dime precio 1: ");
        precio1 = in.nextDouble();
        System.out.print("Dime precio 2: ");
        precio2 = in.nextDouble();
        System.out.print("Dime precio 3: ");
        precio3 = in.nextDouble();
        System.out.print("Dime el % de IVA: ");
        iva = in.nextInt();
        
        // Total sin IVA
        totalSinIva = precio1 + precio2 + precio3;
        System.out.println("Total sin iva: " + totalSinIva);
        
        // Comprobamos si hay descuento
        if (totalSinIva > 50.0) {
            descuento = totalSinIva * 0.05;
            System.out.println("Descuento: " + descuento);
            totalSinIva -= descuento;
            System.out.println("Total sin iva - descuento: " + totalSinIva);
        }
        
        // Valor del Iva y total con Iva
        valorIva = totalSinIva * iva / 100.0;
        System.out.println("Valor del iva: " + valorIva);
        totalConIva = totalSinIva + valorIva;
        System.out.println("Total con iva: " + totalConIva);

    }
}
