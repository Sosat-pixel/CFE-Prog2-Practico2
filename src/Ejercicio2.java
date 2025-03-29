import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] arg){

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();

        if(num % 2 == 0)
        {
           System.out.println("El número es par");
        }
        else if(num % 2 != 0)
        {
            System.out.println("El número es impar");
        }



    }
}
