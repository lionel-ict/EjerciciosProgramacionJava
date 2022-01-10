
import java.util.Scanner;

public class B {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String tmp;
        
        while (true) {
            //Leemos el numero de sonidos
            long n = sc.nextInt();
            
            // Caso de que se han acabado los casos de prueba
            if (n == 0) {
                break;
            }

            int puntos1 = 0, puntos2 = 0;

            // Direccion false indica izquierda, true indica derecha (al inicio)
            boolean direccion = true;
            for (int i = 0; i < n; i++) {
                tmp = sc.next();
                if (tmp.equals("PIC")) {
                    direccion = !direccion;
                }
                // Es punto. Segun direccion, sumamos a uno u otro
                if (tmp.equals("PONG!")) {
                    if (direccion) {
                        puntos1++;
                    } else {
                        puntos2++;
                    }
                }
            }
            System.out.println(puntos1 + " " + puntos2);
        }

    }
}
