import java.util.Scanner;
public class Ejecicio1 {
        public static void main (String[] arg) {

            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese un número");
            int num = leer.nextInt();

            if (num > 0)
            {
                System.out.println("El número es positivo");
            }else if (num < 0)
            {
                System.out.println("El número es negativo ");
            }else{
                System.out.println("El número es cero");
            }
        }
    }
