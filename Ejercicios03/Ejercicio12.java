import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        System.out.println("Ingrese el peso de la sandia en Kilogramos");
        var pesoSandia = entry.nextInt();

        if (pesoSandia % 2 == 0) {
            System.out.println("El peso de la sandía es par y puede ser dividido en partes iguales.");
        } else {
            System.out.println("El peso de la sandía es impar y no puede ser dividido en partes iguales.");
        }

        entry.close();

    }
}
