package com.vinnivso.cursojava;

import java.util.Scanner;

public class ExerciciosCondicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Programa que peça dois números e imprima o maior deles.
        System.out.println("Digite o primeiro valor");
        double primeiroValor = scan.nextDouble();
        System.out.println("Digite o segundo valor");
        double segundoValor = scan.nextDouble();
        if (primeiroValor > segundoValor) {
            System.out.println(primeiroValor + " é maior que " + segundoValor);
        } else if (segundoValor > primeiroValor) {
            System.out.println(segundoValor + " é maior que " + primeiroValor);
        } else {
            System.out.println("Os valores informados são equivalentes");
        }
    }
}
