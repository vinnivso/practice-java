package com.vinnivso.cursojava.exerciciovetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVetores15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        int[] vetorA = new int[10];
        int impar = 0;
        int par;
        double porcentagemPar;
        double porcentagemImpar;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A, na posição: " + i);
            vetorA[i] = input.nextInt();
            if (vetorA[i] % 2 != 0) impar++;
        }
        par = vetorA.length - impar;
        porcentagemPar = (float) (par * 100) / vetorA.length;
        porcentagemImpar = 100 - porcentagemPar;

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Porcentagem Pares: " + decimalFormat.format(porcentagemPar) + "%");
        System.out.println("Porcentagem Ímpares: " + decimalFormat.format(porcentagemImpar) + "%");
    }
}
