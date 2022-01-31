import java.util.Scanner;

public class Main {
    
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese su Nombre: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = leer.nextInt();

        System.out.print("Ingrese un caracter: ");
        char c = leer.next().charAt(0);

        System.out.printf("Nombre: %s Edad: %d \n", nombre, edad); // \n hace un salto de línea en la consola.
        System.out.println("Caracter: " + c);
        System.out.println(" \" "); // hace un escape para que se reconozca como un caracter
        System.out.println("Hola\tMundo"); // Imprime el espacio de un tabulador ->|
        System.out.println("Holaa\b Mundo"); // Borra un caracter a la izquierda
    }
}
