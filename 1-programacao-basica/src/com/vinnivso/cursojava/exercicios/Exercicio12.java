package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 12. Altura em metros como parâmetro, calcule o peso ideal.
         */
        System.out.println("Digite o valor de sua altura em metros.");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Seu peso ideal em é de: " + decimalFormat.format(pesoIdeal)+"kg.");
    }
}
