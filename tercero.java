
public class tercero {


    public static void main(String[] args) {

        float horas,pago_hora,semana,retencion,salario_bruto;

        horas=48;
        pago_hora=5000;
        semana=4;
        salario_bruto=horas*pago_hora;
        retencion=salario_bruto*(0.125f);
        System.out.println("El salario Bruto semanal es de: "+salario_bruto);
        System.out.println("La retencion de fuente para el salario semanal es de: "+retencion);
        System.out.println("El salario Neto semanal es de: "+(salario_bruto-retencion));









}}
