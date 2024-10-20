import java.util.Scanner;

public class Longitud {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto: ");
        String word = scanner.nextLine();

        System.out.println("el tamaño de la palabra es:" + word.length());

    }
}