import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese numero1: ");
        
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese numero2: ");
        
        double numero2 = scanner.nextDouble();

        double result;

        scanner.nextLine(); 

        System.out.println("Ingrese operacion a realizar, suma o resta ");

        String operacion = scanner.nextLine();

        result = (operacion.equals("suma") ) ? (numero1 + numero2) : (numero1 - numero2);

        System.out.printf("El resultado es: %.2f%n ", result);
        
        scanner.close();
        
    }
   
}