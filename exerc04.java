import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma letra: ");
        String letra = scanner.nextLine();

        switch (letra) {
            case "A":

            case "E":

            case "I":

            case "O":

            case "U":
                System.out.println("É uma Vogal.");
                break;

            default:
                System.out.println("É uma consoante.");
                break;
        }

        scanner.close();
    }
}
