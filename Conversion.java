import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cadena: ");
        String texto = scanner.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.print("el numero convertido es: " + numero);

        } catch (NumberFormatException e) {
            System.out.print("Solo introduzca numeros en su string, no letras ");
        }

    }
}