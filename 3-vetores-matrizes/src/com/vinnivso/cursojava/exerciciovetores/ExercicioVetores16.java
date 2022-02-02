package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[10];
        int somaMenor = 0;
        int somaIgual = 0;
        int somaMaior = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A, na posição: " + i);
            vetorA[i] = input.nextInt();
            if (vetorA[i] < 15) somaMenor += vetorA[i];
            if (vetorA[i] == 15) somaIgual += vetorA[i];
            if (vetorA[i] > 15) somaMaior += vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Soma dos valores menores que 15: " + somaMenor);
        System.out.println("Soma dos valores iguais a 15: " + somaIgual);
        System.out.println("Soma dos valores maiores que 15: " + somaMaior);
    }
}
