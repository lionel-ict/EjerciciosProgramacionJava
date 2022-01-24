package ud6ejercicios2.Ejemplo;

public class EmpleadoApp1 {

    public static void main(String[] args) {

        // Vector ints
        int[] v = { 1, 2, 5, 100, -100 };
        
        //Creamos objetos en cada posicion
        Empleado a1 = new Empleado("Fernando", "Ureña", 23, 1000);
        Empleado a2 = new Empleado("Epi", "Dermis", 30, 1500);
        Empleado a3 = new Empleado("Blas", "Femia", 25, 1200);
        
        //Creamos un array de objetos de la clase empleados
        Empleado arrayObjetos[] = { a1, a2, a3 };
        
        // mostramos datos de todos los empleados
        for (int i = 0; i < arrayObjetos.length; i++) {
            arrayObjetos[i].imprimir();
        }
        
        //Recorremos el array para calcular la suma de salarios
        int suma = 0;
        for (int i = 0; i < arrayObjetos.length; i++) {
            suma += arrayObjetos[i].getSalario();
        }
        System.out.println("La suma de salarios es " + suma);

    }

}
