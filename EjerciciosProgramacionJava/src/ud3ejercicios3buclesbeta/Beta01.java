import java.util.Scanner;

public class Beta01 {

    public static void main(String[] args) {
        
        // Variables
        int num;
        
        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos número al usuario
        System.out.print("¿Número de tabla de multiplicar? ");
        num = in.nextInt();
        
        // Mostramos tabla de multiplicar
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        
    }
}
