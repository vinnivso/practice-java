package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //12. Folha de Pagamento.
        System.out.println("Informe seu valor/hora");
        double valorHora = input.nextDouble();
        System.out.println("Informe horas trabalhadas no mês");
        double horasMes = input.nextDouble();

        double salarioBruto = valorHora * horasMes;
        double percentualIR = 0;
        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            percentualIR = .5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIR = .1;
        } else if (salarioBruto > 2500) {
            percentualIR = .2;
        }
        double ir = salarioBruto * percentualIR;
        double inss = salarioBruto * .1;
        double fgts = salarioBruto * .11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário bruto: (" + valorHora + "*" + horasMes + "): " + decimalFormat.format(salarioBruto));
        System.out.println("(-) IR (" + percentualIR+"% ):" + decimalFormat.format(ir));
        System.out.println("(-) INSS ( 10% ): " + decimalFormat.format(inss));
        System.out.println("(-) FGTS ( 11% ): " + decimalFormat.format(fgts));
        System.out.println("Total de descontos: " + decimalFormat.format(totalDescontos));
        System.out.println("Salário Líquido: " + decimalFormat.format(salarioLiquido));
    }
}
