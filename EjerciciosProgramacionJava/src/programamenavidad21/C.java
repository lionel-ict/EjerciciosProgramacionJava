import java.util.Scanner;

public class C{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //  Juegos de prueba
        int casos=sc.nextInt();

        int tamanyo,i,j,k;

        // Aqui guardaremos el array de Strings
        String []palabras;
        // Aqui guardamos resultado
        String resultado="";

        // Por cada caso de prueba
        for (i=1; i<=casos; i++){
            // Leemos cuantas puntuaciones
            tamanyo=sc.nextInt();
            // Creamos el array, indicando el tamaño dinamicamente
            palabras = new String[tamanyo];
            String tmp=sc.nextLine(); // Para leer hasta el retorno de carro despues del numero, no se usa

            // Leemos las puntuaciones
            for (j=0;j<tamanyo;j++){
                palabras[j]=sc.nextLine();
            }
            // Inicializamos el resultado a cadena vacia
            resultado="";

            // Fors para leer en el orden pedido y generar la cadena
            for(k=0;k<3;k++){
                for (j=0;j<tamanyo;j++){
                    resultado+=palabras[j].charAt(k);
                }         
            }
            
            // OTRA FORMA DE HACERLO
            for (int z=0; z<tamanyo; z++)
                    resultado += palabras[z].charAt(0);
            for (int z=0; z<tamanyo; z++)
                    resultado += palabras[z].charAt(1);
            for (int z=0; z<tamanyo; z++)
                    resultado += palabras[z].charAt(2);
            
            // Imprimimos resultado
            System.out.println(resultado);;


        }
        sc.close();
    }
}