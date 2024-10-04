import java.util.Scanner;
import java.time.LocalDate;

public class Dimension {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese base: ");
        double baseRectangulo  = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Ingrese altura: ");
        double alturaRectangulo = scanner.nextDouble();

        double perimetro = 2 * baseRectangulo + 2 * alturaRectangulo;

        System.out.println("el perimetro es: " + perimetro);

        double area = baseRectangulo * alturaRectangulo;

        System.out.print("el area es: " + area);
        
        scanner.close();

    }
}