import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        /*
         * Ejercicio 4
         * Escriba un programa que permita ingresar una letra e identifique si la letra
         * es mayúscula o minúscula.
         */

        var entry = new Scanner(System.in);

        System.out.println("Ingrese una letra para identificar si es MAYUSCULA o minuscula");
        var letra = entry.nextLine().charAt(0);

        if (Character.isUpperCase(letra)) {
            System.out.println("La letra " +letra+ " es MAYUSCULA");
        } else {
            System.out.println("La letra "+letra+" es minuscula");
        }

        entry.close();

    }
}
