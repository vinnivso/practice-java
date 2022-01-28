package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciciosLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //1. Valide número inserido por usuário.
        System.out.println("insira a nota");
        boolean notaValida = false;

        do {
            System.out.println("Entre com uma nota");
            double nota = input.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                System.out.println("Nota inválida, digite novamente");
            }
        } while (!notaValida);

    }
}
