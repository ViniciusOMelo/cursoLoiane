import java.util.Scanner;

public class exerc02 {
    public static void main(String[] args) {
        // Verificar se o número é positivo ou negativo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("O número " + num + " é Positivo ");
        } else {
            System.out.println("O número " + num + " é Negativo.");
        }
        scanner.close();
    }
}
