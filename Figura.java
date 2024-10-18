import java.util.Scanner;

public class Figura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero de 1 al 3, 1: circulo,2:cuadrado, 3 para triangulo");

        String number = scanner.nextLine();

        switch (number) {
            case "1":

                System.out.println("Ud. selecciono un circulo");
                System.out.println("Ingrese radio");
                int radio = scanner.nextInt();
                double area_circulo = Math.pow(radio, 2) * Math.PI;
                System.out.println("El area de circulo es " + area_circulo);
                break;

            case "2":

                System.out.println("Ud. selecciono un cuadrado");
                System.out.println("Ingrese lado");
                int lado = scanner.nextInt();
                double area_cuadrado = lado * lado;
                System.out.println("El area del cuadrado es " + area_cuadrado);
                break;

            case "3":

                System.out.println("Ud. selecciono un triangulo");
                System.out.println("Ingrese radio");
                int base = scanner.nextInt();
                int altura = scanner.nextInt();
                double area_triangulo = (base * altura) / 2;
                System.out.println("El area del cuadrado es " + area_triangulo);
                break;
        }

        scanner.close();
    }

}