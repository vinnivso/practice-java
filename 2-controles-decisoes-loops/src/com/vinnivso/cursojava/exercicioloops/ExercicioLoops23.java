package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Lojas Quase Dois - Tabela de preços");
        for (int i=1; i<=50; i++){
            System.out.println(i + " - R$ " + (1.99*i));
        }
    }
}
