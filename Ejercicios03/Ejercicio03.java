import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
         * Ejercicio 3
         * Escriba un programa que permita ingresar un número e identificar si es par o
         * impar.
         */

        var entry = new Scanner (System.in); 

        System.out.println("INGRESE UN NUMERO PARA IDENTIFICAR SI ES PAR O IMPAR");
        var number = entry.nextInt();

        // operador (%) obtiene el residuo de la division si es 0 es PAR si no es cero es IMPAR
        if (number%2 == 0) {
            System.out.println("El numero "+number+" es PAR");
        } else {
            System.out.println("El numero "+number+" es IMPAR");
        }
            

        

        entry.close();
    }
}
