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
public class Pruebas {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Dame un texto: ");
        String s = in.nextLine();
        
        String mayus = s.toUpperCase();
        String minus = s.toLowerCase();
        
        System.out.println(mayus);
        System.out.println(minus);
        System.out.println(s);
        
        
        
    }
    
}
