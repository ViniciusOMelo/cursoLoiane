import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual é o seu turno: \"M - Matutino\" ou \"V - Vespertino\" ou \"N - Noturno\"");
        String turno = scanner.nextLine();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite!");
        }
        scanner.close();
    }
}
