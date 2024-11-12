import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        var entry = new Scanner(System.in);

        double millas;
        double kilometros;

        System.out.println("CONVERSIONES\n1.Millas a kilometros\n2.Kilometros a Millas\nPRESIONE UN NUMERO ENTRE 1 Y 2:");
        int opcion = entry.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese las Millas que desea convertir a Kilometros");
                millas = entry.nextDouble();
                kilometros = millas * 1.60934;
                System.out.println(millas + " Millas son " + kilometros + " Kilometros");
                break;
            case 2:
                System.out.println("Ingrese los Kilometros que desea convertir a Millas");
                kilometros = entry.nextDouble();
                millas = kilometros * 0.621371;
                System.out.println(kilometros + " Kilometros son " + millas + " Millas");
                break;

            default:
                System.out.println("INGRESE UN VALOR VALIDO");
                break;
        }

        entry.close();

    }
}
