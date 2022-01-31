package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        double[] arrayA = new double[5];
        double[] arrayB = arrayA;

        arrayA[0] = 1.2;
        arrayA[1] = 1.7;
        arrayA[2] = 3.3;
        arrayA[3] = 4.5;
        arrayA[4] = 5.3;

        for (double element : arrayA) {
            System.out.println("Os valores do Array A são: " + element);
        }

        for (double element : arrayB) {
            System.out.println("Os valores do Array B são: " + element);
        }
    }
}
