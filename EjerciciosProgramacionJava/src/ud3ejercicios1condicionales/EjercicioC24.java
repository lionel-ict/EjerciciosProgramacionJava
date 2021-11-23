package ud3ejercicios1condicionales;


import java.util.Scanner;

public class EjercicioC24 {

    public static void main(String[] args) {

        // Variables
        double compra, descrec = 0.0, pagar;
        char tipoPago;

        // Creamos el scanner
        Scanner in = new Scanner(System.in);

        // Pedimos valor de la compra y tipo de pago
        System.out.print("¿Valor de la compra? ");
        compra = in.nextInt();
        in.nextLine();
        System.out.print("¿Pago al contado o tarjeta? c/t: ");
        tipoPago = in.nextLine().charAt(0);

        // Calculamos el descuento o recargo
        if (tipoPago == 'c') {
            descrec = compra * 0.05 * -1;
            System.out.println("Descuento del 5%: " + descrec);
        } else if (tipoPago == 't') {
            descrec = compra * 0.03;
            System.out.println("Recargo del 3%: " + descrec);
        }

        // Calculamos y mostramos cuanto hay que pagar
        pagar = compra + descrec;
        System.out.println("Total a pagar: " + pagar);
        
    }
}
