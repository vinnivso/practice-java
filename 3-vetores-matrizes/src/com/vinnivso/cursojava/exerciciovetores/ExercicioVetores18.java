package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[10];
        int maior = 0;
        int indexMaior = 0;
        int menor = 0;
        int indexMenor = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A, na posição: " + i);
            vetorA[i] = input.nextInt();
            if (vetorA[i] > maior) {
                maior = Math.max(vetorA[i], maior);
                indexMaior = i;
            } else if (vetorA[i] < menor) {
                menor = Math.min(vetorA[i], menor);
                indexMenor = i;
            }
        }

        System.out.print("Vetor de idades = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Menor idade: " + menor);
        System.out.println("Índice da menor idade: " + indexMenor);
        System.out.println("Maior idade: " + maior);
        System.out.println("Índice da maior idade: " + indexMaior);
    }
}
