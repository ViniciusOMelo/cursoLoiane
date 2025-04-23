import java.util.Scanner;

public class exerc04 {

    // Programa para saber se a letra é uma vogal ou consoante.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma letra: ");
        String letra = scanner.nextLine();

        if (letra.length() > 1) {
            System.out.println("Não é uma letra válida!");
        } else {
            if (letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i")
                    | letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u")) {
                System.out.println("A letra \"" + letra + "\" é uma vogal!");
            } else {
                System.out.println("A letra \"" + letra + "\" É uma Consoante.");
            }
        }
        /*
         * switch (letra) {
         * case "a":
         * 
         * case "e":
         * 
         * case "i":
         * 
         * case "o":
         * 
         * case "u":
         * 
         * case "A":
         * 
         * case "E":
         * 
         * case "I":
         * 
         * case "O":
         * 
         * case "U":
         * System.out.println("É uma Vogal.");
         * break;
         * 
         * default:
         * System.out.println("É uma consoante.");
         * break;
         * }
         */
        scanner.close();
    }
}
