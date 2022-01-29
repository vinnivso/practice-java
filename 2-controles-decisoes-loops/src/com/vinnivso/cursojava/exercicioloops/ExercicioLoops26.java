package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Digite um número:");
        int num = input.nextInt();
        System.out.println("Fatorial de " + num);
        System.out.print(num + "! = ");
        int fatorial = 1;

        for (int i = num; i > 1; i--) {
            fatorial *= i;
            System.out.print(i + " . ");
        }
        System.out.print(" 1 = " + fatorial);
    }

}
