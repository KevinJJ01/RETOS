import java.util.Scanner;
//ciclo
public class reto7 {
    public static void main(String[] args) {

    Scanner leer=new Scanner(System.in);

    int edad, telefono, n;
    String nombre, direccion, correo, eps;

    

    System.out.println("Bienvenido, este es un formulario de información basica, rellena los espacios");

    System.out.println("Cuantas pesonas vamos a registrar");
    n=leer.nextInt();


    int i=1;
    while(i<n){
    
    System.out.println("Persona número "+i);

    System.out.println("Nombres y apellidos");
    nombre=leer.next();

    System.out.println("Edad");
    edad=leer.nextInt();

    System.out.println("Correo");
    correo=leer.next();

    System.out.println("Telefono");
    telefono=leer.nextInt();

    System.out.println("Dirección");
    direccion=leer.next();

    System.out.println("Eps");
    eps=leer.next();

    System.out.println("ENVIAR");

    System.out.println(i+""+nombre+""+edad+""+correo+""+telefono+""+direccion+""+eps);

    i++;
    }

    leer.close();
    }
}