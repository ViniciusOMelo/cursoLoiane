import java.util.Scanner;
public class exerc06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("Insira 3 valores: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é o " + n1);
        }else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é o " + n2);
        }else if (n3 > n1 && n3 > n2) {
            System.out.println("O maior número é o " + n3);
        }else {
            System.out.println("O números são iguais " + n1 + n2 + n3);
        }

        scanner.close();
    }
}
