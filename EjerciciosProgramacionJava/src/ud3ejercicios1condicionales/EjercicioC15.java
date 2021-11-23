
import java.util.Scanner;

public class EjercicioC15 {

    public static void main(String[] args) {

        // Variables
        int nota1, nota2, nota3;
        double notaMedia;
        int notaRedondeada;
        int notaFinal;

        // Creamos el Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos notas
        System.out.print("Dime nota 1: ");
        nota1 = in.nextInt();
        System.out.print("Dime nota 2: ");
        nota2 = in.nextInt();
        System.out.print("Dime nota 3: ");
        nota3 = in.nextInt();

        // Calculamos nota media y redondeada
        notaMedia = (nota1 + nota2 + nota3) / 3.0;
        notaRedondeada = (int) Math.round(notaMedia);
        
        // Calculamos nota final
        if (nota1 < 5 || nota2 < 5 || nota3 < 5)
            notaFinal = Math.min(notaRedondeada, 4);
        else
            notaFinal = notaRedondeada;

        // Mostramos
        System.out.println("Nota media     : " + notaMedia);
        System.out.println("Nota redondeada: " + notaRedondeada);
        System.out.println("Nota final     : " + notaFinal);
        
    }
}
