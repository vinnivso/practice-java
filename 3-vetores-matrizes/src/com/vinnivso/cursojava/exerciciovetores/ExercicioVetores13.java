package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioVetores13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A, na posição: " + i);
            vetorA[i] = input.nextInt();
            if (vetorA[i] % 5 == 0) soma += vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma: " + soma);
    }
}
