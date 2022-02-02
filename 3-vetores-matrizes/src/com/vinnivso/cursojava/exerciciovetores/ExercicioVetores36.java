package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double[] vetorA = new double[11];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = Math.pow(2, i);
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }
}
