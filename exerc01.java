import java.util.Scanner;
public class exerc01 {
    public static void main (String[] args) {
        //Mostrar o maior entre os números
        Scanner scanner = new Scanner(System.in); 
        int n1, n2;

        System.out.println("Insira um números:");
        n1 = scanner.nextInt();
        System.out.println("Insira outro número:");
        n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior que " + n2);
        }else if (n1 < n2) {
            System.out.println("O número " + n2 + " é maior que " + n1);
        }else {
            System.out.println("Os números são iguais.");
        }
        scanner.close();
    }
}
