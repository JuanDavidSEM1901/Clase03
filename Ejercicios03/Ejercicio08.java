import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        System.out.println("Enter your age: ");
        var numberAge = entry.nextInt();

        //Determine Stage

        if (numberAge >= 0 && numberAge <= 5) {
            System.out.println("Stage:\nFirst Infancy");
        } else if (numberAge >= 6 && numberAge <= 11) {
            System.out.println("Stage\nInfancy");
        } else if (numberAge >= 12 && numberAge <= 18) {
            System.out.println("Stage:\nAdolescence");
        } else if (numberAge >= 19 && numberAge <= 26) {
            System.out.println("Stage\nYouth");
        } else if (numberAge >= 27 && numberAge <= 59) {
            System.out.println("Stage:\nAdult");
        } else if (numberAge > 59 && numberAge <= 100) {
            System.out.println("Stage\nOlder Person");
        } else {
            System.out.println("VALOR INVALIDO!");
        }

        entry.close();

    }
}
