package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //17. Programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        System.out.println("Informe um número inteiro");
        int numeroInteiroInformado = input.nextInt();
        int fatorial = 1;

        if (numeroInteiroInformado == 0) {
            fatorial = 1;
        } else {
            for (int i = numeroInteiroInformado; i > 0; i--) {
                fatorial *= i;
                System.out.println(i);
            }
        }
        System.out.println("Resultado de " + numeroInteiroInformado + "!" + " é " + fatorial);
    }
}
