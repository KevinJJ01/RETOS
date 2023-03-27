import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) {

        Scanner llamar=new Scanner(System.in); 

        double gradosFahrenheit = 0; 
        double gradosKelvin = 0;
        double gradosCentigrados;


        System.out.println("Hola este es un programa para ayudar a la abuela a preparar su torta ");
        System.out.println(" te ayudare tu horno muestra los grados en centigrados.");
        System.out.println(" Vamos a ver cuantos necesitamos, digita los temperatura (grados actuales)");
        gradosCentigrados=llamar.nextDouble();

        System.out.println(" Grados que se muestran en el horno: Celsius "+gradosCentigrados+".}");
        
    
        gradosFahrenheit = (gradosCentigrados * 1.8) + 32;
        
        gradosKelvin = (gradosFahrenheit + 459.67) * 5/9;

        System.out.println(" Los grados Celsius en Fahrenheit es: "+gradosFahrenheit+" Y de grados Celsius a Kelvin es: "+gradosKelvin);
        
        gradosFahrenheit = gradosFahrenheit + 100;
        gradosKelvin = gradosKelvin + 100;

        System.out.println("En tu receta, necesitarás estos grados:");
        System.out.println(" Farenheit: "+gradosFahrenheit+" y Kelvin: "+gradosKelvin);
        System.out.println(" Gracias");

    llamar.close();
 }
}
