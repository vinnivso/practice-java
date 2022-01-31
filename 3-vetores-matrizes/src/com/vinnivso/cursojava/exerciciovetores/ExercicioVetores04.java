package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A, na posição: " + i);
            vetorA[i] = input.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length ; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length ; i++) {
            System.out.print(decimalFormat.format(vetorB[i]) + " ");
        }
    }
}
