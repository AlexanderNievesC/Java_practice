import java.util.Scanner;

public class ConversionMayuscula {
public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);

    System.out.println("ingrese palabra: ");
    String palabra = Scanner.nextLine();

    String mayuscula = palabra.toUpperCase();
    String minuscula = palabra.toLowerCase();

    System.out.println(mayuscula);
    System.out.println(minuscula);
}
    
}