import java.util.Scanner;

public class Beta04 {

    public static void main(String[] args) {
        
        // Variables
        int nota, suma = 0, cuantas = 0;
        double media;
        boolean hay10 = false;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Bucle do-while para pedir notas hasta introducir -1
        do {
            // Pedimos número
            System.out.print("¿Nota? ");
            nota = in.nextInt();
            
            // Contamos si es positivo o negativo
            if (nota >= 0) {
                suma += nota;
                cuantas++;
            }
            if (nota == 10)
                hay10 = true;
            
        } while (nota != -1);
        
        // Calculamos media
        media = (double)suma / (double)cuantas;
        
        // Mostramos suma y media
        System.out.println("Suma : " + suma);
        System.out.println("Media: " + media);
        
        // Mostramos si hubo algún diez
        if (hay10)
            System.out.println("Hubo algún diez");
        else
            System.out.println("No hubo diez");
    }
}
