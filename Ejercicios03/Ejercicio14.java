import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);
        
        int numero;

        var elevado = 3;

        
        

        do {

            System.out.println("Digite un numero para hallar su cubo: ");
            numero = entry.nextInt();

            if (numero >= 0) {
                var cubo =  (int) Math.pow(numero, elevado);

            System.out.println("El cubo de "+numero+" es: "+cubo);
            }

            
        } while (numero >= 0);
        
        System.out.println("PROGRAMA FINALIZADO! DIGITASTE UN NUMERO NEGATIVO");

        entry.close();

    }
}
