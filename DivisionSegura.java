import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese numero 1: ");
        double numero1 = scanner.nextDouble();

        System.out.println("ingrese numero 2: ");
        double numero2 = scanner.nextDouble();

        try {
            double resultado = numero1 / numero2;
            System.out.println("el resultado es " + resultado);
        } catch (ArithmeticException e) {
            System.out.print("Error de calculo");
        }
    }

}