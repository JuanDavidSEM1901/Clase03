import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        int numero;
        int numeroNegativo = 0;

        do {
            System.out.println("Ingrese un numero: ");
            numero = entry.nextInt();
            if (numero < 0) {
                numeroNegativo++;
            }
        } while (numero < 0);

        System.out.println("La cantidad de negativos es: "+numeroNegativo);

        entry.close();

    }
}
