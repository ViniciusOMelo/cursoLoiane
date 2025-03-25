import java.util.Scanner;

public class exerc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo;
        System.out.println("Digite o seu sexo: (F ou M)");
        sexo = scanner.nextLine();

        switch (sexo) {
            case "F":
                System.out.println("F - Femenino");
                break;
            case "M":
                System.out.println("M - Masculino");
                break;
            default:
                System.out.println("Sexo inválido.");
                break;
        }
        scanner.close();
    }
}
