/* Definicion de la clase. El nombre de la clase tiene que ser igual que el archivo.
 Clase publica llamada Main */
public class Variables {
    // Este metodo sera el punto de entrada.
    /**
     * 
     * @param args
     */
    public static void main (String [] args) {
        // Aque dentro estara todo lo que pertenece al metodo main.
        // Variables. Tipo de variable. Nombre de la variable.
        String nombre;
        // int para variables numericas.
        byte edad = -140;
        // Para crear multiples variables: Se separan con comas y al final;
        int a, b, c;
        // Se asigna el valor a variable nombre.
        nombre = "Sandy";
        //Para asignar el valor de las multiples variables
        a = 1;
        b = 2;
        c = 3;

        System.out.println(nombre);
        System.out.println(edad);
        edad = 37;
        System.out.println(a + b + c);
        System.out.println(edad);

        // Nueva forma de definir las variables. Se tiene que asignar el valor forzosamente.

        var primerNombre = "Sandy ";
        var segundoNombre = "Kurai";
        var misNombres = primerNombre + segundoNombre;
        //System.out.println("Mi nombre es: " + misNombres);

        char codigo = 65;
        System.out.println(codigo);
    }
}