import java.util.Scanner;

public class exerc11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = scanner.nextDouble();

        double valorAumento;

        if (salario <= 280) {
            System.out.println("Seu salário antes do reajuste: " + salario);
            valorAumento = salario * 0.2;
            salario = salario + valorAumento;
            System.out.println("Seu salário recebeu 20% de aumento, que equivale a: " + valorAumento);
            System.out.println("Salário reajustado: " + salario);
        } else if (salario >= 280 & salario <= 700) {
            System.out.println("Seu salário antes do reajuste: " + salario);
            valorAumento = salario * 0.15;
            salario = salario + valorAumento;
            System.out.println("Seu salário recebeu 15% de aumento, que equivale a: " + valorAumento);
            System.out.println("Salário reajustado: " + salario);
        } else if (salario >= 700 & salario <= 1500) {
            System.out.println("Seu salário antes do reajuste: " + salario);
            valorAumento = salario * 0.10;
            salario = salario + valorAumento;
            System.out.println("Seu salário recebeu 10% de aumento, que equivale a: " + valorAumento);
            System.out.println("Salário reajustado: " + salario);
        } else if (salario > 1500) {
            System.out.println("Seu salário antes do reajuste: " + salario);
            valorAumento = salario * 0.05;
            salario = salario + valorAumento;
            System.out.println("Seu salário recebeu 5% de aumento, que equivale a: " + valorAumento);
            System.out.println("Salário reajustado: " + salario);
        }
        scanner.close();
    }
}
