// Verificacion

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese una contraseña: ");
        String password = scanner.nextLine();

        if (password.equals("123456")) {
            System.out.println("Contraseña correcta ");
        } else {
            System.out.println("Contraseña incorrecta ");
        }

    }

}