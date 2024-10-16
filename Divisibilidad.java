import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese numero: ");
        Double numero = scanner.nextDouble();
        
        if ((numero % 5 == 0) && (numero % 3 == 0)){
            System.out.println("Numero divisible por 5 y 3");
        } else if (numero % 3 == 0){
            System.out.println("Numero divisible por 3");
        } else if (numero % 5 == 0) {
            System.out.println("Numero divisible por 5");
        } else {
            System.out.println("No es divisible ni por 5 ni 3");
        }

        scanner.close();
    }
}