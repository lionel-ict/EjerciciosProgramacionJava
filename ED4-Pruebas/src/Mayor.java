
public class Mayor {

    public static int obtMayorNumero(int lista[]) {
        int indice, max = Integer.MAX_VALUE;
        for (indice = 0; indice < lista.length - 1; indice++) {
            if (lista[indice] > max) {
                max = lista[indice];
            }
        }
        return max;
    }

}
