import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        /*
         * Un triángulo solo se puede formar cuando la suma de cualquiera de los dos
         * lados del triángulo es mayor que su tercer lado
         * FORMULA
         * lado1 + lado2 > lado3
         * lado1 + lado3 > lado2
         * lado2 + lado3 > lado1
         */

         System.out.println("Ingrese el lado 1: ");
         var lado1 = entry.nextInt();
         System.out.println("Ingrese el lado 2: ");
         var lado2 = entry.nextInt();
         System.out.println("Ingrese el lado 3: ");
         var lado3 = entry.nextInt();

         if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("SI SE PUEDE FORMAR EL TRIANGULO");
         } else {
            System.out.println("NO SE PUEDE FORMAR EL TRIANGULO");
         }
         entry.close();
    }
}
