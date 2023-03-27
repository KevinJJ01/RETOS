import java.util.Scanner;
import java.util.Random;
//CICLO

public class reto8 {
    
    public static void main(String[] args) {
        Scanner contraer=new Scanner(System.in);
        Random tiro = new Random();

       int n=4, Giro1=0, Giro2=0;
       String player1, player2;

       System.out.println("Vamos a jugar dados, el que saque el número mayor gana ");


       System.out.println("Digite su nombre jugador 1");
       player1=contraer.next();

       System.out.println("Digite su nombre jugador 2");
       player2=contraer.next();

    int i=1;
       while (i<n){

    System.out.println("Round"+i);

        Giro1 = tiro.nextInt(6) + 1; // Genera un número aleatorio del 1 al 6
       System.out.println("Juega el primer turnooo, jugador unoo! su resultado es " +Giro1);


       Giro2 = tiro.nextInt(6) + 1; // Genera un número aleatorio del 1 al 6
       System.out.println("Juega el segundo turnooo, jugador doss! su resultado es " +Giro2);

       if(Giro1>Giro2){
        System.out.println("A ganado el jugador 1" +player1); 
       }
       else if(Giro2>Giro1){
        System.out.println("A ganado el jugador 2" +player2);
       }
       else if(Giro1==Giro2){
        System.out.println("Empate");
       }

        i++;   
    }

    contraer.close();
    }

}