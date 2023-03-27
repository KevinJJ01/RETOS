import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {

        Scanner recibir = new Scanner(System.in);


        String Medico, Bebe, Vacuna, Eps;        
        int edadBebe, pesoBebe , dosis = 0;
        

  
        System.out.print("Hola este es un sistema, para llevar el orden de las vacunas, por favor digita el nombre del medico ");
        Medico = recibir.nextLine();
        System.out.println( Medico+" ahora el nombre del bebé: ");
        Bebe = recibir.next();
        System.out.println("Ahora dime la eps de "+Bebe);
        Eps = recibir.next();
        System.out.println("Ahora cual sera la vacuna para "+Bebe);
        Vacuna = recibir.next();

        System.out.println("Por favor digita la edad del bebe ");
        edadBebe = recibir.nextInt();
        System.out.println("Por último, digita el peso de "+Bebe);
        pesoBebe = recibir.nextInt();

       
        dosis = (pesoBebe + 15 / edadBebe * 15) * 10;

       
        System.out.println( Bebe+" tiene "+edadBebe+ " meses y su peso es "+pesoBebe+" kilogramos");
        System.out.println("EPS: "+Eps+" Vacuna: "+Vacuna);
        System.out.println(Medico+" la dosis para "+Bebe+" es de "+dosis+" miligramos");

        recibir.close();
    }
}
