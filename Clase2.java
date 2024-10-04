  
   import java.util.Scanner;

/*    // Como añadir comentarios shift +alt + a

   // Como ingresar datos
   
 public class Clase2 {
       public static void main (String [] args ){
           Scanner scanner = new Scanner(System.in);
           System.out.print("ingrese nombre: ");
           String nombre = scanner.nextLine();
           System.out.println("Mi nombre es "+ nombre);
       } 
}



// Requerir edad y nombre

public class Clase2 {
       public static void main (String [] args ){
           Scanner scanner = new Scanner(System.in);
           System.out.print("ingrese edad: ");
           int edad = scanner.nextInt();
           System.out.println("Mi edad es "+ edad);
       }}

public class Clase2 {
       public static void main (String [] args ){
           Scanner scanner = new Scanner(System.in);

           System.out.print("ingrese edad: ");
            int edad = scanner.nextInt();

           scanner.nextLine();
           System.out.print("ingrese nombre: ");
           
           String nombre = scanner.nextLine();
           System.out.println("Mi edad es "+ edad + " y mi nombre es "+ nombre);
       }} 

// Realizar operaciones matematicas

public class Clase2 {
       public static void main (String [] args ){
           
           Scanner scanner = new Scanner(System.in);
 
           int value1 = 20;
           int value2 = 30;

           int resultado = value1 % value2;

           System.out.print(resultado);

           System.out.println("ingrese numero1: ");
           int numero1 = scanner.nextInt();
           scanner.nextLine();
           System.out.println("ingrese numero2: ");
           int numero2 = scanner.nextInt();
           int resultado1 = numero1 + numero2;
           System.out.println("resultado es: "+ resultado1);
       }}  */ 


// Comparar 

    public class Clase2{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese numero1");
            int numero1 = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Ingrese numero2");
            int numero2 = scanner.nextInt();

            String respuesta = (numero1 > numero2) ? "rojo" : "amarillo";

            System.out.println(respuesta);

            // segunda parte

            String respuesta1 = (numero1 != numero2) ? "es disnto" : "no es distinto";
            System.out.println(respuesta1);

            // es divisible?

            String respuesta2 = (numero1 % numero2 == 0) ? "es divisible" : "no es divisibel";
            System.out.println(respuesta2);


            // dos nuermos mas

            System.out.println("Ingrese numero3");
            int numero3 = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Ingrese numero4");
            int numero4 = scanner.nextInt();

            // Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.

            String respuesta3= (numero1 >numero2 && numero3 > numero4) ? "si se cumple" : "no se cumple";
            System.out.println(respuesta3);   

            // Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.

            String respuesta4= (numero1 >numero2 || numero3 > numero4) ? "si se cumple" : "no se cumple";
            System.out.println(respuesta4); 
        }
        
    }

    
      


