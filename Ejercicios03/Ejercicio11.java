import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        System.out.println("Ingrese el primer numero: ");
        var num1 = entry.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        var num2 = entry.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        var num3 = entry.nextInt();

        String resultado = "";

        extracted(num1, num2, num3, resultado);

        entry.close();

    }

    private static void extracted(int num1, int num2, int num3, String resultado) {
        if (num1 < num2 && num1 < num3) {
            //numero menor num1
            resultado += num1;
            if (num2 < num3) {
                // segundo numero y mayor
                resultado += num2 + "" + num3;
            } else {
                resultado += num3 + "" + num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            resultado += num2;
            if (num1 < num3) {
                resultado += num1 + "" +num3;
            } else {
                resultado += num3 + "" +num1;
            }
        } else {
            resultado += num3;
            if (num1 < num2) {
                resultado += num1 + "" +num2;
            } else {
                resultado += num2 + "" + num1;
            }
        }

        System.out.println("Numeros ordenados ascendentemente: " +resultado);
    }
}
