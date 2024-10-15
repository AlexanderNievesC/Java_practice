import java.util.Scanner;

public class actividadPracticando {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese nota: ");
        double nota = scanner.nextDouble();

       if (nota>=90 && nota<=100){
            System.out.println("Su nota es A");
       } else if (nota>=80 && nota<=89){
            System.out.println("Su nota es B");
       } else if (nota>=70 && nota<=79){
            System.out.println("Su nota es C");
       } else if (nota>=60 && nota<=69){
            System.out.println("Su nota es E");
       } else if (nota<60){
            System.out.println("Su nota es F");
       } else {
            System.out.println(" Nota Fuera de Rango");
       }

        
        scanner.close();
        
    }
}