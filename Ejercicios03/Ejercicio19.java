import java.util.Scanner;


public class Ejercicio19 {

    public static void fibonacci (int n) {
        if (n >= 1) {
            System.out.println("0");
        }

        if (n >= 2) {
            System.out.println("1");
        }

        int a = 0 , b = 1;

        for (int i = 3; i <= n; i++) {
            int siguiente = a + b;
            System.out.println(siguiente);
            a = b;
            b = siguiente;
        }
    }

    public static void main(String[] args) {
        
        var entry = new Scanner (System.in);

        System.out.println("Ingrese un numero para mostrar los primeros numeros de la sucesion Fibonacci");

        int n = entry.nextInt();

        System.out.println("Los primeros "+ n + " numeros de la sucesion Fibonacci son:");
        fibonacci(n);

        entry.close();
        
    }

    

        
    }
