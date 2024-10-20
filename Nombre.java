import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("Su nombre es: ");
        String total = nombre.concat(" ").concat(apellido);

        System.out.print(total);
    }

}