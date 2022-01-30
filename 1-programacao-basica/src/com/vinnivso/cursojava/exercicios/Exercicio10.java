package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 10. Faça um programa que peça Celsius e mostre a temperatura em Fahrenheit.
         */
        System.out.println("Digite o valor de ºC para serem convertidos para ºF.");
        double grausCelsiusConverter = scan.nextDouble();
        double grausFahrenheitConverter = (grausCelsiusConverter * 5 / 9) + 32;
        System.out.println("Temperatura em Celsius é: " + decimalFormat.format(grausFahrenheitConverter)+"ºC");
    }
}
