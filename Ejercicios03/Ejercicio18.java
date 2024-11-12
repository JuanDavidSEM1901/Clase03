import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {

        Random random = new Random();

        int max = 120;
        int min = -120;
        var sumaNegativos = 0;
        var contadorNegativos = 0;
        var sumaPositivos = 0;
        var contadorPositivos = 0;
        var contadorCeros = 0;

        int[] numeros = new int[120];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt((max - min) + 1) + min;

            if (numeros[i] > 0) {

                sumaPositivos += numeros[i];
                contadorPositivos++;

            } else {

                sumaNegativos += numeros[i];
                contadorNegativos++;

            }
            if (numeros[i] == 0) {

                contadorCeros++;

            }

        }

        for (int aleatorios : numeros) {
            System.out.println(aleatorios);
        }

        if (contadorPositivos > 0) {
            var mediaPositivos = sumaPositivos / contadorPositivos;
            System.out.println("La media de negativos es : " + mediaPositivos);
        } else {
            System.out.println("NO HAY NUMEROS POSITIVOS");
        }

        if (contadorNegativos > 0) {
            var mediaNegativos = sumaNegativos / contadorNegativos;
            System.out.println("La media de negativos es : " + mediaNegativos);
        } else {
            System.out.println("NO HAY NUMEROS NEGATIVOS");
        }

        System.out.println("CANTIDAD CEROS :" + contadorCeros);

    }
}
