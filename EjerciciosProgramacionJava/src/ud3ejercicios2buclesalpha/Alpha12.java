package ud3ejercicios2buclesalpha;

import java.util.Scanner;

public class Alpha12
{
    public static void main(String[] args) {
        
        // Variables
        int a, b;
        
        // Creo el Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos a y b
        System.out.println("Dime a y b:");
        a = in.nextInt();
        b = in.nextInt();
        
        // Bucle desde A hasta B
        for(int i = a; i <= b; i++){
            // Mostramos solo si positivo
            if (i >= 0)
                System.out.println(i);
        }
        
        // OTRA FORMA DE HACERLO (más eficiente)
        System.out.println("OTRA FORMA DE HACERLO");
        for(int i = Math.max(0,a); i <= b; i++){
            System.out.println(i);
        }
    }
}
