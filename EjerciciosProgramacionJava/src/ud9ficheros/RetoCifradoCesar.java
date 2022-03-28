package ud9ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RetoCifradoCesar {
    
    public static void main(String[] args) {
        
        String texto = "";
        
        try {
            
            File f = new File("src/ud9ficheros/carta-cifrada.txt");
            Scanner sc = new Scanner(f);
            texto = sc.nextLine();
            
            //TODO TERMINAR
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
        System.out.println(texto);
        
    }
    
}
