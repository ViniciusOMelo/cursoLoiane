import java.util.Scanner;
public class exerc08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco1, preco2, preco3;
        System.out.println("Insira o preço de treis produtos: ");
        preco1 = scanner.nextDouble();
        preco2 = scanner.nextDouble();
        preco3 = scanner.nextDouble();

        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Mais barato: " + preco1);
        }else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Mais barato: " + preco2);
        }else if (preco3 < preco1 && preco3 < preco1) {
            System.out.println("Mais barato: " + preco3);
        }else {
            System.out.println("Preços iguais, produto a sua escolha...");
        }
        scanner.close();
    }
}
