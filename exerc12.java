import java.util.Scanner;

public class exerc12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da sua hora: ");
        double valorHora = scanner.nextDouble();

        System.out.println("Insira a quantidade de horas trabalhadas: ");
        int horasTrabalhada = scanner.nextInt();

        double salarioBruto = (valorHora * horasTrabalhada);

        double percentualIR = 0, impostoDeRenda, inss, fgts, totalDesconto = 0, salarioLiquido;

        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 & salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto > 1500 & salarioBruto <= 2500) {
            percentualIR = 10;
        } else if (salarioBruto > 2500) {
            percentualIR = 20;
        }

        impostoDeRenda = (salarioBruto / 100) * percentualIR;
        inss = (salarioBruto / 100) * 10;
        fgts = (salarioBruto / 100) * 11;
        totalDesconto = impostoDeRenda + inss;
        salarioLiquido = salarioBruto - totalDesconto;
        System.out.println(
                    "Salário Bruto: ( " + valorHora + " * " + horasTrabalhada + " )   : R$ " + salarioBruto);
            System.out.println("(-) IR (" + percentualIR + ")                   : R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%)                  : R$ " + inss);
            System.out.println("FGTS                            : R$ " + fgts);
            System.out.println("Total Descontos                 : R$ " + totalDesconto);
            System.out.println("Salário Líquido                 : R$ " + (salarioLiquido));
        scanner.close();
    }
}
