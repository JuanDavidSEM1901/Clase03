import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        System.out.println("Indique el tamaño para el diamante");
        var tamaño = entry.nextInt();

        if (tamaño <= 0 || tamaño % 2 == 0) {
            System.out.println("EL NUMERO DEBE SER POSITIVO Y IMPAR");
        } else {

            var mitad = tamaño / 2;

            for (int i = 0; i <= mitad; i++) {
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = mitad - 1; i >= 0; i--) {
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        entry.close();
    }
}

