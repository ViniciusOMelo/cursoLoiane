import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;
        System.out.println("Insira a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Insira a segunda nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2 ;

        if (media == 10) {
            System.out.println("Aprovado com Distinção");
        }else if (media >= 7) {
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
        scanner.close();
    }
}