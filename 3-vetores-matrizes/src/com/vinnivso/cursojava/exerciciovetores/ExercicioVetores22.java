package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[10];
        int qtd0 = 0;
        int qtd1 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
            if (vetorA[i] == 0) qtd0++;
            else qtd1++;
        }

        //10  - 100%
        //qtd - x
        //x = (qtd * 100)/10;
        double porc0 = (float) (qtd0 * 100) / vetorA.length;
        double porc1 = (float) (qtd1 * 100) / vetorA.length;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Porc 0 = " + decimalFormat.format(porc0) + "%");
        System.out.println("Porc 1 = " + decimalFormat.format(porc1) + "%");
    }
}
