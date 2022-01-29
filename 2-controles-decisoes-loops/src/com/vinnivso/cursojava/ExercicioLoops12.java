package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //12. Programa capaz de gerar tabuada de 1 a 10.
        System.out.println("Entre com o número para gerar a tabuada: Lembrando que a tabuada deve receber valores inteiros");
        int numeroTabuada = input.nextInt();
        System.out.println("Tabuada de " + numeroTabuada + ":");
        for (int i=1; i<=10; i++){
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada*i));
        }
    }
}
