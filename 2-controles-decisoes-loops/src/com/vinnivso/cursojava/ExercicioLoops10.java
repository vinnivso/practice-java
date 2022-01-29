package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //10. Programa recebe dois números inteiros e gere os números inteiros que estão no intervalo entre eles.
        System.out.println("Entre com o primeiro número inteiro");
        int primeiroNumeroInteiro = input.nextInt();
        System.out.println("Entre com o segundo número inteiro");
        int segundoNumeroInteiro = input.nextInt();

        for (int i = primeiroNumeroInteiro; i < segundoNumeroInteiro; i++) {
            System.out.println(i);
        }
    }
}
