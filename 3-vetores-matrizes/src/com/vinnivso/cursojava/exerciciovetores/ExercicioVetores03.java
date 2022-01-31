package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] arrayA = new int[15];
        arrayA[0] = 1;
        arrayA[1] = 2;
        arrayA[2] = 3;
        arrayA[3] = 4;
        arrayA[4] = 5;
        arrayA[5] = 6;
        arrayA[6] = 7;
        arrayA[7] = 8;
        arrayA[8] = 9;
        arrayA[9] = 10;
        arrayA[10] = 11;
        arrayA[11] = 12;
        arrayA[12] = 13;
        arrayA[13] = 14;
        arrayA[14] = 15;
        int[] arrayB = arrayA;

        for (int element : arrayB) {
            element *= element;
            System.out.println("Os valores do Array B, são: " + decimalFormat.format(element));
        }

    }
}
