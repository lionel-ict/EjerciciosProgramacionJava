package ud3ejercicios1condicionales;


import java.util.Scanner;

public class EjercicioC10 {

    public static void main(String[] args) {

        // Variables
        double a, b;
        double suma, resta, prod, div;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos dos números
        System.out.print("Dime un número: ");
        a = in.nextDouble();
        System.out.print("Dime otro número: ");
        b = in.nextDouble();

        // Calculamos y mostramos + - *
        suma = a + b;
        resta = a - b;
        prod = a * b;
        System.out.println("Suma : " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Prod : " + prod);

        // NOTA: No es indispensable guardar el resultado en variables,
        // podría hacerse el cálculo directamente en el println así:
        // System.out.println("Suma : " + (a+b));
        
        // Calculamos y mostramos / (evitando dividir por 0)
        if (b == 0.0) {
            System.out.println("Div  : Infinito");
        } else {
            div = a / b;
            System.out.println("Div  : " + div);
        }

    }
}
