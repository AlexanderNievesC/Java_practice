//Password

// import java.util.Scanner;

// public class Password {
//     public static void main(String[] args) {
        
        
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Ingrese contraseña: ");
//         String password = scanner.nextLine();

//         if (password.equals("123456")){
//             System.out.println("Contaseña correcta, bienvenido");
//         }else {
//             System.out.println("Contaseña incorrecta, lo sentimos");
//         }
        
//         scanner.close();
//     }
// }

//Descuento

// import java.util.Scanner;

// public class Descuento {

//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Ingrese precio del producto: ");
//         double precio = scanner.nextDouble();

//         if (precio>=100){
//             precio = precio - (precio*0.10);
//         }

//         System.out.print("Precio con descuento: "+ precio);
        
//         scanner.close();
//     }
// }

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();

        if (edad<18){
            System.out.print("Eres menor de edad: ");
        } else if (edad >=18 && edad <=64){
            System.out.print("Eres adulto ");
        } else {
            System.out.print("Eres adulto mayor ");
        }
        
        scanner.close();
    }
}