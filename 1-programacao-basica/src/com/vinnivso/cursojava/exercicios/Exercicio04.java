package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 4. Faça um programa que peça as 4 notas bimetras e mostre a média.
         */
        System.out.println("Informe a nota da P1.");
        double  notaP1 = scan.nextDouble();
        System.out.println("Informe a nota da P2.");
        double  notaP2 = scan.nextDouble();
        System.out.println("Informe a nota da P3.");
        double  notaP3 = scan.nextDouble();
        System.out.println("Informe a nota da P4.");
        double  notaP4 = scan.nextDouble();
        double media = (notaP1 + notaP2 + notaP3 + notaP4) / 4;
        System.out.println("A média é: " + media);
    }
}
