package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 3. Faça um programa que peça dois números e imprima a soma.
         */
        System.out.println("Digite o valor do primeiro número.");
        double primeiroNumero = scan.nextDouble();
        System.out.println("Digite o valor do segundo número.");
        double segundoNumero = scan.nextDouble();
        System.out.println("O valor da soma é: " + (primeiroNumero + segundoNumero));
    }
}
