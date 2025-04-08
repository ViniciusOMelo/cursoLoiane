import java.util.Scanner;

public class exerc15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lado1, lado2, lado3;

        System.out.println("Insira o valor dos três lado para saber se é um triângulo: ");
        lado1 = scanner.nextDouble();
        lado2 = scanner.nextDouble();
        lado3 = scanner.nextDouble();

        if ((lado1 + lado2) > lado3 || (lado2 + lado3) > lado1 || (lado3 + lado1) > lado2) {
            System.out.println("É um triângulo");
            if (lado1 == lado2 & lado1 == lado3) {
                System.out.println("Equilátero");
            } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
                System.out.println("Isoceles");
            } else if (lado1 != lado2 & lado1 != lado3 & lado3 != lado2) {
                System.out.println("Escaleno");
            }

        } else {
            System.out.println("Não é um triângulo");
        }
        scanner.close();
    }
}
