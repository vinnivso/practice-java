package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //18. Par ou ímpar?
        System.out.println("Informe um número natural");
        int numeroNatural = input.nextInt();
        if (numeroNatural == 0) {
            System.out.println("O número: " + numeroNatural + " não corresponde a classificação ÍMPAR ou PAR");
        } else if (numeroNatural % 2 == 0) {
            System.out.println("O número: " + numeroNatural + " é PAR");
        }
        else {
            System.out.println("O número: " + numeroNatural + " é ÍMPAR");
        }
    }
}
