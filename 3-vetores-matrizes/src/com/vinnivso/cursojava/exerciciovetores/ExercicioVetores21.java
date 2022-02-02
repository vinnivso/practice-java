package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Entre com a cotação do dólar:");
        cotacao = input.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = cotacao * (i + 1);
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}
