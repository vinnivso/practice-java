package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioVetores11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[10];
        ArrayList<Integer> vetorB = new ArrayList();

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A, na posição: " + i);
            vetorA[i] = input.nextInt();
        }
        for (int i = 0; i < vetorA.length ; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB.add(vetorA[i]);
            }
        }

        System.out.print("Vetor Par = ");
        for (int i = 0; i < vetorB.size(); i++) {
            System.out.print(vetorB.get(i) + " ");
        }
        System.out.println();
        System.out.println("Sendo assim, o vetor par possui: " + vetorB.size() + " elementos");
    }
}
