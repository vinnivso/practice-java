package com.vinnivso.cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioLoops16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //16. Programa com nova série de Fibonacci, gerar até que o valor seja <= 500.
        int primeiroTermoNovaFibonacci = 1;
        int segundoTermoNovaFibonacci = 1;
        int proximoTermoNovaFibonacci = 0;
        System.out.println(primeiroTermoNovaFibonacci);
        System.out.println(segundoTermoNovaFibonacci);

        do {
            proximoTermoNovaFibonacci = primeiroTermoNovaFibonacci + segundoTermoNovaFibonacci;
            primeiroTermoNovaFibonacci = segundoTermoNovaFibonacci;
            segundoTermoNovaFibonacci = proximoTermoNovaFibonacci;
            System.out.println(proximoTermoNovaFibonacci);
        } while (proximoTermoNovaFibonacci <= 500);
    }
}
