package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //9. Programa que imprima na tela apenas os números primos entre 1 e 50.
        for (int i = 1; i < 50; i++) {
            if ( i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
