package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 5. Faça um programa que converta metros para centímetros.
         */
        System.out.println("Digite o valor em metros para ser convertido em centímetros " +
                "flutuante.");
        double valorInformadoMetros = scan.nextDouble();
        double valorConvertidoCentimetros = valorInformadoMetros * 100;
        System.out.println("A conversão é: " + valorConvertidoCentimetros+"cm");
    }
}
