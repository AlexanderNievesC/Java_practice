import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese numero: ");
        double numero = scanner.nextDouble();
    

        if (numero>0){
            System.out.println("numero positivo");
        } else if (numero == 0){
            System.out.println("numero cero");
        } else {
            System.out.println("numero negativo");
        }

        scanner.close();
        
    }
}