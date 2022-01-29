package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //7. Programa que leia 5 números e informe o maior número.
        double num;
        double maior = Double.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            System.out.println("Entre com um número");
            num = input.nextDouble();

            if (num > maior) {
                maior = num;
                System.out.println("O número maior mudou: " + maior);
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
