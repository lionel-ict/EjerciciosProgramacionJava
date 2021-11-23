package ud3ejercicios2bucles;

import java.util.Scanner;

public class Beta02 {

    public static void main(String[] args) {
        
        // Variables
        int suma = 0, prod = 1;
        
        // Calculamos suma y producto de 1 a 10
        for (int i = 1; i <= 10; i++) {
            suma += i;
            prod *= i;
        }
        
        // Mostramos suma y producto
        System.out.println("Suma    : " + suma);
        System.out.println("Producto: " + prod);
        
    }
}
