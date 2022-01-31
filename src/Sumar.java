import java.util.Scanner;

public class Sumar {
    
    // Crear metodo Main

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // flujo de entrada

        System.out.print("Ingrese numero 01: ");
        var n1 = leer.nextInt();
        System.out.print("Ingrese numero 02: ");
        var n2 = leer.nextInt();

        var r = n1 + n2;
        System.out.printf("La suma %d + %d = %d \n", n1, n2, r); // al final se pone un salto de línea 
    }
}
