package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //9. Programa que calcule número médio de alunos por turma.
        System.out.println("Entre com o número de turmas:");
        int numTurmas = input.nextInt();
        int numAlunos;
        int soma = 0;
        boolean invalido = true;

        for (int i = 1; i <= numTurmas; i++) {

            invalido = true;
            do {
                System.out.println("Entre com o número de alunos da turma " + i);
                numAlunos = input.nextInt();

                if (numAlunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Número de alunos inválido. Digite novamente.");
                }
            } while (invalido);

            soma += numAlunos;
        }
        double media = soma / numTurmas;
        System.out.println("Média: " + media);
    }
}
