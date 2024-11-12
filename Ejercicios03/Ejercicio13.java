import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);

        // llegaron a tiempo
        System.out.println("Ingrese el numero del hermano 1: ");
        var h1 = entry.nextInt();
        System.out.println("Ingrese el numero del hermano 2: ");
        var h2 = entry.nextInt();
        

        // (1+2+3)
        var sumaTotal = 6;

        var llegarATiempo = h1 + h2;

        var llegoTarde = sumaTotal - llegarATiempo;

        System.out.println("El hermano que llego tarde es: " +llegoTarde);

        entry.close();

    }
}
