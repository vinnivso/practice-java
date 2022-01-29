package com.vinnivso.cursojava.exerciciocondicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioCondicionais19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        //19. Programa pede dois números e solicita operação básica para o usuário.
        System.out.println("Informe o valor do primeiro número natural");
        long primeiroNumeroNatural = input.nextLong();
        System.out.println("Informe o valor do segundo número natural");
        long segundoNumeroNatural = input.nextLong();
        System.out.println("Informe a operação desejada (+ , - , * , / )");
        String operacaoDesejada = input.next();

        switch (operacaoDesejada) {
            case "+" -> System.out.println("Resultado da soma: " + String.valueOf(decimalFormat.format(primeiroNumeroNatural + segundoNumeroNatural)));
            case "-" -> System.out.println("Resultado da subtração: " + String.valueOf(decimalFormat.format(primeiroNumeroNatural - segundoNumeroNatural)));
            case "*" -> System.out.println("Resultado da multiplicação: " + String.valueOf(decimalFormat.format(primeiroNumeroNatural * segundoNumeroNatural)));
            case "/" -> System.out.println("Resultado da divisão: " + String.valueOf(decimalFormat.format(primeiroNumeroNatural / segundoNumeroNatural)));
            default -> System.out.println("Por favor, insira uma operação com base nos modelos apresentados");
        }

        if (primeiroNumeroNatural == 0) {
            System.out.println("O número: " + primeiroNumeroNatural + " não corresponde a classificação ÍMPAR ou PAR");
        } else if (primeiroNumeroNatural % 2 == 0) {
            System.out.println("O número: " + primeiroNumeroNatural + " é PAR");
        } else if (segundoNumeroNatural == 0) {
            System.out.println("O número: " + segundoNumeroNatural + " não corresponde a classificação ÍMPAR ou PAR");
        } else if (segundoNumeroNatural % 2 == 0) {
            System.out.println("O número: " + segundoNumeroNatural + " é PAR");
        }
        else {
            System.out.println("O número: " + primeiroNumeroNatural + " é ÍMPAR");
            System.out.println("O número: " + segundoNumeroNatural + " é ÍMPAR");
        }
    }
}
