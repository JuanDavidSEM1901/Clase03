import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        var vocales = "aeiouAEIOU";

        System.out.println("Ingrese una letra para identificar si es consonante o vocal");
        var letra = entry.nextLine().charAt(0);

        if (Character.isLetter(letra)) {
            if (vocales.indexOf(letra) != -1) {
                System.out.println("VOCAL");
            } else {
                System.out.println("CONSONANTE");
            }
        } else {
            System.out.println("VALOR INVALIDO!");
        }

        

        entry.close();
    }
}
