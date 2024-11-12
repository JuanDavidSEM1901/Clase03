import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        var entry = new Scanner (System.in);
        char opcionJ1, opcionJ2;
        String nuevaRonda;


        do {

            System.out.println("JUEGO DE PIEDRA - PAPEL - TIJERA\nP = Piedra\nL = Papel\nT = Tijera");
            
            System.out.println("PRIMER JUGADOR, INGRESE SU OPCION:");
            opcionJ1 = entry.nextLine().toUpperCase().charAt(0);

            while (opcionJ1 != 'P' && opcionJ1 != 'L' && opcionJ1 != 'T') {
                System.out.println("OPCION NO VALIDA | P = Piedra | L = Papel | T = Tijera");
                opcionJ1 = entry.nextLine().toUpperCase().charAt(0);
            }

            System.out.println("SEGUNDO JUGADOR, INGRESE SU OPCION:");
            opcionJ2 = entry.nextLine().toUpperCase().charAt(0);

            while (opcionJ2 != 'P' && opcionJ2 != 'L' && opcionJ2 != 'T') {
                System.out.println("OPCION NO VALIDA | P = Piedra | L = Papel | T = Tijera");
                opcionJ2 = entry.nextLine().toUpperCase().charAt(0);
            }


            //EVALUAR EMPATES
            if (opcionJ1 == opcionJ2) {
                System.out.println("ES UN EMPATE");
            } else {
                switch (opcionJ1) {
                    case 'P':
                    if (opcionJ2 == 'T') {
                        System.out.println("JUGADOR 1 GANA (PIEDRA GANA A TIJERA)");
                    } else {
                        System.out.println("JUGADOR 2 GANA (PAPEL GANA A PIEDRA)");
                    }
                    break;
                    case 'L':
                    if (opcionJ2 == 'P') {
                        System.out.println("JUGADOR 1 GANA (PAPEL GANA A PIEDRA)");
                    } else {
                        System.out.println("JUGADOR 2 GANA (TIJERA GANA A PAPEL)");
                    }
                        
                        break;
                    case 'T':
                    if (opcionJ2 == 'L') {
                        System.out.println("JUGADOR 1 GANA (TIJERA GANA A PAPEL)");
                    } else {
                        System.out.println("JUGADOR 2 GANA (PIEDRA GANA A TIJERA)");
                    }
                    break;
                
                    default:
                        break;
                }
            }

            System.out.println("QUIERES JUGAR OTRA RONDA? (S/N) S = SI | N = NO");
            nuevaRonda = entry.nextLine().toUpperCase();

            } while (nuevaRonda.equals("S"));

            System.out.println("GRACIAS POR JUGAR!");

            entry.close();



    }
}
