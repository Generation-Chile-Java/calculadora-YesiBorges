import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = (numero2 != 0) ? numero1 / numero2 : Double.NaN;
        double modulo = (numero2 != 0) ? numero1 % numero2 : Double.NaN;

        System.out.println("Resultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + (numero2 != 0 ? division : "No se puede dividir por cero"));
        System.out.println("Módulo: " + (numero2 != 0 ? modulo : "No se puede calcular módulo con cero"));

        scanner.close();
    }
}