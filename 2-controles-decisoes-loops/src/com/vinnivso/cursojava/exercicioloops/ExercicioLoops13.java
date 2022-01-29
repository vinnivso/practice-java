package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //13. Programa que peça dois números e demonstre base e expoente.
        System.out.println("Entre com a base:");
        int base = input.nextInt();
        System.out.println("Entre com a potência");
        int expoente = input.nextInt();

        int resultado = base;
        for (int i=1; i < expoente; i++){
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }
}
