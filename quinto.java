import java.util.Scanner;

public class quinto {


    public static void main(String[] args) {

         Scanner entrada = new Scanner(System.in);

         System.out.println("Ingrese el valor del radio: ");
         double a=entrada.nextFloat();
         double b=Math.pow(a, 2)*(Math.PI);
         double c=2*(Math.PI)*a;
         System.out.println("El area de un circulo es: "+b);
         System.out.println("La longuitud del circulo es: "+c);













}}
