package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Entre com o número para gerar a tabuada:");
        int num = input.nextInt();
        boolean invalido = true;
        int numFinal, numInicio;

        do {
            System.out.println("Entre com o início da tabuada");
            numInicio = input.nextInt();
            System.out.println("Entre como final da tabuada");
            numFinal = input.nextInt();
            if (numFinal > numInicio) {
                invalido = false;
            }
        } while (invalido);
        System.out.println("Tabuada de " + num + ":");
        System.out.println("Começar por: " + numInicio);
        System.out.println("Terminar em: " + numFinal);
        System.out.println();

        for (int i = numInicio; i <= numFinal; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
