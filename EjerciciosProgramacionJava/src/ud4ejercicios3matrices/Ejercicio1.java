package ud4ejercicios3matrices;


public class Ejercicio1 {

    public static void main(String[] args) {

        // Variables
        int[][] numeros = new int[5][5];
        int contador = 1;

        // Rellenamos la matriz con los números del 1 al 25
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = contador;
                contador++;
            }
        }

        // Mostramos la matriz
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Fila " + i + ": ");
            for (int j = 0; j < numeros[0].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
