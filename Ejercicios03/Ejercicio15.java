import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        int numero;

        do {

            System.out.println("Ingrese un numero: ");
            numero = entry.nextInt();

            if (numero > 0) {
                System.out.println("EL NUMERO " +numero+" ES POSITIVO");
            } else {
                System.out.println("EL NUMERO " +numero+" ES NEGATIVO");
            }


            
        } while (numero != 0);

        System.out.println("FINALIZA EL PROGRAMA! INGRESASTE 0");

        entry.close();
    }
}
