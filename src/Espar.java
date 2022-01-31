import java.util.Scanner;

public class Espar {
    
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = leer.nextInt();

        if (n % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es un numero impar");
        }
    }
}
