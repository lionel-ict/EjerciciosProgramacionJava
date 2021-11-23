import java.util.Scanner;

public class Alpha08
{
    public static void main(String[] args) {
        
        // Variables
        int mult = 1;
        
        // Acumulamos la multiplicación desde 1 hasta 10
        for(int i = 1; i <= 10; i++){
            mult *= i;
        }
        
        // Mostramos la multiplicación
        System.out.println(mult);
    }
}
