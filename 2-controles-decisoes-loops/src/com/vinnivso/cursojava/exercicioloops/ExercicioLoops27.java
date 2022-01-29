package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Entre com a qtd de temperaturas");
        int qtdTemperaturas = input.nextInt();
        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 1; i <= qtdTemperaturas; i++) {
            System.out.println("Entre com a temperatura " + i);
            temp = input.nextDouble();
            soma += temp;
            if (temp > maior) {
                maior = temp;
            }

            if (temp < menor) {
                menor = temp;
            }
        }
        System.out.println("Média: " + decimalFormat.format((soma / qtdTemperaturas)));
        System.out.println("Menor temperatura: " + decimalFormat.format(menor));
        System.out.println("Maior temperatura: " + decimalFormat.format(maior));
    }
}
