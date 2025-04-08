import java.util.Scanner;

public class exerc09 {
    // Ordem decrescente
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("insira treis números: ");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();

        if ((n1 > n2 & n1 > n3) & (n2 < n1 & n2 > n3) & (n3 < n1 & n3 < n2)) {
            System.out.println(n1 + " " + n2 + " " + " " + n3);
        }
        else if ((n1 > n2 & n1 > n3) & (n3 < n1 & n3 > n2) & (n2 < n1 & n2 < n3)) {
            System.out.println(n1 + " " + n3 + " " + " " + n2);
        }
        //--------------------
        else if ((n2 > n1 & n2 > n3) & (n1 < n2 & n1 > n3) & (n3 < n1 & n3 < n2)) {
            System.out.println(n2 + " " + n1 + " " + " " + n3);
        }
        else if ((n2 > n1 & n2 > n3) & (n3 < n2 & n3 > n1) & (n1 < n2 & n1 < n3)) {
            System.out.println(n2 + " " + n3 + " " + " " + n1);
        }
        //--------------------
        else if ((n3 > n1 & n3 > n2) & (n1 < n3 & n1 > n2) & (n2 < n1 & n2 < n3)) {
            System.out.println(n3 + " " + n1 + " " + " " + n2);
        }
        else if ((n3 > n1 & n3 > n2) & (n2 < n3 & n2 > n1) & (n1 < n3 & n1 < n2)) {
            System.out.println(n3 + " " + n2 + " " + " " + n1);
        }
        else {
            System.out.println("O números são iguais " + n1 + n2 + n3);
        }
        scanner.close();
    }
}
