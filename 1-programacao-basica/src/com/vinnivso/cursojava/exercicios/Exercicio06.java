package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 6. Faça um programa que peça o raio de um círcule. Calcule e mostra sua área.
         */
        System.out.println("Digite o valor do raio");
        double valorRaio = scan.nextDouble();
        double valorArea = Math.PI * (valorRaio * valorRaio);
        System.out.println("Área é: " + valorArea);
    }
}
