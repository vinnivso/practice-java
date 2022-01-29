package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //1. Programa que peça dois números e imprima o maior deles.
        System.out.println("Digite o primeiro valor");
        double primeiroValor1 = input.nextDouble();
        System.out.println("Digite o segundo valor");
        double segundoValor = input.nextDouble();
        if (primeiroValor1 > segundoValor) {
            System.out.println(primeiroValor1 + " é maior que " + segundoValor);
        } else if (segundoValor > primeiroValor1) {
            System.out.println(segundoValor + " é maior que " + primeiroValor1);
        } else {
            System.out.println("Os valores informados são equivalentes");
        }
    }
}
