import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
         * Ejercicio 2
         * Escriba un programa que le permita ingresar tres números e imprima en la
         * consola el más grande de ellos.
         * 
         */

        var entry = new Scanner (System.in);    

        System.out.println("Ingrese el primer numero: ");
        var num1 = entry.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        var num2 = entry.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        var num3 = entry.nextInt();

        var numMax = 0;

        if (num1 >= num2 && num1 >= num3) {
            numMax = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            numMax = num2;
        } else {
            numMax = num3;
        }

        System.out.println("El numero mayor entre " +num1+" "+num2+" "+num3+" es: "+numMax);

        entry.close();

    }
}
