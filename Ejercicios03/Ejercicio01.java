import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        /*
        Ejercicio 1
        Escriba un programa que permita ingresar un número real e identifique si el número es negativo, positivo o cero.
         */


        // Escaner para leer datos por consola
        var entry = new Scanner (System.in);

        System.out.println("Digite un numero real para identificar si es POSITIVO, NEGATIVO o CERO");
        System.out.println("Numero: ");
        var realNumber = entry.nextInt();

        if (realNumber == 0) {
            System.out.println("El numero digitado es 0");
        } else if (realNumber > 0) {
            System.out.println("El numero "+realNumber+" es POSITIVO");
        } else {
            System.out.println("El numero "+realNumber+" es NEGATIVO");
        }

        entry.close();


    }
}