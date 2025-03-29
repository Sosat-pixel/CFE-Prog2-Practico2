import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] arg){

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = leer.nextInt();

        if(num < 999 && num > 0)
        {
            if(num < 9)
            {
                System.out.println("El número tiene 1 cifra");
            }else if(num < 99)
            {
                System.out.println("El número tiene 2 cifras");
            }else if (num < 999)
            {
                System.out.println("El número tiene 3 cifras");
            }
        }

    }
}
