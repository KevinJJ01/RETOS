import java.util.Scanner;
 import java.util.Random;

 //(CICLOS)
public class reto6 {
    public static void main(String[] args) {
        
        Scanner contraer=new Scanner(System.in);
        Random random = new Random();

        int num;
        int respuesta;
        int n;



        System.out.println("Hola, este es un programa para adivinar una palabra al azar, empecemos ");

        System.out.println("Cuantas palabras quieres adivinar, maximo 5");
        n=contraer.nextInt();

        
      
        
        int i=0;
        while(i<n){

        num = random.nextInt(5) + 1; 
        if(num==1){

            System.out.println("Tiene dos ruedas, un manurio, un asiento, y se utiliza en un deporte, que es? ");
            System.out.println("1.Cicla /n 2.Computador /n 3.Marcador /n 4.Reloj /n 5.Guantes ");
            respuesta=contraer.nextInt();
            if(respuesta==1){
                System.out.println("Correcto el objeto es una cicla");
            }
            if(respuesta!=1){
                System.out.println("La respuesta es incorrecta");
            }

        }
        else if(num==2){
            System.out.println("tiene una pantalla, una cpu, un procesador, tiene mouse y teclado, que es?");
            System.out.println("1.Cicla /n 2.Computador /n 3.Marcador /n 4.Reloj /n 5.Guantes ");
            respuesta=contraer.nextInt();
            if(respuesta==2){
                System.out.println("Correcto el objeto es un computador");
            }
            if(respuesta!=2){
                System.out.println("La respuesta es incorrecta");
            }
        }
        else if(num==3){
            System.out.println("Es para escribir, se utiliza en un tablero, en ocasiones es borrable y en ocasiones permanente, lo utilizan mucho los profesores");
            System.out.println("1.Cicla /n 2.Computador /n 3.Marcador /n 4.Reloj /n 5.Guantes ");
            respuesta=contraer.nextInt();
            if(respuesta==3){
                System.out.println("Correcto el objeto es un marcador");
            }
            if(respuesta!=3){
                System.out.println("La respuesta es incorrecta");
            }
        }

        else if(num==4){
            System.out.println("Da la hora, se cuelga en la mano, lo fabrican en difentes materiales, en ocasiones tiene luz, es un accesorio");
            System.out.println("1.Cicla /n 2.Computador /n 3.Marcador /n 4.Reloj /n 5.Guantes ");
            respuesta=contraer.nextInt();
            if(respuesta==4){
                System.out.println("Correcto el objeto es un reloj");
            }
            if(respuesta!=4){
                System.out.println("La respuesta es incorrecta");
            }
        }
        else if(num==5){
            System.out.println("Se pone en las manos, para el frio, vienen en pares, lo normal es que sean en lana, de igual manera se utilizan en el hogar, para lavar sin necesidad de mojarse las manos");
            System.out.println("1.Cicla /n 2.Computador /n 3.Marcador /n 4.Reloj /n 5.Guantes ");
            respuesta=contraer.nextInt();
            if(respuesta==5){
                System.out.println("Correcto el objeto son unos guantes");
            }
            if(respuesta!=5){
                System.out.println("La respuesta es incorrecta");
            }
        }
        i++;
    }
        
    System.out.println("Muchas gracias por haber utilizado nuestro sistema");
    contraer.close();
    }
   
}
