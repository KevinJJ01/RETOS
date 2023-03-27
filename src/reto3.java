import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        String player;
        int edadJugador;
        int tiroMaquina = (int)(Math.random()*2+1), decicionJugador; 


        System.out.println("Bienvenido este es un sistema de juego cara o sello.");
        System.out.println("Digite su nombre ");
        player = leer.next();
        System.out.println(player+" Que edad tienes:");
        edadJugador = leer.nextInt();


        if (edadJugador > 18 && edadJugador < 100) {
            System.out.println(" Empecemos elige una:  \n1. Cara. \n2. Sello.");
            decicionJugador = leer.nextInt();

            if (decicionJugador > 0 && decicionJugador < 3) {
                if (tiroMaquina == 1) {
                    System.out.println("Gira gira la moneda y caeee.. CARA");
                    if (decicionJugador == tiroMaquina) {
                        System.out.println("Ganaste que bien! Felicitaciones ");
                    } else {
                        System.out.println("He ganado, mejor suerte a la proxima ");
                    }
                } else if (tiroMaquina == 2) {
                    System.out.println("Gira gira la moneda y caee.. SELLO");
                    if (decicionJugador == tiroMaquina) {
                        System.out.println("He ganado sigue intentandolo!");
                    } else {
                        System.out.println("He ganado!! que bien, tendras mas oportunidades");
                    }
                }
            } else {
                System.out.println("El valor que ingresaste es invalido");
            }
                        
            System.out.println("Este fue mi número a la suerte "+tiroMaquina);

        } else {
            System.out.println("Edad invalida: "+edadJugador);
        }

        leer.close();
    }
}
