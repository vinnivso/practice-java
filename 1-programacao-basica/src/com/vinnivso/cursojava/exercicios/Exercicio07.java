package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 7. Faça um programa que calcule a área do quadrado e mostre o dobro para o usuário.
         */
        System.out.println("Digite o valor corresponde ao vértice do quadrado.");
        double valorVertice = scan.nextDouble();
        double valorAreaQuadrado = Math.pow(valorVertice, 2);
        double dobroValorAreaQuadrado = 2 * valorAreaQuadrado;
        System.out.println("O dobro da área é: " + dobroValorAreaQuadrado);
    }
}
