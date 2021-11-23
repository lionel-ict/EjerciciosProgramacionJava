package ud3ejercicios1condicionales;


import java.util.Scanner;

public class EjercicioC21 {

    public static void main(String[] args) {

        // Variables
        double kg, m, imc;

        // Creamos el scanner
        Scanner in = new Scanner(System.in);

        // Pedimos peso y altura
        System.out.print("Dime el peso (kg): ");
        kg = in.nextDouble();
        System.out.print("Dime la altura (m): ");
        m = in.nextDouble();
        
        // Calculamos y mostramos IMC
        imc = kg / (m * m);
        System.out.println("IMC: " + imc);

        // Mostramos diagnóstico
        System.out.print("Diagnóstico: ");
        if (imc < 16) {
            System.out.println("Ingreso en hospital");
        } else if (imc <= 17) {
            System.out.println("Infrapeso");
        } else if (imc <= 18) {
            System.out.println("Bajo peso");
        } else if (imc <= 25) {
            System.out.println("Peso normal (saludable)");
        } else if (imc <= 30) {
            System.out.println("Sobrepeso (obesidad grado I)");
        } else if (imc <= 35) {
            System.out.println("Sobrepeso (obesidad grado II)");
        } else if (imc <= 40) {
            System.out.println("Sobrepeso (obesidad grado III)");
        } else {
            System.out.println("Sobrepeso (obesidad grado IV)");
        }

    }
}
