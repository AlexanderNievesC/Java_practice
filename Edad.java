import java.util.Scanner;
import java.time.LocalDate;

public class Edad {
    public static void main (String[] args){


        final String ANIOACTUAL  = "2024-10-03";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese fecha de nacimiento YYYY-MM-DD:");
        String añoNacimiento = scanner.nextLine();

        LocalDate fechaActual = LocalDate.parse(ANIOACTUAL);
        LocalDate fechaNacimiento = LocalDate.parse(añoNacimiento);


        int calculoEdad = fechaActual.getYear() - fechaNacimiento.getYear();
        

        if( calculoEdad> 18){
            System.out.print("es mayor de edad");
        } else{
            System.out.print("no es mayor de edad");
        }

        scanner.close();

    }
}