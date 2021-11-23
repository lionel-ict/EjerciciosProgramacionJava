package ud4ejercicios1strings;


import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {

        // variables
        String nom, ap1, ap2, codigoUsuario;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos nombre y apellidos
        System.out.print("Nombre: ");
        nom = in.nextLine();
        System.out.print("Apellido 1: ");
        ap1 = in.nextLine();
        System.out.print("Apellido 2: ");
        ap2 = in.nextLine();
        
        // Obtenemos el código de usuario
        codigoUsuario = nom.substring(0,3);
        codigoUsuario += ap1.substring(0, 3);
        codigoUsuario += ap2.substring(0, 3);
        
        // Convertimos a mayúsculas
        codigoUsuario = codigoUsuario.toUpperCase();
        
        // Mostramos código de usuario
        System.out.println("Código de usuario: " + codigoUsuario);
        
    }
}
