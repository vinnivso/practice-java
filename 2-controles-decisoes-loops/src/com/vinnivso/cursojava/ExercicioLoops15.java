package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //15. Programa capaz de gerar uma sequência de Fibonacci, até o n-ésimo termo.
        System.out.println("Entre com o n-ésimo termo da série de Fibonacci que deseja gerar");
        int n = input.nextInt();
        int primeiroTermo = 1;
        int segundoTermo = 1;
        int proximoTermo;
        System.out.println(primeiroTermo);
        System.out.println(segundoTermo);

        //1,1,2,3,5
        //primeiro = 1
        //segundo = 2
        //proximo = 3

        for (int i = 3; i <= n; i++) {
            proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            System.out.println("Número da série: " + proximoTermo + ", presente no termo: " + i);
        }
    }
}
