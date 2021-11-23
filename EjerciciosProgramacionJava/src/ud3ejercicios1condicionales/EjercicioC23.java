package ud3ejercicios1condicionales;


import java.util.Scanner;

public class EjercicioC23 {

    public static void main(String[] args) {

        // Variables
        double cuota, cuotaGeneral = 200.0;
        int edad;
        boolean padresSocios = false;

        // Creamos el scanner
        Scanner in = new Scanner(System.in);

        // Pedimos edad
        System.out.print("Dime la edad: ");
        edad = in.nextInt();
        in.nextLine();

        // Si menor de edad, preguntamos si padres socios
        if (edad < 18) {
            System.out.print("¿Los padres son socios? s/n: ");
            char c = in.nextLine().charAt(0);
            if (c == 's')
                padresSocios = true;
        }
        
        // Calculamos la cuota
        if (edad > 65) {
            System.out.println("Descuento del 50%");
            cuota = cuotaGeneral * 0.5;
        }
        else if (edad < 18 && padresSocios) {
            System.out.println("Descuento del 35%");
            cuota = cuotaGeneral * 0.65;
        }
        else if (edad < 18 && !padresSocios) {
            System.out.println("Descuento del 25%");
            cuota = cuotaGeneral * 0.75;
        }
        else {
            System.out.println("Sin descuento.");
            cuota = cuotaGeneral;
        }
        
        // Mostramos la cuota
        System.out.println("Cuota a pagar: " + cuota);

    }
}
