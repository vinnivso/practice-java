package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[8];
        vetorA[0] = 1;
        vetorA[1] = 2;
        vetorA[2] = 3;
        vetorA[3] = 4;
        vetorA[4] = 5;
        vetorA[5] = 6;
        vetorA[6] = 7;
        vetorA[7] = 8;
        int[] vetorB = new int[8];
        vetorB = vetorA;

        for (int element : vetorA) {
            System.out.println("Os elementos presentes no vetor A são: " + element);
        }
        for (int element : vetorB) {
            element *= 2;
            System.out.println("Os elementos presentes no B são: " + element);
        }

        //Poderia ser feito realizando um for de maneira mais simples e passando a multiplicação por cada iteração no índice.
    }
}
