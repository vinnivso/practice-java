package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 11. Peça 2 números inteiros e 1 real. Realize operações:
         * A. O produto do dobro do primeiro com metade do segundo.
         * B. A soma do triplo do primeiro com o terceiro.
         * C. O terceiro elevado ao cubo.
         */
        System.out.println("Entre com um número inteiro.");
        long numero1 = scan.nextInt();
        System.out.println("Entre com um segundo número inteiro.");
        long numero2 = scan.nextInt();
        System.out.println("Entre com um número real.");
        double numero3 = scan.nextDouble();

        double resultA = (2 * numero1) * (numero2 / 2);
        System.out.println("Resultado A: " + decimalFormat.format(resultA));
        double resultB = (3 * numero1) + numero3;
        System.out.println("Resultado B: " + decimalFormat.format(resultB));
        double resultC = Math.pow(numero3, 3);
        System.out.println("Resultado C: " + decimalFormat.format(resultC));
    }
}
