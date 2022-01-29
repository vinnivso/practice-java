package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //14. Programa pede dois números inteiros e demonstre os números pares e ímpares entre eles.
        int numeroDefinidoPeloUsuario;
        int pares = 0;
        int impares = 0;

        System.out.println("Entre com 10 números inteiros, separados por SPACE ou ENTER: ");
        for (int i = 0; i < 10; i++) {
            numeroDefinidoPeloUsuario = input.nextInt();

            if (numeroDefinidoPeloUsuario % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
