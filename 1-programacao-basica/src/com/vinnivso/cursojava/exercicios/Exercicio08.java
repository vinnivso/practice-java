package com.vinnivso.cursojava.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        /*
         * 8. Faça um programa que pergunta sua remuneração horária, horas trabalhadas no mês e retorne seu salário.
         */
        System.out.println("Quanto recebe por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas trabalha por mês?");
        double valorHoraMes = scan.nextDouble();
        double salarioHoraMes = valorHora * valorHoraMes;
        System.out.println("Seu salário será de: " + "R$"+ decimalFormat.format(salarioHoraMes));
    }
}
