package com.vinnivso.cursojava.exerciciomatrizes;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ExercicioMatrizes03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat();
        Random randomNumber = new Random();

        int[][] numeros = new int[3][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                System.out.println("Entre com o valor da pos [" + i + "," + j + "]");
                numeros[i][j] = input.nextInt();
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {

                if (numeros[i][j] % 2 == 0) {
                    qtdPares++;
                } else {
                    qtdImpares++;
                }
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Pares = " + qtdPares);
        System.out.println("Impares = " + qtdImpares);
    }
}
