
import java.util.Scanner;

// VERSIÓN SIN BUCLES (MÁS EFICIENTE)
public class Beta11v2 {

    public static void main(String[] args) {

        // Variables
        int euros;
        int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);

        // Pedimos X
        System.out.print("Dime euros: ");
        euros = in.nextInt();

        // ¿Billetes de 500?
        b500  = euros / 500;
        euros = euros % 500;
        
        // ¿Billetes de 200?
        b200  = euros / 200;
        euros = euros % 200;
        
        // ¿Billetes de 100?
        b100  = euros / 100;
        euros = euros % 100;
        
        // ¿Billetes de 50?
        b50   = euros / 50;
        euros = euros % 50;
        
        // ¿Billetes de 20?
        b20   = euros / 20;
        euros = euros % 20;
        
        // ¿Billetes de 10?
        b10   = euros / 10;
        euros = euros % 10;
        
        // ¿Billetes de 5?
        b5    = euros / 5;
        euros = euros % 5;

        // Mostramos billetes necesarios
        System.out.println("Para " + euros + " euros es necesario:");
        System.out.println("Billetes de 500: " + b500);
        System.out.println("Billetes de 200: " + b200);
        System.out.println("Billetes de 100: " + b100);
        System.out.println("Billetes de 50 : " + b50);
        System.out.println("Billetes de 20 : " + b20);
        System.out.println("Billetes de 10 : " + b10);
        System.out.println("Billetes de 5  : " + b5);
    }
}
