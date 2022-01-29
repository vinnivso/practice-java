package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //19. Programa que mostre e calcule a média aritmética de N notas.
        System.out.println("Entre com o número de notas");
        int notasN = input.nextInt();
        double somaNotasN = 0;
        double mediaNotasN;
        double notaNotasN;

        if (notasN <= 0) {
            System.out.println("Por favor, insira uma quantidade de notas válidas que possam ser verificadas, no caso, valores inteiros > 0");
        } else {
            for (int i = 0; i < notasN; i++) {
                System.out.println("Entre com a nota " + (i + 1));
                notaNotasN = input.nextDouble();
                if (notaNotasN < 0 || notaNotasN > 10) {
                    System.out.println("Nota inválida, não podem ser inseridas notas menores do que ZERO ou maiores do que DEZ");
                    break;
                } else {
                    somaNotasN += notasN;
                }
            }
            mediaNotasN = somaNotasN / notasN;
            System.out.println("Soma: " + somaNotasN);
            System.out.println("Média: " + mediaNotasN);
        }
    }
}
