import java.util.Scanner;
public class exerc02 {
    public static void main(String[] args) {
        //Verificar se o número é positivo ou negativo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int n1 = scanner.nextInt();

        if (n1 < 0) {
            System.out.println("O número " + n1 + " é Negativo ");
        }else {
            System.out.println("O número " + n1 + " é Positivo.");
        }
        scanner.close();
    }
}
