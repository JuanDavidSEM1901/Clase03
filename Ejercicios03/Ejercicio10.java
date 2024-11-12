import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        getNumberMonth(entry);

        entry.close();

    }

    private static void getNumberMonth(Scanner entry) {
        System.out.println("Enter a number between 1 and 12");
        var numberMonth = entry.nextInt();

        switch (numberMonth) {
            case 1,3,5,7,8,10,12:
            System.out.println("have 31 days");
                
                break;
            case 4,6,9,11:
            System.out.println("have 30 days");
                break;
            case 2:
            System.out.println("have 28 days");    
            break;    
        
            default: 
            System.out.println("Number Month Invalid!");
                break;
        }
    }
}
