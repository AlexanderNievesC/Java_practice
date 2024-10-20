import java.util.Scanner;

/**
 * Extraccion
 */
public class Extraccion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese frase: ");
        String phrase = scanner.nextLine();

        System.out.println("ingrese indice inicial");
        int numero1 = scanner.nextInt();

        System.out.println("ingrese indice final ");
        int numero2 = scanner.nextInt();

        String resultado = phrase.substring(numero1, numero2);

        System.out.println("La frase extraida seria" + resultado);

    }
}