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
public class Pruebas11 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s1, s2;
        char c;
        
        System.out.print("Dame s1: ");
        s1 = in.nextLine();
        
        int contA = 0;
        
        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            //System.out.println("Char en la posicion " + i + " " + c);
            if ( c == 'A')
                contA++;
        }
        
        System.out.println(contA);
        
        System.out.println("HOLA QUE ASE");
        
    }
    
}
