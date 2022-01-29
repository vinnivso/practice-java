package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //1. Valide número inserido por usuário.
        System.out.println("insira a nota");
        boolean notaValida = false;
        double nota; // -> Por uma questão de performance, será declarado as variáveis que serão utilizadas
        // no loop, fora do escopo do loop.

        do {
            System.out.println("Entre com uma nota");
            nota = input.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                //notaValida = true; -> Sem necessidade uma vez que a outra condição já está como true.
                System.out.println("Nota inválida, digite novamente");
            }
        } while (!notaValida);
    }
}
