import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] arg)
    {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg ej: 90");
        double peso = leer.nextDouble();

        System.out.println("Ingrese su altura en m ej: 1,65");
        double altura = leer.nextDouble();

        double resultado = peso / (altura * altura);

        System.out.println("Su IMC es de: " + resultado);


        if (resultado <  18.5 && resultado > 0)
        {
            System.out.println("Su peso es inferior a lo normal");
        }else if(resultado > 18.5 && resultado < 24.9)
        {
            System.out.println("Su peso es normal");
        }else if(resultado > 25.0  && resultado < 29.9) {
            System.out.println("Su peso es superior a lo normal");
        }else if(resultado > 30.0)
        {
            System.out.println("Su peso es considerado obesidad");
        }
    }
}
