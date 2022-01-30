package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 13. Calcule seu salário Líquido.
         */
        System.out.println("Entre com seu valor/hora.");
        double valorHoraLiquido = scan.nextDouble();
        System.out.println("Entre com horas trabalhadas no mês.");
        double horasMesLiquido = scan.nextDouble();
        double salarioSample = valorHoraLiquido * horasMesLiquido;
        double ir = salarioSample * 11 / 100;
        double inss = salarioSample * 8 / 100;
        double sindicato = salarioSample * 5 / 100;
        double salarioLiquido = salarioSample - (ir + inss + sindicato);
        System.out.println("Seu salário nesse mês, será de: R$"+decimalFormat.format(salarioLiquido));
    }
}
