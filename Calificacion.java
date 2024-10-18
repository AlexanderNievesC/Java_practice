
import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero de 1 a 5: ");
        String number = scanner.nextLine();

        switch (number) {
            case "1":
                System.out.println("Muy deficiente");
                break;
            case "2":
                System.out.println("Deficiente");
                break;
            case "3":
                System.out.println("Suficiente");
                break;
            case "4":
                System.out.println("Notable");
                break;
            case "5":
                System.out.println("Sobresaliente");
                break;
        }

    }

}