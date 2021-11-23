package ud3ejercicios1condicionales;


import java.util.Scanner;

public class EjercicioC30 {

    public static void main(String[] args) {

        // Variables
        int horas;
        double tarifa, bruto, impuestos = 0.0, neto;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos horas trabajadas y tarifa
        System.out.print("Horas trabajadas: ");
        horas = in.nextInt();
        System.out.print("Tarifa: ");
        tarifa = in.nextDouble();
        
        // Calculamos salario bruto
        if (horas <= 35) {
            bruto = horas * tarifa;
        }
        else {
            bruto = (35 * tarifa) + ((horas - 35) * tarifa * 1.5);
        }
        
        // Calculamos impuestos
        if (bruto > 500 && bruto <= 900) {
            impuestos = (bruto - 500) * 0.25;
        }
        else if (bruto > 900) {
            impuestos = 400 * 0.25;
            impuestos += (bruto - 900) * 0.45;
        }
        
        // Calculamos salario neto
        neto = bruto - impuestos;
        
        // Mostramos toda la información
        System.out.println("Salario bruto: " + bruto);
        System.out.println("Impuestos    : " + impuestos);
        System.out.println("Salario neto : " + neto);

    }
}
