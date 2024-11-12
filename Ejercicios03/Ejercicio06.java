import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        System.out.println("Ingrese un numero para saber si es divisible entre 2 y 7");
        var number = entry.nextInt();

        if (number % 7 == 0 && number % 2 == 0) {
            System.out.println("El numero "+number+" es divisible entre 2 y 7");
        } else {
            System.out.println("El numero "+number+" NO es divisible entre 2 y 7");
        }

        entry.close();
    }
}
