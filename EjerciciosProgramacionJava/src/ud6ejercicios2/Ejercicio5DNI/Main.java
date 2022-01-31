package ud6ejercicios2.Ejercicio5DNI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        DNI[] dnis = new DNI[10000];
        
        Scanner in = new Scanner(System.in);
        in.nextLine();
        
        for (int i = 0; i < dnis.length; i++) {
            dnis[i] = DNI.newRandomDNI();
            Math.random();
            
            dnis[i].imprime();
        }
        
        
        
        
        
        
    }
    
}
