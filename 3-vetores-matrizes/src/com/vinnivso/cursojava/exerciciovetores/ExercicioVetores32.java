package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor da posição A - " + i);
            vetorA[i] = input.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Tabuada de " + vetorA[i]);
            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i] * j));
            }
            System.out.println();
        }
    }
}
