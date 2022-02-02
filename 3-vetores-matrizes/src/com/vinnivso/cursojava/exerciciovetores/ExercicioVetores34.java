package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição A - " + i);
            vetorA[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Analizando o número " + vetorA[i]);
            for (int j = 2; j < vetorA[i]; j++) {
                if (j % 2 == 0) {
                    System.out.println(j + " é par");
                }
            }
            System.out.println();
        }
    }
}
