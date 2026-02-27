import java.util.Scanner;

public class Primer {

    public static void main(String[] args) {

        float b,d,h;

         Scanner entrada = new Scanner(System.in);

         System.out.println("Ingrese la edad de Juan: ");
         float a=entrada.nextFloat();
         b=(a*2)/3;
         d=((a*4)/3);
         h=a+b+d;
         System.out.println("La edad de Juan es: "+a);
         System.out.println("La edad de Alberto es: "+b);
         System.out.println("La edad de Ana es: "+d);
         System.out.println("La edad de la madre de Juan es: "+h);
        





}
}