package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        // variables
        String texto;
        // número de vocales de cada tipo
        int na = 0, ne = 0, ni = 0, no = 0, nu = 0;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos texto
        System.out.print("Introduce un texto: ");
        texto = in.nextLine();
        
        // Convertimos a mayúsculas para no diferencias
        // entre vocales mayúsculas y minúsculas
        texto = texto.toUpperCase();
        
        // Recorremos el texto buscando y contando vocales
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            switch (c) {
                case 'A':
                    na++;
                    break;
                case 'E':
                    ne++;
                    break;
                case 'I':
                    ni++;
                    break;
                case 'O':
                    no++;
                    break;
                case 'U':
                    nu++;
                    break;
            }
        }
        
        // Mostramos nº de vocales de cada tipo
        System.out.println("Nº de A: " + na);
        System.out.println("Nº de E: " + ne);
        System.out.println("Nº de I: " + ni);
        System.out.println("Nº de O: " + no);
        System.out.println("Nº de U: " + nu);

    }

}
