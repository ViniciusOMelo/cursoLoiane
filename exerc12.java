import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da sua hora: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Insira a quantidade de horas trabalhadas: ");
        int horasTrabalhada = scanner.nextInt();

        double salarioBruto = (valorHora * horasTrabalhada);

        double impostoDeRenda = 0, inss, fgts, totalDesconto;

        inss = (salarioBruto * 0.10);
        fgts = (salarioBruto * 0.11);

        if (salarioBruto <= 900) {
            totalDesconto = (inss + impostoDeRenda);

            System.out.println(
                    "Salário Bruto: ( " + valorHora + " * " + horasTrabalhada + " )    : R$ " + salarioBruto);
            System.out.println("(-) IR (5%)                     : R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%)                  : R$ " + inss);
            System.out.println("FGTS                            : R$ " + fgts);
            System.out.println("Total Descontos                 : R$ " + totalDesconto);
            System.out.println("Salário Líquido                 : R$ " + (salarioBruto - totalDesconto));

        } else if (salarioBruto > 900 & salarioBruto <= 1500) {
            impostoDeRenda = salarioBruto * 0.05;
            totalDesconto = (inss + impostoDeRenda);

            System.out.println(
                    "Salário Bruto: ( " + valorHora + " * " + horasTrabalhada + " )    : R$ " + salarioBruto);
            System.out.println("(-) IR (5%)                     : R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%)                  : R$ " + inss);
            System.out.println("FGTS                            : R$ " + fgts);
            System.out.println("Total Descontos                 : R$ " + totalDesconto);
            System.out.println("Salário Líquido                 : R$ " + (salarioBruto - totalDesconto));

        } else if (salarioBruto > 1500 & salarioBruto <= 2500) {
            impostoDeRenda = salarioBruto * 0.10;
            totalDesconto = (inss + impostoDeRenda);

            System.out.println(
                    "Salário Bruto: ( " + valorHora + " * " + horasTrabalhada + " )    : R$ " + salarioBruto);
            System.out.println("(-) IR (5%)                     : R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%)                  : R$ " + inss);
            System.out.println("FGTS                            : R$ " + fgts);
            System.out.println("Total Descontos                 : R$ " + totalDesconto);
            System.out.println("Salário Líquido                 : R$ " + (salarioBruto - totalDesconto));

        } else if (salarioBruto > 2500) {
            impostoDeRenda = salarioBruto * 0.20;
            totalDesconto = (inss + impostoDeRenda);

            System.out.println(
                    "Salário Bruto: ( " + valorHora + " * " + horasTrabalhada + " )    : R$ " + salarioBruto);
            System.out.println("(-) IR (5%)                     : R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%)                  : R$ " + inss);
            System.out.println("FGTS                            : R$ " + fgts);
            System.out.println("Total Descontos                 : R$ " + totalDesconto);
            System.out.println("Salário Líquido                 : R$ " + (salarioBruto - totalDesconto));

        }
        scanner.close();
    }
}
