package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //8. Programa que leia 5 números e informe a soma e a média dos números.
        double numeroInform;
        double mediaInform;
        double somaInform = 0;

        for (int i = 0; i< 5; i++) {
            System.out.println("Digite um número");
            numeroInform = input.nextDouble();
            somaInform += numeroInform;
        }
        mediaInform = somaInform / 5;
        System.out.println("Soma: " + decimalFormat.format(somaInform));
        System.out.println("Média: " + decimalFormat.format(mediaInform));
    }
}
