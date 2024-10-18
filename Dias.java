import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Dia Habil");
                break;
            case 2:
                System.out.println("Dia Habil");
                break;
            case 3:
                System.out.println("Dia Habil");
                break;
            case 4:
                System.out.println("Dia Habil");
                break;
            case 5:
                System.out.println("Dia Habil");
                break;
            case 6:
                System.out.println("Dia no habil");
                break;
            case 7:
                System.out.println("Dia no habil");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        scanner.close();

    }

}