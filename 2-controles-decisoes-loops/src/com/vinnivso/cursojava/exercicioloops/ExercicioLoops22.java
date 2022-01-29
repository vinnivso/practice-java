package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //22. Programa que calcule o valor total investido por um colecionador de CDs.
        System.out.println("Entre com o número de CDs:");
        int cds = input.nextInt();
        double preco;
        double soma = 0;

        for (int i = 1; i <= cds; i++) {
            System.out.println("Informe o valor do cd " + i);
            preco = input.nextDouble();
            soma += preco;
        }
        double media = soma / cds;
        System.out.println("Média gasta com cada CD: " + media);
    }
}
