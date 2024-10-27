import java.util.Scanner;

/**
 * Busqueda
 */
public class Busqueda {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Ingrese palabra porfavor: ");
        String palabra = Scanner.nextLine();

        System.out.print("Ingrese caracter: ");
        String caracter = Scanner.nextLine();

        String resultado = palabra.indexOf(caracter) != -1 ? "si contiene" : "no contiene";
        System.out.print(resultado);

    }
}