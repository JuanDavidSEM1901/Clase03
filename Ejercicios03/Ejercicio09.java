import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        System.out.println("SHIRT STORE\n¿How many shirts purchase?");
        var numberShirts = entry.nextInt();

        if (numberShirts > 1 && numberShirts <= 50) {
            System.out.println("Shirt Price: $50.000");
        } else if (numberShirts > 50 && numberShirts <= 100) {
            System.out.println("Shirt Price: $45.000");
        } else if (numberShirts > 100 && numberShirts <= 150) {
            System.out.println("Shirt Price: $40.000");
        } else if (numberShirts > 150 && numberShirts <= 200) {
            System.out.println("Shirt Price: $35.000");
        } else {
            System.out.println("Shirt Price: $25.000");
        }

        entry.close();

    }
}
