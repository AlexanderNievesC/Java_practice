import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese opcion: 1(circulo), 2(rectangulo)");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Ud. selecciono un circulo");
                System.out.println("Ingrese radio");
                double radio = scanner.nextDouble();

                System.out.println("Desea calcular 1) area o 2) perimetro");
                int operacion = scanner.nextInt();

                switch (operacion) {
                    case 1:
                        double area_circulo = Math.PI * (Math.pow(radio, 2));
                        System.out.println("area de circulo es " + area_circulo);
                        break;

                    case 2:
                        double perimetro_circulo = 2 * Math.PI * radio;
                        System.out.println("perimetro de circulo es " + perimetro_circulo);
                        break;
                }
                break;

            case 2:
                System.out.println("Ud. selecciono un rectangulo");

                System.out.println("Ingrese base");
                int base = scanner.nextInt();

                System.out.println("Ingrese altura");
                int altura = scanner.nextInt();

                System.out.println("Desea calcular 1) area o 2) perimetro");
                int operacion1 = scanner.nextInt();

                switch (operacion1) {
                    case 1:
                        double area_rectangulo = base * altura;
                        System.out.println("area de rectangulo es " + area_rectangulo);
                        break;

                    case 2:
                        double perimetro_rectangulo = (base * 2) + (altura * 2);
                        System.out.println("perimetro de rectangulo es " + perimetro_rectangulo);
                        break;
                }
                break;
        }

    }
}