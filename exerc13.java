import java.util.Scanner;

public class exerc13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um dia entre 1 e 7: ");
        int diaSemana = scanner.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda-Feira!");
                break;
            case 3:
                System.out.println("Terça-Feira!");
                break;
            case 4:
                System.out.println("Quarta-Feira!");
                break;
            case 5:
                System.out.println("Quinta-Feira!");
                break;
            case 6:
                System.out.println("Sexta-Feira!");
                break;
            case 7:
                System.out.println("Sábado!");
                break;
            default:
                System.out.println("Digite um valor válido!!!");
                break;
        }
        scanner.close();
    }
}
