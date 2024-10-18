import java.util.Scanner;

public class Opcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una opcion: ");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                System.out.println("Guardar");
            case "2":
                System.out.println("Cargar");
            case "3":
                System.out.println("Salir");
        }

    }

}