package com.vinnivso.cursojava.exercicioloops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //18. Programa que peça número inteiro e determine se ele é ou não um número primo.
        System.out.println("Entre com um número inteiro");
        int numeroPrimo = input.nextInt();
        boolean primo = true;

        for (int i = 2; i < numeroPrimo; i++) {
            if (numeroPrimo % i == 0) {
                System.out.println("Não é primo - divisível por " + i);
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println("O número informado é um número primo");
        }
    }
}
