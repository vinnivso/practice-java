package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Digite o valor de n:");
        int n = input.nextInt();
        double soma = 0;

        for (int i=1; i<=n; i++){
            soma += 1/i;
        }
        System.out.println("Soma = " + decimalFormat.format(soma));
    }
}
