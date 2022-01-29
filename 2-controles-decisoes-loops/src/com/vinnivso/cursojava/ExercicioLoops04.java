package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //4. Programa que calcule e escreve quantos anos a população de um país A vai ultrapassar país B.
        int popA = 80000;
        int popB = 200000;
        int i = 0;
        while (popA <= popB) {
            popA += popA * .03;
            popB += popB * .015;
            i++;
        }
        System.out.println("População do País A: " + popA);
        System.out.println("População do País B: " + popB);
        System.out.println("Para o país A ultrapassar ou igualar com a população do país B, vão demorar " + i + " anos");
    }
}
