import java.util.Scanner;
import java.util.Random;

public class reto4 {
    public static void main(String[] args) {

        Scanner contraer = new Scanner(System.in);
        Random random = new Random();
        
        String Player;
        int edadPlayer;
        int tiroMaquina = random.nextInt(3) + 1;//Definimos para que la variable envie un número ramdom
        int tiroJugador; 
        
        System.out.println("Este programa es para jugar piedra, papel o tijera");
        System.out.println("Por favor, digite su nombre ");
        Player = contraer.nextLine();
        System.out.println(Player+", ahora, digite su edad: ");
        edadPlayer = contraer.nextInt();

        if (edadPlayer >= 18 && edadPlayer <= 100) {
            System.out.println("Vamos a jugar!! \n1. Piedra. \n2. Papel. \n3. Tijera.");
            tiroJugador = contraer.nextInt();

            switch (tiroJugador) {
                case 1:
                    if (tiroMaquina == 1) {
                        System.out.println("Tiraste Piedra, yo he elegido Piedra empatee...");
                    } else if (tiroMaquina == 2) {
                        System.out.println("tiraste Piedra, yo he elegido Papel Gane!!");
                    } else if (tiroMaquina == 3) {
                        System.out.println("tiraste Piedra, yo he elegido Tijera ganaste, que bien por ti");
                    }
                    break;
                case 2:
                    if (tiroMaquina == 1) {
                        System.out.println("Has elegido Papel, yo he elegido Piedra. Has ganado ecxelente");
                    } else if (tiroMaquina == 2) {
                        System.out.println("Has elegido Papel, yo he elegido Papel empatee...");
                    } else if (tiroMaquina == 3) {
                        System.out.println("Has elegido Papel, yo he elegido Tijera Gane!!");
                    }
                    break;
                case 3:
                    if (tiroMaquina == 1) {
                        System.out.println("tiraste Tijera, yo he elegido Piedra Gane!!");
                    } else if (tiroMaquina == 2) {
                        System.out.println("tiraste Tijera, yo he elegido Papel Has ganado que bien!");
                    } else if (tiroMaquina == 3) {
                        System.out.println("tiraste Tijera, yo he elegido Tijera empate, que bueno");
                    }
                    break;
            
                default:
                    System.out.println(" Valor invalido");
                    break;
            }
                        
            System.out.println(" mi tiro fue "+tiroMaquina);

        } else {
            System.out.println("No puedes jugar, lo siento ");
        }

        contraer.close();
    }
}
