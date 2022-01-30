package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 2. Faça um programa que peça um número e então mostre a mensagem "O número informado foi x".
         */
        System.out.println("Digite um número.");
        double numeroInformado = scan.nextDouble();
        System.out.println("O número informado foi " + numeroInformado);
    }
}
