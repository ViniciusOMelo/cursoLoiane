import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.println("Insira a 1° nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Insira a 2° nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media > 9 & media <= 10) {
            System.out.println("Suas notas : " + nota1 + " e " + nota2);
            System.out.println("Sua média  : " + media);
            System.out.println("Nota conceito: A");
            System.out.println("Você foi APROVADO!");
        }else if (media > 7.5 & media <= 9) {
            System.out.println("Suas notas   : " + nota1 + " e " + nota2);
            System.out.println("Sua média    : " + media);
            System.out.println("Nota conceito: B");
            System.out.println("Você foi APROVADO!");
        }else if (media > 6 & media <= 7.5) {
            System.out.println("Suas notas : " + nota1 + " e " + nota2);
            System.out.println("Sua média  : " + media);
            System.out.println("Nota conceito: C");
            System.out.println("Você foi APROVADO!");
        }else if (media > 4 & media <= 6) {
            System.out.println("Suas notas : " + nota1 + " e " + nota2);
            System.out.println("Sua média  : " + media);
            System.out.println("Nota conceito: D");
            System.out.println("Você foi REPROVADO!");
        }else if (media > 0 & media <= 4) {
            System.out.println("Suas notas : " + nota1 + " e " + nota2);
            System.out.println("Sua média  : " + media);
            System.out.println("Nota conceito: E");
            System.out.println("Você foi REPROVADO!");
        }
        scanner.close();
    }
}
