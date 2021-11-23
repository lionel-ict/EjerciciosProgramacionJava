

import java.util.Scanner;

public class CP0_AppNotas {

    public static void main(String[] args) {
        
        int MAX = 100;
        int cuantos = 0;
        String[] nombres = new String[MAX];
        int[]    notas   = new int[MAX];
        
        int opcion;
        boolean salir = false;
        
        Scanner in = new Scanner(System.in);
        
        do {
        
            System.out.println("1. Ver notas");
            System.out.println("2. Añadir nota");
            System.out.println("3. Borrar nota");
            System.out.println("4. Estadísticas");
            System.out.println("5. Ver suspendidos");
            System.out.println("6. Salir");
            
            System.out.print("Elige opción: ");
            opcion = in.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("LISTA DE NOTAS:");
                    for (int i = 0; i < cuantos; i++) {
                        System.out.println("Nota " + i + ": " + nombres[i] + " " + notas[i]);
                    }
                    break;
                    
                case 2:
                    if (cuantos < MAX) {
                        in.nextLine();
                        System.out.print("Dime nombre a añadir: ");
                        nombres[cuantos] = in.nextLine();
                        System.out.print("Dime la nota a añadir: ");
                        notas[cuantos] = in.nextInt();
                        cuantos++;
                    }
                    else {
                        System.out.println("ERROR: Vector de notas lleno");
                    }
                    break;
                    
                case 3:
                    System.out.print("Dime la nota a borrar: ");
                    int borrar = in.nextInt();
                    if (borrar >= 0 && borrar < cuantos) {
                        for (int i = borrar + 1; i < cuantos; i++) {
                            nombres[i-1] = nombres[i];
                            notas[i-1] = notas[i];
                        }
                        cuantos--;
                        System.out.println("Nota " + borrar + " borrada");
                    }
                    else {
                        System.out.println("ERROR: No existe esa nota");
                    }
                    break;
                    
                case 4:
                    System.out.println("ESTADÍSTICAS:");
                    int total = 0;
                    int min = Integer.MAX_VALUE;
                    int max = Integer.MIN_VALUE;
                    for (int i = 0; i < cuantos; i++) {
                        total += notas[i];
                        min = Math.min(min, notas[i]);
                        max = Math.max(max, notas[i]);
                    }
                    double media = ((double)total) / cuantos;
                    System.out.println("Media : " + media);
                    System.out.println("Máximo: " + max);
                    System.out.println("Mínimo: " + min);
                    break;
                    
                case 5:
                    System.out.println("SUSPENDIDOS:");
                    for (int i = 0; i < cuantos; i++) {
                        if (notas[i] < 5)
                            System.out.println("Nota " + i + ": " + nombres[i] + " " +  notas[i]);
                    }
                    break;
                    
                case 6:
                    salir = true;
                    break;
            }
            
            System.out.println("");
        
        } while(!salir);
        
        
        
    }
    
}
