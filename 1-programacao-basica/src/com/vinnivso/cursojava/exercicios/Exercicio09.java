package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 9. Faça um programa que peça Fahrenheit e mostre a temperatura em Celsius.
         */
        System.out.println("Digite o valor de ºF para serem convertidos para ºC.");
        double grausFahrenheit = scan.nextDouble();
        double grausCelsius = (5 * (grausFahrenheit - 32) / 9);
        System.out.println("Temperatura em Celsius é: " + decimalFormat.format(grausCelsius)+"ºC");
    }
}
