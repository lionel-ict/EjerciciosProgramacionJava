package ud3ejercicios2bucles;


import java.util.Scanner;

public class Beta12 {

    public static void main(String[] args) {

        // Variables
        int num, min = 1, max = 100;
        boolean acertado = false;
        char c;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Bucle en el que intentamos adivinar el número una y otra vez
        do {
            // Número a preguntar
            num = (min + max) / 2;

            // Preguntamos al usuario
            System.out.print("¿Es el " + num + "? ");
            System.out.println("(s)Sí (+)Es mayor (-)Es menor");
            c = in.nextLine().charAt(0);

            switch (c) {
                // Acertado
                case 's':
                    System.out.println("¡He acertado!");
                    acertado = true;
                    break;
                // El número es mayor
                case '+':
                    min = num;
                    break;
                // El número es menor
                case '-':
                    max = num;
                    break;
                // Otro
                default:
                    System.out.println("Aviso: Respuesta incorrecta");
            }
        } while (!acertado);

        System.out.println("El número que has pensado es: " + num);
    }
}
