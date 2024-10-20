
import java.util.Scanner;

public class restaExcepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese numero 1: ");
        double numero1 = scanner.nextDouble();

        System.out.println("ingrese numero 2: ");
        double numero2 = scanner.nextDouble();

        try {
            double resultado = numero1 - numero2;
            System.out.println("la resta es " + resultado);
        } catch (NumberFormatException e) {
            System.out.print("Error: Debe ingresar valores numéricos válidos.");
        }
    }

}