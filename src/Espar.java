import java.util.Scanner;

public class Espar {
    
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = leer.nextInt();

        if (n != 0) {
            if (n > 0) {
                if (n % 2 == 0 ) {
                    System.out.printf("El numero %d es Par positivo\n", n);
                } else {
                    System.out.printf("El numero %d es Impar positivo\n", n);
                }
            } else {
                if (n % 2 == 0 ) {
                    System.out.printf("El numero %d es Par negativo\n", n);
                } else {
                    System.out.printf("El numero %d es Impar negativo\n", n);
                }
            }
        } else {
            System.out.printf("El numero %d es Neutro\n", n);
        }

    }
}
