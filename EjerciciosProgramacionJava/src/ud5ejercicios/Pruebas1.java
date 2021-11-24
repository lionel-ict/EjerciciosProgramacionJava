package ud5ejercicios;


import java.util.Scanner;

/*
 * Proyecto UD4Esjercicios1 - Archivo Pruebas.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

/**
 *
 * @author Lionel Tarazón Alcocer <ltarazona@ausiasmarch.net>
 * @version 1.0
 * @date 3 nov. 2021 21:01:33
 */
public class Pruebas1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s1, s2;
        
        System.out.print("Dame s1: ");
        s1 = in.nextLine();
        System.out.print("Dame s2: ");
        s2 = in.nextLine();
        
        if (s1.equals(s2)) {
            System.out.println("Son iguales");
        }
        else
            System.out.println("No son iguales");
        
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Son iguales");
        }
        else
            System.out.println("No son iguales");
        
    }
    
}
