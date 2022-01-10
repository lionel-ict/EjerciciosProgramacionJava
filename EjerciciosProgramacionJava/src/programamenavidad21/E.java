import java.util.HashSet;
import java.util.Scanner;

public class E{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        int columnas, filas;
        String []pantalla;
        
        int i,j,k,l;
        boolean posible=true;

        while(true){
            //  leemos cuantos niveles y preparamos array
            columnas=sc.nextInt();
            filas=sc.nextInt();

            // partimos que posible es true

            posible=true;

            // Caso fin de la entrada
            if(columnas==0 && filas==0){
                return;
            }

            String tmp=sc.nextLine(); // Temporal, no usado, es para leer el retorno de carro despues entero

            // Declaramos tamaño array para leer la pantalla
            pantalla=new String[filas];
            // Leemos la pantalla
            for(i=0;i<filas;i++){
                pantalla[i]=sc.nextLine();
            }


            // Forma mas sencilla, con 4 bucles


            // Marcamos columnas de 8 en 8
            for(i=0;i<columnas && posible;i+=8){
                // Marcamos filas de 8 en 8
                for(j=0;j<filas && posible;j+=8){

                    // Creamos un conjunto (se puede hacer de muchas otras formas)
                    HashSet<Character> set = new HashSet<Character>(); // Inicializado

                    //Recorremos las filas y columnas marcadas
                    for (k=i;k<i+8 && posible;k++){
                        for (l=j;l<j+8 && posible;l++){
                            // Las añadimos al conjunto
                            set.add(pantalla[l].charAt(k));

                            // Si en algun momento el conjuto es mas de 2, es que no se puede
                            if(set.size()>2){
                                posible=false;
                                break;
                            }

                        }
                    }
                }
                
            }

            if(posible){
                System.out.println("SI");
            }else{
                System.out.println("NO");    
            }


        }

    }
}