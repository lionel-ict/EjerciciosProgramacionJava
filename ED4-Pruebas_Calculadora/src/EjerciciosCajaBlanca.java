
public class EjerciciosCajaBlanca {

    // EJERCICIO 1
    // Devuelve ‘true’ si en ‘vector’ hay algún carácter mayor
    // que ‘letra’ y devuelve ‘false’ en caso contrario.
    public static boolean hay_mayor_tira(char[] vector, char letra) {
        boolean encontrado = false;
        int i = 0;
        while ((!encontrado) && (i < vector.length)) {
            if (vector[i] > letra) {
                encontrado = true;
            }
            i++;
        }
        return encontrado;
    }

    // EJERCICIO 3
    // Devuelve el número de veces que aparece ‘letra’ en ‘cadena’
    public static int buscar_en(char[] cadena, char letra) {
        int contador = 0, i = 0;
        if (cadena.length > 0) {
            do {
                if (cadena[i] == letra) {
                    contador++;
                }
                i++;
            } while (i < cadena.length);
        }
        return contador;
    }
}
