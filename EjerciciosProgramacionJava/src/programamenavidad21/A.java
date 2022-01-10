import java.util.Scanner;

public class A{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //  Juegos de prueba
        long C=sc.nextLong();


        //Cada caso de prueba, compuesto por n, f,t
        long barra,factor,tiempo;
        //Almacenamos el resultado
        long res;
        
        for (long i=0;i<C;i++){
            barra=sc.nextLong();
            factor=sc.nextLong();
            tiempo=sc.nextLong();

            // Formula a deducir del problema
            // Tmbien en lugar de %, aunque mas lenta, entra con restas mediante while
            res=(tiempo % (barra + 1)) * factor;

            System.out.println(res);

        }
    }
}