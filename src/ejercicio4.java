import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] arg){

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = leer.nextInt();

        System.out.println("Ingrese el tercer número");
        int num3 = leer.nextInt();

        if (num1 > num2 && num1 > num3)
        {
            System.out.println("El número " + num1 + " es el mayor");
        }else if(num2 > num1 && num2 > num3)
        {
            System.out.println("El número " + num2 + " es el mayor");

        }else if(num3 > num1 && num3 > num2)
        {
          System.out.println("El número " + num3 + " es el mayor");
        }else
        {
            System.out.println("Resultado no soportado");
        }
    }
}
