import java.util.Scanner;

public class Esvocal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        char c = leer.next().charAt(0);
        
        switch (c) {

            case 'a':
            case 'A':
                System.out.printf("%s Es vocal\n", c);
                break;

            case 'e':
            case 'E':
                System.out.printf("%s Es vocal\n", c);
                break;

            case 'i':
            case 'I':
                System.out.printf("%s Es vocal\n", c);
                break;

            case 'o':
            case 'O':
                System.out.printf("%s Es vocal\n", c);
                break;

            case 'u':
            case 'U':
                System.out.printf("%s Es vocal\n", c);
                break;

            default:
                System.out.printf("%s No es vocal\n", c);
                break;
        }
        
    }
    
}
