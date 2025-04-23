import java.util.Scanner;

public class exerc14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;
        String notaConceito = "";

        System.out.println("Insira a 1° nota: ");
        nota1 = scanner.nextDouble();
        System.out.println("Insira a 2° nota: ");
        nota2 = scanner.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media > 9 && media <= 10) {
            notaConceito = ("Nota conceito: A \nVocê foi APROVADO!");
        } else if (media >= 7.5 && media < 9) {
            notaConceito = ("Nota conceito: B \nVocê foi APROVADO!");
        } else if (media >= 6 && media < 7.5) {
            notaConceito = ("Nota conceito: C \nVocê foi APROVADO!");
        } else if (media >= 4 && media < 6) {
            notaConceito = ("Nota conceito: D \nVocê foi REPROVADO!");
        } else if (media >= 0 && media < 4) {
            notaConceito = ("Nota conceito: E \nVocê foi REPROVADO!");
        }

        System.out.println("Suas notas : " + nota1 + " e " + nota2);
        System.out.println("Sua média  : " + media);
        System.out.println(notaConceito);

        scanner.close();
    }
}
